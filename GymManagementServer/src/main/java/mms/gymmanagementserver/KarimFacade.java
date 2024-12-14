
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.gymmanagementserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import rmipack.IAccountantService;
import services.SubscriptionDTO;

/**
 *
 * @author Karim 219226
 */
public class KarimFacade extends UnicastRemoteObject implements IAccountantService {
     private static final DBConnector DB = DBConnector.connectDB();

   public KarimFacade() throws RemoteException {
        super();
    } 
   @Override
    public ArrayList<SubscriptionDTO> getAllSubscriptions() throws RemoteException {
        // Fetch subscriptions using DBConnector's readAllFromDB method
        return DB.readAllFromDB("Subscription", SubscriptionDTO.class);
    }
}
