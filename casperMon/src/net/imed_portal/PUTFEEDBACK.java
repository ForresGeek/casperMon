
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
 *         &lt;element name="FB_INREFNUM_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FB_CONTACT_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FB_EMAIL_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FB_MESSAGE_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FB_TELNO_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "fbinrefnumin",
    "fbcontactin",
    "fbemailin",
    "fbmessagein",
    "fbtelnoin"
})
@XmlRootElement(name = "PUT_FEEDBACK")
public class PUTFEEDBACK {

    @XmlElement(name = "FB_INREFNUM_IN")
    protected String fbinrefnumin;
    @XmlElement(name = "FB_CONTACT_IN")
    protected String fbcontactin;
    @XmlElement(name = "FB_EMAIL_IN")
    protected String fbemailin;
    @XmlElement(name = "FB_MESSAGE_IN")
    protected String fbmessagein;
    @XmlElement(name = "FB_TELNO_IN")
    protected String fbtelnoin;

    /**
     * Gets the value of the fbinrefnumin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBINREFNUMIN() {
        return fbinrefnumin;
    }

    /**
     * Sets the value of the fbinrefnumin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBINREFNUMIN(String value) {
        this.fbinrefnumin = value;
    }

    /**
     * Gets the value of the fbcontactin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBCONTACTIN() {
        return fbcontactin;
    }

    /**
     * Sets the value of the fbcontactin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBCONTACTIN(String value) {
        this.fbcontactin = value;
    }

    /**
     * Gets the value of the fbemailin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBEMAILIN() {
        return fbemailin;
    }

    /**
     * Sets the value of the fbemailin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBEMAILIN(String value) {
        this.fbemailin = value;
    }

    /**
     * Gets the value of the fbmessagein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBMESSAGEIN() {
        return fbmessagein;
    }

    /**
     * Sets the value of the fbmessagein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBMESSAGEIN(String value) {
        this.fbmessagein = value;
    }

    /**
     * Gets the value of the fbtelnoin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBTELNOIN() {
        return fbtelnoin;
    }

    /**
     * Sets the value of the fbtelnoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBTELNOIN(String value) {
        this.fbtelnoin = value;
    }

}
