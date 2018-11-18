/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.xml.ws.WebServiceRef;
import ws.DrawdedeWebService_Service;
import ws.Serie;

/**
 *
 * @author Rodrii
 */
@Named(value = "misSeriesManagedBean")
@RequestScoped
public class MisSeriesManagedBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Drawdede-war/DrawdedeWebService.wsdl")
    private DrawdedeWebService_Service service;

    private List<Serie> series;
    private String busqueda;
    private List<Serie> resultadoBusqueda = null;

    /**
     * Creates a new instance of IndexManagedBean
     */
    public MisSeriesManagedBean() {
    }

    /*@PostConstruct
    public void init() {
        this.series = resultadoBusqueda;
        //this.obtenerSeries();
    }*/
    public String navegarSeies() {
        obtenerSeries();
        return "misSeries";
    }

    private void obtenerSeries() {
        this.series = this.findAllSeries();

    }

    private java.util.List<ws.Serie> findAllSeries() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findAllSeries();
    }

    public String buscar() {
        this.series = this.findSerieConTitulo(this.busqueda);
        return "misSeries";
    }

    private java.util.List<ws.Serie> findSerieConTitulo(java.lang.String titulo) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findSerieConTitulo(titulo);
    }

    public String bestSerie() {
        if (this.series == null) {
            this.series = new ArrayList<>();
        } else {
            this.series.clear();
        }
        this.series.add(this.getBestValSerie());
        return "misSeries";
    }

    private Serie getBestValSerie() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.getBestValSerie();
    }

    public String worstSerie() {
        if (this.series == null) {
            this.series = new ArrayList<>();
        } else {
            this.series.clear();
        }
        this.series.add(this.getWorstValSerie());
        return "misSeries";
    }

    public List<Serie> getResultadoBusqueda() {
        return resultadoBusqueda;
    }

    public void setResultadoBusqueda(List<Serie> resultadoBusqueda) {
        this.resultadoBusqueda = resultadoBusqueda;
    }

    public String getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    public List<Serie> getSeries() {
        return series;
    }

    private Serie getWorstValSerie() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.getWorstValSerie();
    }

}
