
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para findSerieConEntrega complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="findSerieConEntrega"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="entrega" type="{http://ws/}entrega" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findSerieConEntrega", propOrder = {
    "entrega"
})
public class FindSerieConEntrega {

    protected Entrega entrega;

    /**
     * Obtiene el valor de la propiedad entrega.
     * 
     * @return
     *     possible object is
     *     {@link Entrega }
     *     
     */
    public Entrega getEntrega() {
        return entrega;
    }

    /**
     * Define el valor de la propiedad entrega.
     * 
     * @param value
     *     allowed object is
     *     {@link Entrega }
     *     
     */
    public void setEntrega(Entrega value) {
        this.entrega = value;
    }

}
