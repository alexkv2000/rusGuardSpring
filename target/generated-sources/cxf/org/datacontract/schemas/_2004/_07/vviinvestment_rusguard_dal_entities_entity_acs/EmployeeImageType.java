
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for EmployeeImageType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="EmployeeImageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Photo"/&gt;
 *     &lt;enumeration value="PassportImage"/&gt;
 *     &lt;enumeration value="DriverLicenseImage"/&gt;
 *     &lt;enumeration value="ForeignPassportImage"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmployeeImageType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
public enum EmployeeImageType {

    @XmlEnumValue("Photo")
    PHOTO("Photo"),
    @XmlEnumValue("PassportImage")
    PASSPORT_IMAGE("PassportImage"),
    @XmlEnumValue("DriverLicenseImage")
    DRIVER_LICENSE_IMAGE("DriverLicenseImage"),
    @XmlEnumValue("ForeignPassportImage")
    FOREIGN_PASSPORT_IMAGE("ForeignPassportImage");
    private final String value;

    EmployeeImageType(String v) {
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
    public static EmployeeImageType fromValue(String v) {
        for (EmployeeImageType c: EmployeeImageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
