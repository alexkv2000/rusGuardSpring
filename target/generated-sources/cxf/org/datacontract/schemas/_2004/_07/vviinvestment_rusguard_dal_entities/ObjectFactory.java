
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities;

import java.math.BigInteger;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import org.datacontract.schemas._2004._07.system.IPAddress;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.OwnerAdditionalFieldsValue;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities package. 
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
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
public class ObjectFactory {

    private static final QName _License_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "License");
    private static final QName _SortOrder_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "SortOrder");
    private static final QName _VariableInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "VariableInfo");
    private static final QName _ArrayOfLNetInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ArrayOfLNetInfo");
    private static final QName _LNetInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "LNetInfo");
    private static final QName _ArrayOfLServerInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ArrayOfLServerInfo");
    private static final QName _LServerInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "LServerInfo");
    private static final QName _ServerType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ServerType");
    private static final QName _ArrayOfLDriverFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ArrayOfLDriverFullInfo");
    private static final QName _LDriverFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "LDriverFullInfo");
    private static final QName _ArrayOfLResourcePropertyValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ArrayOfLResourcePropertyValue");
    private static final QName _LResourcePropertyValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "LResourcePropertyValue");
    private static final QName _LProperty_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "LProperty");
    private static final QName _ArrayOfLDriverAdded_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ArrayOfLDriverAdded");
    private static final QName _LDriverAdded_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "LDriverAdded");
    private static final QName _CUDType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "CUDType");
    private static final QName _LinkType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "LinkType");
    private static final QName _ArrayOfLNetworkAdded_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ArrayOfLNetworkAdded");
    private static final QName _LNetworkAdded_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "LNetworkAdded");
    private static final QName _ArrayOfLOperationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ArrayOfLOperationResult");
    private static final QName _LOperationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "LOperationResult");
    private static final QName _ResourceType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ResourceType");
    private static final QName _ArrayOfLResourceProperty_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ArrayOfLResourceProperty");
    private static final QName _LResourceProperty_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "LResourceProperty");
    private static final QName _ArrayOfLResourceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ArrayOfLResourceInfo");
    private static final QName _LResourceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "LResourceInfo");
    private static final QName _ArrayOfLServerAdded_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ArrayOfLServerAdded");
    private static final QName _LServerAdded_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "LServerAdded");
    private static final QName _TimeOfDay_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "TimeOfDay");
    private static final QName _ArrayOfVariableInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ArrayOfVariableInfo");
    private static final QName _ArrayOfAccessPoint2CameraChain_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ArrayOfAccessPoint2CameraChain");
    private static final QName _AccessPoint2CameraChain_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "AccessPoint2CameraChain");
    private static final QName _AccessPoint2CameraSaveData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "AccessPoint2CameraSaveData");
    private static final QName _EntryType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "EntryType");
    private static final QName _AccessPoint2CameraChainResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "AccessPoint2CameraChainResult");
    private static final QName _ReportingServicesData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ReportingServicesData");
    private static final QName _AcsAccessPointType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", "AcsAccessPointType");
    private static final QName _DeviceStateEnum_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", "DeviceStateEnum");
    private static final QName _OperationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", "OperationType");
    private static final QName _OperationResultType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", "OperationResultType");
    private static final QName _NetConfiguration_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", "NetConfiguration");
    private static final QName _ProcessingData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", "ProcessingData");
    private static final QName _EbsBiometricStatusResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Recognition", "EbsBiometricStatusResult");
    private static final QName _NotificationInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "NotificationInfo");
    private static final QName _ArrayOfEmployeePassageNotification_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "ArrayOfEmployeePassageNotification");
    private static final QName _EmployeePassageNotification_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "EmployeePassageNotification");
    private static final QName _DriverEventNotification_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "DriverEventNotification");
    private static final QName _DataNotFoundException_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Exceptions", "DataNotFoundException");
    private static final QName _DataAlreadyExistsException_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Exceptions", "DataAlreadyExistsException");
    private static final QName _DataConsistencyException_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Exceptions", "DataConsistencyException");
    private static final QName _KeyKeeperCommandException_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Exceptions", "KeyKeeperCommandException");
    private static final QName _DriverNotFoundException_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Exceptions", "DriverNotFoundException");
    private static final QName _DriverVisualStyleNotFoundException_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Exceptions", "DriverVisualStyleNotFoundException");
    private static final QName _RemoveCardTypeException_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Exceptions", "RemoveCardTypeException");
    private static final QName _AssignmentAcsKeyException_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Exceptions", "AssignmentAcsKeyException");
    private static final QName _DriverEventNotificationDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "Details");
    private static final QName _DriverEventNotificationEmployeeId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "EmployeeId");
    private static final QName _DriverEventNotificationKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "Key");
    private static final QName _DriverEventNotificationLogMessageId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "LogMessageId");
    private static final QName _DriverEventNotificationMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "Message");
    private static final QName _DriverEventNotificationMessageTrackId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "MessageTrackId");
    private static final QName _DriverEventNotificationOperatorId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "OperatorId");
    private static final QName _DriverEventNotificationScalesValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "ScalesValue");
    private static final QName _DriverEventNotificationSendFromRusguardSignalTimestamp_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "SendFromRusguardSignalTimestamp");
    private static final QName _DriverEventNotificationTemperature_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "Temperature");
    private static final QName _DriverEventNotificationTimeZoneID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "TimeZoneID");
    private static final QName _DriverEventNotificationVehicleId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "VehicleId");
    private static final QName _EmployeePassageNotificationAddFields_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "AddFields");
    private static final QName _EmployeePassageNotificationEmployeeComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "EmployeeComment");
    private static final QName _EmployeePassageNotificationEmployeeDateOfBirth_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "EmployeeDateOfBirth");
    private static final QName _EmployeePassageNotificationEmployeeFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "EmployeeFirstName");
    private static final QName _EmployeePassageNotificationEmployeeGroupFullPath_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "EmployeeGroupFullPath");
    private static final QName _EmployeePassageNotificationEmployeeLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "EmployeeLastName");
    private static final QName _EmployeePassageNotificationEmployeeNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "EmployeeNumber");
    private static final QName _EmployeePassageNotificationEmployeePosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "EmployeePosition");
    private static final QName _EmployeePassageNotificationEmployeeSecondName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "EmployeeSecondName");
    private static final QName _EmployeePassageNotificationVehicleBrand_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "VehicleBrand");
    private static final QName _EmployeePassageNotificationVehicleColor_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "VehicleColor");
    private static final QName _EmployeePassageNotificationVehicleComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "VehicleComment");
    private static final QName _EmployeePassageNotificationVehicleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "VehicleName");
    private static final QName _EmployeePassageNotificationVehicleRegistrationNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "VehicleRegistrationNumber");
    private static final QName _LServerAddedServerInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ServerInfo");
    private static final QName _LResourcePropertyPropertyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "PropertyName");
    private static final QName _LOperationResultContext_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "Context");
    private static final QName _LOperationResultDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "Details");
    private static final QName _LOperationResultMemberSignature_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "MemberSignature");
    private static final QName _LNetworkAddedNetInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "NetInfo");
    private static final QName _LDriverAddedDriverInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "DriverInfo");
    private static final QName _LResourcePropertyValueValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "Value");
    private static final QName _ReportingServicesDataLogin_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "Login");
    private static final QName _ReportingServicesDataPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "Password");
    private static final QName _ReportingServicesDataUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "Url");
    private static final QName _AccessPoint2CameraChainResultAdd_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "Add");
    private static final QName _AccessPoint2CameraChainResultRemove_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "Remove");
    private static final QName _NetConfigurationGateway_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", "Gateway");
    private static final QName _NetConfigurationIPAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", "IPAddress");
    private static final QName _NetConfigurationMask_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", "Mask");
    private static final QName _NotificationInfoEmployeePassageNotifications_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", "EmployeePassageNotifications");
    private static final QName _EbsBiometricStatusResultAgreementFrom_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Recognition", "AgreementFrom");
    private static final QName _EbsBiometricStatusResultAgreementTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Recognition", "AgreementTo");
    private static final QName _EbsBiometricStatusResultErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Recognition", "ErrorMessage");
    private static final QName _LDriverFullInfoDriverType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "DriverType");
    private static final QName _LDriverFullInfoFilterTagIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "FilterTagIds");
    private static final QName _LDriverFullInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "Name");
    private static final QName _LDriverFullInfoParentId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ParentId");
    private static final QName _LDriverFullInfoParentPropertyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ParentPropertyName");
    private static final QName _LDriverFullInfoProperties_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "Properties");
    private static final QName _LDriverFullInfoStates_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "States");
    private static final QName _LNetInfoGatewayUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "GatewayUrl");
    private static final QName _LicenseElementID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ElementID");
    private static final QName _LicenseElementName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ElementName");
    private static final QName _LicenseModuleID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ModuleID");
    private static final QName _LicenseModuleName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", "ModuleName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link License }
     * 
     * @return
     *     the new instance of {@link License }
     */
    public License createLicense() {
        return new License();
    }

    /**
     * Create an instance of {@link VariableInfo }
     * 
     * @return
     *     the new instance of {@link VariableInfo }
     */
    public VariableInfo createVariableInfo() {
        return new VariableInfo();
    }

    /**
     * Create an instance of {@link ArrayOfLNetInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfLNetInfo }
     */
    public ArrayOfLNetInfo createArrayOfLNetInfo() {
        return new ArrayOfLNetInfo();
    }

    /**
     * Create an instance of {@link LNetInfo }
     * 
     * @return
     *     the new instance of {@link LNetInfo }
     */
    public LNetInfo createLNetInfo() {
        return new LNetInfo();
    }

    /**
     * Create an instance of {@link ArrayOfLServerInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfLServerInfo }
     */
    public ArrayOfLServerInfo createArrayOfLServerInfo() {
        return new ArrayOfLServerInfo();
    }

    /**
     * Create an instance of {@link LServerInfo }
     * 
     * @return
     *     the new instance of {@link LServerInfo }
     */
    public LServerInfo createLServerInfo() {
        return new LServerInfo();
    }

    /**
     * Create an instance of {@link ArrayOfLDriverFullInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfLDriverFullInfo }
     */
    public ArrayOfLDriverFullInfo createArrayOfLDriverFullInfo() {
        return new ArrayOfLDriverFullInfo();
    }

    /**
     * Create an instance of {@link LProperty }
     * 
     * @return
     *     the new instance of {@link LProperty }
     */
    public LProperty createLProperty() {
        return new LProperty();
    }

    /**
     * Create an instance of {@link LDriverFullInfo }
     * 
     * @return
     *     the new instance of {@link LDriverFullInfo }
     */
    public LDriverFullInfo createLDriverFullInfo() {
        return new LDriverFullInfo();
    }

    /**
     * Create an instance of {@link EbsBiometricStatusResult }
     * 
     * @return
     *     the new instance of {@link EbsBiometricStatusResult }
     */
    public EbsBiometricStatusResult createEbsBiometricStatusResult() {
        return new EbsBiometricStatusResult();
    }

    /**
     * Create an instance of {@link NotificationInfo }
     * 
     * @return
     *     the new instance of {@link NotificationInfo }
     */
    public NotificationInfo createNotificationInfo() {
        return new NotificationInfo();
    }

    /**
     * Create an instance of {@link NetConfiguration }
     * 
     * @return
     *     the new instance of {@link NetConfiguration }
     */
    public NetConfiguration createNetConfiguration() {
        return new NetConfiguration();
    }

    /**
     * Create an instance of {@link ArrayOfAccessPoint2CameraChain }
     * 
     * @return
     *     the new instance of {@link ArrayOfAccessPoint2CameraChain }
     */
    public ArrayOfAccessPoint2CameraChain createArrayOfAccessPoint2CameraChain() {
        return new ArrayOfAccessPoint2CameraChain();
    }

    /**
     * Create an instance of {@link AccessPoint2CameraChainResult }
     * 
     * @return
     *     the new instance of {@link AccessPoint2CameraChainResult }
     */
    public AccessPoint2CameraChainResult createAccessPoint2CameraChainResult() {
        return new AccessPoint2CameraChainResult();
    }

    /**
     * Create an instance of {@link ReportingServicesData }
     * 
     * @return
     *     the new instance of {@link ReportingServicesData }
     */
    public ReportingServicesData createReportingServicesData() {
        return new ReportingServicesData();
    }

    /**
     * Create an instance of {@link AccessPoint2CameraSaveData }
     * 
     * @return
     *     the new instance of {@link AccessPoint2CameraSaveData }
     */
    public AccessPoint2CameraSaveData createAccessPoint2CameraSaveData() {
        return new AccessPoint2CameraSaveData();
    }

    /**
     * Create an instance of {@link AccessPoint2CameraChain }
     * 
     * @return
     *     the new instance of {@link AccessPoint2CameraChain }
     */
    public AccessPoint2CameraChain createAccessPoint2CameraChain() {
        return new AccessPoint2CameraChain();
    }

    /**
     * Create an instance of {@link ArrayOfLResourcePropertyValue }
     * 
     * @return
     *     the new instance of {@link ArrayOfLResourcePropertyValue }
     */
    public ArrayOfLResourcePropertyValue createArrayOfLResourcePropertyValue() {
        return new ArrayOfLResourcePropertyValue();
    }

    /**
     * Create an instance of {@link LResourcePropertyValue }
     * 
     * @return
     *     the new instance of {@link LResourcePropertyValue }
     */
    public LResourcePropertyValue createLResourcePropertyValue() {
        return new LResourcePropertyValue();
    }

    /**
     * Create an instance of {@link ArrayOfLDriverAdded }
     * 
     * @return
     *     the new instance of {@link ArrayOfLDriverAdded }
     */
    public ArrayOfLDriverAdded createArrayOfLDriverAdded() {
        return new ArrayOfLDriverAdded();
    }

    /**
     * Create an instance of {@link LDriverAdded }
     * 
     * @return
     *     the new instance of {@link LDriverAdded }
     */
    public LDriverAdded createLDriverAdded() {
        return new LDriverAdded();
    }

    /**
     * Create an instance of {@link ArrayOfLNetworkAdded }
     * 
     * @return
     *     the new instance of {@link ArrayOfLNetworkAdded }
     */
    public ArrayOfLNetworkAdded createArrayOfLNetworkAdded() {
        return new ArrayOfLNetworkAdded();
    }

    /**
     * Create an instance of {@link LNetworkAdded }
     * 
     * @return
     *     the new instance of {@link LNetworkAdded }
     */
    public LNetworkAdded createLNetworkAdded() {
        return new LNetworkAdded();
    }

    /**
     * Create an instance of {@link ArrayOfLOperationResult }
     * 
     * @return
     *     the new instance of {@link ArrayOfLOperationResult }
     */
    public ArrayOfLOperationResult createArrayOfLOperationResult() {
        return new ArrayOfLOperationResult();
    }

    /**
     * Create an instance of {@link LOperationResult }
     * 
     * @return
     *     the new instance of {@link LOperationResult }
     */
    public LOperationResult createLOperationResult() {
        return new LOperationResult();
    }

    /**
     * Create an instance of {@link ArrayOfLResourceProperty }
     * 
     * @return
     *     the new instance of {@link ArrayOfLResourceProperty }
     */
    public ArrayOfLResourceProperty createArrayOfLResourceProperty() {
        return new ArrayOfLResourceProperty();
    }

    /**
     * Create an instance of {@link LResourceProperty }
     * 
     * @return
     *     the new instance of {@link LResourceProperty }
     */
    public LResourceProperty createLResourceProperty() {
        return new LResourceProperty();
    }

    /**
     * Create an instance of {@link ArrayOfLResourceInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfLResourceInfo }
     */
    public ArrayOfLResourceInfo createArrayOfLResourceInfo() {
        return new ArrayOfLResourceInfo();
    }

    /**
     * Create an instance of {@link LResourceInfo }
     * 
     * @return
     *     the new instance of {@link LResourceInfo }
     */
    public LResourceInfo createLResourceInfo() {
        return new LResourceInfo();
    }

    /**
     * Create an instance of {@link ArrayOfLServerAdded }
     * 
     * @return
     *     the new instance of {@link ArrayOfLServerAdded }
     */
    public ArrayOfLServerAdded createArrayOfLServerAdded() {
        return new ArrayOfLServerAdded();
    }

    /**
     * Create an instance of {@link LServerAdded }
     * 
     * @return
     *     the new instance of {@link LServerAdded }
     */
    public LServerAdded createLServerAdded() {
        return new LServerAdded();
    }

    /**
     * Create an instance of {@link TimeOfDay }
     * 
     * @return
     *     the new instance of {@link TimeOfDay }
     */
    public TimeOfDay createTimeOfDay() {
        return new TimeOfDay();
    }

    /**
     * Create an instance of {@link ArrayOfVariableInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfVariableInfo }
     */
    public ArrayOfVariableInfo createArrayOfVariableInfo() {
        return new ArrayOfVariableInfo();
    }

    /**
     * Create an instance of {@link ArrayOfEmployeePassageNotification }
     * 
     * @return
     *     the new instance of {@link ArrayOfEmployeePassageNotification }
     */
    public ArrayOfEmployeePassageNotification createArrayOfEmployeePassageNotification() {
        return new ArrayOfEmployeePassageNotification();
    }

    /**
     * Create an instance of {@link EmployeePassageNotification }
     * 
     * @return
     *     the new instance of {@link EmployeePassageNotification }
     */
    public EmployeePassageNotification createEmployeePassageNotification() {
        return new EmployeePassageNotification();
    }

    /**
     * Create an instance of {@link DriverEventNotification }
     * 
     * @return
     *     the new instance of {@link DriverEventNotification }
     */
    public DriverEventNotification createDriverEventNotification() {
        return new DriverEventNotification();
    }

    /**
     * Create an instance of {@link DataNotFoundException }
     * 
     * @return
     *     the new instance of {@link DataNotFoundException }
     */
    public DataNotFoundException createDataNotFoundException() {
        return new DataNotFoundException();
    }

    /**
     * Create an instance of {@link DataAlreadyExistsException }
     * 
     * @return
     *     the new instance of {@link DataAlreadyExistsException }
     */
    public DataAlreadyExistsException createDataAlreadyExistsException() {
        return new DataAlreadyExistsException();
    }

    /**
     * Create an instance of {@link DataConsistencyException }
     * 
     * @return
     *     the new instance of {@link DataConsistencyException }
     */
    public DataConsistencyException createDataConsistencyException() {
        return new DataConsistencyException();
    }

    /**
     * Create an instance of {@link KeyKeeperCommandException }
     * 
     * @return
     *     the new instance of {@link KeyKeeperCommandException }
     */
    public KeyKeeperCommandException createKeyKeeperCommandException() {
        return new KeyKeeperCommandException();
    }

    /**
     * Create an instance of {@link DriverNotFoundException }
     * 
     * @return
     *     the new instance of {@link DriverNotFoundException }
     */
    public DriverNotFoundException createDriverNotFoundException() {
        return new DriverNotFoundException();
    }

    /**
     * Create an instance of {@link DriverVisualStyleNotFoundException }
     * 
     * @return
     *     the new instance of {@link DriverVisualStyleNotFoundException }
     */
    public DriverVisualStyleNotFoundException createDriverVisualStyleNotFoundException() {
        return new DriverVisualStyleNotFoundException();
    }

    /**
     * Create an instance of {@link RemoveCardTypeException }
     * 
     * @return
     *     the new instance of {@link RemoveCardTypeException }
     */
    public RemoveCardTypeException createRemoveCardTypeException() {
        return new RemoveCardTypeException();
    }

    /**
     * Create an instance of {@link AssignmentAcsKeyException }
     * 
     * @return
     *     the new instance of {@link AssignmentAcsKeyException }
     */
    public AssignmentAcsKeyException createAssignmentAcsKeyException() {
        return new AssignmentAcsKeyException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link License }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link License }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "License")
    public JAXBElement<License> createLicense(License value) {
        return new JAXBElement<>(_License_QNAME, License.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SortOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SortOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "SortOrder")
    public JAXBElement<SortOrder> createSortOrder(SortOrder value) {
        return new JAXBElement<>(_SortOrder_QNAME, SortOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VariableInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "VariableInfo")
    public JAXBElement<VariableInfo> createVariableInfo(VariableInfo value) {
        return new JAXBElement<>(_VariableInfo_QNAME, VariableInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLNetInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLNetInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ArrayOfLNetInfo")
    public JAXBElement<ArrayOfLNetInfo> createArrayOfLNetInfo(ArrayOfLNetInfo value) {
        return new JAXBElement<>(_ArrayOfLNetInfo_QNAME, ArrayOfLNetInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LNetInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LNetInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "LNetInfo")
    public JAXBElement<LNetInfo> createLNetInfo(LNetInfo value) {
        return new JAXBElement<>(_LNetInfo_QNAME, LNetInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLServerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLServerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ArrayOfLServerInfo")
    public JAXBElement<ArrayOfLServerInfo> createArrayOfLServerInfo(ArrayOfLServerInfo value) {
        return new JAXBElement<>(_ArrayOfLServerInfo_QNAME, ArrayOfLServerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LServerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LServerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "LServerInfo")
    public JAXBElement<LServerInfo> createLServerInfo(LServerInfo value) {
        return new JAXBElement<>(_LServerInfo_QNAME, LServerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ServerType")
    public JAXBElement<ServerType> createServerType(ServerType value) {
        return new JAXBElement<>(_ServerType_QNAME, ServerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriverFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriverFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ArrayOfLDriverFullInfo")
    public JAXBElement<ArrayOfLDriverFullInfo> createArrayOfLDriverFullInfo(ArrayOfLDriverFullInfo value) {
        return new JAXBElement<>(_ArrayOfLDriverFullInfo_QNAME, ArrayOfLDriverFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LDriverFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LDriverFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "LDriverFullInfo")
    public JAXBElement<LDriverFullInfo> createLDriverFullInfo(LDriverFullInfo value) {
        return new JAXBElement<>(_LDriverFullInfo_QNAME, LDriverFullInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourcePropertyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourcePropertyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ArrayOfLResourcePropertyValue")
    public JAXBElement<ArrayOfLResourcePropertyValue> createArrayOfLResourcePropertyValue(ArrayOfLResourcePropertyValue value) {
        return new JAXBElement<>(_ArrayOfLResourcePropertyValue_QNAME, ArrayOfLResourcePropertyValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LResourcePropertyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LResourcePropertyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "LResourcePropertyValue")
    public JAXBElement<LResourcePropertyValue> createLResourcePropertyValue(LResourcePropertyValue value) {
        return new JAXBElement<>(_LResourcePropertyValue_QNAME, LResourcePropertyValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LProperty }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LProperty }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "LProperty")
    public JAXBElement<LProperty> createLProperty(LProperty value) {
        return new JAXBElement<>(_LProperty_QNAME, LProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriverAdded }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriverAdded }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ArrayOfLDriverAdded")
    public JAXBElement<ArrayOfLDriverAdded> createArrayOfLDriverAdded(ArrayOfLDriverAdded value) {
        return new JAXBElement<>(_ArrayOfLDriverAdded_QNAME, ArrayOfLDriverAdded.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LDriverAdded }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LDriverAdded }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "LDriverAdded")
    public JAXBElement<LDriverAdded> createLDriverAdded(LDriverAdded value) {
        return new JAXBElement<>(_LDriverAdded_QNAME, LDriverAdded.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CUDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CUDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "CUDType")
    public JAXBElement<CUDType> createCUDType(CUDType value) {
        return new JAXBElement<>(_CUDType_QNAME, CUDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LinkType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "LinkType")
    public JAXBElement<LinkType> createLinkType(LinkType value) {
        return new JAXBElement<>(_LinkType_QNAME, LinkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLNetworkAdded }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLNetworkAdded }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ArrayOfLNetworkAdded")
    public JAXBElement<ArrayOfLNetworkAdded> createArrayOfLNetworkAdded(ArrayOfLNetworkAdded value) {
        return new JAXBElement<>(_ArrayOfLNetworkAdded_QNAME, ArrayOfLNetworkAdded.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LNetworkAdded }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LNetworkAdded }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "LNetworkAdded")
    public JAXBElement<LNetworkAdded> createLNetworkAdded(LNetworkAdded value) {
        return new JAXBElement<>(_LNetworkAdded_QNAME, LNetworkAdded.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLOperationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLOperationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ArrayOfLOperationResult")
    public JAXBElement<ArrayOfLOperationResult> createArrayOfLOperationResult(ArrayOfLOperationResult value) {
        return new JAXBElement<>(_ArrayOfLOperationResult_QNAME, ArrayOfLOperationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LOperationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LOperationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "LOperationResult")
    public JAXBElement<LOperationResult> createLOperationResult(LOperationResult value) {
        return new JAXBElement<>(_LOperationResult_QNAME, LOperationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResourceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ResourceType")
    public JAXBElement<ResourceType> createResourceType(ResourceType value) {
        return new JAXBElement<>(_ResourceType_QNAME, ResourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourceProperty }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourceProperty }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ArrayOfLResourceProperty")
    public JAXBElement<ArrayOfLResourceProperty> createArrayOfLResourceProperty(ArrayOfLResourceProperty value) {
        return new JAXBElement<>(_ArrayOfLResourceProperty_QNAME, ArrayOfLResourceProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LResourceProperty }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LResourceProperty }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "LResourceProperty")
    public JAXBElement<LResourceProperty> createLResourceProperty(LResourceProperty value) {
        return new JAXBElement<>(_LResourceProperty_QNAME, LResourceProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourceInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ArrayOfLResourceInfo")
    public JAXBElement<ArrayOfLResourceInfo> createArrayOfLResourceInfo(ArrayOfLResourceInfo value) {
        return new JAXBElement<>(_ArrayOfLResourceInfo_QNAME, ArrayOfLResourceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LResourceInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LResourceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "LResourceInfo")
    public JAXBElement<LResourceInfo> createLResourceInfo(LResourceInfo value) {
        return new JAXBElement<>(_LResourceInfo_QNAME, LResourceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLServerAdded }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLServerAdded }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ArrayOfLServerAdded")
    public JAXBElement<ArrayOfLServerAdded> createArrayOfLServerAdded(ArrayOfLServerAdded value) {
        return new JAXBElement<>(_ArrayOfLServerAdded_QNAME, ArrayOfLServerAdded.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LServerAdded }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LServerAdded }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "LServerAdded")
    public JAXBElement<LServerAdded> createLServerAdded(LServerAdded value) {
        return new JAXBElement<>(_LServerAdded_QNAME, LServerAdded.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeOfDay }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimeOfDay }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "TimeOfDay")
    public JAXBElement<TimeOfDay> createTimeOfDay(TimeOfDay value) {
        return new JAXBElement<>(_TimeOfDay_QNAME, TimeOfDay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVariableInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfVariableInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ArrayOfVariableInfo")
    public JAXBElement<ArrayOfVariableInfo> createArrayOfVariableInfo(ArrayOfVariableInfo value) {
        return new JAXBElement<>(_ArrayOfVariableInfo_QNAME, ArrayOfVariableInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccessPoint2CameraChain }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAccessPoint2CameraChain }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ArrayOfAccessPoint2CameraChain")
    public JAXBElement<ArrayOfAccessPoint2CameraChain> createArrayOfAccessPoint2CameraChain(ArrayOfAccessPoint2CameraChain value) {
        return new JAXBElement<>(_ArrayOfAccessPoint2CameraChain_QNAME, ArrayOfAccessPoint2CameraChain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessPoint2CameraChain }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessPoint2CameraChain }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "AccessPoint2CameraChain")
    public JAXBElement<AccessPoint2CameraChain> createAccessPoint2CameraChain(AccessPoint2CameraChain value) {
        return new JAXBElement<>(_AccessPoint2CameraChain_QNAME, AccessPoint2CameraChain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessPoint2CameraSaveData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessPoint2CameraSaveData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "AccessPoint2CameraSaveData")
    public JAXBElement<AccessPoint2CameraSaveData> createAccessPoint2CameraSaveData(AccessPoint2CameraSaveData value) {
        return new JAXBElement<>(_AccessPoint2CameraSaveData_QNAME, AccessPoint2CameraSaveData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EntryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "EntryType")
    public JAXBElement<EntryType> createEntryType(EntryType value) {
        return new JAXBElement<>(_EntryType_QNAME, EntryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessPoint2CameraChainResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessPoint2CameraChainResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "AccessPoint2CameraChainResult")
    public JAXBElement<AccessPoint2CameraChainResult> createAccessPoint2CameraChainResult(AccessPoint2CameraChainResult value) {
        return new JAXBElement<>(_AccessPoint2CameraChainResult_QNAME, AccessPoint2CameraChainResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportingServicesData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReportingServicesData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ReportingServicesData")
    public JAXBElement<ReportingServicesData> createReportingServicesData(ReportingServicesData value) {
        return new JAXBElement<>(_ReportingServicesData_QNAME, ReportingServicesData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcsAccessPointType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcsAccessPointType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", name = "AcsAccessPointType")
    public JAXBElement<AcsAccessPointType> createAcsAccessPointType(AcsAccessPointType value) {
        return new JAXBElement<>(_AcsAccessPointType_QNAME, AcsAccessPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceStateEnum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceStateEnum }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", name = "DeviceStateEnum")
    public JAXBElement<DeviceStateEnum> createDeviceStateEnum(DeviceStateEnum value) {
        return new JAXBElement<>(_DeviceStateEnum_QNAME, DeviceStateEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", name = "OperationType")
    public JAXBElement<OperationType> createOperationType(OperationType value) {
        return new JAXBElement<>(_OperationType_QNAME, OperationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationResultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperationResultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", name = "OperationResultType")
    public JAXBElement<OperationResultType> createOperationResultType(OperationResultType value) {
        return new JAXBElement<>(_OperationResultType_QNAME, OperationResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetConfiguration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NetConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", name = "NetConfiguration")
    public JAXBElement<NetConfiguration> createNetConfiguration(NetConfiguration value) {
        return new JAXBElement<>(_NetConfiguration_QNAME, NetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", name = "ProcessingData")
    public JAXBElement<List<String>> createProcessingData(List<String> value) {
        return new JAXBElement<>(_ProcessingData_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EbsBiometricStatusResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EbsBiometricStatusResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Recognition", name = "EbsBiometricStatusResult")
    public JAXBElement<EbsBiometricStatusResult> createEbsBiometricStatusResult(EbsBiometricStatusResult value) {
        return new JAXBElement<>(_EbsBiometricStatusResult_QNAME, EbsBiometricStatusResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotificationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "NotificationInfo")
    public JAXBElement<NotificationInfo> createNotificationInfo(NotificationInfo value) {
        return new JAXBElement<>(_NotificationInfo_QNAME, NotificationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeePassageNotification }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeePassageNotification }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "ArrayOfEmployeePassageNotification")
    public JAXBElement<ArrayOfEmployeePassageNotification> createArrayOfEmployeePassageNotification(ArrayOfEmployeePassageNotification value) {
        return new JAXBElement<>(_ArrayOfEmployeePassageNotification_QNAME, ArrayOfEmployeePassageNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeePassageNotification }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmployeePassageNotification }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "EmployeePassageNotification")
    public JAXBElement<EmployeePassageNotification> createEmployeePassageNotification(EmployeePassageNotification value) {
        return new JAXBElement<>(_EmployeePassageNotification_QNAME, EmployeePassageNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverEventNotification }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DriverEventNotification }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "DriverEventNotification")
    public JAXBElement<DriverEventNotification> createDriverEventNotification(DriverEventNotification value) {
        return new JAXBElement<>(_DriverEventNotification_QNAME, DriverEventNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataNotFoundException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataNotFoundException }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Exceptions", name = "DataNotFoundException")
    public JAXBElement<DataNotFoundException> createDataNotFoundException(DataNotFoundException value) {
        return new JAXBElement<>(_DataNotFoundException_QNAME, DataNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataAlreadyExistsException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataAlreadyExistsException }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Exceptions", name = "DataAlreadyExistsException")
    public JAXBElement<DataAlreadyExistsException> createDataAlreadyExistsException(DataAlreadyExistsException value) {
        return new JAXBElement<>(_DataAlreadyExistsException_QNAME, DataAlreadyExistsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataConsistencyException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataConsistencyException }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Exceptions", name = "DataConsistencyException")
    public JAXBElement<DataConsistencyException> createDataConsistencyException(DataConsistencyException value) {
        return new JAXBElement<>(_DataConsistencyException_QNAME, DataConsistencyException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyKeeperCommandException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyKeeperCommandException }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Exceptions", name = "KeyKeeperCommandException")
    public JAXBElement<KeyKeeperCommandException> createKeyKeeperCommandException(KeyKeeperCommandException value) {
        return new JAXBElement<>(_KeyKeeperCommandException_QNAME, KeyKeeperCommandException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverNotFoundException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DriverNotFoundException }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Exceptions", name = "DriverNotFoundException")
    public JAXBElement<DriverNotFoundException> createDriverNotFoundException(DriverNotFoundException value) {
        return new JAXBElement<>(_DriverNotFoundException_QNAME, DriverNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverVisualStyleNotFoundException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DriverVisualStyleNotFoundException }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Exceptions", name = "DriverVisualStyleNotFoundException")
    public JAXBElement<DriverVisualStyleNotFoundException> createDriverVisualStyleNotFoundException(DriverVisualStyleNotFoundException value) {
        return new JAXBElement<>(_DriverVisualStyleNotFoundException_QNAME, DriverVisualStyleNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCardTypeException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RemoveCardTypeException }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Exceptions", name = "RemoveCardTypeException")
    public JAXBElement<RemoveCardTypeException> createRemoveCardTypeException(RemoveCardTypeException value) {
        return new JAXBElement<>(_RemoveCardTypeException_QNAME, RemoveCardTypeException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignmentAcsKeyException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AssignmentAcsKeyException }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Exceptions", name = "AssignmentAcsKeyException")
    public JAXBElement<AssignmentAcsKeyException> createAssignmentAcsKeyException(AssignmentAcsKeyException value) {
        return new JAXBElement<>(_AssignmentAcsKeyException_QNAME, AssignmentAcsKeyException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "Details", scope = DriverEventNotification.class)
    public JAXBElement<String> createDriverEventNotificationDetails(String value) {
        return new JAXBElement<>(_DriverEventNotificationDetails_QNAME, String.class, DriverEventNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "EmployeeId", scope = DriverEventNotification.class)
    public JAXBElement<String> createDriverEventNotificationEmployeeId(String value) {
        return new JAXBElement<>(_DriverEventNotificationEmployeeId_QNAME, String.class, DriverEventNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "Key", scope = DriverEventNotification.class)
    public JAXBElement<BigInteger> createDriverEventNotificationKey(BigInteger value) {
        return new JAXBElement<>(_DriverEventNotificationKey_QNAME, BigInteger.class, DriverEventNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "LogMessageId", scope = DriverEventNotification.class)
    public JAXBElement<Long> createDriverEventNotificationLogMessageId(Long value) {
        return new JAXBElement<>(_DriverEventNotificationLogMessageId_QNAME, Long.class, DriverEventNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "Message", scope = DriverEventNotification.class)
    public JAXBElement<String> createDriverEventNotificationMessage(String value) {
        return new JAXBElement<>(_DriverEventNotificationMessage_QNAME, String.class, DriverEventNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "MessageTrackId", scope = DriverEventNotification.class)
    public JAXBElement<BigInteger> createDriverEventNotificationMessageTrackId(BigInteger value) {
        return new JAXBElement<>(_DriverEventNotificationMessageTrackId_QNAME, BigInteger.class, DriverEventNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "OperatorId", scope = DriverEventNotification.class)
    public JAXBElement<String> createDriverEventNotificationOperatorId(String value) {
        return new JAXBElement<>(_DriverEventNotificationOperatorId_QNAME, String.class, DriverEventNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "ScalesValue", scope = DriverEventNotification.class)
    public JAXBElement<Integer> createDriverEventNotificationScalesValue(Integer value) {
        return new JAXBElement<>(_DriverEventNotificationScalesValue_QNAME, Integer.class, DriverEventNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "SendFromRusguardSignalTimestamp", scope = DriverEventNotification.class)
    public JAXBElement<XMLGregorianCalendar> createDriverEventNotificationSendFromRusguardSignalTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<>(_DriverEventNotificationSendFromRusguardSignalTimestamp_QNAME, XMLGregorianCalendar.class, DriverEventNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "Temperature", scope = DriverEventNotification.class)
    public JAXBElement<Integer> createDriverEventNotificationTemperature(Integer value) {
        return new JAXBElement<>(_DriverEventNotificationTemperature_QNAME, Integer.class, DriverEventNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "TimeZoneID", scope = DriverEventNotification.class)
    public JAXBElement<String> createDriverEventNotificationTimeZoneID(String value) {
        return new JAXBElement<>(_DriverEventNotificationTimeZoneID_QNAME, String.class, DriverEventNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "VehicleId", scope = DriverEventNotification.class)
    public JAXBElement<String> createDriverEventNotificationVehicleId(String value) {
        return new JAXBElement<>(_DriverEventNotificationVehicleId_QNAME, String.class, DriverEventNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerAdditionalFieldsValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OwnerAdditionalFieldsValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "AddFields", scope = EmployeePassageNotification.class)
    public JAXBElement<OwnerAdditionalFieldsValue> createEmployeePassageNotificationAddFields(OwnerAdditionalFieldsValue value) {
        return new JAXBElement<>(_EmployeePassageNotificationAddFields_QNAME, OwnerAdditionalFieldsValue.class, EmployeePassageNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "EmployeeComment", scope = EmployeePassageNotification.class)
    public JAXBElement<String> createEmployeePassageNotificationEmployeeComment(String value) {
        return new JAXBElement<>(_EmployeePassageNotificationEmployeeComment_QNAME, String.class, EmployeePassageNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "EmployeeDateOfBirth", scope = EmployeePassageNotification.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeePassageNotificationEmployeeDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<>(_EmployeePassageNotificationEmployeeDateOfBirth_QNAME, XMLGregorianCalendar.class, EmployeePassageNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "EmployeeFirstName", scope = EmployeePassageNotification.class)
    public JAXBElement<String> createEmployeePassageNotificationEmployeeFirstName(String value) {
        return new JAXBElement<>(_EmployeePassageNotificationEmployeeFirstName_QNAME, String.class, EmployeePassageNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "EmployeeGroupFullPath", scope = EmployeePassageNotification.class)
    public JAXBElement<String> createEmployeePassageNotificationEmployeeGroupFullPath(String value) {
        return new JAXBElement<>(_EmployeePassageNotificationEmployeeGroupFullPath_QNAME, String.class, EmployeePassageNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "EmployeeLastName", scope = EmployeePassageNotification.class)
    public JAXBElement<String> createEmployeePassageNotificationEmployeeLastName(String value) {
        return new JAXBElement<>(_EmployeePassageNotificationEmployeeLastName_QNAME, String.class, EmployeePassageNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "EmployeeNumber", scope = EmployeePassageNotification.class)
    public JAXBElement<Integer> createEmployeePassageNotificationEmployeeNumber(Integer value) {
        return new JAXBElement<>(_EmployeePassageNotificationEmployeeNumber_QNAME, Integer.class, EmployeePassageNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "EmployeePosition", scope = EmployeePassageNotification.class)
    public JAXBElement<String> createEmployeePassageNotificationEmployeePosition(String value) {
        return new JAXBElement<>(_EmployeePassageNotificationEmployeePosition_QNAME, String.class, EmployeePassageNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "EmployeeSecondName", scope = EmployeePassageNotification.class)
    public JAXBElement<String> createEmployeePassageNotificationEmployeeSecondName(String value) {
        return new JAXBElement<>(_EmployeePassageNotificationEmployeeSecondName_QNAME, String.class, EmployeePassageNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "VehicleBrand", scope = EmployeePassageNotification.class)
    public JAXBElement<String> createEmployeePassageNotificationVehicleBrand(String value) {
        return new JAXBElement<>(_EmployeePassageNotificationVehicleBrand_QNAME, String.class, EmployeePassageNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "VehicleColor", scope = EmployeePassageNotification.class)
    public JAXBElement<String> createEmployeePassageNotificationVehicleColor(String value) {
        return new JAXBElement<>(_EmployeePassageNotificationVehicleColor_QNAME, String.class, EmployeePassageNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "VehicleComment", scope = EmployeePassageNotification.class)
    public JAXBElement<String> createEmployeePassageNotificationVehicleComment(String value) {
        return new JAXBElement<>(_EmployeePassageNotificationVehicleComment_QNAME, String.class, EmployeePassageNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "VehicleName", scope = EmployeePassageNotification.class)
    public JAXBElement<String> createEmployeePassageNotificationVehicleName(String value) {
        return new JAXBElement<>(_EmployeePassageNotificationVehicleName_QNAME, String.class, EmployeePassageNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "VehicleRegistrationNumber", scope = EmployeePassageNotification.class)
    public JAXBElement<String> createEmployeePassageNotificationVehicleRegistrationNumber(String value) {
        return new JAXBElement<>(_EmployeePassageNotificationVehicleRegistrationNumber_QNAME, String.class, EmployeePassageNotification.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LServerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LServerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ServerInfo", scope = LServerAdded.class)
    public JAXBElement<LServerInfo> createLServerAddedServerInfo(LServerInfo value) {
        return new JAXBElement<>(_LServerAddedServerInfo_QNAME, LServerInfo.class, LServerAdded.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "PropertyName", scope = LResourceProperty.class)
    public JAXBElement<String> createLResourcePropertyPropertyName(String value) {
        return new JAXBElement<>(_LResourcePropertyPropertyName_QNAME, String.class, LResourceProperty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "Context", scope = LOperationResult.class)
    public JAXBElement<String> createLOperationResultContext(String value) {
        return new JAXBElement<>(_LOperationResultContext_QNAME, String.class, LOperationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "Details", scope = LOperationResult.class)
    public JAXBElement<String> createLOperationResultDetails(String value) {
        return new JAXBElement<>(_LOperationResultDetails_QNAME, String.class, LOperationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "MemberSignature", scope = LOperationResult.class)
    public JAXBElement<String> createLOperationResultMemberSignature(String value) {
        return new JAXBElement<>(_LOperationResultMemberSignature_QNAME, String.class, LOperationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LNetInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LNetInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "NetInfo", scope = LNetworkAdded.class)
    public JAXBElement<LNetInfo> createLNetworkAddedNetInfo(LNetInfo value) {
        return new JAXBElement<>(_LNetworkAddedNetInfo_QNAME, LNetInfo.class, LNetworkAdded.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LDriverFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LDriverFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "DriverInfo", scope = LDriverAdded.class)
    public JAXBElement<LDriverFullInfo> createLDriverAddedDriverInfo(LDriverFullInfo value) {
        return new JAXBElement<>(_LDriverAddedDriverInfo_QNAME, LDriverFullInfo.class, LDriverAdded.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "PropertyName", scope = LResourcePropertyValue.class)
    public JAXBElement<String> createLResourcePropertyValuePropertyName(String value) {
        return new JAXBElement<>(_LResourcePropertyPropertyName_QNAME, String.class, LResourcePropertyValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "Value", scope = LResourcePropertyValue.class)
    public JAXBElement<String> createLResourcePropertyValueValue(String value) {
        return new JAXBElement<>(_LResourcePropertyValueValue_QNAME, String.class, LResourcePropertyValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "Login", scope = ReportingServicesData.class)
    public JAXBElement<String> createReportingServicesDataLogin(String value) {
        return new JAXBElement<>(_ReportingServicesDataLogin_QNAME, String.class, ReportingServicesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "Password", scope = ReportingServicesData.class)
    public JAXBElement<String> createReportingServicesDataPassword(String value) {
        return new JAXBElement<>(_ReportingServicesDataPassword_QNAME, String.class, ReportingServicesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "Url", scope = ReportingServicesData.class)
    public JAXBElement<String> createReportingServicesDataUrl(String value) {
        return new JAXBElement<>(_ReportingServicesDataUrl_QNAME, String.class, ReportingServicesData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccessPoint2CameraChain }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAccessPoint2CameraChain }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "Add", scope = AccessPoint2CameraChainResult.class)
    public JAXBElement<ArrayOfAccessPoint2CameraChain> createAccessPoint2CameraChainResultAdd(ArrayOfAccessPoint2CameraChain value) {
        return new JAXBElement<>(_AccessPoint2CameraChainResultAdd_QNAME, ArrayOfAccessPoint2CameraChain.class, AccessPoint2CameraChainResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccessPoint2CameraChain }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAccessPoint2CameraChain }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "Remove", scope = AccessPoint2CameraChainResult.class)
    public JAXBElement<ArrayOfAccessPoint2CameraChain> createAccessPoint2CameraChainResultRemove(ArrayOfAccessPoint2CameraChain value) {
        return new JAXBElement<>(_AccessPoint2CameraChainResultRemove_QNAME, ArrayOfAccessPoint2CameraChain.class, AccessPoint2CameraChainResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IPAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IPAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", name = "Gateway", scope = NetConfiguration.class)
    public JAXBElement<IPAddress> createNetConfigurationGateway(IPAddress value) {
        return new JAXBElement<>(_NetConfigurationGateway_QNAME, IPAddress.class, NetConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IPAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IPAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", name = "IPAddress", scope = NetConfiguration.class)
    public JAXBElement<IPAddress> createNetConfigurationIPAddress(IPAddress value) {
        return new JAXBElement<>(_NetConfigurationIPAddress_QNAME, IPAddress.class, NetConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IPAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IPAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver", name = "Mask", scope = NetConfiguration.class)
    public JAXBElement<IPAddress> createNetConfigurationMask(IPAddress value) {
        return new JAXBElement<>(_NetConfigurationMask_QNAME, IPAddress.class, NetConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeePassageNotification }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmployeePassageNotification }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Notifications", name = "EmployeePassageNotifications", scope = NotificationInfo.class)
    public JAXBElement<ArrayOfEmployeePassageNotification> createNotificationInfoEmployeePassageNotifications(ArrayOfEmployeePassageNotification value) {
        return new JAXBElement<>(_NotificationInfoEmployeePassageNotifications_QNAME, ArrayOfEmployeePassageNotification.class, NotificationInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Recognition", name = "AgreementFrom", scope = EbsBiometricStatusResult.class)
    public JAXBElement<XMLGregorianCalendar> createEbsBiometricStatusResultAgreementFrom(XMLGregorianCalendar value) {
        return new JAXBElement<>(_EbsBiometricStatusResultAgreementFrom_QNAME, XMLGregorianCalendar.class, EbsBiometricStatusResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Recognition", name = "AgreementTo", scope = EbsBiometricStatusResult.class)
    public JAXBElement<XMLGregorianCalendar> createEbsBiometricStatusResultAgreementTo(XMLGregorianCalendar value) {
        return new JAXBElement<>(_EbsBiometricStatusResultAgreementTo_QNAME, XMLGregorianCalendar.class, EbsBiometricStatusResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Recognition", name = "ErrorMessage", scope = EbsBiometricStatusResult.class)
    public JAXBElement<String> createEbsBiometricStatusResultErrorMessage(String value) {
        return new JAXBElement<>(_EbsBiometricStatusResultErrorMessage_QNAME, String.class, EbsBiometricStatusResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "DriverType", scope = LDriverFullInfo.class)
    public JAXBElement<String> createLDriverFullInfoDriverType(String value) {
        return new JAXBElement<>(_LDriverFullInfoDriverType_QNAME, String.class, LDriverFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "FilterTagIds", scope = LDriverFullInfo.class)
    public JAXBElement<ArrayOfguid> createLDriverFullInfoFilterTagIds(ArrayOfguid value) {
        return new JAXBElement<>(_LDriverFullInfoFilterTagIds_QNAME, ArrayOfguid.class, LDriverFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "Name", scope = LDriverFullInfo.class)
    public JAXBElement<String> createLDriverFullInfoName(String value) {
        return new JAXBElement<>(_LDriverFullInfoName_QNAME, String.class, LDriverFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ParentId", scope = LDriverFullInfo.class)
    public JAXBElement<String> createLDriverFullInfoParentId(String value) {
        return new JAXBElement<>(_LDriverFullInfoParentId_QNAME, String.class, LDriverFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ParentPropertyName", scope = LDriverFullInfo.class)
    public JAXBElement<String> createLDriverFullInfoParentPropertyName(String value) {
        return new JAXBElement<>(_LDriverFullInfoParentPropertyName_QNAME, String.class, LDriverFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourcePropertyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourcePropertyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "Properties", scope = LDriverFullInfo.class)
    public JAXBElement<ArrayOfLResourcePropertyValue> createLDriverFullInfoProperties(ArrayOfLResourcePropertyValue value) {
        return new JAXBElement<>(_LDriverFullInfoProperties_QNAME, ArrayOfLResourcePropertyValue.class, LDriverFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourcePropertyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourcePropertyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "States", scope = LDriverFullInfo.class)
    public JAXBElement<ArrayOfLResourcePropertyValue> createLDriverFullInfoStates(ArrayOfLResourcePropertyValue value) {
        return new JAXBElement<>(_LDriverFullInfoStates_QNAME, ArrayOfLResourcePropertyValue.class, LDriverFullInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "Name", scope = LProperty.class)
    public JAXBElement<String> createLPropertyName(String value) {
        return new JAXBElement<>(_LDriverFullInfoName_QNAME, String.class, LProperty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "Value", scope = LProperty.class)
    public JAXBElement<String> createLPropertyValue(String value) {
        return new JAXBElement<>(_LResourcePropertyValueValue_QNAME, String.class, LProperty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "Url", scope = LServerInfo.class)
    public JAXBElement<String> createLServerInfoUrl(String value) {
        return new JAXBElement<>(_ReportingServicesDataUrl_QNAME, String.class, LServerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "GatewayUrl", scope = LNetInfo.class)
    public JAXBElement<String> createLNetInfoGatewayUrl(String value) {
        return new JAXBElement<>(_LNetInfoGatewayUrl_QNAME, String.class, LNetInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "Name", scope = VariableInfo.class)
    public JAXBElement<String> createVariableInfoName(String value) {
        return new JAXBElement<>(_LDriverFullInfoName_QNAME, String.class, VariableInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "Value", scope = VariableInfo.class)
    public JAXBElement<String> createVariableInfoValue(String value) {
        return new JAXBElement<>(_LResourcePropertyValueValue_QNAME, String.class, VariableInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ElementID", scope = License.class)
    public JAXBElement<String> createLicenseElementID(String value) {
        return new JAXBElement<>(_LicenseElementID_QNAME, String.class, License.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ElementName", scope = License.class)
    public JAXBElement<String> createLicenseElementName(String value) {
        return new JAXBElement<>(_LicenseElementName_QNAME, String.class, License.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ModuleID", scope = License.class)
    public JAXBElement<String> createLicenseModuleID(String value) {
        return new JAXBElement<>(_LicenseModuleID_QNAME, String.class, License.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "ModuleName", scope = License.class)
    public JAXBElement<String> createLicenseModuleName(String value) {
        return new JAXBElement<>(_LicenseModuleName_QNAME, String.class, License.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", name = "Value", scope = License.class)
    public JAXBElement<String> createLicenseValue(String value) {
        return new JAXBElement<>(_LResourcePropertyValueValue_QNAME, String.class, License.class, value);
    }

}
