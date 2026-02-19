
package com.microsoft.schemas._2003._10.serialization.arrays;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.microsoft.schemas._2003._10.serialization.arrays package. 
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

    private static final QName _ArrayOfguid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfguid");
    private static final QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private static final QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private static final QName _ArrayOfArrayOfKeyValueOfstringstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfArrayOfKeyValueOfstringstring");
    private static final QName _ArrayOfKeyValueOfstringstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringstring");
    private static final QName _ArrayOfunsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfunsignedShort");
    private static final QName _ArrayOfdateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfdateTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.microsoft.schemas._2003._10.serialization.arrays
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring }
     * 
     */
    public ArrayOfKeyValueOfstringstring createArrayOfKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link ArrayOfguid }
     * 
     */
    public ArrayOfguid createArrayOfguid() {
        return new ArrayOfguid();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link ArrayOfArrayOfKeyValueOfstringstring }
     * 
     */
    public ArrayOfArrayOfKeyValueOfstringstring createArrayOfArrayOfKeyValueOfstringstring() {
        return new ArrayOfArrayOfKeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link ArrayOfunsignedShort }
     * 
     */
    public ArrayOfunsignedShort createArrayOfunsignedShort() {
        return new ArrayOfunsignedShort();
    }

    /**
     * Create an instance of {@link ArrayOfdateTime }
     * 
     */
    public ArrayOfdateTime createArrayOfdateTime() {
        return new ArrayOfdateTime();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring.KeyValueOfstringstring }
     * 
     */
    public ArrayOfKeyValueOfstringstring.KeyValueOfstringstring createArrayOfKeyValueOfstringstringKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring.KeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfguid")
    public JAXBElement<ArrayOfguid> createArrayOfguid(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_ArrayOfguid_QNAME, ArrayOfguid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValueOfstringstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfArrayOfKeyValueOfstringstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfArrayOfKeyValueOfstringstring")
    public JAXBElement<ArrayOfArrayOfKeyValueOfstringstring> createArrayOfArrayOfKeyValueOfstringstring(ArrayOfArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfArrayOfKeyValueOfstringstring>(_ArrayOfArrayOfKeyValueOfstringstring_QNAME, ArrayOfArrayOfKeyValueOfstringstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfstringstring")
    public JAXBElement<ArrayOfKeyValueOfstringstring> createArrayOfKeyValueOfstringstring(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_ArrayOfKeyValueOfstringstring_QNAME, ArrayOfKeyValueOfstringstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedShort }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfunsignedShort }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfunsignedShort")
    public JAXBElement<ArrayOfunsignedShort> createArrayOfunsignedShort(ArrayOfunsignedShort value) {
        return new JAXBElement<ArrayOfunsignedShort>(_ArrayOfunsignedShort_QNAME, ArrayOfunsignedShort.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfdateTime }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfdateTime }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfdateTime")
    public JAXBElement<ArrayOfdateTime> createArrayOfdateTime(ArrayOfdateTime value) {
        return new JAXBElement<ArrayOfdateTime>(_ArrayOfdateTime_QNAME, ArrayOfdateTime.class, null, value);
    }

}
