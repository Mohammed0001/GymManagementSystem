/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import finance.Payment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import services.Complaint;
import services.IMemberProgressROI;
import services.InReviewState;
import services.Subscription;
import users.Gymmanager;
import users.Member;

/**
 *
 * @author kanzihaitham
 */
public class TestCaseComplaint {
    private Complaint complaint;
    private Member complainer;
    private Gymmanager manager;
    public TestCaseComplaint() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        System.out.println("Starting Complaint Test Cases...");
    }
    
    @AfterAll
    public static void tearDownClass() {
         System.out.println("Complaint Test Cases Completed.");
    }
    
    @BeforeEach
    public void setUp() {
       // Member object (complainer)
    complainer = new Member(
        1,                  // Member ID
        "Alice",            // Name
        123456789,          // Phone number
        "1995-03-15",       // DOB
        "alice@example.com",// Email
        "password123",      // Password
        null,               // Progress (not needed here, set to null)
        null,               // Subscription (not needed here, set to null)
        true                // Active status
    );

    // Gym manager object
    manager = new Gymmanager(
        2,                  // Manager ID
        "John",             // Name
        987654321,          // Phone number
        "1985-01-01",       // DOB
        "john@example.com", // Email
        "password456",      // Password
        "Manager",          // Role
        null                // Branch (not needed here, set to null)
    );

    // Initialize a complaint object
    complaint = new Complaint(
        1,                          // Complaint ID
        "Broken Equipment",         // Name
        complainer,                 // Complainer
        "alice@example.com",        // Email
        null,                       // Date Submitted (set during submission)
        null,                       // Resolution Date
        "Pending",                  // Initial status
        null,                       // Feedback
        manager,                    // Managed by Gymmanager
        new InReviewState(null)     // Complaint state (mock or actual)
    );
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
public void testCreateComplaint() {
    // Verify that the complaint object is created correctly
    assertNotNull(complaint, "Complaint object should be created.");
    assertEquals("Broken Equipment", complaint.getName(), "Complaint name should match.");
    assertEquals("Pending", complaint.getStatus(), "New complaint should have 'Pending' status.");
    assertEquals("Alice", complaint.getComplainer().getName(), "Complainer name should match.");
}

@Test
public void testSubmitComplaint() {
    // Submit the complaint
    complaint.submitComplaint();

    // Assertions
    assertEquals("Submitted", complaint.getStatus(), "Complaint status should be updated to 'Submitted'.");
    assertNotNull(complaint.getDateSubmitted(), "Date submitted should not be null.");
}

@Test
public void testAddressComplaint() {
    // Address the complaint
    complaint.addressComplaint();

    // Assertions
    assertEquals("In Review", complaint.getStatus(), "Complaint status should be updated to 'In Review'.");
    assertTrue(complaint.getCompliantState() instanceof InReviewState, "Complaint state should be 'InReviewState'.");
}
@Test
public void testResolveComplaint() {
    // Resolve the complaint
    complaint.markResolved("Issue resolved and equipment replaced.");

    // Assertions
    assertEquals("Resolved", complaint.getStatus(), "Complaint status should be updated to 'Resolved'.");
    assertEquals("Issue resolved and equipment replaced.", complaint.getfeedback(), "Feedback should be recorded.");
}

@Test
public void testInvalidComplaintCreation() {
    // Attempt to create a complaint with invalid details
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
        new Complaint(
            0,                     // Invalid ID
            null,                  // Invalid name
            null,                  // Invalid complainer
            "invalid@example.com", // Invalid email
            null,                  // Date Submitted
            null,                  // Resolution Date
            "Pending",             // Status
            null,                  // Feedback
            null,                  // Invalid manager
            null                   // Invalid state
        );
    });

    // Assertions
    assertEquals("Invalid complaint details.", exception.getMessage());
}
}
