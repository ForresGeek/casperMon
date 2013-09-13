
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
 *         &lt;element name="US_ID_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PW_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "usidin",
    "pwin"
})
@XmlRootElement(name = "LOGGED_IN")
public class LOGGEDIN {

    @XmlElement(name = "US_ID_IN")
    protected String usidin;
    @XmlElement(name = "PW_IN")
    protected String pwin;

    /**
     * Gets the value of the usidin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSIDIN() {
        return usidin;
    }

    /**
     * Sets the value of the usidin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSIDIN(String value) {
        this.usidin = value;
    }

    /**
     * Gets the value of the pwin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPWIN() {
        return pwin;
    }

    /**
     * Sets the value of the pwin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPWIN(String value) {
        this.pwin = value;
    }

}
