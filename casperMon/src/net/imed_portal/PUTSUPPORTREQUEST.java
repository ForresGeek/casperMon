
package net.imed_portal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SU_INREFNUM_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SU_SEVERITY_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SU_CONTACT_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SU_EMAIL_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SU_TELNO_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SU_MESSAGE_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "suinrefnumin",
    "suseverityin",
    "sucontactin",
    "suemailin",
    "sutelnoin",
    "sumessagein"
})
@XmlRootElement(name = "PUT_SUPPORT_REQUEST")
public class PUTSUPPORTREQUEST {

    @XmlElement(name = "SU_INREFNUM_IN")
    protected String suinrefnumin;
    @XmlElement(name = "SU_SEVERITY_IN")
    protected String suseverityin;
    @XmlElement(name = "SU_CONTACT_IN")
    protected String sucontactin;
    @XmlElement(name = "SU_EMAIL_IN")
    protected String suemailin;
    @XmlElement(name = "SU_TELNO_IN")
    protected String sutelnoin;
    @XmlElement(name = "SU_MESSAGE_IN")
    protected String sumessagein;

    /**
     * Gets the value of the suinrefnumin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUINREFNUMIN() {
        return suinrefnumin;
    }

    /**
     * Sets the value of the suinrefnumin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUINREFNUMIN(String value) {
        this.suinrefnumin = value;
    }

    /**
     * Gets the value of the suseverityin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUSEVERITYIN() {
        return suseverityin;
    }

    /**
     * Sets the value of the suseverityin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUSEVERITYIN(String value) {
        this.suseverityin = value;
    }

    /**
     * Gets the value of the sucontactin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUCONTACTIN() {
        return sucontactin;
    }

    /**
     * Sets the value of the sucontactin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUCONTACTIN(String value) {
        this.sucontactin = value;
    }

    /**
     * Gets the value of the suemailin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUEMAILIN() {
        return suemailin;
    }

    /**
     * Sets the value of the suemailin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUEMAILIN(String value) {
        this.suemailin = value;
    }

    /**
     * Gets the value of the sutelnoin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUTELNOIN() {
        return sutelnoin;
    }

    /**
     * Sets the value of the sutelnoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUTELNOIN(String value) {
        this.sutelnoin = value;
    }

    /**
     * Gets the value of the sumessagein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUMESSAGEIN() {
        return sumessagein;
    }

    /**
     * Sets the value of the sumessagein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUMESSAGEIN(String value) {
        this.sumessagein = value;
    }

}
