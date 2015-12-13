
package ssn.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para fieldSports complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="fieldSports">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hourPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="idSport" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fieldSports", propOrder = {
    "hourPrice",
    "idSport",
    "sportName"
})
public class FieldSports {

    protected double hourPrice;
    protected int idSport;
    protected String sportName;

    /**
     * Obtiene el valor de la propiedad hourPrice.
     * 
     */
    public double getHourPrice() {
        return hourPrice;
    }

    /**
     * Define el valor de la propiedad hourPrice.
     * 
     */
    public void setHourPrice(double value) {
        this.hourPrice = value;
    }

    /**
     * Obtiene el valor de la propiedad idSport.
     * 
     */
    public int getIdSport() {
        return idSport;
    }

    /**
     * Define el valor de la propiedad idSport.
     * 
     */
    public void setIdSport(int value) {
        this.idSport = value;
    }

    /**
     * Obtiene el valor de la propiedad sportName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSportName() {
        return sportName;
    }

    /**
     * Define el valor de la propiedad sportName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSportName(String value) {
        this.sportName = value;
    }

}
