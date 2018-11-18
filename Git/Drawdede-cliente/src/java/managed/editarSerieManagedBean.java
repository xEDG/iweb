/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import javax.enterprise.context.RequestScoped;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
   

    public int getId() {
        return id;
    }

    /*public void setId(int id) {
        this.id = id;
    }*/

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

    
    public String editar () {
        boolean hasChanged = false;
        if (!titulo.equals(serie.getTitulo())) {
            serie.setTitulo(titulo);
            hasChanged = true;
        }
        if (!categoria.equals(serie.getCategoria())){
            serie.setCategoria(categoria);
            hasChanged = true;
        }
        if (!descripcion.equals(serie.getDescripcion())) {
            serie.setDescripcion(descripcion);
            hasChanged = true;
        }
        if(Integer.parseInt(valoracion)!=(serie.getValoracion())) {
            serie.setValoracion(Integer.parseInt(valoracion));
            hasChanged = true;
        }
        
        if (hasChanged) {
            editSerie(serie);
        }
        
        return "misSeries?faces-redirect=true";
        
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
