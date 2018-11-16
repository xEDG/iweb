/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapws;

import ejb.EntregaFacade;
import entity.Entrega;
import java.text.ParseException;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Rodrii
 */
@WebService(serviceName = "EntregaWebService")
public class EntregaWebService {

    @EJB
    private EntregaFacade ejbEntregaRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") Entrega entity) {
        ejbEntregaRef.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Entrega entity) {
        ejbEntregaRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Entrega entity) {
        ejbEntregaRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Entrega find(@WebParam(name = "id") Object id) {
        return ejbEntregaRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Entrega> findAll() {
        return ejbEntregaRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Entrega> findRange(@WebParam(name = "range") int[] range) {
        return ejbEntregaRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbEntregaRef.count();
    }

    @WebMethod(operationName = "getHulks")
    public List<String> getHulks() {
        return ejbEntregaRef.getHulks();
    }

    @WebMethod(operationName = "getFechaEntregaNotNull")
    public List<Entrega> getFechaEntregaNotNull() {
        return ejbEntregaRef.getFechaEntregaNotNull();
    }

    @WebMethod(operationName = "filtroPorAnotacion")
    public List<Entrega> filtroPorAnotacion(@WebParam(name = "anotacion") String anotacion) {
        return ejbEntregaRef.filtroPorAnotacion(anotacion);
    }

    @WebMethod(operationName = "filtrarPorPeriodoTiempo")
    public List<Entrega> filtrarPorPeriodoTiempo(@WebParam(name = "d1") String d1, @WebParam(name = "d2") String d2) throws ParseException {
        return ejbEntregaRef.filtrarPorPeriodoTiempo(d1, d2);
    }
    
}
