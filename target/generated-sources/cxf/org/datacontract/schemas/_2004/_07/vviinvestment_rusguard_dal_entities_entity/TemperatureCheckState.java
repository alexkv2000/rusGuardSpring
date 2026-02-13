
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for TemperatureCheckState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="TemperatureCheckState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotRequired"/&gt;
 *     &lt;enumeration value="TemperatureSuccess"/&gt;
 *     &lt;enumeration value="TemperatureAbnormal"/&gt;
 *     &lt;enumeration value="MaskNotDetected"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TemperatureCheckState", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
public enum TemperatureCheckState {

    @XmlEnumValue("NotRequired")
    NOT_REQUIRED("NotRequired"),
    @XmlEnumValue("TemperatureSuccess")
    TEMPERATURE_SUCCESS("TemperatureSuccess"),
    @XmlEnumValue("TemperatureAbnormal")
    TEMPERATURE_ABNORMAL("TemperatureAbnormal"),
    @XmlEnumValue("MaskNotDetected")
    MASK_NOT_DETECTED("MaskNotDetected");
    private final String value;

    TemperatureCheckState(String v) {
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
    public static TemperatureCheckState fromValue(String v) {
        for (TemperatureCheckState c: TemperatureCheckState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
