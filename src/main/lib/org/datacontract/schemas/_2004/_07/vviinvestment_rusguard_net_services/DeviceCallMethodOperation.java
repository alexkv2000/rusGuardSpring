
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_net_services;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceCallMethodOperation complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DeviceCallMethodOperation">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities}DeviceOperation">
 *       <sequence>
 *         <element name="LogMessageId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="MethodArgs" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="MethodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceCallMethodOperation", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", propOrder = {
    "logMessageId",
    "methodArgs",
    "methodName"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class DeviceCallMethodOperation
    extends DeviceOperation
{

    @XmlElementRef(name = "LogMessageId", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<Long> logMessageId;
    @XmlElementRef(name = "MethodArgs", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfstring> methodArgs;
    @XmlElementRef(name = "MethodName", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> methodName;

    /**
     * Gets the value of the logMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<Long> getLogMessageId() {
        return logMessageId;
    }

    /**
     * Sets the value of the logMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setLogMessageId(JAXBElement<Long> value) {
        this.logMessageId = value;
    }

    /**
     * Gets the value of the methodArgs property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfstring> getMethodArgs() {
        return methodArgs;
    }

    /**
     * Sets the value of the methodArgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setMethodArgs(JAXBElement<ArrayOfstring> value) {
        this.methodArgs = value;
    }

    /**
     * Gets the value of the methodName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getMethodName() {
        return methodName;
    }

    /**
     * Sets the value of the methodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setMethodName(JAXBElement<String> value) {
        this.methodName = value;
    }

}
