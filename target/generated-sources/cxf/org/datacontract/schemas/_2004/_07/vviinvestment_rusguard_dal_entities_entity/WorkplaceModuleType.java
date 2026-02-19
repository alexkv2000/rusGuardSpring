
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for WorkplaceModuleType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="WorkplaceModuleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EquipmentConfigurator"/&gt;
 *     &lt;enumeration value="AcsConfigurator"/&gt;
 *     &lt;enumeration value="WorkstationConfigurator"/&gt;
 *     &lt;enumeration value="SystemConfigurator"/&gt;
 *     &lt;enumeration value="Maps"/&gt;
 *     &lt;enumeration value="Reports"/&gt;
 *     &lt;enumeration value="PhotoIdentification"/&gt;
 *     &lt;enumeration value="Statistics"/&gt;
 *     &lt;enumeration value="VisitorsScoreboard"/&gt;
 *     &lt;enumeration value="Administrator"/&gt;
 *     &lt;enumeration value="Leader"/&gt;
 *     &lt;enumeration value="RemoteTerminal"/&gt;
 *     &lt;enumeration value="Incidents"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkplaceModuleType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public enum WorkplaceModuleType {

    @XmlEnumValue("EquipmentConfigurator")
    EQUIPMENT_CONFIGURATOR("EquipmentConfigurator"),
    @XmlEnumValue("AcsConfigurator")
    ACS_CONFIGURATOR("AcsConfigurator"),
    @XmlEnumValue("WorkstationConfigurator")
    WORKSTATION_CONFIGURATOR("WorkstationConfigurator"),
    @XmlEnumValue("SystemConfigurator")
    SYSTEM_CONFIGURATOR("SystemConfigurator"),
    @XmlEnumValue("Maps")
    MAPS("Maps"),
    @XmlEnumValue("Reports")
    REPORTS("Reports"),
    @XmlEnumValue("PhotoIdentification")
    PHOTO_IDENTIFICATION("PhotoIdentification"),
    @XmlEnumValue("Statistics")
    STATISTICS("Statistics"),
    @XmlEnumValue("VisitorsScoreboard")
    VISITORS_SCOREBOARD("VisitorsScoreboard"),
    @XmlEnumValue("Administrator")
    ADMINISTRATOR("Administrator"),
    @XmlEnumValue("Leader")
    LEADER("Leader"),
    @XmlEnumValue("RemoteTerminal")
    REMOTE_TERMINAL("RemoteTerminal"),
    @XmlEnumValue("Incidents")
    INCIDENTS("Incidents");
    private final String value;

    WorkplaceModuleType(String v) {
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
    public static WorkplaceModuleType fromValue(String v) {
        for (WorkplaceModuleType c: WorkplaceModuleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
