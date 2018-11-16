/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.Entrega;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class EntregaFacade extends AbstractFacade<Entrega> {

    @PersistenceContext(unitName = "Drawdede-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EntregaFacade() {
        super(Entrega.class);
    }
    
    public List<String> getHulks() {
        Query q;
        q = this.em.createQuery("SELECT e.anotacion FROM Entrega e WHERE UPPER(e.anotacion) LIKE UPPER('%hulk%')");

        return (List) q.getResultList();

    }

    public List<Entrega> getFechaEntregaNotNull() {
        Query q;
        q = this.em.createQuery("Select e FROM Entrega e WHERE e.fechaEntrega IS NOT NULL");
        return (List) q.getResultList();
    }

    public List<Entrega> filtroPorAnotacion(String anotacion) {

        Query q = this.em.createQuery("SELECT e FROM Entrega e WHERE e.anotacion LIKE :anotacion");
        q.setParameter("anotacion", "%" + anotacion + "%");

        List<Entrega> lista = (List<Entrega>) q.getResultList();
        return lista;
    }

    public List<Entrega> filtrarPorPeriodoTiempo(String d1, String d2) throws ParseException {

        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = format.parse(d1);
        Date date2 = format.parse(d2);

        //No debemos usar Between porque compara de izquierda a derecha, si el año es igual no lo mira
        //Fuente https://stackoverflow.com/questions/5125076/sql-query-to-select-dates-between-two-dates
        
        Query q = this.em.createQuery("select e from Entrega e where e.fechaEntrega >= :d1 AND e.fechaEntrega <= :d2");

        q.setParameter("d1", date1);
        q.setParameter("d2", date2);

        List<Entrega> lista = (List) q.getResultList();
        return lista;
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
