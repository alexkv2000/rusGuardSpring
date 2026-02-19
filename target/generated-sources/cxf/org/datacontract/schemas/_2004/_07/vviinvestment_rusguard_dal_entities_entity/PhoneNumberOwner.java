
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for PhoneNumberOwner</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="PhoneNumberOwner"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Employee"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PhoneNumberOwner", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public enum PhoneNumberOwner {

    @XmlEnumValue("Employee")
    EMPLOYEE("Employee");
    private final String value;

    PhoneNumberOwner(String v) {
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
    public static PhoneNumberOwner fromValue(String v) {
        for (PhoneNumberOwner c: PhoneNumberOwner.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
