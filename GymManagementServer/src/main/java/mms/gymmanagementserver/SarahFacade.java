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
    public Progress getProgressForPerson(int personId) throws RemoteException {
        // Delegate call directly to DBConnector
        return DBConnector.connectDB().getProgressByPersonId(personId);
    }

    @Override
    public List<String> getAvailableClasses() throws RemoteException {
        // Fetch available classes from DBConnector
        List<TrainingClass> classes = DBConnector.connectDB().readAllFromDB("TrainingClass", TrainingClass.class);
        List<String> availableClasses = new ArrayList<>();
        for (TrainingClass trainingClass : classes) {
            if (trainingClass.getIsAvailable()) {
                availableClasses.add(trainingClass.getName());
            }
        }
        return availableClasses;
    }
}
