
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
 *         &lt;element name="DISK0_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DISK1_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DISK2_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DISK3_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DISK4_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TEMP_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UPTIME_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PATIENTS_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFERRALS_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFERALLSLASTHOUR_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USERS_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USERSLASTHOUR_IN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inrefnumin",
    "disk0IN",
    "disk1IN",
    "disk2IN",
    "disk3IN",
    "disk4IN",
    "tempin",
    "uptimein",
    "patientsin",
    "referralsin",
    "referallslasthourin",
    "usersin",
    "userslasthourin"
})
@XmlRootElement(name = "PUT_STATUSCHECK_PACKET")
public class PUTSTATUSCHECKPACKET {

    @XmlElement(name = "IN_REFNUM_IN")
    protected String inrefnumin;
    @XmlElement(name = "DISK0_IN")
    protected String disk0IN;
    @XmlElement(name = "DISK1_IN")
    protected String disk1IN;
    @XmlElement(name = "DISK2_IN")
    protected String disk2IN;
    @XmlElement(name = "DISK3_IN")
    protected String disk3IN;
    @XmlElement(name = "DISK4_IN")
    protected String disk4IN;
    @XmlElement(name = "TEMP_IN")
    protected String tempin;
    @XmlElement(name = "UPTIME_IN")
    protected String uptimein;
    @XmlElement(name = "PATIENTS_IN")
    protected String patientsin;
    @XmlElement(name = "REFERRALS_IN")
    protected String referralsin;
    @XmlElement(name = "REFERALLSLASTHOUR_IN")
    protected String referallslasthourin;
    @XmlElement(name = "USERS_IN")
    protected String usersin;
    @XmlElement(name = "USERSLASTHOUR_IN")
    protected String userslasthourin;

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

    /**
     * Gets the value of the disk0IN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISK0IN() {
        return disk0IN;
    }

    /**
     * Sets the value of the disk0IN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISK0IN(String value) {
        this.disk0IN = value;
    }

    /**
     * Gets the value of the disk1IN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISK1IN() {
        return disk1IN;
    }

    /**
     * Sets the value of the disk1IN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISK1IN(String value) {
        this.disk1IN = value;
    }

    /**
     * Gets the value of the disk2IN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISK2IN() {
        return disk2IN;
    }

    /**
     * Sets the value of the disk2IN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISK2IN(String value) {
        this.disk2IN = value;
    }

    /**
     * Gets the value of the disk3IN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISK3IN() {
        return disk3IN;
    }

    /**
     * Sets the value of the disk3IN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISK3IN(String value) {
        this.disk3IN = value;
    }

    /**
     * Gets the value of the disk4IN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISK4IN() {
        return disk4IN;
    }

    /**
     * Sets the value of the disk4IN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISK4IN(String value) {
        this.disk4IN = value;
    }

    /**
     * Gets the value of the tempin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEMPIN() {
        return tempin;
    }

    /**
     * Sets the value of the tempin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEMPIN(String value) {
        this.tempin = value;
    }

    /**
     * Gets the value of the uptimein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPTIMEIN() {
        return uptimein;
    }

    /**
     * Sets the value of the uptimein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPTIMEIN(String value) {
        this.uptimein = value;
    }

    /**
     * Gets the value of the patientsin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPATIENTSIN() {
        return patientsin;
    }

    /**
     * Sets the value of the patientsin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPATIENTSIN(String value) {
        this.patientsin = value;
    }

    /**
     * Gets the value of the referralsin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERRALSIN() {
        return referralsin;
    }

    /**
     * Sets the value of the referralsin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERRALSIN(String value) {
        this.referralsin = value;
    }

    /**
     * Gets the value of the referallslasthourin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERALLSLASTHOURIN() {
        return referallslasthourin;
    }

    /**
     * Sets the value of the referallslasthourin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERALLSLASTHOURIN(String value) {
        this.referallslasthourin = value;
    }

    /**
     * Gets the value of the usersin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERSIN() {
        return usersin;
    }

    /**
     * Sets the value of the usersin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERSIN(String value) {
        this.usersin = value;
    }

    /**
     * Gets the value of the userslasthourin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERSLASTHOURIN() {
        return userslasthourin;
    }

    /**
     * Sets the value of the userslasthourin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERSLASTHOURIN(String value) {
        this.userslasthourin = value;
    }

}
