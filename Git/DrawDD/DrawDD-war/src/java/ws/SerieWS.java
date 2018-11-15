/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import iweb.entity.Serie;
import iweb.facade.SerieFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author user
 */
@WebService(serviceName = "SerieWS")
@Stateless()
public class SerieWS {

    @EJB
    private SerieFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") Serie entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Serie entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Serie entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Serie find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Serie> findAll() {
        return ejbRef.findAll();
    }
    

    @WebMethod(operationName = "findRange")
    public List<Serie> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
    
     @WebMethod(operationName = "getBestValSerie")
     public Serie getBestValSerie () {
         return ejbRef.getBestValSerie();
     }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findConTitulo")
    public List<Serie> findConTitulo(@WebParam(name = "titulo") String titulo) {
        //TODO write your implementation code here:;
        return ejbRef.findConTitulo(titulo);
    }
    
    @WebMethod (operationName = "getCategorias")
    public List<String> getCategorias() {
        return ejbRef.getCategorias();
    }
    
    @WebMethod (operationName = "getAll")
    public List<Serie> getAll() {
        return ejbRef.getAll();
    }
    
}
