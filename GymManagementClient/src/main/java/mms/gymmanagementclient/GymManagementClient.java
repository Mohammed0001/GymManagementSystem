package mms.gymmanagementclient;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import mms.GUI.GymLOGIN;
import users.Person;
import rmipack.IUserAuth;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class GymManagementClient {

    public static void main(String[] args) {
        System.out.println("Hello From The Client :))))!");

//        try {
//            // Lookup the remote object
////            Registry registry = LocateRegistry.getRegistry(1099);
////            IUserAuth userAuth = (IUserAuth) registry.lookup("GymSystemFacade");
//
//            // Call remote methods
////            Person loggedInPerson = (Person) 
////            System.out.println(
////                    userAuth.login("beko@beko.com", "123456")
////            );
//            // System.out.println("Login successful: " + loggedInPerson);
//
////            boolean accountCreated = userAuth.createAccount();
////            System.out.println("Account creation: " + accountCreated);
//        } catch (NotBoundException | RemoteException e) {
//            System.out.println(e);
//        }
        new GymLOGIN().setVisible(true);
    }
}
