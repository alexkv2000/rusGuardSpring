
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for EmployeeBiometricStatus</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="EmployeeBiometricStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="AccountNotFound"/&gt;
 *     &lt;enumeration value="NotAgreement"/&gt;
 *     &lt;enumeration value="InvalidBiometricData"/&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="NotFound"/&gt;
 *     &lt;enumeration value="Error"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmployeeBiometricStatus", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.EBS")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
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
