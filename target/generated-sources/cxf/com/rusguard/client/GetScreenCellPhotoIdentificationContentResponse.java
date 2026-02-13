
package com.rusguard.client;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_screenlayout_cellcontent.CellContentFotoIdentificationInfo;


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
 *         &lt;element name="GetScreenCellPhotoIdentificationContentResult" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout.CellContent.PhotoIdentification}CellContentFotoIdentificationInfo" minOccurs="0"/&gt;
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
    "getScreenCellPhotoIdentificationContentResult"
})
@XmlRootElement(name = "GetScreenCellPhotoIdentificationContentResponse", namespace = "http://www.rusguardsecurity.ru")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
public class GetScreenCellPhotoIdentificationContentResponse {

    @XmlElementRef(name = "GetScreenCellPhotoIdentificationContentResult", namespace = "http://www.rusguardsecurity.ru", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    protected JAXBElement<CellContentFotoIdentificationInfo> getScreenCellPhotoIdentificationContentResult;

    /**
     * Gets the value of the getScreenCellPhotoIdentificationContentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CellContentFotoIdentificationInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public JAXBElement<CellContentFotoIdentificationInfo> getGetScreenCellPhotoIdentificationContentResult() {
        return getScreenCellPhotoIdentificationContentResult;
    }

    /**
     * Sets the value of the getScreenCellPhotoIdentificationContentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CellContentFotoIdentificationInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public void setGetScreenCellPhotoIdentificationContentResult(JAXBElement<CellContentFotoIdentificationInfo> value) {
        this.getScreenCellPhotoIdentificationContentResult = value;
    }

}
