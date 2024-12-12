

package mms.gymmanagementserver;

import java.util.ArrayList;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class GymManagementServer {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        DBConnector DBCreation = new DBConnector();
        
        DBCreation.runOnce();
        
        Person p = new Person(10, "beko", 1003794005, "20/10/2003", "beko@beko.com");
//        DBCreation.inserIntoDB(p, "Person");
//        DBCreation.deleteFromDB("6759c169d7a94f44d2b028dd", "Person");
//        p.setName("Wlaa3 y beko");
//        DBCreation.updateInDB("6759c24c12118c125aaa5d85", p, "Person");
           ArrayList<Object> objs = DBCreation.readAllFromDB("Person",Person.class );
            for (Object obj : objs) {
            System.out.println(obj.toString());
        }
    }
}
