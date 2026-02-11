
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_driver;

import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanConverterAddress complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="CanConverterAddress">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LanCanConverterAddress" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter}LanCanConverterAddress" minOccurs="0"/>
 *         <element name="Tag" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter}CanConverterAddress.TagEnum" minOccurs="0"/>
 *         <element name="UsbCanConverterAddress" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter}UsbCanConverterAddress" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanConverterAddress", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", propOrder = {
    "lanCanConverterAddress",
    "tag",
    "usbCanConverterAddress"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
public class CanConverterAddress {

    @XmlElementRef(name = "LanCanConverterAddress", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected JAXBElement<LanCanConverterAddress> lanCanConverterAddress;
    @XmlElement(name = "Tag", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected CanConverterAddressTagEnum tag;
    @XmlElementRef(name = "UsbCanConverterAddress", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected JAXBElement<UsbCanConverterAddress> usbCanConverterAddress;

    /**
     * Gets the value of the lanCanConverterAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LanCanConverterAddress }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public JAXBElement<LanCanConverterAddress> getLanCanConverterAddress() {
        return lanCanConverterAddress;
    }

    /**
     * Sets the value of the lanCanConverterAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LanCanConverterAddress }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setLanCanConverterAddress(JAXBElement<LanCanConverterAddress> value) {
        this.lanCanConverterAddress = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link CanConverterAddressTagEnum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public CanConverterAddressTagEnum getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CanConverterAddressTagEnum }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setTag(CanConverterAddressTagEnum value) {
        this.tag = value;
    }

    /**
     * Gets the value of the usbCanConverterAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UsbCanConverterAddress }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public JAXBElement<UsbCanConverterAddress> getUsbCanConverterAddress() {
        return usbCanConverterAddress;
    }

    /**
     * Sets the value of the usbCanConverterAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UsbCanConverterAddress }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setUsbCanConverterAddress(JAXBElement<UsbCanConverterAddress> value) {
        this.usbCanConverterAddress = value;
    }

}
