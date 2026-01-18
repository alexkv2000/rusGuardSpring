
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ISS_Display_SlimInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ISS_Display_SlimInfo">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS}ISS_Entity_Base">
 *       <sequence>
 *         <element name="EventViewers" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS}ArrayOfISS_EventViewer_SlimInfo" minOccurs="0"/>
 *         <element name="Monitors" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS}ArrayOfISS_Monitor_SlimInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISS_Display_SlimInfo", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", propOrder = {
    "eventViewers",
    "monitors"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class ISSDisplaySlimInfo
    extends ISSEntityBase
{

    @XmlElementRef(name = "EventViewers", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfISSEventViewerSlimInfo> eventViewers;
    @XmlElementRef(name = "Monitors", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfISSMonitorSlimInfo> monitors;

    /**
     * Gets the value of the eventViewers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfISSEventViewerSlimInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfISSEventViewerSlimInfo> getEventViewers() {
        return eventViewers;
    }

    /**
     * Sets the value of the eventViewers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfISSEventViewerSlimInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setEventViewers(JAXBElement<ArrayOfISSEventViewerSlimInfo> value) {
        this.eventViewers = value;
    }

    /**
     * Gets the value of the monitors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfISSMonitorSlimInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfISSMonitorSlimInfo> getMonitors() {
        return monitors;
    }

    /**
     * Sets the value of the monitors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfISSMonitorSlimInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setMonitors(JAXBElement<ArrayOfISSMonitorSlimInfo> value) {
        this.monitors = value;
    }

}
