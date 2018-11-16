
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para filtroPorAnotacionEntrega complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="filtroPorAnotacionEntrega"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filtroPorAnotacionEntrega", propOrder = {
    "anotacion"
})
public class FiltroPorAnotacionEntrega {

    protected String anotacion;

    /**
     * Obtiene el valor de la propiedad anotacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnotacion() {
        return anotacion;
    }

    /**
     * Define el valor de la propiedad anotacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnotacion(String value) {
        this.anotacion = value;
    }

}
