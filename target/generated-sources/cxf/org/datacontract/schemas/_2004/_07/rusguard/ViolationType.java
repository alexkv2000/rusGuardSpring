
package org.datacontract.schemas._2004._07.rusguard;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ViolationType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="ViolationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PVTR"/&gt;
 *     &lt;enumeration value="Late"/&gt;
 *     &lt;enumeration value="LessThanDailyAllowance"/&gt;
 *     &lt;enumeration value="EarlyDeparture"/&gt;
 *     &lt;enumeration value="LongLunchBrake"/&gt;
 *     &lt;enumeration value="AfterHours"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ViolationType", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
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
