
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for EmployeeSortedColumn</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EmployeeSortedColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="FullName"/>
 *     <enumeration value="LastName"/>
 *     <enumeration value="FirstName"/>
 *     <enumeration value="SecondName"/>
 *     <enumeration value="TabNumber"/>
 *     <enumeration value="Position"/>
 *     <enumeration value="Satatus"/>
 *     <enumeration value="FirstKey"/>
 *     <enumeration value="SecondKey"/>
 *     <enumeration value="AccessLevel"/>
 *     <enumeration value="WorkSchedule"/>
 *     <enumeration value="WorkZone"/>
 *     <enumeration value="IsPhotoAny"/>
 *     <enumeration value="GroupPath"/>
 *     <enumeration value="ModificationDateTime"/>
 *     <enumeration value="CreationDateTime"/>
 *     <enumeration value="RowNumberKey"/>
 *     <enumeration value="AllKeys"/>
 *     <enumeration value="IsVehicleAny"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EmployeeSortedColumn", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public enum EmployeeSortedColumn {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("FullName")
    FULL_NAME("FullName"),
    @XmlEnumValue("LastName")
    LAST_NAME("LastName"),
    @XmlEnumValue("FirstName")
    FIRST_NAME("FirstName"),
    @XmlEnumValue("SecondName")
    SECOND_NAME("SecondName"),
    @XmlEnumValue("TabNumber")
    TAB_NUMBER("TabNumber"),
    @XmlEnumValue("Position")
    POSITION("Position"),
    @XmlEnumValue("Satatus")
    SATATUS("Satatus"),
    @XmlEnumValue("FirstKey")
    FIRST_KEY("FirstKey"),
    @XmlEnumValue("SecondKey")
    SECOND_KEY("SecondKey"),
    @XmlEnumValue("AccessLevel")
    ACCESS_LEVEL("AccessLevel"),
    @XmlEnumValue("WorkSchedule")
    WORK_SCHEDULE("WorkSchedule"),
    @XmlEnumValue("WorkZone")
    WORK_ZONE("WorkZone"),
    @XmlEnumValue("IsPhotoAny")
    IS_PHOTO_ANY("IsPhotoAny"),
    @XmlEnumValue("GroupPath")
    GROUP_PATH("GroupPath"),
    @XmlEnumValue("ModificationDateTime")
    MODIFICATION_DATE_TIME("ModificationDateTime"),
    @XmlEnumValue("CreationDateTime")
    CREATION_DATE_TIME("CreationDateTime"),
    @XmlEnumValue("RowNumberKey")
    ROW_NUMBER_KEY("RowNumberKey"),
    @XmlEnumValue("AllKeys")
    ALL_KEYS("AllKeys"),
    @XmlEnumValue("IsVehicleAny")
    IS_VEHICLE_ANY("IsVehicleAny");
    private final String value;

    EmployeeSortedColumn(String v) {
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
    public static EmployeeSortedColumn fromValue(String v) {
        for (EmployeeSortedColumn c: EmployeeSortedColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
