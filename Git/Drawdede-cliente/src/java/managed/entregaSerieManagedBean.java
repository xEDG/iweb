/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.view.ViewScoped;
import javax.xml.ws.WebServiceRef;
import ws.DrawdedeWebService_Service;
import ws.Entrega;

/**
 *
 * @author Rodrii
 */
@Named(value = "entregaSerieManagedBean")
@ViewScoped
public class entregaSerieManagedBean implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Drawdede-war/DrawdedeWebService.wsdl")
    private DrawdedeWebService_Service service;

    /**
     * Creates a new instance of entregaSerie
     */
    
    private int idSerie;
    private List<Entrega> entregas;
    
    public entregaSerieManagedBean() {
    }

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public List<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(List<Entrega> entregas) {
        this.entregas = entregas;
    }
    
    
    public void onParameterReceived(){
        this.entregas = findEntregasConIdSerie(idSerie);
    }

    private java.util.List<ws.Entrega> findEntregasConIdSerie(int id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findEntregasConIdSerie(id);
    }
    
    
    
}
