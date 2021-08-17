/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_pkg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model_pkg.DataDB;
import model_pkg.DataModelDB;
import Views_pkg.DialogPets;
import java.util.LinkedList;
import model_pkg.ReportClass;

/**
 *
 * @author danie
 */
public class Controller implements ActionListener {

    private final DialogPets view;
    private DialogPets model;
    
    public final void events() {
        view.cb_owners.addActionListener(this);
    }

    public Controller(DialogPets view) {
        this.view = view;
        getOwners();
        Item item = (Item) view.cb_owners.getSelectedItem();
        events();
    }
    
    
     public final void getOwners() {
        ArrayList<DataDB> list;
        DataModelDB model = new DataModelDB();
        list = model.getOwners(0);
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                int idOwner = list.get(i).getIdOwner();
                String owner = list.get(i).getOwner();
                view.cb_owners.addItem(new Item(idOwner, owner));
                view.setIdowners(list.get(0).getIdOwner());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron registro de clientes", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         Object evt = ae.getSource();
         if(evt.equals(view.cb_owners)){
             Item item = (Item) view.cb_owners.getSelectedItem();
             view.setIdowners(item.getIdOwner());
         }
    }

   public LinkedList<ReportClass> ListPetType() {
        LinkedList<ReportClass> report = this.model.ListPetType();
        return report;
    }


    
    }

    
    


    




