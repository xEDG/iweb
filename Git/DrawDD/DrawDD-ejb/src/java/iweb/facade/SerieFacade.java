/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iweb.facade;

import iweb.entity.Serie;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author user
 */
@Stateless
public class SerieFacade extends AbstractFacade<Serie> {

    @PersistenceContext(unitName = "DrawDD-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SerieFacade() {
        super(Serie.class);
    }
    
    //Get the best valued serie
    public Serie getBestValSerie () {
        Query q;
        q = this.em.createQuery("SELECT s FROM Serie s WHERE s.valoracion IS NOT NULL ORDER BY s.valoracion DESC");
        List<Serie> lista = (List) q.getResultList();
        if (lista.size()>0) {
            return lista.get(0);
        } else {
            return null;
        }
     
    }
    
    public List<String> getCategorias() {
        Query q;
        q = this.em.createQuery("SELECT s.categoria FROM Serie s WHERE s.categoria IS NOT NULL");
        return (List) q.getResultList();
    }
    
    
    public List<Serie> findConTitulo(String titulo){
        Query q;
        q = this.em.createQuery("SELECT s FROM Serie s WHERE s.titulo LIKE CONCAT('%',:clave, '%')");
        q.setParameter("clave", titulo);
        List<Serie> result = (List) q.getResultList();
        return result;
    }
    
}
