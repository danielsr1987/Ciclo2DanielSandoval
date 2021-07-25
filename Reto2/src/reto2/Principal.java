/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2;
import class_package.*;
import java.util.Scanner;


public class Principal {
    static  Scanner inst_dato = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Deseas llenar formulario:\n 1. Empleados 2. Clientes"); 
        int sel = Integer.parseInt(inst_dato.nextLine());
        
        switch(sel){
          case 1:
          EmployeeClass.crud_employees();
          break;
          case  2:
          ClientClass.crud_clients();
          break;
          default: 
          System.out.println("digitaste opcion invalida intenta de nuevo");
        } 
    
}
}
