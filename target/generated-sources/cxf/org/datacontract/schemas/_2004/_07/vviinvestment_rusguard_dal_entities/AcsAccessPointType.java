
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for AcsAccessPointType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="AcsAccessPointType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *     &lt;enumeration value="Door"/&gt;
 *     &lt;enumeration value="OneSidedDoor"/&gt;
 *     &lt;enumeration value="Tourniquet"/&gt;
 *     &lt;enumeration value="Gate"/&gt;
 *     &lt;enumeration value="Locker"/&gt;
 *     &lt;enumeration value="KeyCabinet"/&gt;
 *     &lt;enumeration value="RoomKey"/&gt;
 *     &lt;enumeration value="FaceController"/&gt;
 *     &lt;enumeration value="Gateway"/&gt;
 *     &lt;enumeration value="PostOfficeBoxCell"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AcsAccessPointType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
public enum AcsAccessPointType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Door")
    DOOR("Door"),
    @XmlEnumValue("OneSidedDoor")
    ONE_SIDED_DOOR("OneSidedDoor"),
    @XmlEnumValue("Tourniquet")
    TOURNIQUET("Tourniquet"),
    @XmlEnumValue("Gate")
    GATE("Gate"),
    @XmlEnumValue("Locker")
    LOCKER("Locker"),
    @XmlEnumValue("KeyCabinet")
    KEY_CABINET("KeyCabinet"),
    @XmlEnumValue("RoomKey")
    ROOM_KEY("RoomKey"),
    @XmlEnumValue("FaceController")
    FACE_CONTROLLER("FaceController"),
    @XmlEnumValue("Gateway")
    GATEWAY("Gateway"),
    @XmlEnumValue("PostOfficeBoxCell")
    POST_OFFICE_BOX_CELL("PostOfficeBoxCell");
    private final String value;

    AcsAccessPointType(String v) {
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
    public static AcsAccessPointType fromValue(String v) {
        for (AcsAccessPointType c: AcsAccessPointType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
