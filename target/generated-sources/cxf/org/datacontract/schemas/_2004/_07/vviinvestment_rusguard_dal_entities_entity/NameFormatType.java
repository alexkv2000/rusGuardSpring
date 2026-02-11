
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for NameFormatType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="NameFormatType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Empty"/>
 *     <enumeration value="Format1"/>
 *     <enumeration value="Format2"/>
 *     <enumeration value="Format3"/>
 *     <enumeration value="Format4"/>
 *     <enumeration value="Format5"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "NameFormatType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
public enum NameFormatType {

    @XmlEnumValue("Empty")
    EMPTY("Empty"),
    @XmlEnumValue("Format1")
    FORMAT_1("Format1"),
    @XmlEnumValue("Format2")
    FORMAT_2("Format2"),
    @XmlEnumValue("Format3")
    FORMAT_3("Format3"),
    @XmlEnumValue("Format4")
    FORMAT_4("Format4"),
    @XmlEnumValue("Format5")
    FORMAT_5("Format5");
    private final String value;

    NameFormatType(String v) {
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
    public static NameFormatType fromValue(String v) {
        for (NameFormatType c: NameFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
