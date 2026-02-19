
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SectorAuthentication</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="SectorAuthentication"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ProtectionDataAndUID"/&gt;
 *     &lt;enumeration value="ProtectionData"/&gt;
 *     &lt;enumeration value="ProtectionDataOrUID"/&gt;
 *     &lt;enumeration value="Sector"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SectorAuthentication", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public enum SectorAuthentication {

    @XmlEnumValue("ProtectionDataAndUID")
    PROTECTION_DATA_AND_UID("ProtectionDataAndUID"),
    @XmlEnumValue("ProtectionData")
    PROTECTION_DATA("ProtectionData"),
    @XmlEnumValue("ProtectionDataOrUID")
    PROTECTION_DATA_OR_UID("ProtectionDataOrUID"),
    @XmlEnumValue("Sector")
    SECTOR("Sector");
    private final String value;

    SectorAuthentication(String v) {
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
    public static SectorAuthentication fromValue(String v) {
        for (SectorAuthentication c: SectorAuthentication.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
