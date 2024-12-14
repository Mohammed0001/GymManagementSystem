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
import services.TrainingClass;

/**
 *
 * @author kanzihaitham
 */
public class TestCaseEnrollment {
    private TrainingClass yogaClass;
    public TestCaseEnrollment() {
    }
    
    @BeforeAll
    public static void setUpClass() {
         System.out.println("Starting TrainingClass Enrollment Tests...");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("TrainingClass Enrollment Tests Completed.");
    }
    
    @BeforeEach
    public void setUp() {
        yogaClass = new TrainingClass(1, "Yoga Basics", "Fitness", "Monday 8 AM", 2, true);
    }
    
    @AfterEach
    public void tearDown() {
         yogaClass = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testEnrollMemberSuccess() {
        boolean result = yogaClass.enrollMember();
        assertTrue(result, "Member enrollment should succeed when space is available.");
        assertEquals(1, yogaClass.getEnrolledMembers(), "Enrolled members count should be 1.");
    }
    
    @Test
    public void testEnrollMemberFullClass() {
  
        yogaClass.enrollMember();
        yogaClass.enrollMember();

       
        boolean result = yogaClass.enrollMember();
        assertFalse(result, "Member enrollment should fail when the class is full.");
        assertEquals(2, yogaClass.getEnrolledMembers(), "Enrolled members count should not exceed capacity.");
    }
    
     @Test
    public void testEnrollMemberAvailabilityFlag() {
       
        yogaClass.enrollMember();
        yogaClass.enrollMember();
        assertFalse(yogaClass.getIsAvailable(), "Class should be marked as unavailable when full.");
    }
    
    @Test
    public void testHasSpace() {
        assertTrue(yogaClass.hasSpace(), "Class should have space initially.");
        yogaClass.enrollMember();
        assertTrue(yogaClass.hasSpace(), "Class should have space after one enrollment.");
        yogaClass.enrollMember();
        assertFalse(yogaClass.hasSpace(), "Class should not have space after reaching capacity.");
    }
}
