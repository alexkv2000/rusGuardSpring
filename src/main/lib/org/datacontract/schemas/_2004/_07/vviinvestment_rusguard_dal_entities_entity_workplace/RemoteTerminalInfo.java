
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_workplace;

import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.ArrayOfWorkZoneSlimInfo;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.PhotoOrder;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_screenlayout_cellcontent.ArrayOfPhotoidentificationPersonalData;


/**
 * <p>Java class for RemoteTerminalInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="RemoteTerminalInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PersonalData" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification}ArrayOfPhotoidentificationPersonalData" minOccurs="0"/>
 *         <element name="PhotoContent" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Photo}PhotoOrder" minOccurs="0"/>
 *         <element name="WorkZones" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking}ArrayOfWorkZoneSlimInfo" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteTerminalInfo", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace.RemoteTerminal", propOrder = {
    "personalData",
    "photoContent",
    "workZones"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class RemoteTerminalInfo {

    @XmlElementRef(name = "PersonalData", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace.RemoteTerminal", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfPhotoidentificationPersonalData> personalData;
    @XmlElementRef(name = "PhotoContent", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace.RemoteTerminal", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<PhotoOrder> photoContent;
    @XmlElementRef(name = "WorkZones", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace.RemoteTerminal", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfWorkZoneSlimInfo> workZones;

    /**
     * Gets the value of the personalData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPhotoidentificationPersonalData }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setPersonalData(JAXBElement<ArrayOfPhotoidentificationPersonalData> value) {
        this.personalData = value;
    }

    /**
     * Gets the value of the photoContent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhotoOrder }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<PhotoOrder> getPhotoContent() {
        return photoContent;
    }

    /**
     * Sets the value of the photoContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhotoOrder }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setPhotoContent(JAXBElement<PhotoOrder> value) {
        this.photoContent = value;
    }

    /**
     * Gets the value of the workZones property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkZoneSlimInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfWorkZoneSlimInfo> getWorkZones() {
        return workZones;
    }

    /**
     * Sets the value of the workZones property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfWorkZoneSlimInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setWorkZones(JAXBElement<ArrayOfWorkZoneSlimInfo> value) {
        this.workZones = value;
    }

}
