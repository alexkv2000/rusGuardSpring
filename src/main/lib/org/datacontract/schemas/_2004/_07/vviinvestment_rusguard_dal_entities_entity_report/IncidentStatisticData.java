
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_report;

import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.ArrayOfBranchInfo;


/**
 * <p>Java class for IncidentStatisticData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IncidentStatisticData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Branches" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Branch}ArrayOfBranchInfo" minOccurs="0"/>
 *         <element name="DateBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="DateEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="ImportantIncidentTypeIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         <element name="IncidentReportName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IncidentsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsShowEmptyBrunches" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Organizaion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OtherIncidentTypeIds" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         <element name="OtherIncidents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentStatisticData", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", propOrder = {
    "branches",
    "dateBegin",
    "dateEnd",
    "importantIncidentTypeIds",
    "incidentReportName",
    "incidentsDescription",
    "isShowEmptyBrunches",
    "organizaion",
    "otherIncidentTypeIds",
    "otherIncidents",
    "place"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class IncidentStatisticData {

    @XmlElementRef(name = "Branches", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfBranchInfo> branches;
    @XmlElement(name = "DateBegin", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents")
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected XMLGregorianCalendar dateBegin;
    @XmlElement(name = "DateEnd", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents")
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected XMLGregorianCalendar dateEnd;
    @XmlElementRef(name = "ImportantIncidentTypeIds", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfguid> importantIncidentTypeIds;
    @XmlElementRef(name = "IncidentReportName", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> incidentReportName;
    @XmlElementRef(name = "IncidentsDescription", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> incidentsDescription;
    @XmlElement(name = "IsShowEmptyBrunches", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected Boolean isShowEmptyBrunches;
    @XmlElementRef(name = "Organizaion", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> organizaion;
    @XmlElementRef(name = "OtherIncidentTypeIds", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfguid> otherIncidentTypeIds;
    @XmlElementRef(name = "OtherIncidents", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> otherIncidents;
    @XmlElementRef(name = "Place", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> place;

    /**
     * Gets the value of the branches property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBranchInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfBranchInfo> getBranches() {
        return branches;
    }

    /**
     * Sets the value of the branches property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBranchInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setBranches(JAXBElement<ArrayOfBranchInfo> value) {
        this.branches = value;
    }

    /**
     * Gets the value of the dateBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public XMLGregorianCalendar getDateBegin() {
        return dateBegin;
    }

    /**
     * Sets the value of the dateBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setDateBegin(XMLGregorianCalendar value) {
        this.dateBegin = value;
    }

    /**
     * Gets the value of the dateEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public XMLGregorianCalendar getDateEnd() {
        return dateEnd;
    }

    /**
     * Sets the value of the dateEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setDateEnd(XMLGregorianCalendar value) {
        this.dateEnd = value;
    }

    /**
     * Gets the value of the importantIncidentTypeIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfguid> getImportantIncidentTypeIds() {
        return importantIncidentTypeIds;
    }

    /**
     * Sets the value of the importantIncidentTypeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setImportantIncidentTypeIds(JAXBElement<ArrayOfguid> value) {
        this.importantIncidentTypeIds = value;
    }

    /**
     * Gets the value of the incidentReportName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getIncidentReportName() {
        return incidentReportName;
    }

    /**
     * Sets the value of the incidentReportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setIncidentReportName(JAXBElement<String> value) {
        this.incidentReportName = value;
    }

    /**
     * Gets the value of the incidentsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getIncidentsDescription() {
        return incidentsDescription;
    }

    /**
     * Sets the value of the incidentsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setIncidentsDescription(JAXBElement<String> value) {
        this.incidentsDescription = value;
    }

    /**
     * Gets the value of the isShowEmptyBrunches property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public Boolean isIsShowEmptyBrunches() {
        return isShowEmptyBrunches;
    }

    /**
     * Sets the value of the isShowEmptyBrunches property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setIsShowEmptyBrunches(Boolean value) {
        this.isShowEmptyBrunches = value;
    }

    /**
     * Gets the value of the organizaion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getOrganizaion() {
        return organizaion;
    }

    /**
     * Sets the value of the organizaion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setOrganizaion(JAXBElement<String> value) {
        this.organizaion = value;
    }

    /**
     * Gets the value of the otherIncidentTypeIds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfguid> getOtherIncidentTypeIds() {
        return otherIncidentTypeIds;
    }

    /**
     * Sets the value of the otherIncidentTypeIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setOtherIncidentTypeIds(JAXBElement<ArrayOfguid> value) {
        this.otherIncidentTypeIds = value;
    }

    /**
     * Gets the value of the otherIncidents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getOtherIncidents() {
        return otherIncidents;
    }

    /**
     * Sets the value of the otherIncidents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setOtherIncidents(JAXBElement<String> value) {
        this.otherIncidents = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setPlace(JAXBElement<String> value) {
        this.place = value;
    }

}
