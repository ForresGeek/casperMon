
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
 *         &lt;element name="PUT_SUPPORT_REQUESTResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "putsupportrequestResult"
})
@XmlRootElement(name = "PUT_SUPPORT_REQUESTResponse")
public class PUTSUPPORTREQUESTResponse {

    @XmlElement(name = "PUT_SUPPORT_REQUESTResult")
    protected boolean putsupportrequestResult;

    /**
     * Gets the value of the putsupportrequestResult property.
     * 
     */
    public boolean isPUTSUPPORTREQUESTResult() {
        return putsupportrequestResult;
    }

    /**
     * Sets the value of the putsupportrequestResult property.
     * 
     */
    public void setPUTSUPPORTREQUESTResult(boolean value) {
        this.putsupportrequestResult = value;
    }

}
