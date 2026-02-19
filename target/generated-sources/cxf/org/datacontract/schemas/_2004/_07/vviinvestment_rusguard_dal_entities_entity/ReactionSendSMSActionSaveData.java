
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;


/**
 * <p>Java class for ReactionSendSMSActionSaveData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="ReactionSendSMSActionSaveData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GsmModemDriverId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="NumbersToSendSMSForEmployeesFromEvents" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="NumbersToSendSMSForEmployeesFromList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="SendCustomText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SendToAllPhoneNumbersOfEmployeesFromEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SendToAllPhoneNumbersOfEmployeesFromList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WhetherToSendEmployeesFromEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WhetherToSendEmployeesFromList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReactionSendSMSActionSaveData", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", propOrder = {
    "customText",
    "gsmModemDriverId",
    "numbersToSendSMSForEmployeesFromEvents",
    "numbersToSendSMSForEmployeesFromList",
    "sendCustomText",
    "sendToAllPhoneNumbersOfEmployeesFromEvents",
    "sendToAllPhoneNumbersOfEmployeesFromList",
    "whetherToSendEmployeesFromEvents",
    "whetherToSendEmployeesFromList"
})
@XmlSeeAlso({
    ReactionSendSMSActionSlimInfo.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public class ReactionSendSMSActionSaveData {

    @XmlElementRef(name = "CustomText", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected JAXBElement<String> customText;
    @XmlElementRef(name = "GsmModemDriverId", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected JAXBElement<String> gsmModemDriverId;
    @XmlElementRef(name = "NumbersToSendSMSForEmployeesFromEvents", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected JAXBElement<ArrayOfint> numbersToSendSMSForEmployeesFromEvents;
    @XmlElementRef(name = "NumbersToSendSMSForEmployeesFromList", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected JAXBElement<ArrayOfint> numbersToSendSMSForEmployeesFromList;
    @XmlElement(name = "SendCustomText", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Boolean sendCustomText;
    @XmlElement(name = "SendToAllPhoneNumbersOfEmployeesFromEvents", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Boolean sendToAllPhoneNumbersOfEmployeesFromEvents;
    @XmlElement(name = "SendToAllPhoneNumbersOfEmployeesFromList", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Boolean sendToAllPhoneNumbersOfEmployeesFromList;
    @XmlElement(name = "WhetherToSendEmployeesFromEvents", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Boolean whetherToSendEmployeesFromEvents;
    @XmlElement(name = "WhetherToSendEmployeesFromList", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Boolean whetherToSendEmployeesFromList;

    /**
     * Gets the value of the customText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public JAXBElement<String> getCustomText() {
        return customText;
    }

    /**
     * Sets the value of the customText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setCustomText(JAXBElement<String> value) {
        this.customText = value;
    }

    /**
     * Gets the value of the gsmModemDriverId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public JAXBElement<String> getGsmModemDriverId() {
        return gsmModemDriverId;
    }

    /**
     * Sets the value of the gsmModemDriverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setGsmModemDriverId(JAXBElement<String> value) {
        this.gsmModemDriverId = value;
    }

    /**
     * Gets the value of the numbersToSendSMSForEmployeesFromEvents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public JAXBElement<ArrayOfint> getNumbersToSendSMSForEmployeesFromEvents() {
        return numbersToSendSMSForEmployeesFromEvents;
    }

    /**
     * Sets the value of the numbersToSendSMSForEmployeesFromEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setNumbersToSendSMSForEmployeesFromEvents(JAXBElement<ArrayOfint> value) {
        this.numbersToSendSMSForEmployeesFromEvents = value;
    }

    /**
     * Gets the value of the numbersToSendSMSForEmployeesFromList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public JAXBElement<ArrayOfint> getNumbersToSendSMSForEmployeesFromList() {
        return numbersToSendSMSForEmployeesFromList;
    }

    /**
     * Sets the value of the numbersToSendSMSForEmployeesFromList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setNumbersToSendSMSForEmployeesFromList(JAXBElement<ArrayOfint> value) {
        this.numbersToSendSMSForEmployeesFromList = value;
    }

    /**
     * Gets the value of the sendCustomText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Boolean isSendCustomText() {
        return sendCustomText;
    }

    /**
     * Sets the value of the sendCustomText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setSendCustomText(Boolean value) {
        this.sendCustomText = value;
    }

    /**
     * Gets the value of the sendToAllPhoneNumbersOfEmployeesFromEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Boolean isSendToAllPhoneNumbersOfEmployeesFromEvents() {
        return sendToAllPhoneNumbersOfEmployeesFromEvents;
    }

    /**
     * Sets the value of the sendToAllPhoneNumbersOfEmployeesFromEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setSendToAllPhoneNumbersOfEmployeesFromEvents(Boolean value) {
        this.sendToAllPhoneNumbersOfEmployeesFromEvents = value;
    }

    /**
     * Gets the value of the sendToAllPhoneNumbersOfEmployeesFromList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Boolean isSendToAllPhoneNumbersOfEmployeesFromList() {
        return sendToAllPhoneNumbersOfEmployeesFromList;
    }

    /**
     * Sets the value of the sendToAllPhoneNumbersOfEmployeesFromList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setSendToAllPhoneNumbersOfEmployeesFromList(Boolean value) {
        this.sendToAllPhoneNumbersOfEmployeesFromList = value;
    }

    /**
     * Gets the value of the whetherToSendEmployeesFromEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Boolean isWhetherToSendEmployeesFromEvents() {
        return whetherToSendEmployeesFromEvents;
    }

    /**
     * Sets the value of the whetherToSendEmployeesFromEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setWhetherToSendEmployeesFromEvents(Boolean value) {
        this.whetherToSendEmployeesFromEvents = value;
    }

    /**
     * Gets the value of the whetherToSendEmployeesFromList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Boolean isWhetherToSendEmployeesFromList() {
        return whetherToSendEmployeesFromList;
    }

    /**
     * Sets the value of the whetherToSendEmployeesFromList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setWhetherToSendEmployeesFromList(Boolean value) {
        this.whetherToSendEmployeesFromList = value;
    }

}
