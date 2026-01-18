
package com.rusguard.client;

import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.ArrayOfFavoriteFolderInfoWithEmployeeGroup;


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
 *         <element name="GetFavoriteFoldersWithEmployeeGroupsResult" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder}ArrayOfFavoriteFolderInfoWithEmployeeGroup" minOccurs="0"/>
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
    "getFavoriteFoldersWithEmployeeGroupsResult"
})
@XmlRootElement(name = "GetFavoriteFoldersWithEmployeeGroupsResponse", namespace = "http://www.rusguardsecurity.ru")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class GetFavoriteFoldersWithEmployeeGroupsResponse {

    @XmlElementRef(name = "GetFavoriteFoldersWithEmployeeGroupsResult", namespace = "http://www.rusguardsecurity.ru", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected JAXBElement<ArrayOfFavoriteFolderInfoWithEmployeeGroup> getFavoriteFoldersWithEmployeeGroupsResult;

    /**
     * Gets the value of the getFavoriteFoldersWithEmployeeGroupsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFavoriteFolderInfoWithEmployeeGroup }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public JAXBElement<ArrayOfFavoriteFolderInfoWithEmployeeGroup> getGetFavoriteFoldersWithEmployeeGroupsResult() {
        return getFavoriteFoldersWithEmployeeGroupsResult;
    }

    /**
     * Sets the value of the getFavoriteFoldersWithEmployeeGroupsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFavoriteFolderInfoWithEmployeeGroup }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setGetFavoriteFoldersWithEmployeeGroupsResult(JAXBElement<ArrayOfFavoriteFolderInfoWithEmployeeGroup> value) {
        this.getFavoriteFoldersWithEmployeeGroupsResult = value;
    }

}
