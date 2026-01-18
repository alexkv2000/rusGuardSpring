
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for CameraProductType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="CameraProductType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Ivideon"/>
 *     <enumeration value="Panasonic"/>
 *     <enumeration value="ISS"/>
 *     <enumeration value="NUUO"/>
 *     <enumeration value="NtechLab"/>
 *     <enumeration value="Trassir"/>
 *     <enumeration value="Idis"/>
 *     <enumeration value="EBS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "CameraProductType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IvidionCamera")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public enum CameraProductType {

    @XmlEnumValue("Ivideon")
    IVIDEON("Ivideon"),
    @XmlEnumValue("Panasonic")
    PANASONIC("Panasonic"),
    ISS("ISS"),
    NUUO("NUUO"),
    @XmlEnumValue("NtechLab")
    NTECH_LAB("NtechLab"),
    @XmlEnumValue("Trassir")
    TRASSIR("Trassir"),
    @XmlEnumValue("Idis")
    IDIS("Idis"),
    EBS("EBS");
    private final String value;

    CameraProductType(String v) {
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
    public static CameraProductType fromValue(String v) {
        for (CameraProductType c: CameraProductType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
