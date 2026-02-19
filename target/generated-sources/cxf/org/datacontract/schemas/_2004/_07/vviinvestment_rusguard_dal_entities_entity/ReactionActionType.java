
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for ReactionActionType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="ReactionActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SendSMS"/&gt;
 *     &lt;enumeration value="SendEmail"/&gt;
 *     &lt;enumeration value="ExecuteProgram"/&gt;
 *     &lt;enumeration value="RecordVideo"/&gt;
 *     &lt;enumeration value="SendReport"/&gt;
 *     &lt;enumeration value="SendCommand"/&gt;
 *     &lt;enumeration value="ClearLogs"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ReactionActionType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public enum ReactionActionType {

    @XmlEnumValue("SendSMS")
    SEND_SMS("SendSMS"),
    @XmlEnumValue("SendEmail")
    SEND_EMAIL("SendEmail"),
    @XmlEnumValue("ExecuteProgram")
    EXECUTE_PROGRAM("ExecuteProgram"),
    @XmlEnumValue("RecordVideo")
    RECORD_VIDEO("RecordVideo"),
    @XmlEnumValue("SendReport")
    SEND_REPORT("SendReport"),
    @XmlEnumValue("SendCommand")
    SEND_COMMAND("SendCommand"),
    @XmlEnumValue("ClearLogs")
    CLEAR_LOGS("ClearLogs");
    private final String value;

    ReactionActionType(String v) {
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
    public static ReactionActionType fromValue(String v) {
        for (ReactionActionType c: ReactionActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
