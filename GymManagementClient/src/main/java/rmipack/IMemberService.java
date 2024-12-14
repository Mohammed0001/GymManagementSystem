/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmipack;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import services.Progress;

/**
 *
 * @author sarahhali
 */
public interface IMemberService extends Remote {
     Progress getProgressForPerson(int personId) throws RemoteException;

    // Fetch all available classes
    List<String> getAvailableClasses() throws RemoteException;
}
