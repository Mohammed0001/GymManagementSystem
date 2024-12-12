
package rmi;

import users.Person;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Mohammed ABou Bakr
 */
public interface IUserAuth extends Remote{
    public Person login(String email, String password) throws RemoteException;
    public boolean createAccount(Person p) throws RemoteException;
}
