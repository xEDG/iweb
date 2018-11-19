/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceRef;
import ws.DrawdedeWebService_Service;
import ws.Entrega;
import ws.HasEntrega;
import ws.Serie;

/**
 *
 * @author Francis
 */

@Named(value = "crearEntregaManagedBean")
@RequestScoped
public class crearEntregaManagedBean {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Drawdede-war/DrawdedeWebService.wsdl")
    private DrawdedeWebService_Service service;
    
    private MisEntregasManagedBean misEntregasManaged;
    private int idEntrega;
    
    private HasEntrega hasEntrega;

    public HasEntrega getHasEntrega() {
        return hasEntrega;
    }

    public void setHasEntrega(HasEntrega hasEntrega) {
        this.hasEntrega = hasEntrega;
    }
    private List<Serie> series;

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }
    
    private Serie serie;
    private String serieId;
    private int idserie;

    public int getIdserie() {
        return idserie;
    }

    public void setIdserie(int idserie) {
        this.idserie = idserie;
    }

    public String getSerieId() {
        return serieId;
    }

    public void setSerieId(String serieId) {
        this.serieId = serieId;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    private Entrega entrega;
    private String anotacion;
    private Date fecha_entrega;
    
 
    public String navegarCrearEntrega(){
         obtenerSeries();
         return "crearEntrega";
    }


    public int getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }
    
    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public String getAnotacion() {
        return anotacion;
    }

    public void setAnotacion(String anotacion) {
        this.anotacion = anotacion;
    }


    public String crear() throws DatatypeConfigurationException{
        
        entrega= new Entrega();
        
        if(!anotacion.equals("")){
           entrega.setAnotacion(anotacion);
        }
       
        
        if(fecha_entrega!=null){
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(fecha_entrega);
        XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
         
        
        entrega.setFechaEntrega(date);
        }
        
        //creo la entrega
        this.createEntrega(entrega);
        
        //busco la entrega en la bd 
        
        Entrega nuevaEntrega;
        
        List<Entrega> listaEntrega;
        listaEntrega= this.findAllEntregas();
        nuevaEntrega = listaEntrega.get(listaEntrega.size()-1);
        
        this.hasEntrega= new HasEntrega();
        
        this.serie= this.findSerieConId(Integer.parseInt(serieId));
      
        hasEntrega.setIdSerie(serie);
        hasEntrega.setIdEntrega(nuevaEntrega);
        
        
        this.createHasEntrega(hasEntrega);
       
       
        return "index?faces-redirect=true";
            
    }
    
    
    private void createEntrega(ws.Entrega entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        port.createEntrega(entity);
    }
    
    
    
    private void obtenerSeries() {
        this.series = this.findAllSeries();
    }
    
       
    
    private java.util.List<ws.Serie> findAllSeries() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findAllSeries();
    }


    private void createHasEntrega(ws.HasEntrega entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        port.createHasEntrega(entity);
    }

    private java.util.List<ws.Serie> findSerieConTitulo(java.lang.String titulo) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findSerieConTitulo(titulo);
    }

    private java.util.List<ws.Entrega> findAllEntregas() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findAllEntregas();
    }

    private Serie findSerieConId(int id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findSerieConId(id);
    }
    
    
}
