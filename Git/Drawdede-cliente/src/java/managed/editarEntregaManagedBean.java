/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;
import javax.inject.Named;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceRef;
import ws.DrawdedeWebService_Service;
import ws.Entrega;
import ws.Serie;

/**
 *
 * @author Edu
 */
@Named(value = "editarEntregaManagedBean")
@RequestScoped
public class editarEntregaManagedBean {
    
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Drawdede-war/DrawdedeWebService.wsdl")
    private DrawdedeWebService_Service service;
    
    private Entrega entrega;

    //Atributos que vienen desde el .xhtml
    private int id;
    private String anotacion;
    private Date fecha_entrega;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
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
    
    public Date getFecha_entrega() {
        return fecha_entrega;
    }
    
    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }
    
    public void onParameterReceived() {
        this.entrega = this.findEntrega(id);
        
        if (entrega.getAnotacion() != null) {
            this.setAnotacion(entrega.getAnotacion());
        } else {
            this.setAnotacion("");
        }
        if (entrega.getFechaEntrega() != null) {
            Date date = entrega.getFechaEntrega().toGregorianCalendar().getTime();
            this.setFecha_entrega(date);
        } else {
            this.setFecha_entrega(null);
        }        
        
    }
    
    public String editar() throws DatatypeConfigurationException {
        
        entrega = this.findEntrega(id);
        entrega.setId(id);
        entrega.setAnotacion(anotacion);
        /*String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        simpleDateFormat.format(fecha_entrega);*/
        
        if (fecha_entrega != null) {
            GregorianCalendar c = createClearedCalendar();
            c.setTime(fecha_entrega);
            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            
            entrega.setFechaEntrega(date2);
        } else {
            entrega.setFechaEntrega(null);
        }
        
        editEntrega(entrega);
        
        return "misEntregas.jsf?refresh=true";
        //return "misSeries";
        //return msmb.navegarSeies();
        //return "index";         
        //return "editarSerie.jsf?id=" + serie.getId();
        
    }
    
    private Entrega findEntrega(java.lang.Object id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        return port.findEntrega(id);
    }
    
    private void editEntrega(ws.Entrega entity) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.DrawdedeWebService port = service.getDrawdedeWebServicePort();
        port.editEntrega(entity);
    }
    
    public static GregorianCalendar createClearedCalendar() {
        TimeZone timeZone;
        timeZone = TimeZone.getTimeZone("GMT+0:00");
        TimeZone.setDefault(timeZone);
        
        GregorianCalendar cal = (GregorianCalendar) Calendar.getInstance();
        
        cal.setTimeZone(timeZone);
        
        cal.set(1970, 0, 1, 0, 0, 0);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        
        cal.clear(Calendar.MILLISECOND);
        
        return cal;
    }
    
}
