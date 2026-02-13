
package org.datacontract.schemas._2004._07.system_net;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for AddressFamily</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="AddressFamily"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Unspecified"/&gt;
 *     &lt;enumeration value="Unix"/&gt;
 *     &lt;enumeration value="InterNetwork"/&gt;
 *     &lt;enumeration value="ImpLink"/&gt;
 *     &lt;enumeration value="Pup"/&gt;
 *     &lt;enumeration value="Chaos"/&gt;
 *     &lt;enumeration value="NS"/&gt;
 *     &lt;enumeration value="Ipx"/&gt;
 *     &lt;enumeration value="Iso"/&gt;
 *     &lt;enumeration value="Osi"/&gt;
 *     &lt;enumeration value="Ecma"/&gt;
 *     &lt;enumeration value="DataKit"/&gt;
 *     &lt;enumeration value="Ccitt"/&gt;
 *     &lt;enumeration value="Sna"/&gt;
 *     &lt;enumeration value="DecNet"/&gt;
 *     &lt;enumeration value="DataLink"/&gt;
 *     &lt;enumeration value="Lat"/&gt;
 *     &lt;enumeration value="HyperChannel"/&gt;
 *     &lt;enumeration value="AppleTalk"/&gt;
 *     &lt;enumeration value="NetBios"/&gt;
 *     &lt;enumeration value="VoiceView"/&gt;
 *     &lt;enumeration value="FireFox"/&gt;
 *     &lt;enumeration value="Banyan"/&gt;
 *     &lt;enumeration value="Atm"/&gt;
 *     &lt;enumeration value="InterNetworkV6"/&gt;
 *     &lt;enumeration value="Cluster"/&gt;
 *     &lt;enumeration value="Ieee12844"/&gt;
 *     &lt;enumeration value="Irda"/&gt;
 *     &lt;enumeration value="NetworkDesigners"/&gt;
 *     &lt;enumeration value="Max"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AddressFamily", namespace = "http://schemas.datacontract.org/2004/07/System.Net.Sockets")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
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
