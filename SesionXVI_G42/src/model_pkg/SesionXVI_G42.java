/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_pkg;

import view_pkg.Principal;

/**
 *
 * @author danie
 */
public class SesionXVI_G42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelDatosDB inst_model = new ModelDatosDB();
        inst_model.getProductDB(1);
        Principal Frame = new Principal(); 
        Frame.setVisible(true);
    }
    
}
