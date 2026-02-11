
package org.datacontract.schemas._2004._07.rusguard;

import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.rusguard package. 
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

    private static final QName _ArrayOfPlanModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "ArrayOfPlanModel");
    private static final QName _PlanModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "PlanModel");
    private static final QName _ArrayOfDepartmentTreeModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "ArrayOfDepartmentTreeModel");
    private static final QName _DepartmentTreeModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "DepartmentTreeModel");
    private static final QName _ViolationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "ViolationType");
    private static final QName _ArrayOfDataForPeriodModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "ArrayOfDataForPeriodModel");
    private static final QName _DataForPeriodModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "DataForPeriodModel");
    private static final QName _ArrayOfDataOnPresenceInWorkplace_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "ArrayOfDataOnPresenceInWorkplace");
    private static final QName _DataOnPresenceInWorkplace_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "DataOnPresenceInWorkplace");
    private static final QName _ArrayOfAbsent_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "ArrayOfAbsent");
    private static final QName _Absent_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "Absent");
    private static final QName _ArrayOfDataForViolator_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "ArrayOfDataForViolator");
    private static final QName _DataForViolator_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "DataForViolator");
    private static final QName _ArrayOfViolator_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "ArrayOfViolator");
    private static final QName _Violator_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "Violator");
    private static final QName _AbsentDepartmentName_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "DepartmentName");
    private static final QName _AbsentFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "FirstName");
    private static final QName _AbsentLastName_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "LastName");
    private static final QName _AbsentPhoneNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "PhoneNumber");
    private static final QName _AbsentPosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "Position");
    private static final QName _AbsentSecondName_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "SecondName");
    private static final QName _AbsentTableNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "TableNumber");
    private static final QName _ViolatorMessageError_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "MessageError");
    private static final QName _DataForPeriodModelEvaluationSystem_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "EvaluationSystem");
    private static final QName _DepartmentTreeModelList_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "List");
    private static final QName _DepartmentTreeModelListName_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "ListName");
    private static final QName _DepartmentTreeModelName_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "Name");
    private static final QName _DepartmentTreeModelParentID_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "ParentID");
    private static final QName _PlanModelDepartmentGuid_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "DepartmentGuid");
    private static final QName _PlanModelDeviationValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "DeviationValue");
    private static final QName _PlanModelPlanValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/RusGuard.Models", "PlanValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.rusguard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfDepartmentTreeModel }
     * 
     * @return
     *     the new instance of {@link ArrayOfDepartmentTreeModel }
     */
    public ArrayOfDepartmentTreeModel createArrayOfDepartmentTreeModel() {
        return new ArrayOfDepartmentTreeModel();
    }

    /**
     * Create an instance of {@link ArrayOfDataForPeriodModel }
     * 
     * @return
     *     the new instance of {@link ArrayOfDataForPeriodModel }
     */
    public ArrayOfDataForPeriodModel createArrayOfDataForPeriodModel() {
        return new ArrayOfDataForPeriodModel();
    }

    /**
     * Create an instance of {@link ArrayOfDataOnPresenceInWorkplace }
     * 
     * @return
     *     the new instance of {@link ArrayOfDataOnPresenceInWorkplace }
     */
    public ArrayOfDataOnPresenceInWorkplace createArrayOfDataOnPresenceInWorkplace() {
        return new ArrayOfDataOnPresenceInWorkplace();
    }

    /**
     * Create an instance of {@link ArrayOfAbsent }
     * 
     * @return
     *     the new instance of {@link ArrayOfAbsent }
     */
    public ArrayOfAbsent createArrayOfAbsent() {
        return new ArrayOfAbsent();
    }

    /**
     * Create an instance of {@link ArrayOfDataForViolator }
     * 
     * @return
     *     the new instance of {@link ArrayOfDataForViolator }
     */
    public ArrayOfDataForViolator createArrayOfDataForViolator() {
        return new ArrayOfDataForViolator();
    }

    /**
     * Create an instance of {@link ArrayOfViolator }
     * 
     * @return
     *     the new instance of {@link ArrayOfViolator }
     */
    public ArrayOfViolator createArrayOfViolator() {
        return new ArrayOfViolator();
    }

    /**
     * Create an instance of {@link ArrayOfPlanModel }
     * 
     * @return
     *     the new instance of {@link ArrayOfPlanModel }
     */
    public ArrayOfPlanModel createArrayOfPlanModel() {
        return new ArrayOfPlanModel();
    }

    /**
     * Create an instance of {@link PlanModel }
     * 
     * @return
     *     the new instance of {@link PlanModel }
     */
    public PlanModel createPlanModel() {
        return new PlanModel();
    }

    /**
     * Create an instance of {@link DepartmentTreeModel }
     * 
     * @return
     *     the new instance of {@link DepartmentTreeModel }
     */
    public DepartmentTreeModel createDepartmentTreeModel() {
        return new DepartmentTreeModel();
    }

    /**
     * Create an instance of {@link DataForPeriodModel }
     * 
     * @return
     *     the new instance of {@link DataForPeriodModel }
     */
    public DataForPeriodModel createDataForPeriodModel() {
        return new DataForPeriodModel();
    }

    /**
     * Create an instance of {@link DataOnPresenceInWorkplace }
     * 
     * @return
     *     the new instance of {@link DataOnPresenceInWorkplace }
     */
    public DataOnPresenceInWorkplace createDataOnPresenceInWorkplace() {
        return new DataOnPresenceInWorkplace();
    }

    /**
     * Create an instance of {@link Absent }
     * 
     * @return
     *     the new instance of {@link Absent }
     */
    public Absent createAbsent() {
        return new Absent();
    }

    /**
     * Create an instance of {@link DataForViolator }
     * 
     * @return
     *     the new instance of {@link DataForViolator }
     */
    public DataForViolator createDataForViolator() {
        return new DataForViolator();
    }

    /**
     * Create an instance of {@link Violator }
     * 
     * @return
     *     the new instance of {@link Violator }
     */
    public Violator createViolator() {
        return new Violator();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPlanModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPlanModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "ArrayOfPlanModel")
    public JAXBElement<ArrayOfPlanModel> createArrayOfPlanModel(ArrayOfPlanModel value) {
        return new JAXBElement<>(_ArrayOfPlanModel_QNAME, ArrayOfPlanModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PlanModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "PlanModel")
    public JAXBElement<PlanModel> createPlanModel(PlanModel value) {
        return new JAXBElement<>(_PlanModel_QNAME, PlanModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDepartmentTreeModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDepartmentTreeModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "ArrayOfDepartmentTreeModel")
    public JAXBElement<ArrayOfDepartmentTreeModel> createArrayOfDepartmentTreeModel(ArrayOfDepartmentTreeModel value) {
        return new JAXBElement<>(_ArrayOfDepartmentTreeModel_QNAME, ArrayOfDepartmentTreeModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartmentTreeModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DepartmentTreeModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "DepartmentTreeModel")
    public JAXBElement<DepartmentTreeModel> createDepartmentTreeModel(DepartmentTreeModel value) {
        return new JAXBElement<>(_DepartmentTreeModel_QNAME, DepartmentTreeModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViolationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ViolationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "ViolationType")
    public JAXBElement<ViolationType> createViolationType(ViolationType value) {
        return new JAXBElement<>(_ViolationType_QNAME, ViolationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataForPeriodModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDataForPeriodModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "ArrayOfDataForPeriodModel")
    public JAXBElement<ArrayOfDataForPeriodModel> createArrayOfDataForPeriodModel(ArrayOfDataForPeriodModel value) {
        return new JAXBElement<>(_ArrayOfDataForPeriodModel_QNAME, ArrayOfDataForPeriodModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataForPeriodModel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataForPeriodModel }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "DataForPeriodModel")
    public JAXBElement<DataForPeriodModel> createDataForPeriodModel(DataForPeriodModel value) {
        return new JAXBElement<>(_DataForPeriodModel_QNAME, DataForPeriodModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataOnPresenceInWorkplace }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDataOnPresenceInWorkplace }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "ArrayOfDataOnPresenceInWorkplace")
    public JAXBElement<ArrayOfDataOnPresenceInWorkplace> createArrayOfDataOnPresenceInWorkplace(ArrayOfDataOnPresenceInWorkplace value) {
        return new JAXBElement<>(_ArrayOfDataOnPresenceInWorkplace_QNAME, ArrayOfDataOnPresenceInWorkplace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataOnPresenceInWorkplace }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataOnPresenceInWorkplace }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "DataOnPresenceInWorkplace")
    public JAXBElement<DataOnPresenceInWorkplace> createDataOnPresenceInWorkplace(DataOnPresenceInWorkplace value) {
        return new JAXBElement<>(_DataOnPresenceInWorkplace_QNAME, DataOnPresenceInWorkplace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAbsent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAbsent }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "ArrayOfAbsent")
    public JAXBElement<ArrayOfAbsent> createArrayOfAbsent(ArrayOfAbsent value) {
        return new JAXBElement<>(_ArrayOfAbsent_QNAME, ArrayOfAbsent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Absent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Absent }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "Absent")
    public JAXBElement<Absent> createAbsent(Absent value) {
        return new JAXBElement<>(_Absent_QNAME, Absent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDataForViolator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDataForViolator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "ArrayOfDataForViolator")
    public JAXBElement<ArrayOfDataForViolator> createArrayOfDataForViolator(ArrayOfDataForViolator value) {
        return new JAXBElement<>(_ArrayOfDataForViolator_QNAME, ArrayOfDataForViolator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataForViolator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataForViolator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "DataForViolator")
    public JAXBElement<DataForViolator> createDataForViolator(DataForViolator value) {
        return new JAXBElement<>(_DataForViolator_QNAME, DataForViolator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfViolator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfViolator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "ArrayOfViolator")
    public JAXBElement<ArrayOfViolator> createArrayOfViolator(ArrayOfViolator value) {
        return new JAXBElement<>(_ArrayOfViolator_QNAME, ArrayOfViolator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Violator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Violator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "Violator")
    public JAXBElement<Violator> createViolator(Violator value) {
        return new JAXBElement<>(_Violator_QNAME, Violator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "DepartmentName", scope = Absent.class)
    public JAXBElement<String> createAbsentDepartmentName(String value) {
        return new JAXBElement<>(_AbsentDepartmentName_QNAME, String.class, Absent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "FirstName", scope = Absent.class)
    public JAXBElement<String> createAbsentFirstName(String value) {
        return new JAXBElement<>(_AbsentFirstName_QNAME, String.class, Absent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "LastName", scope = Absent.class)
    public JAXBElement<String> createAbsentLastName(String value) {
        return new JAXBElement<>(_AbsentLastName_QNAME, String.class, Absent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "PhoneNumber", scope = Absent.class)
    public JAXBElement<String> createAbsentPhoneNumber(String value) {
        return new JAXBElement<>(_AbsentPhoneNumber_QNAME, String.class, Absent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "Position", scope = Absent.class)
    public JAXBElement<String> createAbsentPosition(String value) {
        return new JAXBElement<>(_AbsentPosition_QNAME, String.class, Absent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "SecondName", scope = Absent.class)
    public JAXBElement<String> createAbsentSecondName(String value) {
        return new JAXBElement<>(_AbsentSecondName_QNAME, String.class, Absent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "TableNumber", scope = Absent.class)
    public JAXBElement<Integer> createAbsentTableNumber(Integer value) {
        return new JAXBElement<>(_AbsentTableNumber_QNAME, Integer.class, Absent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "MessageError", scope = Violator.class)
    public JAXBElement<String> createViolatorMessageError(String value) {
        return new JAXBElement<>(_ViolatorMessageError_QNAME, String.class, Violator.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "EvaluationSystem", scope = DataForPeriodModel.class)
    public JAXBElement<Integer> createDataForPeriodModelEvaluationSystem(Integer value) {
        return new JAXBElement<>(_DataForPeriodModelEvaluationSystem_QNAME, Integer.class, DataForPeriodModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "MessageError", scope = DataForPeriodModel.class)
    public JAXBElement<String> createDataForPeriodModelMessageError(String value) {
        return new JAXBElement<>(_ViolatorMessageError_QNAME, String.class, DataForPeriodModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "List", scope = DepartmentTreeModel.class)
    public JAXBElement<String> createDepartmentTreeModelList(String value) {
        return new JAXBElement<>(_DepartmentTreeModelList_QNAME, String.class, DepartmentTreeModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "ListName", scope = DepartmentTreeModel.class)
    public JAXBElement<String> createDepartmentTreeModelListName(String value) {
        return new JAXBElement<>(_DepartmentTreeModelListName_QNAME, String.class, DepartmentTreeModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "Name", scope = DepartmentTreeModel.class)
    public JAXBElement<String> createDepartmentTreeModelName(String value) {
        return new JAXBElement<>(_DepartmentTreeModelName_QNAME, String.class, DepartmentTreeModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "ParentID", scope = DepartmentTreeModel.class)
    public JAXBElement<String> createDepartmentTreeModelParentID(String value) {
        return new JAXBElement<>(_DepartmentTreeModelParentID_QNAME, String.class, DepartmentTreeModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "DepartmentGuid", scope = PlanModel.class)
    public JAXBElement<String> createPlanModelDepartmentGuid(String value) {
        return new JAXBElement<>(_PlanModelDepartmentGuid_QNAME, String.class, PlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "DeviationValue", scope = PlanModel.class)
    public JAXBElement<Double> createPlanModelDeviationValue(Double value) {
        return new JAXBElement<>(_PlanModelDeviationValue_QNAME, Double.class, PlanModel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", name = "PlanValue", scope = PlanModel.class)
    public JAXBElement<Double> createPlanModelPlanValue(Double value) {
        return new JAXBElement<>(_PlanModelPlanValue_QNAME, Double.class, PlanModel.class, value);
    }

}
