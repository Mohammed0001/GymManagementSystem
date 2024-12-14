package rmipack;

import users.Person;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import services.Inventory;

/**
 *
 * @author Mohammed ABou Bakr
 */
public interface IEquipment extends Remote {

    public ArrayList<Inventory> viewAllInventory() throws RemoteException;

    public Inventory getInventory(int id) throws RemoteException;

    public boolean updateInventory(Inventory inv) throws RemoteException;

    public boolean deleteInventory(Inventory inv) throws RemoteException;

    public boolean createInventory(Inventory inv) throws RemoteException;

}
