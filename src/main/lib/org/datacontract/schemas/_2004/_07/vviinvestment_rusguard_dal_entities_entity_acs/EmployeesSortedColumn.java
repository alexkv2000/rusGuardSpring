
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for EmployeesSortedColumn</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EmployeesSortedColumn">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="ID"/>
 *     <enumeration value="FIO"/>
 *     <enumeration value="EmployeeGroup"/>
 *     <enumeration value="Position"/>
 *     <enumeration value="TabNumber"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EmployeesSortedColumn", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public enum EmployeesSortedColumn {

    @XmlEnumValue("None")
    NONE("None"),
    ID("ID"),
    FIO("FIO"),
    @XmlEnumValue("EmployeeGroup")
    EMPLOYEE_GROUP("EmployeeGroup"),
    @XmlEnumValue("Position")
    POSITION("Position"),
    @XmlEnumValue("TabNumber")
    TAB_NUMBER("TabNumber");
    private final String value;

    EmployeesSortedColumn(String v) {
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
    public static EmployeesSortedColumn fromValue(String v) {
        for (EmployeesSortedColumn c: EmployeesSortedColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
