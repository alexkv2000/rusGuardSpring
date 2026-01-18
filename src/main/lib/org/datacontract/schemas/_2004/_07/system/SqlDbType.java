
package org.datacontract.schemas._2004._07.system;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SqlDbType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="SqlDbType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="BigInt"/>
 *     <enumeration value="Binary"/>
 *     <enumeration value="Bit"/>
 *     <enumeration value="Char"/>
 *     <enumeration value="DateTime"/>
 *     <enumeration value="Decimal"/>
 *     <enumeration value="Float"/>
 *     <enumeration value="Image"/>
 *     <enumeration value="Int"/>
 *     <enumeration value="Money"/>
 *     <enumeration value="NChar"/>
 *     <enumeration value="NText"/>
 *     <enumeration value="NVarChar"/>
 *     <enumeration value="Real"/>
 *     <enumeration value="UniqueIdentifier"/>
 *     <enumeration value="SmallDateTime"/>
 *     <enumeration value="SmallInt"/>
 *     <enumeration value="SmallMoney"/>
 *     <enumeration value="Text"/>
 *     <enumeration value="Timestamp"/>
 *     <enumeration value="TinyInt"/>
 *     <enumeration value="VarBinary"/>
 *     <enumeration value="VarChar"/>
 *     <enumeration value="Variant"/>
 *     <enumeration value="Xml"/>
 *     <enumeration value="Udt"/>
 *     <enumeration value="Structured"/>
 *     <enumeration value="Date"/>
 *     <enumeration value="Time"/>
 *     <enumeration value="DateTime2"/>
 *     <enumeration value="DateTimeOffset"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "SqlDbType", namespace = "http://schemas.datacontract.org/2004/07/System.Data")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public enum SqlDbType {

    @XmlEnumValue("BigInt")
    BIG_INT("BigInt"),
    @XmlEnumValue("Binary")
    BINARY("Binary"),
    @XmlEnumValue("Bit")
    BIT("Bit"),
    @XmlEnumValue("Char")
    CHAR("Char"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),
    @XmlEnumValue("Float")
    FLOAT("Float"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("Int")
    INT("Int"),
    @XmlEnumValue("Money")
    MONEY("Money"),
    @XmlEnumValue("NChar")
    N_CHAR("NChar"),
    @XmlEnumValue("NText")
    N_TEXT("NText"),
    @XmlEnumValue("NVarChar")
    N_VAR_CHAR("NVarChar"),
    @XmlEnumValue("Real")
    REAL("Real"),
    @XmlEnumValue("UniqueIdentifier")
    UNIQUE_IDENTIFIER("UniqueIdentifier"),
    @XmlEnumValue("SmallDateTime")
    SMALL_DATE_TIME("SmallDateTime"),
    @XmlEnumValue("SmallInt")
    SMALL_INT("SmallInt"),
    @XmlEnumValue("SmallMoney")
    SMALL_MONEY("SmallMoney"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Timestamp")
    TIMESTAMP("Timestamp"),
    @XmlEnumValue("TinyInt")
    TINY_INT("TinyInt"),
    @XmlEnumValue("VarBinary")
    VAR_BINARY("VarBinary"),
    @XmlEnumValue("VarChar")
    VAR_CHAR("VarChar"),
    @XmlEnumValue("Variant")
    VARIANT("Variant"),
    @XmlEnumValue("Xml")
    XML("Xml"),
    @XmlEnumValue("Udt")
    UDT("Udt"),
    @XmlEnumValue("Structured")
    STRUCTURED("Structured"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Time")
    TIME("Time"),
    @XmlEnumValue("DateTime2")
    DATE_TIME_2("DateTime2"),
    @XmlEnumValue("DateTimeOffset")
    DATE_TIME_OFFSET("DateTimeOffset");
    private final String value;

    SqlDbType(String v) {
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
    public static SqlDbType fromValue(String v) {
        for (SqlDbType c: SqlDbType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
