
package org.datacontract.schemas._2004._07.system_net;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for AddressFamily</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AddressFamily">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Unknown"/>
 *     <enumeration value="Unspecified"/>
 *     <enumeration value="Unix"/>
 *     <enumeration value="InterNetwork"/>
 *     <enumeration value="ImpLink"/>
 *     <enumeration value="Pup"/>
 *     <enumeration value="Chaos"/>
 *     <enumeration value="NS"/>
 *     <enumeration value="Ipx"/>
 *     <enumeration value="Iso"/>
 *     <enumeration value="Osi"/>
 *     <enumeration value="Ecma"/>
 *     <enumeration value="DataKit"/>
 *     <enumeration value="Ccitt"/>
 *     <enumeration value="Sna"/>
 *     <enumeration value="DecNet"/>
 *     <enumeration value="DataLink"/>
 *     <enumeration value="Lat"/>
 *     <enumeration value="HyperChannel"/>
 *     <enumeration value="AppleTalk"/>
 *     <enumeration value="NetBios"/>
 *     <enumeration value="VoiceView"/>
 *     <enumeration value="FireFox"/>
 *     <enumeration value="Banyan"/>
 *     <enumeration value="Atm"/>
 *     <enumeration value="InterNetworkV6"/>
 *     <enumeration value="Cluster"/>
 *     <enumeration value="Ieee12844"/>
 *     <enumeration value="Irda"/>
 *     <enumeration value="NetworkDesigners"/>
 *     <enumeration value="Max"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AddressFamily", namespace = "http://schemas.datacontract.org/2004/07/System.Net.Sockets")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
public enum AddressFamily {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified"),
    @XmlEnumValue("Unix")
    UNIX("Unix"),
    @XmlEnumValue("InterNetwork")
    INTER_NETWORK("InterNetwork"),
    @XmlEnumValue("ImpLink")
    IMP_LINK("ImpLink"),
    @XmlEnumValue("Pup")
    PUP("Pup"),
    @XmlEnumValue("Chaos")
    CHAOS("Chaos"),
    NS("NS"),
    @XmlEnumValue("Ipx")
    IPX("Ipx"),
    @XmlEnumValue("Iso")
    ISO("Iso"),
    @XmlEnumValue("Osi")
    OSI("Osi"),
    @XmlEnumValue("Ecma")
    ECMA("Ecma"),
    @XmlEnumValue("DataKit")
    DATA_KIT("DataKit"),
    @XmlEnumValue("Ccitt")
    CCITT("Ccitt"),
    @XmlEnumValue("Sna")
    SNA("Sna"),
    @XmlEnumValue("DecNet")
    DEC_NET("DecNet"),
    @XmlEnumValue("DataLink")
    DATA_LINK("DataLink"),
    @XmlEnumValue("Lat")
    LAT("Lat"),
    @XmlEnumValue("HyperChannel")
    HYPER_CHANNEL("HyperChannel"),
    @XmlEnumValue("AppleTalk")
    APPLE_TALK("AppleTalk"),
    @XmlEnumValue("NetBios")
    NET_BIOS("NetBios"),
    @XmlEnumValue("VoiceView")
    VOICE_VIEW("VoiceView"),
    @XmlEnumValue("FireFox")
    FIRE_FOX("FireFox"),
    @XmlEnumValue("Banyan")
    BANYAN("Banyan"),
    @XmlEnumValue("Atm")
    ATM("Atm"),
    @XmlEnumValue("InterNetworkV6")
    INTER_NETWORK_V_6("InterNetworkV6"),
    @XmlEnumValue("Cluster")
    CLUSTER("Cluster"),
    @XmlEnumValue("Ieee12844")
    IEEE_12844("Ieee12844"),
    @XmlEnumValue("Irda")
    IRDA("Irda"),
    @XmlEnumValue("NetworkDesigners")
    NETWORK_DESIGNERS("NetworkDesigners"),
    @XmlEnumValue("Max")
    MAX("Max");
    private final String value;

    AddressFamily(String v) {
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
    public static AddressFamily fromValue(String v) {
        for (AddressFamily c: AddressFamily.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
