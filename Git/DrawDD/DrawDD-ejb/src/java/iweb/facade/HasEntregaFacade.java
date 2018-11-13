/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iweb.facade;

import iweb.entity.HasEntrega;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
    
}
