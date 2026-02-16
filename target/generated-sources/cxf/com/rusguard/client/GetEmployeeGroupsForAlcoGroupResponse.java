
package com.rusguard.client;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.ArrayOfEmployeeGroupForAlcoGroupFull;


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
 *         &lt;element name="GetEmployeeGroupsForAlcoGroupResult" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup}ArrayOfEmployeeGroupForAlcoGroupFull" minOccurs="0"/&gt;
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
    "getEmployeeGroupsForAlcoGroupResult"
})
@XmlRootElement(name = "GetEmployeeGroupsForAlcoGroupResponse", namespace = "http://www.rusguardsecurity.ru")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
public class GetEmployeeGroupsForAlcoGroupResponse {

    @XmlElementRef(name = "GetEmployeeGroupsForAlcoGroupResult", namespace = "http://www.rusguardsecurity.ru", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected JAXBElement<ArrayOfEmployeeGroupForAlcoGroupFull> getEmployeeGroupsForAlcoGroupResult;

    /**
     * Gets the value of the getEmployeeGroupsForAlcoGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmployeeGroupForAlcoGroupFull }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public JAXBElement<ArrayOfEmployeeGroupForAlcoGroupFull> getGetEmployeeGroupsForAlcoGroupResult() {
        return getEmployeeGroupsForAlcoGroupResult;
    }

    /**
     * Sets the value of the getEmployeeGroupsForAlcoGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmployeeGroupForAlcoGroupFull }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public void setGetEmployeeGroupsForAlcoGroupResult(JAXBElement<ArrayOfEmployeeGroupForAlcoGroupFull> value) {
        this.getEmployeeGroupsForAlcoGroupResult = value;
    }

}
