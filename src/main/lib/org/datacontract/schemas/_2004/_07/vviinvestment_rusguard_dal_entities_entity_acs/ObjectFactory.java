
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.ArrayOfVariableInfo;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.ArrayOfWorkScheduleSlimInfo;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.ArrayOfWorkZoneSlimInfo;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.DictionaryElementInfo;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.FolderInfo;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.LEmployeePositionInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs package. 
 * <p>An ObjectFactory allows you to programmatically 
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
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class ObjectFactory {

    private static final QName _SearchCondition_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "SearchCondition");
    private static final QName _EmployeeSortedColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeeSortedColumn");
    private static final QName _SearchWay_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "SearchWay");
    private static final QName _ArrayOfAcsEmployee_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfAcsEmployee");
    private static final QName _AcsEmployee_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployee");
    private static final QName _GroupTypeSearch_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "GroupTypeSearch");
    private static final QName _VehicleTypeSearch_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "VehicleTypeSearch");
    private static final QName _EmployeesInfoData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeesInfoData");
    private static final QName _ArrayOfAcsEmployeeSlim_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfAcsEmployeeSlim");
    private static final QName _AcsEmployeeSlim_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeeSlim");
    private static final QName _AcsEmployeeSlimBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeeSlimBase");
    private static final QName _EmployeesFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeesFilter");
    private static final QName _EmployeeShowColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeeShowColumn");
    private static final QName _DocumentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "DocumentType");
    private static final QName _ArrayOfAcsEmployeeSchedule_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfAcsEmployeeSchedule");
    private static final QName _AcsEmployeeSchedule_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeeSchedule");
    private static final QName _AcsEmployeeScheduleSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeeScheduleSaveData");
    private static final QName _ArrayOfAcsEmployeeGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfAcsEmployeeGroup");
    private static final QName _AcsEmployeeGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeeGroup");
    private static final QName _EmployeeGroupType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeeGroupType");
    private static final QName _AcsEmployeeGroupReactionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeeGroupReactionInfo");
    private static final QName _ArrayOfAcsEmployeeGroupReactionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfAcsEmployeeGroupReactionInfo");
    private static final QName _AcsEmployeeGroupReportInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeeGroupReportInfo");
    private static final QName _ArrayOfAcsEmployeeGroupReportInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfAcsEmployeeGroupReportInfo");
    private static final QName _AcsEmployeeDocumentsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeeDocumentsData");
    private static final QName _AcsEmployeeDocumentsSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeeDocumentsSaveData");
    private static final QName _AcsEmployeeFull_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeeFull");
    private static final QName _AcsEmployeeFullBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeeFullBase");
    private static final QName _EmployeesInfoData2_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeesInfoData2");
    private static final QName _ArrayOfAcsEmployeeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfAcsEmployeeInfo");
    private static final QName _AcsEmployeeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeeInfo");
    private static final QName _AcsEmployeeFaceVectorFull_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeeFaceVectorFull");
    private static final QName _AcsEmployeeFaceVector_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeeFaceVector");
    private static final QName _FaceSourceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "FaceSourceType");
    private static final QName _ArrayOfAcsEmployeeFaceVector_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfAcsEmployeeFaceVector");
    private static final QName _ArrayOfAcsEmployeeFaceVectorFull_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfAcsEmployeeFaceVectorFull");
    private static final QName _EmployeeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeeInfo");
    private static final QName _ArrayOfEmployeeViewFieldMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfEmployeeViewFieldMetadata");
    private static final QName _EmployeeViewFieldMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeeViewFieldMetadata");
    private static final QName _BaseViewFieldMetadata_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "BaseViewFieldMetadata");
    private static final QName _ArrayOfAcsEmployeeFull_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfAcsEmployeeFull");
    private static final QName _ArrayOfAcsEmployeePhotosInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfAcsEmployeePhotosInfo");
    private static final QName _AcsEmployeePhotosInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeePhotosInfo");
    private static final QName _ArrayOfAscEmployeePhotoModificationDateTimeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfAscEmployeePhotoModificationDateTimeInfo");
    private static final QName _AscEmployeePhotoModificationDateTimeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AscEmployeePhotoModificationDateTimeInfo");
    private static final QName _EmployeeImageType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeeImageType");
    private static final QName _ArrayOfEmployeeShortInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfEmployeeShortInfo");
    private static final QName _EmployeeShortInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeeShortInfo");
    private static final QName _ArrayOfEmployeeModificationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfEmployeeModificationInfo");
    private static final QName _EmployeeModificationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeeModificationInfo");
    private static final QName _AcsEmployeeSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeeSaveData");
    private static final QName _EmployeesSortedColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeesSortedColumn");
    private static final QName _EmployeesData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeesData");
    private static final QName _ArrayOfEmployeeCurentInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfEmployeeCurentInfo");
    private static final QName _EmployeeCurentInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeeCurentInfo");
    private static final QName _ArrayOfAcsEmployeeFaceVectorSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfAcsEmployeeFaceVectorSaveData");
    private static final QName _AcsEmployeeFaceVectorSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AcsEmployeeFaceVectorSaveData");
    private static final QName _ArrayOfAttachedEmployeesForVehicle_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ArrayOfAttachedEmployeesForVehicle");
    private static final QName _AttachedEmployeesForVehicle_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AttachedEmployeesForVehicle");
    private static final QName _AssignmentFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", "AssignmentFilter");
    private static final QName _EmployeeAssignmentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", "EmployeeAssignmentType");
    private static final QName _ArrayOfAcsAlcoGroupSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", "ArrayOfAcsAlcoGroupSlimInfo");
    private static final QName _AcsAlcoGroupSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", "AcsAlcoGroupSlimInfo");
    private static final QName _AcsAlcoGroupSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", "AcsAlcoGroupSaveData");
    private static final QName _ArrayOfEmployeeGroupForAlcoGroupFull_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", "ArrayOfEmployeeGroupForAlcoGroupFull");
    private static final QName _EmployeeGroupForAlcoGroupFull_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", "EmployeeGroupForAlcoGroupFull");
    private static final QName _EmployeeGroupForAlcoGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", "EmployeeGroupForAlcoGroup");
    private static final QName _ChangeDataResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", "ChangeDataResult");
    private static final QName _ChangePositionCodesResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", "ChangePositionCodesResult");
    private static final QName _ArrayOfEmployeeGroupForAlcoGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", "ArrayOfEmployeeGroupForAlcoGroup");
    private static final QName _ArrayOfAcsBoxAccessLevelElementSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", "ArrayOfAcsBoxAccessLevelElementSlimInfo");
    private static final QName _AcsBoxAccessLevelElementSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", "AcsBoxAccessLevelElementSlimInfo");
    private static final QName _AcsBoxAccessElementSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", "AcsBoxAccessElementSaveInfo");
    private static final QName _ArrayOfAcsBoxAccessLevelSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", "ArrayOfAcsBoxAccessLevelSlimInfo");
    private static final QName _AcsBoxAccessLevelSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", "AcsBoxAccessLevelSlimInfo");
    private static final QName _AcsBoxAccessLevelSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", "AcsBoxAccessLevelSaveData");
    private static final QName _BoxAccessLevelMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", "BoxAccessLevelMode");
    private static final QName _ArrayOfAcsBoxAccessElementSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", "ArrayOfAcsBoxAccessElementSaveInfo");
    private static final QName _ArrayOfAcsAccessLevelSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", "ArrayOfAcsAccessLevelSlimInfo");
    private static final QName _AcsAccessLevelSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", "AcsAccessLevelSlimInfo");
    private static final QName _AcsAccessLevelSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", "AcsAccessLevelSaveData");
    private static final QName _AcsAccessLevelSlimBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", "AcsAccessLevelSlimBase");
    private static final QName _AccessLevelSortedColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", "AccessLevelSortedColumn");
    private static final QName _AccessLevelsOwner_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", "AccessLevelsOwner");
    private static final QName _LAccessLevelsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", "LAccessLevelsData");
    private static final QName _ArrayOfAcsAccessLevelSimpleInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", "ArrayOfAcsAccessLevelSimpleInfo");
    private static final QName _AcsAccessLevelSimpleInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", "AcsAccessLevelSimpleInfo");
    private static final QName _ArrayOfAcsKeyInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "ArrayOfAcsKeyInfo");
    private static final QName _AcsKeyInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "AcsKeyInfo");
    private static final QName _AcsKeySaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "AcsKeySaveData");
    private static final QName _AcsScheduleSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "AcsScheduleSlimInfo");
    private static final QName _AcsScheduleType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "AcsScheduleType");
    private static final QName _ArrayOfAcsDaySchedule_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "ArrayOfAcsDaySchedule");
    private static final QName _AcsDaySchedule_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "AcsDaySchedule");
    private static final QName _AcsScheduleBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "AcsScheduleBase");
    private static final QName _AcsScheduleBuiltInType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "AcsScheduleBuiltInType");
    private static final QName _RGDayIntervals_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "RGDayIntervals");
    private static final QName _ArrayOfRGTimeInterval_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "ArrayOfRGTimeInterval");
    private static final QName _RGTimeInterval_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "RGTimeInterval");
    private static final QName _AcsTimeIntervalType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "AcsTimeIntervalType");
    private static final QName _AcsScheduleOwnerType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "AcsScheduleOwnerType");
    private static final QName _ArrayOfAcsMultiDaySchedule_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "ArrayOfAcsMultiDaySchedule");
    private static final QName _AcsMultiDaySchedule_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "AcsMultiDaySchedule");
    private static final QName _ArrayOfRGDayIntervals_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "ArrayOfRGDayIntervals");
    private static final QName _ArrayOfAcsWeekScheduleSlim_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "ArrayOfAcsWeekScheduleSlim");
    private static final QName _AcsWeekScheduleSlim_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "AcsWeekScheduleSlim");
    private static final QName _ArrayOfAcsWeekSlim_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "ArrayOfAcsWeekSlim");
    private static final QName _AcsWeekSlim_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "AcsWeekSlim");
    private static final QName _ArrayOfAcsWeekScheduleFull_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "ArrayOfAcsWeekScheduleFull");
    private static final QName _AcsWeekScheduleFull_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "AcsWeekScheduleFull");
    private static final QName _ArrayOfAcsWeekFull_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "ArrayOfAcsWeekFull");
    private static final QName _AcsWeekFull_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "AcsWeekFull");
    private static final QName _ArrayOfAcsCustomDay_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "ArrayOfAcsCustomDay");
    private static final QName _AcsCustomDay_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "AcsCustomDay");
    private static final QName _AcsCustomizableDayBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "AcsCustomizableDayBase");
    private static final QName _AcsCustomizableDayType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "AcsCustomizableDayType");
    private static final QName _ArrayOfAcsWorkDayWithTransfer_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "ArrayOfAcsWorkDayWithTransfer");
    private static final QName _AcsWorkDayWithTransfer_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "AcsWorkDayWithTransfer");
    private static final QName _VehicleSortColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "VehicleSortColumn");
    private static final QName _ArrayOfAcsVehicleSearched_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "ArrayOfAcsVehicleSearched");
    private static final QName _AcsVehicleSearched_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "AcsVehicleSearched");
    private static final QName _ArrayOfAcsVehicle_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "ArrayOfAcsVehicle");
    private static final QName _AcsVehicle_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "AcsVehicle");
    private static final QName _AcsVehicleSavedData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "AcsVehicleSavedData");
    private static final QName _ArrayOfEmployeesVehicle_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "ArrayOfEmployeesVehicle");
    private static final QName _EmployeesVehicle_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "EmployeesVehicle");
    private static final QName _EmployeesVehicleEndDateTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "EndDateTime");
    private static final QName _EmployeesVehicleStartDateTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "StartDateTime");
    private static final QName _AcsCustomizableDayBaseName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "Name");
    private static final QName _AcsWeekFullFriday_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "Friday");
    private static final QName _AcsWeekFullMonday_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "Monday");
    private static final QName _AcsWeekFullSaturday_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "Saturday");
    private static final QName _AcsWeekFullSunday_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "Sunday");
    private static final QName _AcsWeekFullThursday_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "Thursday");
    private static final QName _AcsWeekFullTuesday_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "Tuesday");
    private static final QName _AcsWeekFullWednesday_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "Wednesday");
    private static final QName _AcsScheduleBaseComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "Comment");
    private static final QName _AcsWeekScheduleSlimWeeks_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "Weeks");
    private static final QName _AcsAccessLevelSlimBaseName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", "Name");
    private static final QName _AcsBoxAccessElementSaveInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", "Name");
    private static final QName _EmployeeGroupForAlcoGroupFullName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", "Name");
    private static final QName _AttachedEmployeesForVehicleBeginDateTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "BeginDateTime");
    private static final QName _AttachedEmployeesForVehicleEmployee_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Employee");
    private static final QName _AttachedEmployeesForVehicleEndDateTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EndDateTime");
    private static final QName _AcsEmployeeFaceVectorID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ID");
    private static final QName _AcsEmployeeFaceVectorName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Name");
    private static final QName _AcsEmployeeFaceVectorSourceName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "SourceName");
    private static final QName _AcsEmployeeFaceVectorSourcePath_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "SourcePath");
    private static final QName _AcsEmployeeFaceVectorFullFaceVector_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "FaceVector");
    private static final QName _AcsEmployeeFaceVectorFullImage_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Image");
    private static final QName _AcsEmployeeFaceVectorFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Info");
    private static final QName _EmployeeCurentInfoEmployeeGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeeGroup");
    private static final QName _EmployeeCurentInfoFIO_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "FIO");
    private static final QName _EmployeeCurentInfoPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Position");
    private static final QName _EmployeeCurentInfoTabNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "TabNumber");
    private static final QName _AcsEmployeePhotosInfoFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "FirstName");
    private static final QName _AcsEmployeePhotosInfoLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "LastName");
    private static final QName _AcsEmployeePhotosInfoPhotos_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Photos");
    private static final QName _AcsEmployeePhotosInfoSecondName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "SecondName");
    private static final QName _BaseViewFieldMetadataFieldName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "FieldName");
    private static final QName _BaseViewFieldMetadataFieldType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "FieldType");
    private static final QName _AcsEmployeeSlimBaseComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Comment");
    private static final QName _AcsEmployeeSlimBaseNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Number");
    private static final QName _AcsEmployeeInfoGroupCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "GroupCode");
    private static final QName _AcsEmployeeInfoGroupName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "GroupName");
    private static final QName _AcsEmployeeInfoGroupPath_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "GroupPath");
    private static final QName _AcsEmployeeInfoPositionCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PositionCode");
    private static final QName _AcsEmployeeInfoPositionName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PositionName");
    private static final QName _AcsEmployeeInfoSecurityGroupName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "SecurityGroupName");
    private static final QName _AcsEmployeeFullBaseAuthority_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Authority");
    private static final QName _AcsEmployeeFullBaseDateOfIssue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "DateOfIssue");
    private static final QName _AcsEmployeeFullBasePINCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PINCode");
    private static final QName _AcsEmployeeFullBasePINCodeDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PINCodeDescription");
    private static final QName _AcsEmployeeFullBasePINCodeUnderPressure_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PINCodeUnderPressure");
    private static final QName _AcsEmployeeFullBasePINCodeUnderPressureDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PINCodeUnderPressureDescription");
    private static final QName _AcsEmployeeFullBasePassportIssue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PassportIssue");
    private static final QName _AcsEmployeeFullBasePassportNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PassportNumber");
    private static final QName _AcsEmployeeFullBaseRegistrationAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "RegistrationAddress");
    private static final QName _AcsEmployeeFullBaseResidentialAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ResidentialAddress");
    private static final QName _AcsEmployeeGroupEmployeeGroups_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeeGroups");
    private static final QName _AcsEmployeeGroupFavoriteName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "FavoriteName");
    private static final QName _AcsEmployeeGroupFavoritePath_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "FavoritePath");
    private static final QName _AcsEmployeeGroupReportInfoEmployeeGroups2_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeeGroups2");
    private static final QName _AcsEmployeeGroupReportInfoEmployeesFromGroupsGuids_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeesFromGroupsGuids");
    private static final QName _AcsEmployeeGroupReportInfoSelectedEmployeesGuids_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "SelectedEmployeesGuids");
    private static final QName _AcsEmployeeGroupReactionInfoEmployeeGroups1_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeeGroups1");
    private static final QName _AcsVehicleSavedDataBrand_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "Brand");
    private static final QName _AcsVehicleSavedDataColor_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "Color");
    private static final QName _AcsVehicleSavedDataComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "Comment");
    private static final QName _AcsVehicleSavedDataName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "Name");
    private static final QName _AcsVehicleSavedDataRegistrationNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "RegistrationNumber");
    private static final QName _AcsVehicleSavedDataVehicleType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "VehicleType");
    private static final QName _AcsVehicleSavedDataVehicleTypeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "VehicleTypeID");
    private static final QName _AcsKeySaveDataCardTypeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "CardTypeID");
    private static final QName _AcsKeySaveDataCardTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "CardTypeName");
    private static final QName _AcsKeySaveDataDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "Description");
    private static final QName _AcsKeySaveDataEndDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "EndDate");
    private static final QName _AcsKeySaveDataFinger1Image_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "Finger1_Image");
    private static final QName _AcsKeySaveDataFinger1Template_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "Finger1_Template");
    private static final QName _AcsKeySaveDataFinger2Image_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "Finger2_Image");
    private static final QName _AcsKeySaveDataFinger2Template_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "Finger2_Template");
    private static final QName _AcsKeySaveDataFinger3Image_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "Finger3_Image");
    private static final QName _AcsKeySaveDataFinger3Template_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "Finger3_Template");
    private static final QName _AcsKeySaveDataFinger4Image_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "Finger4_Image");
    private static final QName _AcsKeySaveDataFinger4Template_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "Finger4_Template");
    private static final QName _AcsKeySaveDataFinger5Image_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "Finger5_Image");
    private static final QName _AcsKeySaveDataFinger5Template_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "Finger5_Template");
    private static final QName _AcsKeySaveDataName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "Name");
    private static final QName _AcsKeySaveDataStartDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "StartDate");
    private static final QName _AcsEmployeeScheduleSaveDataDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Description");
    private static final QName _AcsEmployeeDocumentsSaveDataDriverDateOfBirth_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "DriverDateOfBirth");
    private static final QName _AcsEmployeeDocumentsSaveDataDriverDateOfExpiry_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "DriverDateOfExpiry");
    private static final QName _AcsEmployeeDocumentsSaveDataDriverDateOfIssue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "DriverDateOfIssue");
    private static final QName _AcsEmployeeDocumentsSaveDataDriverFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "DriverFirstName");
    private static final QName _AcsEmployeeDocumentsSaveDataDriverLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "DriverLastName");
    private static final QName _AcsEmployeeDocumentsSaveDataDriverMiddleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "DriverMiddleName");
    private static final QName _AcsEmployeeDocumentsSaveDataDriverNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "DriverNumber");
    private static final QName _AcsEmployeeDocumentsSaveDataDriverPlaceOfBirth_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "DriverPlaceOfBirth");
    private static final QName _AcsEmployeeDocumentsSaveDataDriverSeries_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "DriverSeries");
    private static final QName _AcsEmployeeDocumentsSaveDataForeignPassportCodeOfIssuingState_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ForeignPassportCodeOfIssuingState");
    private static final QName _AcsEmployeeDocumentsSaveDataForeignPassportDateOfBirth_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ForeignPassportDateOfBirth");
    private static final QName _AcsEmployeeDocumentsSaveDataForeignPassportDateOfExpiry_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ForeignPassportDateOfExpiry");
    private static final QName _AcsEmployeeDocumentsSaveDataForeignPassportFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ForeignPassportFirstName");
    private static final QName _AcsEmployeeDocumentsSaveDataForeignPassportLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ForeignPassportLastName");
    private static final QName _AcsEmployeeDocumentsSaveDataForeignPassportMRZ_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ForeignPassportMRZ");
    private static final QName _AcsEmployeeDocumentsSaveDataForeignPassportMiddleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ForeignPassportMiddleName");
    private static final QName _AcsEmployeeDocumentsSaveDataForeignPassportNationality_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ForeignPassportNationality");
    private static final QName _AcsEmployeeDocumentsSaveDataForeignPassportNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ForeignPassportNumber");
    private static final QName _AcsEmployeeDocumentsSaveDataForeignPassportPersonalCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ForeignPassportPersonalCode");
    private static final QName _AcsEmployeeDocumentsSaveDataForeignPassportSex_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "ForeignPassportSex");
    private static final QName _AcsEmployeeDocumentsSaveDataPassportDateOfBirth_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PassportDateOfBirth");
    private static final QName _AcsEmployeeDocumentsSaveDataPassportDateOfIssue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PassportDateOfIssue");
    private static final QName _AcsEmployeeDocumentsSaveDataPassportDepartmentCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PassportDepartmentCode");
    private static final QName _AcsEmployeeDocumentsSaveDataPassportFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PassportFirstName");
    private static final QName _AcsEmployeeDocumentsSaveDataPassportLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PassportLastName");
    private static final QName _AcsEmployeeDocumentsSaveDataPassportMiddleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PassportMiddleName");
    private static final QName _AcsEmployeeDocumentsSaveDataPassportPlaceOfBirth_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PassportPlaceOfBirth");
    private static final QName _AcsEmployeeDocumentsSaveDataPassportRegistrationAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PassportRegistrationAddress");
    private static final QName _AcsEmployeeDocumentsSaveDataPassportSeries_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PassportSeries");
    private static final QName _AcsEmployeeDocumentsSaveDataPassportSex_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "PassportSex");
    private static final QName _EmployeesDataEmployees_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Employees");
    private static final QName _AcsEmployeeSlimAccessLevels_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AccessLevels");
    private static final QName _AcsEmployeeSlimEmployeeGroupPath_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeeGroupPath");
    private static final QName _AcsEmployeeSlimKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Keys");
    private static final QName _AcsEmployeeSlimRowNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "RowNumber");
    private static final QName _AcsEmployeeSlimWorkSchedules_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "WorkSchedules");
    private static final QName _AcsEmployeeSlimWorkZones_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "WorkZones");
    private static final QName _AcsEmployeeSaveDataEmployeePositionID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "EmployeePositionID");
    private static final QName _RGDayIntervalsTimeIntervals_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "TimeIntervals");
    private static final QName _LAccessLevelsDataAccessLevelsSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", "AccessLevelsSlimInfo");
    private static final QName _ChangePositionCodesResultAddedEntities_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", "AddedEntities");
    private static final QName _ChangePositionCodesResultDeletedEntities_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", "DeletedEntities");
    private static final QName _AcsAlcoGroupSaveDataDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", "Description");
    private static final QName _AcsAlcoGroupSaveDataMaxCheckPerDay_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", "MaxCheckPerDay");
    private static final QName _AcsAccessLevelSaveDataDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", "Description");
    private static final QName _AcsAccessLevelSlimInfoEndDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", "EndDate");
    private static final QName _AcsAccessLevelSlimInfoFolder_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", "Folder");
    private static final QName _AcsAccessLevelSlimInfoReadRightDisabled_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", "ReadRightDisabled");
    private static final QName _AcsBoxAccessLevelSaveDataDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", "Description");
    private static final QName _AcsBoxAccessLevelSlimInfoBoxAccessElements_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", "BoxAccessElements");
    private static final QName _AcsKeyInfoAcsEmployeeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", "AcsEmployeeId");
    private static final QName _EmployeeInfoFields_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Fields");
    private static final QName _EmployeeInfoPhoto_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Photo");
    private static final QName _AcsMultiDayScheduleDayIntervals_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", "DayIntervals");
    private static final QName _EmployeesFilterAccessLevelsIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AccessLevelsIds");
    private static final QName _EmployeesFilterCardTypesIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "CardTypesIds");
    private static final QName _EmployeesFilterFirstNameContains_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "FirstNameContains");
    private static final QName _EmployeesFilterIsKeySiteCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "IsKeySiteCode");
    private static final QName _EmployeesFilterKeyAfterSiteCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "KeyAfterSiteCode");
    private static final QName _EmployeesFilterKeyCommentContains_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "KeyCommentContains");
    private static final QName _EmployeesFilterKeyNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "KeyNumber");
    private static final QName _EmployeesFilterKeySiteCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "KeySiteCode");
    private static final QName _EmployeesFilterLastNameContains_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "LastNameContains");
    private static final QName _EmployeesFilterSecondNameContains_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "SecondNameContains");
    private static final QName _EmployeesFilterTabNumberContains_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "TabNumberContains");
    private static final QName _EmployeesFilterTabNumberEquals_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "TabNumberEquals");
    private static final QName _AcsVehicleGroupPath_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", "GroupPath");
    private static final QName _SearchConditionAddField_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AddField");
    private static final QName _SearchConditionAdditionalFieldID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AdditionalFieldID");
    private static final QName _SearchConditionAlcoGroupID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "AlcoGroupID");
    private static final QName _SearchConditionBirthday_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Birthday");
    private static final QName _SearchConditionDrivingLicenseNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "DrivingLicenseNumber");
    private static final QName _SearchConditionEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Email");
    private static final QName _SearchConditionGroupID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "GroupID");
    private static final QName _SearchConditionInternationalPassportNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "InternationalPassportNumber");
    private static final QName _SearchConditionKeyDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "KeyDescription");
    private static final QName _SearchConditionPhone_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "Phone");
    private static final QName _SearchConditionTableNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", "TableNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfAcsKeyInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsKeyInfo }
     */
    public ArrayOfAcsKeyInfo createArrayOfAcsKeyInfo() {
        return new ArrayOfAcsKeyInfo();
    }

    /**
     * Create an instance of {@link SearchCondition }
     * 
     * @return
     *     the new instance of {@link SearchCondition }
     */
    public SearchCondition createSearchCondition() {
        return new SearchCondition();
    }

    /**
     * Create an instance of {@link ArrayOfAcsEmployee }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsEmployee }
     */
    public ArrayOfAcsEmployee createArrayOfAcsEmployee() {
        return new ArrayOfAcsEmployee();
    }

    /**
     * Create an instance of {@link ArrayOfAcsVehicleSearched }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsVehicleSearched }
     */
    public ArrayOfAcsVehicleSearched createArrayOfAcsVehicleSearched() {
        return new ArrayOfAcsVehicleSearched();
    }

    /**
     * Create an instance of {@link ArrayOfAcsVehicle }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsVehicle }
     */
    public ArrayOfAcsVehicle createArrayOfAcsVehicle() {
        return new ArrayOfAcsVehicle();
    }

    /**
     * Create an instance of {@link AcsVehicle }
     * 
     * @return
     *     the new instance of {@link AcsVehicle }
     */
    public AcsVehicle createAcsVehicle() {
        return new AcsVehicle();
    }

    /**
     * Create an instance of {@link ArrayOfAcsBoxAccessLevelElementSlimInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsBoxAccessLevelElementSlimInfo }
     */
    public ArrayOfAcsBoxAccessLevelElementSlimInfo createArrayOfAcsBoxAccessLevelElementSlimInfo() {
        return new ArrayOfAcsBoxAccessLevelElementSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAcsBoxAccessLevelSlimInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsBoxAccessLevelSlimInfo }
     */
    public ArrayOfAcsBoxAccessLevelSlimInfo createArrayOfAcsBoxAccessLevelSlimInfo() {
        return new ArrayOfAcsBoxAccessLevelSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAcsAccessLevelSlimInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsAccessLevelSlimInfo }
     */
    public ArrayOfAcsAccessLevelSlimInfo createArrayOfAcsAccessLevelSlimInfo() {
        return new ArrayOfAcsAccessLevelSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAcsAlcoGroupSlimInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsAlcoGroupSlimInfo }
     */
    public ArrayOfAcsAlcoGroupSlimInfo createArrayOfAcsAlcoGroupSlimInfo() {
        return new ArrayOfAcsAlcoGroupSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeeGroupForAlcoGroupFull }
     * 
     * @return
     *     the new instance of {@link ArrayOfEmployeeGroupForAlcoGroupFull }
     */
    public ArrayOfEmployeeGroupForAlcoGroupFull createArrayOfEmployeeGroupForAlcoGroupFull() {
        return new ArrayOfEmployeeGroupForAlcoGroupFull();
    }

    /**
     * Create an instance of {@link EmployeesInfoData }
     * 
     * @return
     *     the new instance of {@link EmployeesInfoData }
     */
    public EmployeesInfoData createEmployeesInfoData() {
        return new EmployeesInfoData();
    }

    /**
     * Create an instance of {@link EmployeesFilter }
     * 
     * @return
     *     the new instance of {@link EmployeesFilter }
     */
    public EmployeesFilter createEmployeesFilter() {
        return new EmployeesFilter();
    }

    /**
     * Create an instance of {@link EmployeeShowColumn }
     * 
     * @return
     *     the new instance of {@link EmployeeShowColumn }
     */
    public EmployeeShowColumn createEmployeeShowColumn() {
        return new EmployeeShowColumn();
    }

    /**
     * Create an instance of {@link ArrayOfAcsEmployeeSchedule }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsEmployeeSchedule }
     */
    public ArrayOfAcsEmployeeSchedule createArrayOfAcsEmployeeSchedule() {
        return new ArrayOfAcsEmployeeSchedule();
    }

    /**
     * Create an instance of {@link ArrayOfAcsDaySchedule }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsDaySchedule }
     */
    public ArrayOfAcsDaySchedule createArrayOfAcsDaySchedule() {
        return new ArrayOfAcsDaySchedule();
    }

    /**
     * Create an instance of {@link AcsDaySchedule }
     * 
     * @return
     *     the new instance of {@link AcsDaySchedule }
     */
    public AcsDaySchedule createAcsDaySchedule() {
        return new AcsDaySchedule();
    }

    /**
     * Create an instance of {@link ArrayOfAcsMultiDaySchedule }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsMultiDaySchedule }
     */
    public ArrayOfAcsMultiDaySchedule createArrayOfAcsMultiDaySchedule() {
        return new ArrayOfAcsMultiDaySchedule();
    }

    /**
     * Create an instance of {@link AcsMultiDaySchedule }
     * 
     * @return
     *     the new instance of {@link AcsMultiDaySchedule }
     */
    public AcsMultiDaySchedule createAcsMultiDaySchedule() {
        return new AcsMultiDaySchedule();
    }

    /**
     * Create an instance of {@link ArrayOfAcsWeekScheduleSlim }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsWeekScheduleSlim }
     */
    public ArrayOfAcsWeekScheduleSlim createArrayOfAcsWeekScheduleSlim() {
        return new ArrayOfAcsWeekScheduleSlim();
    }

    /**
     * Create an instance of {@link ArrayOfAcsWeekScheduleFull }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsWeekScheduleFull }
     */
    public ArrayOfAcsWeekScheduleFull createArrayOfAcsWeekScheduleFull() {
        return new ArrayOfAcsWeekScheduleFull();
    }

    /**
     * Create an instance of {@link AcsWeekScheduleFull }
     * 
     * @return
     *     the new instance of {@link AcsWeekScheduleFull }
     */
    public AcsWeekScheduleFull createAcsWeekScheduleFull() {
        return new AcsWeekScheduleFull();
    }

    /**
     * Create an instance of {@link ArrayOfAcsCustomDay }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsCustomDay }
     */
    public ArrayOfAcsCustomDay createArrayOfAcsCustomDay() {
        return new ArrayOfAcsCustomDay();
    }

    /**
     * Create an instance of {@link AcsCustomDay }
     * 
     * @return
     *     the new instance of {@link AcsCustomDay }
     */
    public AcsCustomDay createAcsCustomDay() {
        return new AcsCustomDay();
    }

    /**
     * Create an instance of {@link ArrayOfAcsWorkDayWithTransfer }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsWorkDayWithTransfer }
     */
    public ArrayOfAcsWorkDayWithTransfer createArrayOfAcsWorkDayWithTransfer() {
        return new ArrayOfAcsWorkDayWithTransfer();
    }

    /**
     * Create an instance of {@link AcsWorkDayWithTransfer }
     * 
     * @return
     *     the new instance of {@link AcsWorkDayWithTransfer }
     */
    public AcsWorkDayWithTransfer createAcsWorkDayWithTransfer() {
        return new AcsWorkDayWithTransfer();
    }

    /**
     * Create an instance of {@link ArrayOfAcsEmployeeGroup }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsEmployeeGroup }
     */
    public ArrayOfAcsEmployeeGroup createArrayOfAcsEmployeeGroup() {
        return new ArrayOfAcsEmployeeGroup();
    }

    /**
     * Create an instance of {@link AcsEmployeeGroup }
     * 
     * @return
     *     the new instance of {@link AcsEmployeeGroup }
     */
    public AcsEmployeeGroup createAcsEmployeeGroup() {
        return new AcsEmployeeGroup();
    }

    /**
     * Create an instance of {@link ArrayOfAcsEmployeeGroupReportInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsEmployeeGroupReportInfo }
     */
    public ArrayOfAcsEmployeeGroupReportInfo createArrayOfAcsEmployeeGroupReportInfo() {
        return new ArrayOfAcsEmployeeGroupReportInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAcsEmployeeGroupReactionInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsEmployeeGroupReactionInfo }
     */
    public ArrayOfAcsEmployeeGroupReactionInfo createArrayOfAcsEmployeeGroupReactionInfo() {
        return new ArrayOfAcsEmployeeGroupReactionInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAcsEmployeeSlim }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsEmployeeSlim }
     */
    public ArrayOfAcsEmployeeSlim createArrayOfAcsEmployeeSlim() {
        return new ArrayOfAcsEmployeeSlim();
    }

    /**
     * Create an instance of {@link EmployeesInfoData2 }
     * 
     * @return
     *     the new instance of {@link EmployeesInfoData2 }
     */
    public EmployeesInfoData2 createEmployeesInfoData2() {
        return new EmployeesInfoData2();
    }

    /**
     * Create an instance of {@link AcsEmployeeFaceVectorFull }
     * 
     * @return
     *     the new instance of {@link AcsEmployeeFaceVectorFull }
     */
    public AcsEmployeeFaceVectorFull createAcsEmployeeFaceVectorFull() {
        return new AcsEmployeeFaceVectorFull();
    }

    /**
     * Create an instance of {@link ArrayOfAcsEmployeeFaceVector }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsEmployeeFaceVector }
     */
    public ArrayOfAcsEmployeeFaceVector createArrayOfAcsEmployeeFaceVector() {
        return new ArrayOfAcsEmployeeFaceVector();
    }

    /**
     * Create an instance of {@link ArrayOfAcsEmployeeFaceVectorFull }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsEmployeeFaceVectorFull }
     */
    public ArrayOfAcsEmployeeFaceVectorFull createArrayOfAcsEmployeeFaceVectorFull() {
        return new ArrayOfAcsEmployeeFaceVectorFull();
    }

    /**
     * Create an instance of {@link AcsEmployeeFull }
     * 
     * @return
     *     the new instance of {@link AcsEmployeeFull }
     */
    public AcsEmployeeFull createAcsEmployeeFull() {
        return new AcsEmployeeFull();
    }

    /**
     * Create an instance of {@link EmployeeInfo }
     * 
     * @return
     *     the new instance of {@link EmployeeInfo }
     */
    public EmployeeInfo createEmployeeInfo() {
        return new EmployeeInfo();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeeViewFieldMetadata }
     * 
     * @return
     *     the new instance of {@link ArrayOfEmployeeViewFieldMetadata }
     */
    public ArrayOfEmployeeViewFieldMetadata createArrayOfEmployeeViewFieldMetadata() {
        return new ArrayOfEmployeeViewFieldMetadata();
    }

    /**
     * Create an instance of {@link ArrayOfAcsEmployeeFull }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsEmployeeFull }
     */
    public ArrayOfAcsEmployeeFull createArrayOfAcsEmployeeFull() {
        return new ArrayOfAcsEmployeeFull();
    }

    /**
     * Create an instance of {@link AcsEmployeeDocumentsData }
     * 
     * @return
     *     the new instance of {@link AcsEmployeeDocumentsData }
     */
    public AcsEmployeeDocumentsData createAcsEmployeeDocumentsData() {
        return new AcsEmployeeDocumentsData();
    }

    /**
     * Create an instance of {@link ArrayOfAcsEmployeePhotosInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsEmployeePhotosInfo }
     */
    public ArrayOfAcsEmployeePhotosInfo createArrayOfAcsEmployeePhotosInfo() {
        return new ArrayOfAcsEmployeePhotosInfo();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeeShortInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfEmployeeShortInfo }
     */
    public ArrayOfEmployeeShortInfo createArrayOfEmployeeShortInfo() {
        return new ArrayOfEmployeeShortInfo();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeeModificationInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfEmployeeModificationInfo }
     */
    public ArrayOfEmployeeModificationInfo createArrayOfEmployeeModificationInfo() {
        return new ArrayOfEmployeeModificationInfo();
    }

    /**
     * Create an instance of {@link AcsKeyInfo }
     * 
     * @return
     *     the new instance of {@link AcsKeyInfo }
     */
    public AcsKeyInfo createAcsKeyInfo() {
        return new AcsKeyInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAcsBoxAccessElementSaveInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsBoxAccessElementSaveInfo }
     */
    public ArrayOfAcsBoxAccessElementSaveInfo createArrayOfAcsBoxAccessElementSaveInfo() {
        return new ArrayOfAcsBoxAccessElementSaveInfo();
    }

    /**
     * Create an instance of {@link AcsBoxAccessLevelSaveData }
     * 
     * @return
     *     the new instance of {@link AcsBoxAccessLevelSaveData }
     */
    public AcsBoxAccessLevelSaveData createAcsBoxAccessLevelSaveData() {
        return new AcsBoxAccessLevelSaveData();
    }

    /**
     * Create an instance of {@link AcsBoxAccessLevelSlimInfo }
     * 
     * @return
     *     the new instance of {@link AcsBoxAccessLevelSlimInfo }
     */
    public AcsBoxAccessLevelSlimInfo createAcsBoxAccessLevelSlimInfo() {
        return new AcsBoxAccessLevelSlimInfo();
    }

    /**
     * Create an instance of {@link AcsAccessLevelSaveData }
     * 
     * @return
     *     the new instance of {@link AcsAccessLevelSaveData }
     */
    public AcsAccessLevelSaveData createAcsAccessLevelSaveData() {
        return new AcsAccessLevelSaveData();
    }

    /**
     * Create an instance of {@link AcsAccessLevelSlimInfo }
     * 
     * @return
     *     the new instance of {@link AcsAccessLevelSlimInfo }
     */
    public AcsAccessLevelSlimInfo createAcsAccessLevelSlimInfo() {
        return new AcsAccessLevelSlimInfo();
    }

    /**
     * Create an instance of {@link AcsAlcoGroupSaveData }
     * 
     * @return
     *     the new instance of {@link AcsAlcoGroupSaveData }
     */
    public AcsAlcoGroupSaveData createAcsAlcoGroupSaveData() {
        return new AcsAlcoGroupSaveData();
    }

    /**
     * Create an instance of {@link AcsAlcoGroupSlimInfo }
     * 
     * @return
     *     the new instance of {@link AcsAlcoGroupSlimInfo }
     */
    public AcsAlcoGroupSlimInfo createAcsAlcoGroupSlimInfo() {
        return new AcsAlcoGroupSlimInfo();
    }

    /**
     * Create an instance of {@link ChangeDataResult }
     * 
     * @return
     *     the new instance of {@link ChangeDataResult }
     */
    public ChangeDataResult createChangeDataResult() {
        return new ChangeDataResult();
    }

    /**
     * Create an instance of {@link ChangePositionCodesResult }
     * 
     * @return
     *     the new instance of {@link ChangePositionCodesResult }
     */
    public ChangePositionCodesResult createChangePositionCodesResult() {
        return new ChangePositionCodesResult();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeeGroupForAlcoGroup }
     * 
     * @return
     *     the new instance of {@link ArrayOfEmployeeGroupForAlcoGroup }
     */
    public ArrayOfEmployeeGroupForAlcoGroup createArrayOfEmployeeGroupForAlcoGroup() {
        return new ArrayOfEmployeeGroupForAlcoGroup();
    }

    /**
     * Create an instance of {@link LAccessLevelsData }
     * 
     * @return
     *     the new instance of {@link LAccessLevelsData }
     */
    public LAccessLevelsData createLAccessLevelsData() {
        return new LAccessLevelsData();
    }

    /**
     * Create an instance of {@link ArrayOfAcsAccessLevelSimpleInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsAccessLevelSimpleInfo }
     */
    public ArrayOfAcsAccessLevelSimpleInfo createArrayOfAcsAccessLevelSimpleInfo() {
        return new ArrayOfAcsAccessLevelSimpleInfo();
    }

    /**
     * Create an instance of {@link RGDayIntervals }
     * 
     * @return
     *     the new instance of {@link RGDayIntervals }
     */
    public RGDayIntervals createRGDayIntervals() {
        return new RGDayIntervals();
    }

    /**
     * Create an instance of {@link ArrayOfRGDayIntervals }
     * 
     * @return
     *     the new instance of {@link ArrayOfRGDayIntervals }
     */
    public ArrayOfRGDayIntervals createArrayOfRGDayIntervals() {
        return new ArrayOfRGDayIntervals();
    }

    /**
     * Create an instance of {@link ArrayOfAcsWeekSlim }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsWeekSlim }
     */
    public ArrayOfAcsWeekSlim createArrayOfAcsWeekSlim() {
        return new ArrayOfAcsWeekSlim();
    }

    /**
     * Create an instance of {@link AcsEmployeeSaveData }
     * 
     * @return
     *     the new instance of {@link AcsEmployeeSaveData }
     */
    public AcsEmployeeSaveData createAcsEmployeeSaveData() {
        return new AcsEmployeeSaveData();
    }

    /**
     * Create an instance of {@link AcsEmployeeSlim }
     * 
     * @return
     *     the new instance of {@link AcsEmployeeSlim }
     */
    public AcsEmployeeSlim createAcsEmployeeSlim() {
        return new AcsEmployeeSlim();
    }

    /**
     * Create an instance of {@link EmployeesData }
     * 
     * @return
     *     the new instance of {@link EmployeesData }
     */
    public EmployeesData createEmployeesData() {
        return new EmployeesData();
    }

    /**
     * Create an instance of {@link AcsEmployeeDocumentsSaveData }
     * 
     * @return
     *     the new instance of {@link AcsEmployeeDocumentsSaveData }
     */
    public AcsEmployeeDocumentsSaveData createAcsEmployeeDocumentsSaveData() {
        return new AcsEmployeeDocumentsSaveData();
    }

    /**
     * Create an instance of {@link ArrayOfAcsEmployeeFaceVectorSaveData }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsEmployeeFaceVectorSaveData }
     */
    public ArrayOfAcsEmployeeFaceVectorSaveData createArrayOfAcsEmployeeFaceVectorSaveData() {
        return new ArrayOfAcsEmployeeFaceVectorSaveData();
    }

    /**
     * Create an instance of {@link AcsEmployeeScheduleSaveData }
     * 
     * @return
     *     the new instance of {@link AcsEmployeeScheduleSaveData }
     */
    public AcsEmployeeScheduleSaveData createAcsEmployeeScheduleSaveData() {
        return new AcsEmployeeScheduleSaveData();
    }

    /**
     * Create an instance of {@link AcsEmployeeSchedule }
     * 
     * @return
     *     the new instance of {@link AcsEmployeeSchedule }
     */
    public AcsEmployeeSchedule createAcsEmployeeSchedule() {
        return new AcsEmployeeSchedule();
    }

    /**
     * Create an instance of {@link AcsKeySaveData }
     * 
     * @return
     *     the new instance of {@link AcsKeySaveData }
     */
    public AcsKeySaveData createAcsKeySaveData() {
        return new AcsKeySaveData();
    }

    /**
     * Create an instance of {@link AcsVehicleSavedData }
     * 
     * @return
     *     the new instance of {@link AcsVehicleSavedData }
     */
    public AcsVehicleSavedData createAcsVehicleSavedData() {
        return new AcsVehicleSavedData();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeesVehicle }
     * 
     * @return
     *     the new instance of {@link ArrayOfEmployeesVehicle }
     */
    public ArrayOfEmployeesVehicle createArrayOfEmployeesVehicle() {
        return new ArrayOfEmployeesVehicle();
    }

    /**
     * Create an instance of {@link ArrayOfAttachedEmployeesForVehicle }
     * 
     * @return
     *     the new instance of {@link ArrayOfAttachedEmployeesForVehicle }
     */
    public ArrayOfAttachedEmployeesForVehicle createArrayOfAttachedEmployeesForVehicle() {
        return new ArrayOfAttachedEmployeesForVehicle();
    }

    /**
     * Create an instance of {@link AcsEmployee }
     * 
     * @return
     *     the new instance of {@link AcsEmployee }
     */
    public AcsEmployee createAcsEmployee() {
        return new AcsEmployee();
    }

    /**
     * Create an instance of {@link AcsEmployeeSlimBase }
     * 
     * @return
     *     the new instance of {@link AcsEmployeeSlimBase }
     */
    public AcsEmployeeSlimBase createAcsEmployeeSlimBase() {
        return new AcsEmployeeSlimBase();
    }

    /**
     * Create an instance of {@link AcsEmployeeGroupReactionInfo }
     * 
     * @return
     *     the new instance of {@link AcsEmployeeGroupReactionInfo }
     */
    public AcsEmployeeGroupReactionInfo createAcsEmployeeGroupReactionInfo() {
        return new AcsEmployeeGroupReactionInfo();
    }

    /**
     * Create an instance of {@link AcsEmployeeGroupReportInfo }
     * 
     * @return
     *     the new instance of {@link AcsEmployeeGroupReportInfo }
     */
    public AcsEmployeeGroupReportInfo createAcsEmployeeGroupReportInfo() {
        return new AcsEmployeeGroupReportInfo();
    }

    /**
     * Create an instance of {@link AcsEmployeeFullBase }
     * 
     * @return
     *     the new instance of {@link AcsEmployeeFullBase }
     */
    public AcsEmployeeFullBase createAcsEmployeeFullBase() {
        return new AcsEmployeeFullBase();
    }

    /**
     * Create an instance of {@link ArrayOfAcsEmployeeInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsEmployeeInfo }
     */
    public ArrayOfAcsEmployeeInfo createArrayOfAcsEmployeeInfo() {
        return new ArrayOfAcsEmployeeInfo();
    }

    /**
     * Create an instance of {@link AcsEmployeeInfo }
     * 
     * @return
     *     the new instance of {@link AcsEmployeeInfo }
     */
    public AcsEmployeeInfo createAcsEmployeeInfo() {
        return new AcsEmployeeInfo();
    }

    /**
     * Create an instance of {@link AcsEmployeeFaceVector }
     * 
     * @return
     *     the new instance of {@link AcsEmployeeFaceVector }
     */
    public AcsEmployeeFaceVector createAcsEmployeeFaceVector() {
        return new AcsEmployeeFaceVector();
    }

    /**
     * Create an instance of {@link EmployeeViewFieldMetadata }
     * 
     * @return
     *     the new instance of {@link EmployeeViewFieldMetadata }
     */
    public EmployeeViewFieldMetadata createEmployeeViewFieldMetadata() {
        return new EmployeeViewFieldMetadata();
    }

    /**
     * Create an instance of {@link BaseViewFieldMetadata }
     * 
     * @return
     *     the new instance of {@link BaseViewFieldMetadata }
     */
    public BaseViewFieldMetadata createBaseViewFieldMetadata() {
        return new BaseViewFieldMetadata();
    }

    /**
     * Create an instance of {@link AcsEmployeePhotosInfo }
     * 
     * @return
     *     the new instance of {@link AcsEmployeePhotosInfo }
     */
    public AcsEmployeePhotosInfo createAcsEmployeePhotosInfo() {
        return new AcsEmployeePhotosInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAscEmployeePhotoModificationDateTimeInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfAscEmployeePhotoModificationDateTimeInfo }
     */
    public ArrayOfAscEmployeePhotoModificationDateTimeInfo createArrayOfAscEmployeePhotoModificationDateTimeInfo() {
        return new ArrayOfAscEmployeePhotoModificationDateTimeInfo();
    }

    /**
     * Create an instance of {@link AscEmployeePhotoModificationDateTimeInfo }
     * 
     * @return
     *     the new instance of {@link AscEmployeePhotoModificationDateTimeInfo }
     */
    public AscEmployeePhotoModificationDateTimeInfo createAscEmployeePhotoModificationDateTimeInfo() {
        return new AscEmployeePhotoModificationDateTimeInfo();
    }

    /**
     * Create an instance of {@link EmployeeShortInfo }
     * 
     * @return
     *     the new instance of {@link EmployeeShortInfo }
     */
    public EmployeeShortInfo createEmployeeShortInfo() {
        return new EmployeeShortInfo();
    }

    /**
     * Create an instance of {@link EmployeeModificationInfo }
     * 
     * @return
     *     the new instance of {@link EmployeeModificationInfo }
     */
    public EmployeeModificationInfo createEmployeeModificationInfo() {
        return new EmployeeModificationInfo();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeeCurentInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfEmployeeCurentInfo }
     */
    public ArrayOfEmployeeCurentInfo createArrayOfEmployeeCurentInfo() {
        return new ArrayOfEmployeeCurentInfo();
    }

    /**
     * Create an instance of {@link EmployeeCurentInfo }
     * 
     * @return
     *     the new instance of {@link EmployeeCurentInfo }
     */
    public EmployeeCurentInfo createEmployeeCurentInfo() {
        return new EmployeeCurentInfo();
    }

    /**
     * Create an instance of {@link AcsEmployeeFaceVectorSaveData }
     * 
     * @return
     *     the new instance of {@link AcsEmployeeFaceVectorSaveData }
     */
    public AcsEmployeeFaceVectorSaveData createAcsEmployeeFaceVectorSaveData() {
        return new AcsEmployeeFaceVectorSaveData();
    }

    /**
     * Create an instance of {@link AttachedEmployeesForVehicle }
     * 
     * @return
     *     the new instance of {@link AttachedEmployeesForVehicle }
     */
    public AttachedEmployeesForVehicle createAttachedEmployeesForVehicle() {
        return new AttachedEmployeesForVehicle();
    }

    /**
     * Create an instance of {@link EmployeeGroupForAlcoGroupFull }
     * 
     * @return
     *     the new instance of {@link EmployeeGroupForAlcoGroupFull }
     */
    public EmployeeGroupForAlcoGroupFull createEmployeeGroupForAlcoGroupFull() {
        return new EmployeeGroupForAlcoGroupFull();
    }

    /**
     * Create an instance of {@link EmployeeGroupForAlcoGroup }
     * 
     * @return
     *     the new instance of {@link EmployeeGroupForAlcoGroup }
     */
    public EmployeeGroupForAlcoGroup createEmployeeGroupForAlcoGroup() {
        return new EmployeeGroupForAlcoGroup();
    }

    /**
     * Create an instance of {@link AcsBoxAccessLevelElementSlimInfo }
     * 
     * @return
     *     the new instance of {@link AcsBoxAccessLevelElementSlimInfo }
     */
    public AcsBoxAccessLevelElementSlimInfo createAcsBoxAccessLevelElementSlimInfo() {
        return new AcsBoxAccessLevelElementSlimInfo();
    }

    /**
     * Create an instance of {@link AcsBoxAccessElementSaveInfo }
     * 
     * @return
     *     the new instance of {@link AcsBoxAccessElementSaveInfo }
     */
    public AcsBoxAccessElementSaveInfo createAcsBoxAccessElementSaveInfo() {
        return new AcsBoxAccessElementSaveInfo();
    }

    /**
     * Create an instance of {@link AcsAccessLevelSlimBase }
     * 
     * @return
     *     the new instance of {@link AcsAccessLevelSlimBase }
     */
    public AcsAccessLevelSlimBase createAcsAccessLevelSlimBase() {
        return new AcsAccessLevelSlimBase();
    }

    /**
     * Create an instance of {@link AcsAccessLevelSimpleInfo }
     * 
     * @return
     *     the new instance of {@link AcsAccessLevelSimpleInfo }
     */
    public AcsAccessLevelSimpleInfo createAcsAccessLevelSimpleInfo() {
        return new AcsAccessLevelSimpleInfo();
    }

    /**
     * Create an instance of {@link AcsScheduleSlimInfo }
     * 
     * @return
     *     the new instance of {@link AcsScheduleSlimInfo }
     */
    public AcsScheduleSlimInfo createAcsScheduleSlimInfo() {
        return new AcsScheduleSlimInfo();
    }

    /**
     * Create an instance of {@link AcsScheduleBase }
     * 
     * @return
     *     the new instance of {@link AcsScheduleBase }
     */
    public AcsScheduleBase createAcsScheduleBase() {
        return new AcsScheduleBase();
    }

    /**
     * Create an instance of {@link ArrayOfRGTimeInterval }
     * 
     * @return
     *     the new instance of {@link ArrayOfRGTimeInterval }
     */
    public ArrayOfRGTimeInterval createArrayOfRGTimeInterval() {
        return new ArrayOfRGTimeInterval();
    }

    /**
     * Create an instance of {@link RGTimeInterval }
     * 
     * @return
     *     the new instance of {@link RGTimeInterval }
     */
    public RGTimeInterval createRGTimeInterval() {
        return new RGTimeInterval();
    }

    /**
     * Create an instance of {@link AcsWeekScheduleSlim }
     * 
     * @return
     *     the new instance of {@link AcsWeekScheduleSlim }
     */
    public AcsWeekScheduleSlim createAcsWeekScheduleSlim() {
        return new AcsWeekScheduleSlim();
    }

    /**
     * Create an instance of {@link AcsWeekSlim }
     * 
     * @return
     *     the new instance of {@link AcsWeekSlim }
     */
    public AcsWeekSlim createAcsWeekSlim() {
        return new AcsWeekSlim();
    }

    /**
     * Create an instance of {@link ArrayOfAcsWeekFull }
     * 
     * @return
     *     the new instance of {@link ArrayOfAcsWeekFull }
     */
    public ArrayOfAcsWeekFull createArrayOfAcsWeekFull() {
        return new ArrayOfAcsWeekFull();
    }

    /**
     * Create an instance of {@link AcsWeekFull }
     * 
     * @return
     *     the new instance of {@link AcsWeekFull }
     */
    public AcsWeekFull createAcsWeekFull() {
        return new AcsWeekFull();
    }

    /**
     * Create an instance of {@link AcsCustomizableDayBase }
     * 
     * @return
     *     the new instance of {@link AcsCustomizableDayBase }
     */
    public AcsCustomizableDayBase createAcsCustomizableDayBase() {
        return new AcsCustomizableDayBase();
    }

    /**
     * Create an instance of {@link AcsVehicleSearched }
     * 
     * @return
     *     the new instance of {@link AcsVehicleSearched }
     */
    public AcsVehicleSearched createAcsVehicleSearched() {
        return new AcsVehicleSearched();
    }

    /**
     * Create an instance of {@link EmployeesVehicle }
     * 
     * @return
     *     the new instance of {@link EmployeesVehicle }
     */
    public EmployeesVehicle createEmployeesVehicle() {
        return new EmployeesVehicle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchCondition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchCondition }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "SearchCondition")
    public JAXBElement<SearchCondition> createSearchCondition(SearchCondition value) {
        return new JAXBElement<>(_SearchCondition_QNAME, SearchCondition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeSortedColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeSortedColumn }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeeSortedColumn")
    public JAXBElement<EmployeeSortedColumn> createEmployeeSortedColumn(EmployeeSortedColumn value) {
        return new JAXBElement<>(_EmployeeSortedColumn_QNAME, EmployeeSortedColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchWay }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchWay }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "SearchWay")
    public JAXBElement<SearchWay> createSearchWay(SearchWay value) {
        return new JAXBElement<>(_SearchWay_QNAME, SearchWay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployee }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfAcsEmployee")
    public JAXBElement<ArrayOfAcsEmployee> createArrayOfAcsEmployee(ArrayOfAcsEmployee value) {
        return new JAXBElement<>(_ArrayOfAcsEmployee_QNAME, ArrayOfAcsEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployee }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployee")
    public JAXBElement<AcsEmployee> createAcsEmployee(AcsEmployee value) {
        return new JAXBElement<>(_AcsEmployee_QNAME, AcsEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupTypeSearch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GroupTypeSearch }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "GroupTypeSearch")
    public JAXBElement<GroupTypeSearch> createGroupTypeSearch(GroupTypeSearch value) {
        return new JAXBElement<>(_GroupTypeSearch_QNAME, GroupTypeSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleTypeSearch }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehicleTypeSearch }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "VehicleTypeSearch")
    public JAXBElement<VehicleTypeSearch> createVehicleTypeSearch(VehicleTypeSearch value) {
        return new JAXBElement<>(_VehicleTypeSearch_QNAME, VehicleTypeSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeesInfoData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeesInfoData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeesInfoData")
    public JAXBElement<EmployeesInfoData> createEmployeesInfoData(EmployeesInfoData value) {
        return new JAXBElement<>(_EmployeesInfoData_QNAME, EmployeesInfoData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeSlim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeSlim }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfAcsEmployeeSlim")
    public JAXBElement<ArrayOfAcsEmployeeSlim> createArrayOfAcsEmployeeSlim(ArrayOfAcsEmployeeSlim value) {
        return new JAXBElement<>(_ArrayOfAcsEmployeeSlim_QNAME, ArrayOfAcsEmployeeSlim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeSlim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeSlim }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeeSlim")
    public JAXBElement<AcsEmployeeSlim> createAcsEmployeeSlim(AcsEmployeeSlim value) {
        return new JAXBElement<>(_AcsEmployeeSlim_QNAME, AcsEmployeeSlim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeSlimBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeSlimBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeeSlimBase")
    public JAXBElement<AcsEmployeeSlimBase> createAcsEmployeeSlimBase(AcsEmployeeSlimBase value) {
        return new JAXBElement<>(_AcsEmployeeSlimBase_QNAME, AcsEmployeeSlimBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeesFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeesFilter }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeesFilter")
    public JAXBElement<EmployeesFilter> createEmployeesFilter(EmployeesFilter value) {
        return new JAXBElement<>(_EmployeesFilter_QNAME, EmployeesFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeShowColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeShowColumn }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeeShowColumn")
    public JAXBElement<EmployeeShowColumn> createEmployeeShowColumn(EmployeeShowColumn value) {
        return new JAXBElement<>(_EmployeeShowColumn_QNAME, EmployeeShowColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "DocumentType")
    public JAXBElement<DocumentType> createDocumentType(DocumentType value) {
        return new JAXBElement<>(_DocumentType_QNAME, DocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeSchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeSchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfAcsEmployeeSchedule")
    public JAXBElement<ArrayOfAcsEmployeeSchedule> createArrayOfAcsEmployeeSchedule(ArrayOfAcsEmployeeSchedule value) {
        return new JAXBElement<>(_ArrayOfAcsEmployeeSchedule_QNAME, ArrayOfAcsEmployeeSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeSchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeSchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeeSchedule")
    public JAXBElement<AcsEmployeeSchedule> createAcsEmployeeSchedule(AcsEmployeeSchedule value) {
        return new JAXBElement<>(_AcsEmployeeSchedule_QNAME, AcsEmployeeSchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeScheduleSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeScheduleSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeeScheduleSaveData")
    public JAXBElement<AcsEmployeeScheduleSaveData> createAcsEmployeeScheduleSaveData(AcsEmployeeScheduleSaveData value) {
        return new JAXBElement<>(_AcsEmployeeScheduleSaveData_QNAME, AcsEmployeeScheduleSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfAcsEmployeeGroup")
    public JAXBElement<ArrayOfAcsEmployeeGroup> createArrayOfAcsEmployeeGroup(ArrayOfAcsEmployeeGroup value) {
        return new JAXBElement<>(_ArrayOfAcsEmployeeGroup_QNAME, ArrayOfAcsEmployeeGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeeGroup")
    public JAXBElement<AcsEmployeeGroup> createAcsEmployeeGroup(AcsEmployeeGroup value) {
        return new JAXBElement<>(_AcsEmployeeGroup_QNAME, AcsEmployeeGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeGroupType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeGroupType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeeGroupType")
    public JAXBElement<EmployeeGroupType> createEmployeeGroupType(EmployeeGroupType value) {
        return new JAXBElement<>(_EmployeeGroupType_QNAME, EmployeeGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeGroupReactionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeGroupReactionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeeGroupReactionInfo")
    public JAXBElement<AcsEmployeeGroupReactionInfo> createAcsEmployeeGroupReactionInfo(AcsEmployeeGroupReactionInfo value) {
        return new JAXBElement<>(_AcsEmployeeGroupReactionInfo_QNAME, AcsEmployeeGroupReactionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeGroupReactionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeGroupReactionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfAcsEmployeeGroupReactionInfo")
    public JAXBElement<ArrayOfAcsEmployeeGroupReactionInfo> createArrayOfAcsEmployeeGroupReactionInfo(ArrayOfAcsEmployeeGroupReactionInfo value) {
        return new JAXBElement<>(_ArrayOfAcsEmployeeGroupReactionInfo_QNAME, ArrayOfAcsEmployeeGroupReactionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeGroupReportInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeGroupReportInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeeGroupReportInfo")
    public JAXBElement<AcsEmployeeGroupReportInfo> createAcsEmployeeGroupReportInfo(AcsEmployeeGroupReportInfo value) {
        return new JAXBElement<>(_AcsEmployeeGroupReportInfo_QNAME, AcsEmployeeGroupReportInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeGroupReportInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeGroupReportInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfAcsEmployeeGroupReportInfo")
    public JAXBElement<ArrayOfAcsEmployeeGroupReportInfo> createArrayOfAcsEmployeeGroupReportInfo(ArrayOfAcsEmployeeGroupReportInfo value) {
        return new JAXBElement<>(_ArrayOfAcsEmployeeGroupReportInfo_QNAME, ArrayOfAcsEmployeeGroupReportInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeDocumentsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeDocumentsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeeDocumentsData")
    public JAXBElement<AcsEmployeeDocumentsData> createAcsEmployeeDocumentsData(AcsEmployeeDocumentsData value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsData_QNAME, AcsEmployeeDocumentsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeDocumentsSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeDocumentsSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeeDocumentsSaveData")
    public JAXBElement<AcsEmployeeDocumentsSaveData> createAcsEmployeeDocumentsSaveData(AcsEmployeeDocumentsSaveData value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveData_QNAME, AcsEmployeeDocumentsSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeeFull")
    public JAXBElement<AcsEmployeeFull> createAcsEmployeeFull(AcsEmployeeFull value) {
        return new JAXBElement<>(_AcsEmployeeFull_QNAME, AcsEmployeeFull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeFullBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeFullBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeeFullBase")
    public JAXBElement<AcsEmployeeFullBase> createAcsEmployeeFullBase(AcsEmployeeFullBase value) {
        return new JAXBElement<>(_AcsEmployeeFullBase_QNAME, AcsEmployeeFullBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeesInfoData2 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeesInfoData2 }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeesInfoData2")
    public JAXBElement<EmployeesInfoData2> createEmployeesInfoData2(EmployeesInfoData2 value) {
        return new JAXBElement<>(_EmployeesInfoData2_QNAME, EmployeesInfoData2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfAcsEmployeeInfo")
    public JAXBElement<ArrayOfAcsEmployeeInfo> createArrayOfAcsEmployeeInfo(ArrayOfAcsEmployeeInfo value) {
        return new JAXBElement<>(_ArrayOfAcsEmployeeInfo_QNAME, ArrayOfAcsEmployeeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeeInfo")
    public JAXBElement<AcsEmployeeInfo> createAcsEmployeeInfo(AcsEmployeeInfo value) {
        return new JAXBElement<>(_AcsEmployeeInfo_QNAME, AcsEmployeeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeFaceVectorFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeFaceVectorFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeeFaceVectorFull")
    public JAXBElement<AcsEmployeeFaceVectorFull> createAcsEmployeeFaceVectorFull(AcsEmployeeFaceVectorFull value) {
        return new JAXBElement<>(_AcsEmployeeFaceVectorFull_QNAME, AcsEmployeeFaceVectorFull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeFaceVector }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeFaceVector }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeeFaceVector")
    public JAXBElement<AcsEmployeeFaceVector> createAcsEmployeeFaceVector(AcsEmployeeFaceVector value) {
        return new JAXBElement<>(_AcsEmployeeFaceVector_QNAME, AcsEmployeeFaceVector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaceSourceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaceSourceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "FaceSourceType")
    public JAXBElement<FaceSourceType> createFaceSourceType(FaceSourceType value) {
        return new JAXBElement<>(_FaceSourceType_QNAME, FaceSourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeFaceVector }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeFaceVector }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfAcsEmployeeFaceVector")
    public JAXBElement<ArrayOfAcsEmployeeFaceVector> createArrayOfAcsEmployeeFaceVector(ArrayOfAcsEmployeeFaceVector value) {
        return new JAXBElement<>(_ArrayOfAcsEmployeeFaceVector_QNAME, ArrayOfAcsEmployeeFaceVector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeFaceVectorFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeFaceVectorFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfAcsEmployeeFaceVectorFull")
    public JAXBElement<ArrayOfAcsEmployeeFaceVectorFull> createArrayOfAcsEmployeeFaceVectorFull(ArrayOfAcsEmployeeFaceVectorFull value) {
        return new JAXBElement<>(_ArrayOfAcsEmployeeFaceVectorFull_QNAME, ArrayOfAcsEmployeeFaceVectorFull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeeInfo")
    public JAXBElement<EmployeeInfo> createEmployeeInfo(EmployeeInfo value) {
        return new JAXBElement<>(_EmployeeInfo_QNAME, EmployeeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeViewFieldMetadata }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeViewFieldMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfEmployeeViewFieldMetadata")
    public JAXBElement<ArrayOfEmployeeViewFieldMetadata> createArrayOfEmployeeViewFieldMetadata(ArrayOfEmployeeViewFieldMetadata value) {
        return new JAXBElement<>(_ArrayOfEmployeeViewFieldMetadata_QNAME, ArrayOfEmployeeViewFieldMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeViewFieldMetadata }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeViewFieldMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeeViewFieldMetadata")
    public JAXBElement<EmployeeViewFieldMetadata> createEmployeeViewFieldMetadata(EmployeeViewFieldMetadata value) {
        return new JAXBElement<>(_EmployeeViewFieldMetadata_QNAME, EmployeeViewFieldMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseViewFieldMetadata }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaseViewFieldMetadata }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "BaseViewFieldMetadata")
    public JAXBElement<BaseViewFieldMetadata> createBaseViewFieldMetadata(BaseViewFieldMetadata value) {
        return new JAXBElement<>(_BaseViewFieldMetadata_QNAME, BaseViewFieldMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfAcsEmployeeFull")
    public JAXBElement<ArrayOfAcsEmployeeFull> createArrayOfAcsEmployeeFull(ArrayOfAcsEmployeeFull value) {
        return new JAXBElement<>(_ArrayOfAcsEmployeeFull_QNAME, ArrayOfAcsEmployeeFull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeePhotosInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeePhotosInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfAcsEmployeePhotosInfo")
    public JAXBElement<ArrayOfAcsEmployeePhotosInfo> createArrayOfAcsEmployeePhotosInfo(ArrayOfAcsEmployeePhotosInfo value) {
        return new JAXBElement<>(_ArrayOfAcsEmployeePhotosInfo_QNAME, ArrayOfAcsEmployeePhotosInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeePhotosInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeePhotosInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeePhotosInfo")
    public JAXBElement<AcsEmployeePhotosInfo> createAcsEmployeePhotosInfo(AcsEmployeePhotosInfo value) {
        return new JAXBElement<>(_AcsEmployeePhotosInfo_QNAME, AcsEmployeePhotosInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAscEmployeePhotoModificationDateTimeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAscEmployeePhotoModificationDateTimeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfAscEmployeePhotoModificationDateTimeInfo")
    public JAXBElement<ArrayOfAscEmployeePhotoModificationDateTimeInfo> createArrayOfAscEmployeePhotoModificationDateTimeInfo(ArrayOfAscEmployeePhotoModificationDateTimeInfo value) {
        return new JAXBElement<>(_ArrayOfAscEmployeePhotoModificationDateTimeInfo_QNAME, ArrayOfAscEmployeePhotoModificationDateTimeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AscEmployeePhotoModificationDateTimeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AscEmployeePhotoModificationDateTimeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AscEmployeePhotoModificationDateTimeInfo")
    public JAXBElement<AscEmployeePhotoModificationDateTimeInfo> createAscEmployeePhotoModificationDateTimeInfo(AscEmployeePhotoModificationDateTimeInfo value) {
        return new JAXBElement<>(_AscEmployeePhotoModificationDateTimeInfo_QNAME, AscEmployeePhotoModificationDateTimeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeImageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeImageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeeImageType")
    public JAXBElement<EmployeeImageType> createEmployeeImageType(EmployeeImageType value) {
        return new JAXBElement<>(_EmployeeImageType_QNAME, EmployeeImageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeShortInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeShortInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfEmployeeShortInfo")
    public JAXBElement<ArrayOfEmployeeShortInfo> createArrayOfEmployeeShortInfo(ArrayOfEmployeeShortInfo value) {
        return new JAXBElement<>(_ArrayOfEmployeeShortInfo_QNAME, ArrayOfEmployeeShortInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeShortInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeShortInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeeShortInfo")
    public JAXBElement<EmployeeShortInfo> createEmployeeShortInfo(EmployeeShortInfo value) {
        return new JAXBElement<>(_EmployeeShortInfo_QNAME, EmployeeShortInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeModificationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeModificationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfEmployeeModificationInfo")
    public JAXBElement<ArrayOfEmployeeModificationInfo> createArrayOfEmployeeModificationInfo(ArrayOfEmployeeModificationInfo value) {
        return new JAXBElement<>(_ArrayOfEmployeeModificationInfo_QNAME, ArrayOfEmployeeModificationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeModificationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeModificationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeeModificationInfo")
    public JAXBElement<EmployeeModificationInfo> createEmployeeModificationInfo(EmployeeModificationInfo value) {
        return new JAXBElement<>(_EmployeeModificationInfo_QNAME, EmployeeModificationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeeSaveData")
    public JAXBElement<AcsEmployeeSaveData> createAcsEmployeeSaveData(AcsEmployeeSaveData value) {
        return new JAXBElement<>(_AcsEmployeeSaveData_QNAME, AcsEmployeeSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeesSortedColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeesSortedColumn }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeesSortedColumn")
    public JAXBElement<EmployeesSortedColumn> createEmployeesSortedColumn(EmployeesSortedColumn value) {
        return new JAXBElement<>(_EmployeesSortedColumn_QNAME, EmployeesSortedColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeesData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeesData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeesData")
    public JAXBElement<EmployeesData> createEmployeesData(EmployeesData value) {
        return new JAXBElement<>(_EmployeesData_QNAME, EmployeesData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeCurentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeCurentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfEmployeeCurentInfo")
    public JAXBElement<ArrayOfEmployeeCurentInfo> createArrayOfEmployeeCurentInfo(ArrayOfEmployeeCurentInfo value) {
        return new JAXBElement<>(_ArrayOfEmployeeCurentInfo_QNAME, ArrayOfEmployeeCurentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeCurentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeCurentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeeCurentInfo")
    public JAXBElement<EmployeeCurentInfo> createEmployeeCurentInfo(EmployeeCurentInfo value) {
        return new JAXBElement<>(_EmployeeCurentInfo_QNAME, EmployeeCurentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeFaceVectorSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeFaceVectorSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfAcsEmployeeFaceVectorSaveData")
    public JAXBElement<ArrayOfAcsEmployeeFaceVectorSaveData> createArrayOfAcsEmployeeFaceVectorSaveData(ArrayOfAcsEmployeeFaceVectorSaveData value) {
        return new JAXBElement<>(_ArrayOfAcsEmployeeFaceVectorSaveData_QNAME, ArrayOfAcsEmployeeFaceVectorSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeFaceVectorSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeFaceVectorSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AcsEmployeeFaceVectorSaveData")
    public JAXBElement<AcsEmployeeFaceVectorSaveData> createAcsEmployeeFaceVectorSaveData(AcsEmployeeFaceVectorSaveData value) {
        return new JAXBElement<>(_AcsEmployeeFaceVectorSaveData_QNAME, AcsEmployeeFaceVectorSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachedEmployeesForVehicle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAttachedEmployeesForVehicle }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ArrayOfAttachedEmployeesForVehicle")
    public JAXBElement<ArrayOfAttachedEmployeesForVehicle> createArrayOfAttachedEmployeesForVehicle(ArrayOfAttachedEmployeesForVehicle value) {
        return new JAXBElement<>(_ArrayOfAttachedEmployeesForVehicle_QNAME, ArrayOfAttachedEmployeesForVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachedEmployeesForVehicle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttachedEmployeesForVehicle }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AttachedEmployeesForVehicle")
    public JAXBElement<AttachedEmployeesForVehicle> createAttachedEmployeesForVehicle(AttachedEmployeesForVehicle value) {
        return new JAXBElement<>(_AttachedEmployeesForVehicle_QNAME, AttachedEmployeesForVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignmentFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssignmentFilter }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "AssignmentFilter")
    public JAXBElement<AssignmentFilter> createAssignmentFilter(AssignmentFilter value) {
        return new JAXBElement<>(_AssignmentFilter_QNAME, AssignmentFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeAssignmentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeAssignmentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "EmployeeAssignmentType")
    public JAXBElement<EmployeeAssignmentType> createEmployeeAssignmentType(EmployeeAssignmentType value) {
        return new JAXBElement<>(_EmployeeAssignmentType_QNAME, EmployeeAssignmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAlcoGroupSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAlcoGroupSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "ArrayOfAcsAlcoGroupSlimInfo")
    public JAXBElement<ArrayOfAcsAlcoGroupSlimInfo> createArrayOfAcsAlcoGroupSlimInfo(ArrayOfAcsAlcoGroupSlimInfo value) {
        return new JAXBElement<>(_ArrayOfAcsAlcoGroupSlimInfo_QNAME, ArrayOfAcsAlcoGroupSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsAlcoGroupSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsAlcoGroupSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "AcsAlcoGroupSlimInfo")
    public JAXBElement<AcsAlcoGroupSlimInfo> createAcsAlcoGroupSlimInfo(AcsAlcoGroupSlimInfo value) {
        return new JAXBElement<>(_AcsAlcoGroupSlimInfo_QNAME, AcsAlcoGroupSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsAlcoGroupSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsAlcoGroupSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "AcsAlcoGroupSaveData")
    public JAXBElement<AcsAlcoGroupSaveData> createAcsAlcoGroupSaveData(AcsAlcoGroupSaveData value) {
        return new JAXBElement<>(_AcsAlcoGroupSaveData_QNAME, AcsAlcoGroupSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeGroupForAlcoGroupFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeGroupForAlcoGroupFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "ArrayOfEmployeeGroupForAlcoGroupFull")
    public JAXBElement<ArrayOfEmployeeGroupForAlcoGroupFull> createArrayOfEmployeeGroupForAlcoGroupFull(ArrayOfEmployeeGroupForAlcoGroupFull value) {
        return new JAXBElement<>(_ArrayOfEmployeeGroupForAlcoGroupFull_QNAME, ArrayOfEmployeeGroupForAlcoGroupFull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeGroupForAlcoGroupFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeGroupForAlcoGroupFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "EmployeeGroupForAlcoGroupFull")
    public JAXBElement<EmployeeGroupForAlcoGroupFull> createEmployeeGroupForAlcoGroupFull(EmployeeGroupForAlcoGroupFull value) {
        return new JAXBElement<>(_EmployeeGroupForAlcoGroupFull_QNAME, EmployeeGroupForAlcoGroupFull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeGroupForAlcoGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeGroupForAlcoGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "EmployeeGroupForAlcoGroup")
    public JAXBElement<EmployeeGroupForAlcoGroup> createEmployeeGroupForAlcoGroup(EmployeeGroupForAlcoGroup value) {
        return new JAXBElement<>(_EmployeeGroupForAlcoGroup_QNAME, EmployeeGroupForAlcoGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeDataResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeDataResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "ChangeDataResult")
    public JAXBElement<ChangeDataResult> createChangeDataResult(ChangeDataResult value) {
        return new JAXBElement<>(_ChangeDataResult_QNAME, ChangeDataResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePositionCodesResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangePositionCodesResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "ChangePositionCodesResult")
    public JAXBElement<ChangePositionCodesResult> createChangePositionCodesResult(ChangePositionCodesResult value) {
        return new JAXBElement<>(_ChangePositionCodesResult_QNAME, ChangePositionCodesResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeGroupForAlcoGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeGroupForAlcoGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "ArrayOfEmployeeGroupForAlcoGroup")
    public JAXBElement<ArrayOfEmployeeGroupForAlcoGroup> createArrayOfEmployeeGroupForAlcoGroup(ArrayOfEmployeeGroupForAlcoGroup value) {
        return new JAXBElement<>(_ArrayOfEmployeeGroupForAlcoGroup_QNAME, ArrayOfEmployeeGroupForAlcoGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsBoxAccessLevelElementSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsBoxAccessLevelElementSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", name = "ArrayOfAcsBoxAccessLevelElementSlimInfo")
    public JAXBElement<ArrayOfAcsBoxAccessLevelElementSlimInfo> createArrayOfAcsBoxAccessLevelElementSlimInfo(ArrayOfAcsBoxAccessLevelElementSlimInfo value) {
        return new JAXBElement<>(_ArrayOfAcsBoxAccessLevelElementSlimInfo_QNAME, ArrayOfAcsBoxAccessLevelElementSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsBoxAccessLevelElementSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsBoxAccessLevelElementSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", name = "AcsBoxAccessLevelElementSlimInfo")
    public JAXBElement<AcsBoxAccessLevelElementSlimInfo> createAcsBoxAccessLevelElementSlimInfo(AcsBoxAccessLevelElementSlimInfo value) {
        return new JAXBElement<>(_AcsBoxAccessLevelElementSlimInfo_QNAME, AcsBoxAccessLevelElementSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsBoxAccessElementSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsBoxAccessElementSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", name = "AcsBoxAccessElementSaveInfo")
    public JAXBElement<AcsBoxAccessElementSaveInfo> createAcsBoxAccessElementSaveInfo(AcsBoxAccessElementSaveInfo value) {
        return new JAXBElement<>(_AcsBoxAccessElementSaveInfo_QNAME, AcsBoxAccessElementSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsBoxAccessLevelSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsBoxAccessLevelSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", name = "ArrayOfAcsBoxAccessLevelSlimInfo")
    public JAXBElement<ArrayOfAcsBoxAccessLevelSlimInfo> createArrayOfAcsBoxAccessLevelSlimInfo(ArrayOfAcsBoxAccessLevelSlimInfo value) {
        return new JAXBElement<>(_ArrayOfAcsBoxAccessLevelSlimInfo_QNAME, ArrayOfAcsBoxAccessLevelSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsBoxAccessLevelSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsBoxAccessLevelSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", name = "AcsBoxAccessLevelSlimInfo")
    public JAXBElement<AcsBoxAccessLevelSlimInfo> createAcsBoxAccessLevelSlimInfo(AcsBoxAccessLevelSlimInfo value) {
        return new JAXBElement<>(_AcsBoxAccessLevelSlimInfo_QNAME, AcsBoxAccessLevelSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsBoxAccessLevelSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsBoxAccessLevelSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", name = "AcsBoxAccessLevelSaveData")
    public JAXBElement<AcsBoxAccessLevelSaveData> createAcsBoxAccessLevelSaveData(AcsBoxAccessLevelSaveData value) {
        return new JAXBElement<>(_AcsBoxAccessLevelSaveData_QNAME, AcsBoxAccessLevelSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoxAccessLevelMode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BoxAccessLevelMode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", name = "BoxAccessLevelMode")
    public JAXBElement<BoxAccessLevelMode> createBoxAccessLevelMode(BoxAccessLevelMode value) {
        return new JAXBElement<>(_BoxAccessLevelMode_QNAME, BoxAccessLevelMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsBoxAccessElementSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsBoxAccessElementSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", name = "ArrayOfAcsBoxAccessElementSaveInfo")
    public JAXBElement<ArrayOfAcsBoxAccessElementSaveInfo> createArrayOfAcsBoxAccessElementSaveInfo(ArrayOfAcsBoxAccessElementSaveInfo value) {
        return new JAXBElement<>(_ArrayOfAcsBoxAccessElementSaveInfo_QNAME, ArrayOfAcsBoxAccessElementSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAccessLevelSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAccessLevelSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", name = "ArrayOfAcsAccessLevelSlimInfo")
    public JAXBElement<ArrayOfAcsAccessLevelSlimInfo> createArrayOfAcsAccessLevelSlimInfo(ArrayOfAcsAccessLevelSlimInfo value) {
        return new JAXBElement<>(_ArrayOfAcsAccessLevelSlimInfo_QNAME, ArrayOfAcsAccessLevelSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsAccessLevelSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsAccessLevelSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", name = "AcsAccessLevelSlimInfo")
    public JAXBElement<AcsAccessLevelSlimInfo> createAcsAccessLevelSlimInfo(AcsAccessLevelSlimInfo value) {
        return new JAXBElement<>(_AcsAccessLevelSlimInfo_QNAME, AcsAccessLevelSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsAccessLevelSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsAccessLevelSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", name = "AcsAccessLevelSaveData")
    public JAXBElement<AcsAccessLevelSaveData> createAcsAccessLevelSaveData(AcsAccessLevelSaveData value) {
        return new JAXBElement<>(_AcsAccessLevelSaveData_QNAME, AcsAccessLevelSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsAccessLevelSlimBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsAccessLevelSlimBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", name = "AcsAccessLevelSlimBase")
    public JAXBElement<AcsAccessLevelSlimBase> createAcsAccessLevelSlimBase(AcsAccessLevelSlimBase value) {
        return new JAXBElement<>(_AcsAccessLevelSlimBase_QNAME, AcsAccessLevelSlimBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessLevelSortedColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessLevelSortedColumn }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", name = "AccessLevelSortedColumn")
    public JAXBElement<AccessLevelSortedColumn> createAccessLevelSortedColumn(AccessLevelSortedColumn value) {
        return new JAXBElement<>(_AccessLevelSortedColumn_QNAME, AccessLevelSortedColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessLevelsOwner }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessLevelsOwner }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", name = "AccessLevelsOwner")
    public JAXBElement<AccessLevelsOwner> createAccessLevelsOwner(AccessLevelsOwner value) {
        return new JAXBElement<>(_AccessLevelsOwner_QNAME, AccessLevelsOwner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LAccessLevelsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LAccessLevelsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", name = "LAccessLevelsData")
    public JAXBElement<LAccessLevelsData> createLAccessLevelsData(LAccessLevelsData value) {
        return new JAXBElement<>(_LAccessLevelsData_QNAME, LAccessLevelsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAccessLevelSimpleInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAccessLevelSimpleInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", name = "ArrayOfAcsAccessLevelSimpleInfo")
    public JAXBElement<ArrayOfAcsAccessLevelSimpleInfo> createArrayOfAcsAccessLevelSimpleInfo(ArrayOfAcsAccessLevelSimpleInfo value) {
        return new JAXBElement<>(_ArrayOfAcsAccessLevelSimpleInfo_QNAME, ArrayOfAcsAccessLevelSimpleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsAccessLevelSimpleInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsAccessLevelSimpleInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", name = "AcsAccessLevelSimpleInfo")
    public JAXBElement<AcsAccessLevelSimpleInfo> createAcsAccessLevelSimpleInfo(AcsAccessLevelSimpleInfo value) {
        return new JAXBElement<>(_AcsAccessLevelSimpleInfo_QNAME, AcsAccessLevelSimpleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsKeyInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsKeyInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "ArrayOfAcsKeyInfo")
    public JAXBElement<ArrayOfAcsKeyInfo> createArrayOfAcsKeyInfo(ArrayOfAcsKeyInfo value) {
        return new JAXBElement<>(_ArrayOfAcsKeyInfo_QNAME, ArrayOfAcsKeyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsKeyInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsKeyInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "AcsKeyInfo")
    public JAXBElement<AcsKeyInfo> createAcsKeyInfo(AcsKeyInfo value) {
        return new JAXBElement<>(_AcsKeyInfo_QNAME, AcsKeyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsKeySaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsKeySaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "AcsKeySaveData")
    public JAXBElement<AcsKeySaveData> createAcsKeySaveData(AcsKeySaveData value) {
        return new JAXBElement<>(_AcsKeySaveData_QNAME, AcsKeySaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsScheduleSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsScheduleSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "AcsScheduleSlimInfo")
    public JAXBElement<AcsScheduleSlimInfo> createAcsScheduleSlimInfo(AcsScheduleSlimInfo value) {
        return new JAXBElement<>(_AcsScheduleSlimInfo_QNAME, AcsScheduleSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsScheduleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsScheduleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "AcsScheduleType")
    public JAXBElement<AcsScheduleType> createAcsScheduleType(AcsScheduleType value) {
        return new JAXBElement<>(_AcsScheduleType_QNAME, AcsScheduleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsDaySchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsDaySchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "ArrayOfAcsDaySchedule")
    public JAXBElement<ArrayOfAcsDaySchedule> createArrayOfAcsDaySchedule(ArrayOfAcsDaySchedule value) {
        return new JAXBElement<>(_ArrayOfAcsDaySchedule_QNAME, ArrayOfAcsDaySchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "AcsDaySchedule")
    public JAXBElement<AcsDaySchedule> createAcsDaySchedule(AcsDaySchedule value) {
        return new JAXBElement<>(_AcsDaySchedule_QNAME, AcsDaySchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsScheduleBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsScheduleBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "AcsScheduleBase")
    public JAXBElement<AcsScheduleBase> createAcsScheduleBase(AcsScheduleBase value) {
        return new JAXBElement<>(_AcsScheduleBase_QNAME, AcsScheduleBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsScheduleBuiltInType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsScheduleBuiltInType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "AcsScheduleBuiltInType")
    public JAXBElement<AcsScheduleBuiltInType> createAcsScheduleBuiltInType(AcsScheduleBuiltInType value) {
        return new JAXBElement<>(_AcsScheduleBuiltInType_QNAME, AcsScheduleBuiltInType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RGDayIntervals }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RGDayIntervals }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "RGDayIntervals")
    public JAXBElement<RGDayIntervals> createRGDayIntervals(RGDayIntervals value) {
        return new JAXBElement<>(_RGDayIntervals_QNAME, RGDayIntervals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRGTimeInterval }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRGTimeInterval }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "ArrayOfRGTimeInterval")
    public JAXBElement<ArrayOfRGTimeInterval> createArrayOfRGTimeInterval(ArrayOfRGTimeInterval value) {
        return new JAXBElement<>(_ArrayOfRGTimeInterval_QNAME, ArrayOfRGTimeInterval.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RGTimeInterval }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RGTimeInterval }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "RGTimeInterval")
    public JAXBElement<RGTimeInterval> createRGTimeInterval(RGTimeInterval value) {
        return new JAXBElement<>(_RGTimeInterval_QNAME, RGTimeInterval.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsTimeIntervalType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsTimeIntervalType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "AcsTimeIntervalType")
    public JAXBElement<AcsTimeIntervalType> createAcsTimeIntervalType(AcsTimeIntervalType value) {
        return new JAXBElement<>(_AcsTimeIntervalType_QNAME, AcsTimeIntervalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsScheduleOwnerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsScheduleOwnerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "AcsScheduleOwnerType")
    public JAXBElement<AcsScheduleOwnerType> createAcsScheduleOwnerType(AcsScheduleOwnerType value) {
        return new JAXBElement<>(_AcsScheduleOwnerType_QNAME, AcsScheduleOwnerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsMultiDaySchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsMultiDaySchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "ArrayOfAcsMultiDaySchedule")
    public JAXBElement<ArrayOfAcsMultiDaySchedule> createArrayOfAcsMultiDaySchedule(ArrayOfAcsMultiDaySchedule value) {
        return new JAXBElement<>(_ArrayOfAcsMultiDaySchedule_QNAME, ArrayOfAcsMultiDaySchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsMultiDaySchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsMultiDaySchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "AcsMultiDaySchedule")
    public JAXBElement<AcsMultiDaySchedule> createAcsMultiDaySchedule(AcsMultiDaySchedule value) {
        return new JAXBElement<>(_AcsMultiDaySchedule_QNAME, AcsMultiDaySchedule.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRGDayIntervals }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRGDayIntervals }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "ArrayOfRGDayIntervals")
    public JAXBElement<ArrayOfRGDayIntervals> createArrayOfRGDayIntervals(ArrayOfRGDayIntervals value) {
        return new JAXBElement<>(_ArrayOfRGDayIntervals_QNAME, ArrayOfRGDayIntervals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsWeekScheduleSlim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsWeekScheduleSlim }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "ArrayOfAcsWeekScheduleSlim")
    public JAXBElement<ArrayOfAcsWeekScheduleSlim> createArrayOfAcsWeekScheduleSlim(ArrayOfAcsWeekScheduleSlim value) {
        return new JAXBElement<>(_ArrayOfAcsWeekScheduleSlim_QNAME, ArrayOfAcsWeekScheduleSlim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsWeekScheduleSlim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsWeekScheduleSlim }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "AcsWeekScheduleSlim")
    public JAXBElement<AcsWeekScheduleSlim> createAcsWeekScheduleSlim(AcsWeekScheduleSlim value) {
        return new JAXBElement<>(_AcsWeekScheduleSlim_QNAME, AcsWeekScheduleSlim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsWeekSlim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsWeekSlim }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "ArrayOfAcsWeekSlim")
    public JAXBElement<ArrayOfAcsWeekSlim> createArrayOfAcsWeekSlim(ArrayOfAcsWeekSlim value) {
        return new JAXBElement<>(_ArrayOfAcsWeekSlim_QNAME, ArrayOfAcsWeekSlim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsWeekSlim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsWeekSlim }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "AcsWeekSlim")
    public JAXBElement<AcsWeekSlim> createAcsWeekSlim(AcsWeekSlim value) {
        return new JAXBElement<>(_AcsWeekSlim_QNAME, AcsWeekSlim.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsWeekScheduleFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsWeekScheduleFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "ArrayOfAcsWeekScheduleFull")
    public JAXBElement<ArrayOfAcsWeekScheduleFull> createArrayOfAcsWeekScheduleFull(ArrayOfAcsWeekScheduleFull value) {
        return new JAXBElement<>(_ArrayOfAcsWeekScheduleFull_QNAME, ArrayOfAcsWeekScheduleFull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsWeekScheduleFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsWeekScheduleFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "AcsWeekScheduleFull")
    public JAXBElement<AcsWeekScheduleFull> createAcsWeekScheduleFull(AcsWeekScheduleFull value) {
        return new JAXBElement<>(_AcsWeekScheduleFull_QNAME, AcsWeekScheduleFull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsWeekFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsWeekFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "ArrayOfAcsWeekFull")
    public JAXBElement<ArrayOfAcsWeekFull> createArrayOfAcsWeekFull(ArrayOfAcsWeekFull value) {
        return new JAXBElement<>(_ArrayOfAcsWeekFull_QNAME, ArrayOfAcsWeekFull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsWeekFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsWeekFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "AcsWeekFull")
    public JAXBElement<AcsWeekFull> createAcsWeekFull(AcsWeekFull value) {
        return new JAXBElement<>(_AcsWeekFull_QNAME, AcsWeekFull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsCustomDay }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsCustomDay }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "ArrayOfAcsCustomDay")
    public JAXBElement<ArrayOfAcsCustomDay> createArrayOfAcsCustomDay(ArrayOfAcsCustomDay value) {
        return new JAXBElement<>(_ArrayOfAcsCustomDay_QNAME, ArrayOfAcsCustomDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsCustomDay }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsCustomDay }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "AcsCustomDay")
    public JAXBElement<AcsCustomDay> createAcsCustomDay(AcsCustomDay value) {
        return new JAXBElement<>(_AcsCustomDay_QNAME, AcsCustomDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsCustomizableDayBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsCustomizableDayBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "AcsCustomizableDayBase")
    public JAXBElement<AcsCustomizableDayBase> createAcsCustomizableDayBase(AcsCustomizableDayBase value) {
        return new JAXBElement<>(_AcsCustomizableDayBase_QNAME, AcsCustomizableDayBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsCustomizableDayType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsCustomizableDayType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "AcsCustomizableDayType")
    public JAXBElement<AcsCustomizableDayType> createAcsCustomizableDayType(AcsCustomizableDayType value) {
        return new JAXBElement<>(_AcsCustomizableDayType_QNAME, AcsCustomizableDayType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsWorkDayWithTransfer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsWorkDayWithTransfer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "ArrayOfAcsWorkDayWithTransfer")
    public JAXBElement<ArrayOfAcsWorkDayWithTransfer> createArrayOfAcsWorkDayWithTransfer(ArrayOfAcsWorkDayWithTransfer value) {
        return new JAXBElement<>(_ArrayOfAcsWorkDayWithTransfer_QNAME, ArrayOfAcsWorkDayWithTransfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsWorkDayWithTransfer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsWorkDayWithTransfer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "AcsWorkDayWithTransfer")
    public JAXBElement<AcsWorkDayWithTransfer> createAcsWorkDayWithTransfer(AcsWorkDayWithTransfer value) {
        return new JAXBElement<>(_AcsWorkDayWithTransfer_QNAME, AcsWorkDayWithTransfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleSortColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehicleSortColumn }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "VehicleSortColumn")
    public JAXBElement<VehicleSortColumn> createVehicleSortColumn(VehicleSortColumn value) {
        return new JAXBElement<>(_VehicleSortColumn_QNAME, VehicleSortColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsVehicleSearched }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsVehicleSearched }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "ArrayOfAcsVehicleSearched")
    public JAXBElement<ArrayOfAcsVehicleSearched> createArrayOfAcsVehicleSearched(ArrayOfAcsVehicleSearched value) {
        return new JAXBElement<>(_ArrayOfAcsVehicleSearched_QNAME, ArrayOfAcsVehicleSearched.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsVehicleSearched }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsVehicleSearched }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "AcsVehicleSearched")
    public JAXBElement<AcsVehicleSearched> createAcsVehicleSearched(AcsVehicleSearched value) {
        return new JAXBElement<>(_AcsVehicleSearched_QNAME, AcsVehicleSearched.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsVehicle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsVehicle }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "ArrayOfAcsVehicle")
    public JAXBElement<ArrayOfAcsVehicle> createArrayOfAcsVehicle(ArrayOfAcsVehicle value) {
        return new JAXBElement<>(_ArrayOfAcsVehicle_QNAME, ArrayOfAcsVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsVehicle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsVehicle }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "AcsVehicle")
    public JAXBElement<AcsVehicle> createAcsVehicle(AcsVehicle value) {
        return new JAXBElement<>(_AcsVehicle_QNAME, AcsVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsVehicleSavedData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsVehicleSavedData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "AcsVehicleSavedData")
    public JAXBElement<AcsVehicleSavedData> createAcsVehicleSavedData(AcsVehicleSavedData value) {
        return new JAXBElement<>(_AcsVehicleSavedData_QNAME, AcsVehicleSavedData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeesVehicle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeesVehicle }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "ArrayOfEmployeesVehicle")
    public JAXBElement<ArrayOfEmployeesVehicle> createArrayOfEmployeesVehicle(ArrayOfEmployeesVehicle value) {
        return new JAXBElement<>(_ArrayOfEmployeesVehicle_QNAME, ArrayOfEmployeesVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeesVehicle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeesVehicle }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "EmployeesVehicle")
    public JAXBElement<EmployeesVehicle> createEmployeesVehicle(EmployeesVehicle value) {
        return new JAXBElement<>(_EmployeesVehicle_QNAME, EmployeesVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "EndDateTime", scope = EmployeesVehicle.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeesVehicleEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_EmployeesVehicleEndDateTime_QNAME, XMLGregorianCalendar.class, EmployeesVehicle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "StartDateTime", scope = EmployeesVehicle.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeesVehicleStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_EmployeesVehicleStartDateTime_QNAME, XMLGregorianCalendar.class, EmployeesVehicle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "Name", scope = AcsCustomizableDayBase.class)
    public JAXBElement<String> createAcsCustomizableDayBaseName(String value) {
        return new JAXBElement<>(_AcsCustomizableDayBaseName_QNAME, String.class, AcsCustomizableDayBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "Friday", scope = AcsWeekFull.class)
    public JAXBElement<AcsDaySchedule> createAcsWeekFullFriday(AcsDaySchedule value) {
        return new JAXBElement<>(_AcsWeekFullFriday_QNAME, AcsDaySchedule.class, AcsWeekFull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "Monday", scope = AcsWeekFull.class)
    public JAXBElement<AcsDaySchedule> createAcsWeekFullMonday(AcsDaySchedule value) {
        return new JAXBElement<>(_AcsWeekFullMonday_QNAME, AcsDaySchedule.class, AcsWeekFull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "Saturday", scope = AcsWeekFull.class)
    public JAXBElement<AcsDaySchedule> createAcsWeekFullSaturday(AcsDaySchedule value) {
        return new JAXBElement<>(_AcsWeekFullSaturday_QNAME, AcsDaySchedule.class, AcsWeekFull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "Sunday", scope = AcsWeekFull.class)
    public JAXBElement<AcsDaySchedule> createAcsWeekFullSunday(AcsDaySchedule value) {
        return new JAXBElement<>(_AcsWeekFullSunday_QNAME, AcsDaySchedule.class, AcsWeekFull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "Thursday", scope = AcsWeekFull.class)
    public JAXBElement<AcsDaySchedule> createAcsWeekFullThursday(AcsDaySchedule value) {
        return new JAXBElement<>(_AcsWeekFullThursday_QNAME, AcsDaySchedule.class, AcsWeekFull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "Tuesday", scope = AcsWeekFull.class)
    public JAXBElement<AcsDaySchedule> createAcsWeekFullTuesday(AcsDaySchedule value) {
        return new JAXBElement<>(_AcsWeekFullTuesday_QNAME, AcsDaySchedule.class, AcsWeekFull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "Wednesday", scope = AcsWeekFull.class)
    public JAXBElement<AcsDaySchedule> createAcsWeekFullWednesday(AcsDaySchedule value) {
        return new JAXBElement<>(_AcsWeekFullWednesday_QNAME, AcsDaySchedule.class, AcsWeekFull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "Comment", scope = AcsScheduleBase.class)
    public JAXBElement<String> createAcsScheduleBaseComment(String value) {
        return new JAXBElement<>(_AcsScheduleBaseComment_QNAME, String.class, AcsScheduleBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "Name", scope = AcsScheduleBase.class)
    public JAXBElement<String> createAcsScheduleBaseName(String value) {
        return new JAXBElement<>(_AcsCustomizableDayBaseName_QNAME, String.class, AcsScheduleBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsWeekSlim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsWeekSlim }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "Weeks", scope = AcsWeekScheduleSlim.class)
    public JAXBElement<ArrayOfAcsWeekSlim> createAcsWeekScheduleSlimWeeks(ArrayOfAcsWeekSlim value) {
        return new JAXBElement<>(_AcsWeekScheduleSlimWeeks_QNAME, ArrayOfAcsWeekSlim.class, AcsWeekScheduleSlim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "Name", scope = AcsScheduleSlimInfo.class)
    public JAXBElement<String> createAcsScheduleSlimInfoName(String value) {
        return new JAXBElement<>(_AcsCustomizableDayBaseName_QNAME, String.class, AcsScheduleSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", name = "Name", scope = AcsAccessLevelSlimBase.class)
    public JAXBElement<String> createAcsAccessLevelSlimBaseName(String value) {
        return new JAXBElement<>(_AcsAccessLevelSlimBaseName_QNAME, String.class, AcsAccessLevelSlimBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", name = "Name", scope = AcsBoxAccessElementSaveInfo.class)
    public JAXBElement<String> createAcsBoxAccessElementSaveInfoName(String value) {
        return new JAXBElement<>(_AcsBoxAccessElementSaveInfoName_QNAME, String.class, AcsBoxAccessElementSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "Name", scope = EmployeeGroupForAlcoGroupFull.class)
    public JAXBElement<String> createEmployeeGroupForAlcoGroupFullName(String value) {
        return new JAXBElement<>(_EmployeeGroupForAlcoGroupFullName_QNAME, String.class, EmployeeGroupForAlcoGroupFull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "BeginDateTime", scope = AttachedEmployeesForVehicle.class)
    public JAXBElement<XMLGregorianCalendar> createAttachedEmployeesForVehicleBeginDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_AttachedEmployeesForVehicleBeginDateTime_QNAME, XMLGregorianCalendar.class, AttachedEmployeesForVehicle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Employee", scope = AttachedEmployeesForVehicle.class)
    public JAXBElement<AcsEmployeeFull> createAttachedEmployeesForVehicleEmployee(AcsEmployeeFull value) {
        return new JAXBElement<>(_AttachedEmployeesForVehicleEmployee_QNAME, AcsEmployeeFull.class, AttachedEmployeesForVehicle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EndDateTime", scope = AttachedEmployeesForVehicle.class)
    public JAXBElement<XMLGregorianCalendar> createAttachedEmployeesForVehicleEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_AttachedEmployeesForVehicleEndDateTime_QNAME, XMLGregorianCalendar.class, AttachedEmployeesForVehicle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ID", scope = AcsEmployeeFaceVector.class)
    public JAXBElement<String> createAcsEmployeeFaceVectorID(String value) {
        return new JAXBElement<>(_AcsEmployeeFaceVectorID_QNAME, String.class, AcsEmployeeFaceVector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Name", scope = AcsEmployeeFaceVector.class)
    public JAXBElement<String> createAcsEmployeeFaceVectorName(String value) {
        return new JAXBElement<>(_AcsEmployeeFaceVectorName_QNAME, String.class, AcsEmployeeFaceVector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "SourceName", scope = AcsEmployeeFaceVector.class)
    public JAXBElement<String> createAcsEmployeeFaceVectorSourceName(String value) {
        return new JAXBElement<>(_AcsEmployeeFaceVectorSourceName_QNAME, String.class, AcsEmployeeFaceVector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "SourcePath", scope = AcsEmployeeFaceVector.class)
    public JAXBElement<String> createAcsEmployeeFaceVectorSourcePath(String value) {
        return new JAXBElement<>(_AcsEmployeeFaceVectorSourcePath_QNAME, String.class, AcsEmployeeFaceVector.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "FaceVector", scope = AcsEmployeeFaceVectorFull.class)
    public JAXBElement<byte[]> createAcsEmployeeFaceVectorFullFaceVector(byte[] value) {
        return new JAXBElement<>(_AcsEmployeeFaceVectorFullFaceVector_QNAME, byte[].class, AcsEmployeeFaceVectorFull.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Image", scope = AcsEmployeeFaceVectorFull.class)
    public JAXBElement<byte[]> createAcsEmployeeFaceVectorFullImage(byte[] value) {
        return new JAXBElement<>(_AcsEmployeeFaceVectorFullImage_QNAME, byte[].class, AcsEmployeeFaceVectorFull.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Info", scope = AcsEmployeeFaceVectorFull.class)
    public JAXBElement<String> createAcsEmployeeFaceVectorFullInfo(String value) {
        return new JAXBElement<>(_AcsEmployeeFaceVectorFullInfo_QNAME, String.class, AcsEmployeeFaceVectorFull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeeGroup", scope = EmployeeCurentInfo.class)
    public JAXBElement<String> createEmployeeCurentInfoEmployeeGroup(String value) {
        return new JAXBElement<>(_EmployeeCurentInfoEmployeeGroup_QNAME, String.class, EmployeeCurentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "FIO", scope = EmployeeCurentInfo.class)
    public JAXBElement<String> createEmployeeCurentInfoFIO(String value) {
        return new JAXBElement<>(_EmployeeCurentInfoFIO_QNAME, String.class, EmployeeCurentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Position", scope = EmployeeCurentInfo.class)
    public JAXBElement<String> createEmployeeCurentInfoPosition(String value) {
        return new JAXBElement<>(_EmployeeCurentInfoPosition_QNAME, String.class, EmployeeCurentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "TabNumber", scope = EmployeeCurentInfo.class)
    public JAXBElement<Integer> createEmployeeCurentInfoTabNumber(Integer value) {
        return new JAXBElement<>(_EmployeeCurentInfoTabNumber_QNAME, Integer.class, EmployeeCurentInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeeGroup", scope = EmployeeShortInfo.class)
    public JAXBElement<String> createEmployeeShortInfoEmployeeGroup(String value) {
        return new JAXBElement<>(_EmployeeCurentInfoEmployeeGroup_QNAME, String.class, EmployeeShortInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "FIO", scope = EmployeeShortInfo.class)
    public JAXBElement<String> createEmployeeShortInfoFIO(String value) {
        return new JAXBElement<>(_EmployeeCurentInfoFIO_QNAME, String.class, EmployeeShortInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "FirstName", scope = AcsEmployeePhotosInfo.class)
    public JAXBElement<String> createAcsEmployeePhotosInfoFirstName(String value) {
        return new JAXBElement<>(_AcsEmployeePhotosInfoFirstName_QNAME, String.class, AcsEmployeePhotosInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "LastName", scope = AcsEmployeePhotosInfo.class)
    public JAXBElement<String> createAcsEmployeePhotosInfoLastName(String value) {
        return new JAXBElement<>(_AcsEmployeePhotosInfoLastName_QNAME, String.class, AcsEmployeePhotosInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAscEmployeePhotoModificationDateTimeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAscEmployeePhotoModificationDateTimeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Photos", scope = AcsEmployeePhotosInfo.class)
    public JAXBElement<ArrayOfAscEmployeePhotoModificationDateTimeInfo> createAcsEmployeePhotosInfoPhotos(ArrayOfAscEmployeePhotoModificationDateTimeInfo value) {
        return new JAXBElement<>(_AcsEmployeePhotosInfoPhotos_QNAME, ArrayOfAscEmployeePhotoModificationDateTimeInfo.class, AcsEmployeePhotosInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "SecondName", scope = AcsEmployeePhotosInfo.class)
    public JAXBElement<String> createAcsEmployeePhotosInfoSecondName(String value) {
        return new JAXBElement<>(_AcsEmployeePhotosInfoSecondName_QNAME, String.class, AcsEmployeePhotosInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "FieldName", scope = BaseViewFieldMetadata.class)
    public JAXBElement<String> createBaseViewFieldMetadataFieldName(String value) {
        return new JAXBElement<>(_BaseViewFieldMetadataFieldName_QNAME, String.class, BaseViewFieldMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "FieldType", scope = BaseViewFieldMetadata.class)
    public JAXBElement<String> createBaseViewFieldMetadataFieldType(String value) {
        return new JAXBElement<>(_BaseViewFieldMetadataFieldType_QNAME, String.class, BaseViewFieldMetadata.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Comment", scope = AcsEmployeeSlimBase.class)
    public JAXBElement<String> createAcsEmployeeSlimBaseComment(String value) {
        return new JAXBElement<>(_AcsEmployeeSlimBaseComment_QNAME, String.class, AcsEmployeeSlimBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "FirstName", scope = AcsEmployeeSlimBase.class)
    public JAXBElement<String> createAcsEmployeeSlimBaseFirstName(String value) {
        return new JAXBElement<>(_AcsEmployeePhotosInfoFirstName_QNAME, String.class, AcsEmployeeSlimBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "LastName", scope = AcsEmployeeSlimBase.class)
    public JAXBElement<String> createAcsEmployeeSlimBaseLastName(String value) {
        return new JAXBElement<>(_AcsEmployeePhotosInfoLastName_QNAME, String.class, AcsEmployeeSlimBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Number", scope = AcsEmployeeSlimBase.class)
    public JAXBElement<Integer> createAcsEmployeeSlimBaseNumber(Integer value) {
        return new JAXBElement<>(_AcsEmployeeSlimBaseNumber_QNAME, Integer.class, AcsEmployeeSlimBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "SecondName", scope = AcsEmployeeSlimBase.class)
    public JAXBElement<String> createAcsEmployeeSlimBaseSecondName(String value) {
        return new JAXBElement<>(_AcsEmployeePhotosInfoSecondName_QNAME, String.class, AcsEmployeeSlimBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "GroupCode", scope = AcsEmployeeInfo.class)
    public JAXBElement<String> createAcsEmployeeInfoGroupCode(String value) {
        return new JAXBElement<>(_AcsEmployeeInfoGroupCode_QNAME, String.class, AcsEmployeeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "GroupName", scope = AcsEmployeeInfo.class)
    public JAXBElement<String> createAcsEmployeeInfoGroupName(String value) {
        return new JAXBElement<>(_AcsEmployeeInfoGroupName_QNAME, String.class, AcsEmployeeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "GroupPath", scope = AcsEmployeeInfo.class)
    public JAXBElement<String> createAcsEmployeeInfoGroupPath(String value) {
        return new JAXBElement<>(_AcsEmployeeInfoGroupPath_QNAME, String.class, AcsEmployeeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PositionCode", scope = AcsEmployeeInfo.class)
    public JAXBElement<String> createAcsEmployeeInfoPositionCode(String value) {
        return new JAXBElement<>(_AcsEmployeeInfoPositionCode_QNAME, String.class, AcsEmployeeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PositionName", scope = AcsEmployeeInfo.class)
    public JAXBElement<String> createAcsEmployeeInfoPositionName(String value) {
        return new JAXBElement<>(_AcsEmployeeInfoPositionName_QNAME, String.class, AcsEmployeeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "SecurityGroupName", scope = AcsEmployeeInfo.class)
    public JAXBElement<String> createAcsEmployeeInfoSecurityGroupName(String value) {
        return new JAXBElement<>(_AcsEmployeeInfoSecurityGroupName_QNAME, String.class, AcsEmployeeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Authority", scope = AcsEmployeeFullBase.class)
    public JAXBElement<String> createAcsEmployeeFullBaseAuthority(String value) {
        return new JAXBElement<>(_AcsEmployeeFullBaseAuthority_QNAME, String.class, AcsEmployeeFullBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "DateOfIssue", scope = AcsEmployeeFullBase.class)
    public JAXBElement<XMLGregorianCalendar> createAcsEmployeeFullBaseDateOfIssue(XMLGregorianCalendar value) {
        return new JAXBElement<>(_AcsEmployeeFullBaseDateOfIssue_QNAME, XMLGregorianCalendar.class, AcsEmployeeFullBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PINCode", scope = AcsEmployeeFullBase.class)
    public JAXBElement<Long> createAcsEmployeeFullBasePINCode(Long value) {
        return new JAXBElement<>(_AcsEmployeeFullBasePINCode_QNAME, Long.class, AcsEmployeeFullBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PINCodeDescription", scope = AcsEmployeeFullBase.class)
    public JAXBElement<String> createAcsEmployeeFullBasePINCodeDescription(String value) {
        return new JAXBElement<>(_AcsEmployeeFullBasePINCodeDescription_QNAME, String.class, AcsEmployeeFullBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PINCodeUnderPressure", scope = AcsEmployeeFullBase.class)
    public JAXBElement<Long> createAcsEmployeeFullBasePINCodeUnderPressure(Long value) {
        return new JAXBElement<>(_AcsEmployeeFullBasePINCodeUnderPressure_QNAME, Long.class, AcsEmployeeFullBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PINCodeUnderPressureDescription", scope = AcsEmployeeFullBase.class)
    public JAXBElement<String> createAcsEmployeeFullBasePINCodeUnderPressureDescription(String value) {
        return new JAXBElement<>(_AcsEmployeeFullBasePINCodeUnderPressureDescription_QNAME, String.class, AcsEmployeeFullBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PassportIssue", scope = AcsEmployeeFullBase.class)
    public JAXBElement<String> createAcsEmployeeFullBasePassportIssue(String value) {
        return new JAXBElement<>(_AcsEmployeeFullBasePassportIssue_QNAME, String.class, AcsEmployeeFullBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PassportNumber", scope = AcsEmployeeFullBase.class)
    public JAXBElement<String> createAcsEmployeeFullBasePassportNumber(String value) {
        return new JAXBElement<>(_AcsEmployeeFullBasePassportNumber_QNAME, String.class, AcsEmployeeFullBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "RegistrationAddress", scope = AcsEmployeeFullBase.class)
    public JAXBElement<String> createAcsEmployeeFullBaseRegistrationAddress(String value) {
        return new JAXBElement<>(_AcsEmployeeFullBaseRegistrationAddress_QNAME, String.class, AcsEmployeeFullBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ResidentialAddress", scope = AcsEmployeeFullBase.class)
    public JAXBElement<String> createAcsEmployeeFullBaseResidentialAddress(String value) {
        return new JAXBElement<>(_AcsEmployeeFullBaseResidentialAddress_QNAME, String.class, AcsEmployeeFullBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Comment", scope = AcsEmployeeGroup.class)
    public JAXBElement<String> createAcsEmployeeGroupComment(String value) {
        return new JAXBElement<>(_AcsEmployeeSlimBaseComment_QNAME, String.class, AcsEmployeeGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeeGroups", scope = AcsEmployeeGroup.class)
    public JAXBElement<ArrayOfAcsEmployeeGroup> createAcsEmployeeGroupEmployeeGroups(ArrayOfAcsEmployeeGroup value) {
        return new JAXBElement<>(_AcsEmployeeGroupEmployeeGroups_QNAME, ArrayOfAcsEmployeeGroup.class, AcsEmployeeGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "FavoriteName", scope = AcsEmployeeGroup.class)
    public JAXBElement<String> createAcsEmployeeGroupFavoriteName(String value) {
        return new JAXBElement<>(_AcsEmployeeGroupFavoriteName_QNAME, String.class, AcsEmployeeGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "FavoritePath", scope = AcsEmployeeGroup.class)
    public JAXBElement<String> createAcsEmployeeGroupFavoritePath(String value) {
        return new JAXBElement<>(_AcsEmployeeGroupFavoritePath_QNAME, String.class, AcsEmployeeGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "GroupCode", scope = AcsEmployeeGroup.class)
    public JAXBElement<String> createAcsEmployeeGroupGroupCode(String value) {
        return new JAXBElement<>(_AcsEmployeeInfoGroupCode_QNAME, String.class, AcsEmployeeGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Name", scope = AcsEmployeeGroup.class)
    public JAXBElement<String> createAcsEmployeeGroupName(String value) {
        return new JAXBElement<>(_AcsEmployeeFaceVectorName_QNAME, String.class, AcsEmployeeGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeGroupReportInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeGroupReportInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeeGroups2", scope = AcsEmployeeGroupReportInfo.class)
    public JAXBElement<ArrayOfAcsEmployeeGroupReportInfo> createAcsEmployeeGroupReportInfoEmployeeGroups2(ArrayOfAcsEmployeeGroupReportInfo value) {
        return new JAXBElement<>(_AcsEmployeeGroupReportInfoEmployeeGroups2_QNAME, ArrayOfAcsEmployeeGroupReportInfo.class, AcsEmployeeGroupReportInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeesFromGroupsGuids", scope = AcsEmployeeGroupReportInfo.class)
    public JAXBElement<ArrayOfguid> createAcsEmployeeGroupReportInfoEmployeesFromGroupsGuids(ArrayOfguid value) {
        return new JAXBElement<>(_AcsEmployeeGroupReportInfoEmployeesFromGroupsGuids_QNAME, ArrayOfguid.class, AcsEmployeeGroupReportInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "SelectedEmployeesGuids", scope = AcsEmployeeGroupReportInfo.class)
    public JAXBElement<ArrayOfguid> createAcsEmployeeGroupReportInfoSelectedEmployeesGuids(ArrayOfguid value) {
        return new JAXBElement<>(_AcsEmployeeGroupReportInfoSelectedEmployeesGuids_QNAME, ArrayOfguid.class, AcsEmployeeGroupReportInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeGroupReactionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeGroupReactionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeeGroups1", scope = AcsEmployeeGroupReactionInfo.class)
    public JAXBElement<ArrayOfAcsEmployeeGroupReactionInfo> createAcsEmployeeGroupReactionInfoEmployeeGroups1(ArrayOfAcsEmployeeGroupReactionInfo value) {
        return new JAXBElement<>(_AcsEmployeeGroupReactionInfoEmployeeGroups1_QNAME, ArrayOfAcsEmployeeGroupReactionInfo.class, AcsEmployeeGroupReactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeesFromGroupsGuids", scope = AcsEmployeeGroupReactionInfo.class)
    public JAXBElement<ArrayOfguid> createAcsEmployeeGroupReactionInfoEmployeesFromGroupsGuids(ArrayOfguid value) {
        return new JAXBElement<>(_AcsEmployeeGroupReportInfoEmployeesFromGroupsGuids_QNAME, ArrayOfguid.class, AcsEmployeeGroupReactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "SelectedEmployeesGuids", scope = AcsEmployeeGroupReactionInfo.class)
    public JAXBElement<ArrayOfguid> createAcsEmployeeGroupReactionInfoSelectedEmployeesGuids(ArrayOfguid value) {
        return new JAXBElement<>(_AcsEmployeeGroupReportInfoSelectedEmployeesGuids_QNAME, ArrayOfguid.class, AcsEmployeeGroupReactionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "Brand", scope = AcsVehicleSavedData.class)
    public JAXBElement<String> createAcsVehicleSavedDataBrand(String value) {
        return new JAXBElement<>(_AcsVehicleSavedDataBrand_QNAME, String.class, AcsVehicleSavedData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "Color", scope = AcsVehicleSavedData.class)
    public JAXBElement<String> createAcsVehicleSavedDataColor(String value) {
        return new JAXBElement<>(_AcsVehicleSavedDataColor_QNAME, String.class, AcsVehicleSavedData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "Comment", scope = AcsVehicleSavedData.class)
    public JAXBElement<String> createAcsVehicleSavedDataComment(String value) {
        return new JAXBElement<>(_AcsVehicleSavedDataComment_QNAME, String.class, AcsVehicleSavedData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "EndDateTime", scope = AcsVehicleSavedData.class)
    public JAXBElement<XMLGregorianCalendar> createAcsVehicleSavedDataEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_EmployeesVehicleEndDateTime_QNAME, XMLGregorianCalendar.class, AcsVehicleSavedData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "Name", scope = AcsVehicleSavedData.class)
    public JAXBElement<String> createAcsVehicleSavedDataName(String value) {
        return new JAXBElement<>(_AcsVehicleSavedDataName_QNAME, String.class, AcsVehicleSavedData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "RegistrationNumber", scope = AcsVehicleSavedData.class)
    public JAXBElement<String> createAcsVehicleSavedDataRegistrationNumber(String value) {
        return new JAXBElement<>(_AcsVehicleSavedDataRegistrationNumber_QNAME, String.class, AcsVehicleSavedData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "StartDateTime", scope = AcsVehicleSavedData.class)
    public JAXBElement<XMLGregorianCalendar> createAcsVehicleSavedDataStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_EmployeesVehicleStartDateTime_QNAME, XMLGregorianCalendar.class, AcsVehicleSavedData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryElementInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DictionaryElementInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "VehicleType", scope = AcsVehicleSavedData.class)
    public JAXBElement<DictionaryElementInfo> createAcsVehicleSavedDataVehicleType(DictionaryElementInfo value) {
        return new JAXBElement<>(_AcsVehicleSavedDataVehicleType_QNAME, DictionaryElementInfo.class, AcsVehicleSavedData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "VehicleTypeID", scope = AcsVehicleSavedData.class)
    public JAXBElement<String> createAcsVehicleSavedDataVehicleTypeID(String value) {
        return new JAXBElement<>(_AcsVehicleSavedDataVehicleTypeID_QNAME, String.class, AcsVehicleSavedData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "CardTypeID", scope = AcsKeySaveData.class)
    public JAXBElement<String> createAcsKeySaveDataCardTypeID(String value) {
        return new JAXBElement<>(_AcsKeySaveDataCardTypeID_QNAME, String.class, AcsKeySaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "CardTypeName", scope = AcsKeySaveData.class)
    public JAXBElement<String> createAcsKeySaveDataCardTypeName(String value) {
        return new JAXBElement<>(_AcsKeySaveDataCardTypeName_QNAME, String.class, AcsKeySaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "Description", scope = AcsKeySaveData.class)
    public JAXBElement<String> createAcsKeySaveDataDescription(String value) {
        return new JAXBElement<>(_AcsKeySaveDataDescription_QNAME, String.class, AcsKeySaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "EndDate", scope = AcsKeySaveData.class)
    public JAXBElement<XMLGregorianCalendar> createAcsKeySaveDataEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_AcsKeySaveDataEndDate_QNAME, XMLGregorianCalendar.class, AcsKeySaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "Finger1_Image", scope = AcsKeySaveData.class)
    public JAXBElement<byte[]> createAcsKeySaveDataFinger1Image(byte[] value) {
        return new JAXBElement<>(_AcsKeySaveDataFinger1Image_QNAME, byte[].class, AcsKeySaveData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "Finger1_Template", scope = AcsKeySaveData.class)
    public JAXBElement<byte[]> createAcsKeySaveDataFinger1Template(byte[] value) {
        return new JAXBElement<>(_AcsKeySaveDataFinger1Template_QNAME, byte[].class, AcsKeySaveData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "Finger2_Image", scope = AcsKeySaveData.class)
    public JAXBElement<byte[]> createAcsKeySaveDataFinger2Image(byte[] value) {
        return new JAXBElement<>(_AcsKeySaveDataFinger2Image_QNAME, byte[].class, AcsKeySaveData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "Finger2_Template", scope = AcsKeySaveData.class)
    public JAXBElement<byte[]> createAcsKeySaveDataFinger2Template(byte[] value) {
        return new JAXBElement<>(_AcsKeySaveDataFinger2Template_QNAME, byte[].class, AcsKeySaveData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "Finger3_Image", scope = AcsKeySaveData.class)
    public JAXBElement<byte[]> createAcsKeySaveDataFinger3Image(byte[] value) {
        return new JAXBElement<>(_AcsKeySaveDataFinger3Image_QNAME, byte[].class, AcsKeySaveData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "Finger3_Template", scope = AcsKeySaveData.class)
    public JAXBElement<byte[]> createAcsKeySaveDataFinger3Template(byte[] value) {
        return new JAXBElement<>(_AcsKeySaveDataFinger3Template_QNAME, byte[].class, AcsKeySaveData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "Finger4_Image", scope = AcsKeySaveData.class)
    public JAXBElement<byte[]> createAcsKeySaveDataFinger4Image(byte[] value) {
        return new JAXBElement<>(_AcsKeySaveDataFinger4Image_QNAME, byte[].class, AcsKeySaveData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "Finger4_Template", scope = AcsKeySaveData.class)
    public JAXBElement<byte[]> createAcsKeySaveDataFinger4Template(byte[] value) {
        return new JAXBElement<>(_AcsKeySaveDataFinger4Template_QNAME, byte[].class, AcsKeySaveData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "Finger5_Image", scope = AcsKeySaveData.class)
    public JAXBElement<byte[]> createAcsKeySaveDataFinger5Image(byte[] value) {
        return new JAXBElement<>(_AcsKeySaveDataFinger5Image_QNAME, byte[].class, AcsKeySaveData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "Finger5_Template", scope = AcsKeySaveData.class)
    public JAXBElement<byte[]> createAcsKeySaveDataFinger5Template(byte[] value) {
        return new JAXBElement<>(_AcsKeySaveDataFinger5Template_QNAME, byte[].class, AcsKeySaveData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "Name", scope = AcsKeySaveData.class)
    public JAXBElement<String> createAcsKeySaveDataName(String value) {
        return new JAXBElement<>(_AcsKeySaveDataName_QNAME, String.class, AcsKeySaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "StartDate", scope = AcsKeySaveData.class)
    public JAXBElement<XMLGregorianCalendar> createAcsKeySaveDataStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_AcsKeySaveDataStartDate_QNAME, XMLGregorianCalendar.class, AcsKeySaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Description", scope = AcsEmployeeScheduleSaveData.class)
    public JAXBElement<String> createAcsEmployeeScheduleSaveDataDescription(String value) {
        return new JAXBElement<>(_AcsEmployeeScheduleSaveDataDescription_QNAME, String.class, AcsEmployeeScheduleSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "DriverDateOfBirth", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<XMLGregorianCalendar> createAcsEmployeeDocumentsSaveDataDriverDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataDriverDateOfBirth_QNAME, XMLGregorianCalendar.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "DriverDateOfExpiry", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<XMLGregorianCalendar> createAcsEmployeeDocumentsSaveDataDriverDateOfExpiry(XMLGregorianCalendar value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataDriverDateOfExpiry_QNAME, XMLGregorianCalendar.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "DriverDateOfIssue", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<XMLGregorianCalendar> createAcsEmployeeDocumentsSaveDataDriverDateOfIssue(XMLGregorianCalendar value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataDriverDateOfIssue_QNAME, XMLGregorianCalendar.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "DriverFirstName", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataDriverFirstName(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataDriverFirstName_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "DriverLastName", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataDriverLastName(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataDriverLastName_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "DriverMiddleName", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataDriverMiddleName(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataDriverMiddleName_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "DriverNumber", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataDriverNumber(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataDriverNumber_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "DriverPlaceOfBirth", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataDriverPlaceOfBirth(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataDriverPlaceOfBirth_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "DriverSeries", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataDriverSeries(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataDriverSeries_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ForeignPassportCodeOfIssuingState", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataForeignPassportCodeOfIssuingState(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataForeignPassportCodeOfIssuingState_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ForeignPassportDateOfBirth", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<XMLGregorianCalendar> createAcsEmployeeDocumentsSaveDataForeignPassportDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataForeignPassportDateOfBirth_QNAME, XMLGregorianCalendar.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ForeignPassportDateOfExpiry", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<XMLGregorianCalendar> createAcsEmployeeDocumentsSaveDataForeignPassportDateOfExpiry(XMLGregorianCalendar value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataForeignPassportDateOfExpiry_QNAME, XMLGregorianCalendar.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ForeignPassportFirstName", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataForeignPassportFirstName(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataForeignPassportFirstName_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ForeignPassportLastName", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataForeignPassportLastName(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataForeignPassportLastName_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ForeignPassportMRZ", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataForeignPassportMRZ(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataForeignPassportMRZ_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ForeignPassportMiddleName", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataForeignPassportMiddleName(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataForeignPassportMiddleName_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ForeignPassportNationality", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataForeignPassportNationality(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataForeignPassportNationality_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ForeignPassportNumber", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataForeignPassportNumber(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataForeignPassportNumber_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ForeignPassportPersonalCode", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataForeignPassportPersonalCode(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataForeignPassportPersonalCode_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "ForeignPassportSex", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataForeignPassportSex(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataForeignPassportSex_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PassportDateOfBirth", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<XMLGregorianCalendar> createAcsEmployeeDocumentsSaveDataPassportDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataPassportDateOfBirth_QNAME, XMLGregorianCalendar.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PassportDateOfIssue", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<XMLGregorianCalendar> createAcsEmployeeDocumentsSaveDataPassportDateOfIssue(XMLGregorianCalendar value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataPassportDateOfIssue_QNAME, XMLGregorianCalendar.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PassportDepartmentCode", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataPassportDepartmentCode(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataPassportDepartmentCode_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PassportFirstName", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataPassportFirstName(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataPassportFirstName_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PassportIssue", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataPassportIssue(String value) {
        return new JAXBElement<>(_AcsEmployeeFullBasePassportIssue_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PassportLastName", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataPassportLastName(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataPassportLastName_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PassportMiddleName", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataPassportMiddleName(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataPassportMiddleName_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PassportNumber", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataPassportNumber(String value) {
        return new JAXBElement<>(_AcsEmployeeFullBasePassportNumber_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PassportPlaceOfBirth", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataPassportPlaceOfBirth(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataPassportPlaceOfBirth_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PassportRegistrationAddress", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataPassportRegistrationAddress(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataPassportRegistrationAddress_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PassportSeries", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataPassportSeries(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataPassportSeries_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PassportSex", scope = AcsEmployeeDocumentsSaveData.class)
    public JAXBElement<String> createAcsEmployeeDocumentsSaveDataPassportSex(String value) {
        return new JAXBElement<>(_AcsEmployeeDocumentsSaveDataPassportSex_QNAME, String.class, AcsEmployeeDocumentsSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeCurentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeCurentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Employees", scope = EmployeesData.class)
    public JAXBElement<ArrayOfEmployeeCurentInfo> createEmployeesDataEmployees(ArrayOfEmployeeCurentInfo value) {
        return new JAXBElement<>(_EmployeesDataEmployees_QNAME, ArrayOfEmployeeCurentInfo.class, EmployeesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAccessLevelSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAccessLevelSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AccessLevels", scope = AcsEmployeeSlim.class)
    public JAXBElement<ArrayOfAcsAccessLevelSlimInfo> createAcsEmployeeSlimAccessLevels(ArrayOfAcsAccessLevelSlimInfo value) {
        return new JAXBElement<>(_AcsEmployeeSlimAccessLevels_QNAME, ArrayOfAcsAccessLevelSlimInfo.class, AcsEmployeeSlim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeeGroupPath", scope = AcsEmployeeSlim.class)
    public JAXBElement<String> createAcsEmployeeSlimEmployeeGroupPath(String value) {
        return new JAXBElement<>(_AcsEmployeeSlimEmployeeGroupPath_QNAME, String.class, AcsEmployeeSlim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "GroupCode", scope = AcsEmployeeSlim.class)
    public JAXBElement<String> createAcsEmployeeSlimGroupCode(String value) {
        return new JAXBElement<>(_AcsEmployeeInfoGroupCode_QNAME, String.class, AcsEmployeeSlim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsKeyInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsKeyInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Keys", scope = AcsEmployeeSlim.class)
    public JAXBElement<ArrayOfAcsKeyInfo> createAcsEmployeeSlimKeys(ArrayOfAcsKeyInfo value) {
        return new JAXBElement<>(_AcsEmployeeSlimKeys_QNAME, ArrayOfAcsKeyInfo.class, AcsEmployeeSlim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LEmployeePositionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LEmployeePositionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Position", scope = AcsEmployeeSlim.class)
    public JAXBElement<LEmployeePositionInfo> createAcsEmployeeSlimPosition(LEmployeePositionInfo value) {
        return new JAXBElement<>(_EmployeeCurentInfoPosition_QNAME, LEmployeePositionInfo.class, AcsEmployeeSlim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "RowNumber", scope = AcsEmployeeSlim.class)
    public JAXBElement<Long> createAcsEmployeeSlimRowNumber(Long value) {
        return new JAXBElement<>(_AcsEmployeeSlimRowNumber_QNAME, Long.class, AcsEmployeeSlim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkScheduleSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkScheduleSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "WorkSchedules", scope = AcsEmployeeSlim.class)
    public JAXBElement<ArrayOfWorkScheduleSlimInfo> createAcsEmployeeSlimWorkSchedules(ArrayOfWorkScheduleSlimInfo value) {
        return new JAXBElement<>(_AcsEmployeeSlimWorkSchedules_QNAME, ArrayOfWorkScheduleSlimInfo.class, AcsEmployeeSlim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkZoneSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkZoneSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "WorkZones", scope = AcsEmployeeSlim.class)
    public JAXBElement<ArrayOfWorkZoneSlimInfo> createAcsEmployeeSlimWorkZones(ArrayOfWorkZoneSlimInfo value) {
        return new JAXBElement<>(_AcsEmployeeSlimWorkZones_QNAME, ArrayOfWorkZoneSlimInfo.class, AcsEmployeeSlim.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeePositionID", scope = AcsEmployeeSaveData.class)
    public JAXBElement<String> createAcsEmployeeSaveDataEmployeePositionID(String value) {
        return new JAXBElement<>(_AcsEmployeeSaveDataEmployeePositionID_QNAME, String.class, AcsEmployeeSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRGTimeInterval }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRGTimeInterval }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "TimeIntervals", scope = RGDayIntervals.class)
    public JAXBElement<ArrayOfRGTimeInterval> createRGDayIntervalsTimeIntervals(ArrayOfRGTimeInterval value) {
        return new JAXBElement<>(_RGDayIntervalsTimeIntervals_QNAME, ArrayOfRGTimeInterval.class, RGDayIntervals.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAccessLevelSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAccessLevelSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", name = "AccessLevelsSlimInfo", scope = LAccessLevelsData.class)
    public JAXBElement<ArrayOfAcsAccessLevelSlimInfo> createLAccessLevelsDataAccessLevelsSlimInfo(ArrayOfAcsAccessLevelSlimInfo value) {
        return new JAXBElement<>(_LAccessLevelsDataAccessLevelsSlimInfo_QNAME, ArrayOfAcsAccessLevelSlimInfo.class, LAccessLevelsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "AddedEntities", scope = ChangePositionCodesResult.class)
    public JAXBElement<ArrayOfstring> createChangePositionCodesResultAddedEntities(ArrayOfstring value) {
        return new JAXBElement<>(_ChangePositionCodesResultAddedEntities_QNAME, ArrayOfstring.class, ChangePositionCodesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "DeletedEntities", scope = ChangePositionCodesResult.class)
    public JAXBElement<ArrayOfstring> createChangePositionCodesResultDeletedEntities(ArrayOfstring value) {
        return new JAXBElement<>(_ChangePositionCodesResultDeletedEntities_QNAME, ArrayOfstring.class, ChangePositionCodesResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "AddedEntities", scope = ChangeDataResult.class)
    public JAXBElement<ArrayOfguid> createChangeDataResultAddedEntities(ArrayOfguid value) {
        return new JAXBElement<>(_ChangePositionCodesResultAddedEntities_QNAME, ArrayOfguid.class, ChangeDataResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "DeletedEntities", scope = ChangeDataResult.class)
    public JAXBElement<ArrayOfguid> createChangeDataResultDeletedEntities(ArrayOfguid value) {
        return new JAXBElement<>(_ChangePositionCodesResultDeletedEntities_QNAME, ArrayOfguid.class, ChangeDataResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "Description", scope = AcsAlcoGroupSaveData.class)
    public JAXBElement<String> createAcsAlcoGroupSaveDataDescription(String value) {
        return new JAXBElement<>(_AcsAlcoGroupSaveDataDescription_QNAME, String.class, AcsAlcoGroupSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "MaxCheckPerDay", scope = AcsAlcoGroupSaveData.class)
    public JAXBElement<Integer> createAcsAlcoGroupSaveDataMaxCheckPerDay(Integer value) {
        return new JAXBElement<>(_AcsAlcoGroupSaveDataMaxCheckPerDay_QNAME, Integer.class, AcsAlcoGroupSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AlcoGroup", name = "Name", scope = AcsAlcoGroupSaveData.class)
    public JAXBElement<String> createAcsAlcoGroupSaveDataName(String value) {
        return new JAXBElement<>(_EmployeeGroupForAlcoGroupFullName_QNAME, String.class, AcsAlcoGroupSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", name = "Description", scope = AcsAccessLevelSaveData.class)
    public JAXBElement<String> createAcsAccessLevelSaveDataDescription(String value) {
        return new JAXBElement<>(_AcsAccessLevelSaveDataDescription_QNAME, String.class, AcsAccessLevelSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", name = "EndDate", scope = AcsAccessLevelSlimInfo.class)
    public JAXBElement<XMLGregorianCalendar> createAcsAccessLevelSlimInfoEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<>(_AcsAccessLevelSlimInfoEndDate_QNAME, XMLGregorianCalendar.class, AcsAccessLevelSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FolderInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", name = "Folder", scope = AcsAccessLevelSlimInfo.class)
    public JAXBElement<FolderInfo> createAcsAccessLevelSlimInfoFolder(FolderInfo value) {
        return new JAXBElement<>(_AcsAccessLevelSlimInfoFolder_QNAME, FolderInfo.class, AcsAccessLevelSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AccessLevels", name = "ReadRightDisabled", scope = AcsAccessLevelSlimInfo.class)
    public JAXBElement<Boolean> createAcsAccessLevelSlimInfoReadRightDisabled(Boolean value) {
        return new JAXBElement<>(_AcsAccessLevelSlimInfoReadRightDisabled_QNAME, Boolean.class, AcsAccessLevelSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", name = "Description", scope = AcsBoxAccessLevelSaveData.class)
    public JAXBElement<String> createAcsBoxAccessLevelSaveDataDescription(String value) {
        return new JAXBElement<>(_AcsBoxAccessLevelSaveDataDescription_QNAME, String.class, AcsBoxAccessLevelSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", name = "Name", scope = AcsBoxAccessLevelSaveData.class)
    public JAXBElement<String> createAcsBoxAccessLevelSaveDataName(String value) {
        return new JAXBElement<>(_AcsBoxAccessElementSaveInfoName_QNAME, String.class, AcsBoxAccessLevelSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsBoxAccessLevelElementSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsBoxAccessLevelElementSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.BoxAccessLevel", name = "BoxAccessElements", scope = AcsBoxAccessLevelSlimInfo.class)
    public JAXBElement<ArrayOfAcsBoxAccessLevelElementSlimInfo> createAcsBoxAccessLevelSlimInfoBoxAccessElements(ArrayOfAcsBoxAccessLevelElementSlimInfo value) {
        return new JAXBElement<>(_AcsBoxAccessLevelSlimInfoBoxAccessElements_QNAME, ArrayOfAcsBoxAccessLevelElementSlimInfo.class, AcsBoxAccessLevelSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.AcsKeys", name = "AcsEmployeeId", scope = AcsKeyInfo.class)
    public JAXBElement<String> createAcsKeyInfoAcsEmployeeId(String value) {
        return new JAXBElement<>(_AcsKeyInfoAcsEmployeeId_QNAME, String.class, AcsKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVariableInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfVariableInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Fields", scope = EmployeeInfo.class)
    public JAXBElement<ArrayOfVariableInfo> createEmployeeInfoFields(ArrayOfVariableInfo value) {
        return new JAXBElement<>(_EmployeeInfoFields_QNAME, ArrayOfVariableInfo.class, EmployeeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Photo", scope = EmployeeInfo.class)
    public JAXBElement<byte[]> createEmployeeInfoPhoto(byte[] value) {
        return new JAXBElement<>(_EmployeeInfoPhoto_QNAME, byte[].class, EmployeeInfo.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "EmployeeGroupPath", scope = AcsEmployeeFull.class)
    public JAXBElement<String> createAcsEmployeeFullEmployeeGroupPath(String value) {
        return new JAXBElement<>(_AcsEmployeeSlimEmployeeGroupPath_QNAME, String.class, AcsEmployeeFull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LEmployeePositionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LEmployeePositionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Position", scope = AcsEmployeeFull.class)
    public JAXBElement<LEmployeePositionInfo> createAcsEmployeeFullPosition(LEmployeePositionInfo value) {
        return new JAXBElement<>(_EmployeeCurentInfoPosition_QNAME, LEmployeePositionInfo.class, AcsEmployeeFull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Employees", scope = EmployeesInfoData2 .class)
    public JAXBElement<ArrayOfAcsEmployeeInfo> createEmployeesInfoData2Employees(ArrayOfAcsEmployeeInfo value) {
        return new JAXBElement<>(_EmployeesDataEmployees_QNAME, ArrayOfAcsEmployeeInfo.class, EmployeesInfoData2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsWeekFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsWeekFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "Weeks", scope = AcsWeekScheduleFull.class)
    public JAXBElement<ArrayOfAcsWeekFull> createAcsWeekScheduleFullWeeks(ArrayOfAcsWeekFull value) {
        return new JAXBElement<>(_AcsWeekScheduleSlimWeeks_QNAME, ArrayOfAcsWeekFull.class, AcsWeekScheduleFull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRGDayIntervals }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRGDayIntervals }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "DayIntervals", scope = AcsMultiDaySchedule.class)
    public JAXBElement<ArrayOfRGDayIntervals> createAcsMultiDayScheduleDayIntervals(ArrayOfRGDayIntervals value) {
        return new JAXBElement<>(_AcsMultiDayScheduleDayIntervals_QNAME, ArrayOfRGDayIntervals.class, AcsMultiDaySchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RGDayIntervals }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RGDayIntervals }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Schedule", name = "DayIntervals", scope = AcsDaySchedule.class)
    public JAXBElement<RGDayIntervals> createAcsDayScheduleDayIntervals(RGDayIntervals value) {
        return new JAXBElement<>(_AcsMultiDayScheduleDayIntervals_QNAME, RGDayIntervals.class, AcsDaySchedule.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AccessLevelsIds", scope = EmployeesFilter.class)
    public JAXBElement<ArrayOfguid> createEmployeesFilterAccessLevelsIds(ArrayOfguid value) {
        return new JAXBElement<>(_EmployeesFilterAccessLevelsIds_QNAME, ArrayOfguid.class, EmployeesFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "CardTypesIds", scope = EmployeesFilter.class)
    public JAXBElement<ArrayOfguid> createEmployeesFilterCardTypesIds(ArrayOfguid value) {
        return new JAXBElement<>(_EmployeesFilterCardTypesIds_QNAME, ArrayOfguid.class, EmployeesFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "FirstNameContains", scope = EmployeesFilter.class)
    public JAXBElement<String> createEmployeesFilterFirstNameContains(String value) {
        return new JAXBElement<>(_EmployeesFilterFirstNameContains_QNAME, String.class, EmployeesFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "IsKeySiteCode", scope = EmployeesFilter.class)
    public JAXBElement<Boolean> createEmployeesFilterIsKeySiteCode(Boolean value) {
        return new JAXBElement<>(_EmployeesFilterIsKeySiteCode_QNAME, Boolean.class, EmployeesFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "KeyAfterSiteCode", scope = EmployeesFilter.class)
    public JAXBElement<Short> createEmployeesFilterKeyAfterSiteCode(Short value) {
        return new JAXBElement<>(_EmployeesFilterKeyAfterSiteCode_QNAME, Short.class, EmployeesFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "KeyCommentContains", scope = EmployeesFilter.class)
    public JAXBElement<String> createEmployeesFilterKeyCommentContains(String value) {
        return new JAXBElement<>(_EmployeesFilterKeyCommentContains_QNAME, String.class, EmployeesFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "KeyNumber", scope = EmployeesFilter.class)
    public JAXBElement<Long> createEmployeesFilterKeyNumber(Long value) {
        return new JAXBElement<>(_EmployeesFilterKeyNumber_QNAME, Long.class, EmployeesFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "KeySiteCode", scope = EmployeesFilter.class)
    public JAXBElement<Integer> createEmployeesFilterKeySiteCode(Integer value) {
        return new JAXBElement<>(_EmployeesFilterKeySiteCode_QNAME, Integer.class, EmployeesFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "LastNameContains", scope = EmployeesFilter.class)
    public JAXBElement<String> createEmployeesFilterLastNameContains(String value) {
        return new JAXBElement<>(_EmployeesFilterLastNameContains_QNAME, String.class, EmployeesFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "SecondNameContains", scope = EmployeesFilter.class)
    public JAXBElement<String> createEmployeesFilterSecondNameContains(String value) {
        return new JAXBElement<>(_EmployeesFilterSecondNameContains_QNAME, String.class, EmployeesFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "TabNumberContains", scope = EmployeesFilter.class)
    public JAXBElement<String> createEmployeesFilterTabNumberContains(String value) {
        return new JAXBElement<>(_EmployeesFilterTabNumberContains_QNAME, String.class, EmployeesFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "TabNumberEquals", scope = EmployeesFilter.class)
    public JAXBElement<String> createEmployeesFilterTabNumberEquals(String value) {
        return new JAXBElement<>(_EmployeesFilterTabNumberEquals_QNAME, String.class, EmployeesFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeSlim }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeSlim }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Employees", scope = EmployeesInfoData.class)
    public JAXBElement<ArrayOfAcsEmployeeSlim> createEmployeesInfoDataEmployees(ArrayOfAcsEmployeeSlim value) {
        return new JAXBElement<>(_EmployeesDataEmployees_QNAME, ArrayOfAcsEmployeeSlim.class, EmployeesInfoData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Vehicle", name = "GroupPath", scope = AcsVehicle.class)
    public JAXBElement<String> createAcsVehicleGroupPath(String value) {
        return new JAXBElement<>(_AcsVehicleGroupPath_QNAME, String.class, AcsVehicle.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AddField", scope = SearchCondition.class)
    public JAXBElement<String> createSearchConditionAddField(String value) {
        return new JAXBElement<>(_SearchConditionAddField_QNAME, String.class, SearchCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AdditionalFieldID", scope = SearchCondition.class)
    public JAXBElement<String> createSearchConditionAdditionalFieldID(String value) {
        return new JAXBElement<>(_SearchConditionAdditionalFieldID_QNAME, String.class, SearchCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "AlcoGroupID", scope = SearchCondition.class)
    public JAXBElement<String> createSearchConditionAlcoGroupID(String value) {
        return new JAXBElement<>(_SearchConditionAlcoGroupID_QNAME, String.class, SearchCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Birthday", scope = SearchCondition.class)
    public JAXBElement<XMLGregorianCalendar> createSearchConditionBirthday(XMLGregorianCalendar value) {
        return new JAXBElement<>(_SearchConditionBirthday_QNAME, XMLGregorianCalendar.class, SearchCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "DrivingLicenseNumber", scope = SearchCondition.class)
    public JAXBElement<String> createSearchConditionDrivingLicenseNumber(String value) {
        return new JAXBElement<>(_SearchConditionDrivingLicenseNumber_QNAME, String.class, SearchCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Email", scope = SearchCondition.class)
    public JAXBElement<String> createSearchConditionEmail(String value) {
        return new JAXBElement<>(_SearchConditionEmail_QNAME, String.class, SearchCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "FirstName", scope = SearchCondition.class)
    public JAXBElement<String> createSearchConditionFirstName(String value) {
        return new JAXBElement<>(_AcsEmployeePhotosInfoFirstName_QNAME, String.class, SearchCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "GroupID", scope = SearchCondition.class)
    public JAXBElement<String> createSearchConditionGroupID(String value) {
        return new JAXBElement<>(_SearchConditionGroupID_QNAME, String.class, SearchCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "InternationalPassportNumber", scope = SearchCondition.class)
    public JAXBElement<String> createSearchConditionInternationalPassportNumber(String value) {
        return new JAXBElement<>(_SearchConditionInternationalPassportNumber_QNAME, String.class, SearchCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "KeyDescription", scope = SearchCondition.class)
    public JAXBElement<String> createSearchConditionKeyDescription(String value) {
        return new JAXBElement<>(_SearchConditionKeyDescription_QNAME, String.class, SearchCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "KeyNumber", scope = SearchCondition.class)
    public JAXBElement<Long> createSearchConditionKeyNumber(Long value) {
        return new JAXBElement<>(_EmployeesFilterKeyNumber_QNAME, Long.class, SearchCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "LastName", scope = SearchCondition.class)
    public JAXBElement<String> createSearchConditionLastName(String value) {
        return new JAXBElement<>(_AcsEmployeePhotosInfoLastName_QNAME, String.class, SearchCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "PassportNumber", scope = SearchCondition.class)
    public JAXBElement<String> createSearchConditionPassportNumber(String value) {
        return new JAXBElement<>(_AcsEmployeeFullBasePassportNumber_QNAME, String.class, SearchCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "Phone", scope = SearchCondition.class)
    public JAXBElement<String> createSearchConditionPhone(String value) {
        return new JAXBElement<>(_SearchConditionPhone_QNAME, String.class, SearchCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "SecondName", scope = SearchCondition.class)
    public JAXBElement<String> createSearchConditionSecondName(String value) {
        return new JAXBElement<>(_AcsEmployeePhotosInfoSecondName_QNAME, String.class, SearchCondition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS.Employees", name = "TableNumber", scope = SearchCondition.class)
    public JAXBElement<Integer> createSearchConditionTableNumber(Integer value) {
        return new JAXBElement<>(_SearchConditionTableNumber_QNAME, Integer.class, SearchCondition.class, value);
    }

}
