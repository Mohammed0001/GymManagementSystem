/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.controllers;


import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.chart.PieChart;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import rmipack.IMemberService;
import services.Progress;
import services.TrainingClass;

/**
 *
 * @author sarahhali
 */
public class MemberController {
    private IMemberService sarahFacade;
   
    public MemberController() {
        try {
            Registry registry = LocateRegistry.getRegistry(1099);
            this.sarahFacade = (IMemberService) registry.lookup("SarahFacade");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  // Fetches available classes and returns a DefaultTableModel for GUI
public DefaultTableModel getAvailableClassesTableModel() {
    // Create table model and set column headers
    DefaultTableModel tableModel = new DefaultTableModel();
    tableModel.setColumnIdentifiers(new String[] { "Class Name", "Type", "Schedule", "Capacity", "Availability" });

    try {
        // Fetch available classes from SarahFacade
        ArrayList<TrainingClass> availableClasses = sarahFacade.getAvailableClasses();
        if (availableClasses != null) {
            // Iterate through the list and populate the table model
            for (TrainingClass trainingClass : availableClasses) {
                tableModel.addRow(new Object[] {
                    trainingClass.getName(),                // Class Name
                    trainingClass.getType(),                // Type
                    trainingClass.getSchedule(),            // Schedule
                    trainingClass.getCapacity(),            // Capacity
                    trainingClass.getIsAvailable() ? "Available" : "Full" // Availability
                });
            }
        }
    } catch (RemoteException e) {
        e.printStackTrace();
    }

    return tableModel;
}


    public PieChart getProgressChart(int memberId) {
    PieChart pieChart = new PieChart();
    try {
        Progress progress = sarahFacade.getProgressForPerson(memberId);
        if (progress != null) {
            double weight = progress.getWeight();
            double bodyFat = progress.getBodyFatPercentage();
            double muscleMass = progress.getMuscleMass();
            double other = weight - (bodyFat + muscleMass); // Assuming the rest of the weight is "other"

            pieChart.getData().add(new PieChart.Data("Body Fat", bodyFat));
            pieChart.getData().add(new PieChart.Data("Muscle Mass", muscleMass));
            pieChart.getData().add(new PieChart.Data("Other", other));
        } else {
            System.out.println("No progress data available for member.");
        }
    } catch (RemoteException e) {
        e.printStackTrace();
    }
    return pieChart;
}
}
