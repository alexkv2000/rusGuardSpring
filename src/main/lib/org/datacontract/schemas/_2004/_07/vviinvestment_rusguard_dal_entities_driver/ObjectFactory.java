
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_driver;

import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.ArrayOfLDriverFullInfo;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.LDriverFullInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_driver package. 
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

    private static final QName _ArrayOfRelayBlockStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "ArrayOfRelayBlockStatus");
    private static final QName _RelayBlockStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "RelayBlockStatus");
    private static final QName _ArrayOfCellInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "ArrayOfCellInfo");
    private static final QName _CellInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "CellInfo");
    private static final QName _KeyKeeperControllerResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "KeyKeeperControllerResult");
    private static final QName _KeyKeeperConfiguration_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "KeyKeeperConfiguration");
    private static final QName _ArrayOfKeyKeeperCabinet_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "ArrayOfKeyKeeperCabinet");
    private static final QName _KeyKeeperCabinet_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "KeyKeeperCabinet");
    private static final QName _ArrayOfKeyKeeperPort_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "ArrayOfKeyKeeperPort");
    private static final QName _KeyKeeperPort_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "KeyKeeperPort");
    private static final QName _CabinetStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "CabinetStatus");
    private static final QName _ArrayOfSlotInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "ArrayOfSlotInfo");
    private static final QName _SlotInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "SlotInfo");
    private static final QName _RoomKeyInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "RoomKeyInfo");
    private static final QName _KeyKeeperCommandResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "KeyKeeperCommandResult");
    private static final QName _PanasonicCameraCollectionResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Panasonic", "PanasonicCameraCollectionResult");
    private static final QName _BasIPVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.BasIp", "BasIPVersion");
    private static final QName _FindBasIpIntercomResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.BasIp", "FindBasIpIntercomResult");
    private static final QName _ArrayOfBasIpIntercomInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.BasIp", "ArrayOfBasIpIntercomInfo");
    private static final QName _BasIpIntercomInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.BasIp", "BasIpIntercomInfo");
    private static final QName _NTechLabRecognitionServiceResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", "NTechLabRecognitionServiceResult");
    private static final QName _ArrayOfNTechLabCameraInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", "ArrayOfNTechLabCameraInfo");
    private static final QName _NTechLabCameraInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", "NTechLabCameraInfo");
    private static final QName _ArrayOfNTechLabDossierListInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", "ArrayOfNTechLabDossierListInfo");
    private static final QName _NTechLabDossierListInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", "NTechLabDossierListInfo");
    private static final QName _NTechLabConfigSyncState_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", "NTechLabConfigSyncState");
    private static final QName _NUUOArchiveServerCollectionResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", "NUUOArchiveServerCollectionResult");
    private static final QName _ArrayOfNUUOArchiveServer_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", "ArrayOfNUUOArchiveServer");
    private static final QName _NUUOArchiveServer_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", "NUUOArchiveServer");
    private static final QName _ArrayOfNUUOVideoRecorder_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", "ArrayOfNUUOVideoRecorder");
    private static final QName _NUUOVideoRecorder_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", "NUUOVideoRecorder");
    private static final QName _ArrayOfNUUOCamera_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", "ArrayOfNUUOCamera");
    private static final QName _NUUOCamera_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", "NUUOCamera");
    private static final QName _TrassirIntegrationResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", "TrassirIntegrationResult");
    private static final QName _ArrayOfTrassirServerInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", "ArrayOfTrassirServerInfo");
    private static final QName _TrassirServerInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", "TrassirServerInfo");
    private static final QName _ArrayOfTrassirChannelInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", "ArrayOfTrassirChannelInfo");
    private static final QName _TrassirChannelInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", "TrassirChannelInfo");
    private static final QName _IdisConfiguration_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Idis", "IdisConfiguration");
    private static final QName _IvideonCameraCollectionResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Ivideon", "IvideonCameraCollectionResult");
    private static final QName _IvideonRemoteServerCollectionResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Ivideon", "IvideonRemoteServerCollectionResult");
    private static final QName _FindLPRCameraResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.LPRCamera", "FindLPRCameraResult");
    private static final QName _ArrayOfLPRCameraInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.LPRCamera", "ArrayOfLPRCameraInfo");
    private static final QName _LPRCameraInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.LPRCamera", "LPRCameraInfo");
    private static final QName _FindConvertersResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "FindConvertersResult");
    private static final QName _ArrayOfCanConverterAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "ArrayOfCanConverterAddress");
    private static final QName _CanConverterAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "CanConverterAddress");
    private static final QName _CanConverterAddressTagEnum_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "CanConverterAddress.TagEnum");
    private static final QName _UsbCanConverterAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "UsbCanConverterAddress");
    private static final QName _ArrayOfLanCanConverter_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "ArrayOfLanCanConverter");
    private static final QName _LanCanConverter_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "LanCanConverter");
    private static final QName _FindControllersResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "FindControllersResult");
    private static final QName _ArrayOfCanDeviceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "ArrayOfCanDeviceInfo");
    private static final QName _CanDeviceInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "CanDeviceInfo");
    private static final QName _CanDeviceNetConfig_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "CanDeviceNetConfig");
    private static final QName _ArrayOfFindControllersResultFailedConverterInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "ArrayOfFindControllersResult.FailedConverterInfo");
    private static final QName _FindControllersResultFailedConverterInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "FindControllersResult.FailedConverterInfo");
    private static final QName _ArrayOfCanDeviceNetConfig_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "ArrayOfCanDeviceNetConfig");
    private static final QName _SetDevicesAddressBySidResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "SetDevicesAddressBySidResult");
    private static final QName _ArrayOfSetDevicesAddressBySidResultFailedAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "ArrayOfSetDevicesAddressBySidResult.FailedAddress");
    private static final QName _SetDevicesAddressBySidResultFailedAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "SetDevicesAddressBySidResult.FailedAddress");
    private static final QName _GetControllerConfigurationsResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "GetControllerConfigurationsResult");
    private static final QName _ArrayOfGetControllerConfigurationsResultConfig_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "ArrayOfGetControllerConfigurationsResult.Config");
    private static final QName _GetControllerConfigurationsResultConfig_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "GetControllerConfigurationsResult.Config");
    private static final QName _ArrayOfGetControllerConfigurationsResultFailedConfig_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "ArrayOfGetControllerConfigurationsResult.FailedConfig");
    private static final QName _GetControllerConfigurationsResultFailedConfig_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "GetControllerConfigurationsResult.FailedConfig");
    private static final QName _LanCanConverterAddressIpAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "IpAddress");
    private static final QName _GetControllerConfigurationsResultFailedConfigError_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "Error");
    private static final QName _GetControllerConfigurationsResultFailedConfigNetConfig_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "NetConfig");
    private static final QName _GetControllerConfigurationsResultConfigConfiguration_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "Configuration");
    private static final QName _FindControllersResultFailedConverterInfoConverterAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "ConverterAddress");
    private static final QName _CanDeviceNetConfigDriverFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "DriverFullInfo");
    private static final QName _CanDeviceNetConfigHardwareType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "HardwareType");
    private static final QName _CanDeviceInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "Name");
    private static final QName _UsbCanConverterAddressSerialNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "SerialNumber");
    private static final QName _UsbCanConverterAddressVendor_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "Vendor");
    private static final QName _CanConverterAddressLanCanConverterAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "LanCanConverterAddress");
    private static final QName _LPRCameraInfoIPAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.LPRCamera", "IPAddress");
    private static final QName _LPRCameraInfoMacAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.LPRCamera", "MacAddress");
    private static final QName _TrassirChannelInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", "Name");
    private static final QName _TrassirChannelInfoTrassirID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", "TrassirID");
    private static final QName _TrassirServerInfoChannels_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", "Channels");
    private static final QName _NUUOCameraDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", "Description");
    private static final QName _NUUOCameraName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", "Name");
    private static final QName _NUUOVideoRecorderCameras_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", "Cameras");
    private static final QName _NUUOArchiveServerVideoRecorders_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", "VideoRecorders");
    private static final QName _NTechLabDossierListInfoComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", "Comment");
    private static final QName _NTechLabDossierListInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", "Name");
    private static final QName _NTechLabCameraInfoUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", "Url");
    private static final QName _BasIpIntercomInfoIpAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.BasIp", "IpAddress");
    private static final QName _SlotInfoKeyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "KeyName");
    private static final QName _KeyKeeperPortKeyCabinetId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "KeyCabinetId");
    private static final QName _KeyKeeperPortName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "Name");
    private static final QName _KeyKeeperPortPoBoxId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "PoBoxId");
    private static final QName _KeyKeeperCabinetComment_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "Comment");
    private static final QName _KeyKeeperCabinetExternalID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "ExternalID");
    private static final QName _KeyKeeperConfigurationNTP1_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "NTP1");
    private static final QName _KeyKeeperConfigurationNTP2_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "NTP2");
    private static final QName _KeyKeeperConfigurationNTP3_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "NTP3");
    private static final QName _KeyKeeperConfigurationTimeZone_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "TimeZone");
    private static final QName _CellInfoIsOpened_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "IsOpened");
    private static final QName _RelayBlockStatusCells_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "Cells");
    private static final QName _GetControllerConfigurationsResultConfigurations_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "Configurations");
    private static final QName _GetControllerConfigurationsResultFailedDevices_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "FailedDevices");
    private static final QName _FindControllersResultControllers_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "Controllers");
    private static final QName _FindControllersResultFailedControllers_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "FailedControllers");
    private static final QName _FindControllersResultFailedConverters_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "FailedConverters");
    private static final QName _LanCanConverterGateway_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "Gateway");
    private static final QName _LanCanConverterMask_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "Mask");
    private static final QName _FindConvertersResultConverters_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "Converters");
    private static final QName _FindConvertersResultMissingDrivers_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", "MissingDrivers");
    private static final QName _FindLPRCameraResultFoundCameras_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.LPRCamera", "FoundCameras");
    private static final QName _FindBasIpIntercomResultFoudIntercoms_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.BasIp", "FoudIntercoms");
    private static final QName _IvideonRemoteServerCollectionResultDriverFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Ivideon", "DriverFullInfo");
    private static final QName _IdisConfigurationChannelNames_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Idis", "ChannelNames");
    private static final QName _IdisConfigurationModelName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Idis", "ModelName");
    private static final QName _IdisConfigurationSoftwareVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Idis", "SoftwareVersion");
    private static final QName _TrassirIntegrationResultServers_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", "Servers");
    private static final QName _NUUOArchiveServerCollectionResultArchiveServers_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", "ArchiveServers");
    private static final QName _KeyKeeperCommandResultMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "Message");
    private static final QName _RoomKeyInfoCabinetID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "CabinetID");
    private static final QName _RoomKeyInfoCabinetName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "CabinetName");
    private static final QName _RoomKeyInfoControllerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "ControllerName");
    private static final QName _CabinetStatusSlotsStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "SlotsStatus");
    private static final QName _KeyKeeperControllerResultConfiguration_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "Configuration");
    private static final QName _KeyKeeperControllerResultKeyKeeperCabinets_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "KeyKeeperCabinets");
    private static final QName _KeyKeeperControllerResultKeyKeeperPorts_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", "KeyKeeperPorts");
    private static final QName _NTechLabRecognitionServiceResultCameras_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", "Cameras");
    private static final QName _NTechLabRecognitionServiceResultDossierLists_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", "DossierLists");
    private static final QName _PanasonicCameraCollectionResultDriverFullInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Panasonic", "DriverFullInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_driver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfRelayBlockStatus }
     * 
     * @return
     *     the new instance of {@link ArrayOfRelayBlockStatus }
     */
    public ArrayOfRelayBlockStatus createArrayOfRelayBlockStatus() {
        return new ArrayOfRelayBlockStatus();
    }

    /**
     * Create an instance of {@link PanasonicCameraCollectionResult }
     * 
     * @return
     *     the new instance of {@link PanasonicCameraCollectionResult }
     */
    public PanasonicCameraCollectionResult createPanasonicCameraCollectionResult() {
        return new PanasonicCameraCollectionResult();
    }

    /**
     * Create an instance of {@link NTechLabRecognitionServiceResult }
     * 
     * @return
     *     the new instance of {@link NTechLabRecognitionServiceResult }
     */
    public NTechLabRecognitionServiceResult createNTechLabRecognitionServiceResult() {
        return new NTechLabRecognitionServiceResult();
    }

    /**
     * Create an instance of {@link KeyKeeperControllerResult }
     * 
     * @return
     *     the new instance of {@link KeyKeeperControllerResult }
     */
    public KeyKeeperControllerResult createKeyKeeperControllerResult() {
        return new KeyKeeperControllerResult();
    }

    /**
     * Create an instance of {@link CabinetStatus }
     * 
     * @return
     *     the new instance of {@link CabinetStatus }
     */
    public CabinetStatus createCabinetStatus() {
        return new CabinetStatus();
    }

    /**
     * Create an instance of {@link RoomKeyInfo }
     * 
     * @return
     *     the new instance of {@link RoomKeyInfo }
     */
    public RoomKeyInfo createRoomKeyInfo() {
        return new RoomKeyInfo();
    }

    /**
     * Create an instance of {@link KeyKeeperCommandResult }
     * 
     * @return
     *     the new instance of {@link KeyKeeperCommandResult }
     */
    public KeyKeeperCommandResult createKeyKeeperCommandResult() {
        return new KeyKeeperCommandResult();
    }

    /**
     * Create an instance of {@link NUUOArchiveServerCollectionResult }
     * 
     * @return
     *     the new instance of {@link NUUOArchiveServerCollectionResult }
     */
    public NUUOArchiveServerCollectionResult createNUUOArchiveServerCollectionResult() {
        return new NUUOArchiveServerCollectionResult();
    }

    /**
     * Create an instance of {@link TrassirIntegrationResult }
     * 
     * @return
     *     the new instance of {@link TrassirIntegrationResult }
     */
    public TrassirIntegrationResult createTrassirIntegrationResult() {
        return new TrassirIntegrationResult();
    }

    /**
     * Create an instance of {@link IdisConfiguration }
     * 
     * @return
     *     the new instance of {@link IdisConfiguration }
     */
    public IdisConfiguration createIdisConfiguration() {
        return new IdisConfiguration();
    }

    /**
     * Create an instance of {@link IvideonCameraCollectionResult }
     * 
     * @return
     *     the new instance of {@link IvideonCameraCollectionResult }
     */
    public IvideonCameraCollectionResult createIvideonCameraCollectionResult() {
        return new IvideonCameraCollectionResult();
    }

    /**
     * Create an instance of {@link IvideonRemoteServerCollectionResult }
     * 
     * @return
     *     the new instance of {@link IvideonRemoteServerCollectionResult }
     */
    public IvideonRemoteServerCollectionResult createIvideonRemoteServerCollectionResult() {
        return new IvideonRemoteServerCollectionResult();
    }

    /**
     * Create an instance of {@link FindBasIpIntercomResult }
     * 
     * @return
     *     the new instance of {@link FindBasIpIntercomResult }
     */
    public FindBasIpIntercomResult createFindBasIpIntercomResult() {
        return new FindBasIpIntercomResult();
    }

    /**
     * Create an instance of {@link FindLPRCameraResult }
     * 
     * @return
     *     the new instance of {@link FindLPRCameraResult }
     */
    public FindLPRCameraResult createFindLPRCameraResult() {
        return new FindLPRCameraResult();
    }

    /**
     * Create an instance of {@link FindConvertersResult }
     * 
     * @return
     *     the new instance of {@link FindConvertersResult }
     */
    public FindConvertersResult createFindConvertersResult() {
        return new FindConvertersResult();
    }

    /**
     * Create an instance of {@link ArrayOfLanCanConverter }
     * 
     * @return
     *     the new instance of {@link ArrayOfLanCanConverter }
     */
    public ArrayOfLanCanConverter createArrayOfLanCanConverter() {
        return new ArrayOfLanCanConverter();
    }

    /**
     * Create an instance of {@link LanCanConverter }
     * 
     * @return
     *     the new instance of {@link LanCanConverter }
     */
    public LanCanConverter createLanCanConverter() {
        return new LanCanConverter();
    }

    /**
     * Create an instance of {@link ArrayOfCanConverterAddress }
     * 
     * @return
     *     the new instance of {@link ArrayOfCanConverterAddress }
     */
    public ArrayOfCanConverterAddress createArrayOfCanConverterAddress() {
        return new ArrayOfCanConverterAddress();
    }

    /**
     * Create an instance of {@link FindControllersResult }
     * 
     * @return
     *     the new instance of {@link FindControllersResult }
     */
    public FindControllersResult createFindControllersResult() {
        return new FindControllersResult();
    }

    /**
     * Create an instance of {@link ArrayOfCanDeviceNetConfig }
     * 
     * @return
     *     the new instance of {@link ArrayOfCanDeviceNetConfig }
     */
    public ArrayOfCanDeviceNetConfig createArrayOfCanDeviceNetConfig() {
        return new ArrayOfCanDeviceNetConfig();
    }

    /**
     * Create an instance of {@link SetDevicesAddressBySidResult }
     * 
     * @return
     *     the new instance of {@link SetDevicesAddressBySidResult }
     */
    public SetDevicesAddressBySidResult createSetDevicesAddressBySidResult() {
        return new SetDevicesAddressBySidResult();
    }

    /**
     * Create an instance of {@link GetControllerConfigurationsResult }
     * 
     * @return
     *     the new instance of {@link GetControllerConfigurationsResult }
     */
    public GetControllerConfigurationsResult createGetControllerConfigurationsResult() {
        return new GetControllerConfigurationsResult();
    }

    /**
     * Create an instance of {@link RelayBlockStatus }
     * 
     * @return
     *     the new instance of {@link RelayBlockStatus }
     */
    public RelayBlockStatus createRelayBlockStatus() {
        return new RelayBlockStatus();
    }

    /**
     * Create an instance of {@link ArrayOfCellInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfCellInfo }
     */
    public ArrayOfCellInfo createArrayOfCellInfo() {
        return new ArrayOfCellInfo();
    }

    /**
     * Create an instance of {@link CellInfo }
     * 
     * @return
     *     the new instance of {@link CellInfo }
     */
    public CellInfo createCellInfo() {
        return new CellInfo();
    }

    /**
     * Create an instance of {@link KeyKeeperConfiguration }
     * 
     * @return
     *     the new instance of {@link KeyKeeperConfiguration }
     */
    public KeyKeeperConfiguration createKeyKeeperConfiguration() {
        return new KeyKeeperConfiguration();
    }

    /**
     * Create an instance of {@link ArrayOfKeyKeeperCabinet }
     * 
     * @return
     *     the new instance of {@link ArrayOfKeyKeeperCabinet }
     */
    public ArrayOfKeyKeeperCabinet createArrayOfKeyKeeperCabinet() {
        return new ArrayOfKeyKeeperCabinet();
    }

    /**
     * Create an instance of {@link KeyKeeperCabinet }
     * 
     * @return
     *     the new instance of {@link KeyKeeperCabinet }
     */
    public KeyKeeperCabinet createKeyKeeperCabinet() {
        return new KeyKeeperCabinet();
    }

    /**
     * Create an instance of {@link ArrayOfKeyKeeperPort }
     * 
     * @return
     *     the new instance of {@link ArrayOfKeyKeeperPort }
     */
    public ArrayOfKeyKeeperPort createArrayOfKeyKeeperPort() {
        return new ArrayOfKeyKeeperPort();
    }

    /**
     * Create an instance of {@link KeyKeeperPort }
     * 
     * @return
     *     the new instance of {@link KeyKeeperPort }
     */
    public KeyKeeperPort createKeyKeeperPort() {
        return new KeyKeeperPort();
    }

    /**
     * Create an instance of {@link ArrayOfSlotInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfSlotInfo }
     */
    public ArrayOfSlotInfo createArrayOfSlotInfo() {
        return new ArrayOfSlotInfo();
    }

    /**
     * Create an instance of {@link SlotInfo }
     * 
     * @return
     *     the new instance of {@link SlotInfo }
     */
    public SlotInfo createSlotInfo() {
        return new SlotInfo();
    }

    /**
     * Create an instance of {@link ArrayOfBasIpIntercomInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfBasIpIntercomInfo }
     */
    public ArrayOfBasIpIntercomInfo createArrayOfBasIpIntercomInfo() {
        return new ArrayOfBasIpIntercomInfo();
    }

    /**
     * Create an instance of {@link BasIpIntercomInfo }
     * 
     * @return
     *     the new instance of {@link BasIpIntercomInfo }
     */
    public BasIpIntercomInfo createBasIpIntercomInfo() {
        return new BasIpIntercomInfo();
    }

    /**
     * Create an instance of {@link ArrayOfNTechLabCameraInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfNTechLabCameraInfo }
     */
    public ArrayOfNTechLabCameraInfo createArrayOfNTechLabCameraInfo() {
        return new ArrayOfNTechLabCameraInfo();
    }

    /**
     * Create an instance of {@link NTechLabCameraInfo }
     * 
     * @return
     *     the new instance of {@link NTechLabCameraInfo }
     */
    public NTechLabCameraInfo createNTechLabCameraInfo() {
        return new NTechLabCameraInfo();
    }

    /**
     * Create an instance of {@link ArrayOfNTechLabDossierListInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfNTechLabDossierListInfo }
     */
    public ArrayOfNTechLabDossierListInfo createArrayOfNTechLabDossierListInfo() {
        return new ArrayOfNTechLabDossierListInfo();
    }

    /**
     * Create an instance of {@link NTechLabDossierListInfo }
     * 
     * @return
     *     the new instance of {@link NTechLabDossierListInfo }
     */
    public NTechLabDossierListInfo createNTechLabDossierListInfo() {
        return new NTechLabDossierListInfo();
    }

    /**
     * Create an instance of {@link ArrayOfNUUOArchiveServer }
     * 
     * @return
     *     the new instance of {@link ArrayOfNUUOArchiveServer }
     */
    public ArrayOfNUUOArchiveServer createArrayOfNUUOArchiveServer() {
        return new ArrayOfNUUOArchiveServer();
    }

    /**
     * Create an instance of {@link NUUOArchiveServer }
     * 
     * @return
     *     the new instance of {@link NUUOArchiveServer }
     */
    public NUUOArchiveServer createNUUOArchiveServer() {
        return new NUUOArchiveServer();
    }

    /**
     * Create an instance of {@link ArrayOfNUUOVideoRecorder }
     * 
     * @return
     *     the new instance of {@link ArrayOfNUUOVideoRecorder }
     */
    public ArrayOfNUUOVideoRecorder createArrayOfNUUOVideoRecorder() {
        return new ArrayOfNUUOVideoRecorder();
    }

    /**
     * Create an instance of {@link NUUOVideoRecorder }
     * 
     * @return
     *     the new instance of {@link NUUOVideoRecorder }
     */
    public NUUOVideoRecorder createNUUOVideoRecorder() {
        return new NUUOVideoRecorder();
    }

    /**
     * Create an instance of {@link ArrayOfNUUOCamera }
     * 
     * @return
     *     the new instance of {@link ArrayOfNUUOCamera }
     */
    public ArrayOfNUUOCamera createArrayOfNUUOCamera() {
        return new ArrayOfNUUOCamera();
    }

    /**
     * Create an instance of {@link NUUOCamera }
     * 
     * @return
     *     the new instance of {@link NUUOCamera }
     */
    public NUUOCamera createNUUOCamera() {
        return new NUUOCamera();
    }

    /**
     * Create an instance of {@link ArrayOfTrassirServerInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfTrassirServerInfo }
     */
    public ArrayOfTrassirServerInfo createArrayOfTrassirServerInfo() {
        return new ArrayOfTrassirServerInfo();
    }

    /**
     * Create an instance of {@link TrassirServerInfo }
     * 
     * @return
     *     the new instance of {@link TrassirServerInfo }
     */
    public TrassirServerInfo createTrassirServerInfo() {
        return new TrassirServerInfo();
    }

    /**
     * Create an instance of {@link ArrayOfTrassirChannelInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfTrassirChannelInfo }
     */
    public ArrayOfTrassirChannelInfo createArrayOfTrassirChannelInfo() {
        return new ArrayOfTrassirChannelInfo();
    }

    /**
     * Create an instance of {@link TrassirChannelInfo }
     * 
     * @return
     *     the new instance of {@link TrassirChannelInfo }
     */
    public TrassirChannelInfo createTrassirChannelInfo() {
        return new TrassirChannelInfo();
    }

    /**
     * Create an instance of {@link ArrayOfLPRCameraInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfLPRCameraInfo }
     */
    public ArrayOfLPRCameraInfo createArrayOfLPRCameraInfo() {
        return new ArrayOfLPRCameraInfo();
    }

    /**
     * Create an instance of {@link LPRCameraInfo }
     * 
     * @return
     *     the new instance of {@link LPRCameraInfo }
     */
    public LPRCameraInfo createLPRCameraInfo() {
        return new LPRCameraInfo();
    }

    /**
     * Create an instance of {@link CanConverterAddress }
     * 
     * @return
     *     the new instance of {@link CanConverterAddress }
     */
    public CanConverterAddress createCanConverterAddress() {
        return new CanConverterAddress();
    }

    /**
     * Create an instance of {@link UsbCanConverterAddress }
     * 
     * @return
     *     the new instance of {@link UsbCanConverterAddress }
     */
    public UsbCanConverterAddress createUsbCanConverterAddress() {
        return new UsbCanConverterAddress();
    }

    /**
     * Create an instance of {@link ArrayOfCanDeviceInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfCanDeviceInfo }
     */
    public ArrayOfCanDeviceInfo createArrayOfCanDeviceInfo() {
        return new ArrayOfCanDeviceInfo();
    }

    /**
     * Create an instance of {@link CanDeviceInfo }
     * 
     * @return
     *     the new instance of {@link CanDeviceInfo }
     */
    public CanDeviceInfo createCanDeviceInfo() {
        return new CanDeviceInfo();
    }

    /**
     * Create an instance of {@link CanDeviceNetConfig }
     * 
     * @return
     *     the new instance of {@link CanDeviceNetConfig }
     */
    public CanDeviceNetConfig createCanDeviceNetConfig() {
        return new CanDeviceNetConfig();
    }

    /**
     * Create an instance of {@link ArrayOfFindControllersResultFailedConverterInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfFindControllersResultFailedConverterInfo }
     */
    public ArrayOfFindControllersResultFailedConverterInfo createArrayOfFindControllersResultFailedConverterInfo() {
        return new ArrayOfFindControllersResultFailedConverterInfo();
    }

    /**
     * Create an instance of {@link FindControllersResultFailedConverterInfo }
     * 
     * @return
     *     the new instance of {@link FindControllersResultFailedConverterInfo }
     */
    public FindControllersResultFailedConverterInfo createFindControllersResultFailedConverterInfo() {
        return new FindControllersResultFailedConverterInfo();
    }

    /**
     * Create an instance of {@link ArrayOfSetDevicesAddressBySidResultFailedAddress }
     * 
     * @return
     *     the new instance of {@link ArrayOfSetDevicesAddressBySidResultFailedAddress }
     */
    public ArrayOfSetDevicesAddressBySidResultFailedAddress createArrayOfSetDevicesAddressBySidResultFailedAddress() {
        return new ArrayOfSetDevicesAddressBySidResultFailedAddress();
    }

    /**
     * Create an instance of {@link SetDevicesAddressBySidResultFailedAddress }
     * 
     * @return
     *     the new instance of {@link SetDevicesAddressBySidResultFailedAddress }
     */
    public SetDevicesAddressBySidResultFailedAddress createSetDevicesAddressBySidResultFailedAddress() {
        return new SetDevicesAddressBySidResultFailedAddress();
    }

    /**
     * Create an instance of {@link ArrayOfGetControllerConfigurationsResultConfig }
     * 
     * @return
     *     the new instance of {@link ArrayOfGetControllerConfigurationsResultConfig }
     */
    public ArrayOfGetControllerConfigurationsResultConfig createArrayOfGetControllerConfigurationsResultConfig() {
        return new ArrayOfGetControllerConfigurationsResultConfig();
    }

    /**
     * Create an instance of {@link GetControllerConfigurationsResultConfig }
     * 
     * @return
     *     the new instance of {@link GetControllerConfigurationsResultConfig }
     */
    public GetControllerConfigurationsResultConfig createGetControllerConfigurationsResultConfig() {
        return new GetControllerConfigurationsResultConfig();
    }

    /**
     * Create an instance of {@link ArrayOfGetControllerConfigurationsResultFailedConfig }
     * 
     * @return
     *     the new instance of {@link ArrayOfGetControllerConfigurationsResultFailedConfig }
     */
    public ArrayOfGetControllerConfigurationsResultFailedConfig createArrayOfGetControllerConfigurationsResultFailedConfig() {
        return new ArrayOfGetControllerConfigurationsResultFailedConfig();
    }

    /**
     * Create an instance of {@link GetControllerConfigurationsResultFailedConfig }
     * 
     * @return
     *     the new instance of {@link GetControllerConfigurationsResultFailedConfig }
     */
    public GetControllerConfigurationsResultFailedConfig createGetControllerConfigurationsResultFailedConfig() {
        return new GetControllerConfigurationsResultFailedConfig();
    }

    /**
     * Create an instance of {@link LanCanConverterAddress }
     * 
     * @return
     *     the new instance of {@link LanCanConverterAddress }
     */
    public LanCanConverterAddress createLanCanConverterAddress() {
        return new LanCanConverterAddress();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRelayBlockStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRelayBlockStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "ArrayOfRelayBlockStatus")
    public JAXBElement<ArrayOfRelayBlockStatus> createArrayOfRelayBlockStatus(ArrayOfRelayBlockStatus value) {
        return new JAXBElement<>(_ArrayOfRelayBlockStatus_QNAME, ArrayOfRelayBlockStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelayBlockStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RelayBlockStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "RelayBlockStatus")
    public JAXBElement<RelayBlockStatus> createRelayBlockStatus(RelayBlockStatus value) {
        return new JAXBElement<>(_RelayBlockStatus_QNAME, RelayBlockStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCellInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCellInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "ArrayOfCellInfo")
    public JAXBElement<ArrayOfCellInfo> createArrayOfCellInfo(ArrayOfCellInfo value) {
        return new JAXBElement<>(_ArrayOfCellInfo_QNAME, ArrayOfCellInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CellInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CellInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "CellInfo")
    public JAXBElement<CellInfo> createCellInfo(CellInfo value) {
        return new JAXBElement<>(_CellInfo_QNAME, CellInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyKeeperControllerResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyKeeperControllerResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "KeyKeeperControllerResult")
    public JAXBElement<KeyKeeperControllerResult> createKeyKeeperControllerResult(KeyKeeperControllerResult value) {
        return new JAXBElement<>(_KeyKeeperControllerResult_QNAME, KeyKeeperControllerResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyKeeperConfiguration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyKeeperConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "KeyKeeperConfiguration")
    public JAXBElement<KeyKeeperConfiguration> createKeyKeeperConfiguration(KeyKeeperConfiguration value) {
        return new JAXBElement<>(_KeyKeeperConfiguration_QNAME, KeyKeeperConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyKeeperCabinet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyKeeperCabinet }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "ArrayOfKeyKeeperCabinet")
    public JAXBElement<ArrayOfKeyKeeperCabinet> createArrayOfKeyKeeperCabinet(ArrayOfKeyKeeperCabinet value) {
        return new JAXBElement<>(_ArrayOfKeyKeeperCabinet_QNAME, ArrayOfKeyKeeperCabinet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyKeeperCabinet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyKeeperCabinet }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "KeyKeeperCabinet")
    public JAXBElement<KeyKeeperCabinet> createKeyKeeperCabinet(KeyKeeperCabinet value) {
        return new JAXBElement<>(_KeyKeeperCabinet_QNAME, KeyKeeperCabinet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyKeeperPort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyKeeperPort }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "ArrayOfKeyKeeperPort")
    public JAXBElement<ArrayOfKeyKeeperPort> createArrayOfKeyKeeperPort(ArrayOfKeyKeeperPort value) {
        return new JAXBElement<>(_ArrayOfKeyKeeperPort_QNAME, ArrayOfKeyKeeperPort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyKeeperPort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyKeeperPort }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "KeyKeeperPort")
    public JAXBElement<KeyKeeperPort> createKeyKeeperPort(KeyKeeperPort value) {
        return new JAXBElement<>(_KeyKeeperPort_QNAME, KeyKeeperPort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CabinetStatus }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CabinetStatus }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "CabinetStatus")
    public JAXBElement<CabinetStatus> createCabinetStatus(CabinetStatus value) {
        return new JAXBElement<>(_CabinetStatus_QNAME, CabinetStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSlotInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSlotInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "ArrayOfSlotInfo")
    public JAXBElement<ArrayOfSlotInfo> createArrayOfSlotInfo(ArrayOfSlotInfo value) {
        return new JAXBElement<>(_ArrayOfSlotInfo_QNAME, ArrayOfSlotInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlotInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SlotInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "SlotInfo")
    public JAXBElement<SlotInfo> createSlotInfo(SlotInfo value) {
        return new JAXBElement<>(_SlotInfo_QNAME, SlotInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomKeyInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoomKeyInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "RoomKeyInfo")
    public JAXBElement<RoomKeyInfo> createRoomKeyInfo(RoomKeyInfo value) {
        return new JAXBElement<>(_RoomKeyInfo_QNAME, RoomKeyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyKeeperCommandResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyKeeperCommandResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "KeyKeeperCommandResult")
    public JAXBElement<KeyKeeperCommandResult> createKeyKeeperCommandResult(KeyKeeperCommandResult value) {
        return new JAXBElement<>(_KeyKeeperCommandResult_QNAME, KeyKeeperCommandResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PanasonicCameraCollectionResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PanasonicCameraCollectionResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Panasonic", name = "PanasonicCameraCollectionResult")
    public JAXBElement<PanasonicCameraCollectionResult> createPanasonicCameraCollectionResult(PanasonicCameraCollectionResult value) {
        return new JAXBElement<>(_PanasonicCameraCollectionResult_QNAME, PanasonicCameraCollectionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasIPVersion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BasIPVersion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.BasIp", name = "BasIPVersion")
    public JAXBElement<BasIPVersion> createBasIPVersion(BasIPVersion value) {
        return new JAXBElement<>(_BasIPVersion_QNAME, BasIPVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBasIpIntercomResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindBasIpIntercomResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.BasIp", name = "FindBasIpIntercomResult")
    public JAXBElement<FindBasIpIntercomResult> createFindBasIpIntercomResult(FindBasIpIntercomResult value) {
        return new JAXBElement<>(_FindBasIpIntercomResult_QNAME, FindBasIpIntercomResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBasIpIntercomInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBasIpIntercomInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.BasIp", name = "ArrayOfBasIpIntercomInfo")
    public JAXBElement<ArrayOfBasIpIntercomInfo> createArrayOfBasIpIntercomInfo(ArrayOfBasIpIntercomInfo value) {
        return new JAXBElement<>(_ArrayOfBasIpIntercomInfo_QNAME, ArrayOfBasIpIntercomInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasIpIntercomInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BasIpIntercomInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.BasIp", name = "BasIpIntercomInfo")
    public JAXBElement<BasIpIntercomInfo> createBasIpIntercomInfo(BasIpIntercomInfo value) {
        return new JAXBElement<>(_BasIpIntercomInfo_QNAME, BasIpIntercomInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NTechLabRecognitionServiceResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NTechLabRecognitionServiceResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", name = "NTechLabRecognitionServiceResult")
    public JAXBElement<NTechLabRecognitionServiceResult> createNTechLabRecognitionServiceResult(NTechLabRecognitionServiceResult value) {
        return new JAXBElement<>(_NTechLabRecognitionServiceResult_QNAME, NTechLabRecognitionServiceResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNTechLabCameraInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNTechLabCameraInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", name = "ArrayOfNTechLabCameraInfo")
    public JAXBElement<ArrayOfNTechLabCameraInfo> createArrayOfNTechLabCameraInfo(ArrayOfNTechLabCameraInfo value) {
        return new JAXBElement<>(_ArrayOfNTechLabCameraInfo_QNAME, ArrayOfNTechLabCameraInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NTechLabCameraInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NTechLabCameraInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", name = "NTechLabCameraInfo")
    public JAXBElement<NTechLabCameraInfo> createNTechLabCameraInfo(NTechLabCameraInfo value) {
        return new JAXBElement<>(_NTechLabCameraInfo_QNAME, NTechLabCameraInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNTechLabDossierListInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNTechLabDossierListInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", name = "ArrayOfNTechLabDossierListInfo")
    public JAXBElement<ArrayOfNTechLabDossierListInfo> createArrayOfNTechLabDossierListInfo(ArrayOfNTechLabDossierListInfo value) {
        return new JAXBElement<>(_ArrayOfNTechLabDossierListInfo_QNAME, ArrayOfNTechLabDossierListInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NTechLabDossierListInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NTechLabDossierListInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", name = "NTechLabDossierListInfo")
    public JAXBElement<NTechLabDossierListInfo> createNTechLabDossierListInfo(NTechLabDossierListInfo value) {
        return new JAXBElement<>(_NTechLabDossierListInfo_QNAME, NTechLabDossierListInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NTechLabConfigSyncState }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NTechLabConfigSyncState }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", name = "NTechLabConfigSyncState")
    public JAXBElement<NTechLabConfigSyncState> createNTechLabConfigSyncState(NTechLabConfigSyncState value) {
        return new JAXBElement<>(_NTechLabConfigSyncState_QNAME, NTechLabConfigSyncState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NUUOArchiveServerCollectionResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NUUOArchiveServerCollectionResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", name = "NUUOArchiveServerCollectionResult")
    public JAXBElement<NUUOArchiveServerCollectionResult> createNUUOArchiveServerCollectionResult(NUUOArchiveServerCollectionResult value) {
        return new JAXBElement<>(_NUUOArchiveServerCollectionResult_QNAME, NUUOArchiveServerCollectionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNUUOArchiveServer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNUUOArchiveServer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", name = "ArrayOfNUUOArchiveServer")
    public JAXBElement<ArrayOfNUUOArchiveServer> createArrayOfNUUOArchiveServer(ArrayOfNUUOArchiveServer value) {
        return new JAXBElement<>(_ArrayOfNUUOArchiveServer_QNAME, ArrayOfNUUOArchiveServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NUUOArchiveServer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NUUOArchiveServer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", name = "NUUOArchiveServer")
    public JAXBElement<NUUOArchiveServer> createNUUOArchiveServer(NUUOArchiveServer value) {
        return new JAXBElement<>(_NUUOArchiveServer_QNAME, NUUOArchiveServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNUUOVideoRecorder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNUUOVideoRecorder }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", name = "ArrayOfNUUOVideoRecorder")
    public JAXBElement<ArrayOfNUUOVideoRecorder> createArrayOfNUUOVideoRecorder(ArrayOfNUUOVideoRecorder value) {
        return new JAXBElement<>(_ArrayOfNUUOVideoRecorder_QNAME, ArrayOfNUUOVideoRecorder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NUUOVideoRecorder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NUUOVideoRecorder }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", name = "NUUOVideoRecorder")
    public JAXBElement<NUUOVideoRecorder> createNUUOVideoRecorder(NUUOVideoRecorder value) {
        return new JAXBElement<>(_NUUOVideoRecorder_QNAME, NUUOVideoRecorder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNUUOCamera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNUUOCamera }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", name = "ArrayOfNUUOCamera")
    public JAXBElement<ArrayOfNUUOCamera> createArrayOfNUUOCamera(ArrayOfNUUOCamera value) {
        return new JAXBElement<>(_ArrayOfNUUOCamera_QNAME, ArrayOfNUUOCamera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NUUOCamera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NUUOCamera }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", name = "NUUOCamera")
    public JAXBElement<NUUOCamera> createNUUOCamera(NUUOCamera value) {
        return new JAXBElement<>(_NUUOCamera_QNAME, NUUOCamera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrassirIntegrationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrassirIntegrationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", name = "TrassirIntegrationResult")
    public JAXBElement<TrassirIntegrationResult> createTrassirIntegrationResult(TrassirIntegrationResult value) {
        return new JAXBElement<>(_TrassirIntegrationResult_QNAME, TrassirIntegrationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTrassirServerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTrassirServerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", name = "ArrayOfTrassirServerInfo")
    public JAXBElement<ArrayOfTrassirServerInfo> createArrayOfTrassirServerInfo(ArrayOfTrassirServerInfo value) {
        return new JAXBElement<>(_ArrayOfTrassirServerInfo_QNAME, ArrayOfTrassirServerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrassirServerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrassirServerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", name = "TrassirServerInfo")
    public JAXBElement<TrassirServerInfo> createTrassirServerInfo(TrassirServerInfo value) {
        return new JAXBElement<>(_TrassirServerInfo_QNAME, TrassirServerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTrassirChannelInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTrassirChannelInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", name = "ArrayOfTrassirChannelInfo")
    public JAXBElement<ArrayOfTrassirChannelInfo> createArrayOfTrassirChannelInfo(ArrayOfTrassirChannelInfo value) {
        return new JAXBElement<>(_ArrayOfTrassirChannelInfo_QNAME, ArrayOfTrassirChannelInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrassirChannelInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrassirChannelInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", name = "TrassirChannelInfo")
    public JAXBElement<TrassirChannelInfo> createTrassirChannelInfo(TrassirChannelInfo value) {
        return new JAXBElement<>(_TrassirChannelInfo_QNAME, TrassirChannelInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdisConfiguration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdisConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Idis", name = "IdisConfiguration")
    public JAXBElement<IdisConfiguration> createIdisConfiguration(IdisConfiguration value) {
        return new JAXBElement<>(_IdisConfiguration_QNAME, IdisConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IvideonCameraCollectionResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IvideonCameraCollectionResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Ivideon", name = "IvideonCameraCollectionResult")
    public JAXBElement<IvideonCameraCollectionResult> createIvideonCameraCollectionResult(IvideonCameraCollectionResult value) {
        return new JAXBElement<>(_IvideonCameraCollectionResult_QNAME, IvideonCameraCollectionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IvideonRemoteServerCollectionResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IvideonRemoteServerCollectionResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Ivideon", name = "IvideonRemoteServerCollectionResult")
    public JAXBElement<IvideonRemoteServerCollectionResult> createIvideonRemoteServerCollectionResult(IvideonRemoteServerCollectionResult value) {
        return new JAXBElement<>(_IvideonRemoteServerCollectionResult_QNAME, IvideonRemoteServerCollectionResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLPRCameraResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindLPRCameraResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.LPRCamera", name = "FindLPRCameraResult")
    public JAXBElement<FindLPRCameraResult> createFindLPRCameraResult(FindLPRCameraResult value) {
        return new JAXBElement<>(_FindLPRCameraResult_QNAME, FindLPRCameraResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLPRCameraInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLPRCameraInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.LPRCamera", name = "ArrayOfLPRCameraInfo")
    public JAXBElement<ArrayOfLPRCameraInfo> createArrayOfLPRCameraInfo(ArrayOfLPRCameraInfo value) {
        return new JAXBElement<>(_ArrayOfLPRCameraInfo_QNAME, ArrayOfLPRCameraInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LPRCameraInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LPRCameraInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.LPRCamera", name = "LPRCameraInfo")
    public JAXBElement<LPRCameraInfo> createLPRCameraInfo(LPRCameraInfo value) {
        return new JAXBElement<>(_LPRCameraInfo_QNAME, LPRCameraInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindConvertersResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindConvertersResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "FindConvertersResult")
    public JAXBElement<FindConvertersResult> createFindConvertersResult(FindConvertersResult value) {
        return new JAXBElement<>(_FindConvertersResult_QNAME, FindConvertersResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCanConverterAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCanConverterAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "ArrayOfCanConverterAddress")
    public JAXBElement<ArrayOfCanConverterAddress> createArrayOfCanConverterAddress(ArrayOfCanConverterAddress value) {
        return new JAXBElement<>(_ArrayOfCanConverterAddress_QNAME, ArrayOfCanConverterAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanConverterAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanConverterAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "CanConverterAddress")
    public JAXBElement<CanConverterAddress> createCanConverterAddress(CanConverterAddress value) {
        return new JAXBElement<>(_CanConverterAddress_QNAME, CanConverterAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanConverterAddressTagEnum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanConverterAddressTagEnum }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "CanConverterAddress.TagEnum")
    public JAXBElement<CanConverterAddressTagEnum> createCanConverterAddressTagEnum(CanConverterAddressTagEnum value) {
        return new JAXBElement<>(_CanConverterAddressTagEnum_QNAME, CanConverterAddressTagEnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsbCanConverterAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsbCanConverterAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "UsbCanConverterAddress")
    public JAXBElement<UsbCanConverterAddress> createUsbCanConverterAddress(UsbCanConverterAddress value) {
        return new JAXBElement<>(_UsbCanConverterAddress_QNAME, UsbCanConverterAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLanCanConverter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLanCanConverter }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "ArrayOfLanCanConverter")
    public JAXBElement<ArrayOfLanCanConverter> createArrayOfLanCanConverter(ArrayOfLanCanConverter value) {
        return new JAXBElement<>(_ArrayOfLanCanConverter_QNAME, ArrayOfLanCanConverter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanCanConverter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LanCanConverter }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "LanCanConverter")
    public JAXBElement<LanCanConverter> createLanCanConverter(LanCanConverter value) {
        return new JAXBElement<>(_LanCanConverter_QNAME, LanCanConverter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindControllersResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindControllersResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "FindControllersResult")
    public JAXBElement<FindControllersResult> createFindControllersResult(FindControllersResult value) {
        return new JAXBElement<>(_FindControllersResult_QNAME, FindControllersResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCanDeviceInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCanDeviceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "ArrayOfCanDeviceInfo")
    public JAXBElement<ArrayOfCanDeviceInfo> createArrayOfCanDeviceInfo(ArrayOfCanDeviceInfo value) {
        return new JAXBElement<>(_ArrayOfCanDeviceInfo_QNAME, ArrayOfCanDeviceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanDeviceInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanDeviceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "CanDeviceInfo")
    public JAXBElement<CanDeviceInfo> createCanDeviceInfo(CanDeviceInfo value) {
        return new JAXBElement<>(_CanDeviceInfo_QNAME, CanDeviceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanDeviceNetConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanDeviceNetConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "CanDeviceNetConfig")
    public JAXBElement<CanDeviceNetConfig> createCanDeviceNetConfig(CanDeviceNetConfig value) {
        return new JAXBElement<>(_CanDeviceNetConfig_QNAME, CanDeviceNetConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFindControllersResultFailedConverterInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFindControllersResultFailedConverterInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "ArrayOfFindControllersResult.FailedConverterInfo")
    public JAXBElement<ArrayOfFindControllersResultFailedConverterInfo> createArrayOfFindControllersResultFailedConverterInfo(ArrayOfFindControllersResultFailedConverterInfo value) {
        return new JAXBElement<>(_ArrayOfFindControllersResultFailedConverterInfo_QNAME, ArrayOfFindControllersResultFailedConverterInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindControllersResultFailedConverterInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindControllersResultFailedConverterInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "FindControllersResult.FailedConverterInfo")
    public JAXBElement<FindControllersResultFailedConverterInfo> createFindControllersResultFailedConverterInfo(FindControllersResultFailedConverterInfo value) {
        return new JAXBElement<>(_FindControllersResultFailedConverterInfo_QNAME, FindControllersResultFailedConverterInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCanDeviceNetConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCanDeviceNetConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "ArrayOfCanDeviceNetConfig")
    public JAXBElement<ArrayOfCanDeviceNetConfig> createArrayOfCanDeviceNetConfig(ArrayOfCanDeviceNetConfig value) {
        return new JAXBElement<>(_ArrayOfCanDeviceNetConfig_QNAME, ArrayOfCanDeviceNetConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDevicesAddressBySidResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetDevicesAddressBySidResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "SetDevicesAddressBySidResult")
    public JAXBElement<SetDevicesAddressBySidResult> createSetDevicesAddressBySidResult(SetDevicesAddressBySidResult value) {
        return new JAXBElement<>(_SetDevicesAddressBySidResult_QNAME, SetDevicesAddressBySidResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSetDevicesAddressBySidResultFailedAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSetDevicesAddressBySidResultFailedAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "ArrayOfSetDevicesAddressBySidResult.FailedAddress")
    public JAXBElement<ArrayOfSetDevicesAddressBySidResultFailedAddress> createArrayOfSetDevicesAddressBySidResultFailedAddress(ArrayOfSetDevicesAddressBySidResultFailedAddress value) {
        return new JAXBElement<>(_ArrayOfSetDevicesAddressBySidResultFailedAddress_QNAME, ArrayOfSetDevicesAddressBySidResultFailedAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDevicesAddressBySidResultFailedAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetDevicesAddressBySidResultFailedAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "SetDevicesAddressBySidResult.FailedAddress")
    public JAXBElement<SetDevicesAddressBySidResultFailedAddress> createSetDevicesAddressBySidResultFailedAddress(SetDevicesAddressBySidResultFailedAddress value) {
        return new JAXBElement<>(_SetDevicesAddressBySidResultFailedAddress_QNAME, SetDevicesAddressBySidResultFailedAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetControllerConfigurationsResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetControllerConfigurationsResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "GetControllerConfigurationsResult")
    public JAXBElement<GetControllerConfigurationsResult> createGetControllerConfigurationsResult(GetControllerConfigurationsResult value) {
        return new JAXBElement<>(_GetControllerConfigurationsResult_QNAME, GetControllerConfigurationsResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGetControllerConfigurationsResultConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfGetControllerConfigurationsResultConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "ArrayOfGetControllerConfigurationsResult.Config")
    public JAXBElement<ArrayOfGetControllerConfigurationsResultConfig> createArrayOfGetControllerConfigurationsResultConfig(ArrayOfGetControllerConfigurationsResultConfig value) {
        return new JAXBElement<>(_ArrayOfGetControllerConfigurationsResultConfig_QNAME, ArrayOfGetControllerConfigurationsResultConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetControllerConfigurationsResultConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetControllerConfigurationsResultConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "GetControllerConfigurationsResult.Config")
    public JAXBElement<GetControllerConfigurationsResultConfig> createGetControllerConfigurationsResultConfig(GetControllerConfigurationsResultConfig value) {
        return new JAXBElement<>(_GetControllerConfigurationsResultConfig_QNAME, GetControllerConfigurationsResultConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGetControllerConfigurationsResultFailedConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfGetControllerConfigurationsResultFailedConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "ArrayOfGetControllerConfigurationsResult.FailedConfig")
    public JAXBElement<ArrayOfGetControllerConfigurationsResultFailedConfig> createArrayOfGetControllerConfigurationsResultFailedConfig(ArrayOfGetControllerConfigurationsResultFailedConfig value) {
        return new JAXBElement<>(_ArrayOfGetControllerConfigurationsResultFailedConfig_QNAME, ArrayOfGetControllerConfigurationsResultFailedConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetControllerConfigurationsResultFailedConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetControllerConfigurationsResultFailedConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "GetControllerConfigurationsResult.FailedConfig")
    public JAXBElement<GetControllerConfigurationsResultFailedConfig> createGetControllerConfigurationsResultFailedConfig(GetControllerConfigurationsResultFailedConfig value) {
        return new JAXBElement<>(_GetControllerConfigurationsResultFailedConfig_QNAME, GetControllerConfigurationsResultFailedConfig.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "IpAddress", scope = LanCanConverterAddress.class)
    public JAXBElement<String> createLanCanConverterAddressIpAddress(String value) {
        return new JAXBElement<>(_LanCanConverterAddressIpAddress_QNAME, String.class, LanCanConverterAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "Error", scope = GetControllerConfigurationsResultFailedConfig.class)
    public JAXBElement<String> createGetControllerConfigurationsResultFailedConfigError(String value) {
        return new JAXBElement<>(_GetControllerConfigurationsResultFailedConfigError_QNAME, String.class, GetControllerConfigurationsResultFailedConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanDeviceNetConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanDeviceNetConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "NetConfig", scope = GetControllerConfigurationsResultFailedConfig.class)
    public JAXBElement<CanDeviceNetConfig> createGetControllerConfigurationsResultFailedConfigNetConfig(CanDeviceNetConfig value) {
        return new JAXBElement<>(_GetControllerConfigurationsResultFailedConfigNetConfig_QNAME, CanDeviceNetConfig.class, GetControllerConfigurationsResultFailedConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriverFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriverFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "Configuration", scope = GetControllerConfigurationsResultConfig.class)
    public JAXBElement<ArrayOfLDriverFullInfo> createGetControllerConfigurationsResultConfigConfiguration(ArrayOfLDriverFullInfo value) {
        return new JAXBElement<>(_GetControllerConfigurationsResultConfigConfiguration_QNAME, ArrayOfLDriverFullInfo.class, GetControllerConfigurationsResultConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanDeviceNetConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanDeviceNetConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "NetConfig", scope = GetControllerConfigurationsResultConfig.class)
    public JAXBElement<CanDeviceNetConfig> createGetControllerConfigurationsResultConfigNetConfig(CanDeviceNetConfig value) {
        return new JAXBElement<>(_GetControllerConfigurationsResultFailedConfigNetConfig_QNAME, CanDeviceNetConfig.class, GetControllerConfigurationsResultConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "Error", scope = SetDevicesAddressBySidResultFailedAddress.class)
    public JAXBElement<String> createSetDevicesAddressBySidResultFailedAddressError(String value) {
        return new JAXBElement<>(_GetControllerConfigurationsResultFailedConfigError_QNAME, String.class, SetDevicesAddressBySidResultFailedAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanDeviceNetConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanDeviceNetConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "NetConfig", scope = SetDevicesAddressBySidResultFailedAddress.class)
    public JAXBElement<CanDeviceNetConfig> createSetDevicesAddressBySidResultFailedAddressNetConfig(CanDeviceNetConfig value) {
        return new JAXBElement<>(_GetControllerConfigurationsResultFailedConfigNetConfig_QNAME, CanDeviceNetConfig.class, SetDevicesAddressBySidResultFailedAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanConverterAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanConverterAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "ConverterAddress", scope = FindControllersResultFailedConverterInfo.class)
    public JAXBElement<CanConverterAddress> createFindControllersResultFailedConverterInfoConverterAddress(CanConverterAddress value) {
        return new JAXBElement<>(_FindControllersResultFailedConverterInfoConverterAddress_QNAME, CanConverterAddress.class, FindControllersResultFailedConverterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "Error", scope = FindControllersResultFailedConverterInfo.class)
    public JAXBElement<String> createFindControllersResultFailedConverterInfoError(String value) {
        return new JAXBElement<>(_GetControllerConfigurationsResultFailedConfigError_QNAME, String.class, FindControllersResultFailedConverterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanConverterAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanConverterAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "ConverterAddress", scope = CanDeviceNetConfig.class)
    public JAXBElement<CanConverterAddress> createCanDeviceNetConfigConverterAddress(CanConverterAddress value) {
        return new JAXBElement<>(_FindControllersResultFailedConverterInfoConverterAddress_QNAME, CanConverterAddress.class, CanDeviceNetConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LDriverFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LDriverFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "DriverFullInfo", scope = CanDeviceNetConfig.class)
    public JAXBElement<LDriverFullInfo> createCanDeviceNetConfigDriverFullInfo(LDriverFullInfo value) {
        return new JAXBElement<>(_CanDeviceNetConfigDriverFullInfo_QNAME, LDriverFullInfo.class, CanDeviceNetConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "HardwareType", scope = CanDeviceNetConfig.class)
    public JAXBElement<String> createCanDeviceNetConfigHardwareType(String value) {
        return new JAXBElement<>(_CanDeviceNetConfigHardwareType_QNAME, String.class, CanDeviceNetConfig.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "Error", scope = CanDeviceInfo.class)
    public JAXBElement<String> createCanDeviceInfoError(String value) {
        return new JAXBElement<>(_GetControllerConfigurationsResultFailedConfigError_QNAME, String.class, CanDeviceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "Name", scope = CanDeviceInfo.class)
    public JAXBElement<String> createCanDeviceInfoName(String value) {
        return new JAXBElement<>(_CanDeviceInfoName_QNAME, String.class, CanDeviceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanDeviceNetConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CanDeviceNetConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "NetConfig", scope = CanDeviceInfo.class)
    public JAXBElement<CanDeviceNetConfig> createCanDeviceInfoNetConfig(CanDeviceNetConfig value) {
        return new JAXBElement<>(_GetControllerConfigurationsResultFailedConfigNetConfig_QNAME, CanDeviceNetConfig.class, CanDeviceInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "SerialNumber", scope = UsbCanConverterAddress.class)
    public JAXBElement<String> createUsbCanConverterAddressSerialNumber(String value) {
        return new JAXBElement<>(_UsbCanConverterAddressSerialNumber_QNAME, String.class, UsbCanConverterAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "Vendor", scope = UsbCanConverterAddress.class)
    public JAXBElement<String> createUsbCanConverterAddressVendor(String value) {
        return new JAXBElement<>(_UsbCanConverterAddressVendor_QNAME, String.class, UsbCanConverterAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanCanConverterAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LanCanConverterAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "LanCanConverterAddress", scope = CanConverterAddress.class)
    public JAXBElement<LanCanConverterAddress> createCanConverterAddressLanCanConverterAddress(LanCanConverterAddress value) {
        return new JAXBElement<>(_CanConverterAddressLanCanConverterAddress_QNAME, LanCanConverterAddress.class, CanConverterAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UsbCanConverterAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UsbCanConverterAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "UsbCanConverterAddress", scope = CanConverterAddress.class)
    public JAXBElement<UsbCanConverterAddress> createCanConverterAddressUsbCanConverterAddress(UsbCanConverterAddress value) {
        return new JAXBElement<>(_UsbCanConverterAddress_QNAME, UsbCanConverterAddress.class, CanConverterAddress.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.LPRCamera", name = "IPAddress", scope = LPRCameraInfo.class)
    public JAXBElement<String> createLPRCameraInfoIPAddress(String value) {
        return new JAXBElement<>(_LPRCameraInfoIPAddress_QNAME, String.class, LPRCameraInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.LPRCamera", name = "MacAddress", scope = LPRCameraInfo.class)
    public JAXBElement<String> createLPRCameraInfoMacAddress(String value) {
        return new JAXBElement<>(_LPRCameraInfoMacAddress_QNAME, String.class, LPRCameraInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", name = "Name", scope = TrassirChannelInfo.class)
    public JAXBElement<String> createTrassirChannelInfoName(String value) {
        return new JAXBElement<>(_TrassirChannelInfoName_QNAME, String.class, TrassirChannelInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", name = "TrassirID", scope = TrassirChannelInfo.class)
    public JAXBElement<String> createTrassirChannelInfoTrassirID(String value) {
        return new JAXBElement<>(_TrassirChannelInfoTrassirID_QNAME, String.class, TrassirChannelInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTrassirChannelInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTrassirChannelInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", name = "Channels", scope = TrassirServerInfo.class)
    public JAXBElement<ArrayOfTrassirChannelInfo> createTrassirServerInfoChannels(ArrayOfTrassirChannelInfo value) {
        return new JAXBElement<>(_TrassirServerInfoChannels_QNAME, ArrayOfTrassirChannelInfo.class, TrassirServerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", name = "Name", scope = TrassirServerInfo.class)
    public JAXBElement<String> createTrassirServerInfoName(String value) {
        return new JAXBElement<>(_TrassirChannelInfoName_QNAME, String.class, TrassirServerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", name = "TrassirID", scope = TrassirServerInfo.class)
    public JAXBElement<String> createTrassirServerInfoTrassirID(String value) {
        return new JAXBElement<>(_TrassirChannelInfoTrassirID_QNAME, String.class, TrassirServerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", name = "Description", scope = NUUOCamera.class)
    public JAXBElement<String> createNUUOCameraDescription(String value) {
        return new JAXBElement<>(_NUUOCameraDescription_QNAME, String.class, NUUOCamera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", name = "Name", scope = NUUOCamera.class)
    public JAXBElement<String> createNUUOCameraName(String value) {
        return new JAXBElement<>(_NUUOCameraName_QNAME, String.class, NUUOCamera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNUUOCamera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNUUOCamera }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", name = "Cameras", scope = NUUOVideoRecorder.class)
    public JAXBElement<ArrayOfNUUOCamera> createNUUOVideoRecorderCameras(ArrayOfNUUOCamera value) {
        return new JAXBElement<>(_NUUOVideoRecorderCameras_QNAME, ArrayOfNUUOCamera.class, NUUOVideoRecorder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", name = "Description", scope = NUUOVideoRecorder.class)
    public JAXBElement<String> createNUUOVideoRecorderDescription(String value) {
        return new JAXBElement<>(_NUUOCameraDescription_QNAME, String.class, NUUOVideoRecorder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", name = "Name", scope = NUUOVideoRecorder.class)
    public JAXBElement<String> createNUUOVideoRecorderName(String value) {
        return new JAXBElement<>(_NUUOCameraName_QNAME, String.class, NUUOVideoRecorder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", name = "Name", scope = NUUOArchiveServer.class)
    public JAXBElement<String> createNUUOArchiveServerName(String value) {
        return new JAXBElement<>(_NUUOCameraName_QNAME, String.class, NUUOArchiveServer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNUUOVideoRecorder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNUUOVideoRecorder }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", name = "VideoRecorders", scope = NUUOArchiveServer.class)
    public JAXBElement<ArrayOfNUUOVideoRecorder> createNUUOArchiveServerVideoRecorders(ArrayOfNUUOVideoRecorder value) {
        return new JAXBElement<>(_NUUOArchiveServerVideoRecorders_QNAME, ArrayOfNUUOVideoRecorder.class, NUUOArchiveServer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", name = "Comment", scope = NTechLabDossierListInfo.class)
    public JAXBElement<String> createNTechLabDossierListInfoComment(String value) {
        return new JAXBElement<>(_NTechLabDossierListInfoComment_QNAME, String.class, NTechLabDossierListInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", name = "Name", scope = NTechLabDossierListInfo.class)
    public JAXBElement<String> createNTechLabDossierListInfoName(String value) {
        return new JAXBElement<>(_NTechLabDossierListInfoName_QNAME, String.class, NTechLabDossierListInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", name = "Comment", scope = NTechLabCameraInfo.class)
    public JAXBElement<String> createNTechLabCameraInfoComment(String value) {
        return new JAXBElement<>(_NTechLabDossierListInfoComment_QNAME, String.class, NTechLabCameraInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", name = "Name", scope = NTechLabCameraInfo.class)
    public JAXBElement<String> createNTechLabCameraInfoName(String value) {
        return new JAXBElement<>(_NTechLabDossierListInfoName_QNAME, String.class, NTechLabCameraInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", name = "Url", scope = NTechLabCameraInfo.class)
    public JAXBElement<String> createNTechLabCameraInfoUrl(String value) {
        return new JAXBElement<>(_NTechLabCameraInfoUrl_QNAME, String.class, NTechLabCameraInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.BasIp", name = "IpAddress", scope = BasIpIntercomInfo.class)
    public JAXBElement<String> createBasIpIntercomInfoIpAddress(String value) {
        return new JAXBElement<>(_BasIpIntercomInfoIpAddress_QNAME, String.class, BasIpIntercomInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "KeyName", scope = SlotInfo.class)
    public JAXBElement<String> createSlotInfoKeyName(String value) {
        return new JAXBElement<>(_SlotInfoKeyName_QNAME, String.class, SlotInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "KeyCabinetId", scope = KeyKeeperPort.class)
    public JAXBElement<Long> createKeyKeeperPortKeyCabinetId(Long value) {
        return new JAXBElement<>(_KeyKeeperPortKeyCabinetId_QNAME, Long.class, KeyKeeperPort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "Name", scope = KeyKeeperPort.class)
    public JAXBElement<String> createKeyKeeperPortName(String value) {
        return new JAXBElement<>(_KeyKeeperPortName_QNAME, String.class, KeyKeeperPort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "PoBoxId", scope = KeyKeeperPort.class)
    public JAXBElement<Long> createKeyKeeperPortPoBoxId(Long value) {
        return new JAXBElement<>(_KeyKeeperPortPoBoxId_QNAME, Long.class, KeyKeeperPort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "Comment", scope = KeyKeeperCabinet.class)
    public JAXBElement<String> createKeyKeeperCabinetComment(String value) {
        return new JAXBElement<>(_KeyKeeperCabinetComment_QNAME, String.class, KeyKeeperCabinet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "ExternalID", scope = KeyKeeperCabinet.class)
    public JAXBElement<String> createKeyKeeperCabinetExternalID(String value) {
        return new JAXBElement<>(_KeyKeeperCabinetExternalID_QNAME, String.class, KeyKeeperCabinet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "Name", scope = KeyKeeperCabinet.class)
    public JAXBElement<String> createKeyKeeperCabinetName(String value) {
        return new JAXBElement<>(_KeyKeeperPortName_QNAME, String.class, KeyKeeperCabinet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "NTP1", scope = KeyKeeperConfiguration.class)
    public JAXBElement<String> createKeyKeeperConfigurationNTP1(String value) {
        return new JAXBElement<>(_KeyKeeperConfigurationNTP1_QNAME, String.class, KeyKeeperConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "NTP2", scope = KeyKeeperConfiguration.class)
    public JAXBElement<String> createKeyKeeperConfigurationNTP2(String value) {
        return new JAXBElement<>(_KeyKeeperConfigurationNTP2_QNAME, String.class, KeyKeeperConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "NTP3", scope = KeyKeeperConfiguration.class)
    public JAXBElement<String> createKeyKeeperConfigurationNTP3(String value) {
        return new JAXBElement<>(_KeyKeeperConfigurationNTP3_QNAME, String.class, KeyKeeperConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "TimeZone", scope = KeyKeeperConfiguration.class)
    public JAXBElement<String> createKeyKeeperConfigurationTimeZone(String value) {
        return new JAXBElement<>(_KeyKeeperConfigurationTimeZone_QNAME, String.class, KeyKeeperConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "IsOpened", scope = CellInfo.class)
    public JAXBElement<Boolean> createCellInfoIsOpened(Boolean value) {
        return new JAXBElement<>(_CellInfoIsOpened_QNAME, Boolean.class, CellInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCellInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCellInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "Cells", scope = RelayBlockStatus.class)
    public JAXBElement<ArrayOfCellInfo> createRelayBlockStatusCells(ArrayOfCellInfo value) {
        return new JAXBElement<>(_RelayBlockStatusCells_QNAME, ArrayOfCellInfo.class, RelayBlockStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGetControllerConfigurationsResultConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfGetControllerConfigurationsResultConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "Configurations", scope = GetControllerConfigurationsResult.class)
    public JAXBElement<ArrayOfGetControllerConfigurationsResultConfig> createGetControllerConfigurationsResultConfigurations(ArrayOfGetControllerConfigurationsResultConfig value) {
        return new JAXBElement<>(_GetControllerConfigurationsResultConfigurations_QNAME, ArrayOfGetControllerConfigurationsResultConfig.class, GetControllerConfigurationsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGetControllerConfigurationsResultFailedConfig }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfGetControllerConfigurationsResultFailedConfig }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "FailedDevices", scope = GetControllerConfigurationsResult.class)
    public JAXBElement<ArrayOfGetControllerConfigurationsResultFailedConfig> createGetControllerConfigurationsResultFailedDevices(ArrayOfGetControllerConfigurationsResultFailedConfig value) {
        return new JAXBElement<>(_GetControllerConfigurationsResultFailedDevices_QNAME, ArrayOfGetControllerConfigurationsResultFailedConfig.class, GetControllerConfigurationsResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSetDevicesAddressBySidResultFailedAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSetDevicesAddressBySidResultFailedAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "FailedDevices", scope = SetDevicesAddressBySidResult.class)
    public JAXBElement<ArrayOfSetDevicesAddressBySidResultFailedAddress> createSetDevicesAddressBySidResultFailedDevices(ArrayOfSetDevicesAddressBySidResultFailedAddress value) {
        return new JAXBElement<>(_GetControllerConfigurationsResultFailedDevices_QNAME, ArrayOfSetDevicesAddressBySidResultFailedAddress.class, SetDevicesAddressBySidResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCanDeviceInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCanDeviceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "Controllers", scope = FindControllersResult.class)
    public JAXBElement<ArrayOfCanDeviceInfo> createFindControllersResultControllers(ArrayOfCanDeviceInfo value) {
        return new JAXBElement<>(_FindControllersResultControllers_QNAME, ArrayOfCanDeviceInfo.class, FindControllersResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCanDeviceInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCanDeviceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "FailedControllers", scope = FindControllersResult.class)
    public JAXBElement<ArrayOfCanDeviceInfo> createFindControllersResultFailedControllers(ArrayOfCanDeviceInfo value) {
        return new JAXBElement<>(_FindControllersResultFailedControllers_QNAME, ArrayOfCanDeviceInfo.class, FindControllersResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFindControllersResultFailedConverterInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFindControllersResultFailedConverterInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "FailedConverters", scope = FindControllersResult.class)
    public JAXBElement<ArrayOfFindControllersResultFailedConverterInfo> createFindControllersResultFailedConverters(ArrayOfFindControllersResultFailedConverterInfo value) {
        return new JAXBElement<>(_FindControllersResultFailedConverters_QNAME, ArrayOfFindControllersResultFailedConverterInfo.class, FindControllersResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "Gateway", scope = LanCanConverter.class)
    public JAXBElement<String> createLanCanConverterGateway(String value) {
        return new JAXBElement<>(_LanCanConverterGateway_QNAME, String.class, LanCanConverter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "HardwareType", scope = LanCanConverter.class)
    public JAXBElement<String> createLanCanConverterHardwareType(String value) {
        return new JAXBElement<>(_CanDeviceNetConfigHardwareType_QNAME, String.class, LanCanConverter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "Mask", scope = LanCanConverter.class)
    public JAXBElement<String> createLanCanConverterMask(String value) {
        return new JAXBElement<>(_LanCanConverterMask_QNAME, String.class, LanCanConverter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCanConverterAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCanConverterAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "Converters", scope = FindConvertersResult.class)
    public JAXBElement<ArrayOfCanConverterAddress> createFindConvertersResultConverters(ArrayOfCanConverterAddress value) {
        return new JAXBElement<>(_FindConvertersResultConverters_QNAME, ArrayOfCanConverterAddress.class, FindConvertersResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.CanDriversViaUsbConverter", name = "MissingDrivers", scope = FindConvertersResult.class)
    public JAXBElement<ArrayOfstring> createFindConvertersResultMissingDrivers(ArrayOfstring value) {
        return new JAXBElement<>(_FindConvertersResultMissingDrivers_QNAME, ArrayOfstring.class, FindConvertersResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLPRCameraInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLPRCameraInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.LPRCamera", name = "FoundCameras", scope = FindLPRCameraResult.class)
    public JAXBElement<ArrayOfLPRCameraInfo> createFindLPRCameraResultFoundCameras(ArrayOfLPRCameraInfo value) {
        return new JAXBElement<>(_FindLPRCameraResultFoundCameras_QNAME, ArrayOfLPRCameraInfo.class, FindLPRCameraResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBasIpIntercomInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBasIpIntercomInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.BasIp", name = "FoudIntercoms", scope = FindBasIpIntercomResult.class)
    public JAXBElement<ArrayOfBasIpIntercomInfo> createFindBasIpIntercomResultFoudIntercoms(ArrayOfBasIpIntercomInfo value) {
        return new JAXBElement<>(_FindBasIpIntercomResultFoudIntercoms_QNAME, ArrayOfBasIpIntercomInfo.class, FindBasIpIntercomResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriverFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriverFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Ivideon", name = "DriverFullInfo", scope = IvideonRemoteServerCollectionResult.class)
    public JAXBElement<ArrayOfLDriverFullInfo> createIvideonRemoteServerCollectionResultDriverFullInfo(ArrayOfLDriverFullInfo value) {
        return new JAXBElement<>(_IvideonRemoteServerCollectionResultDriverFullInfo_QNAME, ArrayOfLDriverFullInfo.class, IvideonRemoteServerCollectionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriverFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriverFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Ivideon", name = "DriverFullInfo", scope = IvideonCameraCollectionResult.class)
    public JAXBElement<ArrayOfLDriverFullInfo> createIvideonCameraCollectionResultDriverFullInfo(ArrayOfLDriverFullInfo value) {
        return new JAXBElement<>(_IvideonRemoteServerCollectionResultDriverFullInfo_QNAME, ArrayOfLDriverFullInfo.class, IvideonCameraCollectionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Idis", name = "ChannelNames", scope = IdisConfiguration.class)
    public JAXBElement<ArrayOfstring> createIdisConfigurationChannelNames(ArrayOfstring value) {
        return new JAXBElement<>(_IdisConfigurationChannelNames_QNAME, ArrayOfstring.class, IdisConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Idis", name = "ModelName", scope = IdisConfiguration.class)
    public JAXBElement<String> createIdisConfigurationModelName(String value) {
        return new JAXBElement<>(_IdisConfigurationModelName_QNAME, String.class, IdisConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Idis", name = "SoftwareVersion", scope = IdisConfiguration.class)
    public JAXBElement<String> createIdisConfigurationSoftwareVersion(String value) {
        return new JAXBElement<>(_IdisConfigurationSoftwareVersion_QNAME, String.class, IdisConfiguration.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTrassirServerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTrassirServerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Trassir", name = "Servers", scope = TrassirIntegrationResult.class)
    public JAXBElement<ArrayOfTrassirServerInfo> createTrassirIntegrationResultServers(ArrayOfTrassirServerInfo value) {
        return new JAXBElement<>(_TrassirIntegrationResultServers_QNAME, ArrayOfTrassirServerInfo.class, TrassirIntegrationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNUUOArchiveServer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNUUOArchiveServer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NUUO", name = "ArchiveServers", scope = NUUOArchiveServerCollectionResult.class)
    public JAXBElement<ArrayOfNUUOArchiveServer> createNUUOArchiveServerCollectionResultArchiveServers(ArrayOfNUUOArchiveServer value) {
        return new JAXBElement<>(_NUUOArchiveServerCollectionResultArchiveServers_QNAME, ArrayOfNUUOArchiveServer.class, NUUOArchiveServerCollectionResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "Message", scope = KeyKeeperCommandResult.class)
    public JAXBElement<String> createKeyKeeperCommandResultMessage(String value) {
        return new JAXBElement<>(_KeyKeeperCommandResultMessage_QNAME, String.class, KeyKeeperCommandResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "CabinetID", scope = RoomKeyInfo.class)
    public JAXBElement<String> createRoomKeyInfoCabinetID(String value) {
        return new JAXBElement<>(_RoomKeyInfoCabinetID_QNAME, String.class, RoomKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "CabinetName", scope = RoomKeyInfo.class)
    public JAXBElement<String> createRoomKeyInfoCabinetName(String value) {
        return new JAXBElement<>(_RoomKeyInfoCabinetName_QNAME, String.class, RoomKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "ControllerName", scope = RoomKeyInfo.class)
    public JAXBElement<String> createRoomKeyInfoControllerName(String value) {
        return new JAXBElement<>(_RoomKeyInfoControllerName_QNAME, String.class, RoomKeyInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSlotInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSlotInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "SlotsStatus", scope = CabinetStatus.class)
    public JAXBElement<ArrayOfSlotInfo> createCabinetStatusSlotsStatus(ArrayOfSlotInfo value) {
        return new JAXBElement<>(_CabinetStatusSlotsStatus_QNAME, ArrayOfSlotInfo.class, CabinetStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeyKeeperConfiguration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KeyKeeperConfiguration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "Configuration", scope = KeyKeeperControllerResult.class)
    public JAXBElement<KeyKeeperConfiguration> createKeyKeeperControllerResultConfiguration(KeyKeeperConfiguration value) {
        return new JAXBElement<>(_KeyKeeperControllerResultConfiguration_QNAME, KeyKeeperConfiguration.class, KeyKeeperControllerResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyKeeperCabinet }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyKeeperCabinet }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "KeyKeeperCabinets", scope = KeyKeeperControllerResult.class)
    public JAXBElement<ArrayOfKeyKeeperCabinet> createKeyKeeperControllerResultKeyKeeperCabinets(ArrayOfKeyKeeperCabinet value) {
        return new JAXBElement<>(_KeyKeeperControllerResultKeyKeeperCabinets_QNAME, ArrayOfKeyKeeperCabinet.class, KeyKeeperControllerResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyKeeperPort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyKeeperPort }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.KeyKeeper", name = "KeyKeeperPorts", scope = KeyKeeperControllerResult.class)
    public JAXBElement<ArrayOfKeyKeeperPort> createKeyKeeperControllerResultKeyKeeperPorts(ArrayOfKeyKeeperPort value) {
        return new JAXBElement<>(_KeyKeeperControllerResultKeyKeeperPorts_QNAME, ArrayOfKeyKeeperPort.class, KeyKeeperControllerResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNTechLabCameraInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNTechLabCameraInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", name = "Cameras", scope = NTechLabRecognitionServiceResult.class)
    public JAXBElement<ArrayOfNTechLabCameraInfo> createNTechLabRecognitionServiceResultCameras(ArrayOfNTechLabCameraInfo value) {
        return new JAXBElement<>(_NTechLabRecognitionServiceResultCameras_QNAME, ArrayOfNTechLabCameraInfo.class, NTechLabRecognitionServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNTechLabDossierListInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNTechLabDossierListInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.NTechLab", name = "DossierLists", scope = NTechLabRecognitionServiceResult.class)
    public JAXBElement<ArrayOfNTechLabDossierListInfo> createNTechLabRecognitionServiceResultDossierLists(ArrayOfNTechLabDossierListInfo value) {
        return new JAXBElement<>(_NTechLabRecognitionServiceResultDossierLists_QNAME, ArrayOfNTechLabDossierListInfo.class, NTechLabRecognitionServiceResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriverFullInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriverFullInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Driver.Panasonic", name = "DriverFullInfo", scope = PanasonicCameraCollectionResult.class)
    public JAXBElement<ArrayOfLDriverFullInfo> createPanasonicCameraCollectionResultDriverFullInfo(ArrayOfLDriverFullInfo value) {
        return new JAXBElement<>(_PanasonicCameraCollectionResultDriverFullInfo_QNAME, ArrayOfLDriverFullInfo.class, PanasonicCameraCollectionResult.class, value);
    }

}
