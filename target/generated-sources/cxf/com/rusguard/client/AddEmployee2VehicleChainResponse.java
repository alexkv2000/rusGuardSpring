
package com.rusguard.client;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.TupleOfArrayOfguidArrayOfguid0DMmj3Sh;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddEmployee2VehicleChainResult" type="{http://schemas.datacontract.org/2004/07/System}TupleOfArrayOfguidArrayOfguid0dMmj3_Sh" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addEmployee2VehicleChainResult"
})
@XmlRootElement(name = "AddEmployee2VehicleChainResponse", namespace = "http://www.rusguardsecurity.ru")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
public class AddEmployee2VehicleChainResponse {

    @XmlElementRef(name = "AddEmployee2VehicleChainResult", namespace = "http://www.rusguardsecurity.ru", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    protected JAXBElement<TupleOfArrayOfguidArrayOfguid0DMmj3Sh> addEmployee2VehicleChainResult;

    /**
     * Gets the value of the addEmployee2VehicleChainResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TupleOfArrayOfguidArrayOfguid0DMmj3Sh }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public JAXBElement<TupleOfArrayOfguidArrayOfguid0DMmj3Sh> getAddEmployee2VehicleChainResult() {
        return addEmployee2VehicleChainResult;
    }

    /**
     * Sets the value of the addEmployee2VehicleChainResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TupleOfArrayOfguidArrayOfguid0DMmj3Sh }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public void setAddEmployee2VehicleChainResult(JAXBElement<TupleOfArrayOfguidArrayOfguid0DMmj3Sh> value) {
        this.addEmployee2VehicleChainResult = value;
    }

}
