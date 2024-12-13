/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.controllers;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import services.TrainingClass;

/**
 *
 * @author sarahhali
 */
public class TrainingClassController {
     public void populateAvailableClasses(DefaultTableModel model) {
        model.setRowCount(0); // Clear existing rows

        // Fetch all training classes
        ArrayList<TrainingClass> classes = TrainingClass.getAllClasses();
        for (TrainingClass trainingClass : classes) {
            if (trainingClass.getIsAvailable()) {
                // Add available classes to the table model
                model.addRow(new Object[]{
                    trainingClass.getId(),
                    trainingClass.getName(),
                    trainingClass.getType(),
                    trainingClass.getSchedule(),
                    trainingClass.getCapacity()
                });
            }
        }
    }
}
