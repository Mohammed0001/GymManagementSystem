
package users;

import users.Person;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class GeneralManager extends Person {
    
    private String perforamceTarget;
    private static GeneralManager generalManager;
    
    private GeneralManager(int id, String name, int phoneNumber, String DOB, String email , String perforamceTarget) {
        super(id, name, phoneNumber, DOB, email);
        this.perforamceTarget = perforamceTarget;
    }
    
    public GeneralManager getManager(int id, String name, int phoneNumber, String DOB, String email , String perforamceTarget){
        if (generalManager == null){
            generalManager =  new GeneralManager(id,name, phoneNumber, DOB, email , perforamceTarget);
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
