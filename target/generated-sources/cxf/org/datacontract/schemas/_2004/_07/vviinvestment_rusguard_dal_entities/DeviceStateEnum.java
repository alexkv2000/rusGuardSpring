
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DeviceStateEnum</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="DeviceStateEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OK"/&gt;
 *     &lt;enumeration value="Malfunction"/&gt;
 *     &lt;enumeration value="WrongDriverType"/&gt;
 *     &lt;enumeration value="Activating"/&gt;
 *     &lt;enumeration value="Shutdowning"/&gt;
 *     &lt;enumeration value="Shutdowned"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceStateEnum", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
public enum DeviceStateEnum {

    OK("OK"),
    @XmlEnumValue("Malfunction")
    MALFUNCTION("Malfunction"),
    @XmlEnumValue("WrongDriverType")
    WRONG_DRIVER_TYPE("WrongDriverType"),
    @XmlEnumValue("Activating")
    ACTIVATING("Activating"),
    @XmlEnumValue("Shutdowning")
    SHUTDOWNING("Shutdowning"),
    @XmlEnumValue("Shutdowned")
    SHUTDOWNED("Shutdowned");
    private final String value;

    DeviceStateEnum(String v) {
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
    public static DeviceStateEnum fromValue(String v) {
        for (DeviceStateEnum c: DeviceStateEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
