
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
 *         &lt;element name="GET_HEARTBEAT_FREQUENCYResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getheartbeatfrequencyResult"
})
@XmlRootElement(name = "GET_HEARTBEAT_FREQUENCYResponse")
public class GETHEARTBEATFREQUENCYResponse {

    @XmlElement(name = "GET_HEARTBEAT_FREQUENCYResult")
    protected int getheartbeatfrequencyResult;

    /**
     * Gets the value of the getheartbeatfrequencyResult property.
     * 
     */
    public int getGETHEARTBEATFREQUENCYResult() {
        return getheartbeatfrequencyResult;
    }

    /**
     * Sets the value of the getheartbeatfrequencyResult property.
     * 
     */
    public void setGETHEARTBEATFREQUENCYResult(int value) {
        this.getheartbeatfrequencyResult = value;
    }

}
