
package org.tempuri;

import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import org.datacontract.schemas._2004._07.rusguard.ArrayOfAbsent;
import org.datacontract.schemas._2004._07.rusguard.ArrayOfDataForPeriodModel;
import org.datacontract.schemas._2004._07.rusguard.ArrayOfDataForViolator;
import org.datacontract.schemas._2004._07.rusguard.ArrayOfDataOnPresenceInWorkplace;
import org.datacontract.schemas._2004._07.rusguard.ArrayOfDepartmentTreeModel;
import org.datacontract.schemas._2004._07.rusguard.ArrayOfViolator;
import org.datacontract.schemas._2004._07.rusguard.ViolationType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private static final QName _GetDepartmentTreeDepartmentId_QNAME = new QName("http://tempuri.org/", "departmentId");
    private static final QName _GetDepartmentTreeResponseGetDepartmentTreeResult_QNAME = new QName("http://tempuri.org/", "GetDepartmentTreeResult");
    private static final QName _GetDataForPeriodByDepartmentsLogin_QNAME = new QName("http://tempuri.org/", "login");
    private static final QName _GetDataForPeriodByDepartmentsDepartmentsIds_QNAME = new QName("http://tempuri.org/", "departmentsIds");
    private static final QName _GetDataForPeriodByDepartmentsType_QNAME = new QName("http://tempuri.org/", "type");
    private static final QName _GetDataForPeriodByDepartmentsResponseGetDataForPeriodByDepartmentsResult_QNAME = new QName("http://tempuri.org/", "GetDataForPeriodByDepartmentsResult");
    private static final QName _GetDataForPeriodByDepartmentsDetailResponseGetDataForPeriodByDepartmentsDetailResult_QNAME = new QName("http://tempuri.org/", "GetDataForPeriodByDepartmentsDetailResult");
    private static final QName _GetIsPresentInWorkplaceResponseGetIsPresentInWorkplaceResult_QNAME = new QName("http://tempuri.org/", "GetIsPresentInWorkplaceResult");
    private static final QName _GetAbscenceInWorkplaceResponseGetAbscenceInWorkplaceResult_QNAME = new QName("http://tempuri.org/", "GetAbscenceInWorkplaceResult");
    private static final QName _GetDataForGraphResponseGetDataForGraphResult_QNAME = new QName("http://tempuri.org/", "GetDataForGraphResult");
    private static final QName _GetProblemDatesResponseGetProblemDatesResult_QNAME = new QName("http://tempuri.org/", "GetProblemDatesResult");
    private static final QName _GetListOfViolationsResponseGetListOfViolationsResult_QNAME = new QName("http://tempuri.org/", "GetListOfViolationsResult");
    private static final QName _GetListOfViolationsByLoginResponseGetListOfViolationsByLoginResult_QNAME = new QName("http://tempuri.org/", "GetListOfViolationsByLoginResult");
    private static final QName _GetPhotoResponseGetPhotoResult_QNAME = new QName("http://tempuri.org/", "GetPhotoResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDepartmentTree }
     * 
     * @return
     *     the new instance of {@link GetDepartmentTree }
     */
    public GetDepartmentTree createGetDepartmentTree() {
        return new GetDepartmentTree();
    }

    /**
     * Create an instance of {@link GetDepartmentTreeResponse }
     * 
     * @return
     *     the new instance of {@link GetDepartmentTreeResponse }
     */
    public GetDepartmentTreeResponse createGetDepartmentTreeResponse() {
        return new GetDepartmentTreeResponse();
    }

    /**
     * Create an instance of {@link GetDataForPeriodByDepartments }
     * 
     * @return
     *     the new instance of {@link GetDataForPeriodByDepartments }
     */
    public GetDataForPeriodByDepartments createGetDataForPeriodByDepartments() {
        return new GetDataForPeriodByDepartments();
    }

    /**
     * Create an instance of {@link GetDataForPeriodByDepartmentsResponse }
     * 
     * @return
     *     the new instance of {@link GetDataForPeriodByDepartmentsResponse }
     */
    public GetDataForPeriodByDepartmentsResponse createGetDataForPeriodByDepartmentsResponse() {
        return new GetDataForPeriodByDepartmentsResponse();
    }

    /**
     * Create an instance of {@link GetDataForPeriodByDepartmentsDetail }
     * 
     * @return
     *     the new instance of {@link GetDataForPeriodByDepartmentsDetail }
     */
    public GetDataForPeriodByDepartmentsDetail createGetDataForPeriodByDepartmentsDetail() {
        return new GetDataForPeriodByDepartmentsDetail();
    }

    /**
     * Create an instance of {@link GetDataForPeriodByDepartmentsDetailResponse }
     * 
     * @return
     *     the new instance of {@link GetDataForPeriodByDepartmentsDetailResponse }
     */
    public GetDataForPeriodByDepartmentsDetailResponse createGetDataForPeriodByDepartmentsDetailResponse() {
        return new GetDataForPeriodByDepartmentsDetailResponse();
    }

    /**
     * Create an instance of {@link GetIsPresentInWorkplace }
     * 
     * @return
     *     the new instance of {@link GetIsPresentInWorkplace }
     */
    public GetIsPresentInWorkplace createGetIsPresentInWorkplace() {
        return new GetIsPresentInWorkplace();
    }

    /**
     * Create an instance of {@link GetIsPresentInWorkplaceResponse }
     * 
     * @return
     *     the new instance of {@link GetIsPresentInWorkplaceResponse }
     */
    public GetIsPresentInWorkplaceResponse createGetIsPresentInWorkplaceResponse() {
        return new GetIsPresentInWorkplaceResponse();
    }

    /**
     * Create an instance of {@link GetAbscenceInWorkplace }
     * 
     * @return
     *     the new instance of {@link GetAbscenceInWorkplace }
     */
    public GetAbscenceInWorkplace createGetAbscenceInWorkplace() {
        return new GetAbscenceInWorkplace();
    }

    /**
     * Create an instance of {@link GetAbscenceInWorkplaceResponse }
     * 
     * @return
     *     the new instance of {@link GetAbscenceInWorkplaceResponse }
     */
    public GetAbscenceInWorkplaceResponse createGetAbscenceInWorkplaceResponse() {
        return new GetAbscenceInWorkplaceResponse();
    }

    /**
     * Create an instance of {@link GetDataForGraph }
     * 
     * @return
     *     the new instance of {@link GetDataForGraph }
     */
    public GetDataForGraph createGetDataForGraph() {
        return new GetDataForGraph();
    }

    /**
     * Create an instance of {@link GetDataForGraphResponse }
     * 
     * @return
     *     the new instance of {@link GetDataForGraphResponse }
     */
    public GetDataForGraphResponse createGetDataForGraphResponse() {
        return new GetDataForGraphResponse();
    }

    /**
     * Create an instance of {@link GetProblemDates }
     * 
     * @return
     *     the new instance of {@link GetProblemDates }
     */
    public GetProblemDates createGetProblemDates() {
        return new GetProblemDates();
    }

    /**
     * Create an instance of {@link GetProblemDatesResponse }
     * 
     * @return
     *     the new instance of {@link GetProblemDatesResponse }
     */
    public GetProblemDatesResponse createGetProblemDatesResponse() {
        return new GetProblemDatesResponse();
    }

    /**
     * Create an instance of {@link GetSystematicViolation }
     * 
     * @return
     *     the new instance of {@link GetSystematicViolation }
     */
    public GetSystematicViolation createGetSystematicViolation() {
        return new GetSystematicViolation();
    }

    /**
     * Create an instance of {@link GetSystematicViolationResponse }
     * 
     * @return
     *     the new instance of {@link GetSystematicViolationResponse }
     */
    public GetSystematicViolationResponse createGetSystematicViolationResponse() {
        return new GetSystematicViolationResponse();
    }

    /**
     * Create an instance of {@link GetSystematicViolationByLogin }
     * 
     * @return
     *     the new instance of {@link GetSystematicViolationByLogin }
     */
    public GetSystematicViolationByLogin createGetSystematicViolationByLogin() {
        return new GetSystematicViolationByLogin();
    }

    /**
     * Create an instance of {@link GetSystematicViolationByLoginResponse }
     * 
     * @return
     *     the new instance of {@link GetSystematicViolationByLoginResponse }
     */
    public GetSystematicViolationByLoginResponse createGetSystematicViolationByLoginResponse() {
        return new GetSystematicViolationByLoginResponse();
    }

    /**
     * Create an instance of {@link SaveSystematicViolation }
     * 
     * @return
     *     the new instance of {@link SaveSystematicViolation }
     */
    public SaveSystematicViolation createSaveSystematicViolation() {
        return new SaveSystematicViolation();
    }

    /**
     * Create an instance of {@link SaveSystematicViolationResponse }
     * 
     * @return
     *     the new instance of {@link SaveSystematicViolationResponse }
     */
    public SaveSystematicViolationResponse createSaveSystematicViolationResponse() {
        return new SaveSystematicViolationResponse();
    }

    /**
     * Create an instance of {@link SaveSystematicViolationByLogin }
     * 
     * @return
     *     the new instance of {@link SaveSystematicViolationByLogin }
     */
    public SaveSystematicViolationByLogin createSaveSystematicViolationByLogin() {
        return new SaveSystematicViolationByLogin();
    }

    /**
     * Create an instance of {@link SaveSystematicViolationByLoginResponse }
     * 
     * @return
     *     the new instance of {@link SaveSystematicViolationByLoginResponse }
     */
    public SaveSystematicViolationByLoginResponse createSaveSystematicViolationByLoginResponse() {
        return new SaveSystematicViolationByLoginResponse();
    }

    /**
     * Create an instance of {@link GetListOfViolations }
     * 
     * @return
     *     the new instance of {@link GetListOfViolations }
     */
    public GetListOfViolations createGetListOfViolations() {
        return new GetListOfViolations();
    }

    /**
     * Create an instance of {@link GetListOfViolationsResponse }
     * 
     * @return
     *     the new instance of {@link GetListOfViolationsResponse }
     */
    public GetListOfViolationsResponse createGetListOfViolationsResponse() {
        return new GetListOfViolationsResponse();
    }

    /**
     * Create an instance of {@link GetListOfViolationsByLogin }
     * 
     * @return
     *     the new instance of {@link GetListOfViolationsByLogin }
     */
    public GetListOfViolationsByLogin createGetListOfViolationsByLogin() {
        return new GetListOfViolationsByLogin();
    }

    /**
     * Create an instance of {@link GetListOfViolationsByLoginResponse }
     * 
     * @return
     *     the new instance of {@link GetListOfViolationsByLoginResponse }
     */
    public GetListOfViolationsByLoginResponse createGetListOfViolationsByLoginResponse() {
        return new GetListOfViolationsByLoginResponse();
    }

    /**
     * Create an instance of {@link GetPhoto }
     * 
     * @return
     *     the new instance of {@link GetPhoto }
     */
    public GetPhoto createGetPhoto() {
        return new GetPhoto();
    }

    /**
     * Create an instance of {@link GetPhotoResponse }
     * 
     * @return
     *     the new instance of {@link GetPhotoResponse }
     */
    public GetPhotoResponse createGetPhotoResponse() {
        return new GetPhotoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "departmentId", scope = GetDepartmentTree.class)
    public JAXBElement<String> createGetDepartmentTreeDepartmentId(String value) {
        return new JAXBElement<>(_GetDepartmentTreeDepartmentId_QNAME, String.class, GetDepartmentTree.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDepartmentTreeModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDepartmentTreeModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDepartmentTreeResult", scope = GetDepartmentTreeResponse.class)
    public JAXBElement<ArrayOfDepartmentTreeModel> createGetDepartmentTreeResponseGetDepartmentTreeResult(ArrayOfDepartmentTreeModel value) {
        return new JAXBElement<>(_GetDepartmentTreeResponseGetDepartmentTreeResult_QNAME, ArrayOfDepartmentTreeModel.class, GetDepartmentTreeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = GetDataForPeriodByDepartments.class)
    public JAXBElement<String> createGetDataForPeriodByDepartmentsLogin(String value) {
        return new JAXBElement<>(_GetDataForPeriodByDepartmentsLogin_QNAME, String.class, GetDataForPeriodByDepartments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "departmentsIds", scope = GetDataForPeriodByDepartments.class)
    public JAXBElement<ArrayOfguid> createGetDataForPeriodByDepartmentsDepartmentsIds(ArrayOfguid value) {
        return new JAXBElement<>(_GetDataForPeriodByDepartmentsDepartmentsIds_QNAME, ArrayOfguid.class, GetDataForPeriodByDepartments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViolationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViolationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "type", scope = GetDataForPeriodByDepartments.class)
    public JAXBElement<ViolationType> createGetDataForPeriodByDepartmentsType(ViolationType value) {
        return new JAXBElement<>(_GetDataForPeriodByDepartmentsType_QNAME, ViolationType.class, GetDataForPeriodByDepartments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataForPeriodModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDataForPeriodModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataForPeriodByDepartmentsResult", scope = GetDataForPeriodByDepartmentsResponse.class)
    public JAXBElement<ArrayOfDataForPeriodModel> createGetDataForPeriodByDepartmentsResponseGetDataForPeriodByDepartmentsResult(ArrayOfDataForPeriodModel value) {
        return new JAXBElement<>(_GetDataForPeriodByDepartmentsResponseGetDataForPeriodByDepartmentsResult_QNAME, ArrayOfDataForPeriodModel.class, GetDataForPeriodByDepartmentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = GetDataForPeriodByDepartmentsDetail.class)
    public JAXBElement<String> createGetDataForPeriodByDepartmentsDetailLogin(String value) {
        return new JAXBElement<>(_GetDataForPeriodByDepartmentsLogin_QNAME, String.class, GetDataForPeriodByDepartmentsDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataForPeriodModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDataForPeriodModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataForPeriodByDepartmentsDetailResult", scope = GetDataForPeriodByDepartmentsDetailResponse.class)
    public JAXBElement<ArrayOfDataForPeriodModel> createGetDataForPeriodByDepartmentsDetailResponseGetDataForPeriodByDepartmentsDetailResult(ArrayOfDataForPeriodModel value) {
        return new JAXBElement<>(_GetDataForPeriodByDepartmentsDetailResponseGetDataForPeriodByDepartmentsDetailResult_QNAME, ArrayOfDataForPeriodModel.class, GetDataForPeriodByDepartmentsDetailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "departmentsIds", scope = GetIsPresentInWorkplace.class)
    public JAXBElement<ArrayOfguid> createGetIsPresentInWorkplaceDepartmentsIds(ArrayOfguid value) {
        return new JAXBElement<>(_GetDataForPeriodByDepartmentsDepartmentsIds_QNAME, ArrayOfguid.class, GetIsPresentInWorkplace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataOnPresenceInWorkplace }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDataOnPresenceInWorkplace }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetIsPresentInWorkplaceResult", scope = GetIsPresentInWorkplaceResponse.class)
    public JAXBElement<ArrayOfDataOnPresenceInWorkplace> createGetIsPresentInWorkplaceResponseGetIsPresentInWorkplaceResult(ArrayOfDataOnPresenceInWorkplace value) {
        return new JAXBElement<>(_GetIsPresentInWorkplaceResponseGetIsPresentInWorkplaceResult_QNAME, ArrayOfDataOnPresenceInWorkplace.class, GetIsPresentInWorkplaceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAbsent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAbsent }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAbscenceInWorkplaceResult", scope = GetAbscenceInWorkplaceResponse.class)
    public JAXBElement<ArrayOfAbsent> createGetAbscenceInWorkplaceResponseGetAbscenceInWorkplaceResult(ArrayOfAbsent value) {
        return new JAXBElement<>(_GetAbscenceInWorkplaceResponseGetAbscenceInWorkplaceResult_QNAME, ArrayOfAbsent.class, GetAbscenceInWorkplaceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViolationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViolationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "type", scope = GetDataForGraph.class)
    public JAXBElement<ViolationType> createGetDataForGraphType(ViolationType value) {
        return new JAXBElement<>(_GetDataForPeriodByDepartmentsType_QNAME, ViolationType.class, GetDataForGraph.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataForViolator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDataForViolator }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDataForGraphResult", scope = GetDataForGraphResponse.class)
    public JAXBElement<ArrayOfDataForViolator> createGetDataForGraphResponseGetDataForGraphResult(ArrayOfDataForViolator value) {
        return new JAXBElement<>(_GetDataForGraphResponseGetDataForGraphResult_QNAME, ArrayOfDataForViolator.class, GetDataForGraphResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "departmentsIds", scope = GetProblemDates.class)
    public JAXBElement<ArrayOfguid> createGetProblemDatesDepartmentsIds(ArrayOfguid value) {
        return new JAXBElement<>(_GetDataForPeriodByDepartmentsDepartmentsIds_QNAME, ArrayOfguid.class, GetProblemDates.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataForViolator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDataForViolator }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProblemDatesResult", scope = GetProblemDatesResponse.class)
    public JAXBElement<ArrayOfDataForViolator> createGetProblemDatesResponseGetProblemDatesResult(ArrayOfDataForViolator value) {
        return new JAXBElement<>(_GetProblemDatesResponseGetProblemDatesResult_QNAME, ArrayOfDataForViolator.class, GetProblemDatesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = GetSystematicViolationByLogin.class)
    public JAXBElement<String> createGetSystematicViolationByLoginLogin(String value) {
        return new JAXBElement<>(_GetDataForPeriodByDepartmentsLogin_QNAME, String.class, GetSystematicViolationByLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = SaveSystematicViolationByLogin.class)
    public JAXBElement<String> createSaveSystematicViolationByLoginLogin(String value) {
        return new JAXBElement<>(_GetDataForPeriodByDepartmentsLogin_QNAME, String.class, SaveSystematicViolationByLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "departmentsIds", scope = GetListOfViolations.class)
    public JAXBElement<ArrayOfguid> createGetListOfViolationsDepartmentsIds(ArrayOfguid value) {
        return new JAXBElement<>(_GetDataForPeriodByDepartmentsDepartmentsIds_QNAME, ArrayOfguid.class, GetListOfViolations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViolationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViolationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "type", scope = GetListOfViolations.class)
    public JAXBElement<ViolationType> createGetListOfViolationsType(ViolationType value) {
        return new JAXBElement<>(_GetDataForPeriodByDepartmentsType_QNAME, ViolationType.class, GetListOfViolations.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViolator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfViolator }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetListOfViolationsResult", scope = GetListOfViolationsResponse.class)
    public JAXBElement<ArrayOfViolator> createGetListOfViolationsResponseGetListOfViolationsResult(ArrayOfViolator value) {
        return new JAXBElement<>(_GetListOfViolationsResponseGetListOfViolationsResult_QNAME, ArrayOfViolator.class, GetListOfViolationsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "login", scope = GetListOfViolationsByLogin.class)
    public JAXBElement<String> createGetListOfViolationsByLoginLogin(String value) {
        return new JAXBElement<>(_GetDataForPeriodByDepartmentsLogin_QNAME, String.class, GetListOfViolationsByLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "departmentsIds", scope = GetListOfViolationsByLogin.class)
    public JAXBElement<ArrayOfguid> createGetListOfViolationsByLoginDepartmentsIds(ArrayOfguid value) {
        return new JAXBElement<>(_GetDataForPeriodByDepartmentsDepartmentsIds_QNAME, ArrayOfguid.class, GetListOfViolationsByLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViolationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViolationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "type", scope = GetListOfViolationsByLogin.class)
    public JAXBElement<ViolationType> createGetListOfViolationsByLoginType(ViolationType value) {
        return new JAXBElement<>(_GetDataForPeriodByDepartmentsType_QNAME, ViolationType.class, GetListOfViolationsByLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViolator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfViolator }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetListOfViolationsByLoginResult", scope = GetListOfViolationsByLoginResponse.class)
    public JAXBElement<ArrayOfViolator> createGetListOfViolationsByLoginResponseGetListOfViolationsByLoginResult(ArrayOfViolator value) {
        return new JAXBElement<>(_GetListOfViolationsByLoginResponseGetListOfViolationsByLoginResult_QNAME, ArrayOfViolator.class, GetListOfViolationsByLoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPhotoResult", scope = GetPhotoResponse.class)
    public JAXBElement<byte[]> createGetPhotoResponseGetPhotoResult(byte[] value) {
        return new JAXBElement<>(_GetPhotoResponseGetPhotoResult_QNAME, byte[].class, GetPhotoResponse.class, ((byte[]) value));
    }

}
