
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_report;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity.ArrayOfBranchInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_report package. 
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
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
public class ObjectFactory {

    private static final QName _ArrayOfIncidentTypeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", "ArrayOfIncidentTypeInfo");
    private static final QName _IncidentTypeInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", "IncidentTypeInfo");
    private static final QName _IncidentStatisticData_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", "IncidentStatisticData");
    private static final QName _Extension_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", "Extension");
    private static final QName _IncidentStatisticDataBranches_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", "Branches");
    private static final QName _IncidentStatisticDataImportantIncidentTypeIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", "ImportantIncidentTypeIds");
    private static final QName _IncidentStatisticDataIncidentReportName_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", "IncidentReportName");
    private static final QName _IncidentStatisticDataIncidentsDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", "IncidentsDescription");
    private static final QName _IncidentStatisticDataOrganizaion_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", "Organizaion");
    private static final QName _IncidentStatisticDataOtherIncidentTypeIds_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", "OtherIncidentTypeIds");
    private static final QName _IncidentStatisticDataOtherIncidents_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", "OtherIncidents");
    private static final QName _IncidentStatisticDataPlace_QNAME = new QName("http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", "Place");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_report
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfIncidentTypeInfo }
     * 
     */
    public ArrayOfIncidentTypeInfo createArrayOfIncidentTypeInfo() {
        return new ArrayOfIncidentTypeInfo();
    }

    /**
     * Create an instance of {@link IncidentStatisticData }
     * 
     */
    public IncidentStatisticData createIncidentStatisticData() {
        return new IncidentStatisticData();
    }

    /**
     * Create an instance of {@link IncidentTypeInfo }
     * 
     */
    public IncidentTypeInfo createIncidentTypeInfo() {
        return new IncidentTypeInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIncidentTypeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfIncidentTypeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", name = "ArrayOfIncidentTypeInfo")
    public JAXBElement<ArrayOfIncidentTypeInfo> createArrayOfIncidentTypeInfo(ArrayOfIncidentTypeInfo value) {
        return new JAXBElement<ArrayOfIncidentTypeInfo>(_ArrayOfIncidentTypeInfo_QNAME, ArrayOfIncidentTypeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentTypeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncidentTypeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", name = "IncidentTypeInfo")
    public JAXBElement<IncidentTypeInfo> createIncidentTypeInfo(IncidentTypeInfo value) {
        return new JAXBElement<IncidentTypeInfo>(_IncidentTypeInfo_QNAME, IncidentTypeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentStatisticData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncidentStatisticData }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", name = "IncidentStatisticData")
    public JAXBElement<IncidentStatisticData> createIncidentStatisticData(IncidentStatisticData value) {
        return new JAXBElement<IncidentStatisticData>(_IncidentStatisticData_QNAME, IncidentStatisticData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Extension }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Extension }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", name = "Extension")
    public JAXBElement<Extension> createExtension(Extension value) {
        return new JAXBElement<Extension>(_Extension_QNAME, Extension.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBranchInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBranchInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", name = "Branches", scope = IncidentStatisticData.class)
    public JAXBElement<ArrayOfBranchInfo> createIncidentStatisticDataBranches(ArrayOfBranchInfo value) {
        return new JAXBElement<ArrayOfBranchInfo>(_IncidentStatisticDataBranches_QNAME, ArrayOfBranchInfo.class, IncidentStatisticData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", name = "ImportantIncidentTypeIds", scope = IncidentStatisticData.class)
    public JAXBElement<ArrayOfguid> createIncidentStatisticDataImportantIncidentTypeIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_IncidentStatisticDataImportantIncidentTypeIds_QNAME, ArrayOfguid.class, IncidentStatisticData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", name = "IncidentReportName", scope = IncidentStatisticData.class)
    public JAXBElement<String> createIncidentStatisticDataIncidentReportName(String value) {
        return new JAXBElement<String>(_IncidentStatisticDataIncidentReportName_QNAME, String.class, IncidentStatisticData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", name = "IncidentsDescription", scope = IncidentStatisticData.class)
    public JAXBElement<String> createIncidentStatisticDataIncidentsDescription(String value) {
        return new JAXBElement<String>(_IncidentStatisticDataIncidentsDescription_QNAME, String.class, IncidentStatisticData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", name = "Organizaion", scope = IncidentStatisticData.class)
    public JAXBElement<String> createIncidentStatisticDataOrganizaion(String value) {
        return new JAXBElement<String>(_IncidentStatisticDataOrganizaion_QNAME, String.class, IncidentStatisticData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", name = "OtherIncidentTypeIds", scope = IncidentStatisticData.class)
    public JAXBElement<ArrayOfguid> createIncidentStatisticDataOtherIncidentTypeIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_IncidentStatisticDataOtherIncidentTypeIds_QNAME, ArrayOfguid.class, IncidentStatisticData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", name = "OtherIncidents", scope = IncidentStatisticData.class)
    public JAXBElement<String> createIncidentStatisticDataOtherIncidents(String value) {
        return new JAXBElement<String>(_IncidentStatisticDataOtherIncidents_QNAME, String.class, IncidentStatisticData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity.Report.Incidents", name = "Place", scope = IncidentStatisticData.class)
    public JAXBElement<String> createIncidentStatisticDataPlace(String value) {
        return new JAXBElement<String>(_IncidentStatisticDataPlace_QNAME, String.class, IncidentStatisticData.class, value);
    }

}
