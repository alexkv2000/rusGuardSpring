
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ServerType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ServerType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DeviceServer"/>
 *     <enumeration value="OperationCoordinator"/>
 *     <enumeration value="DataServer"/>
 *     <enumeration value="LNetworkServer"/>
 *     <enumeration value="ResourceBroker"/>
 *     <enumeration value="CloudDispatcher"/>
 *     <enumeration value="RusGuardSignal"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ServerType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public enum ServerType {

    @XmlEnumValue("DeviceServer")
    DEVICE_SERVER("DeviceServer"),
    @XmlEnumValue("OperationCoordinator")
    OPERATION_COORDINATOR("OperationCoordinator"),
    @XmlEnumValue("DataServer")
    DATA_SERVER("DataServer"),
    @XmlEnumValue("LNetworkServer")
    L_NETWORK_SERVER("LNetworkServer"),
    @XmlEnumValue("ResourceBroker")
    RESOURCE_BROKER("ResourceBroker"),
    @XmlEnumValue("CloudDispatcher")
    CLOUD_DISPATCHER("CloudDispatcher"),
    @XmlEnumValue("RusGuardSignal")
    RUS_GUARD_SIGNAL("RusGuardSignal");
    private final String value;

    ServerType(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static ServerType fromValue(String v) {
        for (ServerType c: ServerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
