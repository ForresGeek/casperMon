
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
 *         &lt;element name="IS_REPORTING_AVAILABLEResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "isreportingavailableResult"
})
@XmlRootElement(name = "IS_REPORTING_AVAILABLEResponse")
public class ISREPORTINGAVAILABLEResponse {

    @XmlElement(name = "IS_REPORTING_AVAILABLEResult")
    protected boolean isreportingavailableResult;

    /**
     * Gets the value of the isreportingavailableResult property.
     * 
     */
    public boolean isISREPORTINGAVAILABLEResult() {
        return isreportingavailableResult;
    }

    /**
     * Sets the value of the isreportingavailableResult property.
     * 
     */
    public void setISREPORTINGAVAILABLEResult(boolean value) {
        this.isreportingavailableResult = value;
    }

}
