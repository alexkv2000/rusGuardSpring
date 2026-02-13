
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for EmployeeSortedColumn</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="EmployeeSortedColumn"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="FullName"/&gt;
 *     &lt;enumeration value="LastName"/&gt;
 *     &lt;enumeration value="FirstName"/&gt;
 *     &lt;enumeration value="SecondName"/&gt;
 *     &lt;enumeration value="TabNumber"/&gt;
 *     &lt;enumeration value="Position"/&gt;
 *     &lt;enumeration value="Satatus"/&gt;
 *     &lt;enumeration value="FirstKey"/&gt;
 *     &lt;enumeration value="SecondKey"/&gt;
 *     &lt;enumeration value="AccessLevel"/&gt;
 *     &lt;enumeration value="WorkSchedule"/&gt;
 *     &lt;enumeration value="WorkZone"/&gt;
 *     &lt;enumeration value="IsPhotoAny"/&gt;
 *     &lt;enumeration value="GroupPath"/&gt;
 *     &lt;enumeration value="ModificationDateTime"/&gt;
 *     &lt;enumeration value="CreationDateTime"/&gt;
 *     &lt;enumeration value="RowNumberKey"/&gt;
 *     &lt;enumeration value="AllKeys"/&gt;
 *     &lt;enumeration value="IsVehicleAny"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmployeeSortedColumn", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
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
