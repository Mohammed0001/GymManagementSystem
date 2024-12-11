

package mms.gymmanagementserver;

import rmi.DBConnector;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class GymManagementServer {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        DBConnector DBCreation = new DBConnector();
        
        DBCreation.runOnce();
    }
}
