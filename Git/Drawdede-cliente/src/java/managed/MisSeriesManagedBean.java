/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.xml.ws.WebServiceRef;
import ws.DrawdedeWebService_Service;
import ws.Entrega;
import ws.Serie;

/**
 *
 * @author Rodrii
 */
@Named(value = "misSeriesManagedBean")
@RequestScoped
public class MisSeriesManagedBean implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Drawdede-war/DrawdedeWebService.wsdl")
    private DrawdedeWebService_Service service;

    private List<Serie> series;
    private String busqueda;
    private List<Serie> resultadoBusqueda = null;
    private Integer refresh = 0;
    private int eliminate = 0;

    
    
    public int getEliminate() {
        return eliminate;
    }

    public void setEliminate(int eliminate) {
        this.eliminate = eliminate;
    }
    

    public Integer getRefresh() {
        return refresh;
    }

    public void setRefresh(Integer refresh) {
        this.refresh = refresh;
    }

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

    public void onParameterReceived() {
        // En progreso, Edu.
			if(this.eliminate != 0){
				List<Entrega> entregasEliminar = this.findEntregasConIdSerie(eliminate);
				for(Entrega e : entregasEliminar){
					this.removeEntrega(e);
				}
				this.removeSerie(this.findSerieConId(eliminate));
				obtenerSeries();
				this.eliminate = 0;
			}
        System.out.println("WAKI Hola en series he recibido un parametro BIENN");
        if (this.refresh == 1) {
            System.out.println("WAKI HE ENTRADO EN EL IF DE PARAMETER");
            obtenerSeries();
            // this.refresh = false;
        } else {
            System.out.println("WAKI Soy menor que cero sorry xd serie");

        }
        
        // ...

    }


    private void removeSerie(ws.Serie entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        port.removeSerie(entity);
    }

    private Serie findSerie(java.lang.Object id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findSerie(id);
    }

    private Serie findSerieConId(int id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findSerieConId(id);
    }


    private java.util.List<ws.Entrega> findEntregasConIdSerie(int id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findEntregasConIdSerie(id);
    }

    private void removeEntrega(ws.Entrega entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        port.removeEntrega(entity);
    }

}
