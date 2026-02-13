
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_driver;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NTechLabRecognitionServiceResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="NTechLabRecognitionServiceResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cameras" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab}ArrayOfNTechLabCameraInfo" minOccurs="0"/&gt;
 *         &lt;element name="DossierLists" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab}ArrayOfNTechLabDossierListInfo" minOccurs="0"/&gt;
 *         &lt;element name="SyncState" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab}NTechLabConfigSyncState" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NTechLabRecognitionServiceResult", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", propOrder = {
    "cameras",
    "dossierLists",
    "syncState"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
public class NTechLabRecognitionServiceResult {

    @XmlElementRef(name = "Cameras", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    protected JAXBElement<ArrayOfNTechLabCameraInfo> cameras;
    @XmlElementRef(name = "DossierLists", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", type = JAXBElement.class, required = false)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    protected JAXBElement<ArrayOfNTechLabDossierListInfo> dossierLists;
    @XmlElement(name = "SyncState", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    protected NTechLabConfigSyncState syncState;

    /**
     * Gets the value of the cameras property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNTechLabCameraInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public JAXBElement<ArrayOfNTechLabCameraInfo> getCameras() {
        return cameras;
    }

    /**
     * Sets the value of the cameras property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNTechLabCameraInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public void setCameras(JAXBElement<ArrayOfNTechLabCameraInfo> value) {
        this.cameras = value;
    }

    /**
     * Gets the value of the dossierLists property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNTechLabDossierListInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public JAXBElement<ArrayOfNTechLabDossierListInfo> getDossierLists() {
        return dossierLists;
    }

    /**
     * Sets the value of the dossierLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNTechLabDossierListInfo }{@code >}
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public void setDossierLists(JAXBElement<ArrayOfNTechLabDossierListInfo> value) {
        this.dossierLists = value;
    }

    /**
     * Gets the value of the syncState property.
     * 
     * @return
     *     possible object is
     *     {@link NTechLabConfigSyncState }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public NTechLabConfigSyncState getSyncState() {
        return syncState;
    }

    /**
     * Sets the value of the syncState property.
     * 
     * @param value
     *     allowed object is
     *     {@link NTechLabConfigSyncState }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public void setSyncState(NTechLabConfigSyncState value) {
        this.syncState = value;
    }

}
