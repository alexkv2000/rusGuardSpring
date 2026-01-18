
package com.rusguard.client;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.ArrayOfAcsBoxAccessElementSaveInfo;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.ArrayOfAcsBoxAccessLevelElementSlimInfo;


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
 *         <element name="boxAccessLevelId" type="{http://schemas.microsoft.com/2003/10/Serialization/}guid" minOccurs="0"/>
 *         <element name="deletedElements" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         <element name="editedElements" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel}ArrayOfAcsBoxAccessLevelElementSlimInfo" minOccurs="0"/>
 *         <element name="addedElements" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel}ArrayOfAcsBoxAccessElementSaveInfo" minOccurs="0"/>
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
    "boxAccessLevelId",
    "deletedElements",
    "editedElements",
    "addedElements"
})
@XmlRootElement(name = "SaveAcsBoxAccessElements", namespace = "http://www.rusguardsecurity.ru")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class SaveAcsBoxAccessElements {

    @XmlElement(namespace = "http://www.rusguardsecurity.ru")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected String boxAccessLevelId;
    @XmlElementRef(name = "deletedElements", namespace = "http://www.rusguardsecurity.ru", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfguid> deletedElements;
    @XmlElementRef(name = "editedElements", namespace = "http://www.rusguardsecurity.ru", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfAcsBoxAccessLevelElementSlimInfo> editedElements;
    @XmlElementRef(name = "addedElements", namespace = "http://www.rusguardsecurity.ru", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfAcsBoxAccessElementSaveInfo> addedElements;

    /**
     * Gets the value of the boxAccessLevelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public String getBoxAccessLevelId() {
        return boxAccessLevelId;
    }

    /**
     * Sets the value of the boxAccessLevelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setBoxAccessLevelId(String value) {
        this.boxAccessLevelId = value;
    }

    /**
     * Gets the value of the deletedElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfguid> getDeletedElements() {
        return deletedElements;
    }

    /**
     * Sets the value of the deletedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setDeletedElements(JAXBElement<ArrayOfguid> value) {
        this.deletedElements = value;
    }

    /**
     * Gets the value of the editedElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAcsBoxAccessLevelElementSlimInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfAcsBoxAccessLevelElementSlimInfo> getEditedElements() {
        return editedElements;
    }

    /**
     * Sets the value of the editedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAcsBoxAccessLevelElementSlimInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setEditedElements(JAXBElement<ArrayOfAcsBoxAccessLevelElementSlimInfo> value) {
        this.editedElements = value;
    }

    /**
     * Gets the value of the addedElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAcsBoxAccessElementSaveInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfAcsBoxAccessElementSaveInfo> getAddedElements() {
        return addedElements;
    }

    /**
     * Sets the value of the addedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAcsBoxAccessElementSaveInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setAddedElements(JAXBElement<ArrayOfAcsBoxAccessElementSaveInfo> value) {
        this.addedElements = value;
    }

}
