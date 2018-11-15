/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.xml.ws.WebServiceRef;
import ws.EntregaWS_Service;
import ws.HasEntrega;
import ws.ParseException_Exception;

/**
 *
 * @author Rodrii
 */
@Named(value = "entregaManagedBean")
@Dependent
public class EntregaManagedBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/EntregaWS/EntregaWS.wsdl")
    private EntregaWS_Service service;

    /**
     * Creates a new instance of EntregaManagedBean
     */
    public EntregaManagedBean() {
    }

    private int count() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.EntregaWS port = service.getEntregaWSPort();
        return port.count();
    }

    private void create(ws.HasEntrega entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.EntregaWS port = service.getEntregaWSPort();
        port.create(entity);
    }

    private void edit(ws.HasEntrega entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.EntregaWS port = service.getEntregaWSPort();
        port.edit(entity);
    }

    private java.util.List<ws.Entrega> filtrarPorAnotacion(java.lang.String arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.EntregaWS port = service.getEntregaWSPort();
        return port.filtrarPorAnotacion(arg0);
    }

    private java.util.List<ws.Entrega> filtrarPorPeriodoTiempo(java.lang.String arg0, java.lang.String arg1) throws ParseException_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.EntregaWS port = service.getEntregaWSPort();
        return port.filtrarPorPeriodoTiempo(arg0, arg1);
    }

    private HasEntrega find(java.lang.Object id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.EntregaWS port = service.getEntregaWSPort();
        return port.find(id);
    }

    private java.util.List<ws.HasEntrega> findAll() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.EntregaWS port = service.getEntregaWSPort();
        return port.findAll();
    }

    private java.util.List<ws.HasEntrega> findRange(java.util.List<java.lang.Integer> range) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.EntregaWS port = service.getEntregaWSPort();
        return port.findRange(range);
    }

    private java.util.List<ws.Entrega> getFechaEntregaNotNull() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.EntregaWS port = service.getEntregaWSPort();
        return port.getFechaEntregaNotNull();
    }

    private java.util.List<java.lang.String> getHulks() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.EntregaWS port = service.getEntregaWSPort();
        return port.getHulks();
    }

    private void remove(ws.HasEntrega entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.EntregaWS port = service.getEntregaWSPort();
        port.remove(entity);
    }
    
}
