/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_package;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class ClientClass extends PersonClass {
    private CompanyClass company;
    private int telephone;  
    private String Adress; 

    public ClientClass(CompanyClass company, int telephone, String Adress, String name, int document, String correo) {
        super(name, document, correo);
        this.company = company;
        this.telephone = telephone;
        this.Adress = Adress;
    }
    
    public ClientClass(String name, int document, String correo) {
        super(name, document, correo);
    }
    static  Scanner datos = new Scanner(System.in);
    public static void crud_clients() {
         ArrayList<ClientClass> clients_list = new ArrayList<>();
         boolean exit_system = false;
         while(!exit_system){
          System.out.println("Ingresa una opción");
          System.out.println(" 1.Crear Cliente");
          System.out.println(" 2.Listar Clientes");
          System.out.println(" 3.Editar cliente especifico");
          System.out.println(" 4.Eliminar cliente especifico");
          System.out.println(" 5.Salir");
          int seleccionar = Integer.parseInt(datos.nextLine());
          switch(seleccionar){
              case 1:
                  System.out.println("Cuantos clientes deseas crear?");
                  int num_clients  = Integer.parseInt(datos.nextLine());
                  System.out.println("ingresa la informacion del cliente");
                  for (int i = 0; i <= num_clients; i++) {
                     System.out.println("cliente"+ i);
                     System.out.println("Nombre: ");
                     String name = datos.nextLine();
                     System.out.println("Documento: ");
                     int document =  Integer.parseInt(datos.nextLine());
                     System.out.println("Correo: ");
                     String email = datos.nextLine(); 
                     System.out.println("Telefono: ");
                     ClientClass clients = new ClientClass(name,document,email);
                     int telephone = Integer.parseInt(datos.nextLine());
                     clients.setTelephone(telephone);
                     System.out.println("Dirección: ");
                     String Adress = datos.nextLine();
                     clients.setAdress(Adress);
                     clients_list.add(clients);
                     
                  }
                  break;
               
              case 2:
                  System.out.println("Total de clientes: " + clients_list.size());
                   for (int i = 0; i < clients_list.size(); i++) {
                      System.out.println("Cliente: " + i);
                      ClientClass clients = clients_list.get(i);
                      System.out.println("Nombre: " + clients.getName());
                      System.out.println("Documento: " + clients.getDocument());
                      System.out.println("Correo: " + clients.getCorreo());
                      System.out.println("Telefono: " + clients.getTelephone());
                      System.out.println("Dirección: " + clients.getAdress());
                    
                   }
                  
                  break;
                  
              case 3:
                  System.out.println("Editar información Cliente");
                  System.out.println("Ingresa el indice del cliente a editar");
                  int index = Integer.parseInt(datos.nextLine());
                  if(index >=0 && index <= clients_list.size()){
                      ClientClass clients = clients_list.get(index);
                      System.out.println("Información actual cliente:"+index);
                      System.out.println("Nombre: " + clients.getName());
                      System.out.println("Documento: " + clients.getDocument());
                      System.out.println("Correo: " + clients.getCorreo());
                      System.out.println("Telefono: " + clients.getTelephone());
                      System.out.println("Dirección: " + clients.getAdress());
                      System.out.println("Que Campo deseas editar?\n  1.Nombre\n 2.Documento\n 3.Correo\n 4.Telefono 5.Dirección");
                      int edit_field = Integer.parseInt(datos.nextLine());
                      switch(edit_field){
                          case 1: 
                              System.out.println("Digite Nombre Nuevo: ");
                              String name = datos.nextLine();
                              clients.setName(name);
                              break;
                           case 2:
                              System.out.println("Digite Documento Nuevo: ");
                              int document = Integer.parseInt(datos.nextLine());
                              clients.setDocument(document);
                              break;
                           case 3:
                              System.out.println("Digite Correo Nuevo: ");
                              String correo = datos.nextLine();
                              clients.setCorreo(correo);
                              break;
                           case 4: 
                              System.out.println("Digite Telefono Nuevo: ");
                              int telephone = Integer.parseInt(datos.nextLine());
                              clients.setTelephone(telephone);
                              break; 
                           case 5: 
                              System.out.println("Digite Dirección Nueva: ");
                              String Adress= datos.nextLine();
                              clients.setAdress(Adress); 
                              break;
                           default: 
                              System.out.println("Opción Invalida");
                      }
                  }
                  break;
              case 4: 
                  System.out.println("Que cliente deseas eliminar?"); 
                  
                  int eliminar = Integer.parseInt(datos.nextLine());
                  clients_list.remove(eliminar);
                  break;
              default: 
                  System.out.println("Opcion invalida"); 
  }     }     }
    /**
     * @return the company
     */
    public CompanyClass getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(CompanyClass company) {
        this.company = company;
    }

    /**
     * @return the telephone
     */
    public int getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the Adress
     */
    public String getAdress() {
        return Adress;
    }

    /**
     * @param Adress the Adress to set
     */
    public void setAdress(String Adress) {
        this.Adress = Adress;
    }
    
}
