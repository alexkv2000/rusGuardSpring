
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VehicleTypeSearch</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="VehicleTypeSearch"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Name"/&gt;
 *     &lt;enumeration value="Brand"/&gt;
 *     &lt;enumeration value="RegistrationNumber"/&gt;
 *     &lt;enumeration value="Keys"/&gt;
 *     &lt;enumeration value="Color"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "VehicleTypeSearch", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
public enum VehicleTypeSearch {

    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("Brand")
    BRAND("Brand"),
    @XmlEnumValue("RegistrationNumber")
    REGISTRATION_NUMBER("RegistrationNumber"),
    @XmlEnumValue("Keys")
    KEYS("Keys"),
    @XmlEnumValue("Color")
    COLOR("Color");
    private final String value;

    VehicleTypeSearch(String v) {
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
    public static VehicleTypeSearch fromValue(String v) {
        for (VehicleTypeSearch c: VehicleTypeSearch.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
