
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_driver;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSetDevicesAddressBySidResult.FailedAddress complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSetDevicesAddressBySidResult.FailedAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SetDevicesAddressBySidResult.FailedAddress" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter}SetDevicesAddressBySidResult.FailedAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSetDevicesAddressBySidResult.FailedAddress", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", propOrder = {
    "setDevicesAddressBySidResultFailedAddress"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
public class ArrayOfSetDevicesAddressBySidResultFailedAddress {

    @XmlElement(name = "SetDevicesAddressBySidResult.FailedAddress", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    protected List<SetDevicesAddressBySidResultFailedAddress> setDevicesAddressBySidResultFailedAddress;

    /**
     * Gets the value of the setDevicesAddressBySidResultFailedAddress property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setDevicesAddressBySidResultFailedAddress property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSetDevicesAddressBySidResultFailedAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetDevicesAddressBySidResultFailedAddress }
     * </p>
     * 
     * 
     * @return
     *     The value of the setDevicesAddressBySidResultFailedAddress property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public List<SetDevicesAddressBySidResultFailedAddress> getSetDevicesAddressBySidResultFailedAddress() {
        if (setDevicesAddressBySidResultFailedAddress == null) {
            setDevicesAddressBySidResultFailedAddress = new ArrayList<SetDevicesAddressBySidResultFailedAddress>();
        }
        return this.setDevicesAddressBySidResultFailedAddress;
    }

}
