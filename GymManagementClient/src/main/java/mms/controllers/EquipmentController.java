package mms.controllers;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmipack.IUserAuth;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class EquipmentController {

    Registry registry;
    IEquipment equipment;

    public EquipmentController() {
        try {
            this.registry = LocateRegistry.getRegistry(1099);
            this.equipment = (IEquipment) registry.lookup("MohammedFacade");
            
        } catch (RemoteException ex) {
            Logger.getLogger(EquipmentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(EquipmentController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
