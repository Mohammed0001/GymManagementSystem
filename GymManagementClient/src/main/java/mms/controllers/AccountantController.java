/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.controllers;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import rmipack.IAccountantService;
import services.SubscriptionDTO;

/**
 *
 * @author Karim 219226
 */
public class AccountantController {
    private IAccountantService karimFacade;
    
    public AccountantController() {
        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            this.karimFacade = (IAccountantService) registry.lookup("KarimFacade");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public DefaultTableModel getSubscriptionsTableModel() {
        // Create a table model and set column headers
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{"ID", "Name", "End Date"});

        try {
            ArrayList<SubscriptionDTO> subscriptions = karimFacade.getAllSubscriptions();
            if (subscriptions != null) {
                for (SubscriptionDTO subscription : subscriptions) {
                    tableModel.addRow(new Object[]{
                            subscription.getId(),
                            subscription.getName(),
                            subscription.getEndDate()
                    });
                }
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        return tableModel;
    }

}
