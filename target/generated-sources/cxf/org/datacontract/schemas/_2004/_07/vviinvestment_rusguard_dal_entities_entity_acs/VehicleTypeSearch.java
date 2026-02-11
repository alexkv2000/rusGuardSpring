
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VehicleTypeSearch</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VehicleTypeSearch">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Name"/>
 *     <enumeration value="Brand"/>
 *     <enumeration value="RegistrationNumber"/>
 *     <enumeration value="Keys"/>
 *     <enumeration value="Color"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VehicleTypeSearch", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
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
