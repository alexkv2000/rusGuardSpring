
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SmtpEncryptionType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="SmtpEncryptionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotRequired"/&gt;
 *     &lt;enumeration value="SSL"/&gt;
 *     &lt;enumeration value="TLS"/&gt;
 *     &lt;enumeration value="Auto"/&gt;
 *     &lt;enumeration value="StartTls"/&gt;
 *     &lt;enumeration value="StartTlsWhenAvailable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SmtpEncryptionType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
public enum SmtpEncryptionType {

    @XmlEnumValue("NotRequired")
    NOT_REQUIRED("NotRequired"),
    SSL("SSL"),
    TLS("TLS"),
    @XmlEnumValue("Auto")
    AUTO("Auto"),
    @XmlEnumValue("StartTls")
    START_TLS("StartTls"),
    @XmlEnumValue("StartTlsWhenAvailable")
    START_TLS_WHEN_AVAILABLE("StartTlsWhenAvailable");
    private final String value;

    SmtpEncryptionType(String v) {
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
    public static SmtpEncryptionType fromValue(String v) {
        for (SmtpEncryptionType c: SmtpEncryptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
