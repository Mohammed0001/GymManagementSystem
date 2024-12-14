package mms.controllers;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import rmipack.IEquipment;
import services.Inventory;

/**
 *
 * @author Mohammed Abou Bakr
 */
public class EquipmentController {

    Registry registry;
    IEquipment equipment;

    public EquipmentController() {
        try {
            this.registry = LocateRegistry.getRegistry(1099);
            this.equipment = (IEquipment) registry.lookup("MohammedFacade");

        } catch (RemoteException ex) {
            Logger.getLogger(EquipmentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(EquipmentController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public boolean createInventory(int id, String name, String provider, String description, String lastMainDate, String nextmainDate, String warrantyEnddate) {
        Inventory inv = new Inventory(id, name, provider, description, lastMainDate, nextmainDate, warrantyEnddate);
        try {
            return equipment.createInventory(inv);
        } catch (RemoteException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean deleteInventory(int id) {
        Inventory inv = new Inventory(id, null, null, null, null, null, null);
        try {
            return equipment.deleteInventory(inv);
        } catch (RemoteException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean updateInventory(int id, String name, String provider, String description, String lastMainDate, String nextmainDate, String warrantyEnddate) {
        Inventory inv = new Inventory(id, name, provider, description, lastMainDate, nextmainDate, warrantyEnddate);
        try {
            return equipment.updateInventory(inv);
        } catch (RemoteException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public DefaultTableModel getEquipments() {
        DefaultTableModel table = new DefaultTableModel();
        table.setColumnIdentifiers(new String[]{"ID", "name", "provider", "description", "lastMainDate", "nextmainDate", "warrantyEnddate"});

        ArrayList<Inventory> invs = new ArrayList<>();
        try {
            invs = equipment.viewAllInventory();
        } catch (RemoteException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Inventory inv : invs) {
            table.addRow(new Object[]{inv.getId(), inv.getName(), inv.getProvider(), inv.getDescription(), inv.getLastMaintenanceDate(), inv.getNextMaintenanceDate(), inv.getWarrantyEndDate()});
            System.out.println(inv);
//            Object[] row = new Object[4];
//            row[0] = person.getId();
//            row[1] = person.getName();
//            row[2] = person.getEmail();
//            row[3] = person.getRole();
//            table.addRow(row);
        }
        return table;
    }
}
