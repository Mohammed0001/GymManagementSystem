/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.gymmanagementserver;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import rmipack.IUserAuth;
import users.Person;

/**
 *
 * @author Mohammed ABou Bakr
 */
public class MohammedFacade extends UnicastRemoteObject implements IUserAuth {

    public MohammedFacade() throws RemoteException {

    }

    @Override
    public Person login(String email, String password) throws RemoteException {
        return Person.login(email, password);
    }

    @Override
    public boolean createAccount(Person p) throws RemoteException {
        return Person.createAccount(p);
    }

}
