
package users;

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

    
    
    
}
