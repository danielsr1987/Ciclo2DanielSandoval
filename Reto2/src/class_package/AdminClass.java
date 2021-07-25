/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_package;

/**
 *
 * @author danie
 */
public class AdminClass extends EmployeeClass {
   private int category;
   private int subordinates;   

    public AdminClass(String name, int document, String correo, JobPositionClass job_position, int salary) {
        super(name, document, correo, job_position, salary);
    }


    /**
     * @return the category
     */
    public int getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(int category) {
        this.category = category;
    }

    /**
     * @return the subordinates
     */
    public int getSubordinates() {
        return subordinates;
    }

    /**
     * @param subordinates the subordinates to set
     */
    public void setSubordinates(int subordinates) {
        this.subordinates = subordinates;
    }
   
}
