
package ssn.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para createEvent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="createEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg4" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="arg5" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="arg6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arg7" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="arg8" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="arg9" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="arg10" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createEvent", propOrder = {
    "arg0",
    "arg1",
    "arg2",
    "arg3",
    "arg4",
    "arg5",
    "arg6",
    "arg7",
    "arg8",
    "arg9",
    "arg10"
})
public class CreateEvent {

    protected int arg0;
    protected int arg1;
    protected int arg2;
    protected int arg3;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arg4;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arg5;
    protected String arg6;
    protected float arg7;
    protected float arg8;
    protected int arg9;
    @XmlElement(type = Integer.class)
    protected List<Integer> arg10;

    /**
     * Obtiene el valor de la propiedad arg0.
     * 
     */
    public int getArg0() {
        return arg0;
    }

    /**
     * Define el valor de la propiedad arg0.
     * 
     */
    public void setArg0(int value) {
        this.arg0 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg1.
     * 
     */
    public int getArg1() {
        return arg1;
    }

    /**
     * Define el valor de la propiedad arg1.
     * 
     */
    public void setArg1(int value) {
        this.arg1 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg2.
     * 
     */
    public int getArg2() {
        return arg2;
    }

    /**
     * Define el valor de la propiedad arg2.
     * 
     */
    public void setArg2(int value) {
        this.arg2 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg3.
     * 
     */
    public int getArg3() {
        return arg3;
    }

    /**
     * Define el valor de la propiedad arg3.
     * 
     */
    public void setArg3(int value) {
        this.arg3 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg4.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArg4() {
        return arg4;
    }

    /**
     * Define el valor de la propiedad arg4.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArg4(XMLGregorianCalendar value) {
        this.arg4 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg5.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArg5() {
        return arg5;
    }

    /**
     * Define el valor de la propiedad arg5.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArg5(XMLGregorianCalendar value) {
        this.arg5 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg6() {
        return arg6;
    }

    /**
     * Define el valor de la propiedad arg6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg6(String value) {
        this.arg6 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg7.
     * 
     */
    public float getArg7() {
        return arg7;
    }

    /**
     * Define el valor de la propiedad arg7.
     * 
     */
    public void setArg7(float value) {
        this.arg7 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg8.
     * 
     */
    public float getArg8() {
        return arg8;
    }

    /**
     * Define el valor de la propiedad arg8.
     * 
     */
    public void setArg8(float value) {
        this.arg8 = value;
    }

    /**
     * Obtiene el valor de la propiedad arg9.
     * 
     */
    public int getArg9() {
        return arg9;
    }

    /**
     * Define el valor de la propiedad arg9.
     * 
     */
    public void setArg9(int value) {
        this.arg9 = value;
    }

    /**
     * Gets the value of the arg10 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arg10 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArg10().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getArg10() {
        if (arg10 == null) {
            arg10 = new ArrayList<Integer>();
        }
        return this.arg10;
    }

}
