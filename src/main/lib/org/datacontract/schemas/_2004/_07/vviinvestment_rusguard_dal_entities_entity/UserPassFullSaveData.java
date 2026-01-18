
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserPassFullSaveData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="UserPassFullSaveData">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BackgroindImage" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         <element name="BackgroundColor" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         <element name="BackgroundScaleMode" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout}ScreenScaleMode" minOccurs="0"/>
 *         <element name="BackgroundType" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass}PassBackgroundType" minOccurs="0"/>
 *         <element name="Height" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="IsStandart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="StandartHeight" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="StandartWidth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="Width" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserPassFullSaveData", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", propOrder = {
    "backgroindImage",
    "backgroundColor",
    "backgroundScaleMode",
    "backgroundType",
    "height",
    "isStandart",
    "standartHeight",
    "standartWidth",
    "width"
})
@XmlSeeAlso({
    UserPassFullData.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class UserPassFullSaveData {

    @XmlElementRef(name = "BackgroindImage", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<byte[]> backgroindImage;
    @XmlElementRef(name = "BackgroundColor", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<byte[]> backgroundColor;
    @XmlElement(name = "BackgroundScaleMode", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected ScreenScaleMode backgroundScaleMode;
    @XmlElement(name = "BackgroundType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected PassBackgroundType backgroundType;
    @XmlElement(name = "Height", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected Integer height;
    @XmlElement(name = "IsStandart", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected Boolean isStandart;
    @XmlElement(name = "StandartHeight", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected Integer standartHeight;
    @XmlElement(name = "StandartWidth", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected Integer standartWidth;
    @XmlElement(name = "Width", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected Integer width;

    /**
     * Gets the value of the backgroindImage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<byte[]> getBackgroindImage() {
        return backgroindImage;
    }

    /**
     * Sets the value of the backgroindImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setBackgroindImage(JAXBElement<byte[]> value) {
        this.backgroindImage = value;
    }

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<byte[]> getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setBackgroundColor(JAXBElement<byte[]> value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the backgroundScaleMode property.
     * 
     * @return
     *     possible object is
     *     {@link ScreenScaleMode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public ScreenScaleMode getBackgroundScaleMode() {
        return backgroundScaleMode;
    }

    /**
     * Sets the value of the backgroundScaleMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScreenScaleMode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setBackgroundScaleMode(ScreenScaleMode value) {
        this.backgroundScaleMode = value;
    }

    /**
     * Gets the value of the backgroundType property.
     * 
     * @return
     *     possible object is
     *     {@link PassBackgroundType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public PassBackgroundType getBackgroundType() {
        return backgroundType;
    }

    /**
     * Sets the value of the backgroundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassBackgroundType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setBackgroundType(PassBackgroundType value) {
        this.backgroundType = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Gets the value of the isStandart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public Boolean isIsStandart() {
        return isStandart;
    }

    /**
     * Sets the value of the isStandart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setIsStandart(Boolean value) {
        this.isStandart = value;
    }

    /**
     * Gets the value of the standartHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public Integer getStandartHeight() {
        return standartHeight;
    }

    /**
     * Sets the value of the standartHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setStandartHeight(Integer value) {
        this.standartHeight = value;
    }

    /**
     * Gets the value of the standartWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public Integer getStandartWidth() {
        return standartWidth;
    }

    /**
     * Sets the value of the standartWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setStandartWidth(Integer value) {
        this.standartWidth = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setWidth(Integer value) {
        this.width = value;
    }

}
