/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soapws;

import ejb.HasEntregaFacade;
import entity.Entrega;
import entity.HasEntrega;
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
@WebService(serviceName = "HasEntregaWebService")
public class HasEntregaWebService {

    @EJB
    private HasEntregaFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") HasEntrega entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") HasEntrega entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") HasEntrega entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public HasEntrega find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<HasEntrega> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<HasEntrega> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findIdEntregaConTituloSerie")
    public List<Entrega> findIdEntregaConTituloSerie(@WebParam(name = "ids") List<Integer> ids) {
        return ejbRef.findIdEntregaConTituloSerie(ids);
    }
    
}
