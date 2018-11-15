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
import ws.Serie;
import ws.SerieWS_Service;

/**
 *
 * @author Rodrii
 */
@Named(value = "serieManagedBean")
@RequestScoped
public class SerieManagedBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SerieWS/SerieWS.wsdl")
    private SerieWS_Service service;

    /**
     * Creates a new instance of SerieManagedBean
     */
    
    private List<Serie> series;
    
    public SerieManagedBean() {
    }
    
    @PostConstruct
    public void init(){
       this.obtenerSeries();
    }

    private void obtenerSeries(){
        this.series = this.findAll();
    }
    
    public List<Serie> getSeries(){
        return series;
    }

    private int count() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        return port.count();
    }

    private void create(ws.Serie entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        port.create(entity);
    }

    private void edit(ws.Serie entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        port.edit(entity);
    }

    private Serie find(java.lang.Object id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        return port.find(id);
    }

    private java.util.List<ws.Serie> findAll() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        return port.findAll();
    }

    private java.util.List<ws.Serie> findConTitulo(java.lang.String titulo) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        return port.findConTitulo(titulo);
    }

    private java.util.List<ws.Serie> findRange(java.util.List<java.lang.Integer> range) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        return port.findRange(range);
    }

    private java.util.List<ws.Serie> getAll() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        return port.getAll();
    }

    private Serie getBestValSerie() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        return port.getBestValSerie();
    }

    private java.util.List<java.lang.String> getCategorias() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        return port.getCategorias();
    }

    private void remove(ws.Serie entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        port.remove(entity);
    }
    
    
    
}
