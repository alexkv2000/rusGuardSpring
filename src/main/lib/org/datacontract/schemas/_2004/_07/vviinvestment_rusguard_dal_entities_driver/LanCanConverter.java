
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_driver;

import java.math.BigInteger;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanCanConverter complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LanCanConverter">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ControllerMac" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *         <element name="ControllerPort" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         <element name="Encryption" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="FirmwareMajorVersion" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         <element name="FirmwareMinorVersion" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         <element name="Gateway" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HardwareType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanCanConverter", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", propOrder = {
    "controllerMac",
    "controllerPort",
    "encryption",
    "firmwareMajorVersion",
    "firmwareMinorVersion",
    "gateway",
    "hardwareType",
    "mask"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class LanCanConverter {

    @XmlElement(name = "ControllerMac", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter")
    @XmlSchemaType(name = "unsignedLong")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected BigInteger controllerMac;
    @XmlElement(name = "ControllerPort", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter")
    @XmlSchemaType(name = "unsignedShort")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected Integer controllerPort;
    @XmlElement(name = "Encryption", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected Boolean encryption;
    @XmlElement(name = "FirmwareMajorVersion", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter")
    @XmlSchemaType(name = "unsignedByte")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected Short firmwareMajorVersion;
    @XmlElement(name = "FirmwareMinorVersion", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter")
    @XmlSchemaType(name = "unsignedByte")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected Short firmwareMinorVersion;
    @XmlElementRef(name = "Gateway", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> gateway;
    @XmlElementRef(name = "HardwareType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> hardwareType;
    @XmlElementRef(name = "Mask", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> mask;

    /**
     * Gets the value of the controllerMac property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public BigInteger getControllerMac() {
        return controllerMac;
    }

    /**
     * Sets the value of the controllerMac property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setControllerMac(BigInteger value) {
        this.controllerMac = value;
    }

    /**
     * Gets the value of the controllerPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public Integer getControllerPort() {
        return controllerPort;
    }

    /**
     * Sets the value of the controllerPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setControllerPort(Integer value) {
        this.controllerPort = value;
    }

    /**
     * Gets the value of the encryption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public Boolean isEncryption() {
        return encryption;
    }

    /**
     * Sets the value of the encryption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setEncryption(Boolean value) {
        this.encryption = value;
    }

    /**
     * Gets the value of the firmwareMajorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public Short getFirmwareMajorVersion() {
        return firmwareMajorVersion;
    }

    /**
     * Sets the value of the firmwareMajorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setFirmwareMajorVersion(Short value) {
        this.firmwareMajorVersion = value;
    }

    /**
     * Gets the value of the firmwareMinorVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public Short getFirmwareMinorVersion() {
        return firmwareMinorVersion;
    }

    /**
     * Sets the value of the firmwareMinorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setFirmwareMinorVersion(Short value) {
        this.firmwareMinorVersion = value;
    }

    /**
     * Gets the value of the gateway property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getGateway() {
        return gateway;
    }

    /**
     * Sets the value of the gateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setGateway(JAXBElement<String> value) {
        this.gateway = value;
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
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setMask(JAXBElement<String> value) {
        this.mask = value;
    }

}
