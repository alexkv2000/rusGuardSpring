
package com.rusguard.client;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.TupleOfArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoZNgA9GgH;


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
 *         &lt;element name="SaveAcsBoxAccessElementsResult" type="{http://schemas.datacontract.org/2004/07/System}TupleOfArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoZNgA9GgH" minOccurs="0"/&gt;
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
    "saveAcsBoxAccessElementsResult"
})
@XmlRootElement(name = "SaveAcsBoxAccessElementsResponse", namespace = "http://www.rusguardsecurity.ru")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
public class SaveAcsBoxAccessElementsResponse {

    @XmlElementRef(name = "SaveAcsBoxAccessElementsResult", namespace = "http://www.rusguardsecurity.ru", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected JAXBElement<TupleOfArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoZNgA9GgH> saveAcsBoxAccessElementsResult;

    /**
     * Gets the value of the saveAcsBoxAccessElementsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TupleOfArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoZNgA9GgH }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setSaveAcsBoxAccessElementsResult(JAXBElement<TupleOfArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoArrayOfAcsBoxAccessLevelElementSlimInfoZNgA9GgH> value) {
        this.saveAcsBoxAccessElementsResult = value;
    }

}
