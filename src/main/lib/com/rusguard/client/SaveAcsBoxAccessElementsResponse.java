
package com.rusguard.client;

import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.TupleOfArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoZNgA9GgH;


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
 *         <element name="SaveAcsBoxAccessElementsResult" type="{http://schemas.datacontract.org/2004/07/System}TupleOfArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoZNgA9GgH" minOccurs="0"/>
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
    "saveAcsBoxAccessElementsResult"
})
@XmlRootElement(name = "SaveAcsBoxAccessElementsResponse", namespace = "http://www.rusguardsecurity.ru")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class SaveAcsBoxAccessElementsResponse {

    @XmlElementRef(name = "SaveAcsBoxAccessElementsResult", namespace = "http://www.rusguardsecurity.ru", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<TupleOfArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoZNgA9GgH> saveAcsBoxAccessElementsResult;

    /**
     * Gets the value of the saveAcsBoxAccessElementsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TupleOfArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoZNgA9GgH }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<TupleOfArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoZNgA9GgH> getSaveAcsBoxAccessElementsResult() {
        return saveAcsBoxAccessElementsResult;
    }

    /**
     * Sets the value of the saveAcsBoxAccessElementsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TupleOfArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoZNgA9GgH }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setSaveAcsBoxAccessElementsResult(JAXBElement<TupleOfArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoZNgA9GgH> value) {
        this.saveAcsBoxAccessElementsResult = value;
    }

}
