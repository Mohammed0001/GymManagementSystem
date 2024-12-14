/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.gymmanagementserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import rmipack.FeedbackNotifier;
import services.Feedback;
/**
 *
 * @author kanzihaitham
 */
public class KanziFacade  extends UnicastRemoteObject {
    private Feedback feedback;

    public KanziFacade(Feedback feedback) throws RemoteException {
        this.feedback = feedback;
    }

    public FeedbackNotifier getFeedbackNotifier() {
        return feedback;
    }
}
