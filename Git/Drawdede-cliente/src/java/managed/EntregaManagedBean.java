/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.xml.ws.WebServiceRef;
import soapws.EntregaWebService_Service;
import soapws.ParseException_Exception;
import soapws.Serie;

/**
 *
 * @author Rodrii
 */
@Named(value = "entregaManagedBean")
@Dependent
public class EntregaManagedBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Drawdede-war/EntregaWebService.wsdl")
    private EntregaWebService_Service service;

    /**
     * Creates a new instance of EntregaManagedBean
     */
    public EntregaManagedBean() {
    }

    private void create(soapws.Serie entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.EntregaWebService port = service.getEntregaWebServicePort();
        port.create(entity);
    }

    private void edit(soapws.Serie entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.EntregaWebService port = service.getEntregaWebServicePort();
        port.edit(entity);
    }

    private int count() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.EntregaWebService port = service.getEntregaWebServicePort();
        return port.count();
    }

    private java.util.List<soapws.Entrega> filtrarPorPeriodoTiempo(java.lang.String d1, java.lang.String d2) throws ParseException_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.EntregaWebService port = service.getEntregaWebServicePort();
        return port.filtrarPorPeriodoTiempo(d1, d2);
    }

    private java.util.List<soapws.Entrega> filtroPorAnotacion(java.lang.String anotacion) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.EntregaWebService port = service.getEntregaWebServicePort();
        return port.filtroPorAnotacion(anotacion);
    }

    private Serie find(java.lang.Object id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.EntregaWebService port = service.getEntregaWebServicePort();
        return port.find(id);
    }

    private java.util.List<soapws.Serie> findAll() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.EntregaWebService port = service.getEntregaWebServicePort();
        return port.findAll();
    }

    private java.util.List<soapws.Serie> findRange(java.util.List<java.lang.Integer> range) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.EntregaWebService port = service.getEntregaWebServicePort();
        return port.findRange(range);
    }

    private java.util.List<soapws.Entrega> getFechaEntregaNotNull() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.EntregaWebService port = service.getEntregaWebServicePort();
        return port.getFechaEntregaNotNull();
    }

    private java.util.List<java.lang.String> getHulks() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.EntregaWebService port = service.getEntregaWebServicePort();
        return port.getHulks();
    }

    private void remove(soapws.Serie entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.EntregaWebService port = service.getEntregaWebServicePort();
        port.remove(entity);
    }
    
}
