
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_driver;

import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.LDriverFullInfo;


/**
 * <p>Java class for CanDeviceNetConfig complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CanDeviceNetConfig">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BusAddress" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         <element name="ConverterAddress" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter}CanConverterAddress" minOccurs="0"/>
 *         <element name="DriverFullInfo" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity}LDriverFullInfo" minOccurs="0"/>
 *         <element name="HardwareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsEncrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="MajorVersion" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         <element name="MinorVersion" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         <element name="RawHardwareType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         <element name="SID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanDeviceNetConfig", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", propOrder = {
    "busAddress",
    "converterAddress",
    "driverFullInfo",
    "hardwareType",
    "isEncrypted",
    "majorVersion",
    "minorVersion",
    "rawHardwareType",
    "sid"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class CanDeviceNetConfig {

    @XmlElement(name = "BusAddress", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter")
    @XmlSchemaType(name = "unsignedByte")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected Short busAddress;
    @XmlElementRef(name = "ConverterAddress", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<CanConverterAddress> converterAddress;
    @XmlElementRef(name = "DriverFullInfo", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<LDriverFullInfo> driverFullInfo;
    @XmlElementRef(name = "HardwareType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> hardwareType;
    @XmlElement(name = "IsEncrypted", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected Boolean isEncrypted;
    @XmlElement(name = "MajorVersion", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter")
    @XmlSchemaType(name = "unsignedByte")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected Short majorVersion;
    @XmlElement(name = "MinorVersion", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter")
    @XmlSchemaType(name = "unsignedByte")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected Short minorVersion;
    @XmlElement(name = "RawHardwareType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter")
    @XmlSchemaType(name = "unsignedByte")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected Short rawHardwareType;
    @XmlElement(name = "SID", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter")
    @XmlSchemaType(name = "unsignedInt")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected Long sid;

    /**
     * Gets the value of the busAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public Short getBusAddress() {
        return busAddress;
    }

    /**
     * Sets the value of the busAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setBusAddress(Short value) {
        this.busAddress = value;
    }

    /**
     * Gets the value of the converterAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CanConverterAddress }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<CanConverterAddress> getConverterAddress() {
        return converterAddress;
    }

    /**
     * Sets the value of the converterAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CanConverterAddress }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setConverterAddress(JAXBElement<CanConverterAddress> value) {
        this.converterAddress = value;
    }

    /**
     * Gets the value of the driverFullInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LDriverFullInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<LDriverFullInfo> getDriverFullInfo() {
        return driverFullInfo;
    }

    /**
     * Sets the value of the driverFullInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LDriverFullInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setDriverFullInfo(JAXBElement<LDriverFullInfo> value) {
        this.driverFullInfo = value;
    }

    /**
     * Gets the value of the hardwareType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getHardwareType() {
        return hardwareType;
    }

    /**
     * Sets the value of the hardwareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setHardwareType(JAXBElement<String> value) {
        this.hardwareType = value;
    }

    /**
     * Gets the value of the isEncrypted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public Boolean isIsEncrypted() {
        return isEncrypted;
    }

    /**
     * Sets the value of the isEncrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setIsEncrypted(Boolean value) {
        this.isEncrypted = value;
    }

    /**
     * Gets the value of the majorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public Short getMajorVersion() {
        return majorVersion;
    }

    /**
     * Sets the value of the majorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setMajorVersion(Short value) {
        this.majorVersion = value;
    }

    /**
     * Gets the value of the minorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public Short getMinorVersion() {
        return minorVersion;
    }

    /**
     * Sets the value of the minorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setMinorVersion(Short value) {
        this.minorVersion = value;
    }

    /**
     * Gets the value of the rawHardwareType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public Short getRawHardwareType() {
        return rawHardwareType;
    }

    /**
     * Sets the value of the rawHardwareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setRawHardwareType(Short value) {
        this.rawHardwareType = value;
    }

    /**
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public Long getSID() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setSID(Long value) {
        this.sid = value;
    }

}
