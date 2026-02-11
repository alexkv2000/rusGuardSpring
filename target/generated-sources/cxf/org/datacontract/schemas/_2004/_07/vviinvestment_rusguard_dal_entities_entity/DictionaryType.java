
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DictionaryType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DictionaryType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="DocumentType"/>
 *     <enumeration value="Significance"/>
 *     <enumeration value="Position"/>
 *     <enumeration value="Location"/>
 *     <enumeration value="LocationClarification"/>
 *     <enumeration value="SecurityGroup"/>
 *     <enumeration value="IncidentType"/>
 *     <enumeration value="IncidentNature"/>
 *     <enumeration value="TheftMethod"/>
 *     <enumeration value="Organization"/>
 *     <enumeration value="Subdivision"/>
 *     <enumeration value="StatusOfPerson"/>
 *     <enumeration value="Punishment"/>
 *     <enumeration value="Detention"/>
 *     <enumeration value="WhoTransferredWealth"/>
 *     <enumeration value="WhoTransferredDocument"/>
 *     <enumeration value="WhoTransferredDecisionDocument"/>
 *     <enumeration value="PersonalDocumentType"/>
 *     <enumeration value="DecisionDocumentType"/>
 *     <enumeration value="FinalPunishment"/>
 *     <enumeration value="ExtraFinalPunishment"/>
 *     <enumeration value="Measure"/>
 *     <enumeration value="Tangibles"/>
 *     <enumeration value="OrganizationType"/>
 *     <enumeration value="VehicleType"/>
 *     <enumeration value="Branch"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DictionaryType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
public enum DictionaryType {

    @XmlEnumValue("DocumentType")
    DOCUMENT_TYPE("DocumentType"),
    @XmlEnumValue("Significance")
    SIGNIFICANCE("Significance"),
    @XmlEnumValue("Position")
    POSITION("Position"),
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("LocationClarification")
    LOCATION_CLARIFICATION("LocationClarification"),
    @XmlEnumValue("SecurityGroup")
    SECURITY_GROUP("SecurityGroup"),
    @XmlEnumValue("IncidentType")
    INCIDENT_TYPE("IncidentType"),
    @XmlEnumValue("IncidentNature")
    INCIDENT_NATURE("IncidentNature"),
    @XmlEnumValue("TheftMethod")
    THEFT_METHOD("TheftMethod"),
    @XmlEnumValue("Organization")
    ORGANIZATION("Organization"),
    @XmlEnumValue("Subdivision")
    SUBDIVISION("Subdivision"),
    @XmlEnumValue("StatusOfPerson")
    STATUS_OF_PERSON("StatusOfPerson"),
    @XmlEnumValue("Punishment")
    PUNISHMENT("Punishment"),
    @XmlEnumValue("Detention")
    DETENTION("Detention"),
    @XmlEnumValue("WhoTransferredWealth")
    WHO_TRANSFERRED_WEALTH("WhoTransferredWealth"),
    @XmlEnumValue("WhoTransferredDocument")
    WHO_TRANSFERRED_DOCUMENT("WhoTransferredDocument"),
    @XmlEnumValue("WhoTransferredDecisionDocument")
    WHO_TRANSFERRED_DECISION_DOCUMENT("WhoTransferredDecisionDocument"),
    @XmlEnumValue("PersonalDocumentType")
    PERSONAL_DOCUMENT_TYPE("PersonalDocumentType"),
    @XmlEnumValue("DecisionDocumentType")
    DECISION_DOCUMENT_TYPE("DecisionDocumentType"),
    @XmlEnumValue("FinalPunishment")
    FINAL_PUNISHMENT("FinalPunishment"),
    @XmlEnumValue("ExtraFinalPunishment")
    EXTRA_FINAL_PUNISHMENT("ExtraFinalPunishment"),
    @XmlEnumValue("Measure")
    MEASURE("Measure"),
    @XmlEnumValue("Tangibles")
    TANGIBLES("Tangibles"),
    @XmlEnumValue("OrganizationType")
    ORGANIZATION_TYPE("OrganizationType"),
    @XmlEnumValue("VehicleType")
    VEHICLE_TYPE("VehicleType"),
    @XmlEnumValue("Branch")
    BRANCH("Branch");
    private final String value;

    DictionaryType(String v) {
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
    public static DictionaryType fromValue(String v) {
        for (DictionaryType c: DictionaryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
