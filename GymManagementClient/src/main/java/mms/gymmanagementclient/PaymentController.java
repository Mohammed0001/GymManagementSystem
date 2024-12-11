/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mms.gymmanagementclient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.PaymentStrategy;

/**
 *
 * @author hp
 */
public class PaymentController {
    StrategyPayments gui;
    Registry r;

    public PaymentController(StrategyPayments gui, Registry r) {
        this.gui = gui;
        this.r = r;
         gui.getjButton1().addActionListener(new GetPayment());
    }
    
    class GetPayment implements ActionListener {

        // Whatever written inside this function will execute when the button is clicked
        @Override
        public void actionPerformed(ActionEvent ae) {
            try {

                // We try to obtain a remote reference to the grade remote object
                // that lives on the client. (using the registry object obtained from
                // the constructor above)
                PaymentStrategy g = (PaymentStrategy) r.lookup("payment");

                // Get the grade (in numbers) as it is written inside the text field
                // Please note that we are able to interact with the gui elements through
                // the getters that we have set up earlier
                // Also we are parsing to int below because by default, the text field
                // will return a string
                int grade = Integer.parseInt(gui.getjTextField1().getText());
                String Payment = g.getPayment(gui.getjComboBox1.getText());
                // Once we have the grade as numbers, we can pass it to the remote
                // function getGrade using our remote reference g
                String result = g.getGrade(grade);

                // Once we got the result from our remote object, we can set it to
                // appear inside the gui using the jLabel
                gui.getjLabel1().setText(result);

            } catch (RemoteException ex) {
                Logger.getLogger(MainWindowController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NotBoundException ex) {
                Logger.getLogger(MainWindowController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
