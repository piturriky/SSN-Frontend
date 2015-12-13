
package ssn.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para field complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="field">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idField" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idManagerEntity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sports" type="{http://ws.ssn/}fieldSports" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "field", propOrder = {
    "idField",
    "idManagerEntity",
    "name",
    "sports"
})
public class Field {

    protected int idField;
    protected int idManagerEntity;
    protected String name;
    @XmlElement(nillable = true)
    protected List<FieldSports> sports;

    /**
     * Obtiene el valor de la propiedad idField.
     * 
     */
    public int getIdField() {
        return idField;
    }

    /**
     * Define el valor de la propiedad idField.
     * 
     */
    public void setIdField(int value) {
        this.idField = value;
    }

    /**
     * Obtiene el valor de la propiedad idManagerEntity.
     * 
     */
    public int getIdManagerEntity() {
        return idManagerEntity;
    }

    /**
     * Define el valor de la propiedad idManagerEntity.
     * 
     */
    public void setIdManagerEntity(int value) {
        this.idManagerEntity = value;
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

    /**
     * Gets the value of the sports property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sports property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSports().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldSports }
     * 
     * 
     */
    public List<FieldSports> getSports() {
        if (sports == null) {
            sports = new ArrayList<FieldSports>();
        }
        return this.sports;
    }

}
