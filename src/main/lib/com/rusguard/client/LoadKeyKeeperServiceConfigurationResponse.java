
package com.rusguard.client;

import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_driver.KeyKeeperControllerResult;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LoadKeyKeeperServiceConfigurationResult" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper}KeyKeeperControllerResult" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "loadKeyKeeperServiceConfigurationResult"
})
@XmlRootElement(name = "LoadKeyKeeperServiceConfigurationResponse", namespace = "http://www.rusguardsecurity.ru")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class LoadKeyKeeperServiceConfigurationResponse {

    @XmlElementRef(name = "LoadKeyKeeperServiceConfigurationResult", namespace = "http://www.rusguardsecurity.ru", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<KeyKeeperControllerResult> loadKeyKeeperServiceConfigurationResult;

    /**
     * Gets the value of the loadKeyKeeperServiceConfigurationResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link KeyKeeperControllerResult }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<KeyKeeperControllerResult> getLoadKeyKeeperServiceConfigurationResult() {
        return loadKeyKeeperServiceConfigurationResult;
    }

    /**
     * Sets the value of the loadKeyKeeperServiceConfigurationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link KeyKeeperControllerResult }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setLoadKeyKeeperServiceConfigurationResult(JAXBElement<KeyKeeperControllerResult> value) {
        this.loadKeyKeeperServiceConfigurationResult = value;
    }

}
