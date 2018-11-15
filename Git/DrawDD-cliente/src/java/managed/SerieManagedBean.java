/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.xml.ws.WebServiceRef;
import ws.HasEntrega;
import ws.Serie;
import ws.SerieWS_Service;

/**
 *
 * @author Rodrii
 */
@Named(value = "serieManagedBean")
@Dependent
public class SerieManagedBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SerieWS/SerieWS.wsdl")
    private SerieWS_Service service;

    /**
     * Creates a new instance of SerieManagedBean
     */
    public SerieManagedBean() {
    }

    private int count() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        return port.count();
    }

    private void create(ws.HasEntrega entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        port.create(entity);
    }

    private void edit(ws.HasEntrega entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        port.edit(entity);
    }

    private HasEntrega find(java.lang.Object id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        return port.find(id);
    }

    private java.util.List<ws.HasEntrega> findAll() {
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

    private java.util.List<ws.HasEntrega> findRange(java.util.List<java.lang.Integer> range) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        return port.findRange(range);
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

    private void remove(ws.HasEntrega entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.SerieWS port = service.getSerieWSPort();
        port.remove(entity);
    }
    
}
