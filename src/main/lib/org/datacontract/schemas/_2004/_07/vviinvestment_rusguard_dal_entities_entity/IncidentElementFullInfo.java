
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsEmployeeDocumentsData;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsEmployeeFull;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsVehicle;


/**
 * <p>Java class for IncidentElementFullInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IncidentElementFullInfo">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries}IncidentSaveInfo">
 *       <sequence>
 *         <element name="AcsEmployeeDocumentsData" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees}AcsEmployeeDocumentsData" minOccurs="0"/>
 *         <element name="AcsEmployeeFull" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees}AcsEmployeeFull" minOccurs="0"/>
 *         <element name="BranchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DocumentTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EmployeeFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         <element name="LocationClarificationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="LocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Members" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries}ArrayOfViolatorFullInfo" minOccurs="0"/>
 *         <element name="SecurityGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="SignificanceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Tangibles" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries}ArrayOfTangiblesFullInfo" minOccurs="0"/>
 *         <element name="Vehicle" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle}AcsVehicle" minOccurs="0"/>
 *         <element name="VehicleOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ViolationNatureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ViolationTheftMethodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ViolationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Violators" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries}ArrayOfViolatorFullInfo" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentElementFullInfo", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", propOrder = {
    "acsEmployeeDocumentsData",
    "acsEmployeeFull",
    "branchName",
    "documentTypeName",
    "employeeFullName",
    "id",
    "locationClarificationName",
    "locationName",
    "members",
    "securityGroupName",
    "significanceName",
    "tangibles",
    "vehicle",
    "vehicleOrganizationName",
    "violationNatureName",
    "violationTheftMethodName",
    "violationTypeName",
    "violators"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class IncidentElementFullInfo
    extends IncidentSaveInfo
{

    @XmlElementRef(name = "AcsEmployeeDocumentsData", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<AcsEmployeeDocumentsData> acsEmployeeDocumentsData;
    @XmlElementRef(name = "AcsEmployeeFull", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<AcsEmployeeFull> acsEmployeeFull;
    @XmlElementRef(name = "BranchName", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> branchName;
    @XmlElementRef(name = "DocumentTypeName", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> documentTypeName;
    @XmlElementRef(name = "EmployeeFullName", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> employeeFullName;
    @XmlElement(name = "ID", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected String id;
    @XmlElementRef(name = "LocationClarificationName", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> locationClarificationName;
    @XmlElementRef(name = "LocationName", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> locationName;
    @XmlElementRef(name = "Members", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfViolatorFullInfo> members;
    @XmlElementRef(name = "SecurityGroupName", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> securityGroupName;
    @XmlElementRef(name = "SignificanceName", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> significanceName;
    @XmlElementRef(name = "Tangibles", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfTangiblesFullInfo> tangibles;
    @XmlElementRef(name = "Vehicle", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<AcsVehicle> vehicle;
    @XmlElementRef(name = "VehicleOrganizationName", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> vehicleOrganizationName;
    @XmlElementRef(name = "ViolationNatureName", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> violationNatureName;
    @XmlElementRef(name = "ViolationTheftMethodName", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> violationTheftMethodName;
    @XmlElementRef(name = "ViolationTypeName", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> violationTypeName;
    @XmlElementRef(name = "Violators", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfViolatorFullInfo> violators;

    /**
     * Gets the value of the acsEmployeeDocumentsData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcsEmployeeDocumentsData }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<AcsEmployeeDocumentsData> getAcsEmployeeDocumentsData() {
        return acsEmployeeDocumentsData;
    }

    /**
     * Sets the value of the acsEmployeeDocumentsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcsEmployeeDocumentsData }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setAcsEmployeeDocumentsData(JAXBElement<AcsEmployeeDocumentsData> value) {
        this.acsEmployeeDocumentsData = value;
    }

    /**
     * Gets the value of the acsEmployeeFull property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcsEmployeeFull }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<AcsEmployeeFull> getAcsEmployeeFull() {
        return acsEmployeeFull;
    }

    /**
     * Sets the value of the acsEmployeeFull property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcsEmployeeFull }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setAcsEmployeeFull(JAXBElement<AcsEmployeeFull> value) {
        this.acsEmployeeFull = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setBranchName(JAXBElement<String> value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the documentTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getDocumentTypeName() {
        return documentTypeName;
    }

    /**
     * Sets the value of the documentTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setDocumentTypeName(JAXBElement<String> value) {
        this.documentTypeName = value;
    }

    /**
     * Gets the value of the employeeFullName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getEmployeeFullName() {
        return employeeFullName;
    }

    /**
     * Sets the value of the employeeFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setEmployeeFullName(JAXBElement<String> value) {
        this.employeeFullName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the locationClarificationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getLocationClarificationName() {
        return locationClarificationName;
    }

    /**
     * Sets the value of the locationClarificationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setLocationClarificationName(JAXBElement<String> value) {
        this.locationClarificationName = value;
    }

    /**
     * Gets the value of the locationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setLocationName(JAXBElement<String> value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfViolatorFullInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfViolatorFullInfo> getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfViolatorFullInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setMembers(JAXBElement<ArrayOfViolatorFullInfo> value) {
        this.members = value;
    }

    /**
     * Gets the value of the securityGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getSecurityGroupName() {
        return securityGroupName;
    }

    /**
     * Sets the value of the securityGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setSecurityGroupName(JAXBElement<String> value) {
        this.securityGroupName = value;
    }

    /**
     * Gets the value of the significanceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getSignificanceName() {
        return significanceName;
    }

    /**
     * Sets the value of the significanceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setSignificanceName(JAXBElement<String> value) {
        this.significanceName = value;
    }

    /**
     * Gets the value of the tangibles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTangiblesFullInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfTangiblesFullInfo> getTangibles() {
        return tangibles;
    }

    /**
     * Sets the value of the tangibles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTangiblesFullInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setTangibles(JAXBElement<ArrayOfTangiblesFullInfo> value) {
        this.tangibles = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AcsVehicle }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<AcsVehicle> getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AcsVehicle }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setVehicle(JAXBElement<AcsVehicle> value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the vehicleOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getVehicleOrganizationName() {
        return vehicleOrganizationName;
    }

    /**
     * Sets the value of the vehicleOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setVehicleOrganizationName(JAXBElement<String> value) {
        this.vehicleOrganizationName = value;
    }

    /**
     * Gets the value of the violationNatureName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getViolationNatureName() {
        return violationNatureName;
    }

    /**
     * Sets the value of the violationNatureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setViolationNatureName(JAXBElement<String> value) {
        this.violationNatureName = value;
    }

    /**
     * Gets the value of the violationTheftMethodName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getViolationTheftMethodName() {
        return violationTheftMethodName;
    }

    /**
     * Sets the value of the violationTheftMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setViolationTheftMethodName(JAXBElement<String> value) {
        this.violationTheftMethodName = value;
    }

    /**
     * Gets the value of the violationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getViolationTypeName() {
        return violationTypeName;
    }

    /**
     * Sets the value of the violationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setViolationTypeName(JAXBElement<String> value) {
        this.violationTypeName = value;
    }

    /**
     * Gets the value of the violators property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfViolatorFullInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfViolatorFullInfo> getViolators() {
        return violators;
    }

    /**
     * Sets the value of the violators property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfViolatorFullInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setViolators(JAXBElement<ArrayOfViolatorFullInfo> value) {
        this.violators = value;
    }

}
