package rmipack;

import users.Person;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Mohammed ABou Bakr
 */
public interface IUserAuth extends Remote {

    public Person login(String email, String password) throws RemoteException;

    public ArrayList<Person> viewAllUsers() throws RemoteException;

    public Person getAccount(int id) throws RemoteException;

    public boolean updateAccount(Person p) throws RemoteException;

    public boolean deleteAccount(Person p) throws RemoteException;

    public boolean createAccount(Person p) throws RemoteException;

}
