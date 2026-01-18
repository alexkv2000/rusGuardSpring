
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities;

import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LNetworkAdded complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LNetworkAdded">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NetInfo" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity}LNetInfo" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LNetworkAdded", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", propOrder = {
    "netInfo"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class LNetworkAdded {

    @XmlElementRef(name = "NetInfo", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<LNetInfo> netInfo;

    /**
     * Gets the value of the netInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LNetInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<LNetInfo> getNetInfo() {
        return netInfo;
    }

    /**
     * Sets the value of the netInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LNetInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setNetInfo(JAXBElement<LNetInfo> value) {
        this.netInfo = value;
    }

}
