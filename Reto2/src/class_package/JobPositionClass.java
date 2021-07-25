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
public class JobPositionClass {
  private String job_name;
  private String herarchy_level;

    public JobPositionClass(String job_name, String herarchy_level) {
        this.job_name = job_name;
        this.herarchy_level = herarchy_level;
    }

    /**
     * @return the job_name
     */
    public String getJob_name() {
        return job_name;
    }

    /**
     * @param job_name the job_name to set
     */
    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    /**
     * @return the herarchy_level
     */
    public String getHerarchy_level() {
        return herarchy_level;
    }

    /**
     * @param herarchy_level the herarchy_level to set
     */
    public void setHerarchy_level(String herarchy_level) {
        this.herarchy_level = herarchy_level;
    }
}
