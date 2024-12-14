/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.gymmanagementserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import rmipack.IEquipment;
import rmipack.IUserAuth;
import services.Inventory;
import users.Person;

/**
 *
 * @author Mohammed ABou Bakr
 */
public class MohammedFacade extends UnicastRemoteObject implements IUserAuth , IEquipment{

    public MohammedFacade() throws RemoteException {

    }

//----------------------------------------------------------------------------------
//    PERSON CRUD OPERATIONS IN IUserAuth
    @Override
    public Person login(String email, String password) throws RemoteException {
        return Person.login(email, password);
    }

    @Override
    public boolean createAccount(Person p) throws RemoteException {
        return Person.createAccount(p);
    }

    @Override
    public ArrayList<Person> viewAllUsers() throws RemoteException {
        return Person.getAllAccounts();
    }

    @Override
    public Person getAccount(int id) throws RemoteException {
        return Person.getAccount(id);
    }

    @Override
    public boolean updateAccount(Person p) throws RemoteException {

        return Person.updateAccount(p);
    }

    @Override
    public boolean deleteAccount(Person p) throws RemoteException {
        return Person.deleteAccount(p);
    }
    
    
//----------------------------------------------------------------------------------
//    Inventory CRUD OPERATIONS IN IUserAuth

    @Override
    public ArrayList<Inventory> viewAllInventory() throws RemoteException {
        return Inventory.getAllInv();
    }

    @Override
    public Inventory getInventory(int id) throws RemoteException {
        return Inventory.getInventory(id);
    }

    @Override
    public boolean updateInventory(Inventory inv) throws RemoteException {
        return Inventory.updateInventory(inv);
    }

    @Override
    public boolean deleteInventory(Inventory inv) throws RemoteException {
        return Inventory.deleteInventory(inv);
    }

    @Override
    public boolean createInventory(Inventory inv) throws RemoteException {
        return Inventory.createInventory(inv);
    }

}
