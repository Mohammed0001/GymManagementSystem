package mms.gymmanagementserver;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import rmipack.IUserAuth;
import users.Person;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class GymManagementServer {

    public static void main(String[] args) {
        System.out.println("Server Is Sayig Hello! <3 :)");
        DBConnector DBCreation = DBConnector.connectDB();
        DBCreation.runOnce();

//Create account
//        IUserAuth p = new Person(1, "Mohammed", 1003794005, "24/5/2003", "beko@beko.com", "123456","Manager");
//        try {
//            p.createAccount();
//        } catch (RemoteException ex) {
//            Logger.getLogger(GymManagementServer.class.getName()).log(Level.SEVERE, null, ex);
//        }
//Login 
//        IUserAuth p = new Person();
//        try {
//            Person p2 = p.login("beko@beko.com", "123456");
//            System.out.println(p2);
//        } catch (RemoteException ex) {
//            Logger.getLogger(GymManagementServer.class.getName()).log(Level.SEVERE, null, ex);
//        }
//Select One Object form database
//        Person p = DBCreation.readFromDB(10, "Person", Person.class);
//        System.out.println(p);
//Select all from collection
//        ArrayList<Person> ps = DBCreation.readAllFromDB("Person", Person.class);    
//        for (Person p1 : ps ){
//            System.out.println(p1);
//        }
//Update 
//        Person pUpdate = new Person(10, "bakoor", 120, "1/1/2025", "3ameldonia@walahe.com", "123456789", "#am ELnas");
//        DBCreation.updateInDB(10, pUpdate, "Person");
//Delete

//        DBCreation.deleteFromDB(10, "Person");
    }
}
