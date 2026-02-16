
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.DocumentType;


/**
 * <p>Java class for AcsConfiguratorSaveData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="AcsConfiguratorSaveData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DriverLicensePhoto" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Photo}PhotoOrder" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeTabs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ForeignPassportPhoto" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Photo}PhotoOrder" minOccurs="0"/&gt;
 *         &lt;element name="IsShowPinCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PassportPhoto" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Photo}PhotoOrder" minOccurs="0"/&gt;
 *         &lt;element name="UseDefaultFIODocumentType" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees}DocumentType" minOccurs="0"/&gt;
 *         &lt;element name="ViolationCheckWhenEditEmployee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ViolationCheckWhenSaveEmployee" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcsConfiguratorSaveData", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", propOrder = {
    "driverLicensePhoto",
    "employeeTabs",
    "foreignPassportPhoto",
    "isShowPinCode",
    "passportPhoto",
    "useDefaultFIODocumentType",
    "violationCheckWhenEditEmployee",
    "violationCheckWhenSaveEmployee"
})
@XmlSeeAlso({
    AcsConfiguratorInfo.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
public class AcsConfiguratorSaveData {

    @XmlElementRef(name = "DriverLicensePhoto", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected JAXBElement<PhotoOrder> driverLicensePhoto;
    @XmlElementRef(name = "EmployeeTabs", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected JAXBElement<String> employeeTabs;
    @XmlElementRef(name = "ForeignPassportPhoto", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected JAXBElement<PhotoOrder> foreignPassportPhoto;
    @XmlElement(name = "IsShowPinCode", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected Boolean isShowPinCode;
    @XmlElementRef(name = "PassportPhoto", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected JAXBElement<PhotoOrder> passportPhoto;
    @XmlElementRef(name = "UseDefaultFIODocumentType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected JAXBElement<DocumentType> useDefaultFIODocumentType;
    @XmlElement(name = "ViolationCheckWhenEditEmployee", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected Boolean violationCheckWhenEditEmployee;
    @XmlElement(name = "ViolationCheckWhenSaveEmployee", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected Boolean violationCheckWhenSaveEmployee;

    /**
     * Gets the value of the driverLicensePhoto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhotoOrder }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public JAXBElement<PhotoOrder> getDriverLicensePhoto() {
        return driverLicensePhoto;
    }

    /**
     * Sets the value of the driverLicensePhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhotoOrder }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setDriverLicensePhoto(JAXBElement<PhotoOrder> value) {
        this.driverLicensePhoto = value;
    }

    /**
     * Gets the value of the employeeTabs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public JAXBElement<String> getEmployeeTabs() {
        return employeeTabs;
    }

    /**
     * Sets the value of the employeeTabs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setEmployeeTabs(JAXBElement<String> value) {
        this.employeeTabs = value;
    }

    /**
     * Gets the value of the foreignPassportPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhotoOrder }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public JAXBElement<PhotoOrder> getForeignPassportPhoto() {
        return foreignPassportPhoto;
    }

    /**
     * Sets the value of the foreignPassportPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhotoOrder }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setForeignPassportPhoto(JAXBElement<PhotoOrder> value) {
        this.foreignPassportPhoto = value;
    }

    /**
     * Gets the value of the isShowPinCode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public Boolean isIsShowPinCode() {
        return isShowPinCode;
    }

    /**
     * Sets the value of the isShowPinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setIsShowPinCode(Boolean value) {
        this.isShowPinCode = value;
    }

    /**
     * Gets the value of the passportPhoto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhotoOrder }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public JAXBElement<PhotoOrder> getPassportPhoto() {
        return passportPhoto;
    }

    /**
     * Sets the value of the passportPhoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhotoOrder }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setPassportPhoto(JAXBElement<PhotoOrder> value) {
        this.passportPhoto = value;
    }

    /**
     * Gets the value of the useDefaultFIODocumentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public JAXBElement<DocumentType> getUseDefaultFIODocumentType() {
        return useDefaultFIODocumentType;
    }

    /**
     * Sets the value of the useDefaultFIODocumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setUseDefaultFIODocumentType(JAXBElement<DocumentType> value) {
        this.useDefaultFIODocumentType = value;
    }

    /**
     * Gets the value of the violationCheckWhenEditEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public Boolean isViolationCheckWhenEditEmployee() {
        return violationCheckWhenEditEmployee;
    }

    /**
     * Sets the value of the violationCheckWhenEditEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setViolationCheckWhenEditEmployee(Boolean value) {
        this.violationCheckWhenEditEmployee = value;
    }

    /**
     * Gets the value of the violationCheckWhenSaveEmployee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public Boolean isViolationCheckWhenSaveEmployee() {
        return violationCheckWhenSaveEmployee;
    }

    /**
     * Sets the value of the violationCheckWhenSaveEmployee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setViolationCheckWhenSaveEmployee(Boolean value) {
        this.violationCheckWhenSaveEmployee = value;
    }

}
