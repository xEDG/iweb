/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.xml.ws.WebServiceRef;
import ws.DrawdedeWebService_Service;
import ws.Entrega;
import ws.ParseException_Exception;

/**
 *
 * @author Angel
 */
@Named(value = "misEntregasManagedBean")
@RequestScoped
public class MisEntregasManagedBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Drawdede-war/DrawdedeWebService.wsdl")
    private DrawdedeWebService_Service service;

    private List<Entrega> entregas;
    private String busqueda;
    private String t1,t2;
    private List<Entrega> resultadoBusqueda = null;
    /**
     * Creates a new instance of MisEntregasManagedBean
     */
    public MisEntregasManagedBean() {
    }

    public String navegarEntregas(){
        obtenerEntregas();
        return "misEntregas";
    }
            
    private void obtenerEntregas() {
        entregas= this.findAllEntregas();
    }
    
    public String buscar(){
        entregas=this.filtroPorAnotacionEntrega(busqueda);
        return "misEntregas";
    }
    
    public String filtrarPorPeriodoDeTiempo() throws ParseException_Exception{
        entregas= this.filtrarEntregaPorPeriodoTiempo(t1, t2);
        return "misEntregas";
    }

    public List<Entrega> getResultadoBusqueda() {
        return resultadoBusqueda;
    }
    
    public List<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(List<Entrega> entregas) {
        this.entregas = entregas;
    }

    public void setResultadoBusqueda(List<Entrega> resultadoBusqueda) {
        this.resultadoBusqueda = resultadoBusqueda;
    }

    public String getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    
   

    
    private java.util.List<ws.Entrega> findAllEntregas() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findAllEntregas();
    }

    private java.util.List<ws.Entrega> filtroPorAnotacionEntrega(java.lang.String anotacion) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.filtroPorAnotacionEntrega(anotacion);
    }

    private java.util.List<ws.Entrega> filtrarEntregaPorPeriodoTiempo(java.lang.String d1, java.lang.String d2) throws ParseException_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.filtrarEntregaPorPeriodoTiempo(d1, d2);
    }

    
    
}
