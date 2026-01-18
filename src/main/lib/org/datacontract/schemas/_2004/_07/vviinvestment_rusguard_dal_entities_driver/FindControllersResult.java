
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_driver;

import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FindControllersResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="FindControllersResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Controllers" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter}ArrayOfCanDeviceInfo" minOccurs="0"/>
 *         <element name="FailedControllers" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter}ArrayOfCanDeviceInfo" minOccurs="0"/>
 *         <element name="FailedConverters" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter}ArrayOfFindControllersResult.FailedConverterInfo" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindControllersResult", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", propOrder = {
    "controllers",
    "failedControllers",
    "failedConverters"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class FindControllersResult {

    @XmlElementRef(name = "Controllers", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfCanDeviceInfo> controllers;
    @XmlElementRef(name = "FailedControllers", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfCanDeviceInfo> failedControllers;
    @XmlElementRef(name = "FailedConverters", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfFindControllersResultFailedConverterInfo> failedConverters;

    /**
     * Gets the value of the controllers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCanDeviceInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfCanDeviceInfo> getControllers() {
        return controllers;
    }

    /**
     * Sets the value of the controllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCanDeviceInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setControllers(JAXBElement<ArrayOfCanDeviceInfo> value) {
        this.controllers = value;
    }

    /**
     * Gets the value of the failedControllers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCanDeviceInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfCanDeviceInfo> getFailedControllers() {
        return failedControllers;
    }

    /**
     * Sets the value of the failedControllers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCanDeviceInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setFailedControllers(JAXBElement<ArrayOfCanDeviceInfo> value) {
        this.failedControllers = value;
    }

    /**
     * Gets the value of the failedConverters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFindControllersResultFailedConverterInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfFindControllersResultFailedConverterInfo> getFailedConverters() {
        return failedConverters;
    }

    /**
     * Sets the value of the failedConverters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFindControllersResultFailedConverterInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setFailedConverters(JAXBElement<ArrayOfFindControllersResultFailedConverterInfo> value) {
        this.failedConverters = value;
    }

}
