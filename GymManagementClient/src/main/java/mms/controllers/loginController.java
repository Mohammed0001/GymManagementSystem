package mms.controllers;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import mms.GUI.GymLOGIN;
import mms.GUI.GeneralManagerGUI;
import mms.GUI.memberGUI;
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
            this.userAuth = (IUserAuth) registry.lookup("MohammedFacade");

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
                if ("General_Manager".equals(p.getRole())) {
                    new GeneralManagerGUI(p).setVisible(true);
                } else {
                    new memberGUI(p).setVisible(true); // Redirect to Member GUI for other roles
                }
            }
        } catch (RemoteException ex) {
            Logger.getLogger(loginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }
}
