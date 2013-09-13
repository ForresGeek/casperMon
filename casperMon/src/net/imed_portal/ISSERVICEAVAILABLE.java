
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
 *         &lt;element name="IN_REFNUM_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inrefnumin"
})
@XmlRootElement(name = "IS_SERVICE_AVAILABLE")
public class ISSERVICEAVAILABLE {

    @XmlElement(name = "IN_REFNUM_IN")
    protected String inrefnumin;

    /**
     * Gets the value of the inrefnumin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINREFNUMIN() {
        return inrefnumin;
    }

    /**
     * Sets the value of the inrefnumin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINREFNUMIN(String value) {
        this.inrefnumin = value;
    }

}
