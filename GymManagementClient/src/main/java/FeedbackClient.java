/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kanzihaitham
 */
public class FeedbackClient implements Observer {
    private String name;

    public FeedbackClient(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String feedbackDetails) {
        System.out.println("Notification for " + name + ": " + feedbackDetails);
    }
    
    public static void main(String[] args) {
        try {
            FeedbackNotifier feedbackNotifier = (FeedbackNotifier) Naming.lookup("rmi://localhost/FeedbackService");
            FeedbackClient client = new FeedbackClient("Client1");
            feedbackNotifier.registerObserver(client);
            System.out.println("Client registered and waiting for updates...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
