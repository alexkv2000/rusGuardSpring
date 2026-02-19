
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity;

import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsDaySchedule;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsEmployeeDocumentsData;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsEmployeeFull;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsMultiDaySchedule;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsVehicle;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsWeekScheduleFull;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.ArrayOfAcsAccessLevelSlimInfo;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.ArrayOfAcsEmployeeGroup;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.DocumentType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs_accesslevels.AcsAccessPointDriverInfo;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs_accesslevels.ArrayOfServerIdentificationType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity package. 
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

    private static final QName _ArrayOfLogMsgSubType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "ArrayOfLogMsgSubType");
    private static final QName _LogMsgSubType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "LogMsgSubType");
    private static final QName _ArrayOfLogMessageTypeSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "ArrayOfLogMessageTypeSlimInfo");
    private static final QName _LogMessageTypeSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "LogMessageTypeSlimInfo");
    private static final QName _LogMsgType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "LogMsgType");
    private static final QName _ArrayOfLogMessageSubtypeSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "ArrayOfLogMessageSubtypeSlimInfo");
    private static final QName _LogMessageSubtypeSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "LogMessageSubtypeSlimInfo");
    private static final QName _ArrayOfLogMsgType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "ArrayOfLogMsgType");
    private static final QName _LogSubjectType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "LogSubjectType");
    private static final QName _LogMessageSortedColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "LogMessageSortedColumn");
    private static final QName _LogData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "LogData");
    private static final QName _ArrayOfLogMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "ArrayOfLogMessage");
    private static final QName _LogMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "LogMessage");
    private static final QName _AlcoCheckState_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "AlcoCheckState");
    private static final QName _LogMessageContentDataType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "LogMessageContentDataType");
    private static final QName _FaceCheckState_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "FaceCheckState");
    private static final QName _ScalesMeasurementReuslt_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "ScalesMeasurementReuslt");
    private static final QName _TemperatureCheckState_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "TemperatureCheckState");
    private static final QName _DictionaryElementInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DictionaryElementInfo");
    private static final QName _DictionaryElementSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DictionaryElementSaveInfo");
    private static final QName _SecurityGroupDictionaryElementSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "SecurityGroupDictionaryElementSaveInfo");
    private static final QName _OrganizationElementSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "OrganizationElementSaveInfo");
    private static final QName _SecurityGroupDictionaryElementInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "SecurityGroupDictionaryElementInfo");
    private static final QName _OrganizationDictionaryElementInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "OrganizationDictionaryElementInfo");
    private static final QName _DictionaryType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DictionaryType");
    private static final QName _DictionaryElementSortedColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DictionaryElementSortedColumn");
    private static final QName _DictionaryElementsInfoData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DictionaryElementsInfoData");
    private static final QName _ArrayOfDictionaryElementInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfDictionaryElementInfo");
    private static final QName _DictionaryElementsFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DictionaryElementsFilter");
    private static final QName _IncidentSortedColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "IncidentSortedColumn");
    private static final QName _IncidentsFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "IncidentsFilter");
    private static final QName _IncidentsMegaFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "IncidentsMegaFilter");
    private static final QName _IncidentsInfoData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "IncidentsInfoData");
    private static final QName _ArrayOfIncidentElementFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfIncidentElementFullInfo");
    private static final QName _IncidentElementFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "IncidentElementFullInfo");
    private static final QName _IncidentSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "IncidentSaveInfo");
    private static final QName _ArrayOfViolatorSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfViolatorSaveInfo");
    private static final QName _ViolatorSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ViolatorSaveInfo");
    private static final QName _ArrayOfDocumentForActionSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfDocumentForActionSaveInfo");
    private static final QName _DocumentForActionSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DocumentForActionSaveInfo");
    private static final QName _ArrayOfDocumentSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfDocumentSaveInfo");
    private static final QName _DocumentSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DocumentSaveInfo");
    private static final QName _ArrayOfViolationSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfViolationSaveInfo");
    private static final QName _ViolationSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ViolationSaveInfo");
    private static final QName _ViolationFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ViolationFullInfo");
    private static final QName _ArrayOfTangiblesSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfTangiblesSaveInfo");
    private static final QName _TangiblesSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "TangiblesSaveInfo");
    private static final QName _ArrayOfViolatorFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfViolatorFullInfo");
    private static final QName _ViolatorFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ViolatorFullInfo");
    private static final QName _ArrayOfDocumentFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfDocumentFullInfo");
    private static final QName _DocumentFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DocumentFullInfo");
    private static final QName _ArrayOfDocumentFullForActionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfDocumentFullForActionInfo");
    private static final QName _DocumentFullForActionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DocumentFullForActionInfo");
    private static final QName _ArrayOfViolationFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfViolationFullInfo");
    private static final QName _ArrayOfTangiblesFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfTangiblesFullInfo");
    private static final QName _TangiblesFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "TangiblesFullInfo");
    private static final QName _ViolatorFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ViolatorFilter");
    private static final QName _ArrayOfFirebirdIncidentEventsResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfFirebirdIncidentEventsResult");
    private static final QName _FirebirdIncidentEventsResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "FirebirdIncidentEventsResult");
    private static final QName _ArrayOfViolation_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfViolation");
    private static final QName _Violation_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Violation");
    private static final QName _ArrayOfIncidentTemplateInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfIncidentTemplateInfo");
    private static final QName _IncidentTemplateInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "IncidentTemplateInfo");
    private static final QName _IncidentTemplateSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "IncidentTemplateSaveData");
    private static final QName _ArrayOfEmployee2OrganizationAssignmentFull_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfEmployee2OrganizationAssignmentFull");
    private static final QName _Employee2OrganizationAssignmentFull_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Employee2OrganizationAssignmentFull");
    private static final QName _ArrayOfEmployee2OrganizationAssignment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ArrayOfEmployee2OrganizationAssignment");
    private static final QName _Employee2OrganizationAssignment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Employee2OrganizationAssignment");
    private static final QName _FolderInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", "FolderInfo");
    private static final QName _FolderSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", "FolderSaveData");
    private static final QName _OwnerType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", "OwnerType");
    private static final QName _ArrayOfFolderInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", "ArrayOfFolderInfo");
    private static final QName _ArrayOfFolderInfoWithAccessLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", "ArrayOfFolderInfoWithAccessLevel");
    private static final QName _FolderInfoWithAccessLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", "FolderInfoWithAccessLevel");
    private static final QName _ArrayOfEmployeePositionSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", "ArrayOfEmployeePositionSlimInfo");
    private static final QName _EmployeePositionSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", "EmployeePositionSlimInfo");
    private static final QName _LEmployeePositionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", "LEmployeePositionInfo");
    private static final QName _EmployeePositionSortedColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", "EmployeePositionSortedColumn");
    private static final QName _LEmployeePositionsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", "LEmployeePositionsData");
    private static final QName _ArrayOfLEmployeePositionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", "ArrayOfLEmployeePositionInfo");
    private static final QName _ArrayOfWorkZoneSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "ArrayOfWorkZoneSlimInfo");
    private static final QName _WorkZoneSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkZoneSlimInfo");
    private static final QName _WorkZoneSlimSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkZoneSlimSaveData");
    private static final QName _ArrayOfWorkTimetableSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "ArrayOfWorkTimetableSlimInfo");
    private static final QName _WorkTimetableSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkTimetableSlimInfo");
    private static final QName _DayForm_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "DayForm");
    private static final QName _DayTypeSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "DayTypeSlimInfo");
    private static final QName _DayTypeSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "DayTypeSaveData");
    private static final QName _DayMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "DayMode");
    private static final QName _ArrayOfDayTypeSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "ArrayOfDayTypeSlimInfo");
    private static final QName _ArrayOfWorkScheduleSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "ArrayOfWorkScheduleSlimInfo");
    private static final QName _WorkScheduleSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkScheduleSlimInfo");
    private static final QName _WorkScheduleSlimSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkScheduleSlimSaveData");
    private static final QName _ArrayOfWorkZonesAccessPointSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "ArrayOfWorkZonesAccessPointSlimInfo");
    private static final QName _WorkZonesAccessPointSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkZonesAccessPointSlimInfo");
    private static final QName _WorkZonesAccessPointBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkZonesAccessPointBase");
    private static final QName _WorkZonesAccessPointType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkZonesAccessPointType");
    private static final QName _WorkZonesAccessPointEventType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkZonesAccessPointEventType");
    private static final QName _WorkZoneSortedColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkZoneSortedColumn");
    private static final QName _WorkZonesOwner_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkZonesOwner");
    private static final QName _WorkZonesData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkZonesData");
    private static final QName _WorkScheduleSortedColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkScheduleSortedColumn");
    private static final QName _WorkSchedulesOwner_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkSchedulesOwner");
    private static final QName _WorkSchedulesData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkSchedulesData");
    private static final QName _WorkZonesAccessPointSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkZonesAccessPointSaveData");
    private static final QName _ArrayOfBranchInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Branch", "ArrayOfBranchInfo");
    private static final QName _BranchInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Branch", "BranchInfo");
    private static final QName _BranchSortedColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Branch", "BranchSortedColumn");
    private static final QName _BranchData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Branch", "BranchData");
    private static final QName _ArrayOfReportSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", "ArrayOfReportSlimInfo");
    private static final QName _ReportSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", "ReportSlimInfo");
    private static final QName _ReportSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", "ReportSaveData");
    private static final QName _PhotoOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Photo", "PhotoOrder");
    private static final QName _PhotoOwnerType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Photo", "PhotoOwnerType");
    private static final QName _ArrayOfPhotoOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Photo", "ArrayOfPhotoOrder");
    private static final QName _PhotoMarker_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "PhotoMarker");
    private static final QName _OwnerFieldType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "OwnerFieldType");
    private static final QName _ArrayOfAdditionalFieldBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "ArrayOfAdditionalFieldBase");
    private static final QName _AdditionalFieldBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "AdditionalFieldBase");
    private static final QName _FieldType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "FieldType");
    private static final QName _DateTimeField_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "DateTimeField");
    private static final QName _IntegerField_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "IntegerField");
    private static final QName _DoubleField_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "DoubleField");
    private static final QName _StringField_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "StringField");
    private static final QName _ColorField_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "ColorField");
    private static final QName _ListField_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "ListField");
    private static final QName _ListItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "ListItem");
    private static final QName _ArrayOfListItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "ArrayOfListItem");
    private static final QName _ArrayOfAdditionalFieldValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "ArrayOfAdditionalFieldValue");
    private static final QName _AdditionalFieldValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "AdditionalFieldValue");
    private static final QName _OwnerValueBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "OwnerValueBase");
    private static final QName _OwnerDateTimeValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "OwnerDateTimeValue");
    private static final QName _OwnerDoubleValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "OwnerDoubleValue");
    private static final QName _OwnerIntValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "OwnerIntValue");
    private static final QName _OwnerStringValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "OwnerStringValue");
    private static final QName _OwnerColorValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "OwnerColorValue");
    private static final QName _OwnerListValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "OwnerListValue");
    private static final QName _SavedFieldContext_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "SavedFieldContext");
    private static final QName _ArrayOfOwnerAdditionalFieldsValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "ArrayOfOwnerAdditionalFieldsValue");
    private static final QName _OwnerAdditionalFieldsValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "OwnerAdditionalFieldsValue");
    private static final QName _ArrayOfAddDateTimeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "ArrayOfAddDateTimeInfo");
    private static final QName _AddDateTimeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "AddDateTimeInfo");
    private static final QName _AddFieldInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "AddFieldInfo");
    private static final QName _ArrayOfAddDoubleInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "ArrayOfAddDoubleInfo");
    private static final QName _AddDoubleInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "AddDoubleInfo");
    private static final QName _ArrayOfAddIntInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "ArrayOfAddIntInfo");
    private static final QName _AddIntInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "AddIntInfo");
    private static final QName _ArrayOfAddStringInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "ArrayOfAddStringInfo");
    private static final QName _AddStringInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "AddStringInfo");
    private static final QName _ArrayOfAddColorInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "ArrayOfAddColorInfo");
    private static final QName _AddColorInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "AddColorInfo");
    private static final QName _ArrayOfAddListInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "ArrayOfAddListInfo");
    private static final QName _AddListInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "AddListInfo");
    private static final QName _ReactionEventsFromDevicesSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionEventsFromDevicesSlimInfo");
    private static final QName _ReactionEventsFromDevicesSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionEventsFromDevicesSaveData");
    private static final QName _ReactionEventSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionEventSlimInfo");
    private static final QName _ReactionEventSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionEventSaveData");
    private static final QName _ReactionEventType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionEventType");
    private static final QName _ArrayOfReactionSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ArrayOfReactionSlimInfo");
    private static final QName _ReactionSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionSlimInfo");
    private static final QName _ReactionFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionFullInfo");
    private static final QName _ArrayOfReactionActionSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ArrayOfReactionActionSlimInfo");
    private static final QName _ReactionActionSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionActionSlimInfo");
    private static final QName _ReactionActionSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionActionSaveData");
    private static final QName _ReactionActionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionActionType");
    private static final QName _ArrayOfReactionEventSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ArrayOfReactionEventSlimInfo");
    private static final QName _ReactionSendSMSActionSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionSendSMSActionSlimInfo");
    private static final QName _ReactionSendSMSActionSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionSendSMSActionSaveData");
    private static final QName _ReactionSendEmailActionSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionSendEmailActionSlimInfo");
    private static final QName _ReactionSendEmailActionSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionSendEmailActionSaveData");
    private static final QName _ReactionExecuteProgramActionSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionExecuteProgramActionSlimInfo");
    private static final QName _ReactionExecuteProgramActionSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionExecuteProgramActionSaveData");
    private static final QName _ReactionRecordVideoActionSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionRecordVideoActionSlimInfo");
    private static final QName _ReactionRecordVideoActionSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionRecordVideoActionSaveData");
    private static final QName _ReactionSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ReactionSaveData");
    private static final QName _ArrayOfPhotoBankShort_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PhotoBank", "ArrayOfPhotoBankShort");
    private static final QName _PhotoBankShort_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PhotoBank", "PhotoBankShort");
    private static final QName _ArrayOfWorkplaceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "ArrayOfWorkplaceInfo");
    private static final QName _WorkplaceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "WorkplaceInfo");
    private static final QName _WorkplaceSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "WorkplaceSaveData");
    private static final QName _FavoriteType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "FavoriteType");
    private static final QName _ArrayOfWorkplaceModuleInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "ArrayOfWorkplaceModuleInfo");
    private static final QName _WorkplaceModuleInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "WorkplaceModuleInfo");
    private static final QName _WorkplaceModuleSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "WorkplaceModuleSaveData");
    private static final QName _WorkplaceModuleType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "WorkplaceModuleType");
    private static final QName _AcsConfiguratorInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "AcsConfiguratorInfo");
    private static final QName _AcsConfiguratorSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "AcsConfiguratorSaveData");
    private static final QName _ArrayOfISSIIDKSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ArrayOfISS_IIDK_SlimInfo");
    private static final QName _ISSIIDKSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_IIDK_SlimInfo");
    private static final QName _ISSIIDKSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_IIDK_SaveData");
    private static final QName _ArrayOfISSSlaveSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ArrayOfISS_Slave_SlimInfo");
    private static final QName _ISSSlaveSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_Slave_SlimInfo");
    private static final QName _ISSEntityBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_Entity_Base");
    private static final QName _ArrayOfISSDisplaySlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ArrayOfISS_Display_SlimInfo");
    private static final QName _ISSDisplaySlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_Display_SlimInfo");
    private static final QName _ArrayOfISSEventViewerSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ArrayOfISS_EventViewer_SlimInfo");
    private static final QName _ISSEventViewerSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_EventViewer_SlimInfo");
    private static final QName _ArrayOfISSMonitorSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ArrayOfISS_Monitor_SlimInfo");
    private static final QName _ISSMonitorSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_Monitor_SlimInfo");
    private static final QName _ArrayOfISSCamSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ArrayOfISS_Cam_SlimInfo");
    private static final QName _ISSCamSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_Cam_SlimInfo");
    private static final QName _ArrayOfISSIntegrationPointSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ArrayOfISS_IntegrationPoint_SlimInfo");
    private static final QName _ISSIntegrationPointSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_IntegrationPoint_SlimInfo");
    private static final QName _ArrayOfISSRusGuardSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ArrayOfISS_RusGuard_SlimInfo");
    private static final QName _ISSRusGuardSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_RusGuard_SlimInfo");
    private static final QName _ArrayOfISSRecognitionSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ArrayOfISS_Recognition_SlimInfo");
    private static final QName _ISSRecognitionSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_Recognition_SlimInfo");
    private static final QName _ISSRecognitionSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_Recognition_SaveData");
    private static final QName _ArrayOfISSDriverSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ArrayOfISS_Driver_SlimInfo");
    private static final QName _ISSDriverSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_Driver_SlimInfo");
    private static final QName _ISSDriverSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_Driver_SaveData");
    private static final QName _ArrayOfISSDriverEventPlaybackSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ArrayOfISS_DriverEventPlaybackSlimInfo");
    private static final QName _ISSDriverEventPlaybackSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_DriverEventPlaybackSlimInfo");
    private static final QName _ISSDriverEventPlaybackSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_DriverEventPlaybackSaveData");
    private static final QName _ArrayOfUidKeyInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "ArrayOfUidKeyInfo");
    private static final QName _UidKeyInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "UidKeyInfo");
    private static final QName _ProfileTypeFilter_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "ProfileTypeFilter");
    private static final QName _ArrayOfMifareProfileInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "ArrayOfMifareProfileInfo");
    private static final QName _MifareProfileInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "MifareProfileInfo");
    private static final QName _MifareProfileSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "MifareProfileSaveData");
    private static final QName _SectorAuthentication_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "SectorAuthentication");
    private static final QName _ProfileType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "ProfileType");
    private static final QName _MifareProfileFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "MifareProfileFullInfo");
    private static final QName _MifareProfileFullSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "MifareProfileFullSaveData");
    private static final QName _AccessBits_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "AccessBits");
    private static final QName _BlockData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "BlockData");
    private static final QName _EmissionProtectionLevel_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "EmissionProtectionLevel");
    private static final QName _ScreenLayoutInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", "ScreenLayoutInfo");
    private static final QName _ScreenLayoutSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", "ScreenLayoutSaveData");
    private static final QName _ScreenAspectRatio_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", "ScreenAspectRatio");
    private static final QName _ScreenScaleMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", "ScreenScaleMode");
    private static final QName _ScreenCellTreeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", "ScreenCellTreeInfo");
    private static final QName _ScreenCellInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", "ScreenCellInfo");
    private static final QName _ScreenCellSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", "ScreenCellSaveData");
    private static final QName _ScreenCellContentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", "ScreenCellContentType");
    private static final QName _ArrayOfScreenCellTreeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", "ArrayOfScreenCellTreeInfo");
    private static final QName _ArrayOfScreenCellSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", "ArrayOfScreenCellSaveData");
    private static final QName _ArrayOfScreenCellInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", "ArrayOfScreenCellInfo");
    private static final QName _ArrayOfIvideonCameraDriverInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IvidionCamera", "ArrayOfIvideonCameraDriverInfo");
    private static final QName _IvideonCameraDriverInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IvidionCamera", "IvideonCameraDriverInfo");
    private static final QName _CameraProductType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IvidionCamera", "CameraProductType");
    private static final QName _EmailAddressOwner_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "EmailAddressOwner");
    private static final QName _ArrayOfEmailAddressInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "ArrayOfEmailAddressInfo");
    private static final QName _EmailAddressInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "EmailAddressInfo");
    private static final QName _EmailAddressSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "EmailAddressSaveData");
    private static final QName _PhoneNumberOwner_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "PhoneNumberOwner");
    private static final QName _ArrayOfPhoneNumberInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "ArrayOfPhoneNumberInfo");
    private static final QName _PhoneNumberInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "PhoneNumberInfo");
    private static final QName _PhoneNumberSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "PhoneNumberSaveData");
    private static final QName _ArrayOfEmailDistributionAddressInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "ArrayOfEmailDistributionAddressInfo");
    private static final QName _EmailDistributionAddressInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "EmailDistributionAddressInfo");
    private static final QName _EmailDistributionAddressSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "EmailDistributionAddressSaveData");
    private static final QName _SmtpEncryptionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "SmtpEncryptionType");
    private static final QName _ArrayOfMifareProfileTagsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "ArrayOfMifareProfileTagsData");
    private static final QName _MifareProfileTagsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "MifareProfileTagsData");
    private static final QName _TagFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "TagFullInfo");
    private static final QName _ArrayOfReportTagsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "ArrayOfReportTagsData");
    private static final QName _ReportTagsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "ReportTagsData");
    private static final QName _ArrayOfEmployeeGroupTagsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "ArrayOfEmployeeGroupTagsData");
    private static final QName _EmployeeGroupTagsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "EmployeeGroupTagsData");
    private static final QName _ArrayOfAccessLevelTagsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "ArrayOfAccessLevelTagsData");
    private static final QName _AccessLevelTagsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "AccessLevelTagsData");
    private static final QName _ArrayOfBoxAccessLevelTagsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "ArrayOfBoxAccessLevelTagsData");
    private static final QName _BoxAccessLevelTagsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "BoxAccessLevelTagsData");
    private static final QName _ArrayOfResourceTagsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "ArrayOfResourceTagsData");
    private static final QName _ResourceTagsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "ResourceTagsData");
    private static final QName _ArrayOfResourceFilterTagsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "ArrayOfResourceFilterTagsData");
    private static final QName _ResourceFilterTagsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "ResourceFilterTagsData");
    private static final QName _FilterTagFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "FilterTagFullInfo");
    private static final QName _ArrayOfTagFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "ArrayOfTagFullInfo");
    private static final QName _ArrayOfFilterTagFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "ArrayOfFilterTagFullInfo");
    private static final QName _TagSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "TagSaveData");
    private static final QName _FilterTagSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "FilterTagSaveData");
    private static final QName _ArrayOfFavoriteFolderInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", "ArrayOfFavoriteFolderInfo");
    private static final QName _FavoriteFolderInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", "FavoriteFolderInfo");
    private static final QName _FavoriteFolderSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", "FavoriteFolderSaveData");
    private static final QName _ArrayOfFavoriteFolderInfoWithEmployeeGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", "ArrayOfFavoriteFolderInfoWithEmployeeGroup");
    private static final QName _FavoriteFolderInfoWithEmployeeGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", "FavoriteFolderInfoWithEmployeeGroup");
    private static final QName _ArrayOfUserPassSlimData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", "ArrayOfUserPassSlimData");
    private static final QName _UserPassSlimData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", "UserPassSlimData");
    private static final QName _UserPassSlimSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", "UserPassSlimSaveData");
    private static final QName _UserPassFullData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", "UserPassFullData");
    private static final QName _UserPassFullSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", "UserPassFullSaveData");
    private static final QName _PassBackgroundType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", "PassBackgroundType");
    private static final QName _ArrayOfUserPassEditorData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", "ArrayOfUserPassEditorData");
    private static final QName _UserPassEditorData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", "UserPassEditorData");
    private static final QName _UserPassEditorSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", "UserPassEditorSaveData");
    private static final QName _NotificationState_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CommandNotification", "NotificationState");
    private static final QName _ArrayOfPOBRelation_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PostOffice", "ArrayOfPOBRelation");
    private static final QName _POBRelation_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PostOffice", "POBRelation");
    private static final QName _EmployeeBiometricStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.EBS", "EmployeeBiometricStatus");
    private static final QName _LUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "LUser");
    private static final QName _UserSortedColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "UserSortedColumn");
    private static final QName _LUsersData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "LUsersData");
    private static final QName _ArrayOfLUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "ArrayOfLUser");
    private static final QName _LUserGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "LUserGroup");
    private static final QName _UserGroupType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "UserGroupType");
    private static final QName _UserGroupSortedColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "UserGroupSortedColumn");
    private static final QName _LUserGroupsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "LUserGroupsData");
    private static final QName _ArrayOfLUserGroup_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "ArrayOfLUserGroup");
    private static final QName _ClaimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "ClaimInfo");
    private static final QName _ClaimSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "ClaimSaveData");
    private static final QName _ArrayOfClaimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "ArrayOfClaimInfo");
    private static final QName _CardTypeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", "CardTypeInfo");
    private static final QName _CardTypeSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", "CardTypeSaveInfo");
    private static final QName _CardTypeSortedColumn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", "CardTypeSortedColumn");
    private static final QName _CardTypesInfoData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", "CardTypesInfoData");
    private static final QName _ArrayOfCardTypeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", "ArrayOfCardTypeInfo");
    private static final QName _RecognitionMarker_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "RecognitionMarker");
    private static final QName _ArrayOfCardTypeBiometricPermission_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "ArrayOfCardTypeBiometricPermission");
    private static final QName _CardTypeBiometricPermission_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "CardTypeBiometricPermission");
    private static final QName _NameFormatType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "NameFormatType");
    private static final QName _LChangedKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "LChangedKeys");
    private static final QName _ArrayOfLKeyInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "ArrayOfLKeyInfo");
    private static final QName _LKeyInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "LKeyInfo");
    private static final QName _LStateBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "LStateBase");
    private static final QName _StorageStateEnum_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "StorageStateEnum");
    private static final QName _DriverSettings_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "DriverSettings");
    private static final QName _DoorRelays_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "DoorRelays");
    private static final QName _ArrayOfDoorRelay_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "ArrayOfDoorRelay");
    private static final QName _DoorRelay_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "DoorRelay");
    private static final QName _LChangedCustomizableDays_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "LChangedCustomizableDays");
    private static final QName _ArrayOfLDriversCustomizableDays_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "ArrayOfLDriversCustomizableDays");
    private static final QName _LDriversCustomizableDays_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "LDriversCustomizableDays");
    private static final QName _ArrayOfLCustomizableDayInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "ArrayOfLCustomizableDayInfo");
    private static final QName _LCustomizableDayInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "LCustomizableDayInfo");
    private static final QName _CustomizableDayType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "CustomizableDayType");
    private static final QName _RezervedHotKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.HotKey", "RezervedHotKeys");
    private static final QName _LCustomizableDayInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "Name");
    private static final QName _LCustomizableDayInfoTransferedDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "TransferedDate");
    private static final QName _LDriversCustomizableDaysDays_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "Days");
    private static final QName _DoorRelaysRelays_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "Relays");
    private static final QName _DriverSettingsAntipassback_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "Antipassback");
    private static final QName _DriverSettingsCardPlusAlcoFrame_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "CardPlusAlcoFrame");
    private static final QName _DriverSettingsCardPlusFace_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "CardPlusFace");
    private static final QName _DriverSettingsCardPlusVehicle_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "CardPlusVehicle");
    private static final QName _DriverSettingsDailyAlcoholTestConfirmation_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "DailyAlcoholTestConfirmation");
    private static final QName _DriverSettingsDaySchedule_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "DaySchedule");
    private static final QName _DriverSettingsIsConfirmingKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "IsConfirmingKey");
    private static final QName _DriverSettingsIsGuardOffModeOn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "IsGuardOffModeOn");
    private static final QName _DriverSettingsIsGuardOnModeOn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "IsGuardOnModeOn");
    private static final QName _DriverSettingsIsLockModeOn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "IsLockModeOn");
    private static final QName _DriverSettingsIsMultiIdentification_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "IsMultiIdentification");
    private static final QName _DriverSettingsIsOpenForALongTimeModeOn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "IsOpenForALongTimeModeOn");
    private static final QName _DriverSettingsMultiDaySchedule_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "MultiDaySchedule");
    private static final QName _DriverSettingsOrderedServerIdentification_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "OrderedServerIdentification");
    private static final QName _DriverSettingsServerVehicleIdentification_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "ServerVehicleIdentification");
    private static final QName _DriverSettingsUseHolidaysAndTransfers_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "UseHolidaysAndTransfers");
    private static final QName _DriverSettingsWeekSchedule_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "WeekSchedule");
    private static final QName _LKeyInfoData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "Data");
    private static final QName _LKeyInfoEmployeeFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "EmployeeFirstName");
    private static final QName _LKeyInfoEmployeeLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "EmployeeLastName");
    private static final QName _LKeyInfoEmployeeSecondName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "EmployeeSecondName");
    private static final QName _LKeyInfoEndDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "EndDate");
    private static final QName _LKeyInfoFinger1Template_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "Finger1_Template");
    private static final QName _LKeyInfoFinger2Template_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "Finger2_Template");
    private static final QName _LKeyInfoFinger3Template_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "Finger3_Template");
    private static final QName _LKeyInfoFinger4Template_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "Finger4_Template");
    private static final QName _LKeyInfoFinger5Template_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "Finger5_Template");
    private static final QName _LKeyInfoPINCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "PINCode");
    private static final QName _LKeyInfoPINCodeUnderPressure_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "PINCodeUnderPressure");
    private static final QName _LKeyInfoStartDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "StartDate");
    private static final QName _LKeyInfoTabNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "TabNumber");
    private static final QName _CardTypeBiometricPermissionCardTypeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "CardTypeID");
    private static final QName _CardTypeBiometricPermissionCardTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "CardTypeName");
    private static final QName _CardTypeSaveInfoComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", "Comment");
    private static final QName _CardTypeSaveInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", "Name");
    private static final QName _UserPassEditorSaveDataEditor_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", "Editor");
    private static final QName _UserPassSlimSaveDataDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", "Description");
    private static final QName _UserPassSlimSaveDataName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", "Name");
    private static final QName _FavoriteFolderSaveDataName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", "Name");
    private static final QName _FavoriteFolderSaveDataParentID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", "ParentID");
    private static final QName _FavoriteFolderSaveDataUserID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", "UserID");
    private static final QName _FavoriteFolderSaveDataWorkplaceID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", "WorkplaceID");
    private static final QName _FavoriteFolderInfoFavoreteFolderRelationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", "FavoreteFolderRelationName");
    private static final QName _FavoriteFolderInfoFavoreteFolderRelationPath_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", "FavoreteFolderRelationPath");
    private static final QName _FavoriteFolderInfoWithEmployeeGroupGroups_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", "Groups");
    private static final QName _FilterTagFullInfoDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "Description");
    private static final QName _FilterTagFullInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", "Name");
    private static final QName _EmailDistributionAddressSaveDataDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "Description");
    private static final QName _EmailDistributionAddressSaveDataLogin_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "Login");
    private static final QName _EmailDistributionAddressSaveDataName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "Name");
    private static final QName _EmailDistributionAddressSaveDataPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "Password");
    private static final QName _EmailDistributionAddressSaveDataSenderEmailAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "SenderEmailAddress");
    private static final QName _EmailDistributionAddressSaveDataSenderName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "SenderName");
    private static final QName _EmailDistributionAddressSaveDataSmtpServerAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "SmtpServerAddress");
    private static final QName _PhoneNumberSaveDataCityCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "CityCode");
    private static final QName _PhoneNumberSaveDataCountryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "CountryCode");
    private static final QName _PhoneNumberSaveDataPhoneNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "PhoneNumber");
    private static final QName _EmailAddressSaveDataEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", "Email");
    private static final QName _IvideonCameraDriverInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IvidionCamera", "Name");
    private static final QName _IvideonCameraDriverInfoPath_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IvidionCamera", "Path");
    private static final QName _IvideonCameraDriverInfoServerType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IvidionCamera", "ServerType");
    private static final QName _ScreenCellSaveDataName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", "Name");
    private static final QName _ScreenCellTreeInfoChildren_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", "Children");
    private static final QName _ISSEntityBaseISSOBJID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "ISS_OBJ_ID");
    private static final QName _ISSEntityBaseName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "Name");
    private static final QName _ISSIntegrationPointSlimInfoRusGuardIntegrationPoints_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "RusGuardIntegrationPoints");
    private static final QName _ISSMonitorSlimInfoCameras_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "Cameras");
    private static final QName _ISSDisplaySlimInfoEventViewers_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "EventViewers");
    private static final QName _ISSDisplaySlimInfoMonitors_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "Monitors");
    private static final QName _ISSSlaveSlimInfoDisplays_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "Displays");
    private static final QName _ISSSlaveSlimInfoDns_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "Dns");
    private static final QName _ISSSlaveSlimInfoIPAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "IPAddress");
    private static final QName _ISSSlaveSlimInfoIntegrationPoints_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "IntegrationPoints");
    private static final QName _PhotoBankShortDateOfBirth_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PhotoBank", "DateOfBirth");
    private static final QName _PhotoBankShortFullName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PhotoBank", "FullName");
    private static final QName _PhotoBankShortPersonNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PhotoBank", "PersonNumber");
    private static final QName _ReactionActionSaveDataName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "Name");
    private static final QName _AddListInfoValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "Value");
    private static final QName _OwnerAdditionalFieldsValueFields_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "Fields");
    private static final QName _AdditionalFieldValueAdditionalFieldInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "AdditionalFieldInfo");
    private static final QName _AdditionalFieldValueOwnerValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "OwnerValue");
    private static final QName _AdditionalFieldBaseName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "Name");
    private static final QName _ListFieldDefaultValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "DefaultValue");
    private static final QName _ListFieldItems_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "Items");
    private static final QName _DateTimeFieldFormat_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "Format");
    private static final QName _DateTimeFieldIsCurrent_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "IsCurrent");
    private static final QName _ReportSaveDataAdditionalField1_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", "AdditionalField1");
    private static final QName _ReportSaveDataAdditionalField2_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", "AdditionalField2");
    private static final QName _ReportSaveDataAdditionalField3_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", "AdditionalField3");
    private static final QName _ReportSaveDataCompany_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", "Company");
    private static final QName _ReportSaveDataDepartment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", "Department");
    private static final QName _ReportSaveDataDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", "Description");
    private static final QName _ReportSaveDataIdentity_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", "Identity");
    private static final QName _ReportSaveDataName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", "Name");
    private static final QName _WorkTimetableSlimInfoComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "Comment");
    private static final QName _EmployeePositionSlimInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", "Name");
    private static final QName _FolderSaveDataDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", "Description");
    private static final QName _FolderSaveDataName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", "Name");
    private static final QName _FolderSaveDataParentID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", "ParentID");
    private static final QName _FolderInfoWithAccessLevelLevels_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", "Levels");
    private static final QName _Employee2OrganizationAssignmentComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Comment");
    private static final QName _Employee2OrganizationAssignmentID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ID");
    private static final QName _Employee2OrganizationAssignmentSubdivisionID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "SubdivisionID");
    private static final QName _Employee2OrganizationAssignmentFullOrganization_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Organization");
    private static final QName _Employee2OrganizationAssignmentFullSubdivision_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Subdivision");
    private static final QName _ViolationDocumentNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DocumentNumber");
    private static final QName _ViolationDocumentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DocumentType");
    private static final QName _ViolationFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "FirstName");
    private static final QName _ViolationGroupName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "GroupName");
    private static final QName _ViolationGroupPath_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "GroupPath");
    private static final QName _ViolationIncidentDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "IncidentDate");
    private static final QName _ViolationLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "LastName");
    private static final QName _ViolationNatureOfViolation_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "NatureOfViolation");
    private static final QName _ViolationSecondName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "SecondName");
    private static final QName _ViolationSignificance_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Significance");
    private static final QName _ViolationTypeOfViolation_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "TypeOfViolation");
    private static final QName _FirebirdIncidentEventsResultApartm_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Apartm");
    private static final QName _FirebirdIncidentEventsResultArea_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Area");
    private static final QName _FirebirdIncidentEventsResultBirthDay_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "BirthDay");
    private static final QName _FirebirdIncidentEventsResultCases_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Cases");
    private static final QName _FirebirdIncidentEventsResultCity_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "City");
    private static final QName _FirebirdIncidentEventsResultCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Country");
    private static final QName _FirebirdIncidentEventsResultDateEvent_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DateEvent");
    private static final QName _FirebirdIncidentEventsResultFirm_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Firm");
    private static final QName _FirebirdIncidentEventsResultHouse_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "House");
    private static final QName _FirebirdIncidentEventsResultName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Name");
    private static final QName _FirebirdIncidentEventsResultNameDoc_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "NameDoc");
    private static final QName _FirebirdIncidentEventsResultNumDoc_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "NumDoc");
    private static final QName _FirebirdIncidentEventsResultPatronomic_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Patronomic");
    private static final QName _FirebirdIncidentEventsResultStreet_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Street");
    private static final QName _FirebirdIncidentEventsResultSurname_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Surname");
    private static final QName _FirebirdIncidentEventsResultWayOfPlunder_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "WayOfPlunder");
    private static final QName _FirebirdIncidentEventsResultWayOfPlunderInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "WayOfPlunderInfo");
    private static final QName _TangiblesSaveInfoDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Description");
    private static final QName _TangiblesSaveInfoMeasureID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "MeasureID");
    private static final QName _TangiblesSaveInfoNumberAndDateOfReturn_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "NumberAndDateOfReturn");
    private static final QName _TangiblesSaveInfoWhoTransferedID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "WhoTransferedID");
    private static final QName _TangiblesFullInfoMeasureName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "MeasureName");
    private static final QName _TangiblesFullInfoTangiblesName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "TangiblesName");
    private static final QName _TangiblesFullInfoWhoTransferedName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "WhoTransferedName");
    private static final QName _DocumentForActionSaveInfoAnswerDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "AnswerDate");
    private static final QName _DocumentForActionSaveInfoAnswerNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "AnswerNumber");
    private static final QName _DocumentForActionSaveInfoCreateDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "CreateDate");
    private static final QName _DocumentForActionSaveInfoDecisionDocumentTypeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DecisionDocumentTypeID");
    private static final QName _DocumentForActionSaveInfoExtraFinalPunishmentID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ExtraFinalPunishmentID");
    private static final QName _DocumentForActionSaveInfoFinalPunishmentID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "FinalPunishmentID");
    private static final QName _DocumentForActionSaveInfoSentDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "SentDate");
    private static final QName _DocumentForActionSaveInfoWhoTransferredDecisionDocumentID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "WhoTransferredDecisionDocumentID");
    private static final QName _DocumentFullForActionInfoDocumentSentName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DocumentSentName");
    private static final QName _DocumentFullForActionInfoDocumentTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DocumentTypeName");
    private static final QName _DocumentFullForActionInfoExtraFinalPunishmentName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ExtraFinalPunishmentName");
    private static final QName _DocumentFullForActionInfoFinalPunishmentName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "FinalPunishmentName");
    private static final QName _DocumentSaveInfoDocumentTypeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DocumentTypeID");
    private static final QName _DocumentSaveInfoWhoTransferedDocumentID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "WhoTransferedDocumentID");
    private static final QName _DocumentFullInfoDecisionDocumentTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DecisionDocumentTypeName");
    private static final QName _DocumentFullInfoWhoTransferredDecisionDocumentName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "WhoTransferredDecisionDocumentName");
    private static final QName _ViolatorSaveInfoActNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ActNumber");
    private static final QName _ViolatorSaveInfoDetentionID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DetentionID");
    private static final QName _ViolatorSaveInfoOrganizationID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "OrganizationID");
    private static final QName _ViolatorSaveInfoPositionID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "PositionID");
    private static final QName _ViolatorSaveInfoPunishmentID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "PunishmentID");
    private static final QName _ViolatorSaveInfoStatusID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "StatusID");
    private static final QName _ViolatorSaveInfoTabNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "TabNumber");
    private static final QName _ViolatorSaveInfoViolationsSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ViolationsSaveInfo");
    private static final QName _ViolatorFullInfoAcsEmployeeDocumentsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "AcsEmployeeDocumentsData");
    private static final QName _ViolatorFullInfoAcsEmployeeFull_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "AcsEmployeeFull");
    private static final QName _ViolatorFullInfoDetentionName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DetentionName");
    private static final QName _ViolatorFullInfoDocumentsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DocumentsData");
    private static final QName _ViolatorFullInfoDocumentsForActionData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DocumentsForActionData");
    private static final QName _ViolatorFullInfoOrganizationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "OrganizationName");
    private static final QName _ViolatorFullInfoPositionName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "PositionName");
    private static final QName _ViolatorFullInfoPunishmentName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "PunishmentName");
    private static final QName _ViolatorFullInfoStatusName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "StatusName");
    private static final QName _ViolatorFullInfoSubdivisionName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "SubdivisionName");
    private static final QName _ViolatorFullInfoViolationsData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ViolationsData");
    private static final QName _ViolationSaveInfoNatureID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "NatureID");
    private static final QName _ViolationSaveInfoTheftMethodID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "TheftMethodID");
    private static final QName _ViolationSaveInfoTypeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "TypeID");
    private static final QName _ViolationFullInfoNatureName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "NatureName");
    private static final QName _ViolationFullInfoTheftMethodName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "TheftMethodName");
    private static final QName _ViolationFullInfoTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "TypeName");
    private static final QName _IncidentsMegaFilterBeginDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "BeginDate");
    private static final QName _IncidentsMegaFilterBeginTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "BeginTime");
    private static final QName _IncidentsMegaFilterBranches_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Branches");
    private static final QName _IncidentsMegaFilterDatOfBirth_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DatOfBirth");
    private static final QName _IncidentsMegaFilterDecisionCreateDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DecisionCreateDate");
    private static final QName _IncidentsMegaFilterDecisionDocumentNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DecisionDocumentNumber");
    private static final QName _IncidentsMegaFilterDecisionFinalPunishmentID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DecisionFinalPunishmentID");
    private static final QName _IncidentsMegaFilterEmployeeConfirmatorID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "EmployeeConfirmatorID");
    private static final QName _IncidentsMegaFilterEndDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "EndDate");
    private static final QName _IncidentsMegaFilterEndTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "EndTime");
    private static final QName _IncidentsMegaFilterIncidentDetentionID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "IncidentDetentionID");
    private static final QName _IncidentsMegaFilterIncidentNatureID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "IncidentNatureID");
    private static final QName _IncidentsMegaFilterIncidentTheftMethodID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "IncidentTheftMethodID");
    private static final QName _IncidentsMegaFilterIncidentTypeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "IncidentTypeID");
    private static final QName _IncidentsMegaFilterLocationClarificationID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "LocationClarificationID");
    private static final QName _IncidentsMegaFilterLocationID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "LocationID");
    private static final QName _IncidentsMegaFilterRegistrationAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "RegistrationAddress");
    private static final QName _IncidentsMegaFilterResidentialAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ResidentialAddress");
    private static final QName _IncidentsMegaFilterSignificanceID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "SignificanceID");
    private static final QName _IncidentsMegaFilterTangiblesMeasureID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "TangiblesMeasureID");
    private static final QName _IncidentsMegaFilterTangiblesNameID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "TangiblesNameID");
    private static final QName _IncidentsMegaFilterVehicleMark_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "VehicleMark");
    private static final QName _IncidentsMegaFilterVehicleRegistrationNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "VehicleRegistrationNumber");
    private static final QName _DictionaryElementSaveInfoForeignID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ForeignID");
    private static final QName _DictionaryElementInfoForeignDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ForeignDescription");
    private static final QName _DictionaryElementInfoForeignName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ForeignName");
    private static final QName _OrganizationDictionaryElementInfoOrganizationTypeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "OrganizationTypeID");
    private static final QName _OrganizationDictionaryElementInfoOrganizationTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "OrganizationTypeName");
    private static final QName _SecurityGroupDictionaryElementInfoParentID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ParentID");
    private static final QName _LogMessageAlcoholResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "AlcoholResult");
    private static final QName _LogMessageContentData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "ContentData");
    private static final QName _LogMessageContentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "ContentType");
    private static final QName _LogMessageDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "Details");
    private static final QName _LogMessageDriverID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "DriverID");
    private static final QName _LogMessageDriverName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "DriverName");
    private static final QName _LogMessageEmployeeFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "EmployeeFirstName");
    private static final QName _LogMessageEmployeeGroupFullName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "EmployeeGroupFullName");
    private static final QName _LogMessageEmployeeGroupId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "EmployeeGroupId");
    private static final QName _LogMessageEmployeeGroupName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "EmployeeGroupName");
    private static final QName _LogMessageEmployeeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "EmployeeID");
    private static final QName _LogMessageEmployeeLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "EmployeeLastName");
    private static final QName _LogMessageEmployeeSecondName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "EmployeeSecondName");
    private static final QName _LogMessageEmployeeTableNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "EmployeeTableNumber");
    private static final QName _LogMessageLivenessResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "LivenessResult");
    private static final QName _LogMessageMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "Message");
    private static final QName _LogMessageOperatorFullName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "OperatorFullName");
    private static final QName _LogMessageOperatorID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "OperatorID");
    private static final QName _LogMessageOperatorLogin_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "OperatorLogin");
    private static final QName _LogMessageServerId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "ServerId");
    private static final QName _LogMessageServerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "ServerName");
    private static final QName _LogMessageTemperatureResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "TemperatureResult");
    private static final QName _LogMessageVehicleBrand_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "VehicleBrand");
    private static final QName _LogMessageVehicleID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "VehicleID");
    private static final QName _LogMessageVehicleRegistrationNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "VehicleRegistrationNumber");
    private static final QName _LogMessageSubtypeSlimInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "Name");
    private static final QName _ListItemItemValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", "ItemValue");
    private static final QName _MifareProfileSaveDataDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "Description");
    private static final QName _MifareProfileSaveDataName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "Name");
    private static final QName _MifareProfileFullSaveDataBlock1_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "Block1");
    private static final QName _MifareProfileFullSaveDataBlock2_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "Block2");
    private static final QName _MifareProfileFullSaveDataBlock3_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "Block3");
    private static final QName _MifareProfileFullSaveDataCardConfigurationKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "CardConfigurationKey");
    private static final QName _MifareProfileFullSaveDataCardMasterKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "CardMasterKey");
    private static final QName _MifareProfileFullSaveDataClassicEmissionMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "ClassicEmissionMode");
    private static final QName _MifareProfileFullSaveDataClassicKeyA_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "ClassicKeyA");
    private static final QName _MifareProfileFullSaveDataClassicKeyB_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "ClassicKeyB");
    private static final QName _MifareProfileFullSaveDataKeyBlock_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "KeyBlock");
    private static final QName _MifareProfileFullSaveDataLevel2SwitchKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "Level2SwitchKey");
    private static final QName _MifareProfileFullSaveDataLevel3SwitchKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "Level3SwitchKey");
    private static final QName _MifareProfileFullSaveDataPlusEmissionMode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "PlusEmissionMode");
    private static final QName _MifareProfileFullSaveDataPlusKeyA_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "PlusKeyA");
    private static final QName _MifareProfileFullSaveDataPlusKeyB_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "PlusKeyB");
    private static final QName _MifareProfileFullSaveDataSl1CardAuthenticationKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "Sl1CardAuthenticationKey");
    private static final QName _IncidentSaveInfoBranchID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "BranchID");
    private static final QName _IncidentSaveInfoDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Date");
    private static final QName _IncidentSaveInfoEmployeeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "EmployeeID");
    private static final QName _IncidentSaveInfoMembersSaveInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "MembersSaveInfo");
    private static final QName _IncidentSaveInfoSecurityGroupID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "SecurityGroupID");
    private static final QName _IncidentSaveInfoTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Time");
    private static final QName _IncidentSaveInfoVehicleComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "VehicleComment");
    private static final QName _IncidentSaveInfoVehicleID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "VehicleID");
    private static final QName _IncidentSaveInfoVehicleOrganizationID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "VehicleOrganizationID");
    private static final QName _IncidentSaveInfoViolationDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ViolationDescription");
    private static final QName _IncidentSaveInfoViolationNatureID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ViolationNatureID");
    private static final QName _IncidentSaveInfoViolationTheftMethodID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ViolationTheftMethodID");
    private static final QName _IncidentSaveInfoViolationTypeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ViolationTypeID");
    private static final QName _IncidentTemplateSaveDataTemplate_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Template");
    private static final QName _ClaimSaveDataResource_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "Resource");
    private static final QName _ClaimSaveDataType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "Type");
    private static final QName _WorkScheduleSlimSaveDataDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "Description");
    private static final QName _WorkScheduleSlimSaveDataName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "Name");
    private static final QName _DayTypeSaveDataConvention_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "Convention");
    private static final QName _DayTypeSaveDataDigitalConvention_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "DigitalConvention");
    private static final QName _DayTypeSaveDataRowColor_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "RowColor");
    private static final QName _AcsConfiguratorSaveDataDriverLicensePhoto_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "DriverLicensePhoto");
    private static final QName _AcsConfiguratorSaveDataEmployeeTabs_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "EmployeeTabs");
    private static final QName _AcsConfiguratorSaveDataForeignPassportPhoto_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "ForeignPassportPhoto");
    private static final QName _AcsConfiguratorSaveDataPassportPhoto_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "PassportPhoto");
    private static final QName _AcsConfiguratorSaveDataUseDefaultFIODocumentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "UseDefaultFIODocumentType");
    private static final QName _WorkplaceModuleSaveDataComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "Comment");
    private static final QName _WorkplaceModuleSaveDataName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "Name");
    private static final QName _WorkplaceInfoModules_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", "Modules");
    private static final QName _LChangedCustomizableDaysRows_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "Rows");
    private static final QName _LChangedKeysKeys_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", "Keys");
    private static final QName _RezervedHotKeysModules_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.HotKey", "Modules");
    private static final QName _PhotoOrderName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Photo", "Name");
    private static final QName _ReactionRecordVideoActionSaveDataCameraDriverId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "CameraDriverId");
    private static final QName _ReactionExecuteProgramActionSaveDataArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "Args");
    private static final QName _ReactionExecuteProgramActionSaveDataFilePath_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "FilePath");
    private static final QName _ReactionExecuteProgramActionSaveDataWorkingDir_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "WorkingDir");
    private static final QName _ReactionSendEmailActionSaveDataCustomText_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "CustomText");
    private static final QName _ReactionSendEmailActionSaveDataEmailDistributionAddressId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "EmailDistributionAddressId");
    private static final QName _ReactionSendEmailActionSaveDataNumbersToSendEmailForEmployeesFromEvents_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "NumbersToSendEmailForEmployeesFromEvents");
    private static final QName _ReactionSendEmailActionSaveDataNumbersToSendEmailForEmployeesFromList_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "NumbersToSendEmailForEmployeesFromList");
    private static final QName _ReactionSendSMSActionSaveDataGsmModemDriverId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "GsmModemDriverId");
    private static final QName _ReactionSendSMSActionSaveDataNumbersToSendSMSForEmployeesFromEvents_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "NumbersToSendSMSForEmployeesFromEvents");
    private static final QName _ReactionSendSMSActionSaveDataNumbersToSendSMSForEmployeesFromList_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "NumbersToSendSMSForEmployeesFromList");
    private static final QName _ReactionSaveDataDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "Description");
    private static final QName _UserPassEditorDataId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", "Id");
    private static final QName _UserPassFullSaveDataBackgroindImage_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", "BackgroindImage");
    private static final QName _UserPassFullSaveDataBackgroundColor_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", "BackgroundColor");
    private static final QName _POBRelationKeyKeeperRBDriverID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PostOffice", "KeyKeeperRBDriverID");
    private static final QName _POBRelationPOBCellDriverID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PostOffice", "POBCellDriverID");
    private static final QName _POBRelationPin_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PostOffice", "Pin");
    private static final QName _ISSRecognitionSaveDataAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "Address");
    private static final QName _ISSIIDKSlimInfoSlaves_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", "Slaves");
    private static final QName _WorkZonesAccessPointSlimInfoAcsAccessPointDriverInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "AcsAccessPointDriverInfo");
    private static final QName _ReactionEventsFromDevicesSaveDataScheduleId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "ScheduleId");
    private static final QName _LEmployeePositionsDataUserPositions_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", "UserPositions");
    private static final QName _LEmployeePositionInfoCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", "Code");
    private static final QName _LEmployeePositionInfoComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", "Comment");
    private static final QName _CardTypesInfoDataCardTypes_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", "CardTypes");
    private static final QName _ViolatorFilterDateOfBirth_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "DateOfBirth");
    private static final QName _ViolatorFilterTableNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "TableNumber");
    private static final QName _IncidentElementFullInfoBranchName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "BranchName");
    private static final QName _IncidentElementFullInfoEmployeeFullName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "EmployeeFullName");
    private static final QName _IncidentElementFullInfoLocationClarificationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "LocationClarificationName");
    private static final QName _IncidentElementFullInfoLocationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "LocationName");
    private static final QName _IncidentElementFullInfoMembers_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Members");
    private static final QName _IncidentElementFullInfoSecurityGroupName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "SecurityGroupName");
    private static final QName _IncidentElementFullInfoSignificanceName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "SignificanceName");
    private static final QName _IncidentElementFullInfoTangibles_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Tangibles");
    private static final QName _IncidentElementFullInfoVehicle_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Vehicle");
    private static final QName _IncidentElementFullInfoVehicleOrganizationName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "VehicleOrganizationName");
    private static final QName _IncidentElementFullInfoViolationNatureName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ViolationNatureName");
    private static final QName _IncidentElementFullInfoViolationTheftMethodName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ViolationTheftMethodName");
    private static final QName _IncidentElementFullInfoViolationTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "ViolationTypeName");
    private static final QName _IncidentElementFullInfoViolators_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Violators");
    private static final QName _IncidentsInfoDataIncidents_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Incidents");
    private static final QName _IncidentsFilterUser_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "User");
    private static final QName _BranchInfoComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Branch", "Comment");
    private static final QName _BranchInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Branch", "Name");
    private static final QName _BranchDataBranches_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Branch", "Branches");
    private static final QName _DictionaryElementsInfoDataElements_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", "Elements");
    private static final QName _LUserGroupsDataUserGroups_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "UserGroups");
    private static final QName _LUserGroupDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "Description");
    private static final QName _LUserGroupName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "Name");
    private static final QName _LUsersDataUsers_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "Users");
    private static final QName _LUserFullName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "FullName");
    private static final QName _LUserLogin_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", "Login");
    private static final QName _LogDataMessages_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", "Messages");
    private static final QName _NotificationStateError_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CommandNotification", "Error");
    private static final QName _NotificationStateNotifyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CommandNotification", "NotifyName");
    private static final QName _NotificationStateState_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CommandNotification", "State");
    private static final QName _NotificationStateValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CommandNotification", "Value");
    private static final QName _ReactionRecordVideoActionSlimInfoCommonData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "CommonData");
    private static final QName _ReactionFullInfoActions_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "Actions");
    private static final QName _ReactionFullInfoEvents_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", "Events");
    private static final QName _UserPassFullDataUserPassEditors_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", "UserPassEditors");
    private static final QName _ScreenLayoutInfoRootCell_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", "RootCell");
    private static final QName _UidKeyInfoICCID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "ICCID");
    private static final QName _UidKeyInfoKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "Key");
    private static final QName _UidKeyInfoUid_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", "Uid");
    private static final QName _WorkSchedulesDataWorkSchedulesSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkSchedulesSlimInfo");
    private static final QName _WorkZonesDataWorkZonesSlimInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", "WorkZonesSlimInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserPassEditorSaveData }
     * 
     */
    public UserPassEditorSaveData createUserPassEditorSaveData() {
        return new UserPassEditorSaveData();
    }

    /**
     * Create an instance of {@link IncidentTemplateSaveData }
     * 
     */
    public IncidentTemplateSaveData createIncidentTemplateSaveData() {
        return new IncidentTemplateSaveData();
    }

    /**
     * Create an instance of {@link ArrayOfLogMsgSubType }
     * 
     */
    public ArrayOfLogMsgSubType createArrayOfLogMsgSubType() {
        return new ArrayOfLogMsgSubType();
    }

    /**
     * Create an instance of {@link ArrayOfBranchInfo }
     * 
     */
    public ArrayOfBranchInfo createArrayOfBranchInfo() {
        return new ArrayOfBranchInfo();
    }

    /**
     * Create an instance of {@link ArrayOfReportSlimInfo }
     * 
     */
    public ArrayOfReportSlimInfo createArrayOfReportSlimInfo() {
        return new ArrayOfReportSlimInfo();
    }

    /**
     * Create an instance of {@link ReactionEventsFromDevicesSlimInfo }
     * 
     */
    public ReactionEventsFromDevicesSlimInfo createReactionEventsFromDevicesSlimInfo() {
        return new ReactionEventsFromDevicesSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfPhotoBankShort }
     * 
     */
    public ArrayOfPhotoBankShort createArrayOfPhotoBankShort() {
        return new ArrayOfPhotoBankShort();
    }

    /**
     * Create an instance of {@link ArrayOfWorkTimetableSlimInfo }
     * 
     */
    public ArrayOfWorkTimetableSlimInfo createArrayOfWorkTimetableSlimInfo() {
        return new ArrayOfWorkTimetableSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfDayTypeSlimInfo }
     * 
     */
    public ArrayOfDayTypeSlimInfo createArrayOfDayTypeSlimInfo() {
        return new ArrayOfDayTypeSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfWorkScheduleSlimInfo }
     * 
     */
    public ArrayOfWorkScheduleSlimInfo createArrayOfWorkScheduleSlimInfo() {
        return new ArrayOfWorkScheduleSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfWorkZoneSlimInfo }
     * 
     */
    public ArrayOfWorkZoneSlimInfo createArrayOfWorkZoneSlimInfo() {
        return new ArrayOfWorkZoneSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfWorkZonesAccessPointSlimInfo }
     * 
     */
    public ArrayOfWorkZonesAccessPointSlimInfo createArrayOfWorkZonesAccessPointSlimInfo() {
        return new ArrayOfWorkZonesAccessPointSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeePositionSlimInfo }
     * 
     */
    public ArrayOfEmployeePositionSlimInfo createArrayOfEmployeePositionSlimInfo() {
        return new ArrayOfEmployeePositionSlimInfo();
    }

    /**
     * Create an instance of {@link WorkZonesData }
     * 
     */
    public WorkZonesData createWorkZonesData() {
        return new WorkZonesData();
    }

    /**
     * Create an instance of {@link WorkSchedulesData }
     * 
     */
    public WorkSchedulesData createWorkSchedulesData() {
        return new WorkSchedulesData();
    }

    /**
     * Create an instance of {@link ArrayOfWorkplaceInfo }
     * 
     */
    public ArrayOfWorkplaceInfo createArrayOfWorkplaceInfo() {
        return new ArrayOfWorkplaceInfo();
    }

    /**
     * Create an instance of {@link ArrayOfISSIIDKSlimInfo }
     * 
     */
    public ArrayOfISSIIDKSlimInfo createArrayOfISSIIDKSlimInfo() {
        return new ArrayOfISSIIDKSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfISSRecognitionSlimInfo }
     * 
     */
    public ArrayOfISSRecognitionSlimInfo createArrayOfISSRecognitionSlimInfo() {
        return new ArrayOfISSRecognitionSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfISSDriverSlimInfo }
     * 
     */
    public ArrayOfISSDriverSlimInfo createArrayOfISSDriverSlimInfo() {
        return new ArrayOfISSDriverSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfISSSlaveSlimInfo }
     * 
     */
    public ArrayOfISSSlaveSlimInfo createArrayOfISSSlaveSlimInfo() {
        return new ArrayOfISSSlaveSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfISSDriverEventPlaybackSlimInfo }
     * 
     */
    public ArrayOfISSDriverEventPlaybackSlimInfo createArrayOfISSDriverEventPlaybackSlimInfo() {
        return new ArrayOfISSDriverEventPlaybackSlimInfo();
    }

    /**
     * Create an instance of {@link AcsConfiguratorInfo }
     * 
     */
    public AcsConfiguratorInfo createAcsConfiguratorInfo() {
        return new AcsConfiguratorInfo();
    }

    /**
     * Create an instance of {@link ArrayOfUidKeyInfo }
     * 
     */
    public ArrayOfUidKeyInfo createArrayOfUidKeyInfo() {
        return new ArrayOfUidKeyInfo();
    }

    /**
     * Create an instance of {@link UidKeyInfo }
     * 
     */
    public UidKeyInfo createUidKeyInfo() {
        return new UidKeyInfo();
    }

    /**
     * Create an instance of {@link ArrayOfMifareProfileInfo }
     * 
     */
    public ArrayOfMifareProfileInfo createArrayOfMifareProfileInfo() {
        return new ArrayOfMifareProfileInfo();
    }

    /**
     * Create an instance of {@link MifareProfileFullInfo }
     * 
     */
    public MifareProfileFullInfo createMifareProfileFullInfo() {
        return new MifareProfileFullInfo();
    }

    /**
     * Create an instance of {@link ScreenLayoutInfo }
     * 
     */
    public ScreenLayoutInfo createScreenLayoutInfo() {
        return new ScreenLayoutInfo();
    }

    /**
     * Create an instance of {@link ArrayOfIvideonCameraDriverInfo }
     * 
     */
    public ArrayOfIvideonCameraDriverInfo createArrayOfIvideonCameraDriverInfo() {
        return new ArrayOfIvideonCameraDriverInfo();
    }

    /**
     * Create an instance of {@link ArrayOfEmailAddressInfo }
     * 
     */
    public ArrayOfEmailAddressInfo createArrayOfEmailAddressInfo() {
        return new ArrayOfEmailAddressInfo();
    }

    /**
     * Create an instance of {@link ArrayOfPhoneNumberInfo }
     * 
     */
    public ArrayOfPhoneNumberInfo createArrayOfPhoneNumberInfo() {
        return new ArrayOfPhoneNumberInfo();
    }

    /**
     * Create an instance of {@link ArrayOfEmailDistributionAddressInfo }
     * 
     */
    public ArrayOfEmailDistributionAddressInfo createArrayOfEmailDistributionAddressInfo() {
        return new ArrayOfEmailDistributionAddressInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAdditionalFieldBase }
     * 
     */
    public ArrayOfAdditionalFieldBase createArrayOfAdditionalFieldBase() {
        return new ArrayOfAdditionalFieldBase();
    }

    /**
     * Create an instance of {@link ArrayOfAdditionalFieldValue }
     * 
     */
    public ArrayOfAdditionalFieldValue createArrayOfAdditionalFieldValue() {
        return new ArrayOfAdditionalFieldValue();
    }

    /**
     * Create an instance of {@link ArrayOfOwnerAdditionalFieldsValue }
     * 
     */
    public ArrayOfOwnerAdditionalFieldsValue createArrayOfOwnerAdditionalFieldsValue() {
        return new ArrayOfOwnerAdditionalFieldsValue();
    }

    /**
     * Create an instance of {@link ArrayOfPhotoOrder }
     * 
     */
    public ArrayOfPhotoOrder createArrayOfPhotoOrder() {
        return new ArrayOfPhotoOrder();
    }

    /**
     * Create an instance of {@link ArrayOfMifareProfileTagsData }
     * 
     */
    public ArrayOfMifareProfileTagsData createArrayOfMifareProfileTagsData() {
        return new ArrayOfMifareProfileTagsData();
    }

    /**
     * Create an instance of {@link ArrayOfReportTagsData }
     * 
     */
    public ArrayOfReportTagsData createArrayOfReportTagsData() {
        return new ArrayOfReportTagsData();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeeGroupTagsData }
     * 
     */
    public ArrayOfEmployeeGroupTagsData createArrayOfEmployeeGroupTagsData() {
        return new ArrayOfEmployeeGroupTagsData();
    }

    /**
     * Create an instance of {@link ArrayOfAccessLevelTagsData }
     * 
     */
    public ArrayOfAccessLevelTagsData createArrayOfAccessLevelTagsData() {
        return new ArrayOfAccessLevelTagsData();
    }

    /**
     * Create an instance of {@link ArrayOfBoxAccessLevelTagsData }
     * 
     */
    public ArrayOfBoxAccessLevelTagsData createArrayOfBoxAccessLevelTagsData() {
        return new ArrayOfBoxAccessLevelTagsData();
    }

    /**
     * Create an instance of {@link ArrayOfResourceTagsData }
     * 
     */
    public ArrayOfResourceTagsData createArrayOfResourceTagsData() {
        return new ArrayOfResourceTagsData();
    }

    /**
     * Create an instance of {@link ArrayOfResourceFilterTagsData }
     * 
     */
    public ArrayOfResourceFilterTagsData createArrayOfResourceFilterTagsData() {
        return new ArrayOfResourceFilterTagsData();
    }

    /**
     * Create an instance of {@link ArrayOfTagFullInfo }
     * 
     */
    public ArrayOfTagFullInfo createArrayOfTagFullInfo() {
        return new ArrayOfTagFullInfo();
    }

    /**
     * Create an instance of {@link ArrayOfFilterTagFullInfo }
     * 
     */
    public ArrayOfFilterTagFullInfo createArrayOfFilterTagFullInfo() {
        return new ArrayOfFilterTagFullInfo();
    }

    /**
     * Create an instance of {@link ArrayOfFolderInfo }
     * 
     */
    public ArrayOfFolderInfo createArrayOfFolderInfo() {
        return new ArrayOfFolderInfo();
    }

    /**
     * Create an instance of {@link ArrayOfFolderInfoWithAccessLevel }
     * 
     */
    public ArrayOfFolderInfoWithAccessLevel createArrayOfFolderInfoWithAccessLevel() {
        return new ArrayOfFolderInfoWithAccessLevel();
    }

    /**
     * Create an instance of {@link FolderInfo }
     * 
     */
    public FolderInfo createFolderInfo() {
        return new FolderInfo();
    }

    /**
     * Create an instance of {@link ArrayOfFavoriteFolderInfo }
     * 
     */
    public ArrayOfFavoriteFolderInfo createArrayOfFavoriteFolderInfo() {
        return new ArrayOfFavoriteFolderInfo();
    }

    /**
     * Create an instance of {@link ArrayOfFavoriteFolderInfoWithEmployeeGroup }
     * 
     */
    public ArrayOfFavoriteFolderInfoWithEmployeeGroup createArrayOfFavoriteFolderInfoWithEmployeeGroup() {
        return new ArrayOfFavoriteFolderInfoWithEmployeeGroup();
    }

    /**
     * Create an instance of {@link FavoriteFolderInfo }
     * 
     */
    public FavoriteFolderInfo createFavoriteFolderInfo() {
        return new FavoriteFolderInfo();
    }

    /**
     * Create an instance of {@link ArrayOfUserPassSlimData }
     * 
     */
    public ArrayOfUserPassSlimData createArrayOfUserPassSlimData() {
        return new ArrayOfUserPassSlimData();
    }

    /**
     * Create an instance of {@link UserPassFullData }
     * 
     */
    public UserPassFullData createUserPassFullData() {
        return new UserPassFullData();
    }

    /**
     * Create an instance of {@link ArrayOfReactionSlimInfo }
     * 
     */
    public ArrayOfReactionSlimInfo createArrayOfReactionSlimInfo() {
        return new ArrayOfReactionSlimInfo();
    }

    /**
     * Create an instance of {@link ReactionFullInfo }
     * 
     */
    public ReactionFullInfo createReactionFullInfo() {
        return new ReactionFullInfo();
    }

    /**
     * Create an instance of {@link ReactionSendSMSActionSlimInfo }
     * 
     */
    public ReactionSendSMSActionSlimInfo createReactionSendSMSActionSlimInfo() {
        return new ReactionSendSMSActionSlimInfo();
    }

    /**
     * Create an instance of {@link ReactionSendEmailActionSlimInfo }
     * 
     */
    public ReactionSendEmailActionSlimInfo createReactionSendEmailActionSlimInfo() {
        return new ReactionSendEmailActionSlimInfo();
    }

    /**
     * Create an instance of {@link ReactionExecuteProgramActionSlimInfo }
     * 
     */
    public ReactionExecuteProgramActionSlimInfo createReactionExecuteProgramActionSlimInfo() {
        return new ReactionExecuteProgramActionSlimInfo();
    }

    /**
     * Create an instance of {@link ReactionRecordVideoActionSlimInfo }
     * 
     */
    public ReactionRecordVideoActionSlimInfo createReactionRecordVideoActionSlimInfo() {
        return new ReactionRecordVideoActionSlimInfo();
    }

    /**
     * Create an instance of {@link NotificationState }
     * 
     */
    public NotificationState createNotificationState() {
        return new NotificationState();
    }

    /**
     * Create an instance of {@link ArrayOfLogMessageTypeSlimInfo }
     * 
     */
    public ArrayOfLogMessageTypeSlimInfo createArrayOfLogMessageTypeSlimInfo() {
        return new ArrayOfLogMessageTypeSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfLogMessageSubtypeSlimInfo }
     * 
     */
    public ArrayOfLogMessageSubtypeSlimInfo createArrayOfLogMessageSubtypeSlimInfo() {
        return new ArrayOfLogMessageSubtypeSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfLogMsgType }
     * 
     */
    public ArrayOfLogMsgType createArrayOfLogMsgType() {
        return new ArrayOfLogMsgType();
    }

    /**
     * Create an instance of {@link LogData }
     * 
     */
    public LogData createLogData() {
        return new LogData();
    }

    /**
     * Create an instance of {@link ArrayOfPOBRelation }
     * 
     */
    public ArrayOfPOBRelation createArrayOfPOBRelation() {
        return new ArrayOfPOBRelation();
    }

    /**
     * Create an instance of {@link LUser }
     * 
     */
    public LUser createLUser() {
        return new LUser();
    }

    /**
     * Create an instance of {@link LUsersData }
     * 
     */
    public LUsersData createLUsersData() {
        return new LUsersData();
    }

    /**
     * Create an instance of {@link LUserGroup }
     * 
     */
    public LUserGroup createLUserGroup() {
        return new LUserGroup();
    }

    /**
     * Create an instance of {@link LUserGroupsData }
     * 
     */
    public LUserGroupsData createLUserGroupsData() {
        return new LUserGroupsData();
    }

    /**
     * Create an instance of {@link ClaimInfo }
     * 
     */
    public ClaimInfo createClaimInfo() {
        return new ClaimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfClaimInfo }
     * 
     */
    public ArrayOfClaimInfo createArrayOfClaimInfo() {
        return new ArrayOfClaimInfo();
    }

    /**
     * Create an instance of {@link DictionaryElementInfo }
     * 
     */
    public DictionaryElementInfo createDictionaryElementInfo() {
        return new DictionaryElementInfo();
    }

    /**
     * Create an instance of {@link DictionaryElementsInfoData }
     * 
     */
    public DictionaryElementsInfoData createDictionaryElementsInfoData() {
        return new DictionaryElementsInfoData();
    }

    /**
     * Create an instance of {@link DictionaryElementsFilter }
     * 
     */
    public DictionaryElementsFilter createDictionaryElementsFilter() {
        return new DictionaryElementsFilter();
    }

    /**
     * Create an instance of {@link CardTypeInfo }
     * 
     */
    public CardTypeInfo createCardTypeInfo() {
        return new CardTypeInfo();
    }

    /**
     * Create an instance of {@link BranchData }
     * 
     */
    public BranchData createBranchData() {
        return new BranchData();
    }

    /**
     * Create an instance of {@link BranchInfo }
     * 
     */
    public BranchInfo createBranchInfo() {
        return new BranchInfo();
    }

    /**
     * Create an instance of {@link IncidentsFilter }
     * 
     */
    public IncidentsFilter createIncidentsFilter() {
        return new IncidentsFilter();
    }

    /**
     * Create an instance of {@link IncidentsInfoData }
     * 
     */
    public IncidentsInfoData createIncidentsInfoData() {
        return new IncidentsInfoData();
    }

    /**
     * Create an instance of {@link IncidentElementFullInfo }
     * 
     */
    public IncidentElementFullInfo createIncidentElementFullInfo() {
        return new IncidentElementFullInfo();
    }

    /**
     * Create an instance of {@link ViolatorFilter }
     * 
     */
    public ViolatorFilter createViolatorFilter() {
        return new ViolatorFilter();
    }

    /**
     * Create an instance of {@link ArrayOfFirebirdIncidentEventsResult }
     * 
     */
    public ArrayOfFirebirdIncidentEventsResult createArrayOfFirebirdIncidentEventsResult() {
        return new ArrayOfFirebirdIncidentEventsResult();
    }

    /**
     * Create an instance of {@link ArrayOfViolation }
     * 
     */
    public ArrayOfViolation createArrayOfViolation() {
        return new ArrayOfViolation();
    }

    /**
     * Create an instance of {@link ArrayOfIncidentTemplateInfo }
     * 
     */
    public ArrayOfIncidentTemplateInfo createArrayOfIncidentTemplateInfo() {
        return new ArrayOfIncidentTemplateInfo();
    }

    /**
     * Create an instance of {@link ArrayOfDictionaryElementInfo }
     * 
     */
    public ArrayOfDictionaryElementInfo createArrayOfDictionaryElementInfo() {
        return new ArrayOfDictionaryElementInfo();
    }

    /**
     * Create an instance of {@link ArrayOfEmployee2OrganizationAssignmentFull }
     * 
     */
    public ArrayOfEmployee2OrganizationAssignmentFull createArrayOfEmployee2OrganizationAssignmentFull() {
        return new ArrayOfEmployee2OrganizationAssignmentFull();
    }

    /**
     * Create an instance of {@link CardTypesInfoData }
     * 
     */
    public CardTypesInfoData createCardTypesInfoData() {
        return new CardTypesInfoData();
    }

    /**
     * Create an instance of {@link LEmployeePositionInfo }
     * 
     */
    public LEmployeePositionInfo createLEmployeePositionInfo() {
        return new LEmployeePositionInfo();
    }

    /**
     * Create an instance of {@link LEmployeePositionsData }
     * 
     */
    public LEmployeePositionsData createLEmployeePositionsData() {
        return new LEmployeePositionsData();
    }

    /**
     * Create an instance of {@link ReactionEventSaveData }
     * 
     */
    public ReactionEventSaveData createReactionEventSaveData() {
        return new ReactionEventSaveData();
    }

    /**
     * Create an instance of {@link ReactionEventsFromDevicesSaveData }
     * 
     */
    public ReactionEventsFromDevicesSaveData createReactionEventsFromDevicesSaveData() {
        return new ReactionEventsFromDevicesSaveData();
    }

    /**
     * Create an instance of {@link WorkZoneSlimSaveData }
     * 
     */
    public WorkZoneSlimSaveData createWorkZoneSlimSaveData() {
        return new WorkZoneSlimSaveData();
    }

    /**
     * Create an instance of {@link WorkZoneSlimInfo }
     * 
     */
    public WorkZoneSlimInfo createWorkZoneSlimInfo() {
        return new WorkZoneSlimInfo();
    }

    /**
     * Create an instance of {@link WorkZonesAccessPointSaveData }
     * 
     */
    public WorkZonesAccessPointSaveData createWorkZonesAccessPointSaveData() {
        return new WorkZonesAccessPointSaveData();
    }

    /**
     * Create an instance of {@link WorkZonesAccessPointSlimInfo }
     * 
     */
    public WorkZonesAccessPointSlimInfo createWorkZonesAccessPointSlimInfo() {
        return new WorkZonesAccessPointSlimInfo();
    }

    /**
     * Create an instance of {@link ISSIIDKSaveData }
     * 
     */
    public ISSIIDKSaveData createISSIIDKSaveData() {
        return new ISSIIDKSaveData();
    }

    /**
     * Create an instance of {@link ISSRecognitionSaveData }
     * 
     */
    public ISSRecognitionSaveData createISSRecognitionSaveData() {
        return new ISSRecognitionSaveData();
    }

    /**
     * Create an instance of {@link ISSDriverSaveData }
     * 
     */
    public ISSDriverSaveData createISSDriverSaveData() {
        return new ISSDriverSaveData();
    }

    /**
     * Create an instance of {@link ISSIIDKSlimInfo }
     * 
     */
    public ISSIIDKSlimInfo createISSIIDKSlimInfo() {
        return new ISSIIDKSlimInfo();
    }

    /**
     * Create an instance of {@link ISSRecognitionSlimInfo }
     * 
     */
    public ISSRecognitionSlimInfo createISSRecognitionSlimInfo() {
        return new ISSRecognitionSlimInfo();
    }

    /**
     * Create an instance of {@link ISSDriverSlimInfo }
     * 
     */
    public ISSDriverSlimInfo createISSDriverSlimInfo() {
        return new ISSDriverSlimInfo();
    }

    /**
     * Create an instance of {@link ISSDriverEventPlaybackSaveData }
     * 
     */
    public ISSDriverEventPlaybackSaveData createISSDriverEventPlaybackSaveData() {
        return new ISSDriverEventPlaybackSaveData();
    }

    /**
     * Create an instance of {@link ISSDriverEventPlaybackSlimInfo }
     * 
     */
    public ISSDriverEventPlaybackSlimInfo createISSDriverEventPlaybackSlimInfo() {
        return new ISSDriverEventPlaybackSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfScreenCellSaveData }
     * 
     */
    public ArrayOfScreenCellSaveData createArrayOfScreenCellSaveData() {
        return new ArrayOfScreenCellSaveData();
    }

    /**
     * Create an instance of {@link ArrayOfScreenCellInfo }
     * 
     */
    public ArrayOfScreenCellInfo createArrayOfScreenCellInfo() {
        return new ArrayOfScreenCellInfo();
    }

    /**
     * Create an instance of {@link ScreenLayoutSaveData }
     * 
     */
    public ScreenLayoutSaveData createScreenLayoutSaveData() {
        return new ScreenLayoutSaveData();
    }

    /**
     * Create an instance of {@link EmailAddressSaveData }
     * 
     */
    public EmailAddressSaveData createEmailAddressSaveData() {
        return new EmailAddressSaveData();
    }

    /**
     * Create an instance of {@link PhoneNumberSaveData }
     * 
     */
    public PhoneNumberSaveData createPhoneNumberSaveData() {
        return new PhoneNumberSaveData();
    }

    /**
     * Create an instance of {@link EmailDistributionAddressSaveData }
     * 
     */
    public EmailDistributionAddressSaveData createEmailDistributionAddressSaveData() {
        return new EmailDistributionAddressSaveData();
    }

    /**
     * Create an instance of {@link POBRelation }
     * 
     */
    public POBRelation createPOBRelation() {
        return new POBRelation();
    }

    /**
     * Create an instance of {@link FolderSaveData }
     * 
     */
    public FolderSaveData createFolderSaveData() {
        return new FolderSaveData();
    }

    /**
     * Create an instance of {@link FavoriteFolderSaveData }
     * 
     */
    public FavoriteFolderSaveData createFavoriteFolderSaveData() {
        return new FavoriteFolderSaveData();
    }

    /**
     * Create an instance of {@link TagSaveData }
     * 
     */
    public TagSaveData createTagSaveData() {
        return new TagSaveData();
    }

    /**
     * Create an instance of {@link FilterTagSaveData }
     * 
     */
    public FilterTagSaveData createFilterTagSaveData() {
        return new FilterTagSaveData();
    }

    /**
     * Create an instance of {@link UserPassSlimSaveData }
     * 
     */
    public UserPassSlimSaveData createUserPassSlimSaveData() {
        return new UserPassSlimSaveData();
    }

    /**
     * Create an instance of {@link UserPassFullSaveData }
     * 
     */
    public UserPassFullSaveData createUserPassFullSaveData() {
        return new UserPassFullSaveData();
    }

    /**
     * Create an instance of {@link UserPassEditorData }
     * 
     */
    public UserPassEditorData createUserPassEditorData() {
        return new UserPassEditorData();
    }

    /**
     * Create an instance of {@link ReactionSaveData }
     * 
     */
    public ReactionSaveData createReactionSaveData() {
        return new ReactionSaveData();
    }

    /**
     * Create an instance of {@link ReactionActionSaveData }
     * 
     */
    public ReactionActionSaveData createReactionActionSaveData() {
        return new ReactionActionSaveData();
    }

    /**
     * Create an instance of {@link ReactionSendSMSActionSaveData }
     * 
     */
    public ReactionSendSMSActionSaveData createReactionSendSMSActionSaveData() {
        return new ReactionSendSMSActionSaveData();
    }

    /**
     * Create an instance of {@link ReactionSendEmailActionSaveData }
     * 
     */
    public ReactionSendEmailActionSaveData createReactionSendEmailActionSaveData() {
        return new ReactionSendEmailActionSaveData();
    }

    /**
     * Create an instance of {@link ReactionExecuteProgramActionSaveData }
     * 
     */
    public ReactionExecuteProgramActionSaveData createReactionExecuteProgramActionSaveData() {
        return new ReactionExecuteProgramActionSaveData();
    }

    /**
     * Create an instance of {@link ReactionRecordVideoActionSaveData }
     * 
     */
    public ReactionRecordVideoActionSaveData createReactionRecordVideoActionSaveData() {
        return new ReactionRecordVideoActionSaveData();
    }

    /**
     * Create an instance of {@link ReportSaveData }
     * 
     */
    public ReportSaveData createReportSaveData() {
        return new ReportSaveData();
    }

    /**
     * Create an instance of {@link PhotoOrder }
     * 
     */
    public PhotoOrder createPhotoOrder() {
        return new PhotoOrder();
    }

    /**
     * Create an instance of {@link ArrayOfCardTypeBiometricPermission }
     * 
     */
    public ArrayOfCardTypeBiometricPermission createArrayOfCardTypeBiometricPermission() {
        return new ArrayOfCardTypeBiometricPermission();
    }

    /**
     * Create an instance of {@link RezervedHotKeys }
     * 
     */
    public RezervedHotKeys createRezervedHotKeys() {
        return new RezervedHotKeys();
    }

    /**
     * Create an instance of {@link LChangedKeys }
     * 
     */
    public LChangedKeys createLChangedKeys() {
        return new LChangedKeys();
    }

    /**
     * Create an instance of {@link LChangedCustomizableDays }
     * 
     */
    public LChangedCustomizableDays createLChangedCustomizableDays() {
        return new LChangedCustomizableDays();
    }

    /**
     * Create an instance of {@link WorkplaceSaveData }
     * 
     */
    public WorkplaceSaveData createWorkplaceSaveData() {
        return new WorkplaceSaveData();
    }

    /**
     * Create an instance of {@link WorkplaceInfo }
     * 
     */
    public WorkplaceInfo createWorkplaceInfo() {
        return new WorkplaceInfo();
    }

    /**
     * Create an instance of {@link WorkplaceModuleSaveData }
     * 
     */
    public WorkplaceModuleSaveData createWorkplaceModuleSaveData() {
        return new WorkplaceModuleSaveData();
    }

    /**
     * Create an instance of {@link WorkplaceModuleInfo }
     * 
     */
    public WorkplaceModuleInfo createWorkplaceModuleInfo() {
        return new WorkplaceModuleInfo();
    }

    /**
     * Create an instance of {@link AcsConfiguratorSaveData }
     * 
     */
    public AcsConfiguratorSaveData createAcsConfiguratorSaveData() {
        return new AcsConfiguratorSaveData();
    }

    /**
     * Create an instance of {@link DayTypeSaveData }
     * 
     */
    public DayTypeSaveData createDayTypeSaveData() {
        return new DayTypeSaveData();
    }

    /**
     * Create an instance of {@link DayTypeSlimInfo }
     * 
     */
    public DayTypeSlimInfo createDayTypeSlimInfo() {
        return new DayTypeSlimInfo();
    }

    /**
     * Create an instance of {@link WorkScheduleSlimSaveData }
     * 
     */
    public WorkScheduleSlimSaveData createWorkScheduleSlimSaveData() {
        return new WorkScheduleSlimSaveData();
    }

    /**
     * Create an instance of {@link WorkScheduleSlimInfo }
     * 
     */
    public WorkScheduleSlimInfo createWorkScheduleSlimInfo() {
        return new WorkScheduleSlimInfo();
    }

    /**
     * Create an instance of {@link ClaimSaveData }
     * 
     */
    public ClaimSaveData createClaimSaveData() {
        return new ClaimSaveData();
    }

    /**
     * Create an instance of {@link IncidentTemplateInfo }
     * 
     */
    public IncidentTemplateInfo createIncidentTemplateInfo() {
        return new IncidentTemplateInfo();
    }

    /**
     * Create an instance of {@link IncidentSaveInfo }
     * 
     */
    public IncidentSaveInfo createIncidentSaveInfo() {
        return new IncidentSaveInfo();
    }

    /**
     * Create an instance of {@link DictionaryElementSaveInfo }
     * 
     */
    public DictionaryElementSaveInfo createDictionaryElementSaveInfo() {
        return new DictionaryElementSaveInfo();
    }

    /**
     * Create an instance of {@link ArrayOfEmployee2OrganizationAssignment }
     * 
     */
    public ArrayOfEmployee2OrganizationAssignment createArrayOfEmployee2OrganizationAssignment() {
        return new ArrayOfEmployee2OrganizationAssignment();
    }

    /**
     * Create an instance of {@link MifareProfileSaveData }
     * 
     */
    public MifareProfileSaveData createMifareProfileSaveData() {
        return new MifareProfileSaveData();
    }

    /**
     * Create an instance of {@link MifareProfileInfo }
     * 
     */
    public MifareProfileInfo createMifareProfileInfo() {
        return new MifareProfileInfo();
    }

    /**
     * Create an instance of {@link MifareProfileFullSaveData }
     * 
     */
    public MifareProfileFullSaveData createMifareProfileFullSaveData() {
        return new MifareProfileFullSaveData();
    }

    /**
     * Create an instance of {@link ListItem }
     * 
     */
    public ListItem createListItem() {
        return new ListItem();
    }

    /**
     * Create an instance of {@link ArrayOfAddDateTimeInfo }
     * 
     */
    public ArrayOfAddDateTimeInfo createArrayOfAddDateTimeInfo() {
        return new ArrayOfAddDateTimeInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAddDoubleInfo }
     * 
     */
    public ArrayOfAddDoubleInfo createArrayOfAddDoubleInfo() {
        return new ArrayOfAddDoubleInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAddIntInfo }
     * 
     */
    public ArrayOfAddIntInfo createArrayOfAddIntInfo() {
        return new ArrayOfAddIntInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAddStringInfo }
     * 
     */
    public ArrayOfAddStringInfo createArrayOfAddStringInfo() {
        return new ArrayOfAddStringInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAddColorInfo }
     * 
     */
    public ArrayOfAddColorInfo createArrayOfAddColorInfo() {
        return new ArrayOfAddColorInfo();
    }

    /**
     * Create an instance of {@link ArrayOfAddListInfo }
     * 
     */
    public ArrayOfAddListInfo createArrayOfAddListInfo() {
        return new ArrayOfAddListInfo();
    }

    /**
     * Create an instance of {@link AdditionalFieldBase }
     * 
     */
    public AdditionalFieldBase createAdditionalFieldBase() {
        return new AdditionalFieldBase();
    }

    /**
     * Create an instance of {@link LogMessageTypeSlimInfo }
     * 
     */
    public LogMessageTypeSlimInfo createLogMessageTypeSlimInfo() {
        return new LogMessageTypeSlimInfo();
    }

    /**
     * Create an instance of {@link LogMessageSubtypeSlimInfo }
     * 
     */
    public LogMessageSubtypeSlimInfo createLogMessageSubtypeSlimInfo() {
        return new LogMessageSubtypeSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfLogMessage }
     * 
     */
    public ArrayOfLogMessage createArrayOfLogMessage() {
        return new ArrayOfLogMessage();
    }

    /**
     * Create an instance of {@link LogMessage }
     * 
     */
    public LogMessage createLogMessage() {
        return new LogMessage();
    }

    /**
     * Create an instance of {@link SecurityGroupDictionaryElementSaveInfo }
     * 
     */
    public SecurityGroupDictionaryElementSaveInfo createSecurityGroupDictionaryElementSaveInfo() {
        return new SecurityGroupDictionaryElementSaveInfo();
    }

    /**
     * Create an instance of {@link OrganizationElementSaveInfo }
     * 
     */
    public OrganizationElementSaveInfo createOrganizationElementSaveInfo() {
        return new OrganizationElementSaveInfo();
    }

    /**
     * Create an instance of {@link SecurityGroupDictionaryElementInfo }
     * 
     */
    public SecurityGroupDictionaryElementInfo createSecurityGroupDictionaryElementInfo() {
        return new SecurityGroupDictionaryElementInfo();
    }

    /**
     * Create an instance of {@link OrganizationDictionaryElementInfo }
     * 
     */
    public OrganizationDictionaryElementInfo createOrganizationDictionaryElementInfo() {
        return new OrganizationDictionaryElementInfo();
    }

    /**
     * Create an instance of {@link IncidentsMegaFilter }
     * 
     */
    public IncidentsMegaFilter createIncidentsMegaFilter() {
        return new IncidentsMegaFilter();
    }

    /**
     * Create an instance of {@link ArrayOfIncidentElementFullInfo }
     * 
     */
    public ArrayOfIncidentElementFullInfo createArrayOfIncidentElementFullInfo() {
        return new ArrayOfIncidentElementFullInfo();
    }

    /**
     * Create an instance of {@link ArrayOfViolatorSaveInfo }
     * 
     */
    public ArrayOfViolatorSaveInfo createArrayOfViolatorSaveInfo() {
        return new ArrayOfViolatorSaveInfo();
    }

    /**
     * Create an instance of {@link ViolatorSaveInfo }
     * 
     */
    public ViolatorSaveInfo createViolatorSaveInfo() {
        return new ViolatorSaveInfo();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentForActionSaveInfo }
     * 
     */
    public ArrayOfDocumentForActionSaveInfo createArrayOfDocumentForActionSaveInfo() {
        return new ArrayOfDocumentForActionSaveInfo();
    }

    /**
     * Create an instance of {@link DocumentForActionSaveInfo }
     * 
     */
    public DocumentForActionSaveInfo createDocumentForActionSaveInfo() {
        return new DocumentForActionSaveInfo();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentSaveInfo }
     * 
     */
    public ArrayOfDocumentSaveInfo createArrayOfDocumentSaveInfo() {
        return new ArrayOfDocumentSaveInfo();
    }

    /**
     * Create an instance of {@link DocumentSaveInfo }
     * 
     */
    public DocumentSaveInfo createDocumentSaveInfo() {
        return new DocumentSaveInfo();
    }

    /**
     * Create an instance of {@link ArrayOfViolationSaveInfo }
     * 
     */
    public ArrayOfViolationSaveInfo createArrayOfViolationSaveInfo() {
        return new ArrayOfViolationSaveInfo();
    }

    /**
     * Create an instance of {@link ViolationSaveInfo }
     * 
     */
    public ViolationSaveInfo createViolationSaveInfo() {
        return new ViolationSaveInfo();
    }

    /**
     * Create an instance of {@link ViolationFullInfo }
     * 
     */
    public ViolationFullInfo createViolationFullInfo() {
        return new ViolationFullInfo();
    }

    /**
     * Create an instance of {@link ArrayOfTangiblesSaveInfo }
     * 
     */
    public ArrayOfTangiblesSaveInfo createArrayOfTangiblesSaveInfo() {
        return new ArrayOfTangiblesSaveInfo();
    }

    /**
     * Create an instance of {@link TangiblesSaveInfo }
     * 
     */
    public TangiblesSaveInfo createTangiblesSaveInfo() {
        return new TangiblesSaveInfo();
    }

    /**
     * Create an instance of {@link ArrayOfViolatorFullInfo }
     * 
     */
    public ArrayOfViolatorFullInfo createArrayOfViolatorFullInfo() {
        return new ArrayOfViolatorFullInfo();
    }

    /**
     * Create an instance of {@link ViolatorFullInfo }
     * 
     */
    public ViolatorFullInfo createViolatorFullInfo() {
        return new ViolatorFullInfo();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentFullInfo }
     * 
     */
    public ArrayOfDocumentFullInfo createArrayOfDocumentFullInfo() {
        return new ArrayOfDocumentFullInfo();
    }

    /**
     * Create an instance of {@link DocumentFullInfo }
     * 
     */
    public DocumentFullInfo createDocumentFullInfo() {
        return new DocumentFullInfo();
    }

    /**
     * Create an instance of {@link ArrayOfDocumentFullForActionInfo }
     * 
     */
    public ArrayOfDocumentFullForActionInfo createArrayOfDocumentFullForActionInfo() {
        return new ArrayOfDocumentFullForActionInfo();
    }

    /**
     * Create an instance of {@link DocumentFullForActionInfo }
     * 
     */
    public DocumentFullForActionInfo createDocumentFullForActionInfo() {
        return new DocumentFullForActionInfo();
    }

    /**
     * Create an instance of {@link ArrayOfViolationFullInfo }
     * 
     */
    public ArrayOfViolationFullInfo createArrayOfViolationFullInfo() {
        return new ArrayOfViolationFullInfo();
    }

    /**
     * Create an instance of {@link ArrayOfTangiblesFullInfo }
     * 
     */
    public ArrayOfTangiblesFullInfo createArrayOfTangiblesFullInfo() {
        return new ArrayOfTangiblesFullInfo();
    }

    /**
     * Create an instance of {@link TangiblesFullInfo }
     * 
     */
    public TangiblesFullInfo createTangiblesFullInfo() {
        return new TangiblesFullInfo();
    }

    /**
     * Create an instance of {@link FirebirdIncidentEventsResult }
     * 
     */
    public FirebirdIncidentEventsResult createFirebirdIncidentEventsResult() {
        return new FirebirdIncidentEventsResult();
    }

    /**
     * Create an instance of {@link Violation }
     * 
     */
    public Violation createViolation() {
        return new Violation();
    }

    /**
     * Create an instance of {@link Employee2OrganizationAssignmentFull }
     * 
     */
    public Employee2OrganizationAssignmentFull createEmployee2OrganizationAssignmentFull() {
        return new Employee2OrganizationAssignmentFull();
    }

    /**
     * Create an instance of {@link Employee2OrganizationAssignment }
     * 
     */
    public Employee2OrganizationAssignment createEmployee2OrganizationAssignment() {
        return new Employee2OrganizationAssignment();
    }

    /**
     * Create an instance of {@link FolderInfoWithAccessLevel }
     * 
     */
    public FolderInfoWithAccessLevel createFolderInfoWithAccessLevel() {
        return new FolderInfoWithAccessLevel();
    }

    /**
     * Create an instance of {@link EmployeePositionSlimInfo }
     * 
     */
    public EmployeePositionSlimInfo createEmployeePositionSlimInfo() {
        return new EmployeePositionSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfLEmployeePositionInfo }
     * 
     */
    public ArrayOfLEmployeePositionInfo createArrayOfLEmployeePositionInfo() {
        return new ArrayOfLEmployeePositionInfo();
    }

    /**
     * Create an instance of {@link WorkTimetableSlimInfo }
     * 
     */
    public WorkTimetableSlimInfo createWorkTimetableSlimInfo() {
        return new WorkTimetableSlimInfo();
    }

    /**
     * Create an instance of {@link WorkZonesAccessPointBase }
     * 
     */
    public WorkZonesAccessPointBase createWorkZonesAccessPointBase() {
        return new WorkZonesAccessPointBase();
    }

    /**
     * Create an instance of {@link ReportSlimInfo }
     * 
     */
    public ReportSlimInfo createReportSlimInfo() {
        return new ReportSlimInfo();
    }

    /**
     * Create an instance of {@link DateTimeField }
     * 
     */
    public DateTimeField createDateTimeField() {
        return new DateTimeField();
    }

    /**
     * Create an instance of {@link IntegerField }
     * 
     */
    public IntegerField createIntegerField() {
        return new IntegerField();
    }

    /**
     * Create an instance of {@link DoubleField }
     * 
     */
    public DoubleField createDoubleField() {
        return new DoubleField();
    }

    /**
     * Create an instance of {@link StringField }
     * 
     */
    public StringField createStringField() {
        return new StringField();
    }

    /**
     * Create an instance of {@link ColorField }
     * 
     */
    public ColorField createColorField() {
        return new ColorField();
    }

    /**
     * Create an instance of {@link ListField }
     * 
     */
    public ListField createListField() {
        return new ListField();
    }

    /**
     * Create an instance of {@link ArrayOfListItem }
     * 
     */
    public ArrayOfListItem createArrayOfListItem() {
        return new ArrayOfListItem();
    }

    /**
     * Create an instance of {@link AdditionalFieldValue }
     * 
     */
    public AdditionalFieldValue createAdditionalFieldValue() {
        return new AdditionalFieldValue();
    }

    /**
     * Create an instance of {@link OwnerValueBase }
     * 
     */
    public OwnerValueBase createOwnerValueBase() {
        return new OwnerValueBase();
    }

    /**
     * Create an instance of {@link OwnerDateTimeValue }
     * 
     */
    public OwnerDateTimeValue createOwnerDateTimeValue() {
        return new OwnerDateTimeValue();
    }

    /**
     * Create an instance of {@link OwnerDoubleValue }
     * 
     */
    public OwnerDoubleValue createOwnerDoubleValue() {
        return new OwnerDoubleValue();
    }

    /**
     * Create an instance of {@link OwnerIntValue }
     * 
     */
    public OwnerIntValue createOwnerIntValue() {
        return new OwnerIntValue();
    }

    /**
     * Create an instance of {@link OwnerStringValue }
     * 
     */
    public OwnerStringValue createOwnerStringValue() {
        return new OwnerStringValue();
    }

    /**
     * Create an instance of {@link OwnerColorValue }
     * 
     */
    public OwnerColorValue createOwnerColorValue() {
        return new OwnerColorValue();
    }

    /**
     * Create an instance of {@link OwnerListValue }
     * 
     */
    public OwnerListValue createOwnerListValue() {
        return new OwnerListValue();
    }

    /**
     * Create an instance of {@link OwnerAdditionalFieldsValue }
     * 
     */
    public OwnerAdditionalFieldsValue createOwnerAdditionalFieldsValue() {
        return new OwnerAdditionalFieldsValue();
    }

    /**
     * Create an instance of {@link AddDateTimeInfo }
     * 
     */
    public AddDateTimeInfo createAddDateTimeInfo() {
        return new AddDateTimeInfo();
    }

    /**
     * Create an instance of {@link AddFieldInfo }
     * 
     */
    public AddFieldInfo createAddFieldInfo() {
        return new AddFieldInfo();
    }

    /**
     * Create an instance of {@link AddDoubleInfo }
     * 
     */
    public AddDoubleInfo createAddDoubleInfo() {
        return new AddDoubleInfo();
    }

    /**
     * Create an instance of {@link AddIntInfo }
     * 
     */
    public AddIntInfo createAddIntInfo() {
        return new AddIntInfo();
    }

    /**
     * Create an instance of {@link AddStringInfo }
     * 
     */
    public AddStringInfo createAddStringInfo() {
        return new AddStringInfo();
    }

    /**
     * Create an instance of {@link AddColorInfo }
     * 
     */
    public AddColorInfo createAddColorInfo() {
        return new AddColorInfo();
    }

    /**
     * Create an instance of {@link AddListInfo }
     * 
     */
    public AddListInfo createAddListInfo() {
        return new AddListInfo();
    }

    /**
     * Create an instance of {@link ReactionEventSlimInfo }
     * 
     */
    public ReactionEventSlimInfo createReactionEventSlimInfo() {
        return new ReactionEventSlimInfo();
    }

    /**
     * Create an instance of {@link ReactionSlimInfo }
     * 
     */
    public ReactionSlimInfo createReactionSlimInfo() {
        return new ReactionSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfReactionActionSlimInfo }
     * 
     */
    public ArrayOfReactionActionSlimInfo createArrayOfReactionActionSlimInfo() {
        return new ArrayOfReactionActionSlimInfo();
    }

    /**
     * Create an instance of {@link ReactionActionSlimInfo }
     * 
     */
    public ReactionActionSlimInfo createReactionActionSlimInfo() {
        return new ReactionActionSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfReactionEventSlimInfo }
     * 
     */
    public ArrayOfReactionEventSlimInfo createArrayOfReactionEventSlimInfo() {
        return new ArrayOfReactionEventSlimInfo();
    }

    /**
     * Create an instance of {@link PhotoBankShort }
     * 
     */
    public PhotoBankShort createPhotoBankShort() {
        return new PhotoBankShort();
    }

    /**
     * Create an instance of {@link ArrayOfWorkplaceModuleInfo }
     * 
     */
    public ArrayOfWorkplaceModuleInfo createArrayOfWorkplaceModuleInfo() {
        return new ArrayOfWorkplaceModuleInfo();
    }

    /**
     * Create an instance of {@link ISSSlaveSlimInfo }
     * 
     */
    public ISSSlaveSlimInfo createISSSlaveSlimInfo() {
        return new ISSSlaveSlimInfo();
    }

    /**
     * Create an instance of {@link ISSEntityBase }
     * 
     */
    public ISSEntityBase createISSEntityBase() {
        return new ISSEntityBase();
    }

    /**
     * Create an instance of {@link ArrayOfISSDisplaySlimInfo }
     * 
     */
    public ArrayOfISSDisplaySlimInfo createArrayOfISSDisplaySlimInfo() {
        return new ArrayOfISSDisplaySlimInfo();
    }

    /**
     * Create an instance of {@link ISSDisplaySlimInfo }
     * 
     */
    public ISSDisplaySlimInfo createISSDisplaySlimInfo() {
        return new ISSDisplaySlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfISSEventViewerSlimInfo }
     * 
     */
    public ArrayOfISSEventViewerSlimInfo createArrayOfISSEventViewerSlimInfo() {
        return new ArrayOfISSEventViewerSlimInfo();
    }

    /**
     * Create an instance of {@link ISSEventViewerSlimInfo }
     * 
     */
    public ISSEventViewerSlimInfo createISSEventViewerSlimInfo() {
        return new ISSEventViewerSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfISSMonitorSlimInfo }
     * 
     */
    public ArrayOfISSMonitorSlimInfo createArrayOfISSMonitorSlimInfo() {
        return new ArrayOfISSMonitorSlimInfo();
    }

    /**
     * Create an instance of {@link ISSMonitorSlimInfo }
     * 
     */
    public ISSMonitorSlimInfo createISSMonitorSlimInfo() {
        return new ISSMonitorSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfISSCamSlimInfo }
     * 
     */
    public ArrayOfISSCamSlimInfo createArrayOfISSCamSlimInfo() {
        return new ArrayOfISSCamSlimInfo();
    }

    /**
     * Create an instance of {@link ISSCamSlimInfo }
     * 
     */
    public ISSCamSlimInfo createISSCamSlimInfo() {
        return new ISSCamSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfISSIntegrationPointSlimInfo }
     * 
     */
    public ArrayOfISSIntegrationPointSlimInfo createArrayOfISSIntegrationPointSlimInfo() {
        return new ArrayOfISSIntegrationPointSlimInfo();
    }

    /**
     * Create an instance of {@link ISSIntegrationPointSlimInfo }
     * 
     */
    public ISSIntegrationPointSlimInfo createISSIntegrationPointSlimInfo() {
        return new ISSIntegrationPointSlimInfo();
    }

    /**
     * Create an instance of {@link ArrayOfISSRusGuardSlimInfo }
     * 
     */
    public ArrayOfISSRusGuardSlimInfo createArrayOfISSRusGuardSlimInfo() {
        return new ArrayOfISSRusGuardSlimInfo();
    }

    /**
     * Create an instance of {@link ISSRusGuardSlimInfo }
     * 
     */
    public ISSRusGuardSlimInfo createISSRusGuardSlimInfo() {
        return new ISSRusGuardSlimInfo();
    }

    /**
     * Create an instance of {@link AccessBits }
     * 
     */
    public AccessBits createAccessBits() {
        return new AccessBits();
    }

    /**
     * Create an instance of {@link ScreenCellTreeInfo }
     * 
     */
    public ScreenCellTreeInfo createScreenCellTreeInfo() {
        return new ScreenCellTreeInfo();
    }

    /**
     * Create an instance of {@link ScreenCellInfo }
     * 
     */
    public ScreenCellInfo createScreenCellInfo() {
        return new ScreenCellInfo();
    }

    /**
     * Create an instance of {@link ScreenCellSaveData }
     * 
     */
    public ScreenCellSaveData createScreenCellSaveData() {
        return new ScreenCellSaveData();
    }

    /**
     * Create an instance of {@link ArrayOfScreenCellTreeInfo }
     * 
     */
    public ArrayOfScreenCellTreeInfo createArrayOfScreenCellTreeInfo() {
        return new ArrayOfScreenCellTreeInfo();
    }

    /**
     * Create an instance of {@link IvideonCameraDriverInfo }
     * 
     */
    public IvideonCameraDriverInfo createIvideonCameraDriverInfo() {
        return new IvideonCameraDriverInfo();
    }

    /**
     * Create an instance of {@link EmailAddressInfo }
     * 
     */
    public EmailAddressInfo createEmailAddressInfo() {
        return new EmailAddressInfo();
    }

    /**
     * Create an instance of {@link PhoneNumberInfo }
     * 
     */
    public PhoneNumberInfo createPhoneNumberInfo() {
        return new PhoneNumberInfo();
    }

    /**
     * Create an instance of {@link EmailDistributionAddressInfo }
     * 
     */
    public EmailDistributionAddressInfo createEmailDistributionAddressInfo() {
        return new EmailDistributionAddressInfo();
    }

    /**
     * Create an instance of {@link MifareProfileTagsData }
     * 
     */
    public MifareProfileTagsData createMifareProfileTagsData() {
        return new MifareProfileTagsData();
    }

    /**
     * Create an instance of {@link TagFullInfo }
     * 
     */
    public TagFullInfo createTagFullInfo() {
        return new TagFullInfo();
    }

    /**
     * Create an instance of {@link ReportTagsData }
     * 
     */
    public ReportTagsData createReportTagsData() {
        return new ReportTagsData();
    }

    /**
     * Create an instance of {@link EmployeeGroupTagsData }
     * 
     */
    public EmployeeGroupTagsData createEmployeeGroupTagsData() {
        return new EmployeeGroupTagsData();
    }

    /**
     * Create an instance of {@link AccessLevelTagsData }
     * 
     */
    public AccessLevelTagsData createAccessLevelTagsData() {
        return new AccessLevelTagsData();
    }

    /**
     * Create an instance of {@link BoxAccessLevelTagsData }
     * 
     */
    public BoxAccessLevelTagsData createBoxAccessLevelTagsData() {
        return new BoxAccessLevelTagsData();
    }

    /**
     * Create an instance of {@link ResourceTagsData }
     * 
     */
    public ResourceTagsData createResourceTagsData() {
        return new ResourceTagsData();
    }

    /**
     * Create an instance of {@link ResourceFilterTagsData }
     * 
     */
    public ResourceFilterTagsData createResourceFilterTagsData() {
        return new ResourceFilterTagsData();
    }

    /**
     * Create an instance of {@link FilterTagFullInfo }
     * 
     */
    public FilterTagFullInfo createFilterTagFullInfo() {
        return new FilterTagFullInfo();
    }

    /**
     * Create an instance of {@link FavoriteFolderInfoWithEmployeeGroup }
     * 
     */
    public FavoriteFolderInfoWithEmployeeGroup createFavoriteFolderInfoWithEmployeeGroup() {
        return new FavoriteFolderInfoWithEmployeeGroup();
    }

    /**
     * Create an instance of {@link UserPassSlimData }
     * 
     */
    public UserPassSlimData createUserPassSlimData() {
        return new UserPassSlimData();
    }

    /**
     * Create an instance of {@link ArrayOfUserPassEditorData }
     * 
     */
    public ArrayOfUserPassEditorData createArrayOfUserPassEditorData() {
        return new ArrayOfUserPassEditorData();
    }

    /**
     * Create an instance of {@link ArrayOfLUser }
     * 
     */
    public ArrayOfLUser createArrayOfLUser() {
        return new ArrayOfLUser();
    }

    /**
     * Create an instance of {@link ArrayOfLUserGroup }
     * 
     */
    public ArrayOfLUserGroup createArrayOfLUserGroup() {
        return new ArrayOfLUserGroup();
    }

    /**
     * Create an instance of {@link CardTypeSaveInfo }
     * 
     */
    public CardTypeSaveInfo createCardTypeSaveInfo() {
        return new CardTypeSaveInfo();
    }

    /**
     * Create an instance of {@link ArrayOfCardTypeInfo }
     * 
     */
    public ArrayOfCardTypeInfo createArrayOfCardTypeInfo() {
        return new ArrayOfCardTypeInfo();
    }

    /**
     * Create an instance of {@link CardTypeBiometricPermission }
     * 
     */
    public CardTypeBiometricPermission createCardTypeBiometricPermission() {
        return new CardTypeBiometricPermission();
    }

    /**
     * Create an instance of {@link ArrayOfLKeyInfo }
     * 
     */
    public ArrayOfLKeyInfo createArrayOfLKeyInfo() {
        return new ArrayOfLKeyInfo();
    }

    /**
     * Create an instance of {@link LKeyInfo }
     * 
     */
    public LKeyInfo createLKeyInfo() {
        return new LKeyInfo();
    }

    /**
     * Create an instance of {@link LStateBase }
     * 
     */
    public LStateBase createLStateBase() {
        return new LStateBase();
    }

    /**
     * Create an instance of {@link DriverSettings }
     * 
     */
    public DriverSettings createDriverSettings() {
        return new DriverSettings();
    }

    /**
     * Create an instance of {@link DoorRelays }
     * 
     */
    public DoorRelays createDoorRelays() {
        return new DoorRelays();
    }

    /**
     * Create an instance of {@link ArrayOfDoorRelay }
     * 
     */
    public ArrayOfDoorRelay createArrayOfDoorRelay() {
        return new ArrayOfDoorRelay();
    }

    /**
     * Create an instance of {@link DoorRelay }
     * 
     */
    public DoorRelay createDoorRelay() {
        return new DoorRelay();
    }

    /**
     * Create an instance of {@link ArrayOfLDriversCustomizableDays }
     * 
     */
    public ArrayOfLDriversCustomizableDays createArrayOfLDriversCustomizableDays() {
        return new ArrayOfLDriversCustomizableDays();
    }

    /**
     * Create an instance of {@link LDriversCustomizableDays }
     * 
     */
    public LDriversCustomizableDays createLDriversCustomizableDays() {
        return new LDriversCustomizableDays();
    }

    /**
     * Create an instance of {@link ArrayOfLCustomizableDayInfo }
     * 
     */
    public ArrayOfLCustomizableDayInfo createArrayOfLCustomizableDayInfo() {
        return new ArrayOfLCustomizableDayInfo();
    }

    /**
     * Create an instance of {@link LCustomizableDayInfo }
     * 
     */
    public LCustomizableDayInfo createLCustomizableDayInfo() {
        return new LCustomizableDayInfo();
    }

    /**
     * Create an instance of {@link UserPassEditorSaveData.Editor }
     * 
     */
    public UserPassEditorSaveData.Editor createUserPassEditorSaveDataEditor() {
        return new UserPassEditorSaveData.Editor();
    }

    /**
     * Create an instance of {@link IncidentTemplateSaveData.Template }
     * 
     */
    public IncidentTemplateSaveData.Template createIncidentTemplateSaveDataTemplate() {
        return new IncidentTemplateSaveData.Template();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLogMsgSubType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLogMsgSubType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "ArrayOfLogMsgSubType")
    public JAXBElement<ArrayOfLogMsgSubType> createArrayOfLogMsgSubType(ArrayOfLogMsgSubType value) {
        return new JAXBElement<ArrayOfLogMsgSubType>(_ArrayOfLogMsgSubType_QNAME, ArrayOfLogMsgSubType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "LogMsgSubType")
    public JAXBElement<String> createLogMsgSubType(String value) {
        return new JAXBElement<String>(_LogMsgSubType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLogMessageTypeSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLogMessageTypeSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "ArrayOfLogMessageTypeSlimInfo")
    public JAXBElement<ArrayOfLogMessageTypeSlimInfo> createArrayOfLogMessageTypeSlimInfo(ArrayOfLogMessageTypeSlimInfo value) {
        return new JAXBElement<ArrayOfLogMessageTypeSlimInfo>(_ArrayOfLogMessageTypeSlimInfo_QNAME, ArrayOfLogMessageTypeSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogMessageTypeSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogMessageTypeSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "LogMessageTypeSlimInfo")
    public JAXBElement<LogMessageTypeSlimInfo> createLogMessageTypeSlimInfo(LogMessageTypeSlimInfo value) {
        return new JAXBElement<LogMessageTypeSlimInfo>(_LogMessageTypeSlimInfo_QNAME, LogMessageTypeSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogMsgType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogMsgType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "LogMsgType")
    public JAXBElement<LogMsgType> createLogMsgType(LogMsgType value) {
        return new JAXBElement<LogMsgType>(_LogMsgType_QNAME, LogMsgType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLogMessageSubtypeSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLogMessageSubtypeSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "ArrayOfLogMessageSubtypeSlimInfo")
    public JAXBElement<ArrayOfLogMessageSubtypeSlimInfo> createArrayOfLogMessageSubtypeSlimInfo(ArrayOfLogMessageSubtypeSlimInfo value) {
        return new JAXBElement<ArrayOfLogMessageSubtypeSlimInfo>(_ArrayOfLogMessageSubtypeSlimInfo_QNAME, ArrayOfLogMessageSubtypeSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogMessageSubtypeSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogMessageSubtypeSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "LogMessageSubtypeSlimInfo")
    public JAXBElement<LogMessageSubtypeSlimInfo> createLogMessageSubtypeSlimInfo(LogMessageSubtypeSlimInfo value) {
        return new JAXBElement<LogMessageSubtypeSlimInfo>(_LogMessageSubtypeSlimInfo_QNAME, LogMessageSubtypeSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLogMsgType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLogMsgType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "ArrayOfLogMsgType")
    public JAXBElement<ArrayOfLogMsgType> createArrayOfLogMsgType(ArrayOfLogMsgType value) {
        return new JAXBElement<ArrayOfLogMsgType>(_ArrayOfLogMsgType_QNAME, ArrayOfLogMsgType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogSubjectType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogSubjectType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "LogSubjectType")
    public JAXBElement<LogSubjectType> createLogSubjectType(LogSubjectType value) {
        return new JAXBElement<LogSubjectType>(_LogSubjectType_QNAME, LogSubjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogMessageSortedColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogMessageSortedColumn }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "LogMessageSortedColumn")
    public JAXBElement<LogMessageSortedColumn> createLogMessageSortedColumn(LogMessageSortedColumn value) {
        return new JAXBElement<LogMessageSortedColumn>(_LogMessageSortedColumn_QNAME, LogMessageSortedColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "LogData")
    public JAXBElement<LogData> createLogData(LogData value) {
        return new JAXBElement<LogData>(_LogData_QNAME, LogData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLogMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLogMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "ArrayOfLogMessage")
    public JAXBElement<ArrayOfLogMessage> createArrayOfLogMessage(ArrayOfLogMessage value) {
        return new JAXBElement<ArrayOfLogMessage>(_ArrayOfLogMessage_QNAME, ArrayOfLogMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "LogMessage")
    public JAXBElement<LogMessage> createLogMessage(LogMessage value) {
        return new JAXBElement<LogMessage>(_LogMessage_QNAME, LogMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlcoCheckState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlcoCheckState }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "AlcoCheckState")
    public JAXBElement<AlcoCheckState> createAlcoCheckState(AlcoCheckState value) {
        return new JAXBElement<AlcoCheckState>(_AlcoCheckState_QNAME, AlcoCheckState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogMessageContentDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogMessageContentDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "LogMessageContentDataType")
    public JAXBElement<LogMessageContentDataType> createLogMessageContentDataType(LogMessageContentDataType value) {
        return new JAXBElement<LogMessageContentDataType>(_LogMessageContentDataType_QNAME, LogMessageContentDataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaceCheckState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaceCheckState }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "FaceCheckState")
    public JAXBElement<FaceCheckState> createFaceCheckState(FaceCheckState value) {
        return new JAXBElement<FaceCheckState>(_FaceCheckState_QNAME, FaceCheckState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScalesMeasurementReuslt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScalesMeasurementReuslt }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "ScalesMeasurementReuslt")
    public JAXBElement<ScalesMeasurementReuslt> createScalesMeasurementReuslt(ScalesMeasurementReuslt value) {
        return new JAXBElement<ScalesMeasurementReuslt>(_ScalesMeasurementReuslt_QNAME, ScalesMeasurementReuslt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureCheckState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TemperatureCheckState }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "TemperatureCheckState")
    public JAXBElement<TemperatureCheckState> createTemperatureCheckState(TemperatureCheckState value) {
        return new JAXBElement<TemperatureCheckState>(_TemperatureCheckState_QNAME, TemperatureCheckState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryElementInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DictionaryElementInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DictionaryElementInfo")
    public JAXBElement<DictionaryElementInfo> createDictionaryElementInfo(DictionaryElementInfo value) {
        return new JAXBElement<DictionaryElementInfo>(_DictionaryElementInfo_QNAME, DictionaryElementInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryElementSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DictionaryElementSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DictionaryElementSaveInfo")
    public JAXBElement<DictionaryElementSaveInfo> createDictionaryElementSaveInfo(DictionaryElementSaveInfo value) {
        return new JAXBElement<DictionaryElementSaveInfo>(_DictionaryElementSaveInfo_QNAME, DictionaryElementSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityGroupDictionaryElementSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SecurityGroupDictionaryElementSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "SecurityGroupDictionaryElementSaveInfo")
    public JAXBElement<SecurityGroupDictionaryElementSaveInfo> createSecurityGroupDictionaryElementSaveInfo(SecurityGroupDictionaryElementSaveInfo value) {
        return new JAXBElement<SecurityGroupDictionaryElementSaveInfo>(_SecurityGroupDictionaryElementSaveInfo_QNAME, SecurityGroupDictionaryElementSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationElementSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganizationElementSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "OrganizationElementSaveInfo")
    public JAXBElement<OrganizationElementSaveInfo> createOrganizationElementSaveInfo(OrganizationElementSaveInfo value) {
        return new JAXBElement<OrganizationElementSaveInfo>(_OrganizationElementSaveInfo_QNAME, OrganizationElementSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityGroupDictionaryElementInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SecurityGroupDictionaryElementInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "SecurityGroupDictionaryElementInfo")
    public JAXBElement<SecurityGroupDictionaryElementInfo> createSecurityGroupDictionaryElementInfo(SecurityGroupDictionaryElementInfo value) {
        return new JAXBElement<SecurityGroupDictionaryElementInfo>(_SecurityGroupDictionaryElementInfo_QNAME, SecurityGroupDictionaryElementInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationDictionaryElementInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganizationDictionaryElementInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "OrganizationDictionaryElementInfo")
    public JAXBElement<OrganizationDictionaryElementInfo> createOrganizationDictionaryElementInfo(OrganizationDictionaryElementInfo value) {
        return new JAXBElement<OrganizationDictionaryElementInfo>(_OrganizationDictionaryElementInfo_QNAME, OrganizationDictionaryElementInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DictionaryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DictionaryType")
    public JAXBElement<DictionaryType> createDictionaryType(DictionaryType value) {
        return new JAXBElement<DictionaryType>(_DictionaryType_QNAME, DictionaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryElementSortedColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DictionaryElementSortedColumn }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DictionaryElementSortedColumn")
    public JAXBElement<DictionaryElementSortedColumn> createDictionaryElementSortedColumn(DictionaryElementSortedColumn value) {
        return new JAXBElement<DictionaryElementSortedColumn>(_DictionaryElementSortedColumn_QNAME, DictionaryElementSortedColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryElementsInfoData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DictionaryElementsInfoData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DictionaryElementsInfoData")
    public JAXBElement<DictionaryElementsInfoData> createDictionaryElementsInfoData(DictionaryElementsInfoData value) {
        return new JAXBElement<DictionaryElementsInfoData>(_DictionaryElementsInfoData_QNAME, DictionaryElementsInfoData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDictionaryElementInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDictionaryElementInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfDictionaryElementInfo")
    public JAXBElement<ArrayOfDictionaryElementInfo> createArrayOfDictionaryElementInfo(ArrayOfDictionaryElementInfo value) {
        return new JAXBElement<ArrayOfDictionaryElementInfo>(_ArrayOfDictionaryElementInfo_QNAME, ArrayOfDictionaryElementInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryElementsFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DictionaryElementsFilter }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DictionaryElementsFilter")
    public JAXBElement<DictionaryElementsFilter> createDictionaryElementsFilter(DictionaryElementsFilter value) {
        return new JAXBElement<DictionaryElementsFilter>(_DictionaryElementsFilter_QNAME, DictionaryElementsFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentSortedColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncidentSortedColumn }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "IncidentSortedColumn")
    public JAXBElement<IncidentSortedColumn> createIncidentSortedColumn(IncidentSortedColumn value) {
        return new JAXBElement<IncidentSortedColumn>(_IncidentSortedColumn_QNAME, IncidentSortedColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentsFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncidentsFilter }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "IncidentsFilter")
    public JAXBElement<IncidentsFilter> createIncidentsFilter(IncidentsFilter value) {
        return new JAXBElement<IncidentsFilter>(_IncidentsFilter_QNAME, IncidentsFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentsMegaFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncidentsMegaFilter }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "IncidentsMegaFilter")
    public JAXBElement<IncidentsMegaFilter> createIncidentsMegaFilter(IncidentsMegaFilter value) {
        return new JAXBElement<IncidentsMegaFilter>(_IncidentsMegaFilter_QNAME, IncidentsMegaFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentsInfoData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncidentsInfoData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "IncidentsInfoData")
    public JAXBElement<IncidentsInfoData> createIncidentsInfoData(IncidentsInfoData value) {
        return new JAXBElement<IncidentsInfoData>(_IncidentsInfoData_QNAME, IncidentsInfoData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIncidentElementFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfIncidentElementFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfIncidentElementFullInfo")
    public JAXBElement<ArrayOfIncidentElementFullInfo> createArrayOfIncidentElementFullInfo(ArrayOfIncidentElementFullInfo value) {
        return new JAXBElement<ArrayOfIncidentElementFullInfo>(_ArrayOfIncidentElementFullInfo_QNAME, ArrayOfIncidentElementFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentElementFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncidentElementFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "IncidentElementFullInfo")
    public JAXBElement<IncidentElementFullInfo> createIncidentElementFullInfo(IncidentElementFullInfo value) {
        return new JAXBElement<IncidentElementFullInfo>(_IncidentElementFullInfo_QNAME, IncidentElementFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncidentSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "IncidentSaveInfo")
    public JAXBElement<IncidentSaveInfo> createIncidentSaveInfo(IncidentSaveInfo value) {
        return new JAXBElement<IncidentSaveInfo>(_IncidentSaveInfo_QNAME, IncidentSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViolatorSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfViolatorSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfViolatorSaveInfo")
    public JAXBElement<ArrayOfViolatorSaveInfo> createArrayOfViolatorSaveInfo(ArrayOfViolatorSaveInfo value) {
        return new JAXBElement<ArrayOfViolatorSaveInfo>(_ArrayOfViolatorSaveInfo_QNAME, ArrayOfViolatorSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViolatorSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViolatorSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ViolatorSaveInfo")
    public JAXBElement<ViolatorSaveInfo> createViolatorSaveInfo(ViolatorSaveInfo value) {
        return new JAXBElement<ViolatorSaveInfo>(_ViolatorSaveInfo_QNAME, ViolatorSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentForActionSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentForActionSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfDocumentForActionSaveInfo")
    public JAXBElement<ArrayOfDocumentForActionSaveInfo> createArrayOfDocumentForActionSaveInfo(ArrayOfDocumentForActionSaveInfo value) {
        return new JAXBElement<ArrayOfDocumentForActionSaveInfo>(_ArrayOfDocumentForActionSaveInfo_QNAME, ArrayOfDocumentForActionSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentForActionSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentForActionSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentForActionSaveInfo")
    public JAXBElement<DocumentForActionSaveInfo> createDocumentForActionSaveInfo(DocumentForActionSaveInfo value) {
        return new JAXBElement<DocumentForActionSaveInfo>(_DocumentForActionSaveInfo_QNAME, DocumentForActionSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfDocumentSaveInfo")
    public JAXBElement<ArrayOfDocumentSaveInfo> createArrayOfDocumentSaveInfo(ArrayOfDocumentSaveInfo value) {
        return new JAXBElement<ArrayOfDocumentSaveInfo>(_ArrayOfDocumentSaveInfo_QNAME, ArrayOfDocumentSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentSaveInfo")
    public JAXBElement<DocumentSaveInfo> createDocumentSaveInfo(DocumentSaveInfo value) {
        return new JAXBElement<DocumentSaveInfo>(_DocumentSaveInfo_QNAME, DocumentSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViolationSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfViolationSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfViolationSaveInfo")
    public JAXBElement<ArrayOfViolationSaveInfo> createArrayOfViolationSaveInfo(ArrayOfViolationSaveInfo value) {
        return new JAXBElement<ArrayOfViolationSaveInfo>(_ArrayOfViolationSaveInfo_QNAME, ArrayOfViolationSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViolationSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViolationSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ViolationSaveInfo")
    public JAXBElement<ViolationSaveInfo> createViolationSaveInfo(ViolationSaveInfo value) {
        return new JAXBElement<ViolationSaveInfo>(_ViolationSaveInfo_QNAME, ViolationSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViolationFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViolationFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ViolationFullInfo")
    public JAXBElement<ViolationFullInfo> createViolationFullInfo(ViolationFullInfo value) {
        return new JAXBElement<ViolationFullInfo>(_ViolationFullInfo_QNAME, ViolationFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTangiblesSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTangiblesSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfTangiblesSaveInfo")
    public JAXBElement<ArrayOfTangiblesSaveInfo> createArrayOfTangiblesSaveInfo(ArrayOfTangiblesSaveInfo value) {
        return new JAXBElement<ArrayOfTangiblesSaveInfo>(_ArrayOfTangiblesSaveInfo_QNAME, ArrayOfTangiblesSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TangiblesSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TangiblesSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "TangiblesSaveInfo")
    public JAXBElement<TangiblesSaveInfo> createTangiblesSaveInfo(TangiblesSaveInfo value) {
        return new JAXBElement<TangiblesSaveInfo>(_TangiblesSaveInfo_QNAME, TangiblesSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViolatorFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfViolatorFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfViolatorFullInfo")
    public JAXBElement<ArrayOfViolatorFullInfo> createArrayOfViolatorFullInfo(ArrayOfViolatorFullInfo value) {
        return new JAXBElement<ArrayOfViolatorFullInfo>(_ArrayOfViolatorFullInfo_QNAME, ArrayOfViolatorFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViolatorFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViolatorFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ViolatorFullInfo")
    public JAXBElement<ViolatorFullInfo> createViolatorFullInfo(ViolatorFullInfo value) {
        return new JAXBElement<ViolatorFullInfo>(_ViolatorFullInfo_QNAME, ViolatorFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfDocumentFullInfo")
    public JAXBElement<ArrayOfDocumentFullInfo> createArrayOfDocumentFullInfo(ArrayOfDocumentFullInfo value) {
        return new JAXBElement<ArrayOfDocumentFullInfo>(_ArrayOfDocumentFullInfo_QNAME, ArrayOfDocumentFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentFullInfo")
    public JAXBElement<DocumentFullInfo> createDocumentFullInfo(DocumentFullInfo value) {
        return new JAXBElement<DocumentFullInfo>(_DocumentFullInfo_QNAME, DocumentFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentFullForActionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentFullForActionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfDocumentFullForActionInfo")
    public JAXBElement<ArrayOfDocumentFullForActionInfo> createArrayOfDocumentFullForActionInfo(ArrayOfDocumentFullForActionInfo value) {
        return new JAXBElement<ArrayOfDocumentFullForActionInfo>(_ArrayOfDocumentFullForActionInfo_QNAME, ArrayOfDocumentFullForActionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentFullForActionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentFullForActionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentFullForActionInfo")
    public JAXBElement<DocumentFullForActionInfo> createDocumentFullForActionInfo(DocumentFullForActionInfo value) {
        return new JAXBElement<DocumentFullForActionInfo>(_DocumentFullForActionInfo_QNAME, DocumentFullForActionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViolationFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfViolationFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfViolationFullInfo")
    public JAXBElement<ArrayOfViolationFullInfo> createArrayOfViolationFullInfo(ArrayOfViolationFullInfo value) {
        return new JAXBElement<ArrayOfViolationFullInfo>(_ArrayOfViolationFullInfo_QNAME, ArrayOfViolationFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTangiblesFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTangiblesFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfTangiblesFullInfo")
    public JAXBElement<ArrayOfTangiblesFullInfo> createArrayOfTangiblesFullInfo(ArrayOfTangiblesFullInfo value) {
        return new JAXBElement<ArrayOfTangiblesFullInfo>(_ArrayOfTangiblesFullInfo_QNAME, ArrayOfTangiblesFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TangiblesFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TangiblesFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "TangiblesFullInfo")
    public JAXBElement<TangiblesFullInfo> createTangiblesFullInfo(TangiblesFullInfo value) {
        return new JAXBElement<TangiblesFullInfo>(_TangiblesFullInfo_QNAME, TangiblesFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViolatorFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViolatorFilter }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ViolatorFilter")
    public JAXBElement<ViolatorFilter> createViolatorFilter(ViolatorFilter value) {
        return new JAXBElement<ViolatorFilter>(_ViolatorFilter_QNAME, ViolatorFilter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFirebirdIncidentEventsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFirebirdIncidentEventsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfFirebirdIncidentEventsResult")
    public JAXBElement<ArrayOfFirebirdIncidentEventsResult> createArrayOfFirebirdIncidentEventsResult(ArrayOfFirebirdIncidentEventsResult value) {
        return new JAXBElement<ArrayOfFirebirdIncidentEventsResult>(_ArrayOfFirebirdIncidentEventsResult_QNAME, ArrayOfFirebirdIncidentEventsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirebirdIncidentEventsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FirebirdIncidentEventsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "FirebirdIncidentEventsResult")
    public JAXBElement<FirebirdIncidentEventsResult> createFirebirdIncidentEventsResult(FirebirdIncidentEventsResult value) {
        return new JAXBElement<FirebirdIncidentEventsResult>(_FirebirdIncidentEventsResult_QNAME, FirebirdIncidentEventsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViolation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfViolation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfViolation")
    public JAXBElement<ArrayOfViolation> createArrayOfViolation(ArrayOfViolation value) {
        return new JAXBElement<ArrayOfViolation>(_ArrayOfViolation_QNAME, ArrayOfViolation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Violation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Violation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Violation")
    public JAXBElement<Violation> createViolation(Violation value) {
        return new JAXBElement<Violation>(_Violation_QNAME, Violation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIncidentTemplateInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfIncidentTemplateInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfIncidentTemplateInfo")
    public JAXBElement<ArrayOfIncidentTemplateInfo> createArrayOfIncidentTemplateInfo(ArrayOfIncidentTemplateInfo value) {
        return new JAXBElement<ArrayOfIncidentTemplateInfo>(_ArrayOfIncidentTemplateInfo_QNAME, ArrayOfIncidentTemplateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentTemplateInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncidentTemplateInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "IncidentTemplateInfo")
    public JAXBElement<IncidentTemplateInfo> createIncidentTemplateInfo(IncidentTemplateInfo value) {
        return new JAXBElement<IncidentTemplateInfo>(_IncidentTemplateInfo_QNAME, IncidentTemplateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentTemplateSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncidentTemplateSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "IncidentTemplateSaveData")
    public JAXBElement<IncidentTemplateSaveData> createIncidentTemplateSaveData(IncidentTemplateSaveData value) {
        return new JAXBElement<IncidentTemplateSaveData>(_IncidentTemplateSaveData_QNAME, IncidentTemplateSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployee2OrganizationAssignmentFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployee2OrganizationAssignmentFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfEmployee2OrganizationAssignmentFull")
    public JAXBElement<ArrayOfEmployee2OrganizationAssignmentFull> createArrayOfEmployee2OrganizationAssignmentFull(ArrayOfEmployee2OrganizationAssignmentFull value) {
        return new JAXBElement<ArrayOfEmployee2OrganizationAssignmentFull>(_ArrayOfEmployee2OrganizationAssignmentFull_QNAME, ArrayOfEmployee2OrganizationAssignmentFull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee2OrganizationAssignmentFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Employee2OrganizationAssignmentFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Employee2OrganizationAssignmentFull")
    public JAXBElement<Employee2OrganizationAssignmentFull> createEmployee2OrganizationAssignmentFull(Employee2OrganizationAssignmentFull value) {
        return new JAXBElement<Employee2OrganizationAssignmentFull>(_Employee2OrganizationAssignmentFull_QNAME, Employee2OrganizationAssignmentFull.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployee2OrganizationAssignment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployee2OrganizationAssignment }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ArrayOfEmployee2OrganizationAssignment")
    public JAXBElement<ArrayOfEmployee2OrganizationAssignment> createArrayOfEmployee2OrganizationAssignment(ArrayOfEmployee2OrganizationAssignment value) {
        return new JAXBElement<ArrayOfEmployee2OrganizationAssignment>(_ArrayOfEmployee2OrganizationAssignment_QNAME, ArrayOfEmployee2OrganizationAssignment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee2OrganizationAssignment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Employee2OrganizationAssignment }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Employee2OrganizationAssignment")
    public JAXBElement<Employee2OrganizationAssignment> createEmployee2OrganizationAssignment(Employee2OrganizationAssignment value) {
        return new JAXBElement<Employee2OrganizationAssignment>(_Employee2OrganizationAssignment_QNAME, Employee2OrganizationAssignment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FolderInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", name = "FolderInfo")
    public JAXBElement<FolderInfo> createFolderInfo(FolderInfo value) {
        return new JAXBElement<FolderInfo>(_FolderInfo_QNAME, FolderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FolderSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", name = "FolderSaveData")
    public JAXBElement<FolderSaveData> createFolderSaveData(FolderSaveData value) {
        return new JAXBElement<FolderSaveData>(_FolderSaveData_QNAME, FolderSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OwnerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", name = "OwnerType")
    public JAXBElement<OwnerType> createOwnerType(OwnerType value) {
        return new JAXBElement<OwnerType>(_OwnerType_QNAME, OwnerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFolderInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFolderInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", name = "ArrayOfFolderInfo")
    public JAXBElement<ArrayOfFolderInfo> createArrayOfFolderInfo(ArrayOfFolderInfo value) {
        return new JAXBElement<ArrayOfFolderInfo>(_ArrayOfFolderInfo_QNAME, ArrayOfFolderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFolderInfoWithAccessLevel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFolderInfoWithAccessLevel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", name = "ArrayOfFolderInfoWithAccessLevel")
    public JAXBElement<ArrayOfFolderInfoWithAccessLevel> createArrayOfFolderInfoWithAccessLevel(ArrayOfFolderInfoWithAccessLevel value) {
        return new JAXBElement<ArrayOfFolderInfoWithAccessLevel>(_ArrayOfFolderInfoWithAccessLevel_QNAME, ArrayOfFolderInfoWithAccessLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderInfoWithAccessLevel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FolderInfoWithAccessLevel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", name = "FolderInfoWithAccessLevel")
    public JAXBElement<FolderInfoWithAccessLevel> createFolderInfoWithAccessLevel(FolderInfoWithAccessLevel value) {
        return new JAXBElement<FolderInfoWithAccessLevel>(_FolderInfoWithAccessLevel_QNAME, FolderInfoWithAccessLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeePositionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeePositionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", name = "ArrayOfEmployeePositionSlimInfo")
    public JAXBElement<ArrayOfEmployeePositionSlimInfo> createArrayOfEmployeePositionSlimInfo(ArrayOfEmployeePositionSlimInfo value) {
        return new JAXBElement<ArrayOfEmployeePositionSlimInfo>(_ArrayOfEmployeePositionSlimInfo_QNAME, ArrayOfEmployeePositionSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeePositionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeePositionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", name = "EmployeePositionSlimInfo")
    public JAXBElement<EmployeePositionSlimInfo> createEmployeePositionSlimInfo(EmployeePositionSlimInfo value) {
        return new JAXBElement<EmployeePositionSlimInfo>(_EmployeePositionSlimInfo_QNAME, EmployeePositionSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LEmployeePositionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LEmployeePositionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", name = "LEmployeePositionInfo")
    public JAXBElement<LEmployeePositionInfo> createLEmployeePositionInfo(LEmployeePositionInfo value) {
        return new JAXBElement<LEmployeePositionInfo>(_LEmployeePositionInfo_QNAME, LEmployeePositionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeePositionSortedColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeePositionSortedColumn }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", name = "EmployeePositionSortedColumn")
    public JAXBElement<EmployeePositionSortedColumn> createEmployeePositionSortedColumn(EmployeePositionSortedColumn value) {
        return new JAXBElement<EmployeePositionSortedColumn>(_EmployeePositionSortedColumn_QNAME, EmployeePositionSortedColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LEmployeePositionsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LEmployeePositionsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", name = "LEmployeePositionsData")
    public JAXBElement<LEmployeePositionsData> createLEmployeePositionsData(LEmployeePositionsData value) {
        return new JAXBElement<LEmployeePositionsData>(_LEmployeePositionsData_QNAME, LEmployeePositionsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLEmployeePositionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLEmployeePositionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", name = "ArrayOfLEmployeePositionInfo")
    public JAXBElement<ArrayOfLEmployeePositionInfo> createArrayOfLEmployeePositionInfo(ArrayOfLEmployeePositionInfo value) {
        return new JAXBElement<ArrayOfLEmployeePositionInfo>(_ArrayOfLEmployeePositionInfo_QNAME, ArrayOfLEmployeePositionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkZoneSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkZoneSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "ArrayOfWorkZoneSlimInfo")
    public JAXBElement<ArrayOfWorkZoneSlimInfo> createArrayOfWorkZoneSlimInfo(ArrayOfWorkZoneSlimInfo value) {
        return new JAXBElement<ArrayOfWorkZoneSlimInfo>(_ArrayOfWorkZoneSlimInfo_QNAME, ArrayOfWorkZoneSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkZoneSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkZoneSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkZoneSlimInfo")
    public JAXBElement<WorkZoneSlimInfo> createWorkZoneSlimInfo(WorkZoneSlimInfo value) {
        return new JAXBElement<WorkZoneSlimInfo>(_WorkZoneSlimInfo_QNAME, WorkZoneSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkZoneSlimSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkZoneSlimSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkZoneSlimSaveData")
    public JAXBElement<WorkZoneSlimSaveData> createWorkZoneSlimSaveData(WorkZoneSlimSaveData value) {
        return new JAXBElement<WorkZoneSlimSaveData>(_WorkZoneSlimSaveData_QNAME, WorkZoneSlimSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkTimetableSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkTimetableSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "ArrayOfWorkTimetableSlimInfo")
    public JAXBElement<ArrayOfWorkTimetableSlimInfo> createArrayOfWorkTimetableSlimInfo(ArrayOfWorkTimetableSlimInfo value) {
        return new JAXBElement<ArrayOfWorkTimetableSlimInfo>(_ArrayOfWorkTimetableSlimInfo_QNAME, ArrayOfWorkTimetableSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkTimetableSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkTimetableSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkTimetableSlimInfo")
    public JAXBElement<WorkTimetableSlimInfo> createWorkTimetableSlimInfo(WorkTimetableSlimInfo value) {
        return new JAXBElement<WorkTimetableSlimInfo>(_WorkTimetableSlimInfo_QNAME, WorkTimetableSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayForm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DayForm }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "DayForm")
    public JAXBElement<DayForm> createDayForm(DayForm value) {
        return new JAXBElement<DayForm>(_DayForm_QNAME, DayForm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayTypeSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DayTypeSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "DayTypeSlimInfo")
    public JAXBElement<DayTypeSlimInfo> createDayTypeSlimInfo(DayTypeSlimInfo value) {
        return new JAXBElement<DayTypeSlimInfo>(_DayTypeSlimInfo_QNAME, DayTypeSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayTypeSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DayTypeSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "DayTypeSaveData")
    public JAXBElement<DayTypeSaveData> createDayTypeSaveData(DayTypeSaveData value) {
        return new JAXBElement<DayTypeSaveData>(_DayTypeSaveData_QNAME, DayTypeSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayMode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DayMode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "DayMode")
    public JAXBElement<DayMode> createDayMode(DayMode value) {
        return new JAXBElement<DayMode>(_DayMode_QNAME, DayMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDayTypeSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDayTypeSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "ArrayOfDayTypeSlimInfo")
    public JAXBElement<ArrayOfDayTypeSlimInfo> createArrayOfDayTypeSlimInfo(ArrayOfDayTypeSlimInfo value) {
        return new JAXBElement<ArrayOfDayTypeSlimInfo>(_ArrayOfDayTypeSlimInfo_QNAME, ArrayOfDayTypeSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkScheduleSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkScheduleSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "ArrayOfWorkScheduleSlimInfo")
    public JAXBElement<ArrayOfWorkScheduleSlimInfo> createArrayOfWorkScheduleSlimInfo(ArrayOfWorkScheduleSlimInfo value) {
        return new JAXBElement<ArrayOfWorkScheduleSlimInfo>(_ArrayOfWorkScheduleSlimInfo_QNAME, ArrayOfWorkScheduleSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkScheduleSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkScheduleSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkScheduleSlimInfo")
    public JAXBElement<WorkScheduleSlimInfo> createWorkScheduleSlimInfo(WorkScheduleSlimInfo value) {
        return new JAXBElement<WorkScheduleSlimInfo>(_WorkScheduleSlimInfo_QNAME, WorkScheduleSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkScheduleSlimSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkScheduleSlimSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkScheduleSlimSaveData")
    public JAXBElement<WorkScheduleSlimSaveData> createWorkScheduleSlimSaveData(WorkScheduleSlimSaveData value) {
        return new JAXBElement<WorkScheduleSlimSaveData>(_WorkScheduleSlimSaveData_QNAME, WorkScheduleSlimSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkZonesAccessPointSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkZonesAccessPointSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "ArrayOfWorkZonesAccessPointSlimInfo")
    public JAXBElement<ArrayOfWorkZonesAccessPointSlimInfo> createArrayOfWorkZonesAccessPointSlimInfo(ArrayOfWorkZonesAccessPointSlimInfo value) {
        return new JAXBElement<ArrayOfWorkZonesAccessPointSlimInfo>(_ArrayOfWorkZonesAccessPointSlimInfo_QNAME, ArrayOfWorkZonesAccessPointSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkZonesAccessPointSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkZonesAccessPointSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkZonesAccessPointSlimInfo")
    public JAXBElement<WorkZonesAccessPointSlimInfo> createWorkZonesAccessPointSlimInfo(WorkZonesAccessPointSlimInfo value) {
        return new JAXBElement<WorkZonesAccessPointSlimInfo>(_WorkZonesAccessPointSlimInfo_QNAME, WorkZonesAccessPointSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkZonesAccessPointBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkZonesAccessPointBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkZonesAccessPointBase")
    public JAXBElement<WorkZonesAccessPointBase> createWorkZonesAccessPointBase(WorkZonesAccessPointBase value) {
        return new JAXBElement<WorkZonesAccessPointBase>(_WorkZonesAccessPointBase_QNAME, WorkZonesAccessPointBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkZonesAccessPointType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkZonesAccessPointType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkZonesAccessPointType")
    public JAXBElement<WorkZonesAccessPointType> createWorkZonesAccessPointType(WorkZonesAccessPointType value) {
        return new JAXBElement<WorkZonesAccessPointType>(_WorkZonesAccessPointType_QNAME, WorkZonesAccessPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkZonesAccessPointEventType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkZonesAccessPointEventType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkZonesAccessPointEventType")
    public JAXBElement<WorkZonesAccessPointEventType> createWorkZonesAccessPointEventType(WorkZonesAccessPointEventType value) {
        return new JAXBElement<WorkZonesAccessPointEventType>(_WorkZonesAccessPointEventType_QNAME, WorkZonesAccessPointEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkZoneSortedColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkZoneSortedColumn }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkZoneSortedColumn")
    public JAXBElement<WorkZoneSortedColumn> createWorkZoneSortedColumn(WorkZoneSortedColumn value) {
        return new JAXBElement<WorkZoneSortedColumn>(_WorkZoneSortedColumn_QNAME, WorkZoneSortedColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkZonesOwner }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkZonesOwner }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkZonesOwner")
    public JAXBElement<WorkZonesOwner> createWorkZonesOwner(WorkZonesOwner value) {
        return new JAXBElement<WorkZonesOwner>(_WorkZonesOwner_QNAME, WorkZonesOwner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkZonesData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkZonesData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkZonesData")
    public JAXBElement<WorkZonesData> createWorkZonesData(WorkZonesData value) {
        return new JAXBElement<WorkZonesData>(_WorkZonesData_QNAME, WorkZonesData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkScheduleSortedColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkScheduleSortedColumn }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkScheduleSortedColumn")
    public JAXBElement<WorkScheduleSortedColumn> createWorkScheduleSortedColumn(WorkScheduleSortedColumn value) {
        return new JAXBElement<WorkScheduleSortedColumn>(_WorkScheduleSortedColumn_QNAME, WorkScheduleSortedColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkSchedulesOwner }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkSchedulesOwner }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkSchedulesOwner")
    public JAXBElement<WorkSchedulesOwner> createWorkSchedulesOwner(WorkSchedulesOwner value) {
        return new JAXBElement<WorkSchedulesOwner>(_WorkSchedulesOwner_QNAME, WorkSchedulesOwner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkSchedulesData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkSchedulesData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkSchedulesData")
    public JAXBElement<WorkSchedulesData> createWorkSchedulesData(WorkSchedulesData value) {
        return new JAXBElement<WorkSchedulesData>(_WorkSchedulesData_QNAME, WorkSchedulesData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkZonesAccessPointSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkZonesAccessPointSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkZonesAccessPointSaveData")
    public JAXBElement<WorkZonesAccessPointSaveData> createWorkZonesAccessPointSaveData(WorkZonesAccessPointSaveData value) {
        return new JAXBElement<WorkZonesAccessPointSaveData>(_WorkZonesAccessPointSaveData_QNAME, WorkZonesAccessPointSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBranchInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBranchInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Branch", name = "ArrayOfBranchInfo")
    public JAXBElement<ArrayOfBranchInfo> createArrayOfBranchInfo(ArrayOfBranchInfo value) {
        return new JAXBElement<ArrayOfBranchInfo>(_ArrayOfBranchInfo_QNAME, ArrayOfBranchInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BranchInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BranchInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Branch", name = "BranchInfo")
    public JAXBElement<BranchInfo> createBranchInfo(BranchInfo value) {
        return new JAXBElement<BranchInfo>(_BranchInfo_QNAME, BranchInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BranchSortedColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BranchSortedColumn }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Branch", name = "BranchSortedColumn")
    public JAXBElement<BranchSortedColumn> createBranchSortedColumn(BranchSortedColumn value) {
        return new JAXBElement<BranchSortedColumn>(_BranchSortedColumn_QNAME, BranchSortedColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BranchData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BranchData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Branch", name = "BranchData")
    public JAXBElement<BranchData> createBranchData(BranchData value) {
        return new JAXBElement<BranchData>(_BranchData_QNAME, BranchData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReportSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfReportSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", name = "ArrayOfReportSlimInfo")
    public JAXBElement<ArrayOfReportSlimInfo> createArrayOfReportSlimInfo(ArrayOfReportSlimInfo value) {
        return new JAXBElement<ArrayOfReportSlimInfo>(_ArrayOfReportSlimInfo_QNAME, ArrayOfReportSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", name = "ReportSlimInfo")
    public JAXBElement<ReportSlimInfo> createReportSlimInfo(ReportSlimInfo value) {
        return new JAXBElement<ReportSlimInfo>(_ReportSlimInfo_QNAME, ReportSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", name = "ReportSaveData")
    public JAXBElement<ReportSaveData> createReportSaveData(ReportSaveData value) {
        return new JAXBElement<ReportSaveData>(_ReportSaveData_QNAME, ReportSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhotoOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhotoOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Photo", name = "PhotoOrder")
    public JAXBElement<PhotoOrder> createPhotoOrder(PhotoOrder value) {
        return new JAXBElement<PhotoOrder>(_PhotoOrder_QNAME, PhotoOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhotoOwnerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhotoOwnerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Photo", name = "PhotoOwnerType")
    public JAXBElement<PhotoOwnerType> createPhotoOwnerType(PhotoOwnerType value) {
        return new JAXBElement<PhotoOwnerType>(_PhotoOwnerType_QNAME, PhotoOwnerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhotoOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPhotoOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Photo", name = "ArrayOfPhotoOrder")
    public JAXBElement<ArrayOfPhotoOrder> createArrayOfPhotoOrder(ArrayOfPhotoOrder value) {
        return new JAXBElement<ArrayOfPhotoOrder>(_ArrayOfPhotoOrder_QNAME, ArrayOfPhotoOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "PhotoMarker")
    public JAXBElement<List<String>> createPhotoMarker(List<String> value) {
        return new JAXBElement<List<String>>(_PhotoMarker_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerFieldType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OwnerFieldType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "OwnerFieldType")
    public JAXBElement<OwnerFieldType> createOwnerFieldType(OwnerFieldType value) {
        return new JAXBElement<OwnerFieldType>(_OwnerFieldType_QNAME, OwnerFieldType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdditionalFieldBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdditionalFieldBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "ArrayOfAdditionalFieldBase")
    public JAXBElement<ArrayOfAdditionalFieldBase> createArrayOfAdditionalFieldBase(ArrayOfAdditionalFieldBase value) {
        return new JAXBElement<ArrayOfAdditionalFieldBase>(_ArrayOfAdditionalFieldBase_QNAME, ArrayOfAdditionalFieldBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalFieldBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdditionalFieldBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "AdditionalFieldBase")
    public JAXBElement<AdditionalFieldBase> createAdditionalFieldBase(AdditionalFieldBase value) {
        return new JAXBElement<AdditionalFieldBase>(_AdditionalFieldBase_QNAME, AdditionalFieldBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FieldType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FieldType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "FieldType")
    public JAXBElement<FieldType> createFieldType(FieldType value) {
        return new JAXBElement<FieldType>(_FieldType_QNAME, FieldType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimeField }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DateTimeField }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "DateTimeField")
    public JAXBElement<DateTimeField> createDateTimeField(DateTimeField value) {
        return new JAXBElement<DateTimeField>(_DateTimeField_QNAME, DateTimeField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IntegerField }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IntegerField }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "IntegerField")
    public JAXBElement<IntegerField> createIntegerField(IntegerField value) {
        return new JAXBElement<IntegerField>(_IntegerField_QNAME, IntegerField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoubleField }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoubleField }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "DoubleField")
    public JAXBElement<DoubleField> createDoubleField(DoubleField value) {
        return new JAXBElement<DoubleField>(_DoubleField_QNAME, DoubleField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringField }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringField }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "StringField")
    public JAXBElement<StringField> createStringField(StringField value) {
        return new JAXBElement<StringField>(_StringField_QNAME, StringField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ColorField }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ColorField }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "ColorField")
    public JAXBElement<ColorField> createColorField(ColorField value) {
        return new JAXBElement<ColorField>(_ColorField_QNAME, ColorField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListField }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListField }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "ListField")
    public JAXBElement<ListField> createListField(ListField value) {
        return new JAXBElement<ListField>(_ListField_QNAME, ListField.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "ListItem")
    public JAXBElement<ListItem> createListItem(ListItem value) {
        return new JAXBElement<ListItem>(_ListItem_QNAME, ListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfListItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfListItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "ArrayOfListItem")
    public JAXBElement<ArrayOfListItem> createArrayOfListItem(ArrayOfListItem value) {
        return new JAXBElement<ArrayOfListItem>(_ArrayOfListItem_QNAME, ArrayOfListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdditionalFieldValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdditionalFieldValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "ArrayOfAdditionalFieldValue")
    public JAXBElement<ArrayOfAdditionalFieldValue> createArrayOfAdditionalFieldValue(ArrayOfAdditionalFieldValue value) {
        return new JAXBElement<ArrayOfAdditionalFieldValue>(_ArrayOfAdditionalFieldValue_QNAME, ArrayOfAdditionalFieldValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalFieldValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdditionalFieldValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "AdditionalFieldValue")
    public JAXBElement<AdditionalFieldValue> createAdditionalFieldValue(AdditionalFieldValue value) {
        return new JAXBElement<AdditionalFieldValue>(_AdditionalFieldValue_QNAME, AdditionalFieldValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerValueBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OwnerValueBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "OwnerValueBase")
    public JAXBElement<OwnerValueBase> createOwnerValueBase(OwnerValueBase value) {
        return new JAXBElement<OwnerValueBase>(_OwnerValueBase_QNAME, OwnerValueBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerDateTimeValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OwnerDateTimeValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "OwnerDateTimeValue")
    public JAXBElement<OwnerDateTimeValue> createOwnerDateTimeValue(OwnerDateTimeValue value) {
        return new JAXBElement<OwnerDateTimeValue>(_OwnerDateTimeValue_QNAME, OwnerDateTimeValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerDoubleValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OwnerDoubleValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "OwnerDoubleValue")
    public JAXBElement<OwnerDoubleValue> createOwnerDoubleValue(OwnerDoubleValue value) {
        return new JAXBElement<OwnerDoubleValue>(_OwnerDoubleValue_QNAME, OwnerDoubleValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerIntValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OwnerIntValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "OwnerIntValue")
    public JAXBElement<OwnerIntValue> createOwnerIntValue(OwnerIntValue value) {
        return new JAXBElement<OwnerIntValue>(_OwnerIntValue_QNAME, OwnerIntValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerStringValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OwnerStringValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "OwnerStringValue")
    public JAXBElement<OwnerStringValue> createOwnerStringValue(OwnerStringValue value) {
        return new JAXBElement<OwnerStringValue>(_OwnerStringValue_QNAME, OwnerStringValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerColorValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OwnerColorValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "OwnerColorValue")
    public JAXBElement<OwnerColorValue> createOwnerColorValue(OwnerColorValue value) {
        return new JAXBElement<OwnerColorValue>(_OwnerColorValue_QNAME, OwnerColorValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerListValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OwnerListValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "OwnerListValue")
    public JAXBElement<OwnerListValue> createOwnerListValue(OwnerListValue value) {
        return new JAXBElement<OwnerListValue>(_OwnerListValue_QNAME, OwnerListValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "SavedFieldContext")
    public JAXBElement<List<String>> createSavedFieldContext(List<String> value) {
        return new JAXBElement<List<String>>(_SavedFieldContext_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOwnerAdditionalFieldsValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOwnerAdditionalFieldsValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "ArrayOfOwnerAdditionalFieldsValue")
    public JAXBElement<ArrayOfOwnerAdditionalFieldsValue> createArrayOfOwnerAdditionalFieldsValue(ArrayOfOwnerAdditionalFieldsValue value) {
        return new JAXBElement<ArrayOfOwnerAdditionalFieldsValue>(_ArrayOfOwnerAdditionalFieldsValue_QNAME, ArrayOfOwnerAdditionalFieldsValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerAdditionalFieldsValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OwnerAdditionalFieldsValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "OwnerAdditionalFieldsValue")
    public JAXBElement<OwnerAdditionalFieldsValue> createOwnerAdditionalFieldsValue(OwnerAdditionalFieldsValue value) {
        return new JAXBElement<OwnerAdditionalFieldsValue>(_OwnerAdditionalFieldsValue_QNAME, OwnerAdditionalFieldsValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddDateTimeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAddDateTimeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "ArrayOfAddDateTimeInfo")
    public JAXBElement<ArrayOfAddDateTimeInfo> createArrayOfAddDateTimeInfo(ArrayOfAddDateTimeInfo value) {
        return new JAXBElement<ArrayOfAddDateTimeInfo>(_ArrayOfAddDateTimeInfo_QNAME, ArrayOfAddDateTimeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDateTimeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddDateTimeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "AddDateTimeInfo")
    public JAXBElement<AddDateTimeInfo> createAddDateTimeInfo(AddDateTimeInfo value) {
        return new JAXBElement<AddDateTimeInfo>(_AddDateTimeInfo_QNAME, AddDateTimeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddFieldInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddFieldInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "AddFieldInfo")
    public JAXBElement<AddFieldInfo> createAddFieldInfo(AddFieldInfo value) {
        return new JAXBElement<AddFieldInfo>(_AddFieldInfo_QNAME, AddFieldInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddDoubleInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAddDoubleInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "ArrayOfAddDoubleInfo")
    public JAXBElement<ArrayOfAddDoubleInfo> createArrayOfAddDoubleInfo(ArrayOfAddDoubleInfo value) {
        return new JAXBElement<ArrayOfAddDoubleInfo>(_ArrayOfAddDoubleInfo_QNAME, ArrayOfAddDoubleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDoubleInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddDoubleInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "AddDoubleInfo")
    public JAXBElement<AddDoubleInfo> createAddDoubleInfo(AddDoubleInfo value) {
        return new JAXBElement<AddDoubleInfo>(_AddDoubleInfo_QNAME, AddDoubleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddIntInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAddIntInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "ArrayOfAddIntInfo")
    public JAXBElement<ArrayOfAddIntInfo> createArrayOfAddIntInfo(ArrayOfAddIntInfo value) {
        return new JAXBElement<ArrayOfAddIntInfo>(_ArrayOfAddIntInfo_QNAME, ArrayOfAddIntInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddIntInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddIntInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "AddIntInfo")
    public JAXBElement<AddIntInfo> createAddIntInfo(AddIntInfo value) {
        return new JAXBElement<AddIntInfo>(_AddIntInfo_QNAME, AddIntInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddStringInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAddStringInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "ArrayOfAddStringInfo")
    public JAXBElement<ArrayOfAddStringInfo> createArrayOfAddStringInfo(ArrayOfAddStringInfo value) {
        return new JAXBElement<ArrayOfAddStringInfo>(_ArrayOfAddStringInfo_QNAME, ArrayOfAddStringInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStringInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddStringInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "AddStringInfo")
    public JAXBElement<AddStringInfo> createAddStringInfo(AddStringInfo value) {
        return new JAXBElement<AddStringInfo>(_AddStringInfo_QNAME, AddStringInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddColorInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAddColorInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "ArrayOfAddColorInfo")
    public JAXBElement<ArrayOfAddColorInfo> createArrayOfAddColorInfo(ArrayOfAddColorInfo value) {
        return new JAXBElement<ArrayOfAddColorInfo>(_ArrayOfAddColorInfo_QNAME, ArrayOfAddColorInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddColorInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddColorInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "AddColorInfo")
    public JAXBElement<AddColorInfo> createAddColorInfo(AddColorInfo value) {
        return new JAXBElement<AddColorInfo>(_AddColorInfo_QNAME, AddColorInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddListInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAddListInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "ArrayOfAddListInfo")
    public JAXBElement<ArrayOfAddListInfo> createArrayOfAddListInfo(ArrayOfAddListInfo value) {
        return new JAXBElement<ArrayOfAddListInfo>(_ArrayOfAddListInfo_QNAME, ArrayOfAddListInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddListInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddListInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "AddListInfo")
    public JAXBElement<AddListInfo> createAddListInfo(AddListInfo value) {
        return new JAXBElement<AddListInfo>(_AddListInfo_QNAME, AddListInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionEventsFromDevicesSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionEventsFromDevicesSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionEventsFromDevicesSlimInfo")
    public JAXBElement<ReactionEventsFromDevicesSlimInfo> createReactionEventsFromDevicesSlimInfo(ReactionEventsFromDevicesSlimInfo value) {
        return new JAXBElement<ReactionEventsFromDevicesSlimInfo>(_ReactionEventsFromDevicesSlimInfo_QNAME, ReactionEventsFromDevicesSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionEventsFromDevicesSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionEventsFromDevicesSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionEventsFromDevicesSaveData")
    public JAXBElement<ReactionEventsFromDevicesSaveData> createReactionEventsFromDevicesSaveData(ReactionEventsFromDevicesSaveData value) {
        return new JAXBElement<ReactionEventsFromDevicesSaveData>(_ReactionEventsFromDevicesSaveData_QNAME, ReactionEventsFromDevicesSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionEventSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionEventSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionEventSlimInfo")
    public JAXBElement<ReactionEventSlimInfo> createReactionEventSlimInfo(ReactionEventSlimInfo value) {
        return new JAXBElement<ReactionEventSlimInfo>(_ReactionEventSlimInfo_QNAME, ReactionEventSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionEventSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionEventSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionEventSaveData")
    public JAXBElement<ReactionEventSaveData> createReactionEventSaveData(ReactionEventSaveData value) {
        return new JAXBElement<ReactionEventSaveData>(_ReactionEventSaveData_QNAME, ReactionEventSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionEventType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionEventType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionEventType")
    public JAXBElement<ReactionEventType> createReactionEventType(ReactionEventType value) {
        return new JAXBElement<ReactionEventType>(_ReactionEventType_QNAME, ReactionEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReactionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfReactionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ArrayOfReactionSlimInfo")
    public JAXBElement<ArrayOfReactionSlimInfo> createArrayOfReactionSlimInfo(ArrayOfReactionSlimInfo value) {
        return new JAXBElement<ArrayOfReactionSlimInfo>(_ArrayOfReactionSlimInfo_QNAME, ArrayOfReactionSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionSlimInfo")
    public JAXBElement<ReactionSlimInfo> createReactionSlimInfo(ReactionSlimInfo value) {
        return new JAXBElement<ReactionSlimInfo>(_ReactionSlimInfo_QNAME, ReactionSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionFullInfo")
    public JAXBElement<ReactionFullInfo> createReactionFullInfo(ReactionFullInfo value) {
        return new JAXBElement<ReactionFullInfo>(_ReactionFullInfo_QNAME, ReactionFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReactionActionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfReactionActionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ArrayOfReactionActionSlimInfo")
    public JAXBElement<ArrayOfReactionActionSlimInfo> createArrayOfReactionActionSlimInfo(ArrayOfReactionActionSlimInfo value) {
        return new JAXBElement<ArrayOfReactionActionSlimInfo>(_ArrayOfReactionActionSlimInfo_QNAME, ArrayOfReactionActionSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionActionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionActionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionActionSlimInfo")
    public JAXBElement<ReactionActionSlimInfo> createReactionActionSlimInfo(ReactionActionSlimInfo value) {
        return new JAXBElement<ReactionActionSlimInfo>(_ReactionActionSlimInfo_QNAME, ReactionActionSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionActionSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionActionSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionActionSaveData")
    public JAXBElement<ReactionActionSaveData> createReactionActionSaveData(ReactionActionSaveData value) {
        return new JAXBElement<ReactionActionSaveData>(_ReactionActionSaveData_QNAME, ReactionActionSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionActionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionActionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionActionType")
    public JAXBElement<ReactionActionType> createReactionActionType(ReactionActionType value) {
        return new JAXBElement<ReactionActionType>(_ReactionActionType_QNAME, ReactionActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReactionEventSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfReactionEventSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ArrayOfReactionEventSlimInfo")
    public JAXBElement<ArrayOfReactionEventSlimInfo> createArrayOfReactionEventSlimInfo(ArrayOfReactionEventSlimInfo value) {
        return new JAXBElement<ArrayOfReactionEventSlimInfo>(_ArrayOfReactionEventSlimInfo_QNAME, ArrayOfReactionEventSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionSendSMSActionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionSendSMSActionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionSendSMSActionSlimInfo")
    public JAXBElement<ReactionSendSMSActionSlimInfo> createReactionSendSMSActionSlimInfo(ReactionSendSMSActionSlimInfo value) {
        return new JAXBElement<ReactionSendSMSActionSlimInfo>(_ReactionSendSMSActionSlimInfo_QNAME, ReactionSendSMSActionSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionSendSMSActionSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionSendSMSActionSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionSendSMSActionSaveData")
    public JAXBElement<ReactionSendSMSActionSaveData> createReactionSendSMSActionSaveData(ReactionSendSMSActionSaveData value) {
        return new JAXBElement<ReactionSendSMSActionSaveData>(_ReactionSendSMSActionSaveData_QNAME, ReactionSendSMSActionSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionSendEmailActionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionSendEmailActionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionSendEmailActionSlimInfo")
    public JAXBElement<ReactionSendEmailActionSlimInfo> createReactionSendEmailActionSlimInfo(ReactionSendEmailActionSlimInfo value) {
        return new JAXBElement<ReactionSendEmailActionSlimInfo>(_ReactionSendEmailActionSlimInfo_QNAME, ReactionSendEmailActionSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionSendEmailActionSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionSendEmailActionSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionSendEmailActionSaveData")
    public JAXBElement<ReactionSendEmailActionSaveData> createReactionSendEmailActionSaveData(ReactionSendEmailActionSaveData value) {
        return new JAXBElement<ReactionSendEmailActionSaveData>(_ReactionSendEmailActionSaveData_QNAME, ReactionSendEmailActionSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionExecuteProgramActionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionExecuteProgramActionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionExecuteProgramActionSlimInfo")
    public JAXBElement<ReactionExecuteProgramActionSlimInfo> createReactionExecuteProgramActionSlimInfo(ReactionExecuteProgramActionSlimInfo value) {
        return new JAXBElement<ReactionExecuteProgramActionSlimInfo>(_ReactionExecuteProgramActionSlimInfo_QNAME, ReactionExecuteProgramActionSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionExecuteProgramActionSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionExecuteProgramActionSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionExecuteProgramActionSaveData")
    public JAXBElement<ReactionExecuteProgramActionSaveData> createReactionExecuteProgramActionSaveData(ReactionExecuteProgramActionSaveData value) {
        return new JAXBElement<ReactionExecuteProgramActionSaveData>(_ReactionExecuteProgramActionSaveData_QNAME, ReactionExecuteProgramActionSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionRecordVideoActionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionRecordVideoActionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionRecordVideoActionSlimInfo")
    public JAXBElement<ReactionRecordVideoActionSlimInfo> createReactionRecordVideoActionSlimInfo(ReactionRecordVideoActionSlimInfo value) {
        return new JAXBElement<ReactionRecordVideoActionSlimInfo>(_ReactionRecordVideoActionSlimInfo_QNAME, ReactionRecordVideoActionSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionRecordVideoActionSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionRecordVideoActionSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionRecordVideoActionSaveData")
    public JAXBElement<ReactionRecordVideoActionSaveData> createReactionRecordVideoActionSaveData(ReactionRecordVideoActionSaveData value) {
        return new JAXBElement<ReactionRecordVideoActionSaveData>(_ReactionRecordVideoActionSaveData_QNAME, ReactionRecordVideoActionSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ReactionSaveData")
    public JAXBElement<ReactionSaveData> createReactionSaveData(ReactionSaveData value) {
        return new JAXBElement<ReactionSaveData>(_ReactionSaveData_QNAME, ReactionSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhotoBankShort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPhotoBankShort }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PhotoBank", name = "ArrayOfPhotoBankShort")
    public JAXBElement<ArrayOfPhotoBankShort> createArrayOfPhotoBankShort(ArrayOfPhotoBankShort value) {
        return new JAXBElement<ArrayOfPhotoBankShort>(_ArrayOfPhotoBankShort_QNAME, ArrayOfPhotoBankShort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhotoBankShort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhotoBankShort }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PhotoBank", name = "PhotoBankShort")
    public JAXBElement<PhotoBankShort> createPhotoBankShort(PhotoBankShort value) {
        return new JAXBElement<PhotoBankShort>(_PhotoBankShort_QNAME, PhotoBankShort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkplaceInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkplaceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "ArrayOfWorkplaceInfo")
    public JAXBElement<ArrayOfWorkplaceInfo> createArrayOfWorkplaceInfo(ArrayOfWorkplaceInfo value) {
        return new JAXBElement<ArrayOfWorkplaceInfo>(_ArrayOfWorkplaceInfo_QNAME, ArrayOfWorkplaceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkplaceInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkplaceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "WorkplaceInfo")
    public JAXBElement<WorkplaceInfo> createWorkplaceInfo(WorkplaceInfo value) {
        return new JAXBElement<WorkplaceInfo>(_WorkplaceInfo_QNAME, WorkplaceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkplaceSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkplaceSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "WorkplaceSaveData")
    public JAXBElement<WorkplaceSaveData> createWorkplaceSaveData(WorkplaceSaveData value) {
        return new JAXBElement<WorkplaceSaveData>(_WorkplaceSaveData_QNAME, WorkplaceSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FavoriteType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FavoriteType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "FavoriteType")
    public JAXBElement<FavoriteType> createFavoriteType(FavoriteType value) {
        return new JAXBElement<FavoriteType>(_FavoriteType_QNAME, FavoriteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkplaceModuleInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkplaceModuleInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "ArrayOfWorkplaceModuleInfo")
    public JAXBElement<ArrayOfWorkplaceModuleInfo> createArrayOfWorkplaceModuleInfo(ArrayOfWorkplaceModuleInfo value) {
        return new JAXBElement<ArrayOfWorkplaceModuleInfo>(_ArrayOfWorkplaceModuleInfo_QNAME, ArrayOfWorkplaceModuleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkplaceModuleInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkplaceModuleInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "WorkplaceModuleInfo")
    public JAXBElement<WorkplaceModuleInfo> createWorkplaceModuleInfo(WorkplaceModuleInfo value) {
        return new JAXBElement<WorkplaceModuleInfo>(_WorkplaceModuleInfo_QNAME, WorkplaceModuleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkplaceModuleSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkplaceModuleSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "WorkplaceModuleSaveData")
    public JAXBElement<WorkplaceModuleSaveData> createWorkplaceModuleSaveData(WorkplaceModuleSaveData value) {
        return new JAXBElement<WorkplaceModuleSaveData>(_WorkplaceModuleSaveData_QNAME, WorkplaceModuleSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkplaceModuleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkplaceModuleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "WorkplaceModuleType")
    public JAXBElement<WorkplaceModuleType> createWorkplaceModuleType(WorkplaceModuleType value) {
        return new JAXBElement<WorkplaceModuleType>(_WorkplaceModuleType_QNAME, WorkplaceModuleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsConfiguratorInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsConfiguratorInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "AcsConfiguratorInfo")
    public JAXBElement<AcsConfiguratorInfo> createAcsConfiguratorInfo(AcsConfiguratorInfo value) {
        return new JAXBElement<AcsConfiguratorInfo>(_AcsConfiguratorInfo_QNAME, AcsConfiguratorInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsConfiguratorSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsConfiguratorSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "AcsConfiguratorSaveData")
    public JAXBElement<AcsConfiguratorSaveData> createAcsConfiguratorSaveData(AcsConfiguratorSaveData value) {
        return new JAXBElement<AcsConfiguratorSaveData>(_AcsConfiguratorSaveData_QNAME, AcsConfiguratorSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSIIDKSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSIIDKSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ArrayOfISS_IIDK_SlimInfo")
    public JAXBElement<ArrayOfISSIIDKSlimInfo> createArrayOfISSIIDKSlimInfo(ArrayOfISSIIDKSlimInfo value) {
        return new JAXBElement<ArrayOfISSIIDKSlimInfo>(_ArrayOfISSIIDKSlimInfo_QNAME, ArrayOfISSIIDKSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISSIIDKSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISSIIDKSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_IIDK_SlimInfo")
    public JAXBElement<ISSIIDKSlimInfo> createISSIIDKSlimInfo(ISSIIDKSlimInfo value) {
        return new JAXBElement<ISSIIDKSlimInfo>(_ISSIIDKSlimInfo_QNAME, ISSIIDKSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISSIIDKSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISSIIDKSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_IIDK_SaveData")
    public JAXBElement<ISSIIDKSaveData> createISSIIDKSaveData(ISSIIDKSaveData value) {
        return new JAXBElement<ISSIIDKSaveData>(_ISSIIDKSaveData_QNAME, ISSIIDKSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSSlaveSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSSlaveSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ArrayOfISS_Slave_SlimInfo")
    public JAXBElement<ArrayOfISSSlaveSlimInfo> createArrayOfISSSlaveSlimInfo(ArrayOfISSSlaveSlimInfo value) {
        return new JAXBElement<ArrayOfISSSlaveSlimInfo>(_ArrayOfISSSlaveSlimInfo_QNAME, ArrayOfISSSlaveSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISSSlaveSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISSSlaveSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_Slave_SlimInfo")
    public JAXBElement<ISSSlaveSlimInfo> createISSSlaveSlimInfo(ISSSlaveSlimInfo value) {
        return new JAXBElement<ISSSlaveSlimInfo>(_ISSSlaveSlimInfo_QNAME, ISSSlaveSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISSEntityBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISSEntityBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_Entity_Base")
    public JAXBElement<ISSEntityBase> createISSEntityBase(ISSEntityBase value) {
        return new JAXBElement<ISSEntityBase>(_ISSEntityBase_QNAME, ISSEntityBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSDisplaySlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSDisplaySlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ArrayOfISS_Display_SlimInfo")
    public JAXBElement<ArrayOfISSDisplaySlimInfo> createArrayOfISSDisplaySlimInfo(ArrayOfISSDisplaySlimInfo value) {
        return new JAXBElement<ArrayOfISSDisplaySlimInfo>(_ArrayOfISSDisplaySlimInfo_QNAME, ArrayOfISSDisplaySlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISSDisplaySlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISSDisplaySlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_Display_SlimInfo")
    public JAXBElement<ISSDisplaySlimInfo> createISSDisplaySlimInfo(ISSDisplaySlimInfo value) {
        return new JAXBElement<ISSDisplaySlimInfo>(_ISSDisplaySlimInfo_QNAME, ISSDisplaySlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSEventViewerSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSEventViewerSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ArrayOfISS_EventViewer_SlimInfo")
    public JAXBElement<ArrayOfISSEventViewerSlimInfo> createArrayOfISSEventViewerSlimInfo(ArrayOfISSEventViewerSlimInfo value) {
        return new JAXBElement<ArrayOfISSEventViewerSlimInfo>(_ArrayOfISSEventViewerSlimInfo_QNAME, ArrayOfISSEventViewerSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISSEventViewerSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISSEventViewerSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_EventViewer_SlimInfo")
    public JAXBElement<ISSEventViewerSlimInfo> createISSEventViewerSlimInfo(ISSEventViewerSlimInfo value) {
        return new JAXBElement<ISSEventViewerSlimInfo>(_ISSEventViewerSlimInfo_QNAME, ISSEventViewerSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSMonitorSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSMonitorSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ArrayOfISS_Monitor_SlimInfo")
    public JAXBElement<ArrayOfISSMonitorSlimInfo> createArrayOfISSMonitorSlimInfo(ArrayOfISSMonitorSlimInfo value) {
        return new JAXBElement<ArrayOfISSMonitorSlimInfo>(_ArrayOfISSMonitorSlimInfo_QNAME, ArrayOfISSMonitorSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISSMonitorSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISSMonitorSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_Monitor_SlimInfo")
    public JAXBElement<ISSMonitorSlimInfo> createISSMonitorSlimInfo(ISSMonitorSlimInfo value) {
        return new JAXBElement<ISSMonitorSlimInfo>(_ISSMonitorSlimInfo_QNAME, ISSMonitorSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSCamSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSCamSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ArrayOfISS_Cam_SlimInfo")
    public JAXBElement<ArrayOfISSCamSlimInfo> createArrayOfISSCamSlimInfo(ArrayOfISSCamSlimInfo value) {
        return new JAXBElement<ArrayOfISSCamSlimInfo>(_ArrayOfISSCamSlimInfo_QNAME, ArrayOfISSCamSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISSCamSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISSCamSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_Cam_SlimInfo")
    public JAXBElement<ISSCamSlimInfo> createISSCamSlimInfo(ISSCamSlimInfo value) {
        return new JAXBElement<ISSCamSlimInfo>(_ISSCamSlimInfo_QNAME, ISSCamSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSIntegrationPointSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSIntegrationPointSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ArrayOfISS_IntegrationPoint_SlimInfo")
    public JAXBElement<ArrayOfISSIntegrationPointSlimInfo> createArrayOfISSIntegrationPointSlimInfo(ArrayOfISSIntegrationPointSlimInfo value) {
        return new JAXBElement<ArrayOfISSIntegrationPointSlimInfo>(_ArrayOfISSIntegrationPointSlimInfo_QNAME, ArrayOfISSIntegrationPointSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISSIntegrationPointSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISSIntegrationPointSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_IntegrationPoint_SlimInfo")
    public JAXBElement<ISSIntegrationPointSlimInfo> createISSIntegrationPointSlimInfo(ISSIntegrationPointSlimInfo value) {
        return new JAXBElement<ISSIntegrationPointSlimInfo>(_ISSIntegrationPointSlimInfo_QNAME, ISSIntegrationPointSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSRusGuardSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSRusGuardSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ArrayOfISS_RusGuard_SlimInfo")
    public JAXBElement<ArrayOfISSRusGuardSlimInfo> createArrayOfISSRusGuardSlimInfo(ArrayOfISSRusGuardSlimInfo value) {
        return new JAXBElement<ArrayOfISSRusGuardSlimInfo>(_ArrayOfISSRusGuardSlimInfo_QNAME, ArrayOfISSRusGuardSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISSRusGuardSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISSRusGuardSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_RusGuard_SlimInfo")
    public JAXBElement<ISSRusGuardSlimInfo> createISSRusGuardSlimInfo(ISSRusGuardSlimInfo value) {
        return new JAXBElement<ISSRusGuardSlimInfo>(_ISSRusGuardSlimInfo_QNAME, ISSRusGuardSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSRecognitionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSRecognitionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ArrayOfISS_Recognition_SlimInfo")
    public JAXBElement<ArrayOfISSRecognitionSlimInfo> createArrayOfISSRecognitionSlimInfo(ArrayOfISSRecognitionSlimInfo value) {
        return new JAXBElement<ArrayOfISSRecognitionSlimInfo>(_ArrayOfISSRecognitionSlimInfo_QNAME, ArrayOfISSRecognitionSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISSRecognitionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISSRecognitionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_Recognition_SlimInfo")
    public JAXBElement<ISSRecognitionSlimInfo> createISSRecognitionSlimInfo(ISSRecognitionSlimInfo value) {
        return new JAXBElement<ISSRecognitionSlimInfo>(_ISSRecognitionSlimInfo_QNAME, ISSRecognitionSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISSRecognitionSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISSRecognitionSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_Recognition_SaveData")
    public JAXBElement<ISSRecognitionSaveData> createISSRecognitionSaveData(ISSRecognitionSaveData value) {
        return new JAXBElement<ISSRecognitionSaveData>(_ISSRecognitionSaveData_QNAME, ISSRecognitionSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSDriverSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSDriverSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ArrayOfISS_Driver_SlimInfo")
    public JAXBElement<ArrayOfISSDriverSlimInfo> createArrayOfISSDriverSlimInfo(ArrayOfISSDriverSlimInfo value) {
        return new JAXBElement<ArrayOfISSDriverSlimInfo>(_ArrayOfISSDriverSlimInfo_QNAME, ArrayOfISSDriverSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISSDriverSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISSDriverSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_Driver_SlimInfo")
    public JAXBElement<ISSDriverSlimInfo> createISSDriverSlimInfo(ISSDriverSlimInfo value) {
        return new JAXBElement<ISSDriverSlimInfo>(_ISSDriverSlimInfo_QNAME, ISSDriverSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISSDriverSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISSDriverSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_Driver_SaveData")
    public JAXBElement<ISSDriverSaveData> createISSDriverSaveData(ISSDriverSaveData value) {
        return new JAXBElement<ISSDriverSaveData>(_ISSDriverSaveData_QNAME, ISSDriverSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSDriverEventPlaybackSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSDriverEventPlaybackSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ArrayOfISS_DriverEventPlaybackSlimInfo")
    public JAXBElement<ArrayOfISSDriverEventPlaybackSlimInfo> createArrayOfISSDriverEventPlaybackSlimInfo(ArrayOfISSDriverEventPlaybackSlimInfo value) {
        return new JAXBElement<ArrayOfISSDriverEventPlaybackSlimInfo>(_ArrayOfISSDriverEventPlaybackSlimInfo_QNAME, ArrayOfISSDriverEventPlaybackSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISSDriverEventPlaybackSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISSDriverEventPlaybackSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_DriverEventPlaybackSlimInfo")
    public JAXBElement<ISSDriverEventPlaybackSlimInfo> createISSDriverEventPlaybackSlimInfo(ISSDriverEventPlaybackSlimInfo value) {
        return new JAXBElement<ISSDriverEventPlaybackSlimInfo>(_ISSDriverEventPlaybackSlimInfo_QNAME, ISSDriverEventPlaybackSlimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ISSDriverEventPlaybackSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ISSDriverEventPlaybackSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_DriverEventPlaybackSaveData")
    public JAXBElement<ISSDriverEventPlaybackSaveData> createISSDriverEventPlaybackSaveData(ISSDriverEventPlaybackSaveData value) {
        return new JAXBElement<ISSDriverEventPlaybackSaveData>(_ISSDriverEventPlaybackSaveData_QNAME, ISSDriverEventPlaybackSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUidKeyInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfUidKeyInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "ArrayOfUidKeyInfo")
    public JAXBElement<ArrayOfUidKeyInfo> createArrayOfUidKeyInfo(ArrayOfUidKeyInfo value) {
        return new JAXBElement<ArrayOfUidKeyInfo>(_ArrayOfUidKeyInfo_QNAME, ArrayOfUidKeyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UidKeyInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UidKeyInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "UidKeyInfo")
    public JAXBElement<UidKeyInfo> createUidKeyInfo(UidKeyInfo value) {
        return new JAXBElement<UidKeyInfo>(_UidKeyInfo_QNAME, UidKeyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "ProfileTypeFilter")
    public JAXBElement<List<String>> createProfileTypeFilter(List<String> value) {
        return new JAXBElement<List<String>>(_ProfileTypeFilter_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMifareProfileInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMifareProfileInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "ArrayOfMifareProfileInfo")
    public JAXBElement<ArrayOfMifareProfileInfo> createArrayOfMifareProfileInfo(ArrayOfMifareProfileInfo value) {
        return new JAXBElement<ArrayOfMifareProfileInfo>(_ArrayOfMifareProfileInfo_QNAME, ArrayOfMifareProfileInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MifareProfileInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MifareProfileInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "MifareProfileInfo")
    public JAXBElement<MifareProfileInfo> createMifareProfileInfo(MifareProfileInfo value) {
        return new JAXBElement<MifareProfileInfo>(_MifareProfileInfo_QNAME, MifareProfileInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MifareProfileSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MifareProfileSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "MifareProfileSaveData")
    public JAXBElement<MifareProfileSaveData> createMifareProfileSaveData(MifareProfileSaveData value) {
        return new JAXBElement<MifareProfileSaveData>(_MifareProfileSaveData_QNAME, MifareProfileSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SectorAuthentication }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SectorAuthentication }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "SectorAuthentication")
    public JAXBElement<SectorAuthentication> createSectorAuthentication(SectorAuthentication value) {
        return new JAXBElement<SectorAuthentication>(_SectorAuthentication_QNAME, SectorAuthentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProfileType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "ProfileType")
    public JAXBElement<ProfileType> createProfileType(ProfileType value) {
        return new JAXBElement<ProfileType>(_ProfileType_QNAME, ProfileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MifareProfileFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MifareProfileFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "MifareProfileFullInfo")
    public JAXBElement<MifareProfileFullInfo> createMifareProfileFullInfo(MifareProfileFullInfo value) {
        return new JAXBElement<MifareProfileFullInfo>(_MifareProfileFullInfo_QNAME, MifareProfileFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MifareProfileFullSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MifareProfileFullSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "MifareProfileFullSaveData")
    public JAXBElement<MifareProfileFullSaveData> createMifareProfileFullSaveData(MifareProfileFullSaveData value) {
        return new JAXBElement<MifareProfileFullSaveData>(_MifareProfileFullSaveData_QNAME, MifareProfileFullSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessBits }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessBits }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "AccessBits")
    public JAXBElement<AccessBits> createAccessBits(AccessBits value) {
        return new JAXBElement<AccessBits>(_AccessBits_QNAME, AccessBits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BlockData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "BlockData")
    public JAXBElement<BlockData> createBlockData(BlockData value) {
        return new JAXBElement<BlockData>(_BlockData_QNAME, BlockData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmissionProtectionLevel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmissionProtectionLevel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "EmissionProtectionLevel")
    public JAXBElement<EmissionProtectionLevel> createEmissionProtectionLevel(EmissionProtectionLevel value) {
        return new JAXBElement<EmissionProtectionLevel>(_EmissionProtectionLevel_QNAME, EmissionProtectionLevel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreenLayoutInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScreenLayoutInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", name = "ScreenLayoutInfo")
    public JAXBElement<ScreenLayoutInfo> createScreenLayoutInfo(ScreenLayoutInfo value) {
        return new JAXBElement<ScreenLayoutInfo>(_ScreenLayoutInfo_QNAME, ScreenLayoutInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreenLayoutSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScreenLayoutSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", name = "ScreenLayoutSaveData")
    public JAXBElement<ScreenLayoutSaveData> createScreenLayoutSaveData(ScreenLayoutSaveData value) {
        return new JAXBElement<ScreenLayoutSaveData>(_ScreenLayoutSaveData_QNAME, ScreenLayoutSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreenAspectRatio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScreenAspectRatio }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", name = "ScreenAspectRatio")
    public JAXBElement<ScreenAspectRatio> createScreenAspectRatio(ScreenAspectRatio value) {
        return new JAXBElement<ScreenAspectRatio>(_ScreenAspectRatio_QNAME, ScreenAspectRatio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreenScaleMode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScreenScaleMode }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", name = "ScreenScaleMode")
    public JAXBElement<ScreenScaleMode> createScreenScaleMode(ScreenScaleMode value) {
        return new JAXBElement<ScreenScaleMode>(_ScreenScaleMode_QNAME, ScreenScaleMode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreenCellTreeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScreenCellTreeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", name = "ScreenCellTreeInfo")
    public JAXBElement<ScreenCellTreeInfo> createScreenCellTreeInfo(ScreenCellTreeInfo value) {
        return new JAXBElement<ScreenCellTreeInfo>(_ScreenCellTreeInfo_QNAME, ScreenCellTreeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreenCellInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScreenCellInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", name = "ScreenCellInfo")
    public JAXBElement<ScreenCellInfo> createScreenCellInfo(ScreenCellInfo value) {
        return new JAXBElement<ScreenCellInfo>(_ScreenCellInfo_QNAME, ScreenCellInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreenCellSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScreenCellSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", name = "ScreenCellSaveData")
    public JAXBElement<ScreenCellSaveData> createScreenCellSaveData(ScreenCellSaveData value) {
        return new JAXBElement<ScreenCellSaveData>(_ScreenCellSaveData_QNAME, ScreenCellSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreenCellContentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScreenCellContentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", name = "ScreenCellContentType")
    public JAXBElement<ScreenCellContentType> createScreenCellContentType(ScreenCellContentType value) {
        return new JAXBElement<ScreenCellContentType>(_ScreenCellContentType_QNAME, ScreenCellContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfScreenCellTreeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfScreenCellTreeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", name = "ArrayOfScreenCellTreeInfo")
    public JAXBElement<ArrayOfScreenCellTreeInfo> createArrayOfScreenCellTreeInfo(ArrayOfScreenCellTreeInfo value) {
        return new JAXBElement<ArrayOfScreenCellTreeInfo>(_ArrayOfScreenCellTreeInfo_QNAME, ArrayOfScreenCellTreeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfScreenCellSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfScreenCellSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", name = "ArrayOfScreenCellSaveData")
    public JAXBElement<ArrayOfScreenCellSaveData> createArrayOfScreenCellSaveData(ArrayOfScreenCellSaveData value) {
        return new JAXBElement<ArrayOfScreenCellSaveData>(_ArrayOfScreenCellSaveData_QNAME, ArrayOfScreenCellSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfScreenCellInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfScreenCellInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", name = "ArrayOfScreenCellInfo")
    public JAXBElement<ArrayOfScreenCellInfo> createArrayOfScreenCellInfo(ArrayOfScreenCellInfo value) {
        return new JAXBElement<ArrayOfScreenCellInfo>(_ArrayOfScreenCellInfo_QNAME, ArrayOfScreenCellInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIvideonCameraDriverInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfIvideonCameraDriverInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IvidionCamera", name = "ArrayOfIvideonCameraDriverInfo")
    public JAXBElement<ArrayOfIvideonCameraDriverInfo> createArrayOfIvideonCameraDriverInfo(ArrayOfIvideonCameraDriverInfo value) {
        return new JAXBElement<ArrayOfIvideonCameraDriverInfo>(_ArrayOfIvideonCameraDriverInfo_QNAME, ArrayOfIvideonCameraDriverInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IvideonCameraDriverInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IvideonCameraDriverInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IvidionCamera", name = "IvideonCameraDriverInfo")
    public JAXBElement<IvideonCameraDriverInfo> createIvideonCameraDriverInfo(IvideonCameraDriverInfo value) {
        return new JAXBElement<IvideonCameraDriverInfo>(_IvideonCameraDriverInfo_QNAME, IvideonCameraDriverInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CameraProductType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CameraProductType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IvidionCamera", name = "CameraProductType")
    public JAXBElement<CameraProductType> createCameraProductType(CameraProductType value) {
        return new JAXBElement<CameraProductType>(_CameraProductType_QNAME, CameraProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAddressOwner }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmailAddressOwner }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "EmailAddressOwner")
    public JAXBElement<EmailAddressOwner> createEmailAddressOwner(EmailAddressOwner value) {
        return new JAXBElement<EmailAddressOwner>(_EmailAddressOwner_QNAME, EmailAddressOwner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmailAddressInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmailAddressInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "ArrayOfEmailAddressInfo")
    public JAXBElement<ArrayOfEmailAddressInfo> createArrayOfEmailAddressInfo(ArrayOfEmailAddressInfo value) {
        return new JAXBElement<ArrayOfEmailAddressInfo>(_ArrayOfEmailAddressInfo_QNAME, ArrayOfEmailAddressInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAddressInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmailAddressInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "EmailAddressInfo")
    public JAXBElement<EmailAddressInfo> createEmailAddressInfo(EmailAddressInfo value) {
        return new JAXBElement<EmailAddressInfo>(_EmailAddressInfo_QNAME, EmailAddressInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailAddressSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmailAddressSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "EmailAddressSaveData")
    public JAXBElement<EmailAddressSaveData> createEmailAddressSaveData(EmailAddressSaveData value) {
        return new JAXBElement<EmailAddressSaveData>(_EmailAddressSaveData_QNAME, EmailAddressSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberOwner }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneNumberOwner }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "PhoneNumberOwner")
    public JAXBElement<PhoneNumberOwner> createPhoneNumberOwner(PhoneNumberOwner value) {
        return new JAXBElement<PhoneNumberOwner>(_PhoneNumberOwner_QNAME, PhoneNumberOwner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhoneNumberInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPhoneNumberInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "ArrayOfPhoneNumberInfo")
    public JAXBElement<ArrayOfPhoneNumberInfo> createArrayOfPhoneNumberInfo(ArrayOfPhoneNumberInfo value) {
        return new JAXBElement<ArrayOfPhoneNumberInfo>(_ArrayOfPhoneNumberInfo_QNAME, ArrayOfPhoneNumberInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneNumberInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "PhoneNumberInfo")
    public JAXBElement<PhoneNumberInfo> createPhoneNumberInfo(PhoneNumberInfo value) {
        return new JAXBElement<PhoneNumberInfo>(_PhoneNumberInfo_QNAME, PhoneNumberInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneNumberSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneNumberSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "PhoneNumberSaveData")
    public JAXBElement<PhoneNumberSaveData> createPhoneNumberSaveData(PhoneNumberSaveData value) {
        return new JAXBElement<PhoneNumberSaveData>(_PhoneNumberSaveData_QNAME, PhoneNumberSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmailDistributionAddressInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmailDistributionAddressInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "ArrayOfEmailDistributionAddressInfo")
    public JAXBElement<ArrayOfEmailDistributionAddressInfo> createArrayOfEmailDistributionAddressInfo(ArrayOfEmailDistributionAddressInfo value) {
        return new JAXBElement<ArrayOfEmailDistributionAddressInfo>(_ArrayOfEmailDistributionAddressInfo_QNAME, ArrayOfEmailDistributionAddressInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailDistributionAddressInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmailDistributionAddressInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "EmailDistributionAddressInfo")
    public JAXBElement<EmailDistributionAddressInfo> createEmailDistributionAddressInfo(EmailDistributionAddressInfo value) {
        return new JAXBElement<EmailDistributionAddressInfo>(_EmailDistributionAddressInfo_QNAME, EmailDistributionAddressInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailDistributionAddressSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmailDistributionAddressSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "EmailDistributionAddressSaveData")
    public JAXBElement<EmailDistributionAddressSaveData> createEmailDistributionAddressSaveData(EmailDistributionAddressSaveData value) {
        return new JAXBElement<EmailDistributionAddressSaveData>(_EmailDistributionAddressSaveData_QNAME, EmailDistributionAddressSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmtpEncryptionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SmtpEncryptionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "SmtpEncryptionType")
    public JAXBElement<SmtpEncryptionType> createSmtpEncryptionType(SmtpEncryptionType value) {
        return new JAXBElement<SmtpEncryptionType>(_SmtpEncryptionType_QNAME, SmtpEncryptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMifareProfileTagsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMifareProfileTagsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "ArrayOfMifareProfileTagsData")
    public JAXBElement<ArrayOfMifareProfileTagsData> createArrayOfMifareProfileTagsData(ArrayOfMifareProfileTagsData value) {
        return new JAXBElement<ArrayOfMifareProfileTagsData>(_ArrayOfMifareProfileTagsData_QNAME, ArrayOfMifareProfileTagsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MifareProfileTagsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MifareProfileTagsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "MifareProfileTagsData")
    public JAXBElement<MifareProfileTagsData> createMifareProfileTagsData(MifareProfileTagsData value) {
        return new JAXBElement<MifareProfileTagsData>(_MifareProfileTagsData_QNAME, MifareProfileTagsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TagFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TagFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "TagFullInfo")
    public JAXBElement<TagFullInfo> createTagFullInfo(TagFullInfo value) {
        return new JAXBElement<TagFullInfo>(_TagFullInfo_QNAME, TagFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReportTagsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfReportTagsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "ArrayOfReportTagsData")
    public JAXBElement<ArrayOfReportTagsData> createArrayOfReportTagsData(ArrayOfReportTagsData value) {
        return new JAXBElement<ArrayOfReportTagsData>(_ArrayOfReportTagsData_QNAME, ArrayOfReportTagsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportTagsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportTagsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "ReportTagsData")
    public JAXBElement<ReportTagsData> createReportTagsData(ReportTagsData value) {
        return new JAXBElement<ReportTagsData>(_ReportTagsData_QNAME, ReportTagsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeGroupTagsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeeGroupTagsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "ArrayOfEmployeeGroupTagsData")
    public JAXBElement<ArrayOfEmployeeGroupTagsData> createArrayOfEmployeeGroupTagsData(ArrayOfEmployeeGroupTagsData value) {
        return new JAXBElement<ArrayOfEmployeeGroupTagsData>(_ArrayOfEmployeeGroupTagsData_QNAME, ArrayOfEmployeeGroupTagsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeGroupTagsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeGroupTagsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "EmployeeGroupTagsData")
    public JAXBElement<EmployeeGroupTagsData> createEmployeeGroupTagsData(EmployeeGroupTagsData value) {
        return new JAXBElement<EmployeeGroupTagsData>(_EmployeeGroupTagsData_QNAME, EmployeeGroupTagsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccessLevelTagsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAccessLevelTagsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "ArrayOfAccessLevelTagsData")
    public JAXBElement<ArrayOfAccessLevelTagsData> createArrayOfAccessLevelTagsData(ArrayOfAccessLevelTagsData value) {
        return new JAXBElement<ArrayOfAccessLevelTagsData>(_ArrayOfAccessLevelTagsData_QNAME, ArrayOfAccessLevelTagsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessLevelTagsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessLevelTagsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "AccessLevelTagsData")
    public JAXBElement<AccessLevelTagsData> createAccessLevelTagsData(AccessLevelTagsData value) {
        return new JAXBElement<AccessLevelTagsData>(_AccessLevelTagsData_QNAME, AccessLevelTagsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBoxAccessLevelTagsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBoxAccessLevelTagsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "ArrayOfBoxAccessLevelTagsData")
    public JAXBElement<ArrayOfBoxAccessLevelTagsData> createArrayOfBoxAccessLevelTagsData(ArrayOfBoxAccessLevelTagsData value) {
        return new JAXBElement<ArrayOfBoxAccessLevelTagsData>(_ArrayOfBoxAccessLevelTagsData_QNAME, ArrayOfBoxAccessLevelTagsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoxAccessLevelTagsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BoxAccessLevelTagsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "BoxAccessLevelTagsData")
    public JAXBElement<BoxAccessLevelTagsData> createBoxAccessLevelTagsData(BoxAccessLevelTagsData value) {
        return new JAXBElement<BoxAccessLevelTagsData>(_BoxAccessLevelTagsData_QNAME, BoxAccessLevelTagsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResourceTagsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfResourceTagsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "ArrayOfResourceTagsData")
    public JAXBElement<ArrayOfResourceTagsData> createArrayOfResourceTagsData(ArrayOfResourceTagsData value) {
        return new JAXBElement<ArrayOfResourceTagsData>(_ArrayOfResourceTagsData_QNAME, ArrayOfResourceTagsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceTagsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceTagsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "ResourceTagsData")
    public JAXBElement<ResourceTagsData> createResourceTagsData(ResourceTagsData value) {
        return new JAXBElement<ResourceTagsData>(_ResourceTagsData_QNAME, ResourceTagsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfResourceFilterTagsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfResourceFilterTagsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "ArrayOfResourceFilterTagsData")
    public JAXBElement<ArrayOfResourceFilterTagsData> createArrayOfResourceFilterTagsData(ArrayOfResourceFilterTagsData value) {
        return new JAXBElement<ArrayOfResourceFilterTagsData>(_ArrayOfResourceFilterTagsData_QNAME, ArrayOfResourceFilterTagsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceFilterTagsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceFilterTagsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "ResourceFilterTagsData")
    public JAXBElement<ResourceFilterTagsData> createResourceFilterTagsData(ResourceFilterTagsData value) {
        return new JAXBElement<ResourceFilterTagsData>(_ResourceFilterTagsData_QNAME, ResourceFilterTagsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterTagFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FilterTagFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "FilterTagFullInfo")
    public JAXBElement<FilterTagFullInfo> createFilterTagFullInfo(FilterTagFullInfo value) {
        return new JAXBElement<FilterTagFullInfo>(_FilterTagFullInfo_QNAME, FilterTagFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTagFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTagFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "ArrayOfTagFullInfo")
    public JAXBElement<ArrayOfTagFullInfo> createArrayOfTagFullInfo(ArrayOfTagFullInfo value) {
        return new JAXBElement<ArrayOfTagFullInfo>(_ArrayOfTagFullInfo_QNAME, ArrayOfTagFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFilterTagFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFilterTagFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "ArrayOfFilterTagFullInfo")
    public JAXBElement<ArrayOfFilterTagFullInfo> createArrayOfFilterTagFullInfo(ArrayOfFilterTagFullInfo value) {
        return new JAXBElement<ArrayOfFilterTagFullInfo>(_ArrayOfFilterTagFullInfo_QNAME, ArrayOfFilterTagFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TagSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TagSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "TagSaveData")
    public JAXBElement<TagSaveData> createTagSaveData(TagSaveData value) {
        return new JAXBElement<TagSaveData>(_TagSaveData_QNAME, TagSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterTagSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FilterTagSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "FilterTagSaveData")
    public JAXBElement<FilterTagSaveData> createFilterTagSaveData(FilterTagSaveData value) {
        return new JAXBElement<FilterTagSaveData>(_FilterTagSaveData_QNAME, FilterTagSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFavoriteFolderInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFavoriteFolderInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", name = "ArrayOfFavoriteFolderInfo")
    public JAXBElement<ArrayOfFavoriteFolderInfo> createArrayOfFavoriteFolderInfo(ArrayOfFavoriteFolderInfo value) {
        return new JAXBElement<ArrayOfFavoriteFolderInfo>(_ArrayOfFavoriteFolderInfo_QNAME, ArrayOfFavoriteFolderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FavoriteFolderInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FavoriteFolderInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", name = "FavoriteFolderInfo")
    public JAXBElement<FavoriteFolderInfo> createFavoriteFolderInfo(FavoriteFolderInfo value) {
        return new JAXBElement<FavoriteFolderInfo>(_FavoriteFolderInfo_QNAME, FavoriteFolderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FavoriteFolderSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FavoriteFolderSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", name = "FavoriteFolderSaveData")
    public JAXBElement<FavoriteFolderSaveData> createFavoriteFolderSaveData(FavoriteFolderSaveData value) {
        return new JAXBElement<FavoriteFolderSaveData>(_FavoriteFolderSaveData_QNAME, FavoriteFolderSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFavoriteFolderInfoWithEmployeeGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFavoriteFolderInfoWithEmployeeGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", name = "ArrayOfFavoriteFolderInfoWithEmployeeGroup")
    public JAXBElement<ArrayOfFavoriteFolderInfoWithEmployeeGroup> createArrayOfFavoriteFolderInfoWithEmployeeGroup(ArrayOfFavoriteFolderInfoWithEmployeeGroup value) {
        return new JAXBElement<ArrayOfFavoriteFolderInfoWithEmployeeGroup>(_ArrayOfFavoriteFolderInfoWithEmployeeGroup_QNAME, ArrayOfFavoriteFolderInfoWithEmployeeGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FavoriteFolderInfoWithEmployeeGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FavoriteFolderInfoWithEmployeeGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", name = "FavoriteFolderInfoWithEmployeeGroup")
    public JAXBElement<FavoriteFolderInfoWithEmployeeGroup> createFavoriteFolderInfoWithEmployeeGroup(FavoriteFolderInfoWithEmployeeGroup value) {
        return new JAXBElement<FavoriteFolderInfoWithEmployeeGroup>(_FavoriteFolderInfoWithEmployeeGroup_QNAME, FavoriteFolderInfoWithEmployeeGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserPassSlimData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfUserPassSlimData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", name = "ArrayOfUserPassSlimData")
    public JAXBElement<ArrayOfUserPassSlimData> createArrayOfUserPassSlimData(ArrayOfUserPassSlimData value) {
        return new JAXBElement<ArrayOfUserPassSlimData>(_ArrayOfUserPassSlimData_QNAME, ArrayOfUserPassSlimData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserPassSlimData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserPassSlimData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", name = "UserPassSlimData")
    public JAXBElement<UserPassSlimData> createUserPassSlimData(UserPassSlimData value) {
        return new JAXBElement<UserPassSlimData>(_UserPassSlimData_QNAME, UserPassSlimData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserPassSlimSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserPassSlimSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", name = "UserPassSlimSaveData")
    public JAXBElement<UserPassSlimSaveData> createUserPassSlimSaveData(UserPassSlimSaveData value) {
        return new JAXBElement<UserPassSlimSaveData>(_UserPassSlimSaveData_QNAME, UserPassSlimSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserPassFullData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserPassFullData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", name = "UserPassFullData")
    public JAXBElement<UserPassFullData> createUserPassFullData(UserPassFullData value) {
        return new JAXBElement<UserPassFullData>(_UserPassFullData_QNAME, UserPassFullData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserPassFullSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserPassFullSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", name = "UserPassFullSaveData")
    public JAXBElement<UserPassFullSaveData> createUserPassFullSaveData(UserPassFullSaveData value) {
        return new JAXBElement<UserPassFullSaveData>(_UserPassFullSaveData_QNAME, UserPassFullSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassBackgroundType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PassBackgroundType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", name = "PassBackgroundType")
    public JAXBElement<PassBackgroundType> createPassBackgroundType(PassBackgroundType value) {
        return new JAXBElement<PassBackgroundType>(_PassBackgroundType_QNAME, PassBackgroundType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserPassEditorData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfUserPassEditorData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", name = "ArrayOfUserPassEditorData")
    public JAXBElement<ArrayOfUserPassEditorData> createArrayOfUserPassEditorData(ArrayOfUserPassEditorData value) {
        return new JAXBElement<ArrayOfUserPassEditorData>(_ArrayOfUserPassEditorData_QNAME, ArrayOfUserPassEditorData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserPassEditorData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserPassEditorData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", name = "UserPassEditorData")
    public JAXBElement<UserPassEditorData> createUserPassEditorData(UserPassEditorData value) {
        return new JAXBElement<UserPassEditorData>(_UserPassEditorData_QNAME, UserPassEditorData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserPassEditorSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserPassEditorSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", name = "UserPassEditorSaveData")
    public JAXBElement<UserPassEditorSaveData> createUserPassEditorSaveData(UserPassEditorSaveData value) {
        return new JAXBElement<UserPassEditorSaveData>(_UserPassEditorSaveData_QNAME, UserPassEditorSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotificationState }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CommandNotification", name = "NotificationState")
    public JAXBElement<NotificationState> createNotificationState(NotificationState value) {
        return new JAXBElement<NotificationState>(_NotificationState_QNAME, NotificationState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPOBRelation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPOBRelation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PostOffice", name = "ArrayOfPOBRelation")
    public JAXBElement<ArrayOfPOBRelation> createArrayOfPOBRelation(ArrayOfPOBRelation value) {
        return new JAXBElement<ArrayOfPOBRelation>(_ArrayOfPOBRelation_QNAME, ArrayOfPOBRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POBRelation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link POBRelation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PostOffice", name = "POBRelation")
    public JAXBElement<POBRelation> createPOBRelation(POBRelation value) {
        return new JAXBElement<POBRelation>(_POBRelation_QNAME, POBRelation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeBiometricStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeeBiometricStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.EBS", name = "EmployeeBiometricStatus")
    public JAXBElement<EmployeeBiometricStatus> createEmployeeBiometricStatus(EmployeeBiometricStatus value) {
        return new JAXBElement<EmployeeBiometricStatus>(_EmployeeBiometricStatus_QNAME, EmployeeBiometricStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "LUser")
    public JAXBElement<LUser> createLUser(LUser value) {
        return new JAXBElement<LUser>(_LUser_QNAME, LUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSortedColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserSortedColumn }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "UserSortedColumn")
    public JAXBElement<UserSortedColumn> createUserSortedColumn(UserSortedColumn value) {
        return new JAXBElement<UserSortedColumn>(_UserSortedColumn_QNAME, UserSortedColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LUsersData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LUsersData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "LUsersData")
    public JAXBElement<LUsersData> createLUsersData(LUsersData value) {
        return new JAXBElement<LUsersData>(_LUsersData_QNAME, LUsersData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "ArrayOfLUser")
    public JAXBElement<ArrayOfLUser> createArrayOfLUser(ArrayOfLUser value) {
        return new JAXBElement<ArrayOfLUser>(_ArrayOfLUser_QNAME, ArrayOfLUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LUserGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LUserGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "LUserGroup")
    public JAXBElement<LUserGroup> createLUserGroup(LUserGroup value) {
        return new JAXBElement<LUserGroup>(_LUserGroup_QNAME, LUserGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserGroupType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserGroupType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "UserGroupType")
    public JAXBElement<UserGroupType> createUserGroupType(UserGroupType value) {
        return new JAXBElement<UserGroupType>(_UserGroupType_QNAME, UserGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserGroupSortedColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserGroupSortedColumn }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "UserGroupSortedColumn")
    public JAXBElement<UserGroupSortedColumn> createUserGroupSortedColumn(UserGroupSortedColumn value) {
        return new JAXBElement<UserGroupSortedColumn>(_UserGroupSortedColumn_QNAME, UserGroupSortedColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LUserGroupsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LUserGroupsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "LUserGroupsData")
    public JAXBElement<LUserGroupsData> createLUserGroupsData(LUserGroupsData value) {
        return new JAXBElement<LUserGroupsData>(_LUserGroupsData_QNAME, LUserGroupsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLUserGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLUserGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "ArrayOfLUserGroup")
    public JAXBElement<ArrayOfLUserGroup> createArrayOfLUserGroup(ArrayOfLUserGroup value) {
        return new JAXBElement<ArrayOfLUserGroup>(_ArrayOfLUserGroup_QNAME, ArrayOfLUserGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "ClaimInfo")
    public JAXBElement<ClaimInfo> createClaimInfo(ClaimInfo value) {
        return new JAXBElement<ClaimInfo>(_ClaimInfo_QNAME, ClaimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaimSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "ClaimSaveData")
    public JAXBElement<ClaimSaveData> createClaimSaveData(ClaimSaveData value) {
        return new JAXBElement<ClaimSaveData>(_ClaimSaveData_QNAME, ClaimSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClaimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfClaimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "ArrayOfClaimInfo")
    public JAXBElement<ArrayOfClaimInfo> createArrayOfClaimInfo(ArrayOfClaimInfo value) {
        return new JAXBElement<ArrayOfClaimInfo>(_ArrayOfClaimInfo_QNAME, ArrayOfClaimInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardTypeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CardTypeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", name = "CardTypeInfo")
    public JAXBElement<CardTypeInfo> createCardTypeInfo(CardTypeInfo value) {
        return new JAXBElement<CardTypeInfo>(_CardTypeInfo_QNAME, CardTypeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardTypeSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CardTypeSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", name = "CardTypeSaveInfo")
    public JAXBElement<CardTypeSaveInfo> createCardTypeSaveInfo(CardTypeSaveInfo value) {
        return new JAXBElement<CardTypeSaveInfo>(_CardTypeSaveInfo_QNAME, CardTypeSaveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardTypeSortedColumn }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CardTypeSortedColumn }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", name = "CardTypeSortedColumn")
    public JAXBElement<CardTypeSortedColumn> createCardTypeSortedColumn(CardTypeSortedColumn value) {
        return new JAXBElement<CardTypeSortedColumn>(_CardTypeSortedColumn_QNAME, CardTypeSortedColumn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardTypesInfoData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CardTypesInfoData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", name = "CardTypesInfoData")
    public JAXBElement<CardTypesInfoData> createCardTypesInfoData(CardTypesInfoData value) {
        return new JAXBElement<CardTypesInfoData>(_CardTypesInfoData_QNAME, CardTypesInfoData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCardTypeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCardTypeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", name = "ArrayOfCardTypeInfo")
    public JAXBElement<ArrayOfCardTypeInfo> createArrayOfCardTypeInfo(ArrayOfCardTypeInfo value) {
        return new JAXBElement<ArrayOfCardTypeInfo>(_ArrayOfCardTypeInfo_QNAME, ArrayOfCardTypeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecognitionMarker }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecognitionMarker }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "RecognitionMarker")
    public JAXBElement<RecognitionMarker> createRecognitionMarker(RecognitionMarker value) {
        return new JAXBElement<RecognitionMarker>(_RecognitionMarker_QNAME, RecognitionMarker.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCardTypeBiometricPermission }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCardTypeBiometricPermission }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "ArrayOfCardTypeBiometricPermission")
    public JAXBElement<ArrayOfCardTypeBiometricPermission> createArrayOfCardTypeBiometricPermission(ArrayOfCardTypeBiometricPermission value) {
        return new JAXBElement<ArrayOfCardTypeBiometricPermission>(_ArrayOfCardTypeBiometricPermission_QNAME, ArrayOfCardTypeBiometricPermission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardTypeBiometricPermission }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CardTypeBiometricPermission }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "CardTypeBiometricPermission")
    public JAXBElement<CardTypeBiometricPermission> createCardTypeBiometricPermission(CardTypeBiometricPermission value) {
        return new JAXBElement<CardTypeBiometricPermission>(_CardTypeBiometricPermission_QNAME, CardTypeBiometricPermission.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameFormatType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NameFormatType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "NameFormatType")
    public JAXBElement<NameFormatType> createNameFormatType(NameFormatType value) {
        return new JAXBElement<NameFormatType>(_NameFormatType_QNAME, NameFormatType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LChangedKeys }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LChangedKeys }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "LChangedKeys")
    public JAXBElement<LChangedKeys> createLChangedKeys(LChangedKeys value) {
        return new JAXBElement<LChangedKeys>(_LChangedKeys_QNAME, LChangedKeys.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLKeyInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLKeyInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "ArrayOfLKeyInfo")
    public JAXBElement<ArrayOfLKeyInfo> createArrayOfLKeyInfo(ArrayOfLKeyInfo value) {
        return new JAXBElement<ArrayOfLKeyInfo>(_ArrayOfLKeyInfo_QNAME, ArrayOfLKeyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LKeyInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LKeyInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "LKeyInfo")
    public JAXBElement<LKeyInfo> createLKeyInfo(LKeyInfo value) {
        return new JAXBElement<LKeyInfo>(_LKeyInfo_QNAME, LKeyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LStateBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LStateBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "LStateBase")
    public JAXBElement<LStateBase> createLStateBase(LStateBase value) {
        return new JAXBElement<LStateBase>(_LStateBase_QNAME, LStateBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StorageStateEnum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StorageStateEnum }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "StorageStateEnum")
    public JAXBElement<StorageStateEnum> createStorageStateEnum(StorageStateEnum value) {
        return new JAXBElement<StorageStateEnum>(_StorageStateEnum_QNAME, StorageStateEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverSettings }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DriverSettings }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "DriverSettings")
    public JAXBElement<DriverSettings> createDriverSettings(DriverSettings value) {
        return new JAXBElement<DriverSettings>(_DriverSettings_QNAME, DriverSettings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoorRelays }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoorRelays }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "DoorRelays")
    public JAXBElement<DoorRelays> createDoorRelays(DoorRelays value) {
        return new JAXBElement<DoorRelays>(_DoorRelays_QNAME, DoorRelays.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDoorRelay }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDoorRelay }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "ArrayOfDoorRelay")
    public JAXBElement<ArrayOfDoorRelay> createArrayOfDoorRelay(ArrayOfDoorRelay value) {
        return new JAXBElement<ArrayOfDoorRelay>(_ArrayOfDoorRelay_QNAME, ArrayOfDoorRelay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoorRelay }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoorRelay }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "DoorRelay")
    public JAXBElement<DoorRelay> createDoorRelay(DoorRelay value) {
        return new JAXBElement<DoorRelay>(_DoorRelay_QNAME, DoorRelay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LChangedCustomizableDays }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LChangedCustomizableDays }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "LChangedCustomizableDays")
    public JAXBElement<LChangedCustomizableDays> createLChangedCustomizableDays(LChangedCustomizableDays value) {
        return new JAXBElement<LChangedCustomizableDays>(_LChangedCustomizableDays_QNAME, LChangedCustomizableDays.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriversCustomizableDays }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriversCustomizableDays }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "ArrayOfLDriversCustomizableDays")
    public JAXBElement<ArrayOfLDriversCustomizableDays> createArrayOfLDriversCustomizableDays(ArrayOfLDriversCustomizableDays value) {
        return new JAXBElement<ArrayOfLDriversCustomizableDays>(_ArrayOfLDriversCustomizableDays_QNAME, ArrayOfLDriversCustomizableDays.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LDriversCustomizableDays }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LDriversCustomizableDays }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "LDriversCustomizableDays")
    public JAXBElement<LDriversCustomizableDays> createLDriversCustomizableDays(LDriversCustomizableDays value) {
        return new JAXBElement<LDriversCustomizableDays>(_LDriversCustomizableDays_QNAME, LDriversCustomizableDays.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLCustomizableDayInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLCustomizableDayInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "ArrayOfLCustomizableDayInfo")
    public JAXBElement<ArrayOfLCustomizableDayInfo> createArrayOfLCustomizableDayInfo(ArrayOfLCustomizableDayInfo value) {
        return new JAXBElement<ArrayOfLCustomizableDayInfo>(_ArrayOfLCustomizableDayInfo_QNAME, ArrayOfLCustomizableDayInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LCustomizableDayInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LCustomizableDayInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "LCustomizableDayInfo")
    public JAXBElement<LCustomizableDayInfo> createLCustomizableDayInfo(LCustomizableDayInfo value) {
        return new JAXBElement<LCustomizableDayInfo>(_LCustomizableDayInfo_QNAME, LCustomizableDayInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomizableDayType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomizableDayType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "CustomizableDayType")
    public JAXBElement<CustomizableDayType> createCustomizableDayType(CustomizableDayType value) {
        return new JAXBElement<CustomizableDayType>(_CustomizableDayType_QNAME, CustomizableDayType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RezervedHotKeys }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RezervedHotKeys }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.HotKey", name = "RezervedHotKeys")
    public JAXBElement<RezervedHotKeys> createRezervedHotKeys(RezervedHotKeys value) {
        return new JAXBElement<RezervedHotKeys>(_RezervedHotKeys_QNAME, RezervedHotKeys.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "Name", scope = LCustomizableDayInfo.class)
    public JAXBElement<String> createLCustomizableDayInfoName(String value) {
        return new JAXBElement<String>(_LCustomizableDayInfoName_QNAME, String.class, LCustomizableDayInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "TransferedDate", scope = LCustomizableDayInfo.class)
    public JAXBElement<XMLGregorianCalendar> createLCustomizableDayInfoTransferedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LCustomizableDayInfoTransferedDate_QNAME, XMLGregorianCalendar.class, LCustomizableDayInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLCustomizableDayInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLCustomizableDayInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "Days", scope = LDriversCustomizableDays.class)
    public JAXBElement<ArrayOfLCustomizableDayInfo> createLDriversCustomizableDaysDays(ArrayOfLCustomizableDayInfo value) {
        return new JAXBElement<ArrayOfLCustomizableDayInfo>(_LDriversCustomizableDaysDays_QNAME, ArrayOfLCustomizableDayInfo.class, LDriversCustomizableDays.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDoorRelay }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDoorRelay }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "Relays", scope = DoorRelays.class)
    public JAXBElement<ArrayOfDoorRelay> createDoorRelaysRelays(ArrayOfDoorRelay value) {
        return new JAXBElement<ArrayOfDoorRelay>(_DoorRelaysRelays_QNAME, ArrayOfDoorRelay.class, DoorRelays.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "Antipassback", scope = DriverSettings.class)
    public JAXBElement<Boolean> createDriverSettingsAntipassback(Boolean value) {
        return new JAXBElement<Boolean>(_DriverSettingsAntipassback_QNAME, Boolean.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "CardPlusAlcoFrame", scope = DriverSettings.class)
    public JAXBElement<Boolean> createDriverSettingsCardPlusAlcoFrame(Boolean value) {
        return new JAXBElement<Boolean>(_DriverSettingsCardPlusAlcoFrame_QNAME, Boolean.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "CardPlusFace", scope = DriverSettings.class)
    public JAXBElement<Boolean> createDriverSettingsCardPlusFace(Boolean value) {
        return new JAXBElement<Boolean>(_DriverSettingsCardPlusFace_QNAME, Boolean.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "CardPlusVehicle", scope = DriverSettings.class)
    public JAXBElement<Boolean> createDriverSettingsCardPlusVehicle(Boolean value) {
        return new JAXBElement<Boolean>(_DriverSettingsCardPlusVehicle_QNAME, Boolean.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "DailyAlcoholTestConfirmation", scope = DriverSettings.class)
    public JAXBElement<Boolean> createDriverSettingsDailyAlcoholTestConfirmation(Boolean value) {
        return new JAXBElement<Boolean>(_DriverSettingsDailyAlcoholTestConfirmation_QNAME, Boolean.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsDaySchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "DaySchedule", scope = DriverSettings.class)
    public JAXBElement<AcsDaySchedule> createDriverSettingsDaySchedule(AcsDaySchedule value) {
        return new JAXBElement<AcsDaySchedule>(_DriverSettingsDaySchedule_QNAME, AcsDaySchedule.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoorRelays }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoorRelays }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "DoorRelays", scope = DriverSettings.class)
    public JAXBElement<DoorRelays> createDriverSettingsDoorRelays(DoorRelays value) {
        return new JAXBElement<DoorRelays>(_DoorRelays_QNAME, DoorRelays.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "IsConfirmingKey", scope = DriverSettings.class)
    public JAXBElement<Boolean> createDriverSettingsIsConfirmingKey(Boolean value) {
        return new JAXBElement<Boolean>(_DriverSettingsIsConfirmingKey_QNAME, Boolean.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "IsGuardOffModeOn", scope = DriverSettings.class)
    public JAXBElement<Boolean> createDriverSettingsIsGuardOffModeOn(Boolean value) {
        return new JAXBElement<Boolean>(_DriverSettingsIsGuardOffModeOn_QNAME, Boolean.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "IsGuardOnModeOn", scope = DriverSettings.class)
    public JAXBElement<Boolean> createDriverSettingsIsGuardOnModeOn(Boolean value) {
        return new JAXBElement<Boolean>(_DriverSettingsIsGuardOnModeOn_QNAME, Boolean.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "IsLockModeOn", scope = DriverSettings.class)
    public JAXBElement<Boolean> createDriverSettingsIsLockModeOn(Boolean value) {
        return new JAXBElement<Boolean>(_DriverSettingsIsLockModeOn_QNAME, Boolean.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "IsMultiIdentification", scope = DriverSettings.class)
    public JAXBElement<Boolean> createDriverSettingsIsMultiIdentification(Boolean value) {
        return new JAXBElement<Boolean>(_DriverSettingsIsMultiIdentification_QNAME, Boolean.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "IsOpenForALongTimeModeOn", scope = DriverSettings.class)
    public JAXBElement<Boolean> createDriverSettingsIsOpenForALongTimeModeOn(Boolean value) {
        return new JAXBElement<Boolean>(_DriverSettingsIsOpenForALongTimeModeOn_QNAME, Boolean.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsMultiDaySchedule }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsMultiDaySchedule }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "MultiDaySchedule", scope = DriverSettings.class)
    public JAXBElement<AcsMultiDaySchedule> createDriverSettingsMultiDaySchedule(AcsMultiDaySchedule value) {
        return new JAXBElement<AcsMultiDaySchedule>(_DriverSettingsMultiDaySchedule_QNAME, AcsMultiDaySchedule.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfServerIdentificationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfServerIdentificationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "OrderedServerIdentification", scope = DriverSettings.class)
    public JAXBElement<ArrayOfServerIdentificationType> createDriverSettingsOrderedServerIdentification(ArrayOfServerIdentificationType value) {
        return new JAXBElement<ArrayOfServerIdentificationType>(_DriverSettingsOrderedServerIdentification_QNAME, ArrayOfServerIdentificationType.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "ServerVehicleIdentification", scope = DriverSettings.class)
    public JAXBElement<String> createDriverSettingsServerVehicleIdentification(String value) {
        return new JAXBElement<String>(_DriverSettingsServerVehicleIdentification_QNAME, String.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "UseHolidaysAndTransfers", scope = DriverSettings.class)
    public JAXBElement<Boolean> createDriverSettingsUseHolidaysAndTransfers(Boolean value) {
        return new JAXBElement<Boolean>(_DriverSettingsUseHolidaysAndTransfers_QNAME, Boolean.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsWeekScheduleFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsWeekScheduleFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "WeekSchedule", scope = DriverSettings.class)
    public JAXBElement<AcsWeekScheduleFull> createDriverSettingsWeekSchedule(AcsWeekScheduleFull value) {
        return new JAXBElement<AcsWeekScheduleFull>(_DriverSettingsWeekSchedule_QNAME, AcsWeekScheduleFull.class, DriverSettings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "Data", scope = LKeyInfo.class)
    public JAXBElement<String> createLKeyInfoData(String value) {
        return new JAXBElement<String>(_LKeyInfoData_QNAME, String.class, LKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverSettings }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DriverSettings }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "DriverSettings", scope = LKeyInfo.class)
    public JAXBElement<DriverSettings> createLKeyInfoDriverSettings(DriverSettings value) {
        return new JAXBElement<DriverSettings>(_DriverSettings_QNAME, DriverSettings.class, LKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "EmployeeFirstName", scope = LKeyInfo.class)
    public JAXBElement<String> createLKeyInfoEmployeeFirstName(String value) {
        return new JAXBElement<String>(_LKeyInfoEmployeeFirstName_QNAME, String.class, LKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "EmployeeLastName", scope = LKeyInfo.class)
    public JAXBElement<String> createLKeyInfoEmployeeLastName(String value) {
        return new JAXBElement<String>(_LKeyInfoEmployeeLastName_QNAME, String.class, LKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "EmployeeSecondName", scope = LKeyInfo.class)
    public JAXBElement<String> createLKeyInfoEmployeeSecondName(String value) {
        return new JAXBElement<String>(_LKeyInfoEmployeeSecondName_QNAME, String.class, LKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "EndDate", scope = LKeyInfo.class)
    public JAXBElement<XMLGregorianCalendar> createLKeyInfoEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LKeyInfoEndDate_QNAME, XMLGregorianCalendar.class, LKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "Finger1_Template", scope = LKeyInfo.class)
    public JAXBElement<byte[]> createLKeyInfoFinger1Template(byte[] value) {
        return new JAXBElement<byte[]>(_LKeyInfoFinger1Template_QNAME, byte[].class, LKeyInfo.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "Finger2_Template", scope = LKeyInfo.class)
    public JAXBElement<byte[]> createLKeyInfoFinger2Template(byte[] value) {
        return new JAXBElement<byte[]>(_LKeyInfoFinger2Template_QNAME, byte[].class, LKeyInfo.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "Finger3_Template", scope = LKeyInfo.class)
    public JAXBElement<byte[]> createLKeyInfoFinger3Template(byte[] value) {
        return new JAXBElement<byte[]>(_LKeyInfoFinger3Template_QNAME, byte[].class, LKeyInfo.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "Finger4_Template", scope = LKeyInfo.class)
    public JAXBElement<byte[]> createLKeyInfoFinger4Template(byte[] value) {
        return new JAXBElement<byte[]>(_LKeyInfoFinger4Template_QNAME, byte[].class, LKeyInfo.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "Finger5_Template", scope = LKeyInfo.class)
    public JAXBElement<byte[]> createLKeyInfoFinger5Template(byte[] value) {
        return new JAXBElement<byte[]>(_LKeyInfoFinger5Template_QNAME, byte[].class, LKeyInfo.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "PINCode", scope = LKeyInfo.class)
    public JAXBElement<Long> createLKeyInfoPINCode(Long value) {
        return new JAXBElement<Long>(_LKeyInfoPINCode_QNAME, Long.class, LKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "PINCodeUnderPressure", scope = LKeyInfo.class)
    public JAXBElement<Long> createLKeyInfoPINCodeUnderPressure(Long value) {
        return new JAXBElement<Long>(_LKeyInfoPINCodeUnderPressure_QNAME, Long.class, LKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "StartDate", scope = LKeyInfo.class)
    public JAXBElement<XMLGregorianCalendar> createLKeyInfoStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LKeyInfoStartDate_QNAME, XMLGregorianCalendar.class, LKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "TabNumber", scope = LKeyInfo.class)
    public JAXBElement<Integer> createLKeyInfoTabNumber(Integer value) {
        return new JAXBElement<Integer>(_LKeyInfoTabNumber_QNAME, Integer.class, LKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "CardTypeID", scope = CardTypeBiometricPermission.class)
    public JAXBElement<String> createCardTypeBiometricPermissionCardTypeID(String value) {
        return new JAXBElement<String>(_CardTypeBiometricPermissionCardTypeID_QNAME, String.class, CardTypeBiometricPermission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "CardTypeName", scope = CardTypeBiometricPermission.class)
    public JAXBElement<String> createCardTypeBiometricPermissionCardTypeName(String value) {
        return new JAXBElement<String>(_CardTypeBiometricPermissionCardTypeName_QNAME, String.class, CardTypeBiometricPermission.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", name = "Comment", scope = CardTypeSaveInfo.class)
    public JAXBElement<String> createCardTypeSaveInfoComment(String value) {
        return new JAXBElement<String>(_CardTypeSaveInfoComment_QNAME, String.class, CardTypeSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", name = "Name", scope = CardTypeSaveInfo.class)
    public JAXBElement<String> createCardTypeSaveInfoName(String value) {
        return new JAXBElement<String>(_CardTypeSaveInfoName_QNAME, String.class, CardTypeSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserPassEditorSaveData.Editor }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserPassEditorSaveData.Editor }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", name = "Editor", scope = UserPassEditorSaveData.class)
    public JAXBElement<UserPassEditorSaveData.Editor> createUserPassEditorSaveDataEditor(UserPassEditorSaveData.Editor value) {
        return new JAXBElement<UserPassEditorSaveData.Editor>(_UserPassEditorSaveDataEditor_QNAME, UserPassEditorSaveData.Editor.class, UserPassEditorSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", name = "Description", scope = UserPassSlimSaveData.class)
    public JAXBElement<String> createUserPassSlimSaveDataDescription(String value) {
        return new JAXBElement<String>(_UserPassSlimSaveDataDescription_QNAME, String.class, UserPassSlimSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", name = "Name", scope = UserPassSlimSaveData.class)
    public JAXBElement<String> createUserPassSlimSaveDataName(String value) {
        return new JAXBElement<String>(_UserPassSlimSaveDataName_QNAME, String.class, UserPassSlimSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", name = "Name", scope = FavoriteFolderSaveData.class)
    public JAXBElement<String> createFavoriteFolderSaveDataName(String value) {
        return new JAXBElement<String>(_FavoriteFolderSaveDataName_QNAME, String.class, FavoriteFolderSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", name = "ParentID", scope = FavoriteFolderSaveData.class)
    public JAXBElement<String> createFavoriteFolderSaveDataParentID(String value) {
        return new JAXBElement<String>(_FavoriteFolderSaveDataParentID_QNAME, String.class, FavoriteFolderSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", name = "UserID", scope = FavoriteFolderSaveData.class)
    public JAXBElement<String> createFavoriteFolderSaveDataUserID(String value) {
        return new JAXBElement<String>(_FavoriteFolderSaveDataUserID_QNAME, String.class, FavoriteFolderSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", name = "WorkplaceID", scope = FavoriteFolderSaveData.class)
    public JAXBElement<String> createFavoriteFolderSaveDataWorkplaceID(String value) {
        return new JAXBElement<String>(_FavoriteFolderSaveDataWorkplaceID_QNAME, String.class, FavoriteFolderSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", name = "FavoreteFolderRelationName", scope = FavoriteFolderInfo.class)
    public JAXBElement<String> createFavoriteFolderInfoFavoreteFolderRelationName(String value) {
        return new JAXBElement<String>(_FavoriteFolderInfoFavoreteFolderRelationName_QNAME, String.class, FavoriteFolderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", name = "FavoreteFolderRelationPath", scope = FavoriteFolderInfo.class)
    public JAXBElement<String> createFavoriteFolderInfoFavoreteFolderRelationPath(String value) {
        return new JAXBElement<String>(_FavoriteFolderInfoFavoreteFolderRelationPath_QNAME, String.class, FavoriteFolderInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsEmployeeGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.FavoriteFolder", name = "Groups", scope = FavoriteFolderInfoWithEmployeeGroup.class)
    public JAXBElement<ArrayOfAcsEmployeeGroup> createFavoriteFolderInfoWithEmployeeGroupGroups(ArrayOfAcsEmployeeGroup value) {
        return new JAXBElement<ArrayOfAcsEmployeeGroup>(_FavoriteFolderInfoWithEmployeeGroupGroups_QNAME, ArrayOfAcsEmployeeGroup.class, FavoriteFolderInfoWithEmployeeGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "Description", scope = FilterTagFullInfo.class)
    public JAXBElement<String> createFilterTagFullInfoDescription(String value) {
        return new JAXBElement<String>(_FilterTagFullInfoDescription_QNAME, String.class, FilterTagFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "Name", scope = FilterTagFullInfo.class)
    public JAXBElement<String> createFilterTagFullInfoName(String value) {
        return new JAXBElement<String>(_FilterTagFullInfoName_QNAME, String.class, FilterTagFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "Description", scope = TagFullInfo.class)
    public JAXBElement<String> createTagFullInfoDescription(String value) {
        return new JAXBElement<String>(_FilterTagFullInfoDescription_QNAME, String.class, TagFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "Name", scope = TagFullInfo.class)
    public JAXBElement<String> createTagFullInfoName(String value) {
        return new JAXBElement<String>(_FilterTagFullInfoName_QNAME, String.class, TagFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "Description", scope = EmailDistributionAddressSaveData.class)
    public JAXBElement<String> createEmailDistributionAddressSaveDataDescription(String value) {
        return new JAXBElement<String>(_EmailDistributionAddressSaveDataDescription_QNAME, String.class, EmailDistributionAddressSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "Login", scope = EmailDistributionAddressSaveData.class)
    public JAXBElement<String> createEmailDistributionAddressSaveDataLogin(String value) {
        return new JAXBElement<String>(_EmailDistributionAddressSaveDataLogin_QNAME, String.class, EmailDistributionAddressSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "Name", scope = EmailDistributionAddressSaveData.class)
    public JAXBElement<String> createEmailDistributionAddressSaveDataName(String value) {
        return new JAXBElement<String>(_EmailDistributionAddressSaveDataName_QNAME, String.class, EmailDistributionAddressSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "Password", scope = EmailDistributionAddressSaveData.class)
    public JAXBElement<String> createEmailDistributionAddressSaveDataPassword(String value) {
        return new JAXBElement<String>(_EmailDistributionAddressSaveDataPassword_QNAME, String.class, EmailDistributionAddressSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "SenderEmailAddress", scope = EmailDistributionAddressSaveData.class)
    public JAXBElement<String> createEmailDistributionAddressSaveDataSenderEmailAddress(String value) {
        return new JAXBElement<String>(_EmailDistributionAddressSaveDataSenderEmailAddress_QNAME, String.class, EmailDistributionAddressSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "SenderName", scope = EmailDistributionAddressSaveData.class)
    public JAXBElement<String> createEmailDistributionAddressSaveDataSenderName(String value) {
        return new JAXBElement<String>(_EmailDistributionAddressSaveDataSenderName_QNAME, String.class, EmailDistributionAddressSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "SmtpServerAddress", scope = EmailDistributionAddressSaveData.class)
    public JAXBElement<String> createEmailDistributionAddressSaveDataSmtpServerAddress(String value) {
        return new JAXBElement<String>(_EmailDistributionAddressSaveDataSmtpServerAddress_QNAME, String.class, EmailDistributionAddressSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "CityCode", scope = PhoneNumberSaveData.class)
    public JAXBElement<String> createPhoneNumberSaveDataCityCode(String value) {
        return new JAXBElement<String>(_PhoneNumberSaveDataCityCode_QNAME, String.class, PhoneNumberSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "CountryCode", scope = PhoneNumberSaveData.class)
    public JAXBElement<String> createPhoneNumberSaveDataCountryCode(String value) {
        return new JAXBElement<String>(_PhoneNumberSaveDataCountryCode_QNAME, String.class, PhoneNumberSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "Description", scope = PhoneNumberSaveData.class)
    public JAXBElement<String> createPhoneNumberSaveDataDescription(String value) {
        return new JAXBElement<String>(_EmailDistributionAddressSaveDataDescription_QNAME, String.class, PhoneNumberSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "PhoneNumber", scope = PhoneNumberSaveData.class)
    public JAXBElement<String> createPhoneNumberSaveDataPhoneNumber(String value) {
        return new JAXBElement<String>(_PhoneNumberSaveDataPhoneNumber_QNAME, String.class, PhoneNumberSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "Description", scope = EmailAddressSaveData.class)
    public JAXBElement<String> createEmailAddressSaveDataDescription(String value) {
        return new JAXBElement<String>(_EmailDistributionAddressSaveDataDescription_QNAME, String.class, EmailAddressSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ContactInformation", name = "Email", scope = EmailAddressSaveData.class)
    public JAXBElement<String> createEmailAddressSaveDataEmail(String value) {
        return new JAXBElement<String>(_EmailAddressSaveDataEmail_QNAME, String.class, EmailAddressSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IvidionCamera", name = "Name", scope = IvideonCameraDriverInfo.class)
    public JAXBElement<String> createIvideonCameraDriverInfoName(String value) {
        return new JAXBElement<String>(_IvideonCameraDriverInfoName_QNAME, String.class, IvideonCameraDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IvidionCamera", name = "Path", scope = IvideonCameraDriverInfo.class)
    public JAXBElement<String> createIvideonCameraDriverInfoPath(String value) {
        return new JAXBElement<String>(_IvideonCameraDriverInfoPath_QNAME, String.class, IvideonCameraDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IvidionCamera", name = "ServerType", scope = IvideonCameraDriverInfo.class)
    public JAXBElement<String> createIvideonCameraDriverInfoServerType(String value) {
        return new JAXBElement<String>(_IvideonCameraDriverInfoServerType_QNAME, String.class, IvideonCameraDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", name = "Name", scope = ScreenCellSaveData.class)
    public JAXBElement<String> createScreenCellSaveDataName(String value) {
        return new JAXBElement<String>(_ScreenCellSaveDataName_QNAME, String.class, ScreenCellSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfScreenCellTreeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfScreenCellTreeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", name = "Children", scope = ScreenCellTreeInfo.class)
    public JAXBElement<ArrayOfScreenCellTreeInfo> createScreenCellTreeInfoChildren(ArrayOfScreenCellTreeInfo value) {
        return new JAXBElement<ArrayOfScreenCellTreeInfo>(_ScreenCellTreeInfoChildren_QNAME, ArrayOfScreenCellTreeInfo.class, ScreenCellTreeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "ISS_OBJ_ID", scope = ISSEntityBase.class)
    public JAXBElement<String> createISSEntityBaseISSOBJID(String value) {
        return new JAXBElement<String>(_ISSEntityBaseISSOBJID_QNAME, String.class, ISSEntityBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "Name", scope = ISSEntityBase.class)
    public JAXBElement<String> createISSEntityBaseName(String value) {
        return new JAXBElement<String>(_ISSEntityBaseName_QNAME, String.class, ISSEntityBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSRusGuardSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSRusGuardSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "RusGuardIntegrationPoints", scope = ISSIntegrationPointSlimInfo.class)
    public JAXBElement<ArrayOfISSRusGuardSlimInfo> createISSIntegrationPointSlimInfoRusGuardIntegrationPoints(ArrayOfISSRusGuardSlimInfo value) {
        return new JAXBElement<ArrayOfISSRusGuardSlimInfo>(_ISSIntegrationPointSlimInfoRusGuardIntegrationPoints_QNAME, ArrayOfISSRusGuardSlimInfo.class, ISSIntegrationPointSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSCamSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSCamSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "Cameras", scope = ISSMonitorSlimInfo.class)
    public JAXBElement<ArrayOfISSCamSlimInfo> createISSMonitorSlimInfoCameras(ArrayOfISSCamSlimInfo value) {
        return new JAXBElement<ArrayOfISSCamSlimInfo>(_ISSMonitorSlimInfoCameras_QNAME, ArrayOfISSCamSlimInfo.class, ISSMonitorSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSEventViewerSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSEventViewerSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "EventViewers", scope = ISSDisplaySlimInfo.class)
    public JAXBElement<ArrayOfISSEventViewerSlimInfo> createISSDisplaySlimInfoEventViewers(ArrayOfISSEventViewerSlimInfo value) {
        return new JAXBElement<ArrayOfISSEventViewerSlimInfo>(_ISSDisplaySlimInfoEventViewers_QNAME, ArrayOfISSEventViewerSlimInfo.class, ISSDisplaySlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSMonitorSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSMonitorSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "Monitors", scope = ISSDisplaySlimInfo.class)
    public JAXBElement<ArrayOfISSMonitorSlimInfo> createISSDisplaySlimInfoMonitors(ArrayOfISSMonitorSlimInfo value) {
        return new JAXBElement<ArrayOfISSMonitorSlimInfo>(_ISSDisplaySlimInfoMonitors_QNAME, ArrayOfISSMonitorSlimInfo.class, ISSDisplaySlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSDisplaySlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSDisplaySlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "Displays", scope = ISSSlaveSlimInfo.class)
    public JAXBElement<ArrayOfISSDisplaySlimInfo> createISSSlaveSlimInfoDisplays(ArrayOfISSDisplaySlimInfo value) {
        return new JAXBElement<ArrayOfISSDisplaySlimInfo>(_ISSSlaveSlimInfoDisplays_QNAME, ArrayOfISSDisplaySlimInfo.class, ISSSlaveSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "Dns", scope = ISSSlaveSlimInfo.class)
    public JAXBElement<String> createISSSlaveSlimInfoDns(String value) {
        return new JAXBElement<String>(_ISSSlaveSlimInfoDns_QNAME, String.class, ISSSlaveSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "IPAddress", scope = ISSSlaveSlimInfo.class)
    public JAXBElement<String> createISSSlaveSlimInfoIPAddress(String value) {
        return new JAXBElement<String>(_ISSSlaveSlimInfoIPAddress_QNAME, String.class, ISSSlaveSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSIntegrationPointSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSIntegrationPointSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "IntegrationPoints", scope = ISSSlaveSlimInfo.class)
    public JAXBElement<ArrayOfISSIntegrationPointSlimInfo> createISSSlaveSlimInfoIntegrationPoints(ArrayOfISSIntegrationPointSlimInfo value) {
        return new JAXBElement<ArrayOfISSIntegrationPointSlimInfo>(_ISSSlaveSlimInfoIntegrationPoints_QNAME, ArrayOfISSIntegrationPointSlimInfo.class, ISSSlaveSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PhotoBank", name = "DateOfBirth", scope = PhotoBankShort.class)
    public JAXBElement<XMLGregorianCalendar> createPhotoBankShortDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PhotoBankShortDateOfBirth_QNAME, XMLGregorianCalendar.class, PhotoBankShort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PhotoBank", name = "FullName", scope = PhotoBankShort.class)
    public JAXBElement<String> createPhotoBankShortFullName(String value) {
        return new JAXBElement<String>(_PhotoBankShortFullName_QNAME, String.class, PhotoBankShort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PhotoBank", name = "PersonNumber", scope = PhotoBankShort.class)
    public JAXBElement<Long> createPhotoBankShortPersonNumber(Long value) {
        return new JAXBElement<Long>(_PhotoBankShortPersonNumber_QNAME, Long.class, PhotoBankShort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "Name", scope = ReactionActionSaveData.class)
    public JAXBElement<String> createReactionActionSaveDataName(String value) {
        return new JAXBElement<String>(_ReactionActionSaveDataName_QNAME, String.class, ReactionActionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "Name", scope = ReactionSlimInfo.class)
    public JAXBElement<String> createReactionSlimInfoName(String value) {
        return new JAXBElement<String>(_ReactionActionSaveDataName_QNAME, String.class, ReactionSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "Name", scope = ReactionEventSaveData.class)
    public JAXBElement<String> createReactionEventSaveDataName(String value) {
        return new JAXBElement<String>(_ReactionActionSaveDataName_QNAME, String.class, ReactionEventSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "Value", scope = AddListInfo.class)
    public JAXBElement<ListItem> createAddListInfoValue(ListItem value) {
        return new JAXBElement<ListItem>(_AddListInfoValue_QNAME, ListItem.class, AddListInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "Value", scope = AddColorInfo.class)
    public JAXBElement<byte[]> createAddColorInfoValue(byte[] value) {
        return new JAXBElement<byte[]>(_AddListInfoValue_QNAME, byte[].class, AddColorInfo.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "Value", scope = AddStringInfo.class)
    public JAXBElement<String> createAddStringInfoValue(String value) {
        return new JAXBElement<String>(_AddListInfoValue_QNAME, String.class, AddStringInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "Value", scope = AddIntInfo.class)
    public JAXBElement<Integer> createAddIntInfoValue(Integer value) {
        return new JAXBElement<Integer>(_AddListInfoValue_QNAME, Integer.class, AddIntInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "Value", scope = AddDoubleInfo.class)
    public JAXBElement<Double> createAddDoubleInfoValue(Double value) {
        return new JAXBElement<Double>(_AddListInfoValue_QNAME, Double.class, AddDoubleInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "Value", scope = AddDateTimeInfo.class)
    public JAXBElement<XMLGregorianCalendar> createAddDateTimeInfoValue(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AddListInfoValue_QNAME, XMLGregorianCalendar.class, AddDateTimeInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdditionalFieldValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAdditionalFieldValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "Fields", scope = OwnerAdditionalFieldsValue.class)
    public JAXBElement<ArrayOfAdditionalFieldValue> createOwnerAdditionalFieldsValueFields(ArrayOfAdditionalFieldValue value) {
        return new JAXBElement<ArrayOfAdditionalFieldValue>(_OwnerAdditionalFieldsValueFields_QNAME, ArrayOfAdditionalFieldValue.class, OwnerAdditionalFieldsValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "Value", scope = OwnerListValue.class)
    public JAXBElement<ListItem> createOwnerListValueValue(ListItem value) {
        return new JAXBElement<ListItem>(_AddListInfoValue_QNAME, ListItem.class, OwnerListValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "Value", scope = OwnerColorValue.class)
    public JAXBElement<byte[]> createOwnerColorValueValue(byte[] value) {
        return new JAXBElement<byte[]>(_AddListInfoValue_QNAME, byte[].class, OwnerColorValue.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "Value", scope = OwnerStringValue.class)
    public JAXBElement<String> createOwnerStringValueValue(String value) {
        return new JAXBElement<String>(_AddListInfoValue_QNAME, String.class, OwnerStringValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "Value", scope = OwnerIntValue.class)
    public JAXBElement<Integer> createOwnerIntValueValue(Integer value) {
        return new JAXBElement<Integer>(_AddListInfoValue_QNAME, Integer.class, OwnerIntValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "Value", scope = OwnerDoubleValue.class)
    public JAXBElement<Double> createOwnerDoubleValueValue(Double value) {
        return new JAXBElement<Double>(_AddListInfoValue_QNAME, Double.class, OwnerDoubleValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "Value", scope = OwnerDateTimeValue.class)
    public JAXBElement<XMLGregorianCalendar> createOwnerDateTimeValueValue(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AddListInfoValue_QNAME, XMLGregorianCalendar.class, OwnerDateTimeValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalFieldBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdditionalFieldBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "AdditionalFieldInfo", scope = AdditionalFieldValue.class)
    public JAXBElement<AdditionalFieldBase> createAdditionalFieldValueAdditionalFieldInfo(AdditionalFieldBase value) {
        return new JAXBElement<AdditionalFieldBase>(_AdditionalFieldValueAdditionalFieldInfo_QNAME, AdditionalFieldBase.class, AdditionalFieldValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerValueBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OwnerValueBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "OwnerValue", scope = AdditionalFieldValue.class)
    public JAXBElement<OwnerValueBase> createAdditionalFieldValueOwnerValue(OwnerValueBase value) {
        return new JAXBElement<OwnerValueBase>(_AdditionalFieldValueOwnerValue_QNAME, OwnerValueBase.class, AdditionalFieldValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "Name", scope = AdditionalFieldBase.class)
    public JAXBElement<String> createAdditionalFieldBaseName(String value) {
        return new JAXBElement<String>(_AdditionalFieldBaseName_QNAME, String.class, AdditionalFieldBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "DefaultValue", scope = ListField.class)
    public JAXBElement<ListItem> createListFieldDefaultValue(ListItem value) {
        return new JAXBElement<ListItem>(_ListFieldDefaultValue_QNAME, ListItem.class, ListField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfListItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfListItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "Items", scope = ListField.class)
    public JAXBElement<ArrayOfListItem> createListFieldItems(ArrayOfListItem value) {
        return new JAXBElement<ArrayOfListItem>(_ListFieldItems_QNAME, ArrayOfListItem.class, ListField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "DefaultValue", scope = ColorField.class)
    public JAXBElement<byte[]> createColorFieldDefaultValue(byte[] value) {
        return new JAXBElement<byte[]>(_ListFieldDefaultValue_QNAME, byte[].class, ColorField.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "DefaultValue", scope = StringField.class)
    public JAXBElement<String> createStringFieldDefaultValue(String value) {
        return new JAXBElement<String>(_ListFieldDefaultValue_QNAME, String.class, StringField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "DefaultValue", scope = DoubleField.class)
    public JAXBElement<Double> createDoubleFieldDefaultValue(Double value) {
        return new JAXBElement<Double>(_ListFieldDefaultValue_QNAME, Double.class, DoubleField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "DefaultValue", scope = IntegerField.class)
    public JAXBElement<Integer> createIntegerFieldDefaultValue(Integer value) {
        return new JAXBElement<Integer>(_ListFieldDefaultValue_QNAME, Integer.class, IntegerField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "DefaultValue", scope = DateTimeField.class)
    public JAXBElement<XMLGregorianCalendar> createDateTimeFieldDefaultValue(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ListFieldDefaultValue_QNAME, XMLGregorianCalendar.class, DateTimeField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "Format", scope = DateTimeField.class)
    public JAXBElement<String> createDateTimeFieldFormat(String value) {
        return new JAXBElement<String>(_DateTimeFieldFormat_QNAME, String.class, DateTimeField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "IsCurrent", scope = DateTimeField.class)
    public JAXBElement<Boolean> createDateTimeFieldIsCurrent(Boolean value) {
        return new JAXBElement<Boolean>(_DateTimeFieldIsCurrent_QNAME, Boolean.class, DateTimeField.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", name = "AdditionalField1", scope = ReportSaveData.class)
    public JAXBElement<String> createReportSaveDataAdditionalField1(String value) {
        return new JAXBElement<String>(_ReportSaveDataAdditionalField1_QNAME, String.class, ReportSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", name = "AdditionalField2", scope = ReportSaveData.class)
    public JAXBElement<String> createReportSaveDataAdditionalField2(String value) {
        return new JAXBElement<String>(_ReportSaveDataAdditionalField2_QNAME, String.class, ReportSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", name = "AdditionalField3", scope = ReportSaveData.class)
    public JAXBElement<String> createReportSaveDataAdditionalField3(String value) {
        return new JAXBElement<String>(_ReportSaveDataAdditionalField3_QNAME, String.class, ReportSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", name = "Company", scope = ReportSaveData.class)
    public JAXBElement<String> createReportSaveDataCompany(String value) {
        return new JAXBElement<String>(_ReportSaveDataCompany_QNAME, String.class, ReportSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", name = "Department", scope = ReportSaveData.class)
    public JAXBElement<String> createReportSaveDataDepartment(String value) {
        return new JAXBElement<String>(_ReportSaveDataDepartment_QNAME, String.class, ReportSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", name = "Description", scope = ReportSaveData.class)
    public JAXBElement<String> createReportSaveDataDescription(String value) {
        return new JAXBElement<String>(_ReportSaveDataDescription_QNAME, String.class, ReportSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", name = "Identity", scope = ReportSaveData.class)
    public JAXBElement<String> createReportSaveDataIdentity(String value) {
        return new JAXBElement<String>(_ReportSaveDataIdentity_QNAME, String.class, ReportSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report", name = "Name", scope = ReportSaveData.class)
    public JAXBElement<String> createReportSaveDataName(String value) {
        return new JAXBElement<String>(_ReportSaveDataName_QNAME, String.class, ReportSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "Comment", scope = WorkTimetableSlimInfo.class)
    public JAXBElement<String> createWorkTimetableSlimInfoComment(String value) {
        return new JAXBElement<String>(_WorkTimetableSlimInfoComment_QNAME, String.class, WorkTimetableSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayTypeSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DayTypeSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "DayMode", scope = WorkTimetableSlimInfo.class)
    public JAXBElement<DayTypeSlimInfo> createWorkTimetableSlimInfoDayMode(DayTypeSlimInfo value) {
        return new JAXBElement<DayTypeSlimInfo>(_DayMode_QNAME, DayTypeSlimInfo.class, WorkTimetableSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", name = "Name", scope = EmployeePositionSlimInfo.class)
    public JAXBElement<String> createEmployeePositionSlimInfoName(String value) {
        return new JAXBElement<String>(_EmployeePositionSlimInfoName_QNAME, String.class, EmployeePositionSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", name = "Description", scope = FolderSaveData.class)
    public JAXBElement<String> createFolderSaveDataDescription(String value) {
        return new JAXBElement<String>(_FolderSaveDataDescription_QNAME, String.class, FolderSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", name = "Name", scope = FolderSaveData.class)
    public JAXBElement<String> createFolderSaveDataName(String value) {
        return new JAXBElement<String>(_FolderSaveDataName_QNAME, String.class, FolderSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", name = "ParentID", scope = FolderSaveData.class)
    public JAXBElement<String> createFolderSaveDataParentID(String value) {
        return new JAXBElement<String>(_FolderSaveDataParentID_QNAME, String.class, FolderSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAccessLevelSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAcsAccessLevelSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Folder", name = "Levels", scope = FolderInfoWithAccessLevel.class)
    public JAXBElement<ArrayOfAcsAccessLevelSlimInfo> createFolderInfoWithAccessLevelLevels(ArrayOfAcsAccessLevelSlimInfo value) {
        return new JAXBElement<ArrayOfAcsAccessLevelSlimInfo>(_FolderInfoWithAccessLevelLevels_QNAME, ArrayOfAcsAccessLevelSlimInfo.class, FolderInfoWithAccessLevel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Comment", scope = Employee2OrganizationAssignment.class)
    public JAXBElement<String> createEmployee2OrganizationAssignmentComment(String value) {
        return new JAXBElement<String>(_Employee2OrganizationAssignmentComment_QNAME, String.class, Employee2OrganizationAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ID", scope = Employee2OrganizationAssignment.class)
    public JAXBElement<String> createEmployee2OrganizationAssignmentID(String value) {
        return new JAXBElement<String>(_Employee2OrganizationAssignmentID_QNAME, String.class, Employee2OrganizationAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "SubdivisionID", scope = Employee2OrganizationAssignment.class)
    public JAXBElement<String> createEmployee2OrganizationAssignmentSubdivisionID(String value) {
        return new JAXBElement<String>(_Employee2OrganizationAssignmentSubdivisionID_QNAME, String.class, Employee2OrganizationAssignment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Comment", scope = Employee2OrganizationAssignmentFull.class)
    public JAXBElement<String> createEmployee2OrganizationAssignmentFullComment(String value) {
        return new JAXBElement<String>(_Employee2OrganizationAssignmentComment_QNAME, String.class, Employee2OrganizationAssignmentFull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ID", scope = Employee2OrganizationAssignmentFull.class)
    public JAXBElement<String> createEmployee2OrganizationAssignmentFullID(String value) {
        return new JAXBElement<String>(_Employee2OrganizationAssignmentID_QNAME, String.class, Employee2OrganizationAssignmentFull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryElementInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DictionaryElementInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Organization", scope = Employee2OrganizationAssignmentFull.class)
    public JAXBElement<DictionaryElementInfo> createEmployee2OrganizationAssignmentFullOrganization(DictionaryElementInfo value) {
        return new JAXBElement<DictionaryElementInfo>(_Employee2OrganizationAssignmentFullOrganization_QNAME, DictionaryElementInfo.class, Employee2OrganizationAssignmentFull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryElementInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DictionaryElementInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Subdivision", scope = Employee2OrganizationAssignmentFull.class)
    public JAXBElement<DictionaryElementInfo> createEmployee2OrganizationAssignmentFullSubdivision(DictionaryElementInfo value) {
        return new JAXBElement<DictionaryElementInfo>(_Employee2OrganizationAssignmentFullSubdivision_QNAME, DictionaryElementInfo.class, Employee2OrganizationAssignmentFull.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentNumber", scope = Violation.class)
    public JAXBElement<String> createViolationDocumentNumber(String value) {
        return new JAXBElement<String>(_ViolationDocumentNumber_QNAME, String.class, Violation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentType", scope = Violation.class)
    public JAXBElement<String> createViolationDocumentType(String value) {
        return new JAXBElement<String>(_ViolationDocumentType_QNAME, String.class, Violation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "FirstName", scope = Violation.class)
    public JAXBElement<String> createViolationFirstName(String value) {
        return new JAXBElement<String>(_ViolationFirstName_QNAME, String.class, Violation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "GroupName", scope = Violation.class)
    public JAXBElement<String> createViolationGroupName(String value) {
        return new JAXBElement<String>(_ViolationGroupName_QNAME, String.class, Violation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "GroupPath", scope = Violation.class)
    public JAXBElement<String> createViolationGroupPath(String value) {
        return new JAXBElement<String>(_ViolationGroupPath_QNAME, String.class, Violation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "IncidentDate", scope = Violation.class)
    public JAXBElement<XMLGregorianCalendar> createViolationIncidentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ViolationIncidentDate_QNAME, XMLGregorianCalendar.class, Violation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "LastName", scope = Violation.class)
    public JAXBElement<String> createViolationLastName(String value) {
        return new JAXBElement<String>(_ViolationLastName_QNAME, String.class, Violation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "NatureOfViolation", scope = Violation.class)
    public JAXBElement<String> createViolationNatureOfViolation(String value) {
        return new JAXBElement<String>(_ViolationNatureOfViolation_QNAME, String.class, Violation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "SecondName", scope = Violation.class)
    public JAXBElement<String> createViolationSecondName(String value) {
        return new JAXBElement<String>(_ViolationSecondName_QNAME, String.class, Violation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Significance", scope = Violation.class)
    public JAXBElement<String> createViolationSignificance(String value) {
        return new JAXBElement<String>(_ViolationSignificance_QNAME, String.class, Violation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "TypeOfViolation", scope = Violation.class)
    public JAXBElement<String> createViolationTypeOfViolation(String value) {
        return new JAXBElement<String>(_ViolationTypeOfViolation_QNAME, String.class, Violation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Apartm", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultApartm(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultApartm_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Area", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultArea(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultArea_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "BirthDay", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<XMLGregorianCalendar> createFirebirdIncidentEventsResultBirthDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FirebirdIncidentEventsResultBirthDay_QNAME, XMLGregorianCalendar.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Cases", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultCases(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultCases_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "City", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultCity(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultCity_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Country", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultCountry(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultCountry_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DateEvent", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<XMLGregorianCalendar> createFirebirdIncidentEventsResultDateEvent(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FirebirdIncidentEventsResultDateEvent_QNAME, XMLGregorianCalendar.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Firm", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultFirm(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultFirm_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "House", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultHouse(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultHouse_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Name", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultName(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultName_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "NameDoc", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultNameDoc(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultNameDoc_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "NumDoc", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultNumDoc(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultNumDoc_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Patronomic", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultPatronomic(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultPatronomic_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Significance", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultSignificance(String value) {
        return new JAXBElement<String>(_ViolationSignificance_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Street", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultStreet(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultStreet_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Surname", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultSurname(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultSurname_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Violation", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultViolation(String value) {
        return new JAXBElement<String>(_Violation_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "WayOfPlunder", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultWayOfPlunder(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultWayOfPlunder_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "WayOfPlunderInfo", scope = FirebirdIncidentEventsResult.class)
    public JAXBElement<String> createFirebirdIncidentEventsResultWayOfPlunderInfo(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultWayOfPlunderInfo_QNAME, String.class, FirebirdIncidentEventsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Description", scope = TangiblesSaveInfo.class)
    public JAXBElement<String> createTangiblesSaveInfoDescription(String value) {
        return new JAXBElement<String>(_TangiblesSaveInfoDescription_QNAME, String.class, TangiblesSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "MeasureID", scope = TangiblesSaveInfo.class)
    public JAXBElement<String> createTangiblesSaveInfoMeasureID(String value) {
        return new JAXBElement<String>(_TangiblesSaveInfoMeasureID_QNAME, String.class, TangiblesSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "NumberAndDateOfReturn", scope = TangiblesSaveInfo.class)
    public JAXBElement<String> createTangiblesSaveInfoNumberAndDateOfReturn(String value) {
        return new JAXBElement<String>(_TangiblesSaveInfoNumberAndDateOfReturn_QNAME, String.class, TangiblesSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "WhoTransferedID", scope = TangiblesSaveInfo.class)
    public JAXBElement<String> createTangiblesSaveInfoWhoTransferedID(String value) {
        return new JAXBElement<String>(_TangiblesSaveInfoWhoTransferedID_QNAME, String.class, TangiblesSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "MeasureName", scope = TangiblesFullInfo.class)
    public JAXBElement<String> createTangiblesFullInfoMeasureName(String value) {
        return new JAXBElement<String>(_TangiblesFullInfoMeasureName_QNAME, String.class, TangiblesFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "TangiblesName", scope = TangiblesFullInfo.class)
    public JAXBElement<String> createTangiblesFullInfoTangiblesName(String value) {
        return new JAXBElement<String>(_TangiblesFullInfoTangiblesName_QNAME, String.class, TangiblesFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "WhoTransferedName", scope = TangiblesFullInfo.class)
    public JAXBElement<String> createTangiblesFullInfoWhoTransferedName(String value) {
        return new JAXBElement<String>(_TangiblesFullInfoWhoTransferedName_QNAME, String.class, TangiblesFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "AnswerDate", scope = DocumentForActionSaveInfo.class)
    public JAXBElement<XMLGregorianCalendar> createDocumentForActionSaveInfoAnswerDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocumentForActionSaveInfoAnswerDate_QNAME, XMLGregorianCalendar.class, DocumentForActionSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "AnswerNumber", scope = DocumentForActionSaveInfo.class)
    public JAXBElement<String> createDocumentForActionSaveInfoAnswerNumber(String value) {
        return new JAXBElement<String>(_DocumentForActionSaveInfoAnswerNumber_QNAME, String.class, DocumentForActionSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "CreateDate", scope = DocumentForActionSaveInfo.class)
    public JAXBElement<XMLGregorianCalendar> createDocumentForActionSaveInfoCreateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocumentForActionSaveInfoCreateDate_QNAME, XMLGregorianCalendar.class, DocumentForActionSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DecisionDocumentTypeID", scope = DocumentForActionSaveInfo.class)
    public JAXBElement<String> createDocumentForActionSaveInfoDecisionDocumentTypeID(String value) {
        return new JAXBElement<String>(_DocumentForActionSaveInfoDecisionDocumentTypeID_QNAME, String.class, DocumentForActionSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentNumber", scope = DocumentForActionSaveInfo.class)
    public JAXBElement<String> createDocumentForActionSaveInfoDocumentNumber(String value) {
        return new JAXBElement<String>(_ViolationDocumentNumber_QNAME, String.class, DocumentForActionSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ExtraFinalPunishmentID", scope = DocumentForActionSaveInfo.class)
    public JAXBElement<String> createDocumentForActionSaveInfoExtraFinalPunishmentID(String value) {
        return new JAXBElement<String>(_DocumentForActionSaveInfoExtraFinalPunishmentID_QNAME, String.class, DocumentForActionSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "FinalPunishmentID", scope = DocumentForActionSaveInfo.class)
    public JAXBElement<String> createDocumentForActionSaveInfoFinalPunishmentID(String value) {
        return new JAXBElement<String>(_DocumentForActionSaveInfoFinalPunishmentID_QNAME, String.class, DocumentForActionSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "SentDate", scope = DocumentForActionSaveInfo.class)
    public JAXBElement<XMLGregorianCalendar> createDocumentForActionSaveInfoSentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocumentForActionSaveInfoSentDate_QNAME, XMLGregorianCalendar.class, DocumentForActionSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "WhoTransferredDecisionDocumentID", scope = DocumentForActionSaveInfo.class)
    public JAXBElement<String> createDocumentForActionSaveInfoWhoTransferredDecisionDocumentID(String value) {
        return new JAXBElement<String>(_DocumentForActionSaveInfoWhoTransferredDecisionDocumentID_QNAME, String.class, DocumentForActionSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentSentName", scope = DocumentFullForActionInfo.class)
    public JAXBElement<String> createDocumentFullForActionInfoDocumentSentName(String value) {
        return new JAXBElement<String>(_DocumentFullForActionInfoDocumentSentName_QNAME, String.class, DocumentFullForActionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentTypeName", scope = DocumentFullForActionInfo.class)
    public JAXBElement<String> createDocumentFullForActionInfoDocumentTypeName(String value) {
        return new JAXBElement<String>(_DocumentFullForActionInfoDocumentTypeName_QNAME, String.class, DocumentFullForActionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ExtraFinalPunishmentName", scope = DocumentFullForActionInfo.class)
    public JAXBElement<String> createDocumentFullForActionInfoExtraFinalPunishmentName(String value) {
        return new JAXBElement<String>(_DocumentFullForActionInfoExtraFinalPunishmentName_QNAME, String.class, DocumentFullForActionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "FinalPunishmentName", scope = DocumentFullForActionInfo.class)
    public JAXBElement<String> createDocumentFullForActionInfoFinalPunishmentName(String value) {
        return new JAXBElement<String>(_DocumentFullForActionInfoFinalPunishmentName_QNAME, String.class, DocumentFullForActionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentNumber", scope = DocumentSaveInfo.class)
    public JAXBElement<String> createDocumentSaveInfoDocumentNumber(String value) {
        return new JAXBElement<String>(_ViolationDocumentNumber_QNAME, String.class, DocumentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentTypeID", scope = DocumentSaveInfo.class)
    public JAXBElement<String> createDocumentSaveInfoDocumentTypeID(String value) {
        return new JAXBElement<String>(_DocumentSaveInfoDocumentTypeID_QNAME, String.class, DocumentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "NumberAndDateOfReturn", scope = DocumentSaveInfo.class)
    public JAXBElement<String> createDocumentSaveInfoNumberAndDateOfReturn(String value) {
        return new JAXBElement<String>(_TangiblesSaveInfoNumberAndDateOfReturn_QNAME, String.class, DocumentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "WhoTransferedDocumentID", scope = DocumentSaveInfo.class)
    public JAXBElement<String> createDocumentSaveInfoWhoTransferedDocumentID(String value) {
        return new JAXBElement<String>(_DocumentSaveInfoWhoTransferedDocumentID_QNAME, String.class, DocumentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DecisionDocumentTypeName", scope = DocumentFullInfo.class)
    public JAXBElement<String> createDocumentFullInfoDecisionDocumentTypeName(String value) {
        return new JAXBElement<String>(_DocumentFullInfoDecisionDocumentTypeName_QNAME, String.class, DocumentFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "WhoTransferredDecisionDocumentName", scope = DocumentFullInfo.class)
    public JAXBElement<String> createDocumentFullInfoWhoTransferredDecisionDocumentName(String value) {
        return new JAXBElement<String>(_DocumentFullInfoWhoTransferredDecisionDocumentName_QNAME, String.class, DocumentFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ActNumber", scope = ViolatorSaveInfo.class)
    public JAXBElement<String> createViolatorSaveInfoActNumber(String value) {
        return new JAXBElement<String>(_ViolatorSaveInfoActNumber_QNAME, String.class, ViolatorSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Comment", scope = ViolatorSaveInfo.class)
    public JAXBElement<String> createViolatorSaveInfoComment(String value) {
        return new JAXBElement<String>(_Employee2OrganizationAssignmentComment_QNAME, String.class, ViolatorSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Description", scope = ViolatorSaveInfo.class)
    public JAXBElement<String> createViolatorSaveInfoDescription(String value) {
        return new JAXBElement<String>(_TangiblesSaveInfoDescription_QNAME, String.class, ViolatorSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DetentionID", scope = ViolatorSaveInfo.class)
    public JAXBElement<String> createViolatorSaveInfoDetentionID(String value) {
        return new JAXBElement<String>(_ViolatorSaveInfoDetentionID_QNAME, String.class, ViolatorSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentForActionSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentForActionSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentForActionSaveInfo", scope = ViolatorSaveInfo.class)
    public JAXBElement<ArrayOfDocumentForActionSaveInfo> createViolatorSaveInfoDocumentForActionSaveInfo(ArrayOfDocumentForActionSaveInfo value) {
        return new JAXBElement<ArrayOfDocumentForActionSaveInfo>(_DocumentForActionSaveInfo_QNAME, ArrayOfDocumentForActionSaveInfo.class, ViolatorSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentSaveInfo", scope = ViolatorSaveInfo.class)
    public JAXBElement<ArrayOfDocumentSaveInfo> createViolatorSaveInfoDocumentSaveInfo(ArrayOfDocumentSaveInfo value) {
        return new JAXBElement<ArrayOfDocumentSaveInfo>(_DocumentSaveInfo_QNAME, ArrayOfDocumentSaveInfo.class, ViolatorSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "OrganizationID", scope = ViolatorSaveInfo.class)
    public JAXBElement<String> createViolatorSaveInfoOrganizationID(String value) {
        return new JAXBElement<String>(_ViolatorSaveInfoOrganizationID_QNAME, String.class, ViolatorSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "PositionID", scope = ViolatorSaveInfo.class)
    public JAXBElement<String> createViolatorSaveInfoPositionID(String value) {
        return new JAXBElement<String>(_ViolatorSaveInfoPositionID_QNAME, String.class, ViolatorSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "PunishmentID", scope = ViolatorSaveInfo.class)
    public JAXBElement<String> createViolatorSaveInfoPunishmentID(String value) {
        return new JAXBElement<String>(_ViolatorSaveInfoPunishmentID_QNAME, String.class, ViolatorSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "StatusID", scope = ViolatorSaveInfo.class)
    public JAXBElement<String> createViolatorSaveInfoStatusID(String value) {
        return new JAXBElement<String>(_ViolatorSaveInfoStatusID_QNAME, String.class, ViolatorSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "SubdivisionID", scope = ViolatorSaveInfo.class)
    public JAXBElement<String> createViolatorSaveInfoSubdivisionID(String value) {
        return new JAXBElement<String>(_Employee2OrganizationAssignmentSubdivisionID_QNAME, String.class, ViolatorSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "TabNumber", scope = ViolatorSaveInfo.class)
    public JAXBElement<Integer> createViolatorSaveInfoTabNumber(Integer value) {
        return new JAXBElement<Integer>(_ViolatorSaveInfoTabNumber_QNAME, Integer.class, ViolatorSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViolationSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfViolationSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ViolationsSaveInfo", scope = ViolatorSaveInfo.class)
    public JAXBElement<ArrayOfViolationSaveInfo> createViolatorSaveInfoViolationsSaveInfo(ArrayOfViolationSaveInfo value) {
        return new JAXBElement<ArrayOfViolationSaveInfo>(_ViolatorSaveInfoViolationsSaveInfo_QNAME, ArrayOfViolationSaveInfo.class, ViolatorSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeDocumentsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeDocumentsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "AcsEmployeeDocumentsData", scope = ViolatorFullInfo.class)
    public JAXBElement<AcsEmployeeDocumentsData> createViolatorFullInfoAcsEmployeeDocumentsData(AcsEmployeeDocumentsData value) {
        return new JAXBElement<AcsEmployeeDocumentsData>(_ViolatorFullInfoAcsEmployeeDocumentsData_QNAME, AcsEmployeeDocumentsData.class, ViolatorFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "AcsEmployeeFull", scope = ViolatorFullInfo.class)
    public JAXBElement<AcsEmployeeFull> createViolatorFullInfoAcsEmployeeFull(AcsEmployeeFull value) {
        return new JAXBElement<AcsEmployeeFull>(_ViolatorFullInfoAcsEmployeeFull_QNAME, AcsEmployeeFull.class, ViolatorFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DetentionName", scope = ViolatorFullInfo.class)
    public JAXBElement<String> createViolatorFullInfoDetentionName(String value) {
        return new JAXBElement<String>(_ViolatorFullInfoDetentionName_QNAME, String.class, ViolatorFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentsData", scope = ViolatorFullInfo.class)
    public JAXBElement<ArrayOfDocumentFullInfo> createViolatorFullInfoDocumentsData(ArrayOfDocumentFullInfo value) {
        return new JAXBElement<ArrayOfDocumentFullInfo>(_ViolatorFullInfoDocumentsData_QNAME, ArrayOfDocumentFullInfo.class, ViolatorFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentFullForActionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentFullForActionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentsForActionData", scope = ViolatorFullInfo.class)
    public JAXBElement<ArrayOfDocumentFullForActionInfo> createViolatorFullInfoDocumentsForActionData(ArrayOfDocumentFullForActionInfo value) {
        return new JAXBElement<ArrayOfDocumentFullForActionInfo>(_ViolatorFullInfoDocumentsForActionData_QNAME, ArrayOfDocumentFullForActionInfo.class, ViolatorFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "OrganizationName", scope = ViolatorFullInfo.class)
    public JAXBElement<String> createViolatorFullInfoOrganizationName(String value) {
        return new JAXBElement<String>(_ViolatorFullInfoOrganizationName_QNAME, String.class, ViolatorFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "PositionName", scope = ViolatorFullInfo.class)
    public JAXBElement<String> createViolatorFullInfoPositionName(String value) {
        return new JAXBElement<String>(_ViolatorFullInfoPositionName_QNAME, String.class, ViolatorFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "PunishmentName", scope = ViolatorFullInfo.class)
    public JAXBElement<String> createViolatorFullInfoPunishmentName(String value) {
        return new JAXBElement<String>(_ViolatorFullInfoPunishmentName_QNAME, String.class, ViolatorFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "StatusName", scope = ViolatorFullInfo.class)
    public JAXBElement<String> createViolatorFullInfoStatusName(String value) {
        return new JAXBElement<String>(_ViolatorFullInfoStatusName_QNAME, String.class, ViolatorFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "SubdivisionName", scope = ViolatorFullInfo.class)
    public JAXBElement<String> createViolatorFullInfoSubdivisionName(String value) {
        return new JAXBElement<String>(_ViolatorFullInfoSubdivisionName_QNAME, String.class, ViolatorFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViolationFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfViolationFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ViolationsData", scope = ViolatorFullInfo.class)
    public JAXBElement<ArrayOfViolationFullInfo> createViolatorFullInfoViolationsData(ArrayOfViolationFullInfo value) {
        return new JAXBElement<ArrayOfViolationFullInfo>(_ViolatorFullInfoViolationsData_QNAME, ArrayOfViolationFullInfo.class, ViolatorFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Description", scope = ViolationSaveInfo.class)
    public JAXBElement<String> createViolationSaveInfoDescription(String value) {
        return new JAXBElement<String>(_TangiblesSaveInfoDescription_QNAME, String.class, ViolationSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "NatureID", scope = ViolationSaveInfo.class)
    public JAXBElement<String> createViolationSaveInfoNatureID(String value) {
        return new JAXBElement<String>(_ViolationSaveInfoNatureID_QNAME, String.class, ViolationSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "TheftMethodID", scope = ViolationSaveInfo.class)
    public JAXBElement<String> createViolationSaveInfoTheftMethodID(String value) {
        return new JAXBElement<String>(_ViolationSaveInfoTheftMethodID_QNAME, String.class, ViolationSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "TypeID", scope = ViolationSaveInfo.class)
    public JAXBElement<String> createViolationSaveInfoTypeID(String value) {
        return new JAXBElement<String>(_ViolationSaveInfoTypeID_QNAME, String.class, ViolationSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "NatureName", scope = ViolationFullInfo.class)
    public JAXBElement<String> createViolationFullInfoNatureName(String value) {
        return new JAXBElement<String>(_ViolationFullInfoNatureName_QNAME, String.class, ViolationFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "TheftMethodName", scope = ViolationFullInfo.class)
    public JAXBElement<String> createViolationFullInfoTheftMethodName(String value) {
        return new JAXBElement<String>(_ViolationFullInfoTheftMethodName_QNAME, String.class, ViolationFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "TypeName", scope = ViolationFullInfo.class)
    public JAXBElement<String> createViolationFullInfoTypeName(String value) {
        return new JAXBElement<String>(_ViolationFullInfoTypeName_QNAME, String.class, ViolationFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "BeginDate", scope = IncidentsMegaFilter.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentsMegaFilterBeginDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentsMegaFilterBeginDate_QNAME, XMLGregorianCalendar.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "BeginTime", scope = IncidentsMegaFilter.class)
    public JAXBElement<Duration> createIncidentsMegaFilterBeginTime(Duration value) {
        return new JAXBElement<Duration>(_IncidentsMegaFilterBeginTime_QNAME, Duration.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Branches", scope = IncidentsMegaFilter.class)
    public JAXBElement<ArrayOfguid> createIncidentsMegaFilterBranches(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_IncidentsMegaFilterBranches_QNAME, ArrayOfguid.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DatOfBirth", scope = IncidentsMegaFilter.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentsMegaFilterDatOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentsMegaFilterDatOfBirth_QNAME, XMLGregorianCalendar.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DecisionCreateDate", scope = IncidentsMegaFilter.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentsMegaFilterDecisionCreateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentsMegaFilterDecisionCreateDate_QNAME, XMLGregorianCalendar.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DecisionDocumentNumber", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterDecisionDocumentNumber(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterDecisionDocumentNumber_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DecisionFinalPunishmentID", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterDecisionFinalPunishmentID(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterDecisionFinalPunishmentID_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentNumber", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterDocumentNumber(String value) {
        return new JAXBElement<String>(_ViolationDocumentNumber_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "EmployeeConfirmatorID", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterEmployeeConfirmatorID(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterEmployeeConfirmatorID_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "EndDate", scope = IncidentsMegaFilter.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentsMegaFilterEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentsMegaFilterEndDate_QNAME, XMLGregorianCalendar.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "EndTime", scope = IncidentsMegaFilter.class)
    public JAXBElement<Duration> createIncidentsMegaFilterEndTime(Duration value) {
        return new JAXBElement<Duration>(_IncidentsMegaFilterEndTime_QNAME, Duration.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "FirstName", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterFirstName(String value) {
        return new JAXBElement<String>(_ViolationFirstName_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "IncidentDetentionID", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterIncidentDetentionID(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterIncidentDetentionID_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "IncidentNatureID", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterIncidentNatureID(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterIncidentNatureID_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "IncidentTheftMethodID", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterIncidentTheftMethodID(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterIncidentTheftMethodID_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "IncidentTypeID", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterIncidentTypeID(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterIncidentTypeID_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "LastName", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterLastName(String value) {
        return new JAXBElement<String>(_ViolationLastName_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "LocationClarificationID", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterLocationClarificationID(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterLocationClarificationID_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "LocationID", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterLocationID(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterLocationID_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "OrganizationID", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterOrganizationID(String value) {
        return new JAXBElement<String>(_ViolatorSaveInfoOrganizationID_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "RegistrationAddress", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterRegistrationAddress(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterRegistrationAddress_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ResidentialAddress", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterResidentialAddress(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterResidentialAddress_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "SecondName", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterSecondName(String value) {
        return new JAXBElement<String>(_ViolationSecondName_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "SignificanceID", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterSignificanceID(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterSignificanceID_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "SubdivisionID", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterSubdivisionID(String value) {
        return new JAXBElement<String>(_Employee2OrganizationAssignmentSubdivisionID_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "TabNumber", scope = IncidentsMegaFilter.class)
    public JAXBElement<Integer> createIncidentsMegaFilterTabNumber(Integer value) {
        return new JAXBElement<Integer>(_ViolatorSaveInfoTabNumber_QNAME, Integer.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "TangiblesMeasureID", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterTangiblesMeasureID(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterTangiblesMeasureID_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "TangiblesNameID", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterTangiblesNameID(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterTangiblesNameID_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "VehicleMark", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterVehicleMark(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterVehicleMark_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "VehicleRegistrationNumber", scope = IncidentsMegaFilter.class)
    public JAXBElement<String> createIncidentsMegaFilterVehicleRegistrationNumber(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterVehicleRegistrationNumber_QNAME, String.class, IncidentsMegaFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Description", scope = DictionaryElementSaveInfo.class)
    public JAXBElement<String> createDictionaryElementSaveInfoDescription(String value) {
        return new JAXBElement<String>(_TangiblesSaveInfoDescription_QNAME, String.class, DictionaryElementSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ForeignID", scope = DictionaryElementSaveInfo.class)
    public JAXBElement<String> createDictionaryElementSaveInfoForeignID(String value) {
        return new JAXBElement<String>(_DictionaryElementSaveInfoForeignID_QNAME, String.class, DictionaryElementSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Name", scope = DictionaryElementSaveInfo.class)
    public JAXBElement<String> createDictionaryElementSaveInfoName(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultName_QNAME, String.class, DictionaryElementSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ForeignDescription", scope = DictionaryElementInfo.class)
    public JAXBElement<String> createDictionaryElementInfoForeignDescription(String value) {
        return new JAXBElement<String>(_DictionaryElementInfoForeignDescription_QNAME, String.class, DictionaryElementInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ForeignName", scope = DictionaryElementInfo.class)
    public JAXBElement<String> createDictionaryElementInfoForeignName(String value) {
        return new JAXBElement<String>(_DictionaryElementInfoForeignName_QNAME, String.class, DictionaryElementInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "OrganizationTypeID", scope = OrganizationDictionaryElementInfo.class)
    public JAXBElement<String> createOrganizationDictionaryElementInfoOrganizationTypeID(String value) {
        return new JAXBElement<String>(_OrganizationDictionaryElementInfoOrganizationTypeID_QNAME, String.class, OrganizationDictionaryElementInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "OrganizationTypeName", scope = OrganizationDictionaryElementInfo.class)
    public JAXBElement<String> createOrganizationDictionaryElementInfoOrganizationTypeName(String value) {
        return new JAXBElement<String>(_OrganizationDictionaryElementInfoOrganizationTypeName_QNAME, String.class, OrganizationDictionaryElementInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ParentID", scope = SecurityGroupDictionaryElementInfo.class)
    public JAXBElement<String> createSecurityGroupDictionaryElementInfoParentID(String value) {
        return new JAXBElement<String>(_SecurityGroupDictionaryElementInfoParentID_QNAME, String.class, SecurityGroupDictionaryElementInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "OrganizationTypeID", scope = OrganizationElementSaveInfo.class)
    public JAXBElement<String> createOrganizationElementSaveInfoOrganizationTypeID(String value) {
        return new JAXBElement<String>(_OrganizationDictionaryElementInfoOrganizationTypeID_QNAME, String.class, OrganizationElementSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ParentID", scope = SecurityGroupDictionaryElementSaveInfo.class)
    public JAXBElement<String> createSecurityGroupDictionaryElementSaveInfoParentID(String value) {
        return new JAXBElement<String>(_SecurityGroupDictionaryElementInfoParentID_QNAME, String.class, SecurityGroupDictionaryElementSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "AlcoholResult", scope = LogMessage.class)
    public JAXBElement<Integer> createLogMessageAlcoholResult(Integer value) {
        return new JAXBElement<Integer>(_LogMessageAlcoholResult_QNAME, Integer.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "ContentData", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageContentData(String value) {
        return new JAXBElement<String>(_LogMessageContentData_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogMessageContentDataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogMessageContentDataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "ContentType", scope = LogMessage.class)
    public JAXBElement<LogMessageContentDataType> createLogMessageContentType(LogMessageContentDataType value) {
        return new JAXBElement<LogMessageContentDataType>(_LogMessageContentType_QNAME, LogMessageContentDataType.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "Details", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageDetails(String value) {
        return new JAXBElement<String>(_LogMessageDetails_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "DriverID", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageDriverID(String value) {
        return new JAXBElement<String>(_LogMessageDriverID_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "DriverName", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageDriverName(String value) {
        return new JAXBElement<String>(_LogMessageDriverName_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "EmployeeFirstName", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageEmployeeFirstName(String value) {
        return new JAXBElement<String>(_LogMessageEmployeeFirstName_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "EmployeeGroupFullName", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageEmployeeGroupFullName(String value) {
        return new JAXBElement<String>(_LogMessageEmployeeGroupFullName_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "EmployeeGroupId", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageEmployeeGroupId(String value) {
        return new JAXBElement<String>(_LogMessageEmployeeGroupId_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "EmployeeGroupName", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageEmployeeGroupName(String value) {
        return new JAXBElement<String>(_LogMessageEmployeeGroupName_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "EmployeeID", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageEmployeeID(String value) {
        return new JAXBElement<String>(_LogMessageEmployeeID_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "EmployeeLastName", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageEmployeeLastName(String value) {
        return new JAXBElement<String>(_LogMessageEmployeeLastName_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "EmployeeSecondName", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageEmployeeSecondName(String value) {
        return new JAXBElement<String>(_LogMessageEmployeeSecondName_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "EmployeeTableNumber", scope = LogMessage.class)
    public JAXBElement<Integer> createLogMessageEmployeeTableNumber(Integer value) {
        return new JAXBElement<Integer>(_LogMessageEmployeeTableNumber_QNAME, Integer.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "LivenessResult", scope = LogMessage.class)
    public JAXBElement<Boolean> createLogMessageLivenessResult(Boolean value) {
        return new JAXBElement<Boolean>(_LogMessageLivenessResult_QNAME, Boolean.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "Message", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageMessage(String value) {
        return new JAXBElement<String>(_LogMessageMessage_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "OperatorFullName", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageOperatorFullName(String value) {
        return new JAXBElement<String>(_LogMessageOperatorFullName_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "OperatorID", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageOperatorID(String value) {
        return new JAXBElement<String>(_LogMessageOperatorID_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "OperatorLogin", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageOperatorLogin(String value) {
        return new JAXBElement<String>(_LogMessageOperatorLogin_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "ServerId", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageServerId(String value) {
        return new JAXBElement<String>(_LogMessageServerId_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "ServerName", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageServerName(String value) {
        return new JAXBElement<String>(_LogMessageServerName_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "TemperatureResult", scope = LogMessage.class)
    public JAXBElement<Integer> createLogMessageTemperatureResult(Integer value) {
        return new JAXBElement<Integer>(_LogMessageTemperatureResult_QNAME, Integer.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "VehicleBrand", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageVehicleBrand(String value) {
        return new JAXBElement<String>(_LogMessageVehicleBrand_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "VehicleID", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageVehicleID(String value) {
        return new JAXBElement<String>(_LogMessageVehicleID_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "VehicleRegistrationNumber", scope = LogMessage.class)
    public JAXBElement<String> createLogMessageVehicleRegistrationNumber(String value) {
        return new JAXBElement<String>(_LogMessageVehicleRegistrationNumber_QNAME, String.class, LogMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "Name", scope = LogMessageSubtypeSlimInfo.class)
    public JAXBElement<String> createLogMessageSubtypeSlimInfoName(String value) {
        return new JAXBElement<String>(_LogMessageSubtypeSlimInfoName_QNAME, String.class, LogMessageSubtypeSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "Name", scope = LogMessageTypeSlimInfo.class)
    public JAXBElement<String> createLogMessageTypeSlimInfoName(String value) {
        return new JAXBElement<String>(_LogMessageSubtypeSlimInfoName_QNAME, String.class, LogMessageTypeSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.AdditionalFields", name = "ItemValue", scope = ListItem.class)
    public JAXBElement<String> createListItemItemValue(String value) {
        return new JAXBElement<String>(_ListItemItemValue_QNAME, String.class, ListItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "Description", scope = MifareProfileSaveData.class)
    public JAXBElement<String> createMifareProfileSaveDataDescription(String value) {
        return new JAXBElement<String>(_MifareProfileSaveDataDescription_QNAME, String.class, MifareProfileSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "Name", scope = MifareProfileSaveData.class)
    public JAXBElement<String> createMifareProfileSaveDataName(String value) {
        return new JAXBElement<String>(_MifareProfileSaveDataName_QNAME, String.class, MifareProfileSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessBits }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessBits }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "Block1", scope = MifareProfileFullSaveData.class)
    public JAXBElement<AccessBits> createMifareProfileFullSaveDataBlock1(AccessBits value) {
        return new JAXBElement<AccessBits>(_MifareProfileFullSaveDataBlock1_QNAME, AccessBits.class, MifareProfileFullSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessBits }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessBits }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "Block2", scope = MifareProfileFullSaveData.class)
    public JAXBElement<AccessBits> createMifareProfileFullSaveDataBlock2(AccessBits value) {
        return new JAXBElement<AccessBits>(_MifareProfileFullSaveDataBlock2_QNAME, AccessBits.class, MifareProfileFullSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessBits }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessBits }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "Block3", scope = MifareProfileFullSaveData.class)
    public JAXBElement<AccessBits> createMifareProfileFullSaveDataBlock3(AccessBits value) {
        return new JAXBElement<AccessBits>(_MifareProfileFullSaveDataBlock3_QNAME, AccessBits.class, MifareProfileFullSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "CardConfigurationKey", scope = MifareProfileFullSaveData.class)
    public JAXBElement<String> createMifareProfileFullSaveDataCardConfigurationKey(String value) {
        return new JAXBElement<String>(_MifareProfileFullSaveDataCardConfigurationKey_QNAME, String.class, MifareProfileFullSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "CardMasterKey", scope = MifareProfileFullSaveData.class)
    public JAXBElement<String> createMifareProfileFullSaveDataCardMasterKey(String value) {
        return new JAXBElement<String>(_MifareProfileFullSaveDataCardMasterKey_QNAME, String.class, MifareProfileFullSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "ClassicEmissionMode", scope = MifareProfileFullSaveData.class)
    public JAXBElement<Boolean> createMifareProfileFullSaveDataClassicEmissionMode(Boolean value) {
        return new JAXBElement<Boolean>(_MifareProfileFullSaveDataClassicEmissionMode_QNAME, Boolean.class, MifareProfileFullSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "ClassicKeyA", scope = MifareProfileFullSaveData.class)
    public JAXBElement<String> createMifareProfileFullSaveDataClassicKeyA(String value) {
        return new JAXBElement<String>(_MifareProfileFullSaveDataClassicKeyA_QNAME, String.class, MifareProfileFullSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "ClassicKeyB", scope = MifareProfileFullSaveData.class)
    public JAXBElement<String> createMifareProfileFullSaveDataClassicKeyB(String value) {
        return new JAXBElement<String>(_MifareProfileFullSaveDataClassicKeyB_QNAME, String.class, MifareProfileFullSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessBits }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessBits }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "KeyBlock", scope = MifareProfileFullSaveData.class)
    public JAXBElement<AccessBits> createMifareProfileFullSaveDataKeyBlock(AccessBits value) {
        return new JAXBElement<AccessBits>(_MifareProfileFullSaveDataKeyBlock_QNAME, AccessBits.class, MifareProfileFullSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "Level2SwitchKey", scope = MifareProfileFullSaveData.class)
    public JAXBElement<String> createMifareProfileFullSaveDataLevel2SwitchKey(String value) {
        return new JAXBElement<String>(_MifareProfileFullSaveDataLevel2SwitchKey_QNAME, String.class, MifareProfileFullSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "Level3SwitchKey", scope = MifareProfileFullSaveData.class)
    public JAXBElement<String> createMifareProfileFullSaveDataLevel3SwitchKey(String value) {
        return new JAXBElement<String>(_MifareProfileFullSaveDataLevel3SwitchKey_QNAME, String.class, MifareProfileFullSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "PlusEmissionMode", scope = MifareProfileFullSaveData.class)
    public JAXBElement<Boolean> createMifareProfileFullSaveDataPlusEmissionMode(Boolean value) {
        return new JAXBElement<Boolean>(_MifareProfileFullSaveDataPlusEmissionMode_QNAME, Boolean.class, MifareProfileFullSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "PlusKeyA", scope = MifareProfileFullSaveData.class)
    public JAXBElement<String> createMifareProfileFullSaveDataPlusKeyA(String value) {
        return new JAXBElement<String>(_MifareProfileFullSaveDataPlusKeyA_QNAME, String.class, MifareProfileFullSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "PlusKeyB", scope = MifareProfileFullSaveData.class)
    public JAXBElement<String> createMifareProfileFullSaveDataPlusKeyB(String value) {
        return new JAXBElement<String>(_MifareProfileFullSaveDataPlusKeyB_QNAME, String.class, MifareProfileFullSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "Sl1CardAuthenticationKey", scope = MifareProfileFullSaveData.class)
    public JAXBElement<String> createMifareProfileFullSaveDataSl1CardAuthenticationKey(String value) {
        return new JAXBElement<String>(_MifareProfileFullSaveDataSl1CardAuthenticationKey_QNAME, String.class, MifareProfileFullSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "BranchID", scope = IncidentSaveInfo.class)
    public JAXBElement<String> createIncidentSaveInfoBranchID(String value) {
        return new JAXBElement<String>(_IncidentSaveInfoBranchID_QNAME, String.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Date", scope = IncidentSaveInfo.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentSaveInfoDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentSaveInfoDate_QNAME, XMLGregorianCalendar.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentNumber", scope = IncidentSaveInfo.class)
    public JAXBElement<String> createIncidentSaveInfoDocumentNumber(String value) {
        return new JAXBElement<String>(_ViolationDocumentNumber_QNAME, String.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentTypeID", scope = IncidentSaveInfo.class)
    public JAXBElement<String> createIncidentSaveInfoDocumentTypeID(String value) {
        return new JAXBElement<String>(_DocumentSaveInfoDocumentTypeID_QNAME, String.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "EmployeeID", scope = IncidentSaveInfo.class)
    public JAXBElement<String> createIncidentSaveInfoEmployeeID(String value) {
        return new JAXBElement<String>(_IncidentSaveInfoEmployeeID_QNAME, String.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "LocationClarificationID", scope = IncidentSaveInfo.class)
    public JAXBElement<String> createIncidentSaveInfoLocationClarificationID(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterLocationClarificationID_QNAME, String.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "LocationID", scope = IncidentSaveInfo.class)
    public JAXBElement<String> createIncidentSaveInfoLocationID(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterLocationID_QNAME, String.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViolatorSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfViolatorSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "MembersSaveInfo", scope = IncidentSaveInfo.class)
    public JAXBElement<ArrayOfViolatorSaveInfo> createIncidentSaveInfoMembersSaveInfo(ArrayOfViolatorSaveInfo value) {
        return new JAXBElement<ArrayOfViolatorSaveInfo>(_IncidentSaveInfoMembersSaveInfo_QNAME, ArrayOfViolatorSaveInfo.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "SecurityGroupID", scope = IncidentSaveInfo.class)
    public JAXBElement<String> createIncidentSaveInfoSecurityGroupID(String value) {
        return new JAXBElement<String>(_IncidentSaveInfoSecurityGroupID_QNAME, String.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "SignificanceID", scope = IncidentSaveInfo.class)
    public JAXBElement<String> createIncidentSaveInfoSignificanceID(String value) {
        return new JAXBElement<String>(_IncidentsMegaFilterSignificanceID_QNAME, String.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTangiblesSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTangiblesSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "TangiblesSaveInfo", scope = IncidentSaveInfo.class)
    public JAXBElement<ArrayOfTangiblesSaveInfo> createIncidentSaveInfoTangiblesSaveInfo(ArrayOfTangiblesSaveInfo value) {
        return new JAXBElement<ArrayOfTangiblesSaveInfo>(_TangiblesSaveInfo_QNAME, ArrayOfTangiblesSaveInfo.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Time", scope = IncidentSaveInfo.class)
    public JAXBElement<Duration> createIncidentSaveInfoTime(Duration value) {
        return new JAXBElement<Duration>(_IncidentSaveInfoTime_QNAME, Duration.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "VehicleComment", scope = IncidentSaveInfo.class)
    public JAXBElement<String> createIncidentSaveInfoVehicleComment(String value) {
        return new JAXBElement<String>(_IncidentSaveInfoVehicleComment_QNAME, String.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "VehicleID", scope = IncidentSaveInfo.class)
    public JAXBElement<String> createIncidentSaveInfoVehicleID(String value) {
        return new JAXBElement<String>(_IncidentSaveInfoVehicleID_QNAME, String.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "VehicleOrganizationID", scope = IncidentSaveInfo.class)
    public JAXBElement<String> createIncidentSaveInfoVehicleOrganizationID(String value) {
        return new JAXBElement<String>(_IncidentSaveInfoVehicleOrganizationID_QNAME, String.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ViolationDescription", scope = IncidentSaveInfo.class)
    public JAXBElement<String> createIncidentSaveInfoViolationDescription(String value) {
        return new JAXBElement<String>(_IncidentSaveInfoViolationDescription_QNAME, String.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ViolationNatureID", scope = IncidentSaveInfo.class)
    public JAXBElement<String> createIncidentSaveInfoViolationNatureID(String value) {
        return new JAXBElement<String>(_IncidentSaveInfoViolationNatureID_QNAME, String.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ViolationTheftMethodID", scope = IncidentSaveInfo.class)
    public JAXBElement<String> createIncidentSaveInfoViolationTheftMethodID(String value) {
        return new JAXBElement<String>(_IncidentSaveInfoViolationTheftMethodID_QNAME, String.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ViolationTypeID", scope = IncidentSaveInfo.class)
    public JAXBElement<String> createIncidentSaveInfoViolationTypeID(String value) {
        return new JAXBElement<String>(_IncidentSaveInfoViolationTypeID_QNAME, String.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViolatorSaveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfViolatorSaveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ViolatorSaveInfo", scope = IncidentSaveInfo.class)
    public JAXBElement<ArrayOfViolatorSaveInfo> createIncidentSaveInfoViolatorSaveInfo(ArrayOfViolatorSaveInfo value) {
        return new JAXBElement<ArrayOfViolatorSaveInfo>(_ViolatorSaveInfo_QNAME, ArrayOfViolatorSaveInfo.class, IncidentSaveInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Description", scope = IncidentTemplateSaveData.class)
    public JAXBElement<String> createIncidentTemplateSaveDataDescription(String value) {
        return new JAXBElement<String>(_TangiblesSaveInfoDescription_QNAME, String.class, IncidentTemplateSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Name", scope = IncidentTemplateSaveData.class)
    public JAXBElement<String> createIncidentTemplateSaveDataName(String value) {
        return new JAXBElement<String>(_FirebirdIncidentEventsResultName_QNAME, String.class, IncidentTemplateSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentTemplateSaveData.Template }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncidentTemplateSaveData.Template }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Template", scope = IncidentTemplateSaveData.class)
    public JAXBElement<IncidentTemplateSaveData.Template> createIncidentTemplateSaveDataTemplate(IncidentTemplateSaveData.Template value) {
        return new JAXBElement<IncidentTemplateSaveData.Template>(_IncidentTemplateSaveDataTemplate_QNAME, IncidentTemplateSaveData.Template.class, IncidentTemplateSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "Resource", scope = ClaimSaveData.class)
    public JAXBElement<String> createClaimSaveDataResource(String value) {
        return new JAXBElement<String>(_ClaimSaveDataResource_QNAME, String.class, ClaimSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "Type", scope = ClaimSaveData.class)
    public JAXBElement<String> createClaimSaveDataType(String value) {
        return new JAXBElement<String>(_ClaimSaveDataType_QNAME, String.class, ClaimSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "Description", scope = WorkScheduleSlimSaveData.class)
    public JAXBElement<String> createWorkScheduleSlimSaveDataDescription(String value) {
        return new JAXBElement<String>(_WorkScheduleSlimSaveDataDescription_QNAME, String.class, WorkScheduleSlimSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "Name", scope = WorkScheduleSlimSaveData.class)
    public JAXBElement<String> createWorkScheduleSlimSaveDataName(String value) {
        return new JAXBElement<String>(_WorkScheduleSlimSaveDataName_QNAME, String.class, WorkScheduleSlimSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "Convention", scope = DayTypeSaveData.class)
    public JAXBElement<String> createDayTypeSaveDataConvention(String value) {
        return new JAXBElement<String>(_DayTypeSaveDataConvention_QNAME, String.class, DayTypeSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "DigitalConvention", scope = DayTypeSaveData.class)
    public JAXBElement<Integer> createDayTypeSaveDataDigitalConvention(Integer value) {
        return new JAXBElement<Integer>(_DayTypeSaveDataDigitalConvention_QNAME, Integer.class, DayTypeSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "Name", scope = DayTypeSaveData.class)
    public JAXBElement<String> createDayTypeSaveDataName(String value) {
        return new JAXBElement<String>(_WorkScheduleSlimSaveDataName_QNAME, String.class, DayTypeSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "RowColor", scope = DayTypeSaveData.class)
    public JAXBElement<byte[]> createDayTypeSaveDataRowColor(byte[] value) {
        return new JAXBElement<byte[]>(_DayTypeSaveDataRowColor_QNAME, byte[].class, DayTypeSaveData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhotoOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhotoOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "DriverLicensePhoto", scope = AcsConfiguratorSaveData.class)
    public JAXBElement<PhotoOrder> createAcsConfiguratorSaveDataDriverLicensePhoto(PhotoOrder value) {
        return new JAXBElement<PhotoOrder>(_AcsConfiguratorSaveDataDriverLicensePhoto_QNAME, PhotoOrder.class, AcsConfiguratorSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "EmployeeTabs", scope = AcsConfiguratorSaveData.class)
    public JAXBElement<String> createAcsConfiguratorSaveDataEmployeeTabs(String value) {
        return new JAXBElement<String>(_AcsConfiguratorSaveDataEmployeeTabs_QNAME, String.class, AcsConfiguratorSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhotoOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhotoOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "ForeignPassportPhoto", scope = AcsConfiguratorSaveData.class)
    public JAXBElement<PhotoOrder> createAcsConfiguratorSaveDataForeignPassportPhoto(PhotoOrder value) {
        return new JAXBElement<PhotoOrder>(_AcsConfiguratorSaveDataForeignPassportPhoto_QNAME, PhotoOrder.class, AcsConfiguratorSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhotoOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhotoOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "PassportPhoto", scope = AcsConfiguratorSaveData.class)
    public JAXBElement<PhotoOrder> createAcsConfiguratorSaveDataPassportPhoto(PhotoOrder value) {
        return new JAXBElement<PhotoOrder>(_AcsConfiguratorSaveDataPassportPhoto_QNAME, PhotoOrder.class, AcsConfiguratorSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "UseDefaultFIODocumentType", scope = AcsConfiguratorSaveData.class)
    public JAXBElement<DocumentType> createAcsConfiguratorSaveDataUseDefaultFIODocumentType(DocumentType value) {
        return new JAXBElement<DocumentType>(_AcsConfiguratorSaveDataUseDefaultFIODocumentType_QNAME, DocumentType.class, AcsConfiguratorSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "Comment", scope = WorkplaceModuleSaveData.class)
    public JAXBElement<String> createWorkplaceModuleSaveDataComment(String value) {
        return new JAXBElement<String>(_WorkplaceModuleSaveDataComment_QNAME, String.class, WorkplaceModuleSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "Name", scope = WorkplaceModuleSaveData.class)
    public JAXBElement<String> createWorkplaceModuleSaveDataName(String value) {
        return new JAXBElement<String>(_WorkplaceModuleSaveDataName_QNAME, String.class, WorkplaceModuleSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "Comment", scope = WorkplaceSaveData.class)
    public JAXBElement<String> createWorkplaceSaveDataComment(String value) {
        return new JAXBElement<String>(_WorkplaceModuleSaveDataComment_QNAME, String.class, WorkplaceSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "Name", scope = WorkplaceSaveData.class)
    public JAXBElement<String> createWorkplaceSaveDataName(String value) {
        return new JAXBElement<String>(_WorkplaceModuleSaveDataName_QNAME, String.class, WorkplaceSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkplaceModuleInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkplaceModuleInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Workplace", name = "Modules", scope = WorkplaceInfo.class)
    public JAXBElement<ArrayOfWorkplaceModuleInfo> createWorkplaceInfoModules(ArrayOfWorkplaceModuleInfo value) {
        return new JAXBElement<ArrayOfWorkplaceModuleInfo>(_WorkplaceInfoModules_QNAME, ArrayOfWorkplaceModuleInfo.class, WorkplaceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriversCustomizableDays }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriversCustomizableDays }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "Rows", scope = LChangedCustomizableDays.class)
    public JAXBElement<ArrayOfLDriversCustomizableDays> createLChangedCustomizableDaysRows(ArrayOfLDriversCustomizableDays value) {
        return new JAXBElement<ArrayOfLDriversCustomizableDays>(_LChangedCustomizableDaysRows_QNAME, ArrayOfLDriversCustomizableDays.class, LChangedCustomizableDays.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLKeyInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLKeyInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.StorageState", name = "Keys", scope = LChangedKeys.class)
    public JAXBElement<ArrayOfLKeyInfo> createLChangedKeysKeys(ArrayOfLKeyInfo value) {
        return new JAXBElement<ArrayOfLKeyInfo>(_LChangedKeysKeys_QNAME, ArrayOfLKeyInfo.class, LChangedKeys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.HotKey", name = "Modules", scope = RezervedHotKeys.class)
    public JAXBElement<ArrayOfstring> createRezervedHotKeysModules(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_RezervedHotKeysModules_QNAME, ArrayOfstring.class, RezervedHotKeys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Photo", name = "Name", scope = PhotoOrder.class)
    public JAXBElement<String> createPhotoOrderName(String value) {
        return new JAXBElement<String>(_PhotoOrderName_QNAME, String.class, PhotoOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "CameraDriverId", scope = ReactionRecordVideoActionSaveData.class)
    public JAXBElement<String> createReactionRecordVideoActionSaveDataCameraDriverId(String value) {
        return new JAXBElement<String>(_ReactionRecordVideoActionSaveDataCameraDriverId_QNAME, String.class, ReactionRecordVideoActionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "Args", scope = ReactionExecuteProgramActionSaveData.class)
    public JAXBElement<String> createReactionExecuteProgramActionSaveDataArgs(String value) {
        return new JAXBElement<String>(_ReactionExecuteProgramActionSaveDataArgs_QNAME, String.class, ReactionExecuteProgramActionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "FilePath", scope = ReactionExecuteProgramActionSaveData.class)
    public JAXBElement<String> createReactionExecuteProgramActionSaveDataFilePath(String value) {
        return new JAXBElement<String>(_ReactionExecuteProgramActionSaveDataFilePath_QNAME, String.class, ReactionExecuteProgramActionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "WorkingDir", scope = ReactionExecuteProgramActionSaveData.class)
    public JAXBElement<String> createReactionExecuteProgramActionSaveDataWorkingDir(String value) {
        return new JAXBElement<String>(_ReactionExecuteProgramActionSaveDataWorkingDir_QNAME, String.class, ReactionExecuteProgramActionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "CustomText", scope = ReactionSendEmailActionSaveData.class)
    public JAXBElement<String> createReactionSendEmailActionSaveDataCustomText(String value) {
        return new JAXBElement<String>(_ReactionSendEmailActionSaveDataCustomText_QNAME, String.class, ReactionSendEmailActionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "EmailDistributionAddressId", scope = ReactionSendEmailActionSaveData.class)
    public JAXBElement<String> createReactionSendEmailActionSaveDataEmailDistributionAddressId(String value) {
        return new JAXBElement<String>(_ReactionSendEmailActionSaveDataEmailDistributionAddressId_QNAME, String.class, ReactionSendEmailActionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "NumbersToSendEmailForEmployeesFromEvents", scope = ReactionSendEmailActionSaveData.class)
    public JAXBElement<ArrayOfint> createReactionSendEmailActionSaveDataNumbersToSendEmailForEmployeesFromEvents(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ReactionSendEmailActionSaveDataNumbersToSendEmailForEmployeesFromEvents_QNAME, ArrayOfint.class, ReactionSendEmailActionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "NumbersToSendEmailForEmployeesFromList", scope = ReactionSendEmailActionSaveData.class)
    public JAXBElement<ArrayOfint> createReactionSendEmailActionSaveDataNumbersToSendEmailForEmployeesFromList(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ReactionSendEmailActionSaveDataNumbersToSendEmailForEmployeesFromList_QNAME, ArrayOfint.class, ReactionSendEmailActionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "CustomText", scope = ReactionSendSMSActionSaveData.class)
    public JAXBElement<String> createReactionSendSMSActionSaveDataCustomText(String value) {
        return new JAXBElement<String>(_ReactionSendEmailActionSaveDataCustomText_QNAME, String.class, ReactionSendSMSActionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "GsmModemDriverId", scope = ReactionSendSMSActionSaveData.class)
    public JAXBElement<String> createReactionSendSMSActionSaveDataGsmModemDriverId(String value) {
        return new JAXBElement<String>(_ReactionSendSMSActionSaveDataGsmModemDriverId_QNAME, String.class, ReactionSendSMSActionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "NumbersToSendSMSForEmployeesFromEvents", scope = ReactionSendSMSActionSaveData.class)
    public JAXBElement<ArrayOfint> createReactionSendSMSActionSaveDataNumbersToSendSMSForEmployeesFromEvents(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ReactionSendSMSActionSaveDataNumbersToSendSMSForEmployeesFromEvents_QNAME, ArrayOfint.class, ReactionSendSMSActionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "NumbersToSendSMSForEmployeesFromList", scope = ReactionSendSMSActionSaveData.class)
    public JAXBElement<ArrayOfint> createReactionSendSMSActionSaveDataNumbersToSendSMSForEmployeesFromList(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ReactionSendSMSActionSaveDataNumbersToSendSMSForEmployeesFromList_QNAME, ArrayOfint.class, ReactionSendSMSActionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "Description", scope = ReactionSaveData.class)
    public JAXBElement<String> createReactionSaveDataDescription(String value) {
        return new JAXBElement<String>(_ReactionSaveDataDescription_QNAME, String.class, ReactionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "Name", scope = ReactionSaveData.class)
    public JAXBElement<String> createReactionSaveDataName(String value) {
        return new JAXBElement<String>(_ReactionActionSaveDataName_QNAME, String.class, ReactionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", name = "Id", scope = UserPassEditorData.class)
    public JAXBElement<String> createUserPassEditorDataId(String value) {
        return new JAXBElement<String>(_UserPassEditorDataId_QNAME, String.class, UserPassEditorData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", name = "BackgroindImage", scope = UserPassFullSaveData.class)
    public JAXBElement<byte[]> createUserPassFullSaveDataBackgroindImage(byte[] value) {
        return new JAXBElement<byte[]>(_UserPassFullSaveDataBackgroindImage_QNAME, byte[].class, UserPassFullSaveData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", name = "BackgroundColor", scope = UserPassFullSaveData.class)
    public JAXBElement<byte[]> createUserPassFullSaveDataBackgroundColor(byte[] value) {
        return new JAXBElement<byte[]>(_UserPassFullSaveDataBackgroundColor_QNAME, byte[].class, UserPassFullSaveData.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "Description", scope = FilterTagSaveData.class)
    public JAXBElement<String> createFilterTagSaveDataDescription(String value) {
        return new JAXBElement<String>(_FilterTagFullInfoDescription_QNAME, String.class, FilterTagSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "Name", scope = FilterTagSaveData.class)
    public JAXBElement<String> createFilterTagSaveDataName(String value) {
        return new JAXBElement<String>(_FilterTagFullInfoName_QNAME, String.class, FilterTagSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "Description", scope = TagSaveData.class)
    public JAXBElement<String> createTagSaveDataDescription(String value) {
        return new JAXBElement<String>(_FilterTagFullInfoDescription_QNAME, String.class, TagSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Tag", name = "Name", scope = TagSaveData.class)
    public JAXBElement<String> createTagSaveDataName(String value) {
        return new JAXBElement<String>(_FilterTagFullInfoName_QNAME, String.class, TagSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PostOffice", name = "KeyKeeperRBDriverID", scope = POBRelation.class)
    public JAXBElement<String> createPOBRelationKeyKeeperRBDriverID(String value) {
        return new JAXBElement<String>(_POBRelationKeyKeeperRBDriverID_QNAME, String.class, POBRelation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PostOffice", name = "POBCellDriverID", scope = POBRelation.class)
    public JAXBElement<String> createPOBRelationPOBCellDriverID(String value) {
        return new JAXBElement<String>(_POBRelationPOBCellDriverID_QNAME, String.class, POBRelation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.PostOffice", name = "Pin", scope = POBRelation.class)
    public JAXBElement<Integer> createPOBRelationPin(Integer value) {
        return new JAXBElement<Integer>(_POBRelationPin_QNAME, Integer.class, POBRelation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", name = "Name", scope = ScreenLayoutSaveData.class)
    public JAXBElement<String> createScreenLayoutSaveDataName(String value) {
        return new JAXBElement<String>(_ScreenCellSaveDataName_QNAME, String.class, ScreenLayoutSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "Name", scope = ISSDriverSlimInfo.class)
    public JAXBElement<String> createISSDriverSlimInfoName(String value) {
        return new JAXBElement<String>(_ISSEntityBaseName_QNAME, String.class, ISSDriverSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "Address", scope = ISSRecognitionSaveData.class)
    public JAXBElement<String> createISSRecognitionSaveDataAddress(String value) {
        return new JAXBElement<String>(_ISSRecognitionSaveDataAddress_QNAME, String.class, ISSRecognitionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "Name", scope = ISSRecognitionSaveData.class)
    public JAXBElement<String> createISSRecognitionSaveDataName(String value) {
        return new JAXBElement<String>(_ISSEntityBaseName_QNAME, String.class, ISSRecognitionSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "Address", scope = ISSIIDKSaveData.class)
    public JAXBElement<String> createISSIIDKSaveDataAddress(String value) {
        return new JAXBElement<String>(_ISSRecognitionSaveDataAddress_QNAME, String.class, ISSIIDKSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "Name", scope = ISSIIDKSaveData.class)
    public JAXBElement<String> createISSIIDKSaveDataName(String value) {
        return new JAXBElement<String>(_ISSEntityBaseName_QNAME, String.class, ISSIIDKSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfISSSlaveSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfISSSlaveSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ISS", name = "Slaves", scope = ISSIIDKSlimInfo.class)
    public JAXBElement<ArrayOfISSSlaveSlimInfo> createISSIIDKSlimInfoSlaves(ArrayOfISSSlaveSlimInfo value) {
        return new JAXBElement<ArrayOfISSSlaveSlimInfo>(_ISSIIDKSlimInfoSlaves_QNAME, ArrayOfISSSlaveSlimInfo.class, ISSIIDKSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsAccessPointDriverInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsAccessPointDriverInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "AcsAccessPointDriverInfo", scope = WorkZonesAccessPointSlimInfo.class)
    public JAXBElement<AcsAccessPointDriverInfo> createWorkZonesAccessPointSlimInfoAcsAccessPointDriverInfo(AcsAccessPointDriverInfo value) {
        return new JAXBElement<AcsAccessPointDriverInfo>(_WorkZonesAccessPointSlimInfoAcsAccessPointDriverInfo_QNAME, AcsAccessPointDriverInfo.class, WorkZonesAccessPointSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "Description", scope = WorkZoneSlimSaveData.class)
    public JAXBElement<String> createWorkZoneSlimSaveDataDescription(String value) {
        return new JAXBElement<String>(_WorkScheduleSlimSaveDataDescription_QNAME, String.class, WorkZoneSlimSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "Name", scope = WorkZoneSlimSaveData.class)
    public JAXBElement<String> createWorkZoneSlimSaveDataName(String value) {
        return new JAXBElement<String>(_WorkScheduleSlimSaveDataName_QNAME, String.class, WorkZoneSlimSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "ScheduleId", scope = ReactionEventsFromDevicesSaveData.class)
    public JAXBElement<String> createReactionEventsFromDevicesSaveDataScheduleId(String value) {
        return new JAXBElement<String>(_ReactionEventsFromDevicesSaveDataScheduleId_QNAME, String.class, ReactionEventsFromDevicesSaveData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLEmployeePositionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLEmployeePositionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", name = "UserPositions", scope = LEmployeePositionsData.class)
    public JAXBElement<ArrayOfLEmployeePositionInfo> createLEmployeePositionsDataUserPositions(ArrayOfLEmployeePositionInfo value) {
        return new JAXBElement<ArrayOfLEmployeePositionInfo>(_LEmployeePositionsDataUserPositions_QNAME, ArrayOfLEmployeePositionInfo.class, LEmployeePositionsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", name = "Code", scope = LEmployeePositionInfo.class)
    public JAXBElement<String> createLEmployeePositionInfoCode(String value) {
        return new JAXBElement<String>(_LEmployeePositionInfoCode_QNAME, String.class, LEmployeePositionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", name = "Comment", scope = LEmployeePositionInfo.class)
    public JAXBElement<String> createLEmployeePositionInfoComment(String value) {
        return new JAXBElement<String>(_LEmployeePositionInfoComment_QNAME, String.class, LEmployeePositionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ACS", name = "Name", scope = LEmployeePositionInfo.class)
    public JAXBElement<String> createLEmployeePositionInfoName(String value) {
        return new JAXBElement<String>(_EmployeePositionSlimInfoName_QNAME, String.class, LEmployeePositionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCardTypeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCardTypeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CardType", name = "CardTypes", scope = CardTypesInfoData.class)
    public JAXBElement<ArrayOfCardTypeInfo> createCardTypesInfoDataCardTypes(ArrayOfCardTypeInfo value) {
        return new JAXBElement<ArrayOfCardTypeInfo>(_CardTypesInfoDataCardTypes_QNAME, ArrayOfCardTypeInfo.class, CardTypesInfoData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DateOfBirth", scope = ViolatorFilter.class)
    public JAXBElement<XMLGregorianCalendar> createViolatorFilterDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ViolatorFilterDateOfBirth_QNAME, XMLGregorianCalendar.class, ViolatorFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "FirstName", scope = ViolatorFilter.class)
    public JAXBElement<String> createViolatorFilterFirstName(String value) {
        return new JAXBElement<String>(_ViolationFirstName_QNAME, String.class, ViolatorFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "LastName", scope = ViolatorFilter.class)
    public JAXBElement<String> createViolatorFilterLastName(String value) {
        return new JAXBElement<String>(_ViolationLastName_QNAME, String.class, ViolatorFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "SecondName", scope = ViolatorFilter.class)
    public JAXBElement<String> createViolatorFilterSecondName(String value) {
        return new JAXBElement<String>(_ViolationSecondName_QNAME, String.class, ViolatorFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "TableNumber", scope = ViolatorFilter.class)
    public JAXBElement<Integer> createViolatorFilterTableNumber(Integer value) {
        return new JAXBElement<Integer>(_ViolatorFilterTableNumber_QNAME, Integer.class, ViolatorFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeDocumentsData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeDocumentsData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "AcsEmployeeDocumentsData", scope = IncidentElementFullInfo.class)
    public JAXBElement<AcsEmployeeDocumentsData> createIncidentElementFullInfoAcsEmployeeDocumentsData(AcsEmployeeDocumentsData value) {
        return new JAXBElement<AcsEmployeeDocumentsData>(_ViolatorFullInfoAcsEmployeeDocumentsData_QNAME, AcsEmployeeDocumentsData.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsEmployeeFull }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsEmployeeFull }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "AcsEmployeeFull", scope = IncidentElementFullInfo.class)
    public JAXBElement<AcsEmployeeFull> createIncidentElementFullInfoAcsEmployeeFull(AcsEmployeeFull value) {
        return new JAXBElement<AcsEmployeeFull>(_ViolatorFullInfoAcsEmployeeFull_QNAME, AcsEmployeeFull.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "BranchName", scope = IncidentElementFullInfo.class)
    public JAXBElement<String> createIncidentElementFullInfoBranchName(String value) {
        return new JAXBElement<String>(_IncidentElementFullInfoBranchName_QNAME, String.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "DocumentTypeName", scope = IncidentElementFullInfo.class)
    public JAXBElement<String> createIncidentElementFullInfoDocumentTypeName(String value) {
        return new JAXBElement<String>(_DocumentFullForActionInfoDocumentTypeName_QNAME, String.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "EmployeeFullName", scope = IncidentElementFullInfo.class)
    public JAXBElement<String> createIncidentElementFullInfoEmployeeFullName(String value) {
        return new JAXBElement<String>(_IncidentElementFullInfoEmployeeFullName_QNAME, String.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "LocationClarificationName", scope = IncidentElementFullInfo.class)
    public JAXBElement<String> createIncidentElementFullInfoLocationClarificationName(String value) {
        return new JAXBElement<String>(_IncidentElementFullInfoLocationClarificationName_QNAME, String.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "LocationName", scope = IncidentElementFullInfo.class)
    public JAXBElement<String> createIncidentElementFullInfoLocationName(String value) {
        return new JAXBElement<String>(_IncidentElementFullInfoLocationName_QNAME, String.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViolatorFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfViolatorFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Members", scope = IncidentElementFullInfo.class)
    public JAXBElement<ArrayOfViolatorFullInfo> createIncidentElementFullInfoMembers(ArrayOfViolatorFullInfo value) {
        return new JAXBElement<ArrayOfViolatorFullInfo>(_IncidentElementFullInfoMembers_QNAME, ArrayOfViolatorFullInfo.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "SecurityGroupName", scope = IncidentElementFullInfo.class)
    public JAXBElement<String> createIncidentElementFullInfoSecurityGroupName(String value) {
        return new JAXBElement<String>(_IncidentElementFullInfoSecurityGroupName_QNAME, String.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "SignificanceName", scope = IncidentElementFullInfo.class)
    public JAXBElement<String> createIncidentElementFullInfoSignificanceName(String value) {
        return new JAXBElement<String>(_IncidentElementFullInfoSignificanceName_QNAME, String.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTangiblesFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTangiblesFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Tangibles", scope = IncidentElementFullInfo.class)
    public JAXBElement<ArrayOfTangiblesFullInfo> createIncidentElementFullInfoTangibles(ArrayOfTangiblesFullInfo value) {
        return new JAXBElement<ArrayOfTangiblesFullInfo>(_IncidentElementFullInfoTangibles_QNAME, ArrayOfTangiblesFullInfo.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsVehicle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsVehicle }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Vehicle", scope = IncidentElementFullInfo.class)
    public JAXBElement<AcsVehicle> createIncidentElementFullInfoVehicle(AcsVehicle value) {
        return new JAXBElement<AcsVehicle>(_IncidentElementFullInfoVehicle_QNAME, AcsVehicle.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "VehicleOrganizationName", scope = IncidentElementFullInfo.class)
    public JAXBElement<String> createIncidentElementFullInfoVehicleOrganizationName(String value) {
        return new JAXBElement<String>(_IncidentElementFullInfoVehicleOrganizationName_QNAME, String.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ViolationNatureName", scope = IncidentElementFullInfo.class)
    public JAXBElement<String> createIncidentElementFullInfoViolationNatureName(String value) {
        return new JAXBElement<String>(_IncidentElementFullInfoViolationNatureName_QNAME, String.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ViolationTheftMethodName", scope = IncidentElementFullInfo.class)
    public JAXBElement<String> createIncidentElementFullInfoViolationTheftMethodName(String value) {
        return new JAXBElement<String>(_IncidentElementFullInfoViolationTheftMethodName_QNAME, String.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ViolationTypeName", scope = IncidentElementFullInfo.class)
    public JAXBElement<String> createIncidentElementFullInfoViolationTypeName(String value) {
        return new JAXBElement<String>(_IncidentElementFullInfoViolationTypeName_QNAME, String.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViolatorFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfViolatorFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Violators", scope = IncidentElementFullInfo.class)
    public JAXBElement<ArrayOfViolatorFullInfo> createIncidentElementFullInfoViolators(ArrayOfViolatorFullInfo value) {
        return new JAXBElement<ArrayOfViolatorFullInfo>(_IncidentElementFullInfoViolators_QNAME, ArrayOfViolatorFullInfo.class, IncidentElementFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIncidentElementFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfIncidentElementFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Incidents", scope = IncidentsInfoData.class)
    public JAXBElement<ArrayOfIncidentElementFullInfo> createIncidentsInfoDataIncidents(ArrayOfIncidentElementFullInfo value) {
        return new JAXBElement<ArrayOfIncidentElementFullInfo>(_IncidentsInfoDataIncidents_QNAME, ArrayOfIncidentElementFullInfo.class, IncidentsInfoData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "BeginDate", scope = IncidentsFilter.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentsFilterBeginDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentsMegaFilterBeginDate_QNAME, XMLGregorianCalendar.class, IncidentsFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "EndDate", scope = IncidentsFilter.class)
    public JAXBElement<XMLGregorianCalendar> createIncidentsFilterEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_IncidentsMegaFilterEndDate_QNAME, XMLGregorianCalendar.class, IncidentsFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentsMegaFilter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncidentsMegaFilter }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "IncidentsMegaFilter", scope = IncidentsFilter.class)
    public JAXBElement<IncidentsMegaFilter> createIncidentsFilterIncidentsMegaFilter(IncidentsMegaFilter value) {
        return new JAXBElement<IncidentsMegaFilter>(_IncidentsMegaFilter_QNAME, IncidentsMegaFilter.class, IncidentsFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "User", scope = IncidentsFilter.class)
    public JAXBElement<String> createIncidentsFilterUser(String value) {
        return new JAXBElement<String>(_IncidentsFilterUser_QNAME, String.class, IncidentsFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Branch", name = "Comment", scope = BranchInfo.class)
    public JAXBElement<String> createBranchInfoComment(String value) {
        return new JAXBElement<String>(_BranchInfoComment_QNAME, String.class, BranchInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Branch", name = "Name", scope = BranchInfo.class)
    public JAXBElement<String> createBranchInfoName(String value) {
        return new JAXBElement<String>(_BranchInfoName_QNAME, String.class, BranchInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBranchInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBranchInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Branch", name = "Branches", scope = BranchData.class)
    public JAXBElement<ArrayOfBranchInfo> createBranchDataBranches(ArrayOfBranchInfo value) {
        return new JAXBElement<ArrayOfBranchInfo>(_BranchDataBranches_QNAME, ArrayOfBranchInfo.class, BranchData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "ForeignID", scope = DictionaryElementsFilter.class)
    public JAXBElement<String> createDictionaryElementsFilterForeignID(String value) {
        return new JAXBElement<String>(_DictionaryElementSaveInfoForeignID_QNAME, String.class, DictionaryElementsFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDictionaryElementInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDictionaryElementInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.IncidentDictionaries", name = "Elements", scope = DictionaryElementsInfoData.class)
    public JAXBElement<ArrayOfDictionaryElementInfo> createDictionaryElementsInfoDataElements(ArrayOfDictionaryElementInfo value) {
        return new JAXBElement<ArrayOfDictionaryElementInfo>(_DictionaryElementsInfoDataElements_QNAME, ArrayOfDictionaryElementInfo.class, DictionaryElementsInfoData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLUserGroup }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLUserGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "UserGroups", scope = LUserGroupsData.class)
    public JAXBElement<ArrayOfLUserGroup> createLUserGroupsDataUserGroups(ArrayOfLUserGroup value) {
        return new JAXBElement<ArrayOfLUserGroup>(_LUserGroupsDataUserGroups_QNAME, ArrayOfLUserGroup.class, LUserGroupsData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "Description", scope = LUserGroup.class)
    public JAXBElement<String> createLUserGroupDescription(String value) {
        return new JAXBElement<String>(_LUserGroupDescription_QNAME, String.class, LUserGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "Name", scope = LUserGroup.class)
    public JAXBElement<String> createLUserGroupName(String value) {
        return new JAXBElement<String>(_LUserGroupName_QNAME, String.class, LUserGroup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "Users", scope = LUsersData.class)
    public JAXBElement<ArrayOfLUser> createLUsersDataUsers(ArrayOfLUser value) {
        return new JAXBElement<ArrayOfLUser>(_LUsersDataUsers_QNAME, ArrayOfLUser.class, LUsersData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "Description", scope = LUser.class)
    public JAXBElement<String> createLUserDescription(String value) {
        return new JAXBElement<String>(_LUserGroupDescription_QNAME, String.class, LUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "FullName", scope = LUser.class)
    public JAXBElement<String> createLUserFullName(String value) {
        return new JAXBElement<String>(_LUserFullName_QNAME, String.class, LUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Security", name = "Login", scope = LUser.class)
    public JAXBElement<String> createLUserLogin(String value) {
        return new JAXBElement<String>(_LUserLogin_QNAME, String.class, LUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLogMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLogMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Log", name = "Messages", scope = LogData.class)
    public JAXBElement<ArrayOfLogMessage> createLogDataMessages(ArrayOfLogMessage value) {
        return new JAXBElement<ArrayOfLogMessage>(_LogDataMessages_QNAME, ArrayOfLogMessage.class, LogData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CommandNotification", name = "Error", scope = NotificationState.class)
    public JAXBElement<Short> createNotificationStateError(Short value) {
        return new JAXBElement<Short>(_NotificationStateError_QNAME, Short.class, NotificationState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CommandNotification", name = "NotifyName", scope = NotificationState.class)
    public JAXBElement<String> createNotificationStateNotifyName(String value) {
        return new JAXBElement<String>(_NotificationStateNotifyName_QNAME, String.class, NotificationState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CommandNotification", name = "State", scope = NotificationState.class)
    public JAXBElement<String> createNotificationStateState(String value) {
        return new JAXBElement<String>(_NotificationStateState_QNAME, String.class, NotificationState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.CommandNotification", name = "Value", scope = NotificationState.class)
    public JAXBElement<String> createNotificationStateValue(String value) {
        return new JAXBElement<String>(_NotificationStateValue_QNAME, String.class, NotificationState.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionActionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionActionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "CommonData", scope = ReactionRecordVideoActionSlimInfo.class)
    public JAXBElement<ReactionActionSlimInfo> createReactionRecordVideoActionSlimInfoCommonData(ReactionActionSlimInfo value) {
        return new JAXBElement<ReactionActionSlimInfo>(_ReactionRecordVideoActionSlimInfoCommonData_QNAME, ReactionActionSlimInfo.class, ReactionRecordVideoActionSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionActionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionActionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "CommonData", scope = ReactionExecuteProgramActionSlimInfo.class)
    public JAXBElement<ReactionActionSlimInfo> createReactionExecuteProgramActionSlimInfoCommonData(ReactionActionSlimInfo value) {
        return new JAXBElement<ReactionActionSlimInfo>(_ReactionRecordVideoActionSlimInfoCommonData_QNAME, ReactionActionSlimInfo.class, ReactionExecuteProgramActionSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionActionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionActionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "CommonData", scope = ReactionSendEmailActionSlimInfo.class)
    public JAXBElement<ReactionActionSlimInfo> createReactionSendEmailActionSlimInfoCommonData(ReactionActionSlimInfo value) {
        return new JAXBElement<ReactionActionSlimInfo>(_ReactionRecordVideoActionSlimInfoCommonData_QNAME, ReactionActionSlimInfo.class, ReactionSendEmailActionSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionActionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionActionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "CommonData", scope = ReactionSendSMSActionSlimInfo.class)
    public JAXBElement<ReactionActionSlimInfo> createReactionSendSMSActionSlimInfoCommonData(ReactionActionSlimInfo value) {
        return new JAXBElement<ReactionActionSlimInfo>(_ReactionRecordVideoActionSlimInfoCommonData_QNAME, ReactionActionSlimInfo.class, ReactionSendSMSActionSlimInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReactionActionSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfReactionActionSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "Actions", scope = ReactionFullInfo.class)
    public JAXBElement<ArrayOfReactionActionSlimInfo> createReactionFullInfoActions(ArrayOfReactionActionSlimInfo value) {
        return new JAXBElement<ArrayOfReactionActionSlimInfo>(_ReactionFullInfoActions_QNAME, ArrayOfReactionActionSlimInfo.class, ReactionFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "Description", scope = ReactionFullInfo.class)
    public JAXBElement<String> createReactionFullInfoDescription(String value) {
        return new JAXBElement<String>(_ReactionSaveDataDescription_QNAME, String.class, ReactionFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReactionEventSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfReactionEventSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "Events", scope = ReactionFullInfo.class)
    public JAXBElement<ArrayOfReactionEventSlimInfo> createReactionFullInfoEvents(ArrayOfReactionEventSlimInfo value) {
        return new JAXBElement<ArrayOfReactionEventSlimInfo>(_ReactionFullInfoEvents_QNAME, ArrayOfReactionEventSlimInfo.class, ReactionFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUserPassEditorData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfUserPassEditorData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.UserPass", name = "UserPassEditors", scope = UserPassFullData.class)
    public JAXBElement<ArrayOfUserPassEditorData> createUserPassFullDataUserPassEditors(ArrayOfUserPassEditorData value) {
        return new JAXBElement<ArrayOfUserPassEditorData>(_UserPassFullDataUserPassEditors_QNAME, ArrayOfUserPassEditorData.class, UserPassFullData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScreenCellTreeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScreenCellTreeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.ScreenLayout", name = "RootCell", scope = ScreenLayoutInfo.class)
    public JAXBElement<ScreenCellTreeInfo> createScreenLayoutInfoRootCell(ScreenCellTreeInfo value) {
        return new JAXBElement<ScreenCellTreeInfo>(_ScreenLayoutInfoRootCell_QNAME, ScreenCellTreeInfo.class, ScreenLayoutInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "ICCID", scope = UidKeyInfo.class)
    public JAXBElement<String> createUidKeyInfoICCID(String value) {
        return new JAXBElement<String>(_UidKeyInfoICCID_QNAME, String.class, UidKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "Key", scope = UidKeyInfo.class)
    public JAXBElement<String> createUidKeyInfoKey(String value) {
        return new JAXBElement<String>(_UidKeyInfoKey_QNAME, String.class, UidKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Mifare", name = "Uid", scope = UidKeyInfo.class)
    public JAXBElement<String> createUidKeyInfoUid(String value) {
        return new JAXBElement<String>(_UidKeyInfoUid_QNAME, String.class, UidKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkScheduleSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkScheduleSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkSchedulesSlimInfo", scope = WorkSchedulesData.class)
    public JAXBElement<ArrayOfWorkScheduleSlimInfo> createWorkSchedulesDataWorkSchedulesSlimInfo(ArrayOfWorkScheduleSlimInfo value) {
        return new JAXBElement<ArrayOfWorkScheduleSlimInfo>(_WorkSchedulesDataWorkSchedulesSlimInfo_QNAME, ArrayOfWorkScheduleSlimInfo.class, WorkSchedulesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkZoneSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfWorkZoneSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.TimeTracking", name = "WorkZonesSlimInfo", scope = WorkZonesData.class)
    public JAXBElement<ArrayOfWorkZoneSlimInfo> createWorkZonesDataWorkZonesSlimInfo(ArrayOfWorkZoneSlimInfo value) {
        return new JAXBElement<ArrayOfWorkZoneSlimInfo>(_WorkZonesDataWorkZonesSlimInfo_QNAME, ArrayOfWorkZoneSlimInfo.class, WorkZonesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReactionEventSlimInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReactionEventSlimInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Reaction", name = "CommonData", scope = ReactionEventsFromDevicesSlimInfo.class)
    public JAXBElement<ReactionEventSlimInfo> createReactionEventsFromDevicesSlimInfoCommonData(ReactionEventSlimInfo value) {
        return new JAXBElement<ReactionEventSlimInfo>(_ReactionRecordVideoActionSlimInfoCommonData_QNAME, ReactionEventSlimInfo.class, ReactionEventsFromDevicesSlimInfo.class, value);
    }

}
