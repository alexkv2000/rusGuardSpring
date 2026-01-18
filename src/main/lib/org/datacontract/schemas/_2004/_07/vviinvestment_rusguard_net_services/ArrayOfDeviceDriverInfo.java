
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_net_services;

import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDeviceDriverInfo complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDeviceDriverInfo">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DeviceDriverInfo" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities}DeviceDriverInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDeviceDriverInfo", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", propOrder = {
    "deviceDriverInfo"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class ArrayOfDeviceDriverInfo {

    @XmlElement(name = "DeviceDriverInfo", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected List<DeviceDriverInfo> deviceDriverInfo;

    /**
     * Gets the value of the deviceDriverInfo property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceDriverInfo property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDeviceDriverInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceDriverInfo }
     * </p>
     * 
     * 
     * @return
     *     The value of the deviceDriverInfo property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public List<DeviceDriverInfo> getDeviceDriverInfo() {
        if (deviceDriverInfo == null) {
            deviceDriverInfo = new ArrayList<>();
        }
        return this.deviceDriverInfo;
    }

}
