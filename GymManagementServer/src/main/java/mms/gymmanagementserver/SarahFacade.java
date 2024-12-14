/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.gymmanagementserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import rmipack.IMemberService;
import services.Complaint;
import services.Progress;
import services.TrainingClass;

/**
 *
 * @author sarahhali
 */

public class SarahFacade extends UnicastRemoteObject implements IMemberService {
     public SarahFacade() throws RemoteException {
        super();
    }

    @Override
    public Progress getProgressForPerson(int id) throws RemoteException {
        // Delegate call directly to DBConnector
        return Progress.getProgressByPersonId(id);
    }

    @Override
    public ArrayList<TrainingClass> getAvailableClasses() throws RemoteException {
        return TrainingClass.getAllClasses();
    }
    
    @Override
    public boolean submitComplaint(Complaint complaint) throws RemoteException {
    return Complaint.insertComplaintToDB(complaint); 
}
}
