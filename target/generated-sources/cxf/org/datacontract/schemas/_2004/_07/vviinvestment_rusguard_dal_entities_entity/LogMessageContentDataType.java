
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for LogMessageContentDataType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="LogMessageContentDataType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IVideonLocalArchiveRecord"/>
 *     <enumeration value="IVideonAccountArchiveRecord"/>
 *     <enumeration value="PanasonicArchveRecord"/>
 *     <enumeration value="ISSArchiveRecord"/>
 *     <enumeration value="NUUOArchiveRecord"/>
 *     <enumeration value="TrassirArchiveRecord"/>
 *     <enumeration value="IdisArchiveRecord"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LogMessageContentDataType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
public enum LogMessageContentDataType {

    @XmlEnumValue("IVideonLocalArchiveRecord")
    I_VIDEON_LOCAL_ARCHIVE_RECORD("IVideonLocalArchiveRecord"),
    @XmlEnumValue("IVideonAccountArchiveRecord")
    I_VIDEON_ACCOUNT_ARCHIVE_RECORD("IVideonAccountArchiveRecord"),
    @XmlEnumValue("PanasonicArchveRecord")
    PANASONIC_ARCHVE_RECORD("PanasonicArchveRecord"),
    @XmlEnumValue("ISSArchiveRecord")
    ISS_ARCHIVE_RECORD("ISSArchiveRecord"),
    @XmlEnumValue("NUUOArchiveRecord")
    NUUO_ARCHIVE_RECORD("NUUOArchiveRecord"),
    @XmlEnumValue("TrassirArchiveRecord")
    TRASSIR_ARCHIVE_RECORD("TrassirArchiveRecord"),
    @XmlEnumValue("IdisArchiveRecord")
    IDIS_ARCHIVE_RECORD("IdisArchiveRecord");
    private final String value;

    LogMessageContentDataType(String v) {
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
    public static LogMessageContentDataType fromValue(String v) {
        for (LogMessageContentDataType c: LogMessageContentDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
