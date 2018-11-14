/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iweb.facade;

import iweb.entity.Entrega;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author user
 */
@Stateless
public class EntregaFacade extends AbstractFacade<Entrega> {

    @PersistenceContext(unitName = "DrawDD-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EntregaFacade() {
        super(Entrega.class);
    }
    
    public List<String> getHulks () {
        Query q;
        q = this.em.createQuery("SELECT e.anotacion FROM Entrega e WHERE UPPER(e.anotacion) LIKE UPPER('%hulk%')");
               
        return (List) q.getResultList();
    
    }
           
    public List <Entrega> getFechaEntregaNotNull () {
      Query q;
      q = this.em.createQuery("Select e FROM Entrega e WHERE e.fechaEntrega IS NOT NULL");
      return (List) q.getResultList();
    }
    
    /*  public Usuario obtenerUsuario(String usuario, String pass) {
        Query q;
        q = this.em.createQuery("SELECT u FROM Usuario u WHERE u.nombreUsuario = :usuario AND u.contraseña = :password ");
        String hashPasado = app.cosas.Hash.hash(usuario + ":" + pass);
        q.setParameter("usuario", usuario);
        q.setParameter("password", hashPasado);
        List<Usuario> lista = (List) q.getResultList();
        //System.out.println(pass + " " + hashPasado);

        if (lista.size() > 0) {
            return lista.get(0);
        } else {
            return null;
        }
    }
        */
    
    
}
