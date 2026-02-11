
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_net_services;

import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.ArrayOfLDriverAdded;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.ArrayOfLNetworkAdded;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.ArrayOfLOperationResult;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.ArrayOfLResourceInfo;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.ArrayOfLResourceProperty;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.ArrayOfLServerAdded;


/**
 * <p>Java class for LNetworkChanges complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LNetworkChanges">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DriversAdded" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity}ArrayOfLDriverAdded" minOccurs="0"/>
 *         <element name="LinkChanges" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities}ArrayOfLLinkChanged" minOccurs="0"/>
 *         <element name="NetworksAdded" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity}ArrayOfLNetworkAdded" minOccurs="0"/>
 *         <element name="OperationResults" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity}ArrayOfLOperationResult" minOccurs="0"/>
 *         <element name="Properties" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity}ArrayOfLResourceProperty" minOccurs="0"/>
 *         <element name="ResourcesRemoved" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity}ArrayOfLResourceInfo" minOccurs="0"/>
 *         <element name="ServersAdded" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity}ArrayOfLServerAdded" minOccurs="0"/>
 *         <element name="States" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity}ArrayOfLResourceProperty" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LNetworkChanges", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", propOrder = {
    "driversAdded",
    "linkChanges",
    "networksAdded",
    "operationResults",
    "properties",
    "resourcesRemoved",
    "serversAdded",
    "states"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
public class LNetworkChanges {

    @XmlElementRef(name = "DriversAdded", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected JAXBElement<ArrayOfLDriverAdded> driversAdded;
    @XmlElementRef(name = "LinkChanges", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected JAXBElement<ArrayOfLLinkChanged> linkChanges;
    @XmlElementRef(name = "NetworksAdded", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected JAXBElement<ArrayOfLNetworkAdded> networksAdded;
    @XmlElementRef(name = "OperationResults", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected JAXBElement<ArrayOfLOperationResult> operationResults;
    @XmlElementRef(name = "Properties", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected JAXBElement<ArrayOfLResourceProperty> properties;
    @XmlElementRef(name = "ResourcesRemoved", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected JAXBElement<ArrayOfLResourceInfo> resourcesRemoved;
    @XmlElementRef(name = "ServersAdded", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected JAXBElement<ArrayOfLServerAdded> serversAdded;
    @XmlElementRef(name = "States", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected JAXBElement<ArrayOfLResourceProperty> states;

    /**
     * Gets the value of the driversAdded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLDriverAdded }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public JAXBElement<ArrayOfLDriverAdded> getDriversAdded() {
        return driversAdded;
    }

    /**
     * Sets the value of the driversAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLDriverAdded }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setDriversAdded(JAXBElement<ArrayOfLDriverAdded> value) {
        this.driversAdded = value;
    }

    /**
     * Gets the value of the linkChanges property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLLinkChanged }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public JAXBElement<ArrayOfLLinkChanged> getLinkChanges() {
        return linkChanges;
    }

    /**
     * Sets the value of the linkChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLLinkChanged }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setLinkChanges(JAXBElement<ArrayOfLLinkChanged> value) {
        this.linkChanges = value;
    }

    /**
     * Gets the value of the networksAdded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLNetworkAdded }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public JAXBElement<ArrayOfLNetworkAdded> getNetworksAdded() {
        return networksAdded;
    }

    /**
     * Sets the value of the networksAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLNetworkAdded }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setNetworksAdded(JAXBElement<ArrayOfLNetworkAdded> value) {
        this.networksAdded = value;
    }

    /**
     * Gets the value of the operationResults property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLOperationResult }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public JAXBElement<ArrayOfLOperationResult> getOperationResults() {
        return operationResults;
    }

    /**
     * Sets the value of the operationResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLOperationResult }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setOperationResults(JAXBElement<ArrayOfLOperationResult> value) {
        this.operationResults = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLResourceProperty }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public JAXBElement<ArrayOfLResourceProperty> getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLResourceProperty }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setProperties(JAXBElement<ArrayOfLResourceProperty> value) {
        this.properties = value;
    }

    /**
     * Gets the value of the resourcesRemoved property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLResourceInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public JAXBElement<ArrayOfLResourceInfo> getResourcesRemoved() {
        return resourcesRemoved;
    }

    /**
     * Sets the value of the resourcesRemoved property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLResourceInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setResourcesRemoved(JAXBElement<ArrayOfLResourceInfo> value) {
        this.resourcesRemoved = value;
    }

    /**
     * Gets the value of the serversAdded property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLServerAdded }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public JAXBElement<ArrayOfLServerAdded> getServersAdded() {
        return serversAdded;
    }

    /**
     * Sets the value of the serversAdded property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLServerAdded }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setServersAdded(JAXBElement<ArrayOfLServerAdded> value) {
        this.serversAdded = value;
    }

    /**
     * Gets the value of the states property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLResourceProperty }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public JAXBElement<ArrayOfLResourceProperty> getStates() {
        return states;
    }

    /**
     * Sets the value of the states property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLResourceProperty }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setStates(JAXBElement<ArrayOfLResourceProperty> value) {
        this.states = value;
    }

}
