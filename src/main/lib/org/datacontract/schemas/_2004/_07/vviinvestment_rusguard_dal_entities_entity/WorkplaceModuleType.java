
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for WorkplaceModuleType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="WorkplaceModuleType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="EquipmentConfigurator"/>
 *     <enumeration value="AcsConfigurator"/>
 *     <enumeration value="WorkstationConfigurator"/>
 *     <enumeration value="SystemConfigurator"/>
 *     <enumeration value="Maps"/>
 *     <enumeration value="Reports"/>
 *     <enumeration value="PhotoIdentification"/>
 *     <enumeration value="Statistics"/>
 *     <enumeration value="VisitorsScoreboard"/>
 *     <enumeration value="Administrator"/>
 *     <enumeration value="Leader"/>
 *     <enumeration value="RemoteTerminal"/>
 *     <enumeration value="Incidents"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "WorkplaceModuleType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
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
