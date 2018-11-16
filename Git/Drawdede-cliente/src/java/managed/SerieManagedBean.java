/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.xml.ws.WebServiceRef;
import soapws.Serie;
import soapws.SerieWebService_Service;

/**
 *
 * @author Rodrii
 */
@Named(value = "serieManagedBean")
@RequestScoped
public class SerieManagedBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Drawdede-war/SerieWebService.wsdl")
    private SerieWebService_Service service;
    
    private List<Serie> series;
    private Serie primeraSerie;


    /**
     * Creates a new instance of SerieManagedBean
     */
    public SerieManagedBean() {
    }
    
    @PostConstruct
    public void init(){
       this.obtenerSeries();
       this.primeraSerie = this.series.get(0);
    }

    private void obtenerSeries(){
        this.series = this.findAll();
    }

    public List<Serie> getSeries() {
        return series;
    }

    public Serie getPrimeraSerie() {
        return primeraSerie;
    }
    
    

    private java.util.List<soapws.Serie> findAll() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.SerieWebService port = service.getSerieWebServicePort();
        return port.findAll();
    }
    
    
    
}
