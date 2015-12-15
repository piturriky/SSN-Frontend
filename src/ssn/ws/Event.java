
package ssn.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para event complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idCreator" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idEvent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idSport" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="managerEntities" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maxPlayers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="minPlayers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="range" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "event", propOrder = {
    "city",
    "endDate",
    "idCreator",
    "idEvent",
    "idSport",
    "latitude",
    "longitude",
    "managerEntities",
    "maxPlayers",
    "maxPrice",
    "minPlayers",
    "range",
    "startDate"
})
public class Event {

    protected String city;
    protected long endDate;
    protected int idCreator;
    protected int idEvent;
    protected int idSport;
    protected double latitude;
    protected double longitude;
    @XmlElement(nillable = true)
    protected List<Integer> managerEntities;
    protected int maxPlayers;
    protected double maxPrice;
    protected int minPlayers;
    protected int range;
    protected long startDate;

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
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
     * Obtiene el valor de la propiedad idCreator.
     * 
     */
    public int getIdCreator() {
        return idCreator;
    }

    /**
     * Define el valor de la propiedad idCreator.
     * 
     */
    public void setIdCreator(int value) {
        this.idCreator = value;
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
     * Obtiene el valor de la propiedad latitude.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Define el valor de la propiedad latitude.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Obtiene el valor de la propiedad longitude.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Define el valor de la propiedad longitude.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the managerEntities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managerEntities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagerEntities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getManagerEntities() {
        if (managerEntities == null) {
            managerEntities = new ArrayList<Integer>();
        }
        return this.managerEntities;
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
     * Obtiene el valor de la propiedad maxPrice.
     * 
     */
    public double getMaxPrice() {
        return maxPrice;
    }

    /**
     * Define el valor de la propiedad maxPrice.
     * 
     */
    public void setMaxPrice(double value) {
        this.maxPrice = value;
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
     * Obtiene el valor de la propiedad range.
     * 
     */
    public int getRange() {
        return range;
    }

    /**
     * Define el valor de la propiedad range.
     * 
     */
    public void setRange(int value) {
        this.range = value;
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

}
