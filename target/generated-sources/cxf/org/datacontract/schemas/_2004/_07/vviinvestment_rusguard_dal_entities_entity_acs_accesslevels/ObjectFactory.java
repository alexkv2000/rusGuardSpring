
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs_accesslevels;

import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsBoxAccessLevelSlimInfo;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsScheduleSlimInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs_accesslevels package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public class ObjectFactory {

    private static final QName _AcsAccessPointDriverInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "AcsAccessPointDriverInfo");
    private static final QName _ArrayOfAcsAccessPointDriverInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "ArrayOfAcsAccessPointDriverInfo");
    private static final QName _ArrayOfAcsAccessPointSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "ArrayOfAcsAccessPointSlimInfo");
    private static final QName _AcsAccessPointSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "AcsAccessPointSlimInfo");
    private static final QName _AcsAccessPointBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "AcsAccessPointBase");
    private static final QName _ControllerIdentificationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "ControllerIdentificationType");
    private static final QName _IdentificationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "IdentificationType");
    private static final QName _MainIdentificationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "MainIdentificationType");
    private static final QName _ArrayOfServerIdentificationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "ArrayOfServerIdentificationType");
    private static final QName _ServerIdentificationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "ServerIdentificationType");
    private static final QName _PassageByRuleOfTwoPersonsMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "PassageByRuleOfTwoPersonsMode");
    private static final QName _VehicleAssignmentCheckMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "VehicleAssignmentCheckMode");
    private static final QName _VehicleControllerIdentificationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "VehicleControllerIdentificationType");
    private static final QName _VehicleMainIdentificationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "VehicleMainIdentificationType");
    private static final QName _AccessPointSortType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "AccessPointSortType");
    private static final QName _AccessPointData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "AccessPointData");
    private static final QName _AcsAccessPointSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "AcsAccessPointSaveData");
    private static final QName _AcsAccessPointBaseAntipassback_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "Antipassback");
    private static final QName _AcsAccessPointBaseDailyAlcoholTestConfirmation_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "DailyAlcoholTestConfirmation");
    private static final QName _AcsAccessPointBaseDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "Description");
    private static final QName _AcsAccessPointBaseIsConfirmingKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "IsConfirmingKey");
    private static final QName _AcsAccessPointBaseIsGuardOffModeOn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "IsGuardOffModeOn");
    private static final QName _AcsAccessPointBaseIsGuardOnModeOn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "IsGuardOnModeOn");
    private static final QName _AcsAccessPointBaseIsLockModeOn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "IsLockModeOn");
    private static final QName _AcsAccessPointBaseIsMultiIdentification_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "IsMultiIdentification");
    private static final QName _AcsAccessPointBaseIsOpenForALongTimeModeOn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "IsOpenForALongTimeModeOn");
    private static final QName _AcsAccessPointBaseOrderedServerIdentification_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "OrderedServerIdentification");
    private static final QName _AcsAccessPointBaseOrderedServerIdentificationInString_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "OrderedServerIdentificationInString");
    private static final QName _AcsAccessPointBaseServerAlcoFrame_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "ServerAlcoFrame");
    private static final QName _AcsAccessPointBaseServerFace_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "ServerFace");
    private static final QName _AcsAccessPointBaseServerVehicle_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "ServerVehicle");
    private static final QName _AcsAccessPointBaseServerVehicleIdentification_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "ServerVehicleIdentification");
    private static final QName _AcsAccessPointBaseUseHolidaysAndTransfers_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "UseHolidaysAndTransfers");
    private static final QName _AcsAccessPointDriverInfoDriverType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "DriverType");
    private static final QName _AcsAccessPointDriverInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "Name");
    private static final QName _AcsAccessPointSlimInfoBoxAccessLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "BoxAccessLevel");
    private static final QName _AcsAccessPointSlimInfoSchedule_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "Schedule");
    private static final QName _AcsAccessPointSaveDataAcsBoxAccessLevelID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "AcsBoxAccessLevelID");
    private static final QName _AccessPointDataPoints_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", "Points");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs_accesslevels
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfAcsAccessPointDriverInfo }
     * 
     */
    public ArrayOfAcsAccessPointDriverInfo createArrayOfAcsAccessPointDriverInfo() {
        return new ArrayOfAcsAccessPointDriverInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAcsAccessPointSlimInfo }
     * 
     */
    public ArrayOfAcsAccessPointSlimInfo createArrayOfAcsAccessPointSlimInfo() {
        return new ArrayOfAcsAccessPointSlimInfo();
    }

    /**
     * Create an instance of {@link AccessPointData }
     * 
     */
    public AccessPointData createAccessPointData() {
        return new AccessPointData();
    }

    /**
     * Create an instance of {@link AcsAccessPointSaveData }
     * 
     */
    public AcsAccessPointSaveData createAcsAccessPointSaveData() {
        return new AcsAccessPointSaveData();
    }

    /**
     * Create an instance of {@link AcsAccessPointSlimInfo }
     * 
     */
    public AcsAccessPointSlimInfo createAcsAccessPointSlimInfo() {
        return new AcsAccessPointSlimInfo();
    }

    /**
     * Create an instance of {@link AcsAccessPointDriverInfo }
     * 
     */
    public AcsAccessPointDriverInfo createAcsAccessPointDriverInfo() {
        return new AcsAccessPointDriverInfo();
    }

    /**
     * Create an instance of {@link AcsAccessPointBase }
     * 
     */
    public AcsAccessPointBase createAcsAccessPointBase() {
        return new AcsAccessPointBase();
    }

    /**
     * Create an instance of {@link ArrayOfServerIdentificationType }
     * 
     */
    public ArrayOfServerIdentificationType createArrayOfServerIdentificationType() {
        return new ArrayOfServerIdentificationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsAccessPointDriverInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsAccessPointDriverInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "AcsAccessPointDriverInfo")
    public JAXBElement<AcsAccessPointDriverInfo> createAcsAccessPointDriverInfo(AcsAccessPointDriverInfo value) {
        return new JAXBElement<AcsAccessPointDriverInfo>(_AcsAccessPointDriverInfo_QNAME, AcsAccessPointDriverInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAccessPointDriverInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAccessPointDriverInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "ArrayOfAcsAccessPointDriverInfo")
    public JAXBElement<ArrayOfAcsAccessPointDriverInfo> createArrayOfAcsAccessPointDriverInfo(ArrayOfAcsAccessPointDriverInfo value) {
        return new JAXBElement<ArrayOfAcsAccessPointDriverInfo>(_ArrayOfAcsAccessPointDriverInfo_QNAME, ArrayOfAcsAccessPointDriverInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAccessPointSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAccessPointSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "ArrayOfAcsAccessPointSlimInfo")
    public JAXBElement<ArrayOfAcsAccessPointSlimInfo> createArrayOfAcsAccessPointSlimInfo(ArrayOfAcsAccessPointSlimInfo value) {
        return new JAXBElement<ArrayOfAcsAccessPointSlimInfo>(_ArrayOfAcsAccessPointSlimInfo_QNAME, ArrayOfAcsAccessPointSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsAccessPointSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsAccessPointSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "AcsAccessPointSlimInfo")
    public JAXBElement<AcsAccessPointSlimInfo> createAcsAccessPointSlimInfo(AcsAccessPointSlimInfo value) {
        return new JAXBElement<AcsAccessPointSlimInfo>(_AcsAccessPointSlimInfo_QNAME, AcsAccessPointSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsAccessPointBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsAccessPointBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "AcsAccessPointBase")
    public JAXBElement<AcsAccessPointBase> createAcsAccessPointBase(AcsAccessPointBase value) {
        return new JAXBElement<AcsAccessPointBase>(_AcsAccessPointBase_QNAME, AcsAccessPointBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "ControllerIdentificationType")
    public JAXBElement<List<String>> createControllerIdentificationType(List<String> value) {
        return new JAXBElement<List<String>>(_ControllerIdentificationType_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "IdentificationType")
    public JAXBElement<List<String>> createIdentificationType(List<String> value) {
        return new JAXBElement<List<String>>(_IdentificationType_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "MainIdentificationType")
    public JAXBElement<List<String>> createMainIdentificationType(List<String> value) {
        return new JAXBElement<List<String>>(_MainIdentificationType_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServerIdentificationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfServerIdentificationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "ArrayOfServerIdentificationType")
    public JAXBElement<ArrayOfServerIdentificationType> createArrayOfServerIdentificationType(ArrayOfServerIdentificationType value) {
        return new JAXBElement<ArrayOfServerIdentificationType>(_ArrayOfServerIdentificationType_QNAME, ArrayOfServerIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServerIdentificationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServerIdentificationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "ServerIdentificationType")
    public JAXBElement<ServerIdentificationType> createServerIdentificationType(ServerIdentificationType value) {
        return new JAXBElement<ServerIdentificationType>(_ServerIdentificationType_QNAME, ServerIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassageByRuleOfTwoPersonsMode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PassageByRuleOfTwoPersonsMode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "PassageByRuleOfTwoPersonsMode")
    public JAXBElement<PassageByRuleOfTwoPersonsMode> createPassageByRuleOfTwoPersonsMode(PassageByRuleOfTwoPersonsMode value) {
        return new JAXBElement<PassageByRuleOfTwoPersonsMode>(_PassageByRuleOfTwoPersonsMode_QNAME, PassageByRuleOfTwoPersonsMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleAssignmentCheckMode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehicleAssignmentCheckMode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "VehicleAssignmentCheckMode")
    public JAXBElement<VehicleAssignmentCheckMode> createVehicleAssignmentCheckMode(VehicleAssignmentCheckMode value) {
        return new JAXBElement<VehicleAssignmentCheckMode>(_VehicleAssignmentCheckMode_QNAME, VehicleAssignmentCheckMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "VehicleControllerIdentificationType")
    public JAXBElement<List<String>> createVehicleControllerIdentificationType(List<String> value) {
        return new JAXBElement<List<String>>(_VehicleControllerIdentificationType_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "VehicleMainIdentificationType")
    public JAXBElement<List<String>> createVehicleMainIdentificationType(List<String> value) {
        return new JAXBElement<List<String>>(_VehicleMainIdentificationType_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessPointSortType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessPointSortType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "AccessPointSortType")
    public JAXBElement<AccessPointSortType> createAccessPointSortType(AccessPointSortType value) {
        return new JAXBElement<AccessPointSortType>(_AccessPointSortType_QNAME, AccessPointSortType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessPointData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessPointData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "AccessPointData")
    public JAXBElement<AccessPointData> createAccessPointData(AccessPointData value) {
        return new JAXBElement<AccessPointData>(_AccessPointData_QNAME, AccessPointData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsAccessPointSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsAccessPointSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "AcsAccessPointSaveData")
    public JAXBElement<AcsAccessPointSaveData> createAcsAccessPointSaveData(AcsAccessPointSaveData value) {
        return new JAXBElement<AcsAccessPointSaveData>(_AcsAccessPointSaveData_QNAME, AcsAccessPointSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "Antipassback", scope = AcsAccessPointBase.class)
    public JAXBElement<Boolean> createAcsAccessPointBaseAntipassback(Boolean value) {
        return new JAXBElement<Boolean>(_AcsAccessPointBaseAntipassback_QNAME, Boolean.class, AcsAccessPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "DailyAlcoholTestConfirmation", scope = AcsAccessPointBase.class)
    public JAXBElement<Boolean> createAcsAccessPointBaseDailyAlcoholTestConfirmation(Boolean value) {
        return new JAXBElement<Boolean>(_AcsAccessPointBaseDailyAlcoholTestConfirmation_QNAME, Boolean.class, AcsAccessPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "Description", scope = AcsAccessPointBase.class)
    public JAXBElement<String> createAcsAccessPointBaseDescription(String value) {
        return new JAXBElement<String>(_AcsAccessPointBaseDescription_QNAME, String.class, AcsAccessPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "IsConfirmingKey", scope = AcsAccessPointBase.class)
    public JAXBElement<Boolean> createAcsAccessPointBaseIsConfirmingKey(Boolean value) {
        return new JAXBElement<Boolean>(_AcsAccessPointBaseIsConfirmingKey_QNAME, Boolean.class, AcsAccessPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "IsGuardOffModeOn", scope = AcsAccessPointBase.class)
    public JAXBElement<Boolean> createAcsAccessPointBaseIsGuardOffModeOn(Boolean value) {
        return new JAXBElement<Boolean>(_AcsAccessPointBaseIsGuardOffModeOn_QNAME, Boolean.class, AcsAccessPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "IsGuardOnModeOn", scope = AcsAccessPointBase.class)
    public JAXBElement<Boolean> createAcsAccessPointBaseIsGuardOnModeOn(Boolean value) {
        return new JAXBElement<Boolean>(_AcsAccessPointBaseIsGuardOnModeOn_QNAME, Boolean.class, AcsAccessPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "IsLockModeOn", scope = AcsAccessPointBase.class)
    public JAXBElement<Boolean> createAcsAccessPointBaseIsLockModeOn(Boolean value) {
        return new JAXBElement<Boolean>(_AcsAccessPointBaseIsLockModeOn_QNAME, Boolean.class, AcsAccessPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "IsMultiIdentification", scope = AcsAccessPointBase.class)
    public JAXBElement<Boolean> createAcsAccessPointBaseIsMultiIdentification(Boolean value) {
        return new JAXBElement<Boolean>(_AcsAccessPointBaseIsMultiIdentification_QNAME, Boolean.class, AcsAccessPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "IsOpenForALongTimeModeOn", scope = AcsAccessPointBase.class)
    public JAXBElement<Boolean> createAcsAccessPointBaseIsOpenForALongTimeModeOn(Boolean value) {
        return new JAXBElement<Boolean>(_AcsAccessPointBaseIsOpenForALongTimeModeOn_QNAME, Boolean.class, AcsAccessPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServerIdentificationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfServerIdentificationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "OrderedServerIdentification", scope = AcsAccessPointBase.class)
    public JAXBElement<ArrayOfServerIdentificationType> createAcsAccessPointBaseOrderedServerIdentification(ArrayOfServerIdentificationType value) {
        return new JAXBElement<ArrayOfServerIdentificationType>(_AcsAccessPointBaseOrderedServerIdentification_QNAME, ArrayOfServerIdentificationType.class, AcsAccessPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "OrderedServerIdentificationInString", scope = AcsAccessPointBase.class)
    public JAXBElement<String> createAcsAccessPointBaseOrderedServerIdentificationInString(String value) {
        return new JAXBElement<String>(_AcsAccessPointBaseOrderedServerIdentificationInString_QNAME, String.class, AcsAccessPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "ServerAlcoFrame", scope = AcsAccessPointBase.class)
    public JAXBElement<Boolean> createAcsAccessPointBaseServerAlcoFrame(Boolean value) {
        return new JAXBElement<Boolean>(_AcsAccessPointBaseServerAlcoFrame_QNAME, Boolean.class, AcsAccessPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "ServerFace", scope = AcsAccessPointBase.class)
    public JAXBElement<Boolean> createAcsAccessPointBaseServerFace(Boolean value) {
        return new JAXBElement<Boolean>(_AcsAccessPointBaseServerFace_QNAME, Boolean.class, AcsAccessPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "ServerVehicle", scope = AcsAccessPointBase.class)
    public JAXBElement<Boolean> createAcsAccessPointBaseServerVehicle(Boolean value) {
        return new JAXBElement<Boolean>(_AcsAccessPointBaseServerVehicle_QNAME, Boolean.class, AcsAccessPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "ServerVehicleIdentification", scope = AcsAccessPointBase.class)
    public JAXBElement<String> createAcsAccessPointBaseServerVehicleIdentification(String value) {
        return new JAXBElement<String>(_AcsAccessPointBaseServerVehicleIdentification_QNAME, String.class, AcsAccessPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "UseHolidaysAndTransfers", scope = AcsAccessPointBase.class)
    public JAXBElement<Boolean> createAcsAccessPointBaseUseHolidaysAndTransfers(Boolean value) {
        return new JAXBElement<Boolean>(_AcsAccessPointBaseUseHolidaysAndTransfers_QNAME, Boolean.class, AcsAccessPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "DriverType", scope = AcsAccessPointDriverInfo.class)
    public JAXBElement<String> createAcsAccessPointDriverInfoDriverType(String value) {
        return new JAXBElement<String>(_AcsAccessPointDriverInfoDriverType_QNAME, String.class, AcsAccessPointDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "Name", scope = AcsAccessPointDriverInfo.class)
    public JAXBElement<String> createAcsAccessPointDriverInfoName(String value) {
        return new JAXBElement<String>(_AcsAccessPointDriverInfoName_QNAME, String.class, AcsAccessPointDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsAccessPointDriverInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsAccessPointDriverInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "AcsAccessPointDriverInfo", scope = AcsAccessPointSlimInfo.class)
    public JAXBElement<AcsAccessPointDriverInfo> createAcsAccessPointSlimInfoAcsAccessPointDriverInfo(AcsAccessPointDriverInfo value) {
        return new JAXBElement<AcsAccessPointDriverInfo>(_AcsAccessPointDriverInfo_QNAME, AcsAccessPointDriverInfo.class, AcsAccessPointSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsBoxAccessLevelSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsBoxAccessLevelSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "BoxAccessLevel", scope = AcsAccessPointSlimInfo.class)
    public JAXBElement<AcsBoxAccessLevelSlimInfo> createAcsAccessPointSlimInfoBoxAccessLevel(AcsBoxAccessLevelSlimInfo value) {
        return new JAXBElement<AcsBoxAccessLevelSlimInfo>(_AcsAccessPointSlimInfoBoxAccessLevel_QNAME, AcsBoxAccessLevelSlimInfo.class, AcsAccessPointSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsScheduleSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsScheduleSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "Schedule", scope = AcsAccessPointSlimInfo.class)
    public JAXBElement<AcsScheduleSlimInfo> createAcsAccessPointSlimInfoSchedule(AcsScheduleSlimInfo value) {
        return new JAXBElement<AcsScheduleSlimInfo>(_AcsAccessPointSlimInfoSchedule_QNAME, AcsScheduleSlimInfo.class, AcsAccessPointSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "AcsBoxAccessLevelID", scope = AcsAccessPointSaveData.class)
    public JAXBElement<String> createAcsAccessPointSaveDataAcsBoxAccessLevelID(String value) {
        return new JAXBElement<String>(_AcsAccessPointSaveDataAcsBoxAccessLevelID_QNAME, String.class, AcsAccessPointSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAccessPointDriverInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAccessPointDriverInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels.AcsAccesPoints", name = "Points", scope = AccessPointData.class)
    public JAXBElement<ArrayOfAcsAccessPointDriverInfo> createAccessPointDataPoints(ArrayOfAcsAccessPointDriverInfo value) {
        return new JAXBElement<ArrayOfAcsAccessPointDriverInfo>(_AccessPointDataPoints_QNAME, ArrayOfAcsAccessPointDriverInfo.class, AccessPointData.class, value);
    }

}
