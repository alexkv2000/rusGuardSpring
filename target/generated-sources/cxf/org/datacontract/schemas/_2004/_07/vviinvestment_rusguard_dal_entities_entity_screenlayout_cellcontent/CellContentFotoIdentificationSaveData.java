
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_screenlayout_cellcontent;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CellContentFotoIdentificationSaveData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="CellContentFotoIdentificationSaveData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessPointDriverId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="AgeLimitation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AgeLimitationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="AutoAllowEntryTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="AutoAllowExitTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ColorFieldID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="DecisionHotKey" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DecisionHotKeyCancel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DecisionHotKeyModifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DecisionHotKeyModifierCancel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EnableOperatorDecisionEntryState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableOperatorDecisionExitState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableOperatorReactionTimeEntry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EnableOperatorReactionTimeExit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="HidePhotoAfterTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsAutoAllowEntry" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsAutoAllowExit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsHidePhotoAfterTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PersonalData" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification}ArrayOfPhotoidentificationPersonalData" minOccurs="0"/&gt;
 *         &lt;element name="PhotoContentId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *         &lt;element name="ShowOnOffButtonEnterPermitMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowOnOffButtonExitPermitMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowPersonalData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ShowPreviousVisitorMode" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification}ShowPreviousVisitorMode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellContentFotoIdentificationSaveData", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification", propOrder = {
    "accessPointDriverId",
    "ageLimitation",
    "ageLimitationEnabled",
    "autoAllowEntryTime",
    "autoAllowExitTime",
    "colorFieldID",
    "decisionHotKey",
    "decisionHotKeyCancel",
    "decisionHotKeyModifier",
    "decisionHotKeyModifierCancel",
    "enableOperatorDecisionEntryState",
    "enableOperatorDecisionExitState",
    "enableOperatorReactionTimeEntry",
    "enableOperatorReactionTimeExit",
    "hidePhotoAfterTime",
    "isAutoAllowEntry",
    "isAutoAllowExit",
    "isHidePhotoAfterTime",
    "personalData",
    "photoContentId",
    "showOnOffButtonEnterPermitMode",
    "showOnOffButtonExitPermitMode",
    "showPersonalData",
    "showPreviousVisitorMode"
})
@XmlSeeAlso({
    CellContentFotoIdentificationInfo.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public class CellContentFotoIdentificationSaveData {

    @XmlElementRef(name = "AccessPointDriverId", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected JAXBElement<String> accessPointDriverId;
    @XmlElement(name = "AgeLimitation", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Integer ageLimitation;
    @XmlElement(name = "AgeLimitationEnabled", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Boolean ageLimitationEnabled;
    @XmlElement(name = "AutoAllowEntryTime", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Integer autoAllowEntryTime;
    @XmlElement(name = "AutoAllowExitTime", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Integer autoAllowExitTime;
    @XmlElementRef(name = "ColorFieldID", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected JAXBElement<String> colorFieldID;
    @XmlElementRef(name = "DecisionHotKey", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected JAXBElement<Integer> decisionHotKey;
    @XmlElementRef(name = "DecisionHotKeyCancel", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected JAXBElement<Integer> decisionHotKeyCancel;
    @XmlElementRef(name = "DecisionHotKeyModifier", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected JAXBElement<Integer> decisionHotKeyModifier;
    @XmlElementRef(name = "DecisionHotKeyModifierCancel", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected JAXBElement<Integer> decisionHotKeyModifierCancel;
    @XmlElement(name = "EnableOperatorDecisionEntryState", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Boolean enableOperatorDecisionEntryState;
    @XmlElement(name = "EnableOperatorDecisionExitState", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Boolean enableOperatorDecisionExitState;
    @XmlElement(name = "EnableOperatorReactionTimeEntry", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Boolean enableOperatorReactionTimeEntry;
    @XmlElement(name = "EnableOperatorReactionTimeExit", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Boolean enableOperatorReactionTimeExit;
    @XmlElement(name = "HidePhotoAfterTime", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Integer hidePhotoAfterTime;
    @XmlElement(name = "IsAutoAllowEntry", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Boolean isAutoAllowEntry;
    @XmlElement(name = "IsAutoAllowExit", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Boolean isAutoAllowExit;
    @XmlElement(name = "IsHidePhotoAfterTime", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Boolean isHidePhotoAfterTime;
    @XmlElementRef(name = "PersonalData", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected JAXBElement<ArrayOfPhotoidentificationPersonalData> personalData;
    @XmlElementRef(name = "PhotoContentId", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected JAXBElement<String> photoContentId;
    @XmlElement(name = "ShowOnOffButtonEnterPermitMode", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Boolean showOnOffButtonEnterPermitMode;
    @XmlElement(name = "ShowOnOffButtonExitPermitMode", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Boolean showOnOffButtonExitPermitMode;
    @XmlElement(name = "ShowPersonalData", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Boolean showPersonalData;
    @XmlElement(name = "ShowPreviousVisitorMode", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected ShowPreviousVisitorMode showPreviousVisitorMode;

    /**
     * Gets the value of the accessPointDriverId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public JAXBElement<String> getAccessPointDriverId() {
        return accessPointDriverId;
    }

    /**
     * Sets the value of the accessPointDriverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setAccessPointDriverId(JAXBElement<String> value) {
        this.accessPointDriverId = value;
    }

    /**
     * Gets the value of the ageLimitation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Integer getAgeLimitation() {
        return ageLimitation;
    }

    /**
     * Sets the value of the ageLimitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setAgeLimitation(Integer value) {
        this.ageLimitation = value;
    }

    /**
     * Gets the value of the ageLimitationEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Boolean isAgeLimitationEnabled() {
        return ageLimitationEnabled;
    }

    /**
     * Sets the value of the ageLimitationEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setAgeLimitationEnabled(Boolean value) {
        this.ageLimitationEnabled = value;
    }

    /**
     * Gets the value of the autoAllowEntryTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Integer getAutoAllowEntryTime() {
        return autoAllowEntryTime;
    }

    /**
     * Sets the value of the autoAllowEntryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setAutoAllowEntryTime(Integer value) {
        this.autoAllowEntryTime = value;
    }

    /**
     * Gets the value of the autoAllowExitTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Integer getAutoAllowExitTime() {
        return autoAllowExitTime;
    }

    /**
     * Sets the value of the autoAllowExitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setAutoAllowExitTime(Integer value) {
        this.autoAllowExitTime = value;
    }

    /**
     * Gets the value of the colorFieldID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public JAXBElement<String> getColorFieldID() {
        return colorFieldID;
    }

    /**
     * Sets the value of the colorFieldID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setColorFieldID(JAXBElement<String> value) {
        this.colorFieldID = value;
    }

    /**
     * Gets the value of the decisionHotKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public JAXBElement<Integer> getDecisionHotKey() {
        return decisionHotKey;
    }

    /**
     * Sets the value of the decisionHotKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setDecisionHotKey(JAXBElement<Integer> value) {
        this.decisionHotKey = value;
    }

    /**
     * Gets the value of the decisionHotKeyCancel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public JAXBElement<Integer> getDecisionHotKeyCancel() {
        return decisionHotKeyCancel;
    }

    /**
     * Sets the value of the decisionHotKeyCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setDecisionHotKeyCancel(JAXBElement<Integer> value) {
        this.decisionHotKeyCancel = value;
    }

    /**
     * Gets the value of the decisionHotKeyModifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public JAXBElement<Integer> getDecisionHotKeyModifier() {
        return decisionHotKeyModifier;
    }

    /**
     * Sets the value of the decisionHotKeyModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setDecisionHotKeyModifier(JAXBElement<Integer> value) {
        this.decisionHotKeyModifier = value;
    }

    /**
     * Gets the value of the decisionHotKeyModifierCancel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public JAXBElement<Integer> getDecisionHotKeyModifierCancel() {
        return decisionHotKeyModifierCancel;
    }

    /**
     * Sets the value of the decisionHotKeyModifierCancel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setDecisionHotKeyModifierCancel(JAXBElement<Integer> value) {
        this.decisionHotKeyModifierCancel = value;
    }

    /**
     * Gets the value of the enableOperatorDecisionEntryState property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Boolean isEnableOperatorDecisionEntryState() {
        return enableOperatorDecisionEntryState;
    }

    /**
     * Sets the value of the enableOperatorDecisionEntryState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setEnableOperatorDecisionEntryState(Boolean value) {
        this.enableOperatorDecisionEntryState = value;
    }

    /**
     * Gets the value of the enableOperatorDecisionExitState property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Boolean isEnableOperatorDecisionExitState() {
        return enableOperatorDecisionExitState;
    }

    /**
     * Sets the value of the enableOperatorDecisionExitState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setEnableOperatorDecisionExitState(Boolean value) {
        this.enableOperatorDecisionExitState = value;
    }

    /**
     * Gets the value of the enableOperatorReactionTimeEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Boolean isEnableOperatorReactionTimeEntry() {
        return enableOperatorReactionTimeEntry;
    }

    /**
     * Sets the value of the enableOperatorReactionTimeEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setEnableOperatorReactionTimeEntry(Boolean value) {
        this.enableOperatorReactionTimeEntry = value;
    }

    /**
     * Gets the value of the enableOperatorReactionTimeExit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Boolean isEnableOperatorReactionTimeExit() {
        return enableOperatorReactionTimeExit;
    }

    /**
     * Sets the value of the enableOperatorReactionTimeExit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setEnableOperatorReactionTimeExit(Boolean value) {
        this.enableOperatorReactionTimeExit = value;
    }

    /**
     * Gets the value of the hidePhotoAfterTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Integer getHidePhotoAfterTime() {
        return hidePhotoAfterTime;
    }

    /**
     * Sets the value of the hidePhotoAfterTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setHidePhotoAfterTime(Integer value) {
        this.hidePhotoAfterTime = value;
    }

    /**
     * Gets the value of the isAutoAllowEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Boolean isIsAutoAllowEntry() {
        return isAutoAllowEntry;
    }

    /**
     * Sets the value of the isAutoAllowEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setIsAutoAllowEntry(Boolean value) {
        this.isAutoAllowEntry = value;
    }

    /**
     * Gets the value of the isAutoAllowExit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Boolean isIsAutoAllowExit() {
        return isAutoAllowExit;
    }

    /**
     * Sets the value of the isAutoAllowExit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setIsAutoAllowExit(Boolean value) {
        this.isAutoAllowExit = value;
    }

    /**
     * Gets the value of the isHidePhotoAfterTime property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Boolean isIsHidePhotoAfterTime() {
        return isHidePhotoAfterTime;
    }

    /**
     * Sets the value of the isHidePhotoAfterTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setIsHidePhotoAfterTime(Boolean value) {
        this.isHidePhotoAfterTime = value;
    }

    /**
     * Gets the value of the personalData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPhotoidentificationPersonalData }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public JAXBElement<ArrayOfPhotoidentificationPersonalData> getPersonalData() {
        return personalData;
    }

    /**
     * Sets the value of the personalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPhotoidentificationPersonalData }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setPersonalData(JAXBElement<ArrayOfPhotoidentificationPersonalData> value) {
        this.personalData = value;
    }

    /**
     * Gets the value of the photoContentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public JAXBElement<String> getPhotoContentId() {
        return photoContentId;
    }

    /**
     * Sets the value of the photoContentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setPhotoContentId(JAXBElement<String> value) {
        this.photoContentId = value;
    }

    /**
     * Gets the value of the showOnOffButtonEnterPermitMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Boolean isShowOnOffButtonEnterPermitMode() {
        return showOnOffButtonEnterPermitMode;
    }

    /**
     * Sets the value of the showOnOffButtonEnterPermitMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setShowOnOffButtonEnterPermitMode(Boolean value) {
        this.showOnOffButtonEnterPermitMode = value;
    }

    /**
     * Gets the value of the showOnOffButtonExitPermitMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Boolean isShowOnOffButtonExitPermitMode() {
        return showOnOffButtonExitPermitMode;
    }

    /**
     * Sets the value of the showOnOffButtonExitPermitMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setShowOnOffButtonExitPermitMode(Boolean value) {
        this.showOnOffButtonExitPermitMode = value;
    }

    /**
     * Gets the value of the showPersonalData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Boolean isShowPersonalData() {
        return showPersonalData;
    }

    /**
     * Sets the value of the showPersonalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setShowPersonalData(Boolean value) {
        this.showPersonalData = value;
    }

    /**
     * Gets the value of the showPreviousVisitorMode property.
     * 
     * @return
     *     possible object is
     *     {@link ShowPreviousVisitorMode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public ShowPreviousVisitorMode getShowPreviousVisitorMode() {
        return showPreviousVisitorMode;
    }

    /**
     * Sets the value of the showPreviousVisitorMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowPreviousVisitorMode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setShowPreviousVisitorMode(ShowPreviousVisitorMode value) {
        this.showPreviousVisitorMode = value;
    }

}
