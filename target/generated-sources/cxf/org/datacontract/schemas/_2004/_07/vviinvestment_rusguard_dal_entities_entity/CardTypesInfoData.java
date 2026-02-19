
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardTypesInfoData complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="CardTypesInfoData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardTypes" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType}ArrayOfCardTypeInfo" minOccurs="0"/&gt;
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTypesInfoData", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", propOrder = {
    "cardTypes",
    "count"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public class CardTypesInfoData {

    @XmlElementRef(name = "CardTypes", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected JAXBElement<ArrayOfCardTypeInfo> cardTypes;
    @XmlElement(name = "Count", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected Long count;

    /**
     * Gets the value of the cardTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCardTypeInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public JAXBElement<ArrayOfCardTypeInfo> getCardTypes() {
        return cardTypes;
    }

    /**
     * Sets the value of the cardTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCardTypeInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setCardTypes(JAXBElement<ArrayOfCardTypeInfo> value) {
        this.cardTypes = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public Long getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setCount(Long value) {
        this.count = value;
    }

}
