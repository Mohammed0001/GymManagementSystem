
import mms.gymmanagementserver.Feedback;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kanzihaitham
 */
public class FeedbackServer {
     public static void main(String[] args) {
        try {
            // Create Feedback object
            Feedback1 feedback = new Feedback1(1, "Initial Feedback", "2024-12-08", 4.5);

            // Bind Feedback object to RMI registry
            Naming.rebind("rmi://localhost/FeedbackService", feedback);

            System.out.println("Feedback server is running...");
        } catch (MalformedURLException | RemoteException e) {
        }
    }
}
