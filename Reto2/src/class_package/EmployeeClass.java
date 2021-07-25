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
public class EmployeeClass extends PersonClass {
    private int salary;
    private JobPositionClass job_position;
    public EmployeeClass(String name, int document, String correo,JobPositionClass job_position, int salary) {
        super(name, document, correo);
        this.job_position = job_position;
        this.salary = salary;
    }
static  Scanner inst_in_data = new Scanner(System.in);
    /*public EmployeeClass() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
public static void crud_employees() {
      ArrayList<EmployeeClass> employee_list = new ArrayList<>();
      System.out.println("Cargo: ");
      String job_p= inst_in_data.nextLine();
      System.out.println("Jerarquia: ");
      String level= inst_in_data.nextLine();
      JobPositionClass job = new JobPositionClass(job_p,level);
      boolean exit_system = false;
      while(!exit_system){
          System.out.println("Ingresa una opción");
          System.out.println(" 1.Crear Empleado");
          System.out.println(" 2.Listar Empleado");
          System.out.println(" 3.Editar empleado especifico");
          System.out.println(" 4.Eliminar empleado especifico");
          System.out.println(" 5.Salir");
          int option = Integer.parseInt(inst_in_data.nextLine());
          
          
          switch(option){
              case 1:
                  System.out.println("Cuantos empleados deseas crear?");
                  int num_employees  = Integer.parseInt(inst_in_data.nextLine());
                  System.out.println("ingresa la informacion del empleado");
                  for (int i = 0; i <= num_employees; i++) {
                     System.out.println("empleado"+ i);
                     System.out.println("Nombre: ");
                     String name = inst_in_data.nextLine();
                     System.out.println("Documento: ");
                     int document =  Integer.parseInt(inst_in_data.nextLine());
                     System.out.println("Correo: ");
                     String email = inst_in_data.nextLine(); 
                     System.out.println("Salario: ");
                     int salary =  Integer.parseInt(inst_in_data.nextLine());
                     EmployeeClass employee = new EmployeeClass(name,document,email,job,salary);
                     employee_list.add(employee);
                     
                  }
                  break;
               
              case 2:
                  System.out.println("Total de empleados: " + employee_list.size());
                   for (int i = 0; i < employee_list.size(); i++) {
                      System.out.println("Empleado: " + i);
                      EmployeeClass employee = employee_list.get(i);
                      System.out.println("Nombre: " + employee.getName());
                      System.out.println("Documento: " + employee.getDocument());
                      System.out.println("Correo: " + employee.getCorreo());
                      System.out.println("Cargo: " + job.getJob_name());
                      System.out.println("Jerarquia: " + job.getHerarchy_level());
                      System.out.println("Salario: " + employee.getSalary());
                   }
                  
                  break;
                  
              case 3:
                  System.out.println("Editar información empleado");
                  System.out.println("Ingresa el indice del empleado a editar");
                  int index = Integer.parseInt(inst_in_data.nextLine());
                  if(index >=0 && index <= employee_list.size()){
                      EmployeeClass employee = employee_list.get(index);
                      System.out.println("Información actual empleado"+index);
                      System.out.println("Nombre: " + employee.getName());
                      System.out.println("Documento: " + employee.getDocument());
                      System.out.println("Correo: " + employee.getCorreo());
                      System.out.println("Salario: " + employee.getSalary());
                      System.out.println("Que Campo deseas editar?\n  1.Nombre\n 2.Documento\n 3.Correo\n 4.Salario");
                      int edit_field = Integer.parseInt(inst_in_data.nextLine());
                      switch(edit_field){
                          case 1: 
                              System.out.println("Digite Nombre Nuevo: ");
                              String name = inst_in_data.nextLine();
                              employee.setName(name);
                              break;
                           case 2:
                              System.out.println("Digite Documento Nuevo: ");
                              int document = Integer.parseInt(inst_in_data.nextLine());
                              employee.setDocument(document);
                              break;
                           case 3:
                              System.out.println("Digite Correo Nuevo: ");
                              String correo = inst_in_data.nextLine();
                              employee.setCorreo(correo);
                              break;
                           case 4: 
                              System.out.println("Digite Salario Nuevo: ");
                              int salary = Integer.parseInt(inst_in_data.nextLine());
                              employee.setSalary(salary);
                              break; 
                           default: 
                              System.out.println("Opción Invalida");
                      }
                  }
                  break;
              case 4: 
                  System.out.println("Que empleado deseas eliminar?"); 
                  
                  int eliminar = Integer.parseInt(inst_in_data.nextLine());
                  employee_list.remove(eliminar);
                  break;
              default: 
                  System.out.println("Opcion invalida"); 
                  
          }
      }
     }

    public EmployeeClass(int salary, JobPositionClass job_position, String name, int document, String correo) {
        super(name, document, correo);
        this.salary = salary;
        this.job_position = job_position;
    }
    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the job_position
     */
    public JobPositionClass getJob_position() {
        return job_position;
    }

    /**
     * @param job_position the job_position to set
     */
    public void setJob_position(JobPositionClass job_position) {
        this.job_position = job_position;
    }
    
}
