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
import ws.HasEntregaWS_Service;

/**
 *
 * @author Rodrii
 */
@Named(value = "hasEntregaManagedBean")
@Dependent
public class HasEntregaManagedBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/HasEntregaWS/HasEntregaWS.wsdl")
    private HasEntregaWS_Service service;

    /**
     * Creates a new instance of HasEntregaManagedBean
     */
    public HasEntregaManagedBean() {
    }

    private int count() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.HasEntregaWS port = service.getHasEntregaWSPort();
        return port.count();
    }

    private void create(ws.HasEntrega entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.HasEntregaWS port = service.getHasEntregaWSPort();
        port.create(entity);
    }

    private void edit(ws.HasEntrega entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.HasEntregaWS port = service.getHasEntregaWSPort();
        port.edit(entity);
    }

    private HasEntrega find(java.lang.Object id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.HasEntregaWS port = service.getHasEntregaWSPort();
        return port.find(id);
    }

    private java.util.List<ws.HasEntrega> findAll() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.HasEntregaWS port = service.getHasEntregaWSPort();
        return port.findAll();
    }

    private java.util.List<ws.Entrega> findEntregasRelacionadaSerie(java.lang.String serie) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.HasEntregaWS port = service.getHasEntregaWSPort();
        return port.findEntregasRelacionadaSerie(serie);
    }

    private java.util.List<ws.HasEntrega> findRange(java.util.List<java.lang.Integer> range) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.HasEntregaWS port = service.getHasEntregaWSPort();
        return port.findRange(range);
    }

    private void remove(ws.HasEntrega entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.HasEntregaWS port = service.getHasEntregaWSPort();
        port.remove(entity);
    }
    
}
