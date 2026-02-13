
package org.datacontract.schemas._2004._07.rusguard;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataForPeriodModel complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="DataForPeriodModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualNumberEmployee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActualPercentValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="DeparmentGuid" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="EvaluationSystem" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MessageError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfEmployees" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlanNumberEmployee" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlanPercentValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="VType" type="{http://schemas.datacontract.org/2004/07/RusGuard.Models}ViolationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataForPeriodModel", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", propOrder = {
    "actualNumberEmployee",
    "actualPercentValue",
    "deparmentGuid",
    "evaluationSystem",
    "messageError",
    "numberOfEmployees",
    "planNumberEmployee",
    "planPercentValue",
    "vType"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
public class DataForPeriodModel {

    @XmlElement(name = "ActualNumberEmployee", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    protected Integer actualNumberEmployee;
    @XmlElement(name = "ActualPercentValue", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    protected Double actualPercentValue;
    @XmlElement(name = "DeparmentGuid", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    protected String deparmentGuid;
    @XmlElementRef(name = "EvaluationSystem", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    protected JAXBElement<Integer> evaluationSystem;
    @XmlElementRef(name = "MessageError", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    protected JAXBElement<String> messageError;
    @XmlElement(name = "NumberOfEmployees", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    protected Integer numberOfEmployees;
    @XmlElement(name = "PlanNumberEmployee", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    protected Integer planNumberEmployee;
    @XmlElement(name = "PlanPercentValue", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    protected Double planPercentValue;
    @XmlElement(name = "VType", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    protected ViolationType vType;

    /**
     * Gets the value of the actualNumberEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public void setDeparmentGuid(String value) {
        this.deparmentGuid = value;
    }

    /**
     * Gets the value of the evaluationSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public JAXBElement<Integer> getEvaluationSystem() {
        return evaluationSystem;
    }

    /**
     * Sets the value of the evaluationSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public void setEvaluationSystem(JAXBElement<Integer> value) {
        this.evaluationSystem = value;
    }

    /**
     * Gets the value of the messageError property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public JAXBElement<String> getMessageError() {
        return messageError;
    }

    /**
     * Sets the value of the messageError property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public void setMessageError(JAXBElement<String> value) {
        this.messageError = value;
    }

    /**
     * Gets the value of the numberOfEmployees property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * Sets the value of the numberOfEmployees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public void setNumberOfEmployees(Integer value) {
        this.numberOfEmployees = value;
    }

    /**
     * Gets the value of the planNumberEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public Integer getPlanNumberEmployee() {
        return planNumberEmployee;
    }

    /**
     * Sets the value of the planNumberEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public void setPlanNumberEmployee(Integer value) {
        this.planNumberEmployee = value;
    }

    /**
     * Gets the value of the planPercentValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public Double getPlanPercentValue() {
        return planPercentValue;
    }

    /**
     * Sets the value of the planPercentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public void setPlanPercentValue(Double value) {
        this.planPercentValue = value;
    }

    /**
     * Gets the value of the vType property.
     * 
     * @return
     *     possible object is
     *     {@link ViolationType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public ViolationType getVType() {
        return vType;
    }

    /**
     * Sets the value of the vType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ViolationType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public void setVType(ViolationType value) {
        this.vType = value;
    }

}
