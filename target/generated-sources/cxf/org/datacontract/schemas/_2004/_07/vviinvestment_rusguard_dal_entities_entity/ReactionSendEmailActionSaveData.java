
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
 * <p>Java class for ReactionSendEmailActionSaveData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="ReactionSendEmailActionSaveData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailDistributionAddressId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="NumbersToSendEmailForEmployeesFromEvents" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="NumbersToSendEmailForEmployeesFromList" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="SendCustomText" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SendToAllEmailAddressesOfEmployeesFromEvents" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SendToAllEmailAddressesOfEmployeesFromList" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "ReactionSendEmailActionSaveData", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", propOrder = {
    "customText",
    "emailDistributionAddressId",
    "numbersToSendEmailForEmployeesFromEvents",
    "numbersToSendEmailForEmployeesFromList",
    "sendCustomText",
    "sendToAllEmailAddressesOfEmployeesFromEvents",
    "sendToAllEmailAddressesOfEmployeesFromList",
    "whetherToSendEmployeesFromEvents",
    "whetherToSendEmployeesFromList"
})
@XmlSeeAlso({
    ReactionSendEmailActionSlimInfo.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
public class ReactionSendEmailActionSaveData {

    @XmlElementRef(name = "CustomText", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected JAXBElement<String> customText;
    @XmlElementRef(name = "EmailDistributionAddressId", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected JAXBElement<String> emailDistributionAddressId;
    @XmlElementRef(name = "NumbersToSendEmailForEmployeesFromEvents", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected JAXBElement<ArrayOfint> numbersToSendEmailForEmployeesFromEvents;
    @XmlElementRef(name = "NumbersToSendEmailForEmployeesFromList", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected JAXBElement<ArrayOfint> numbersToSendEmailForEmployeesFromList;
    @XmlElement(name = "SendCustomText", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected Boolean sendCustomText;
    @XmlElement(name = "SendToAllEmailAddressesOfEmployeesFromEvents", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected Boolean sendToAllEmailAddressesOfEmployeesFromEvents;
    @XmlElement(name = "SendToAllEmailAddressesOfEmployeesFromList", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected Boolean sendToAllEmailAddressesOfEmployeesFromList;
    @XmlElement(name = "WhetherToSendEmployeesFromEvents", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected Boolean whetherToSendEmployeesFromEvents;
    @XmlElement(name = "WhetherToSendEmployeesFromList", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected Boolean whetherToSendEmployeesFromList;

    /**
     * Gets the value of the customText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setCustomText(JAXBElement<String> value) {
        this.customText = value;
    }

    /**
     * Gets the value of the emailDistributionAddressId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public JAXBElement<String> getEmailDistributionAddressId() {
        return emailDistributionAddressId;
    }

    /**
     * Sets the value of the emailDistributionAddressId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setEmailDistributionAddressId(JAXBElement<String> value) {
        this.emailDistributionAddressId = value;
    }

    /**
     * Gets the value of the numbersToSendEmailForEmployeesFromEvents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public JAXBElement<ArrayOfint> getNumbersToSendEmailForEmployeesFromEvents() {
        return numbersToSendEmailForEmployeesFromEvents;
    }

    /**
     * Sets the value of the numbersToSendEmailForEmployeesFromEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setNumbersToSendEmailForEmployeesFromEvents(JAXBElement<ArrayOfint> value) {
        this.numbersToSendEmailForEmployeesFromEvents = value;
    }

    /**
     * Gets the value of the numbersToSendEmailForEmployeesFromList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public JAXBElement<ArrayOfint> getNumbersToSendEmailForEmployeesFromList() {
        return numbersToSendEmailForEmployeesFromList;
    }

    /**
     * Sets the value of the numbersToSendEmailForEmployeesFromList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setNumbersToSendEmailForEmployeesFromList(JAXBElement<ArrayOfint> value) {
        this.numbersToSendEmailForEmployeesFromList = value;
    }

    /**
     * Gets the value of the sendCustomText property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setSendCustomText(Boolean value) {
        this.sendCustomText = value;
    }

    /**
     * Gets the value of the sendToAllEmailAddressesOfEmployeesFromEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public Boolean isSendToAllEmailAddressesOfEmployeesFromEvents() {
        return sendToAllEmailAddressesOfEmployeesFromEvents;
    }

    /**
     * Sets the value of the sendToAllEmailAddressesOfEmployeesFromEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setSendToAllEmailAddressesOfEmployeesFromEvents(Boolean value) {
        this.sendToAllEmailAddressesOfEmployeesFromEvents = value;
    }

    /**
     * Gets the value of the sendToAllEmailAddressesOfEmployeesFromList property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public Boolean isSendToAllEmailAddressesOfEmployeesFromList() {
        return sendToAllEmailAddressesOfEmployeesFromList;
    }

    /**
     * Sets the value of the sendToAllEmailAddressesOfEmployeesFromList property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setSendToAllEmailAddressesOfEmployeesFromList(Boolean value) {
        this.sendToAllEmailAddressesOfEmployeesFromList = value;
    }

    /**
     * Gets the value of the whetherToSendEmployeesFromEvents property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setWhetherToSendEmployeesFromList(Boolean value) {
        this.whetherToSendEmployeesFromList = value;
    }

}
