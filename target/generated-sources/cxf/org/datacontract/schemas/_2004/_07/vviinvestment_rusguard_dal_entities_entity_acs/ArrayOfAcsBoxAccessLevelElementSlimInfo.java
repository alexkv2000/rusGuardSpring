
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAcsBoxAccessLevelElementSlimInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAcsBoxAccessLevelElementSlimInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcsBoxAccessLevelElementSlimInfo" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel}AcsBoxAccessLevelElementSlimInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAcsBoxAccessLevelElementSlimInfo", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", propOrder = {
    "acsBoxAccessLevelElementSlimInfo"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public class ArrayOfAcsBoxAccessLevelElementSlimInfo {

    @XmlElement(name = "AcsBoxAccessLevelElementSlimInfo", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected List<AcsBoxAccessLevelElementSlimInfo> acsBoxAccessLevelElementSlimInfo;

    /**
     * Gets the value of the acsBoxAccessLevelElementSlimInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acsBoxAccessLevelElementSlimInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAcsBoxAccessLevelElementSlimInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcsBoxAccessLevelElementSlimInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the acsBoxAccessLevelElementSlimInfo property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public List<AcsBoxAccessLevelElementSlimInfo> getAcsBoxAccessLevelElementSlimInfo() {
        if (acsBoxAccessLevelElementSlimInfo == null) {
            acsBoxAccessLevelElementSlimInfo = new ArrayList<AcsBoxAccessLevelElementSlimInfo>();
        }
        return this.acsBoxAccessLevelElementSlimInfo;
    }

}
