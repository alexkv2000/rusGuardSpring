
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcsEmployeeGroupReactionInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AcsEmployeeGroupReactionInfo">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees}AcsEmployeeGroup">
 *       <sequence>
 *         <element name="EmployeeGroups1" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees}ArrayOfAcsEmployeeGroupReactionInfo" minOccurs="0"/>
 *         <element name="EmployeesFromGroupsGuids" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *         <element name="SelectedEmployeesGuids" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcsEmployeeGroupReactionInfo", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", propOrder = {
    "employeeGroups1",
    "employeesFromGroupsGuids",
    "selectedEmployeesGuids"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class AcsEmployeeGroupReactionInfo
    extends AcsEmployeeGroup
{

    @XmlElementRef(name = "EmployeeGroups1", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfAcsEmployeeGroupReactionInfo> employeeGroups1;
    @XmlElementRef(name = "EmployeesFromGroupsGuids", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfguid> employeesFromGroupsGuids;
    @XmlElementRef(name = "SelectedEmployeesGuids", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfguid> selectedEmployeesGuids;

    /**
     * Gets the value of the employeeGroups1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeGroupReactionInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfAcsEmployeeGroupReactionInfo> getEmployeeGroups1() {
        return employeeGroups1;
    }

    /**
     * Sets the value of the employeeGroups1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeGroupReactionInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setEmployeeGroups1(JAXBElement<ArrayOfAcsEmployeeGroupReactionInfo> value) {
        this.employeeGroups1 = value;
    }

    /**
     * Gets the value of the employeesFromGroupsGuids property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfguid> getEmployeesFromGroupsGuids() {
        return employeesFromGroupsGuids;
    }

    /**
     * Sets the value of the employeesFromGroupsGuids property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setEmployeesFromGroupsGuids(JAXBElement<ArrayOfguid> value) {
        this.employeesFromGroupsGuids = value;
    }

    /**
     * Gets the value of the selectedEmployeesGuids property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfguid> getSelectedEmployeesGuids() {
        return selectedEmployeesGuids;
    }

    /**
     * Sets the value of the selectedEmployeesGuids property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setSelectedEmployeesGuids(JAXBElement<ArrayOfguid> value) {
        this.selectedEmployeesGuids = value;
    }

}
