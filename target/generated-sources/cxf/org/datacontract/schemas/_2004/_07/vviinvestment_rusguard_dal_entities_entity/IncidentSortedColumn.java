
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for IncidentSortedColumn</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="IncidentSortedColumn"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="Time"/&gt;
 *     &lt;enumeration value="IsIncludeToReport"/&gt;
 *     &lt;enumeration value="SignificanceName"/&gt;
 *     &lt;enumeration value="DocumentNumber"/&gt;
 *     &lt;enumeration value="DocumentTypeName"/&gt;
 *     &lt;enumeration value="SecurityGroupName"/&gt;
 *     &lt;enumeration value="BranchName"/&gt;
 *     &lt;enumeration value="Location"/&gt;
 *     &lt;enumeration value="LocationClarification"/&gt;
 *     &lt;enumeration value="EmployeeFullName"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IncidentSortedColumn", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public enum IncidentSortedColumn {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Time")
    TIME("Time"),
    @XmlEnumValue("IsIncludeToReport")
    IS_INCLUDE_TO_REPORT("IsIncludeToReport"),
    @XmlEnumValue("SignificanceName")
    SIGNIFICANCE_NAME("SignificanceName"),
    @XmlEnumValue("DocumentNumber")
    DOCUMENT_NUMBER("DocumentNumber"),
    @XmlEnumValue("DocumentTypeName")
    DOCUMENT_TYPE_NAME("DocumentTypeName"),
    @XmlEnumValue("SecurityGroupName")
    SECURITY_GROUP_NAME("SecurityGroupName"),
    @XmlEnumValue("BranchName")
    BRANCH_NAME("BranchName"),
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("LocationClarification")
    LOCATION_CLARIFICATION("LocationClarification"),
    @XmlEnumValue("EmployeeFullName")
    EMPLOYEE_FULL_NAME("EmployeeFullName");
    private final String value;

    IncidentSortedColumn(String v) {
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
    public static IncidentSortedColumn fromValue(String v) {
        for (IncidentSortedColumn c: IncidentSortedColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
