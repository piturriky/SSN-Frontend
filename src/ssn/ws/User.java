
package ssn.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para user complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentAccount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surname1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surname2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "currentAccount",
    "email",
    "id",
    "name",
    "surname1",
    "surname2",
    "telephone",
    "type",
    "username"
})
public class User {

    protected int currentAccount;
    protected String email;
    protected int id;
    protected String name;
    protected String surname1;
    protected String surname2;
    protected int telephone;
    protected int type;
    protected String username;

    /**
     * Obtiene el valor de la propiedad currentAccount.
     * 
     */
    public int getCurrentAccount() {
        return currentAccount;
    }

    /**
     * Define el valor de la propiedad currentAccount.
     * 
     */
    public void setCurrentAccount(int value) {
        this.currentAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * Obtiene el valor de la propiedad surname1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname1() {
        return surname1;
    }

    /**
     * Define el valor de la propiedad surname1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname1(String value) {
        this.surname1 = value;
    }

    /**
     * Obtiene el valor de la propiedad surname2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname2() {
        return surname2;
    }

    /**
     * Define el valor de la propiedad surname2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname2(String value) {
        this.surname2 = value;
    }

    /**
     * Obtiene el valor de la propiedad telephone.
     * 
     */
    public int getTelephone() {
        return telephone;
    }

    /**
     * Define el valor de la propiedad telephone.
     * 
     */
    public void setTelephone(int value) {
        this.telephone = value;
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

    /**
     * Obtiene el valor de la propiedad username.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Define el valor de la propiedad username.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
