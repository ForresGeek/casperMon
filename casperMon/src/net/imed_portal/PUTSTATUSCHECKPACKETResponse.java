
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
 *         &lt;element name="PUT_STATUSCHECK_PACKETResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "putstatuscheckpacketResult"
})
@XmlRootElement(name = "PUT_STATUSCHECK_PACKETResponse")
public class PUTSTATUSCHECKPACKETResponse {

    @XmlElement(name = "PUT_STATUSCHECK_PACKETResult")
    protected boolean putstatuscheckpacketResult;

    /**
     * Gets the value of the putstatuscheckpacketResult property.
     * 
     */
    public boolean isPUTSTATUSCHECKPACKETResult() {
        return putstatuscheckpacketResult;
    }

    /**
     * Sets the value of the putstatuscheckpacketResult property.
     * 
     */
    public void setPUTSTATUSCHECKPACKETResult(boolean value) {
        this.putstatuscheckpacketResult = value;
    }

}
