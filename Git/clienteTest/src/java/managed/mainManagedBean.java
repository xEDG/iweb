/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.xml.ws.WebServiceRef;
import ws.DrawdedeWebService_Service;
import ws.Entrega;
import ws.HasEntrega;
import ws.ParseException_Exception;
import ws.Serie;

/**
 *
 * @author Francis
 */
@Named(value = "mainManagedBean")
@RequestScoped
public class mainManagedBean {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Drawdede-war/DrawdedeWebService.wsdl")
    private DrawdedeWebService_Service service;
    
  private  List<Entrega> entregas;
 private   List<Serie> series;
   private List<HasEntrega> hasEntregas;
    
  private  Entrega entrega;
   private Serie serie;
   private HasEntrega hasEntrega;
    
   private List<String> resultados;
   private String resultado;
    
    private String anotacion;
    private String idEntrega;
    private String fecha1;
    private String fecha2;
    
    private String idSerie;
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnotacion() {
        return anotacion;
    }

    public void setAnotacion(String anotacion) {
        this.anotacion = anotacion;
    }

    public String getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(String idEntrega) {
        this.idEntrega = idEntrega;
    }

    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    public String getFecha2() {
        return fecha2;
    }

    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }

    public String getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(String idSerie) {
        this.idSerie = idSerie;
    }
    
    public String gethulkentregas(){
        
        if(this.getHulksEntregas()!=null){
        this.resultados= this.getHulksEntregas();
        }
        
        return "index.jsf";
    }
    
    public String getcategoriaseries(){
       
        this.resultados= this.getCategoriasSerie();
        
        return "index.jsf";
    }
    
    public String getbestvalserie(){
        
        this.serie= this.getBestValSerie();
        
        return "index.jsf";
    }
    
   public String getworstvalserie(){
       this.serie=this.getWorstValSerie();
       return "index.jsf";
   }

   public String findserieconid(){
       
       
       this.serie= this.findSerieConId(Integer.parseInt(this.idSerie));
       
       return "indez.jsf";
   }
   
   public String findallseries(){
       this.series=this.findAllSeries();
       return "index.jsf";
   }
   
   public String findseriecontitulo(){
       this.series=this.findSerieConTitulo(titulo);
       return "index.jsf";
   }
   
   public String findentregaconid(){
       this.entrega=this.findEntregaConId(Integer.parseInt(idEntrega));
       return "index.jsf";
   }
   
   public String findporperiododetiempo() throws ParseException_Exception{
       this.entregas=this.filtrarEntregaPorPeriodoTiempo(fecha1, fecha2);
       return "index.jsf";
   }
   
   public String getfechaentreganotnull(){
       this.entregas= this.getFechaEntregaNotNull();
       
       return "index.jsf";
   }
   
   public String filtrarporanotacion(){
       
       this.entregas=this.filtroPorAnotacionEntrega(anotacion);
       
       return "index.jsf";
   }
   
   public String findentregaporidSerie(){
       this.entregas= this.findEntregasConIdSerie(Integer.parseInt(idSerie));
       
       return "index.jsf";
   }
   
   public String findserieconentrega(){
       this.entrega=this.findEntregaConId(Integer.parseInt(idEntrega));
       this.serie= this.findSerieConEntrega(entrega);
       
       return "index.jsf";
   }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
      
    public List<String> getResultados() {
        return resultados;
    }

    public void setResultados(List<String> resultados) {
        this.resultados = resultados;
    }
  
    public List<Entrega> getEntregas() {
        return entregas;
    }

    public void setEntregas(List<Entrega> entregas) {
        this.entregas = entregas;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    public List<HasEntrega> getHasEntregas() {
        return hasEntregas;
    }

    public void setHasEntregas(List<HasEntrega> hasEntregas) {
        this.hasEntregas = hasEntregas;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public HasEntrega getHasEntrega() {
        return hasEntrega;
    }

    public void setHasEntrega(HasEntrega hasEntrega) {
        this.hasEntrega = hasEntrega;
    }
    
    

    private java.util.List<java.lang.String> getHulksEntregas() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.getHulksEntregas();
    }

    private java.util.List<java.lang.String> getCategoriasSerie() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.getCategoriasSerie();
    }

    private Serie getWorstValSerie() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.getWorstValSerie();
    }

    private Serie getBestValSerie() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.getBestValSerie();
    }

    private Serie findSerieConId(int id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findSerieConId(id);
    }

    private java.util.List<ws.Serie> findAllSeries() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findAllSeries();
    }

    private java.util.List<ws.Serie> findSerieConTitulo(java.lang.String titulo) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findSerieConTitulo(titulo);
    }

    private Entrega findEntregaConId(int id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findEntregaConId(id);
    }

    private java.util.List<ws.Entrega> filtrarEntregaPorPeriodoTiempo(java.lang.String d1, java.lang.String d2) throws ParseException_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.filtrarEntregaPorPeriodoTiempo(d1, d2);
    }

    private java.util.List<ws.Entrega> getFechaEntregaNotNull() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.getFechaEntregaNotNull();
    }

    private java.util.List<ws.Entrega> filtroPorAnotacionEntrega(java.lang.String anotacion) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.filtroPorAnotacionEntrega(anotacion);
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

    
    
    
}
