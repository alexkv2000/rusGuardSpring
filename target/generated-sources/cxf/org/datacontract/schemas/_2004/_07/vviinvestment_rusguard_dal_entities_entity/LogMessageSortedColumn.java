
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for LogMessageSortedColumn</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="LogMessageSortedColumn"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Id"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="LogMessageType"/&gt;
 *     &lt;enumeration value="LogMessageSubType"/&gt;
 *     &lt;enumeration value="Message"/&gt;
 *     &lt;enumeration value="Details"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LogMessageSortedColumn", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public enum LogMessageSortedColumn {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Id")
    ID("Id"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("LogMessageType")
    LOG_MESSAGE_TYPE("LogMessageType"),
    @XmlEnumValue("LogMessageSubType")
    LOG_MESSAGE_SUB_TYPE("LogMessageSubType"),
    @XmlEnumValue("Message")
    MESSAGE("Message"),
    @XmlEnumValue("Details")
    DETAILS("Details");
    private final String value;

    LogMessageSortedColumn(String v) {
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
    public static LogMessageSortedColumn fromValue(String v) {
        for (LogMessageSortedColumn c: LogMessageSortedColumn.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
