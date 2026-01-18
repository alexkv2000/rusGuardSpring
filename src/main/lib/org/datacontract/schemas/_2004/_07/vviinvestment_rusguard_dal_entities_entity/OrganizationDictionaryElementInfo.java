
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganizationDictionaryElementInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="OrganizationDictionaryElementInfo">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries}DictionaryElementInfo">
 *       <sequence>
 *         <element name="OrganizationTypeID" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         <element name="OrganizationTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationDictionaryElementInfo", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", propOrder = {
    "organizationTypeID",
    "organizationTypeName"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class OrganizationDictionaryElementInfo
    extends DictionaryElementInfo
{

    @XmlElementRef(name = "OrganizationTypeID", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> organizationTypeID;
    @XmlElementRef(name = "OrganizationTypeName", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<String> organizationTypeName;

    /**
     * Gets the value of the organizationTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getOrganizationTypeID() {
        return organizationTypeID;
    }

    /**
     * Sets the value of the organizationTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setOrganizationTypeID(JAXBElement<String> value) {
        this.organizationTypeID = value;
    }

    /**
     * Gets the value of the organizationTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<String> getOrganizationTypeName() {
        return organizationTypeName;
    }

    /**
     * Sets the value of the organizationTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setOrganizationTypeName(JAXBElement<String> value) {
        this.organizationTypeName = value;
    }

}
