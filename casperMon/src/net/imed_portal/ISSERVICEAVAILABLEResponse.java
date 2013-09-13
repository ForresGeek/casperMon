
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
 *         &lt;element name="IS_SERVICE_AVAILABLEResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isserviceavailableResult"
})
@XmlRootElement(name = "IS_SERVICE_AVAILABLEResponse")
public class ISSERVICEAVAILABLEResponse {

    @XmlElement(name = "IS_SERVICE_AVAILABLEResult")
    protected boolean isserviceavailableResult;

    /**
     * Gets the value of the isserviceavailableResult property.
     * 
     */
    public boolean isISSERVICEAVAILABLEResult() {
        return isserviceavailableResult;
    }

    /**
     * Sets the value of the isserviceavailableResult property.
     * 
     */
    public void setISSERVICEAVAILABLEResult(boolean value) {
        this.isserviceavailableResult = value;
    }

}
