/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iweb.facade;

import iweb.entity.Entrega;
import iweb.entity.HasEntrega;
import iweb.entity.Serie;
import java.util.List;
import java.util.Set;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author user
 */
@Stateless
public class HasEntregaFacade extends AbstractFacade<HasEntrega> {

    @PersistenceContext(unitName = "DrawDD-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HasEntregaFacade() {
        super(HasEntrega.class);
    }
    
    
    public List<Entrega> findIdEntregaConTituloSerie(List<Integer> ids){
        Query q;
        q = this.em.createQuery("SELECT h.idEntrega FROM HasEntrega h  WHERE h.idSerie IN :clave");
        q.setParameter("clave", ids);
        List<Entrega> entregas = (List) q.getResultList();
        return entregas;
    }
    
}
