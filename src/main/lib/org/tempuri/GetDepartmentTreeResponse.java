
package org.tempuri;

import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.rusguard.ArrayOfDepartmentTreeModel;


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
 *         <element name="GetDepartmentTreeResult" type="{http://schemas.datacontract.org/2004/07/RusGuard.Models}ArrayOfDepartmentTreeModel" minOccurs="0"/>
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
    "getDepartmentTreeResult"
})
@XmlRootElement(name = "GetDepartmentTreeResponse", namespace = "http://tempuri.org/")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class GetDepartmentTreeResponse {

    @XmlElementRef(name = "GetDepartmentTreeResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfDepartmentTreeModel> getDepartmentTreeResult;

    /**
     * Gets the value of the getDepartmentTreeResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDepartmentTreeModel }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfDepartmentTreeModel> getGetDepartmentTreeResult() {
        return getDepartmentTreeResult;
    }

    /**
     * Sets the value of the getDepartmentTreeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDepartmentTreeModel }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setGetDepartmentTreeResult(JAXBElement<ArrayOfDepartmentTreeModel> value) {
        this.getDepartmentTreeResult = value;
    }

}
