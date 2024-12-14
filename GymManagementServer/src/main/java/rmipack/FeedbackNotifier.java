/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package rmipack;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author kanzihaitham
 */
public interface FeedbackNotifier extends Remote {
    void registerObserver(MemberObserver observer) throws RemoteException;
    void removeObserver(MemberObserver observer ) throws RemoteException;
    void notifyObservers(String feedbackDetails) throws RemoteException;
}
