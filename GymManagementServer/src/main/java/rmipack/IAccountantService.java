
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmipack;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import services.SubscriptionDTO;

/**
 *
 * @author Karim 219226
 */
public interface IAccountantService extends Remote{
      ArrayList<SubscriptionDTO> getAllSubscriptions() throws RemoteException;
    
}
