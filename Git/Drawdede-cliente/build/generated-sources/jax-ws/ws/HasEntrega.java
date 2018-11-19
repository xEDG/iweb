
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para hasEntrega complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="hasEntrega"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idEntrega" type="{http://ws/}entrega" minOccurs="0"/&gt;
 *         &lt;element name="idSerie" type="{http://ws/}serie" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hasEntrega", propOrder = {
    "id",
    "idEntrega",
    "idSerie"
})
public class HasEntrega {

    protected Integer id;
    protected Entrega idEntrega;
    protected Serie idSerie;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad idEntrega.
     * 
     * @return
     *     possible object is
     *     {@link Entrega }
     *     
     */
    public Entrega getIdEntrega() {
        return idEntrega;
    }

    /**
     * Define el valor de la propiedad idEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link Entrega }
     *     
     */
    public void setIdEntrega(Entrega value) {
        this.idEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad idSerie.
     * 
     * @return
     *     possible object is
     *     {@link Serie }
     *     
     */
    public Serie getIdSerie() {
        return idSerie;
    }

    /**
     * Define el valor de la propiedad idSerie.
     * 
     * @param value
     *     allowed object is
     *     {@link Serie }
     *     
     */
    public void setIdSerie(Serie value) {
        this.idSerie = value;
    }

}
