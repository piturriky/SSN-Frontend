
package ssn.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para report complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="report">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="idField" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idReport" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idReportType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idReporter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "report", propOrder = {
    "comment",
    "date",
    "idField",
    "idReport",
    "idReportType",
    "idReporter",
    "idUser"
})
public class Report {

    protected String comment;
    protected long date;
    protected int idField;
    protected int idReport;
    protected int idReportType;
    protected int idReporter;
    protected int idUser;

    /**
     * Obtiene el valor de la propiedad comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Define el valor de la propiedad comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     * 
     */
    public long getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     */
    public void setDate(long value) {
        this.date = value;
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
     * Obtiene el valor de la propiedad idReport.
     * 
     */
    public int getIdReport() {
        return idReport;
    }

    /**
     * Define el valor de la propiedad idReport.
     * 
     */
    public void setIdReport(int value) {
        this.idReport = value;
    }

    /**
     * Obtiene el valor de la propiedad idReportType.
     * 
     */
    public int getIdReportType() {
        return idReportType;
    }

    /**
     * Define el valor de la propiedad idReportType.
     * 
     */
    public void setIdReportType(int value) {
        this.idReportType = value;
    }

    /**
     * Obtiene el valor de la propiedad idReporter.
     * 
     */
    public int getIdReporter() {
        return idReporter;
    }

    /**
     * Define el valor de la propiedad idReporter.
     * 
     */
    public void setIdReporter(int value) {
        this.idReporter = value;
    }

    /**
     * Obtiene el valor de la propiedad idUser.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Define el valor de la propiedad idUser.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
    }

}
