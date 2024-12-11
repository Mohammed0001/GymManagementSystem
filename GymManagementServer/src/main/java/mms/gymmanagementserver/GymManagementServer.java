/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mms.gymmanagementserver;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.PaymentStrategy;

/**
 *
 * @author mabou
 */
public class GymManagementServer {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
                           
        Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);
        
        //Calling the class for the database 
        //DB db = new DB();
        
        // Here we create our remote object
        PaymentStrategy g = new Payment();
        
        // An RMI Registry initialized on port 1099
        Registry r = LocateRegistry.createRegistry(1099);
        
        // Our remote object g is binded to the name "grade"
        r.bind("payement", g);
        
        // Outputs that the server is ready
        System.out.println("The server is ready");
    }
}
