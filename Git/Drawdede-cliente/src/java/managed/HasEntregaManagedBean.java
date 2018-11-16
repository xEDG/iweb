/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.xml.ws.WebServiceRef;
import soapws.HasEntregaWebService_Service;
import soapws.Serie;

/**
 *
 * @author Rodrii
 */
@Named(value = "hasEntregaManagedBean")
@Dependent
public class HasEntregaManagedBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Drawdede-war/HasEntregaWebService.wsdl")
    private HasEntregaWebService_Service service;

    /**
     * Creates a new instance of HasEntregaManagedBean
     */
    public HasEntregaManagedBean() {
    }

    private int count() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.HasEntregaWebService port = service.getHasEntregaWebServicePort();
        return port.count();
    }

    private void create(soapws.Serie entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.HasEntregaWebService port = service.getHasEntregaWebServicePort();
        port.create(entity);
    }

    private void edit(soapws.Serie entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.HasEntregaWebService port = service.getHasEntregaWebServicePort();
        port.edit(entity);
    }

    private Serie find(java.lang.Object id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.HasEntregaWebService port = service.getHasEntregaWebServicePort();
        return port.find(id);
    }

    private java.util.List<soapws.Serie> findAll() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.HasEntregaWebService port = service.getHasEntregaWebServicePort();
        return port.findAll();
    }

    private java.util.List<soapws.Entrega> findIdEntregaConTituloSerie(java.util.List<java.lang.Integer> ids) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.HasEntregaWebService port = service.getHasEntregaWebServicePort();
        return port.findIdEntregaConTituloSerie(ids);
    }

    private java.util.List<soapws.Serie> findRange(java.util.List<java.lang.Integer> range) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.HasEntregaWebService port = service.getHasEntregaWebServicePort();
        return port.findRange(range);
    }

    private void remove(soapws.Serie entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        soapws.HasEntregaWebService port = service.getHasEntregaWebServicePort();
        port.remove(entity);
    }
    
}
