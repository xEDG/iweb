/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.xml.ws.WebServiceRef;
import ws.DrawdedeWebService_Service;
import ws.Serie;

/**
 *
 * @author Rodrii
 */
@Named(value = "testManagedBean")
@RequestScoped
public class testManagedBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Drawdede-war/DrawdedeWebService.wsdl")
    private DrawdedeWebService_Service service;
    
    private String busqueda;
    private List<Serie> resultadoBusqueda;

    /**
     * Creates a new instance of PruebaManagedBean
     */
    public testManagedBean() {
    }
    
    public String navegarPrueba(){
        return "test";
    }
    
}
