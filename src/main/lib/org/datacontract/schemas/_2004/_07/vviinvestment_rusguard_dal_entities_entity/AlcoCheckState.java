
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for AlcoCheckState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AlcoCheckState">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NotRequired"/>
 *     <enumeration value="CheckPerformed"/>
 *     <enumeration value="CheckRefused"/>
 *     <enumeration value="CommunicationFailure"/>
 *     <enumeration value="DailyAlcotestingNotConfirmed"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AlcoCheckState", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public enum AlcoCheckState {

    @XmlEnumValue("NotRequired")
    NOT_REQUIRED("NotRequired"),
    @XmlEnumValue("CheckPerformed")
    CHECK_PERFORMED("CheckPerformed"),
    @XmlEnumValue("CheckRefused")
    CHECK_REFUSED("CheckRefused"),
    @XmlEnumValue("CommunicationFailure")
    COMMUNICATION_FAILURE("CommunicationFailure"),
    @XmlEnumValue("DailyAlcotestingNotConfirmed")
    DAILY_ALCOTESTING_NOT_CONFIRMED("DailyAlcotestingNotConfirmed");
    private final String value;

    AlcoCheckState(String v) {
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
    public static AlcoCheckState fromValue(String v) {
        for (AlcoCheckState c: AlcoCheckState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
