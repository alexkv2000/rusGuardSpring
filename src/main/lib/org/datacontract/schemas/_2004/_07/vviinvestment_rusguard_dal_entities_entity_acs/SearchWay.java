
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SearchWay</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SearchWay">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="FIO"/>
 *     <enumeration value="TableNumber"/>
 *     <enumeration value="Keys"/>
 *     <enumeration value="Email"/>
 *     <enumeration value="Phone"/>
 *     <enumeration value="Birthday"/>
 *     <enumeration value="PassportNumber"/>
 *     <enumeration value="AddField"/>
 *     <enumeration value="InternationalNumber"/>
 *     <enumeration value="DrivingLicenseNumber"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SearchWay", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
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
