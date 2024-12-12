package mms.controllers;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import mms.GUI.GymLOGIN;
import mms.GUI.ManagerGUI;
import rmipack.IUserAuth;
import users.Person;

/**
 *
 * @author Mohammed ABou Bakr
 */
public class loginController {

    Registry registry;
    IUserAuth userAuth;

    public loginController() {
        try {
            this.registry = LocateRegistry.getRegistry(1099);
            this.userAuth = (IUserAuth) registry.lookup("GymSystemFacade");

        } catch (RemoteException ex) {
            Logger.getLogger(loginController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(loginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Person login(String email, String password) {
        Person p = null;
        try {
            p = userAuth.login(email, password);
            if (p == null) {
                new GymLOGIN().setVisible(true);
            } else {
                System.out.println("loged in succ!!!");
                if ("Manager".equals(p.getRole())) {
                    new ManagerGUI(p).setVisible(true);
                }
            }
        } catch (RemoteException ex) {
            Logger.getLogger(loginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }
}
