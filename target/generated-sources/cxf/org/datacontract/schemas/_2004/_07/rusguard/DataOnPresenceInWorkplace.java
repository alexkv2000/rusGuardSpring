
package org.datacontract.schemas._2004._07.rusguard;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataOnPresenceInWorkplace complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="DataOnPresenceInWorkplace"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualNumberEmployee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActualPercentValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DeparmentGuid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="TotalNumberEmployee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataOnPresenceInWorkplace", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", propOrder = {
    "actualNumberEmployee",
    "actualPercentValue",
    "deparmentGuid",
    "totalNumberEmployee"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public class DataOnPresenceInWorkplace {

    @XmlElement(name = "ActualNumberEmployee", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Integer actualNumberEmployee;
    @XmlElement(name = "ActualPercentValue", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Double actualPercentValue;
    @XmlElement(name = "DeparmentGuid", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected String deparmentGuid;
    @XmlElement(name = "TotalNumberEmployee", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Integer totalNumberEmployee;

    /**
     * Gets the value of the actualNumberEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Integer getActualNumberEmployee() {
        return actualNumberEmployee;
    }

    /**
     * Sets the value of the actualNumberEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setActualNumberEmployee(Integer value) {
        this.actualNumberEmployee = value;
    }

    /**
     * Gets the value of the actualPercentValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Double getActualPercentValue() {
        return actualPercentValue;
    }

    /**
     * Sets the value of the actualPercentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setActualPercentValue(Double value) {
        this.actualPercentValue = value;
    }

    /**
     * Gets the value of the deparmentGuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public String getDeparmentGuid() {
        return deparmentGuid;
    }

    /**
     * Sets the value of the deparmentGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setDeparmentGuid(String value) {
        this.deparmentGuid = value;
    }

    /**
     * Gets the value of the totalNumberEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Integer getTotalNumberEmployee() {
        return totalNumberEmployee;
    }

    /**
     * Sets the value of the totalNumberEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setTotalNumberEmployee(Integer value) {
        this.totalNumberEmployee = value;
    }

}
