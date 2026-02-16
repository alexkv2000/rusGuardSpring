
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkZonesAccessPointBase complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="WorkZonesAccessPointBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccesPointType" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking}WorkZonesAccessPointType" minOccurs="0"/&gt;
 *         &lt;element name="EventType" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking}WorkZonesAccessPointEventType" minOccurs="0"/&gt;
 *         &lt;element name="WorkZoneId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkZonesAccessPointBase", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", propOrder = {
    "accesPointType",
    "eventType",
    "workZoneId"
})
@XmlSeeAlso({
    WorkZonesAccessPointSaveData.class,
    WorkZonesAccessPointSlimInfo.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
public class WorkZonesAccessPointBase {

    @XmlElement(name = "AccesPointType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected WorkZonesAccessPointType accesPointType;
    @XmlElement(name = "EventType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected WorkZonesAccessPointEventType eventType;
    @XmlElement(name = "WorkZoneId", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected String workZoneId;

    /**
     * Gets the value of the accesPointType property.
     * 
     * @return
     *     possible object is
     *     {@link WorkZonesAccessPointType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public WorkZonesAccessPointType getAccesPointType() {
        return accesPointType;
    }

    /**
     * Sets the value of the accesPointType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkZonesAccessPointType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setAccesPointType(WorkZonesAccessPointType value) {
        this.accesPointType = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link WorkZonesAccessPointEventType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public WorkZonesAccessPointEventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkZonesAccessPointEventType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setEventType(WorkZonesAccessPointEventType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the workZoneId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public String getWorkZoneId() {
        return workZoneId;
    }

    /**
     * Sets the value of the workZoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setWorkZoneId(String value) {
        this.workZoneId = value;
    }

}
