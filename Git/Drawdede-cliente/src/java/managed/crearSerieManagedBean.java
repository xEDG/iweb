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
 * @author Francis
 */

@Named(value = "crearSerieManagedBean")
@RequestScoped

public class crearSerieManagedBean {
    
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Drawdede-war/DrawdedeWebService.wsdl")
    private DrawdedeWebService_Service service;
    
    private Serie serie;
    
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
    
    public String crear(){
        
        serie= new Serie();
        
        serie.setTitulo(titulo);
        serie.setCategoria(categoria);
        
        if(descripcion.equals("")){
            serie.setDescripcion(null);
        }else{
            serie.setDescripcion(descripcion);
        }
        
        if(valoracion.equals("vacio")){
            serie.setValoracion(null);
        }else{
            serie.setValoracion(Integer.parseInt(valoracion));
        }
        
        this.createSerie(serie);
        
        return "index?faces-redirect=true";
    }

    private void createSerie(ws.Serie entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        port.createSerie(entity);
    }
    
}
