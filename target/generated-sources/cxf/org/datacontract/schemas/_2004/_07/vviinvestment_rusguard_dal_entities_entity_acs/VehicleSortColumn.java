
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for VehicleSortColumn</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="VehicleSortColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Name"/>
 *     <enumeration value="Brand"/>
 *     <enumeration value="Color"/>
 *     <enumeration value="Lock"/>
 *     <enumeration value="RegistrationNumber"/>
 *     <enumeration value="GroupName"/>
 *     <enumeration value="ModificationTime"/>
 *     <enumeration value="CreationTime"/>
 *     <enumeration value="NameAndGroup"/>
 *     <enumeration value="IsPhotoAny"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VehicleSortColumn", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
public enum VehicleSortColumn {

    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("Brand")
    BRAND("Brand"),
    @XmlEnumValue("Color")
    COLOR("Color"),
    @XmlEnumValue("Lock")
    LOCK("Lock"),
    @XmlEnumValue("RegistrationNumber")
    REGISTRATION_NUMBER("RegistrationNumber"),
    @XmlEnumValue("GroupName")
    GROUP_NAME("GroupName"),
    @XmlEnumValue("ModificationTime")
    MODIFICATION_TIME("ModificationTime"),
    @XmlEnumValue("CreationTime")
    CREATION_TIME("CreationTime"),
    @XmlEnumValue("NameAndGroup")
    NAME_AND_GROUP("NameAndGroup"),
    @XmlEnumValue("IsPhotoAny")
    IS_PHOTO_ANY("IsPhotoAny");
    private final String value;

    VehicleSortColumn(String v) {
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
    public static VehicleSortColumn fromValue(String v) {
        for (VehicleSortColumn c: VehicleSortColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
