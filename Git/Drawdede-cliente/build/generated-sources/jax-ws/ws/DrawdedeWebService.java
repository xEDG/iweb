
package ws;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DrawdedeWebService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DrawdedeWebService {


    /**
     * 
     * @param id
     * @return
     *     returns ws.Entrega
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findEntrega", targetNamespace = "http://ws/", className = "ws.FindEntrega")
    @ResponseWrapper(localName = "findEntregaResponse", targetNamespace = "http://ws/", className = "ws.FindEntregaResponse")
    @Action(input = "http://ws/DrawdedeWebService/findEntregaRequest", output = "http://ws/DrawdedeWebService/findEntregaResponse")
    public Entrega findEntrega(
        @WebParam(name = "id", targetNamespace = "")
        Object id);

    /**
     * 
     * @return
     *     returns ws.Serie
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBestValSerie", targetNamespace = "http://ws/", className = "ws.GetBestValSerie")
    @ResponseWrapper(localName = "getBestValSerieResponse", targetNamespace = "http://ws/", className = "ws.GetBestValSerieResponse")
    @Action(input = "http://ws/DrawdedeWebService/getBestValSerieRequest", output = "http://ws/DrawdedeWebService/getBestValSerieResponse")
    public Serie getBestValSerie();

    /**
     * 
     * @return
     *     returns java.util.List<ws.Serie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllSeries", targetNamespace = "http://ws/", className = "ws.FindAllSeries")
    @ResponseWrapper(localName = "findAllSeriesResponse", targetNamespace = "http://ws/", className = "ws.FindAllSeriesResponse")
    @Action(input = "http://ws/DrawdedeWebService/findAllSeriesRequest", output = "http://ws/DrawdedeWebService/findAllSeriesResponse")
    public List<Serie> findAllSeries();

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "createSerie", targetNamespace = "http://ws/", className = "ws.CreateSerie")
    @Action(input = "http://ws/DrawdedeWebService/createSerie")
    public void createSerie(
        @WebParam(name = "entity", targetNamespace = "")
        Serie entity);

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "createEntrega", targetNamespace = "http://ws/", className = "ws.CreateEntrega")
    @Action(input = "http://ws/DrawdedeWebService/createEntrega")
    public void createEntrega(
        @WebParam(name = "entity", targetNamespace = "")
        Entrega entity);

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "editSerie", targetNamespace = "http://ws/", className = "ws.EditSerie")
    @Action(input = "http://ws/DrawdedeWebService/editSerie")
    public void editSerie(
        @WebParam(name = "entity", targetNamespace = "")
        Serie entity);

    /**
     * 
     * @param id
     * @return
     *     returns ws.Serie
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findSerie", targetNamespace = "http://ws/", className = "ws.FindSerie")
    @ResponseWrapper(localName = "findSerieResponse", targetNamespace = "http://ws/", className = "ws.FindSerieResponse")
    @Action(input = "http://ws/DrawdedeWebService/findSerieRequest", output = "http://ws/DrawdedeWebService/findSerieResponse")
    public Serie findSerie(
        @WebParam(name = "id", targetNamespace = "")
        Object id);

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "editEntrega", targetNamespace = "http://ws/", className = "ws.EditEntrega")
    @Action(input = "http://ws/DrawdedeWebService/editEntrega")
    public void editEntrega(
        @WebParam(name = "entity", targetNamespace = "")
        Entrega entity);

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "removeSerie", targetNamespace = "http://ws/", className = "ws.RemoveSerie")
    @Action(input = "http://ws/DrawdedeWebService/removeSerie")
    public void removeSerie(
        @WebParam(name = "entity", targetNamespace = "")
        Serie entity);

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "removeEntrega", targetNamespace = "http://ws/", className = "ws.RemoveEntrega")
    @Action(input = "http://ws/DrawdedeWebService/removeEntrega")
    public void removeEntrega(
        @WebParam(name = "entity", targetNamespace = "")
        Entrega entity);

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "createHasEntrega", targetNamespace = "http://ws/", className = "ws.CreateHasEntrega")
    @Action(input = "http://ws/DrawdedeWebService/createHasEntrega")
    public void createHasEntrega(
        @WebParam(name = "entity", targetNamespace = "")
        HasEntrega entity);

    /**
     * 
     * @param id
     * @return
     *     returns ws.HasEntrega
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findHasEntrega", targetNamespace = "http://ws/", className = "ws.FindHasEntrega")
    @ResponseWrapper(localName = "findHasEntregaResponse", targetNamespace = "http://ws/", className = "ws.FindHasEntregaResponse")
    @Action(input = "http://ws/DrawdedeWebService/findHasEntregaRequest", output = "http://ws/DrawdedeWebService/findHasEntregaResponse")
    public HasEntrega findHasEntrega(
        @WebParam(name = "id", targetNamespace = "")
        Object id);

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "editHasEntrega", targetNamespace = "http://ws/", className = "ws.EditHasEntrega")
    @Action(input = "http://ws/DrawdedeWebService/editHasEntrega")
    public void editHasEntrega(
        @WebParam(name = "entity", targetNamespace = "")
        HasEntrega entity);

    /**
     * 
     * @return
     *     returns java.util.List<ws.Entrega>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllEntregas", targetNamespace = "http://ws/", className = "ws.FindAllEntregas")
    @ResponseWrapper(localName = "findAllEntregasResponse", targetNamespace = "http://ws/", className = "ws.FindAllEntregasResponse")
    @Action(input = "http://ws/DrawdedeWebService/findAllEntregasRequest", output = "http://ws/DrawdedeWebService/findAllEntregasResponse")
    public List<Entrega> findAllEntregas();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHulksEntregas", targetNamespace = "http://ws/", className = "ws.GetHulksEntregas")
    @ResponseWrapper(localName = "getHulksEntregasResponse", targetNamespace = "http://ws/", className = "ws.GetHulksEntregasResponse")
    @Action(input = "http://ws/DrawdedeWebService/getHulksEntregasRequest", output = "http://ws/DrawdedeWebService/getHulksEntregasResponse")
    public List<String> getHulksEntregas();

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "removeHasEntrega", targetNamespace = "http://ws/", className = "ws.RemoveHasEntrega")
    @Action(input = "http://ws/DrawdedeWebService/removeHasEntrega")
    public void removeHasEntrega(
        @WebParam(name = "entity", targetNamespace = "")
        HasEntrega entity);

    /**
     * 
     * @return
     *     returns java.util.List<ws.Entrega>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFechaEntregaNotNull", targetNamespace = "http://ws/", className = "ws.GetFechaEntregaNotNull")
    @ResponseWrapper(localName = "getFechaEntregaNotNullResponse", targetNamespace = "http://ws/", className = "ws.GetFechaEntregaNotNullResponse")
    @Action(input = "http://ws/DrawdedeWebService/getFechaEntregaNotNullRequest", output = "http://ws/DrawdedeWebService/getFechaEntregaNotNullResponse")
    public List<Entrega> getFechaEntregaNotNull();

    /**
     * 
     * @param titulo
     * @return
     *     returns java.util.List<ws.Serie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findSerieConTitulo", targetNamespace = "http://ws/", className = "ws.FindSerieConTitulo")
    @ResponseWrapper(localName = "findSerieConTituloResponse", targetNamespace = "http://ws/", className = "ws.FindSerieConTituloResponse")
    @Action(input = "http://ws/DrawdedeWebService/findSerieConTituloRequest", output = "http://ws/DrawdedeWebService/findSerieConTituloResponse")
    public List<Serie> findSerieConTitulo(
        @WebParam(name = "titulo", targetNamespace = "")
        String titulo);

    /**
     * 
     * @param ids
     * @return
     *     returns java.util.List<ws.Entrega>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findIdEntregaConTituloSerie", targetNamespace = "http://ws/", className = "ws.FindIdEntregaConTituloSerie")
    @ResponseWrapper(localName = "findIdEntregaConTituloSerieResponse", targetNamespace = "http://ws/", className = "ws.FindIdEntregaConTituloSerieResponse")
    @Action(input = "http://ws/DrawdedeWebService/findIdEntregaConTituloSerieRequest", output = "http://ws/DrawdedeWebService/findIdEntregaConTituloSerieResponse")
    public List<Entrega> findIdEntregaConTituloSerie(
        @WebParam(name = "ids", targetNamespace = "")
        List<Integer> ids);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCategoriasSerie", targetNamespace = "http://ws/", className = "ws.GetCategoriasSerie")
    @ResponseWrapper(localName = "getCategoriasSerieResponse", targetNamespace = "http://ws/", className = "ws.GetCategoriasSerieResponse")
    @Action(input = "http://ws/DrawdedeWebService/getCategoriasSerieRequest", output = "http://ws/DrawdedeWebService/getCategoriasSerieResponse")
    public List<String> getCategoriasSerie();

    /**
     * 
     * @return
     *     returns java.util.List<ws.HasEntrega>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllHasEntregas", targetNamespace = "http://ws/", className = "ws.FindAllHasEntregas")
    @ResponseWrapper(localName = "findAllHasEntregasResponse", targetNamespace = "http://ws/", className = "ws.FindAllHasEntregasResponse")
    @Action(input = "http://ws/DrawdedeWebService/findAllHasEntregasRequest", output = "http://ws/DrawdedeWebService/findAllHasEntregasResponse")
    public List<HasEntrega> findAllHasEntregas();

    /**
     * 
     * @param d1
     * @param d2
     * @return
     *     returns java.util.List<ws.Entrega>
     * @throws ParseException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "filtrarEntregaPorPeriodoTiempo", targetNamespace = "http://ws/", className = "ws.FiltrarEntregaPorPeriodoTiempo")
    @ResponseWrapper(localName = "filtrarEntregaPorPeriodoTiempoResponse", targetNamespace = "http://ws/", className = "ws.FiltrarEntregaPorPeriodoTiempoResponse")
    @Action(input = "http://ws/DrawdedeWebService/filtrarEntregaPorPeriodoTiempoRequest", output = "http://ws/DrawdedeWebService/filtrarEntregaPorPeriodoTiempoResponse", fault = {
        @FaultAction(className = ParseException_Exception.class, value = "http://ws/DrawdedeWebService/filtrarEntregaPorPeriodoTiempo/Fault/ParseException")
    })
    public List<Entrega> filtrarEntregaPorPeriodoTiempo(
        @WebParam(name = "d1", targetNamespace = "")
        String d1,
        @WebParam(name = "d2", targetNamespace = "")
        String d2)
        throws ParseException_Exception
    ;

    /**
     * 
     * @param anotacion
     * @return
     *     returns java.util.List<ws.Entrega>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "filtroPorAnotacionEntrega", targetNamespace = "http://ws/", className = "ws.FiltroPorAnotacionEntrega")
    @ResponseWrapper(localName = "filtroPorAnotacionEntregaResponse", targetNamespace = "http://ws/", className = "ws.FiltroPorAnotacionEntregaResponse")
    @Action(input = "http://ws/DrawdedeWebService/filtroPorAnotacionEntregaRequest", output = "http://ws/DrawdedeWebService/filtroPorAnotacionEntregaResponse")
    public List<Entrega> filtroPorAnotacionEntrega(
        @WebParam(name = "anotacion", targetNamespace = "")
        String anotacion);

    /**
     * 
     * @return
     *     returns ws.Serie
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getWorstValSerie", targetNamespace = "http://ws/", className = "ws.GetWorstValSerie")
    @ResponseWrapper(localName = "getWorstValSerieResponse", targetNamespace = "http://ws/", className = "ws.GetWorstValSerieResponse")
    @Action(input = "http://ws/DrawdedeWebService/getWorstValSerieRequest", output = "http://ws/DrawdedeWebService/getWorstValSerieResponse")
    public Serie getWorstValSerie();

}
