
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para filtrarEntregaPorPeriodoTiempo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="filtrarEntregaPorPeriodoTiempo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="d1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="d2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filtrarEntregaPorPeriodoTiempo", propOrder = {
    "d1",
    "d2"
})
public class FiltrarEntregaPorPeriodoTiempo {

    protected String d1;
    protected String d2;

    /**
     * Obtiene el valor de la propiedad d1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getD1() {
        return d1;
    }

    /**
     * Define el valor de la propiedad d1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setD1(String value) {
        this.d1 = value;
    }

    /**
     * Obtiene el valor de la propiedad d2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getD2() {
        return d2;
    }

    /**
     * Define el valor de la propiedad d2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setD2(String value) {
        this.d2 = value;
    }

}
