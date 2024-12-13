/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mms.gymmanagementserver;

/**
 *
 * @author kanzihaitham
 */
public interface FeedbackNotifier {
    void registerObserver(MemberObserver observer);
    void removeObserver(MemberObserver observer );
    void notifyObservers(String feedbackDetails);
}
