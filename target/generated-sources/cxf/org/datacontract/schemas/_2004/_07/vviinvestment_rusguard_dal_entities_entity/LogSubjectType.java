
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for LogSubjectType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="LogSubjectType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Operator"/&gt;
 *     &lt;enumeration value="OperatorGroup"/&gt;
 *     &lt;enumeration value="Employee"/&gt;
 *     &lt;enumeration value="EmployeeGroup"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LogSubjectType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public enum LogSubjectType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Operator")
    OPERATOR("Operator"),
    @XmlEnumValue("OperatorGroup")
    OPERATOR_GROUP("OperatorGroup"),
    @XmlEnumValue("Employee")
    EMPLOYEE("Employee"),
    @XmlEnumValue("EmployeeGroup")
    EMPLOYEE_GROUP("EmployeeGroup");
    private final String value;

    LogSubjectType(String v) {
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
    public static LogSubjectType fromValue(String v) {
        for (LogSubjectType c: LogSubjectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
