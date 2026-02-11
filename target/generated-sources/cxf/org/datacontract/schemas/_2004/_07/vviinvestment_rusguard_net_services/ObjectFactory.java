
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_net_services;

import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.ArrayOfAccessPoint2CameraChain;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.ArrayOfLDriverAdded;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.ArrayOfLNetworkAdded;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.ArrayOfLOperationResult;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.ArrayOfLResourceInfo;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.ArrayOfLResourceProperty;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.ArrayOfLServerAdded;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.vviinvestment_rusguard_net_services package. 
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

    private static final QName _LNetworkChanges_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "LNetworkChanges");
    private static final QName _ArrayOfLLinkChanged_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "ArrayOfLLinkChanged");
    private static final QName _LLinkChanged_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "LLinkChanged");
    private static final QName _Operation_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "Operation");
    private static final QName _DeviceOperation_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "DeviceOperation");
    private static final QName _DeviceCallMethodOperation_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "DeviceCallMethodOperation");
    private static final QName _ArrayOfLResourcePropertyValues_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "ArrayOfLResourcePropertyValues");
    private static final QName _LResourcePropertyValues_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "LResourcePropertyValues");
    private static final QName _ArrayOfLPropertyValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "ArrayOfLPropertyValue");
    private static final QName _ArrayOfDeviceDriverInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "ArrayOfDeviceDriverInfo");
    private static final QName _DeviceDriverInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "DeviceDriverInfo");
    private static final QName _ArrayOfPropertyValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "ArrayOfPropertyValue");
    private static final QName _PropertyValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "PropertyValue");
    private static final QName _StateType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "StateType");
    private static final QName _LPropertyValueName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "Name");
    private static final QName _LPropertyValueValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "Value");
    private static final QName _PropertyValueIsDirty_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "IsDirty");
    private static final QName _DeviceDriverInfoArrayChilds_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "ArrayChilds");
    private static final QName _DeviceDriverInfoArrayProperties_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "ArrayProperties");
    private static final QName _DeviceDriverInfoCameras_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "Cameras");
    private static final QName _DeviceDriverInfoChangeVersion_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "ChangeVersion");
    private static final QName _DeviceDriverInfoDeviceServerId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "DeviceServerId");
    private static final QName _DeviceDriverInfoDirtyArrayProperties_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "DirtyArrayProperties");
    private static final QName _DeviceDriverInfoDriverType_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "DriverType");
    private static final QName _DeviceDriverInfoFilterTagIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "FilterTagIds");
    private static final QName _DeviceDriverInfoID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "ID");
    private static final QName _DeviceDriverInfoParentPropertyName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "ParentPropertyName");
    private static final QName _DeviceDriverInfoTagIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "TagIds");
    private static final QName _LResourcePropertyValuesProperties_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "Properties");
    private static final QName _OperationPath_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "Path");
    private static final QName _OperationUserID_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "UserID");
    private static final QName _DeviceCallMethodOperationLogMessageId_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "LogMessageId");
    private static final QName _DeviceCallMethodOperationMethodArgs_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "MethodArgs");
    private static final QName _DeviceCallMethodOperationMethodName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "MethodName");
    private static final QName _LNetworkChangesDriversAdded_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "DriversAdded");
    private static final QName _LNetworkChangesLinkChanges_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "LinkChanges");
    private static final QName _LNetworkChangesNetworksAdded_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "NetworksAdded");
    private static final QName _LNetworkChangesOperationResults_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "OperationResults");
    private static final QName _LNetworkChangesResourcesRemoved_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "ResourcesRemoved");
    private static final QName _LNetworkChangesServersAdded_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "ServersAdded");
    private static final QName _LNetworkChangesStates_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", "States");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.vviinvestment_rusguard_net_services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LNetworkChanges }
     * 
     * @return
     *     the new instance of {@link LNetworkChanges }
     */
    public LNetworkChanges createLNetworkChanges() {
        return new LNetworkChanges();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     * @return
     *     the new instance of {@link Operation }
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link ArrayOfLResourcePropertyValues }
     * 
     * @return
     *     the new instance of {@link ArrayOfLResourcePropertyValues }
     */
    public ArrayOfLResourcePropertyValues createArrayOfLResourcePropertyValues() {
        return new ArrayOfLResourcePropertyValues();
    }

    /**
     * Create an instance of {@link ArrayOfDeviceDriverInfo }
     * 
     * @return
     *     the new instance of {@link ArrayOfDeviceDriverInfo }
     */
    public ArrayOfDeviceDriverInfo createArrayOfDeviceDriverInfo() {
        return new ArrayOfDeviceDriverInfo();
    }

    /**
     * Create an instance of {@link ArrayOfLPropertyValue }
     * 
     * @return
     *     the new instance of {@link ArrayOfLPropertyValue }
     */
    public ArrayOfLPropertyValue createArrayOfLPropertyValue() {
        return new ArrayOfLPropertyValue();
    }

    /**
     * Create an instance of {@link ArrayOfLLinkChanged }
     * 
     * @return
     *     the new instance of {@link ArrayOfLLinkChanged }
     */
    public ArrayOfLLinkChanged createArrayOfLLinkChanged() {
        return new ArrayOfLLinkChanged();
    }

    /**
     * Create an instance of {@link LLinkChanged }
     * 
     * @return
     *     the new instance of {@link LLinkChanged }
     */
    public LLinkChanged createLLinkChanged() {
        return new LLinkChanged();
    }

    /**
     * Create an instance of {@link DeviceOperation }
     * 
     * @return
     *     the new instance of {@link DeviceOperation }
     */
    public DeviceOperation createDeviceOperation() {
        return new DeviceOperation();
    }

    /**
     * Create an instance of {@link DeviceCallMethodOperation }
     * 
     * @return
     *     the new instance of {@link DeviceCallMethodOperation }
     */
    public DeviceCallMethodOperation createDeviceCallMethodOperation() {
        return new DeviceCallMethodOperation();
    }

    /**
     * Create an instance of {@link LResourcePropertyValues }
     * 
     * @return
     *     the new instance of {@link LResourcePropertyValues }
     */
    public LResourcePropertyValues createLResourcePropertyValues() {
        return new LResourcePropertyValues();
    }

    /**
     * Create an instance of {@link DeviceDriverInfo }
     * 
     * @return
     *     the new instance of {@link DeviceDriverInfo }
     */
    public DeviceDriverInfo createDeviceDriverInfo() {
        return new DeviceDriverInfo();
    }

    /**
     * Create an instance of {@link ArrayOfPropertyValue }
     * 
     * @return
     *     the new instance of {@link ArrayOfPropertyValue }
     */
    public ArrayOfPropertyValue createArrayOfPropertyValue() {
        return new ArrayOfPropertyValue();
    }

    /**
     * Create an instance of {@link PropertyValue }
     * 
     * @return
     *     the new instance of {@link PropertyValue }
     */
    public PropertyValue createPropertyValue() {
        return new PropertyValue();
    }

    /**
     * Create an instance of {@link LPropertyValue }
     * 
     * @return
     *     the new instance of {@link LPropertyValue }
     */
    public LPropertyValue createLPropertyValue() {
        return new LPropertyValue();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LNetworkChanges }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LNetworkChanges }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "LNetworkChanges")
    public JAXBElement<LNetworkChanges> createLNetworkChanges(LNetworkChanges value) {
        return new JAXBElement<>(_LNetworkChanges_QNAME, LNetworkChanges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLLinkChanged }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLLinkChanged }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "ArrayOfLLinkChanged")
    public JAXBElement<ArrayOfLLinkChanged> createArrayOfLLinkChanged(ArrayOfLLinkChanged value) {
        return new JAXBElement<>(_ArrayOfLLinkChanged_QNAME, ArrayOfLLinkChanged.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LLinkChanged }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LLinkChanged }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "LLinkChanged")
    public JAXBElement<LLinkChanged> createLLinkChanged(LLinkChanged value) {
        return new JAXBElement<>(_LLinkChanged_QNAME, LLinkChanged.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Operation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "Operation")
    public JAXBElement<Operation> createOperation(Operation value) {
        return new JAXBElement<>(_Operation_QNAME, Operation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceOperation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceOperation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "DeviceOperation")
    public JAXBElement<DeviceOperation> createDeviceOperation(DeviceOperation value) {
        return new JAXBElement<>(_DeviceOperation_QNAME, DeviceOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceCallMethodOperation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceCallMethodOperation }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "DeviceCallMethodOperation")
    public JAXBElement<DeviceCallMethodOperation> createDeviceCallMethodOperation(DeviceCallMethodOperation value) {
        return new JAXBElement<>(_DeviceCallMethodOperation_QNAME, DeviceCallMethodOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourcePropertyValues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourcePropertyValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "ArrayOfLResourcePropertyValues")
    public JAXBElement<ArrayOfLResourcePropertyValues> createArrayOfLResourcePropertyValues(ArrayOfLResourcePropertyValues value) {
        return new JAXBElement<>(_ArrayOfLResourcePropertyValues_QNAME, ArrayOfLResourcePropertyValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LResourcePropertyValues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LResourcePropertyValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "LResourcePropertyValues")
    public JAXBElement<LResourcePropertyValues> createLResourcePropertyValues(LResourcePropertyValues value) {
        return new JAXBElement<>(_LResourcePropertyValues_QNAME, LResourcePropertyValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLPropertyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLPropertyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "ArrayOfLPropertyValue")
    public JAXBElement<ArrayOfLPropertyValue> createArrayOfLPropertyValue(ArrayOfLPropertyValue value) {
        return new JAXBElement<>(_ArrayOfLPropertyValue_QNAME, ArrayOfLPropertyValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDeviceDriverInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDeviceDriverInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "ArrayOfDeviceDriverInfo")
    public JAXBElement<ArrayOfDeviceDriverInfo> createArrayOfDeviceDriverInfo(ArrayOfDeviceDriverInfo value) {
        return new JAXBElement<>(_ArrayOfDeviceDriverInfo_QNAME, ArrayOfDeviceDriverInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeviceDriverInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeviceDriverInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "DeviceDriverInfo")
    public JAXBElement<DeviceDriverInfo> createDeviceDriverInfo(DeviceDriverInfo value) {
        return new JAXBElement<>(_DeviceDriverInfo_QNAME, DeviceDriverInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPropertyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPropertyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "ArrayOfPropertyValue")
    public JAXBElement<ArrayOfPropertyValue> createArrayOfPropertyValue(ArrayOfPropertyValue value) {
        return new JAXBElement<>(_ArrayOfPropertyValue_QNAME, ArrayOfPropertyValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PropertyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "PropertyValue")
    public JAXBElement<PropertyValue> createPropertyValue(PropertyValue value) {
        return new JAXBElement<>(_PropertyValue_QNAME, PropertyValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StateType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "StateType")
    public JAXBElement<StateType> createStateType(StateType value) {
        return new JAXBElement<>(_StateType_QNAME, StateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "Name", scope = LPropertyValue.class)
    public JAXBElement<String> createLPropertyValueName(String value) {
        return new JAXBElement<>(_LPropertyValueName_QNAME, String.class, LPropertyValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "Value", scope = LPropertyValue.class)
    public JAXBElement<String> createLPropertyValueValue(String value) {
        return new JAXBElement<>(_LPropertyValueValue_QNAME, String.class, LPropertyValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "IsDirty", scope = PropertyValue.class)
    public JAXBElement<Boolean> createPropertyValueIsDirty(Boolean value) {
        return new JAXBElement<>(_PropertyValueIsDirty_QNAME, Boolean.class, PropertyValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "Name", scope = PropertyValue.class)
    public JAXBElement<String> createPropertyValueName(String value) {
        return new JAXBElement<>(_LPropertyValueName_QNAME, String.class, PropertyValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "Value", scope = PropertyValue.class)
    public JAXBElement<String> createPropertyValueValue(String value) {
        return new JAXBElement<>(_LPropertyValueValue_QNAME, String.class, PropertyValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDeviceDriverInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDeviceDriverInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "ArrayChilds", scope = DeviceDriverInfo.class)
    public JAXBElement<ArrayOfDeviceDriverInfo> createDeviceDriverInfoArrayChilds(ArrayOfDeviceDriverInfo value) {
        return new JAXBElement<>(_DeviceDriverInfoArrayChilds_QNAME, ArrayOfDeviceDriverInfo.class, DeviceDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPropertyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPropertyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "ArrayProperties", scope = DeviceDriverInfo.class)
    public JAXBElement<ArrayOfPropertyValue> createDeviceDriverInfoArrayProperties(ArrayOfPropertyValue value) {
        return new JAXBElement<>(_DeviceDriverInfoArrayProperties_QNAME, ArrayOfPropertyValue.class, DeviceDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccessPoint2CameraChain }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAccessPoint2CameraChain }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "Cameras", scope = DeviceDriverInfo.class)
    public JAXBElement<ArrayOfAccessPoint2CameraChain> createDeviceDriverInfoCameras(ArrayOfAccessPoint2CameraChain value) {
        return new JAXBElement<>(_DeviceDriverInfoCameras_QNAME, ArrayOfAccessPoint2CameraChain.class, DeviceDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "ChangeVersion", scope = DeviceDriverInfo.class)
    public JAXBElement<Long> createDeviceDriverInfoChangeVersion(Long value) {
        return new JAXBElement<>(_DeviceDriverInfoChangeVersion_QNAME, Long.class, DeviceDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "DeviceServerId", scope = DeviceDriverInfo.class)
    public JAXBElement<String> createDeviceDriverInfoDeviceServerId(String value) {
        return new JAXBElement<>(_DeviceDriverInfoDeviceServerId_QNAME, String.class, DeviceDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPropertyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPropertyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "DirtyArrayProperties", scope = DeviceDriverInfo.class)
    public JAXBElement<ArrayOfPropertyValue> createDeviceDriverInfoDirtyArrayProperties(ArrayOfPropertyValue value) {
        return new JAXBElement<>(_DeviceDriverInfoDirtyArrayProperties_QNAME, ArrayOfPropertyValue.class, DeviceDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "DriverType", scope = DeviceDriverInfo.class)
    public JAXBElement<String> createDeviceDriverInfoDriverType(String value) {
        return new JAXBElement<>(_DeviceDriverInfoDriverType_QNAME, String.class, DeviceDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "FilterTagIds", scope = DeviceDriverInfo.class)
    public JAXBElement<ArrayOfguid> createDeviceDriverInfoFilterTagIds(ArrayOfguid value) {
        return new JAXBElement<>(_DeviceDriverInfoFilterTagIds_QNAME, ArrayOfguid.class, DeviceDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "ID", scope = DeviceDriverInfo.class)
    public JAXBElement<String> createDeviceDriverInfoID(String value) {
        return new JAXBElement<>(_DeviceDriverInfoID_QNAME, String.class, DeviceDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "Name", scope = DeviceDriverInfo.class)
    public JAXBElement<String> createDeviceDriverInfoName(String value) {
        return new JAXBElement<>(_LPropertyValueName_QNAME, String.class, DeviceDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "ParentPropertyName", scope = DeviceDriverInfo.class)
    public JAXBElement<String> createDeviceDriverInfoParentPropertyName(String value) {
        return new JAXBElement<>(_DeviceDriverInfoParentPropertyName_QNAME, String.class, DeviceDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "TagIds", scope = DeviceDriverInfo.class)
    public JAXBElement<ArrayOfguid> createDeviceDriverInfoTagIds(ArrayOfguid value) {
        return new JAXBElement<>(_DeviceDriverInfoTagIds_QNAME, ArrayOfguid.class, DeviceDriverInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLPropertyValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLPropertyValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "Properties", scope = LResourcePropertyValues.class)
    public JAXBElement<ArrayOfLPropertyValue> createLResourcePropertyValuesProperties(ArrayOfLPropertyValue value) {
        return new JAXBElement<>(_LResourcePropertyValuesProperties_QNAME, ArrayOfLPropertyValue.class, LResourcePropertyValues.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "Path", scope = Operation.class)
    public JAXBElement<ArrayOfguid> createOperationPath(ArrayOfguid value) {
        return new JAXBElement<>(_OperationPath_QNAME, ArrayOfguid.class, Operation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "UserID", scope = Operation.class)
    public JAXBElement<String> createOperationUserID(String value) {
        return new JAXBElement<>(_OperationUserID_QNAME, String.class, Operation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "LogMessageId", scope = DeviceCallMethodOperation.class)
    public JAXBElement<Long> createDeviceCallMethodOperationLogMessageId(Long value) {
        return new JAXBElement<>(_DeviceCallMethodOperationLogMessageId_QNAME, Long.class, DeviceCallMethodOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "MethodArgs", scope = DeviceCallMethodOperation.class)
    public JAXBElement<ArrayOfstring> createDeviceCallMethodOperationMethodArgs(ArrayOfstring value) {
        return new JAXBElement<>(_DeviceCallMethodOperationMethodArgs_QNAME, ArrayOfstring.class, DeviceCallMethodOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "MethodName", scope = DeviceCallMethodOperation.class)
    public JAXBElement<String> createDeviceCallMethodOperationMethodName(String value) {
        return new JAXBElement<>(_DeviceCallMethodOperationMethodName_QNAME, String.class, DeviceCallMethodOperation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriverAdded }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLDriverAdded }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "DriversAdded", scope = LNetworkChanges.class)
    public JAXBElement<ArrayOfLDriverAdded> createLNetworkChangesDriversAdded(ArrayOfLDriverAdded value) {
        return new JAXBElement<>(_LNetworkChangesDriversAdded_QNAME, ArrayOfLDriverAdded.class, LNetworkChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLLinkChanged }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLLinkChanged }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "LinkChanges", scope = LNetworkChanges.class)
    public JAXBElement<ArrayOfLLinkChanged> createLNetworkChangesLinkChanges(ArrayOfLLinkChanged value) {
        return new JAXBElement<>(_LNetworkChangesLinkChanges_QNAME, ArrayOfLLinkChanged.class, LNetworkChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLNetworkAdded }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLNetworkAdded }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "NetworksAdded", scope = LNetworkChanges.class)
    public JAXBElement<ArrayOfLNetworkAdded> createLNetworkChangesNetworksAdded(ArrayOfLNetworkAdded value) {
        return new JAXBElement<>(_LNetworkChangesNetworksAdded_QNAME, ArrayOfLNetworkAdded.class, LNetworkChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLOperationResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLOperationResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "OperationResults", scope = LNetworkChanges.class)
    public JAXBElement<ArrayOfLOperationResult> createLNetworkChangesOperationResults(ArrayOfLOperationResult value) {
        return new JAXBElement<>(_LNetworkChangesOperationResults_QNAME, ArrayOfLOperationResult.class, LNetworkChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourceProperty }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourceProperty }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "Properties", scope = LNetworkChanges.class)
    public JAXBElement<ArrayOfLResourceProperty> createLNetworkChangesProperties(ArrayOfLResourceProperty value) {
        return new JAXBElement<>(_LResourcePropertyValuesProperties_QNAME, ArrayOfLResourceProperty.class, LNetworkChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourceInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "ResourcesRemoved", scope = LNetworkChanges.class)
    public JAXBElement<ArrayOfLResourceInfo> createLNetworkChangesResourcesRemoved(ArrayOfLResourceInfo value) {
        return new JAXBElement<>(_LNetworkChangesResourcesRemoved_QNAME, ArrayOfLResourceInfo.class, LNetworkChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLServerAdded }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLServerAdded }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "ServersAdded", scope = LNetworkChanges.class)
    public JAXBElement<ArrayOfLServerAdded> createLNetworkChangesServersAdded(ArrayOfLServerAdded value) {
        return new JAXBElement<>(_LNetworkChangesServersAdded_QNAME, ArrayOfLServerAdded.class, LNetworkChanges.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourceProperty }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLResourceProperty }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", name = "States", scope = LNetworkChanges.class)
    public JAXBElement<ArrayOfLResourceProperty> createLNetworkChangesStates(ArrayOfLResourceProperty value) {
        return new JAXBElement<>(_LNetworkChangesStates_QNAME, ArrayOfLResourceProperty.class, LNetworkChanges.class, value);
    }

}
