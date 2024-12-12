/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmipack;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author sarahhali
 */
public interface FacadeInterface extends Remote {
    
    public void setSubscriptionData(int id, String type, double price, String description, boolean isRenewable,
                                    Payment payment, double discount, String startDate, String endDate) throws RemoteException;
    
    public String getSubscriptionData() throws RemoteException;
    
    public SubscriptionDTO getSubscription() throws RemoteException;
}
