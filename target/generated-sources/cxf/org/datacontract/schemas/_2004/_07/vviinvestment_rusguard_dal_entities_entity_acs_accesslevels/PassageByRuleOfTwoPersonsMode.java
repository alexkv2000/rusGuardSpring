
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs_accesslevels;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for PassageByRuleOfTwoPersonsMode</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="PassageByRuleOfTwoPersonsMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Off"/&gt;
 *     &lt;enumeration value="FirstPerson"/&gt;
 *     &lt;enumeration value="SecondPerson"/&gt;
 *     &lt;enumeration value="DoublePass"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PassageByRuleOfTwoPersonsMode", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
public enum PassageByRuleOfTwoPersonsMode {

    @XmlEnumValue("Off")
    OFF("Off"),
    @XmlEnumValue("FirstPerson")
    FIRST_PERSON("FirstPerson"),
    @XmlEnumValue("SecondPerson")
    SECOND_PERSON("SecondPerson"),
    @XmlEnumValue("DoublePass")
    DOUBLE_PASS("DoublePass");
    private final String value;

    PassageByRuleOfTwoPersonsMode(String v) {
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
    public static PassageByRuleOfTwoPersonsMode fromValue(String v) {
        for (PassageByRuleOfTwoPersonsMode c: PassageByRuleOfTwoPersonsMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
