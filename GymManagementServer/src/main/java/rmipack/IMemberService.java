/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmipack;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import services.Progress;
import services.TrainingClass;

/**
 *
 * @author sarahhali
 */
public interface IMemberService extends Remote {
     Progress getProgressForPerson(int id) throws RemoteException;

    // Fetch all available classes
    ArrayList<TrainingClass> getAvailableClasses() throws RemoteException;
}
