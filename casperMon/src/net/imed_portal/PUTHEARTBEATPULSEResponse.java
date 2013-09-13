
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
 *         &lt;element name="PUT_HEARTBEAT_PULSEResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "putheartbeatpulseResult"
})
@XmlRootElement(name = "PUT_HEARTBEAT_PULSEResponse")
public class PUTHEARTBEATPULSEResponse {

    @XmlElement(name = "PUT_HEARTBEAT_PULSEResult")
    protected boolean putheartbeatpulseResult;

    /**
     * Gets the value of the putheartbeatpulseResult property.
     * 
     */
    public boolean isPUTHEARTBEATPULSEResult() {
        return putheartbeatpulseResult;
    }

    /**
     * Sets the value of the putheartbeatpulseResult property.
     * 
     */
    public void setPUTHEARTBEATPULSEResult(boolean value) {
        this.putheartbeatpulseResult = value;
    }

}
