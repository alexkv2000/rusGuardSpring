
package org.datacontract.schemas._2004._07.rusguard;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataOnPresenceInWorkplace complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DataOnPresenceInWorkplace">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActualNumberEmployee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ActualPercentValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="DeparmentGuid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         <element name="TotalNumberEmployee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
public class DataOnPresenceInWorkplace {

    @XmlElement(name = "ActualNumberEmployee", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected Integer actualNumberEmployee;
    @XmlElement(name = "ActualPercentValue", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected Double actualPercentValue;
    @XmlElement(name = "DeparmentGuid", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected String deparmentGuid;
    @XmlElement(name = "TotalNumberEmployee", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected Integer totalNumberEmployee;

    /**
     * Gets the value of the actualNumberEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setTotalNumberEmployee(Integer value) {
        this.totalNumberEmployee = value;
    }

}
