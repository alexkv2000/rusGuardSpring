
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SearchWay</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="SearchWay"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FIO"/&gt;
 *     &lt;enumeration value="TableNumber"/&gt;
 *     &lt;enumeration value="Keys"/&gt;
 *     &lt;enumeration value="Email"/&gt;
 *     &lt;enumeration value="Phone"/&gt;
 *     &lt;enumeration value="Birthday"/&gt;
 *     &lt;enumeration value="PassportNumber"/&gt;
 *     &lt;enumeration value="AddField"/&gt;
 *     &lt;enumeration value="InternationalNumber"/&gt;
 *     &lt;enumeration value="DrivingLicenseNumber"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SearchWay", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
public enum SearchWay {

    FIO("FIO"),
    @XmlEnumValue("TableNumber")
    TABLE_NUMBER("TableNumber"),
    @XmlEnumValue("Keys")
    KEYS("Keys"),
    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("Birthday")
    BIRTHDAY("Birthday"),
    @XmlEnumValue("PassportNumber")
    PASSPORT_NUMBER("PassportNumber"),
    @XmlEnumValue("AddField")
    ADD_FIELD("AddField"),
    @XmlEnumValue("InternationalNumber")
    INTERNATIONAL_NUMBER("InternationalNumber"),
    @XmlEnumValue("DrivingLicenseNumber")
    DRIVING_LICENSE_NUMBER("DrivingLicenseNumber");
    private final String value;

    SearchWay(String v) {
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
    public static SearchWay fromValue(String v) {
        for (SearchWay c: SearchWay.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
