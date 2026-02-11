
package com.rusguard.client;

import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.TupleOfArrayOfguidArrayOfguid0DMmj3Sh;


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
 *         <element name="AddEmployee2VehicleChainResult" type="{http://schemas.datacontract.org/2004/07/System}TupleOfArrayOfguidArrayOfguid0dMmj3_Sh" minOccurs="0"/>
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
    "addEmployee2VehicleChainResult"
})
@XmlRootElement(name = "AddEmployee2VehicleChainResponse", namespace = "http://www.rusguardsecurity.ru")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
public class AddEmployee2VehicleChainResponse {

    @XmlElementRef(name = "AddEmployee2VehicleChainResult", namespace = "http://www.rusguardsecurity.ru", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected JAXBElement<TupleOfArrayOfguidArrayOfguid0DMmj3Sh> addEmployee2VehicleChainResult;

    /**
     * Gets the value of the addEmployee2VehicleChainResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TupleOfArrayOfguidArrayOfguid0DMmj3Sh }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setAddEmployee2VehicleChainResult(JAXBElement<TupleOfArrayOfguidArrayOfguid0DMmj3Sh> value) {
        this.addEmployee2VehicleChainResult = value;
    }

}
