/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;
import javax.inject.Named;
import javax.xml.ws.WebServiceRef;
import ws.DrawdedeWebService_Service;
import ws.Serie;

/**
 *
 * @author Edu
 */


@Named(value = "editarSerieManagedBean")
@RequestScoped
public class editarSerieManagedBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Drawdede-war/DrawdedeWebService.wsdl")
    private DrawdedeWebService_Service service;
    
    private Serie serie;
    
    
    //Atributos que vienen desde el .xhtml
    private int id;
    private String titulo;
    private String categoria;
    private String descripcion;
    private String valoracion;
  

    public Serie getSerie() {
        return serie;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }  
    
    public String goEdit (Serie s) {
        //System.out.println("Ha llegado a go Edit");
        this.serie = s;
        //System.out.println("Serie: " + serie.getTitulo());
        return "editarSerie?faces-redirect=true";
    } // :)

    public void onParameterReceived(){
        this.serie = this.findSerie(id);
        //título y categoría no pueden ser nulos
        this.setTitulo(serie.getTitulo());
        this.setCategoria(serie.getCategoria());
        
        if(serie.getDescripcion() != null) {
          this.setDescripcion(serie.getDescripcion());
        } else {
          this.setDescripcion("");
        }
        if(serie.getValoracion() != null) {
            this.setValoracion(serie.getValoracion().toString());
        }
    }
    
    
    public String editar () {
        System.out.println("PRE TESTING titulo val: " + titulo);
        //System.out.println("Testing s: " + s.getTitulo());
        serie = this.findSerie(id);
        serie.setId(id);
        serie.setTitulo(titulo);
        serie.setCategoria(categoria);
        serie.setDescripcion(descripcion);
        
        if(!valoracion.equalsIgnoreCase("vacio")){
        serie.setValoracion(Integer.parseInt(valoracion));
        } else {
            serie.setValoracion(null);
        }
        //Si es vacío, no la añado
        
        editSerie(serie);
          
        return "misSeries.jsf?refresh=1";
        //return "misSeries";
        //return msmb.navegarSeies();
        //return "index";         
        //return "editarSerie.jsf?id=" + serie.getId();
        
    }
       
    
    
    private void editSerie(ws.Serie entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        port.editSerie(entity);
    }

    private Serie findSerie(java.lang.Object id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findSerie(id);
    }
    
    
}
