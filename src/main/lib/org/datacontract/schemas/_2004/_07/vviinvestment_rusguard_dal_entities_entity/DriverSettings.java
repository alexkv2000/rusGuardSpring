
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsDaySchedule;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsMultiDaySchedule;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsScheduleType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsWeekScheduleFull;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs_accesslevels.ArrayOfServerIdentificationType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs_accesslevels.PassageByRuleOfTwoPersonsMode;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs_accesslevels.VehicleAssignmentCheckMode;


/**
 * <p>Java class for DriverSettings complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DriverSettings">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Antipassback" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="CardPlusAlcoFrame" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="CardPlusFace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="CardPlusVehicle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ControllerIdentification" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints}ControllerIdentificationType" minOccurs="0"/>
 *         <element name="DailyAlcoholTestConfirmation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="DaySchedule" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule}AcsDaySchedule" minOccurs="0"/>
 *         <element name="DoorRelays" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState}DoorRelays" minOccurs="0"/>
 *         <element name="IdentificationType" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints}IdentificationType" minOccurs="0"/>
 *         <element name="IsConfirmingKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsGuardOffModeOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsGuardOnModeOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsLockModeOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsMultiIdentification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="IsOpenForALongTimeModeOn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="MainIdentification" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints}MainIdentificationType" minOccurs="0"/>
 *         <element name="MultiDaySchedule" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule}AcsMultiDaySchedule" minOccurs="0"/>
 *         <element name="OrderedServerIdentification" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints}ArrayOfServerIdentificationType" minOccurs="0"/>
 *         <element name="PassageByRuleOfTwoPersonsMode" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints}PassageByRuleOfTwoPersonsMode" minOccurs="0"/>
 *         <element name="ScheduleType" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule}AcsScheduleType" minOccurs="0"/>
 *         <element name="ServerVehicleIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="UseHolidaysAndTransfers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="VehicleAssignmentCheckMode" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints}VehicleAssignmentCheckMode" minOccurs="0"/>
 *         <element name="VehicleControllerIdentification" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints}VehicleControllerIdentificationType" minOccurs="0"/>
 *         <element name="WeekSchedule" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule}AcsWeekScheduleFull" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverSettings", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", propOrder = {
    "antipassback",
    "cardPlusAlcoFrame",
    "cardPlusFace",
    "cardPlusVehicle",
    "controllerIdentification",
    "dailyAlcoholTestConfirmation",
    "daySchedule",
    "doorRelays",
    "identificationType",
    "isConfirmingKey",
    "isGuardOffModeOn",
    "isGuardOnModeOn",
    "isLockModeOn",
    "isMultiIdentification",
    "isOpenForALongTimeModeOn",
    "mainIdentification",
    "multiDaySchedule",
    "orderedServerIdentification",
    "passageByRuleOfTwoPersonsMode",
    "scheduleType",
    "serverVehicleIdentification",
    "useHolidaysAndTransfers",
    "vehicleAssignmentCheckMode",
    "vehicleControllerIdentification",
    "weekSchedule"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class DriverSettings {

    @XmlElementRef(name = "Antipassback", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<Boolean> antipassback;
    @XmlElementRef(name = "CardPlusAlcoFrame", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<Boolean> cardPlusAlcoFrame;
    @XmlElementRef(name = "CardPlusFace", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<Boolean> cardPlusFace;
    @XmlElementRef(name = "CardPlusVehicle", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<Boolean> cardPlusVehicle;
    @XmlList
    @XmlElement(name = "ControllerIdentification", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected List<String> controllerIdentification;
    @XmlElementRef(name = "DailyAlcoholTestConfirmation", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<Boolean> dailyAlcoholTestConfirmation;
    @XmlElementRef(name = "DaySchedule", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<AcsDaySchedule> daySchedule;
    @XmlElementRef(name = "DoorRelays", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<DoorRelays> doorRelays;
    @XmlList
    @XmlElement(name = "IdentificationType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected List<String> identificationType;
    @XmlElementRef(name = "IsConfirmingKey", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<Boolean> isConfirmingKey;
    @XmlElementRef(name = "IsGuardOffModeOn", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<Boolean> isGuardOffModeOn;
    @XmlElementRef(name = "IsGuardOnModeOn", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<Boolean> isGuardOnModeOn;
    @XmlElementRef(name = "IsLockModeOn", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<Boolean> isLockModeOn;
    @XmlElementRef(name = "IsMultiIdentification", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<Boolean> isMultiIdentification;
    @XmlElementRef(name = "IsOpenForALongTimeModeOn", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<Boolean> isOpenForALongTimeModeOn;
    @XmlList
    @XmlElement(name = "MainIdentification", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected List<String> mainIdentification;
    @XmlElementRef(name = "MultiDaySchedule", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<AcsMultiDaySchedule> multiDaySchedule;
    @XmlElementRef(name = "OrderedServerIdentification", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfServerIdentificationType> orderedServerIdentification;
    @XmlElement(name = "PassageByRuleOfTwoPersonsMode", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected PassageByRuleOfTwoPersonsMode passageByRuleOfTwoPersonsMode;
    @XmlElement(name = "ScheduleType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected AcsScheduleType scheduleType;
    @XmlElementRef(name = "ServerVehicleIdentification", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> serverVehicleIdentification;
    @XmlElementRef(name = "UseHolidaysAndTransfers", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<Boolean> useHolidaysAndTransfers;
    @XmlElement(name = "VehicleAssignmentCheckMode", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected VehicleAssignmentCheckMode vehicleAssignmentCheckMode;
    @XmlList
    @XmlElement(name = "VehicleControllerIdentification", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected List<String> vehicleControllerIdentification;
    @XmlElementRef(name = "WeekSchedule", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<AcsWeekScheduleFull> weekSchedule;

    /**
     * Gets the value of the antipassback property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<Boolean> getAntipassback() {
        return antipassback;
    }

    /**
     * Sets the value of the antipassback property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setAntipassback(JAXBElement<Boolean> value) {
        this.antipassback = value;
    }

    /**
     * Gets the value of the cardPlusAlcoFrame property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<Boolean> getCardPlusAlcoFrame() {
        return cardPlusAlcoFrame;
    }

    /**
     * Sets the value of the cardPlusAlcoFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setCardPlusAlcoFrame(JAXBElement<Boolean> value) {
        this.cardPlusAlcoFrame = value;
    }

    /**
     * Gets the value of the cardPlusFace property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<Boolean> getCardPlusFace() {
        return cardPlusFace;
    }

    /**
     * Sets the value of the cardPlusFace property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setCardPlusFace(JAXBElement<Boolean> value) {
        this.cardPlusFace = value;
    }

    /**
     * Gets the value of the cardPlusVehicle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<Boolean> getCardPlusVehicle() {
        return cardPlusVehicle;
    }

    /**
     * Sets the value of the cardPlusVehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setCardPlusVehicle(JAXBElement<Boolean> value) {
        this.cardPlusVehicle = value;
    }

    /**
     * Gets the value of the controllerIdentification property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controllerIdentification property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getControllerIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the controllerIdentification property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public List<String> getControllerIdentification() {
        if (controllerIdentification == null) {
            controllerIdentification = new ArrayList<>();
        }
        return this.controllerIdentification;
    }

    /**
     * Gets the value of the dailyAlcoholTestConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<Boolean> getDailyAlcoholTestConfirmation() {
        return dailyAlcoholTestConfirmation;
    }

    /**
     * Sets the value of the dailyAlcoholTestConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setDailyAlcoholTestConfirmation(JAXBElement<Boolean> value) {
        this.dailyAlcoholTestConfirmation = value;
    }

    /**
     * Gets the value of the daySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<AcsDaySchedule> getDaySchedule() {
        return daySchedule;
    }

    /**
     * Sets the value of the daySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setDaySchedule(JAXBElement<AcsDaySchedule> value) {
        this.daySchedule = value;
    }

    /**
     * Gets the value of the doorRelays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DoorRelays }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<DoorRelays> getDoorRelays() {
        return doorRelays;
    }

    /**
     * Sets the value of the doorRelays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DoorRelays }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setDoorRelays(JAXBElement<DoorRelays> value) {
        this.doorRelays = value;
    }

    /**
     * Gets the value of the identificationType property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identificationType property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIdentificationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the identificationType property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public List<String> getIdentificationType() {
        if (identificationType == null) {
            identificationType = new ArrayList<>();
        }
        return this.identificationType;
    }

    /**
     * Gets the value of the isConfirmingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<Boolean> getIsConfirmingKey() {
        return isConfirmingKey;
    }

    /**
     * Sets the value of the isConfirmingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setIsConfirmingKey(JAXBElement<Boolean> value) {
        this.isConfirmingKey = value;
    }

    /**
     * Gets the value of the isGuardOffModeOn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<Boolean> getIsGuardOffModeOn() {
        return isGuardOffModeOn;
    }

    /**
     * Sets the value of the isGuardOffModeOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setIsGuardOffModeOn(JAXBElement<Boolean> value) {
        this.isGuardOffModeOn = value;
    }

    /**
     * Gets the value of the isGuardOnModeOn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<Boolean> getIsGuardOnModeOn() {
        return isGuardOnModeOn;
    }

    /**
     * Sets the value of the isGuardOnModeOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setIsGuardOnModeOn(JAXBElement<Boolean> value) {
        this.isGuardOnModeOn = value;
    }

    /**
     * Gets the value of the isLockModeOn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<Boolean> getIsLockModeOn() {
        return isLockModeOn;
    }

    /**
     * Sets the value of the isLockModeOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setIsLockModeOn(JAXBElement<Boolean> value) {
        this.isLockModeOn = value;
    }

    /**
     * Gets the value of the isMultiIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<Boolean> getIsMultiIdentification() {
        return isMultiIdentification;
    }

    /**
     * Sets the value of the isMultiIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setIsMultiIdentification(JAXBElement<Boolean> value) {
        this.isMultiIdentification = value;
    }

    /**
     * Gets the value of the isOpenForALongTimeModeOn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<Boolean> getIsOpenForALongTimeModeOn() {
        return isOpenForALongTimeModeOn;
    }

    /**
     * Sets the value of the isOpenForALongTimeModeOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setIsOpenForALongTimeModeOn(JAXBElement<Boolean> value) {
        this.isOpenForALongTimeModeOn = value;
    }

    /**
     * Gets the value of the mainIdentification property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mainIdentification property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getMainIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the mainIdentification property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public List<String> getMainIdentification() {
        if (mainIdentification == null) {
            mainIdentification = new ArrayList<>();
        }
        return this.mainIdentification;
    }

    /**
     * Gets the value of the multiDaySchedule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcsMultiDaySchedule }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<AcsMultiDaySchedule> getMultiDaySchedule() {
        return multiDaySchedule;
    }

    /**
     * Sets the value of the multiDaySchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcsMultiDaySchedule }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setMultiDaySchedule(JAXBElement<AcsMultiDaySchedule> value) {
        this.multiDaySchedule = value;
    }

    /**
     * Gets the value of the orderedServerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServerIdentificationType }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfServerIdentificationType> getOrderedServerIdentification() {
        return orderedServerIdentification;
    }

    /**
     * Sets the value of the orderedServerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfServerIdentificationType }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setOrderedServerIdentification(JAXBElement<ArrayOfServerIdentificationType> value) {
        this.orderedServerIdentification = value;
    }

    /**
     * Gets the value of the passageByRuleOfTwoPersonsMode property.
     * 
     * @return
     *     possible object is
     *     {@link PassageByRuleOfTwoPersonsMode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public PassageByRuleOfTwoPersonsMode getPassageByRuleOfTwoPersonsMode() {
        return passageByRuleOfTwoPersonsMode;
    }

    /**
     * Sets the value of the passageByRuleOfTwoPersonsMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassageByRuleOfTwoPersonsMode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setPassageByRuleOfTwoPersonsMode(PassageByRuleOfTwoPersonsMode value) {
        this.passageByRuleOfTwoPersonsMode = value;
    }

    /**
     * Gets the value of the scheduleType property.
     * 
     * @return
     *     possible object is
     *     {@link AcsScheduleType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public AcsScheduleType getScheduleType() {
        return scheduleType;
    }

    /**
     * Sets the value of the scheduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcsScheduleType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setScheduleType(AcsScheduleType value) {
        this.scheduleType = value;
    }

    /**
     * Gets the value of the serverVehicleIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getServerVehicleIdentification() {
        return serverVehicleIdentification;
    }

    /**
     * Sets the value of the serverVehicleIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setServerVehicleIdentification(JAXBElement<String> value) {
        this.serverVehicleIdentification = value;
    }

    /**
     * Gets the value of the useHolidaysAndTransfers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<Boolean> getUseHolidaysAndTransfers() {
        return useHolidaysAndTransfers;
    }

    /**
     * Sets the value of the useHolidaysAndTransfers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setUseHolidaysAndTransfers(JAXBElement<Boolean> value) {
        this.useHolidaysAndTransfers = value;
    }

    /**
     * Gets the value of the vehicleAssignmentCheckMode property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAssignmentCheckMode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public VehicleAssignmentCheckMode getVehicleAssignmentCheckMode() {
        return vehicleAssignmentCheckMode;
    }

    /**
     * Sets the value of the vehicleAssignmentCheckMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAssignmentCheckMode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setVehicleAssignmentCheckMode(VehicleAssignmentCheckMode value) {
        this.vehicleAssignmentCheckMode = value;
    }

    /**
     * Gets the value of the vehicleControllerIdentification property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleControllerIdentification property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getVehicleControllerIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the vehicleControllerIdentification property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public List<String> getVehicleControllerIdentification() {
        if (vehicleControllerIdentification == null) {
            vehicleControllerIdentification = new ArrayList<>();
        }
        return this.vehicleControllerIdentification;
    }

    /**
     * Gets the value of the weekSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcsWeekScheduleFull }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<AcsWeekScheduleFull> getWeekSchedule() {
        return weekSchedule;
    }

    /**
     * Sets the value of the weekSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcsWeekScheduleFull }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setWeekSchedule(JAXBElement<AcsWeekScheduleFull> value) {
        this.weekSchedule = value;
    }

}
