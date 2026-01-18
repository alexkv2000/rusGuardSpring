
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_net_services;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for StateType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="StateType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="New"/>
 *     <enumeration value="Deleting"/>
 *     <enumeration value="Modifying"/>
 *     <enumeration value="ModifyingDeviceIdentificator"/>
 *     <enumeration value="Unknown"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StateType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public enum StateType {

    @XmlEnumValue("New")
    NEW("New"),
    @XmlEnumValue("Deleting")
    DELETING("Deleting"),
    @XmlEnumValue("Modifying")
    MODIFYING("Modifying"),
    @XmlEnumValue("ModifyingDeviceIdentificator")
    MODIFYING_DEVICE_IDENTIFICATOR("ModifyingDeviceIdentificator"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    StateType(String v) {
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
    public static StateType fromValue(String v) {
        for (StateType c: StateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
