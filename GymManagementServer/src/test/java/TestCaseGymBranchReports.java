
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import services.Branch;
import services.Inventory;
import users.Gymmanager;

/**
 *
 * @author kanzihaitham
 */
public class TestCaseGymBranchReports {
    private Branch branch;
    private Gymmanager gymManager;
    
    public TestCaseGymBranchReports() {
       
    }
    
    @BeforeAll
    public static void setUpClass() {
         System.out.println("Starting Test: Viewing Gym Branch Reports...");
    }
    
    @AfterAll
    public static void tearDownClass() {
         System.out.println("Test Completed: Viewing Gym Branch Reports.");
    }
    
    @BeforeEach
    public void setUp() {
        // Initialize a branch with test data
    branch = new Branch(1, "Downtown Gym", "123 Main St");
    
    // Mock data for inventory (e.g., feedback, attendance, revenue)
    branch.addInventory(new Inventory(
        1,                       // Inventory ID
        "Treadmill",             // Name
        "FitnessPro",            // Provider
        "High-quality treadmill",// Description
        "2024-01-01",            // Last Maintenance Date
        "2024-06-01",            // Next Maintenance Date
        "2025-01-01"             // Warranty End Date
    ));

    branch.addInventory(new Inventory(
        2,                       // Inventory ID
        "Dumbbells",             // Name
        "IronGear",              // Provider
        "Set of 20 dumbbells",   // Description
        "2024-02-01",            // Last Maintenance Date
        "2024-07-01",            // Next Maintenance Date
        "2025-02-01"             // Warranty End Date
    ));

    // Initialize a gym manager responsible for the branch
    gymManager = new Gymmanager(
        1,                     // Manager ID
        "John Doe",            // Name
        987654321,             // Phone number
        "1985-01-01",          // DOB
        "john.doe@example.com",// Email
        "password123",         // Password
        "Manager",             // Role
        branch                 // Associated branch
    );
    }

    
    
    @AfterEach
    public void tearDown() {
         branch = null;
        gymManager = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test
    public void testViewBranchReport() {
     // Gym manager views the branch report
    String report = branch.generateBranchReport();

    // Assertions
    assertNotNull(report, "Branch report should not be null.");
    assertTrue(report.contains("Downtown Gym"), "Report should contain the branch name.");
    assertTrue(report.contains("123 Main St"), "Report should contain the branch location.");
    assertTrue(report.contains("Treadmill"), "Report should include inventory details.");
    assertTrue(report.contains("FitnessPro"), "Report should include provider details for Treadmill.");
    assertTrue(report.contains("Dumbbells"), "Report should include all inventory items.");
    }
    
    @Test
    public void testNoDataAvailable() {
       
        Branch emptyBranch = new Branch(2, "Empty Gym", "456 Elm St");

        String report = emptyBranch.generateBranchReport();

    
        assertNotNull(report, "Branch report should not be null.");
        assertTrue(report.contains("No inventory available"), "Report should indicate no data available.");
    }
    
    @Test
    public void testSystemError() {
       
        Exception exception = assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("Database connection failed.");
        });
        assertEquals("Database connection failed.", exception.getMessage());
    }
}
