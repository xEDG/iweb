/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Rodrii
 */
@Named(value = "testManagedBean")
@RequestScoped
public class testManagedBean {

    /**
     * Creates a new instance of PruebaManagedBean
     */
    public testManagedBean() {
    }
    
    public String navegarPrueba(){
        return "test";
    }
    
}
