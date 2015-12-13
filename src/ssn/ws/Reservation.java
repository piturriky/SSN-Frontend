
package ssn.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para reservation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="reservation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confirmed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idEvent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idField" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idReservation" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "confirmed",
    "endDate",
    "idEvent",
    "idField",
    "idReservation",
    "startDate",
    "type"
})
public class Reservation {

    protected boolean confirmed;
    protected long endDate;
    protected int idEvent;
    protected int idField;
    protected int idReservation;
    protected long startDate;
    protected int type;

    /**
     * Obtiene el valor de la propiedad confirmed.
     * 
     */
    public boolean isConfirmed() {
        return confirmed;
    }

    /**
     * Define el valor de la propiedad confirmed.
     * 
     */
    public void setConfirmed(boolean value) {
        this.confirmed = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     */
    public long getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     */
    public void setEndDate(long value) {
        this.endDate = value;
    }

    /**
     * Obtiene el valor de la propiedad idEvent.
     * 
     */
    public int getIdEvent() {
        return idEvent;
    }

    /**
     * Define el valor de la propiedad idEvent.
     * 
     */
    public void setIdEvent(int value) {
        this.idEvent = value;
    }

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
     * Obtiene el valor de la propiedad idReservation.
     * 
     */
    public int getIdReservation() {
        return idReservation;
    }

    /**
     * Define el valor de la propiedad idReservation.
     * 
     */
    public void setIdReservation(int value) {
        this.idReservation = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     */
    public long getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     */
    public void setStartDate(long value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

}
