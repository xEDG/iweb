/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;
import ws.DrawdedeWebService_Service;
import ws.Entrega;
import ws.ParseException_Exception;
import ws.Serie;

@Named(value = "misEntregasManagedBean")
@RequestScoped
public class MisEntregasManagedBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Drawdede-war/DrawdedeWebService.wsdl")
    private DrawdedeWebService_Service service;

    private List<Entrega> entregas;
    private String busqueda;
    private String t1, t2;
    private List<Entrega> resultadoBusqueda = null;
    private Integer refresh = 0;

    public Integer getRefresh() {
        return refresh;
    }

    public void setRefresh(Integer refresh) {
        this.refresh = refresh;
    }

    /**
     * Creates a new instance of MisEntregasManagedBean
     */
    public MisEntregasManagedBean() {
    }

    public String navegarEntregas() {
        obtenerEntregas();
        return "misEntregas";
    }

    private void obtenerEntregas() {
        entregas = this.findAllEntregas();
    }

    public String buscar() {
        entregas = this.filtroPorAnotacionEntrega(busqueda);
        return "misEntregas";
    }

    public String filtrarPorPeriodoDeTiempo() throws ParseException_Exception {
        entregas = this.filtrarEntregaPorPeriodoTiempo(t1, t2);
        return "misEntregas";
    }

    public List<Entrega> getResultadoBusqueda() {
        return resultadoBusqueda;
    }

    public List<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(List<Entrega> entregas) {
        this.entregas = entregas;
    }

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }

    public void setResultadoBusqueda(List<Entrega> resultadoBusqueda) {
        this.resultadoBusqueda = resultadoBusqueda;
    }

    public String getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    public String entregasAsociadasASerie(int id) {
        //this.entregas = this.findEntregasConIdSerie(id);
        return "misEntregas";
    }

    public String getSerieconEntrega(Entrega entrega) {
        return this.findSerieConEntrega(entrega).getTitulo();
    }

    private java.util.List<ws.Entrega> findAllEntregas() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findAllEntregas();
    }

    private java.util.List<ws.Entrega> filtroPorAnotacionEntrega(java.lang.String anotacion) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.filtroPorAnotacionEntrega(anotacion);
    }

    private java.util.List<ws.Entrega> filtrarEntregaPorPeriodoTiempo(java.lang.String d1, java.lang.String d2) throws ParseException_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.filtrarEntregaPorPeriodoTiempo(d1, d2);
    }

    private java.util.List<ws.Entrega> findEntregasConIdSerie(int id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findEntregasConIdSerie(id);
    }

    private Serie findSerieConEntrega(ws.Entrega entrega) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findSerieConEntrega(entrega);
    }

    
    public void onParameterReceived(Integer r){
        // En progreso, Edu.
        System.out.println("WAKI Hola en entregas he recibido un parametro BIENN");
        if (r > 0) {
            System.out.println("WAKI HE ENTRADO EN EL IF DE PARAMETER");
            obtenerEntregas();
           // this.refresh = false;
        } else {
            System.out.println("WAKI Soy menor qe cero sorry xd entrega");
    
        }
        
    }
    
    public String eliminarEntrega(Integer id){
        Entrega e = this.findEntrega(id);
        this.removeEntrega(e);
        obtenerEntregas();
        return "misEntregas";
    }

    private Entrega findEntrega(java.lang.Object id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findEntrega(id);
    }

    private void removeEntrega(ws.Entrega entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        port.removeEntrega(entity);
    }

}
