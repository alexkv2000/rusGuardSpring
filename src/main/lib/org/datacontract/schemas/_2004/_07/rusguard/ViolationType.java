
package org.datacontract.schemas._2004._07.rusguard;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ViolationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="ViolationType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PVTR"/>
 *     <enumeration value="Late"/>
 *     <enumeration value="LessThanDailyAllowance"/>
 *     <enumeration value="EarlyDeparture"/>
 *     <enumeration value="LongLunchBrake"/>
 *     <enumeration value="AfterHours"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ViolationType", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public enum ViolationType {

    PVTR("PVTR"),
    @XmlEnumValue("Late")
    LATE("Late"),
    @XmlEnumValue("LessThanDailyAllowance")
    LESS_THAN_DAILY_ALLOWANCE("LessThanDailyAllowance"),
    @XmlEnumValue("EarlyDeparture")
    EARLY_DEPARTURE("EarlyDeparture"),
    @XmlEnumValue("LongLunchBrake")
    LONG_LUNCH_BRAKE("LongLunchBrake"),
    @XmlEnumValue("AfterHours")
    AFTER_HOURS("AfterHours");
    private final String value;

    ViolationType(String v) {
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
    public static ViolationType fromValue(String v) {
        for (ViolationType c: ViolationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
