
package users;

import java.rmi.RemoteException;
import java.util.ArrayList;
import static users.Person.DB;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class GeneralManager extends Gymmanager {
    
    private String perforamceTarget;
    private static GeneralManager generalManager;
    
    private GeneralManager(int id, String name, int phoneNumber, String DOB, String email , String password , String perforamceTarget) {
        super(id, name, phoneNumber, DOB, email ,password, "General_Manager" , null);
        this.perforamceTarget = perforamceTarget;
    }
    
    public GeneralManager getManager(int id, String name, int phoneNumber, String DOB,  String email ,String password ,  String perforamceTarget){
        if (generalManager == null){
            generalManager =  new GeneralManager(id,name, phoneNumber, DOB, email ,password ,  perforamceTarget);
        } 
        return generalManager;
    }
    
    
  
    public String getPerforamceTarget() {
        return perforamceTarget;
    }

    public void setPerforamceTarget(String perforamceTarget) {
        this.perforamceTarget = perforamceTarget;
    }
//
//    public static boolean createAccount(GeneralManager gm) throws RemoteException {
//        return DB.inserIntoDB(gm, "Gymmanager");
//    }
//
//    public static ArrayList<GeneralManager> getAllGeneralManager () {
//        return DB.readAllFromDB("GeneralManager ", GeneralManager .class);
//    }
//
//    public static Person getAccount(int id) {
//        return DB.readFromDB(id, "GeneralManager ", GeneralManager .class);
//    }
//
//    public static boolean updateAccount(GeneralManager  gm) throws RemoteException {
//        return DB.updateInDB(gm.getId(), gm, "GeneralManager ");
//    }
//
//    public static boolean deleteAccount(GeneralManager  gm) throws RemoteException {
//        return DB.deleteFromDB(gm.getId(), "GeneralManager ");
//    }
    
    
}
