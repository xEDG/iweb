/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import ejb.EntregaFacade;
import ejb.HasEntregaFacade;
import ejb.SerieFacade;
import entity.Entrega;
import entity.HasEntrega;
import entity.Serie;
import java.text.ParseException;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Rodrii
 */
@WebService(serviceName = "DrawdedeWebService")
public class DrawdedeWebService {
    
    @EJB
    private SerieFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    
    @WebMethod(operationName = "findAllSeries")
    public List<Serie> findAllSeries() {
        return ejbRef.findAll();
    }
    
    @WebMethod(operationName = "createSerie")
    @Oneway
    public void createSerie(@WebParam(name = "entity") Serie entity) {
        ejbRef.create(entity);
    }
    
    @WebMethod(operationName = "editSerie")
    @Oneway
    public void editSerie(@WebParam(name = "entity") Serie entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "removeSerie")
    @Oneway
    public void removeSerie(@WebParam(name = "entity") Serie entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "findSerie")
    public Serie findSerie(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }
    
    @WebMethod(operationName = "getBestValSerie")
    public Serie getBestValSerie() {
        return ejbRef.getBestValSerie();
    }
    
    @WebMethod(operationName = "getWorstValSerie")
    public Serie getWorstValSerie() {
        return ejbRef.getWorstValSerie();
    }

    @WebMethod(operationName = "getCategoriasSerie")
    public List<String> getCategoriasSerie() {
        return ejbRef.getCategorias();
    }

    @WebMethod(operationName = "findSerieConTitulo")
    public List<Serie> findSerieConTitulo(@WebParam(name = "titulo") String titulo) {
        return ejbRef.findConTitulo(titulo);
    }
    
    //////////////////////////////////////////////////////////////////////////////////////7
    
     @EJB
    private EntregaFacade ejbEntregaRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createEntrega")
    @Oneway
    public void createEntrega(@WebParam(name = "entity") Entrega entity) {
        ejbEntregaRef.create(entity);
    }

    @WebMethod(operationName = "editEntrega")
    @Oneway
    public void editEntrega(@WebParam(name = "entity") Entrega entity) {
        ejbEntregaRef.edit(entity);
    }

    @WebMethod(operationName = "removeEntrega")
    @Oneway
    public void removeEntrega(@WebParam(name = "entity") Entrega entity) {
        ejbEntregaRef.remove(entity);
    }

    @WebMethod(operationName = "findEntrega")
    public Entrega findEntrega(@WebParam(name = "id") Object id) {
        return ejbEntregaRef.find(id);
    }

    @WebMethod(operationName = "findAllEntregas")
    public List<Entrega> findAllEntregas() {
        return ejbEntregaRef.findAll();
    }

    @WebMethod(operationName = "getHulksEntregas")
    public List<String> getHulksEntregas() {
        return ejbEntregaRef.getHulks();
    }

    @WebMethod(operationName = "getFechaEntregaNotNull")
    public List<Entrega> getFechaEntregaNotNull() {
        return ejbEntregaRef.getFechaEntregaNotNull();
    }

    @WebMethod(operationName = "filtroPorAnotacionEntrega")
    public List<Entrega> filtroPorAnotacionEntrega(@WebParam(name = "anotacion") String anotacion) {
        return ejbEntregaRef.filtroPorAnotacion(anotacion);
    }

    @WebMethod(operationName = "filtrarEntregaPorPeriodoTiempo")
    public List<Entrega> filtrarEntregaPorPeriodoTiempo(@WebParam(name = "d1") String d1, @WebParam(name = "d2") String d2) throws ParseException {
        return ejbEntregaRef.filtrarPorPeriodoTiempo(d1, d2);
    }
    
    ///////////////////////////////////////////////////////////////////
   
    @EJB
    private HasEntregaFacade ejbHasEntregaRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createHasEntrega")
    @Oneway
    public void createHasEntrega(@WebParam(name = "entity") HasEntrega entity) {
        ejbHasEntregaRef.create(entity);
    }

    @WebMethod(operationName = "editHasEntrega")
    @Oneway
    public void editHasEntrega(@WebParam(name = "entity") HasEntrega entity) {
        ejbHasEntregaRef.edit(entity);
    }

    @WebMethod(operationName = "removeHasEntrega")
    @Oneway
    public void removeHasEntrega(@WebParam(name = "entity") HasEntrega entity) {
        ejbHasEntregaRef.remove(entity);
    }

    @WebMethod(operationName = "findHasEntrega")
    public HasEntrega findHasEntrega(@WebParam(name = "id") Object id) {
        return ejbHasEntregaRef.find(id);
    }

    @WebMethod(operationName = "findAllHasEntregas")
    public List<HasEntrega> findAllHasEntregas() {
        return ejbHasEntregaRef.findAll();
    }

    @WebMethod(operationName = "findIdEntregaConTituloSerie")
    public List<Entrega> findIdEntregaConTituloSerie(@WebParam(name = "ids") List<Integer> ids) {
        return ejbHasEntregaRef.findIdEntregaConTituloSerie(ids);
    }
}
