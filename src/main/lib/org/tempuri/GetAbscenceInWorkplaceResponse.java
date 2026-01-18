
package org.tempuri;

import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.rusguard.ArrayOfAbsent;


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
 *         <element name="GetAbscenceInWorkplaceResult" type="{http://schemas.datacontract.org/2004/07/RusGuard.Models}ArrayOfAbsent" minOccurs="0"/>
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
    "getAbscenceInWorkplaceResult"
})
@XmlRootElement(name = "GetAbscenceInWorkplaceResponse", namespace = "http://tempuri.org/")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class GetAbscenceInWorkplaceResponse {

    @XmlElementRef(name = "GetAbscenceInWorkplaceResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfAbsent> getAbscenceInWorkplaceResult;

    /**
     * Gets the value of the getAbscenceInWorkplaceResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAbsent }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfAbsent> getGetAbscenceInWorkplaceResult() {
        return getAbscenceInWorkplaceResult;
    }

    /**
     * Sets the value of the getAbscenceInWorkplaceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAbsent }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setGetAbscenceInWorkplaceResult(JAXBElement<ArrayOfAbsent> value) {
        this.getAbscenceInWorkplaceResult = value;
    }

}
