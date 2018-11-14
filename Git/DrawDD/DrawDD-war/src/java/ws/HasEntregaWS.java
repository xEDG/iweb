/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import iweb.entity.Entrega;
import iweb.entity.HasEntrega;
import iweb.entity.Serie;
import iweb.facade.HasEntregaFacade;
import iweb.facade.SerieFacade;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
@WebService(serviceName = "HasEntregaWS")
@Stateless()
public class HasEntregaWS {

    @EJB
    private HasEntregaFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")
    
    @EJB
    private SerieFacade ejbSerie;

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
    
    @WebMethod(operationName = "findEntregasRelacionadaSerie")
    public List<Entrega> findEntregasRelacionadaSerie(@WebParam(name = "serie") String serie) {
        //TODO write your implementation code here:;
        List<Serie> series = ejbSerie.findConTitulo(serie);
        List<Integer> idSeries = new ArrayList<>();
        for(Serie s : series){
            idSeries.add(s.getId());
        }
        List<Entrega> entregas = ejbRef.findIdEntregaConTituloSerie(idSeries);
        
        return entregas;
    }
    
}
