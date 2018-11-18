/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Entrega;
import entity.HasEntrega;
import entity.Serie;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Rodrii
 */
@Stateless
public class HasEntregaFacade extends AbstractFacade<HasEntrega> {

    @PersistenceContext(unitName = "Drawdede-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HasEntregaFacade() {
        super(HasEntrega.class);
    }
    
    public List<Entrega> findEntregaConIdSerie(int id){
        Query q;
        q = this.em.createQuery("SELECT h.idEntrega FROM HasEntrega h  WHERE h.idSerie.id = :clave");
        q.setParameter("clave", id);
        List<Entrega> entregas = (List) q.getResultList();
        return entregas;
    }
    
    public Serie findSerieConEntrega(Entrega entrega){
        Query q;
        q = this.em.createQuery("SELECT h.idSerie FROM HasEntrega h  WHERE h.idEntrega = :clave");
        q.setParameter("clave", entrega);
        Serie serie = (Serie) q.getSingleResult();
        return serie;
    }
    
}
