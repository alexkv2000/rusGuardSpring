
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DictionaryType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="DictionaryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DocumentType"/&gt;
 *     &lt;enumeration value="Significance"/&gt;
 *     &lt;enumeration value="Position"/&gt;
 *     &lt;enumeration value="Location"/&gt;
 *     &lt;enumeration value="LocationClarification"/&gt;
 *     &lt;enumeration value="SecurityGroup"/&gt;
 *     &lt;enumeration value="IncidentType"/&gt;
 *     &lt;enumeration value="IncidentNature"/&gt;
 *     &lt;enumeration value="TheftMethod"/&gt;
 *     &lt;enumeration value="Organization"/&gt;
 *     &lt;enumeration value="Subdivision"/&gt;
 *     &lt;enumeration value="StatusOfPerson"/&gt;
 *     &lt;enumeration value="Punishment"/&gt;
 *     &lt;enumeration value="Detention"/&gt;
 *     &lt;enumeration value="WhoTransferredWealth"/&gt;
 *     &lt;enumeration value="WhoTransferredDocument"/&gt;
 *     &lt;enumeration value="WhoTransferredDecisionDocument"/&gt;
 *     &lt;enumeration value="PersonalDocumentType"/&gt;
 *     &lt;enumeration value="DecisionDocumentType"/&gt;
 *     &lt;enumeration value="FinalPunishment"/&gt;
 *     &lt;enumeration value="ExtraFinalPunishment"/&gt;
 *     &lt;enumeration value="Measure"/&gt;
 *     &lt;enumeration value="Tangibles"/&gt;
 *     &lt;enumeration value="OrganizationType"/&gt;
 *     &lt;enumeration value="VehicleType"/&gt;
 *     &lt;enumeration value="Branch"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DictionaryType", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
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
