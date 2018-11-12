/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author user
 */
@Entity
@Table(name = "serie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Serie.findAll", query = "SELECT s FROM Serie s")
    , @NamedQuery(name = "Serie.findByIdSerie", query = "SELECT s FROM Serie s WHERE s.idSerie = :idSerie")
    , @NamedQuery(name = "Serie.findByCategoria", query = "SELECT s FROM Serie s WHERE s.categoria = :categoria")
    , @NamedQuery(name = "Serie.findByDescripcion", query = "SELECT s FROM Serie s WHERE s.descripcion = :descripcion")
    , @NamedQuery(name = "Serie.findByValoracion", query = "SELECT s FROM Serie s WHERE s.valoracion = :valoracion")})
public class Serie implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idSerie")
    private Integer idSerie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "categoria")
    private String categoria;
    @Size(max = 150)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "valoracion")
    private Integer valoracion;

    public Serie() {
    }

    public Serie(Integer idSerie) {
        this.idSerie = idSerie;
    }

    public Serie(Integer idSerie, String categoria) {
        this.idSerie = idSerie;
        this.categoria = categoria;
    }

    public Integer getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Integer idSerie) {
        this.idSerie = idSerie;
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

    public Integer getValoracion() {
        return valoracion;
    }

    public void setValoracion(Integer valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSerie != null ? idSerie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Serie)) {
            return false;
        }
        Serie other = (Serie) object;
        if ((this.idSerie == null && other.idSerie != null) || (this.idSerie != null && !this.idSerie.equals(other.idSerie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Serie[ idSerie=" + idSerie + " ]";
    }
    
}
