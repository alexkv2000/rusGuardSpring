
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for EmployeeBiometricStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="EmployeeBiometricStatus">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="AccountNotFound"/>
 *     <enumeration value="NotAgreement"/>
 *     <enumeration value="InvalidBiometricData"/>
 *     <enumeration value="Active"/>
 *     <enumeration value="NotFound"/>
 *     <enumeration value="Error"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "EmployeeBiometricStatus", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.EBS")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
public enum EmployeeBiometricStatus {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("AccountNotFound")
    ACCOUNT_NOT_FOUND("AccountNotFound"),
    @XmlEnumValue("NotAgreement")
    NOT_AGREEMENT("NotAgreement"),
    @XmlEnumValue("InvalidBiometricData")
    INVALID_BIOMETRIC_DATA("InvalidBiometricData"),
    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    EmployeeBiometricStatus(String v) {
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
    public static EmployeeBiometricStatus fromValue(String v) {
        for (EmployeeBiometricStatus c: EmployeeBiometricStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
