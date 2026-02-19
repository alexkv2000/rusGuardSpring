
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_driver;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for NTechLabConfigSyncState</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="NTechLabConfigSyncState"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Ok"/&gt;
 *     &lt;enumeration value="ServiceNotAvailable"/&gt;
 *     &lt;enumeration value="InvalidCredentials"/&gt;
 *     &lt;enumeration value="ApiCallError"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NTechLabConfigSyncState", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public enum NTechLabConfigSyncState {

    @XmlEnumValue("Ok")
    OK("Ok"),
    @XmlEnumValue("ServiceNotAvailable")
    SERVICE_NOT_AVAILABLE("ServiceNotAvailable"),
    @XmlEnumValue("InvalidCredentials")
    INVALID_CREDENTIALS("InvalidCredentials"),
    @XmlEnumValue("ApiCallError")
    API_CALL_ERROR("ApiCallError");
    private final String value;

    NTechLabConfigSyncState(String v) {
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
    public static NTechLabConfigSyncState fromValue(String v) {
        for (NTechLabConfigSyncState c: NTechLabConfigSyncState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
