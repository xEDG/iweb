/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import iweb.entity.Serie;
import iweb.facade.EntregaFacade;
import iweb.facade.SerieFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author Angel
 */
@Named(value = "indexBean")
@SessionScoped
public class IndexBean implements Serializable{

    @EJB
    private SerieFacade serieFacade;
    private List<Serie> series;
    
    

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }
     
    
    /**
     * Creates a new instance of IndexBean
     */
    public IndexBean() {
    }
    
    @PostConstruct
    public void init(){
        
    }
}
