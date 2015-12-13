
package ssn.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sport complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fields" type="{http://ws.ssn/}field" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idSport" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxPlayers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minPlayers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sport", propOrder = {
    "fields",
    "idSport",
    "maxPlayers",
    "minPlayers",
    "name"
})
public class Sport {

    @XmlElement(nillable = true)
    protected List<Field> fields;
    protected int idSport;
    protected int maxPlayers;
    protected int minPlayers;
    protected String name;

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Field }
     * 
     * 
     */
    public List<Field> getFields() {
        if (fields == null) {
            fields = new ArrayList<Field>();
        }
        return this.fields;
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
     * Obtiene el valor de la propiedad maxPlayers.
     * 
     */
    public int getMaxPlayers() {
        return maxPlayers;
    }

    /**
     * Define el valor de la propiedad maxPlayers.
     * 
     */
    public void setMaxPlayers(int value) {
        this.maxPlayers = value;
    }

    /**
     * Obtiene el valor de la propiedad minPlayers.
     * 
     */
    public int getMinPlayers() {
        return minPlayers;
    }

    /**
     * Define el valor de la propiedad minPlayers.
     * 
     */
    public void setMinPlayers(int value) {
        this.minPlayers = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
