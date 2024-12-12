import java.rmi.Remote;
import java.rmi.RemoteException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author kanzihaitham
 */
public interface FeedbackNotifier extends Remote{
    void registerObserver(Observer observer) throws RemoteException;

    void removeObserver(Observer observer) throws RemoteException;

    void notifyObservers(String feedbackDetails) throws RemoteException;
}
