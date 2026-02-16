
package org.tempuri;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.rusguard.ArrayOfDataForPeriodModel;


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
 *         &lt;element name="GetDataForPeriodByDepartmentsDetailResult" type="{http://schemas.datacontract.org/2004/07/RusGuard.Models}ArrayOfDataForPeriodModel" minOccurs="0"/&gt;
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
    "getDataForPeriodByDepartmentsDetailResult"
})
@XmlRootElement(name = "GetDataForPeriodByDepartmentsDetailResponse", namespace = "http://tempuri.org/")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
public class GetDataForPeriodByDepartmentsDetailResponse {

    @XmlElementRef(name = "GetDataForPeriodByDepartmentsDetailResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected JAXBElement<ArrayOfDataForPeriodModel> getDataForPeriodByDepartmentsDetailResult;

    /**
     * Gets the value of the getDataForPeriodByDepartmentsDetailResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataForPeriodModel }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public JAXBElement<ArrayOfDataForPeriodModel> getGetDataForPeriodByDepartmentsDetailResult() {
        return getDataForPeriodByDepartmentsDetailResult;
    }

    /**
     * Sets the value of the getDataForPeriodByDepartmentsDetailResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDataForPeriodModel }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setGetDataForPeriodByDepartmentsDetailResult(JAXBElement<ArrayOfDataForPeriodModel> value) {
        this.getDataForPeriodByDepartmentsDetailResult = value;
    }

}
