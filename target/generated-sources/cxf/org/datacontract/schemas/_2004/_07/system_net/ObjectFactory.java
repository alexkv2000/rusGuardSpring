
package org.datacontract.schemas._2004._07.system_net;

import javax.annotation.Generated;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.system_net package. 
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

    private static final QName _SocketException_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Net.Sockets", "SocketException");
    private static final QName _AddressFamily_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Net.Sockets", "AddressFamily");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.system_net
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SocketException }
     * 
     */
    public SocketException createSocketException() {
        return new SocketException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocketException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SocketException }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Net.Sockets", name = "SocketException")
    public JAXBElement<SocketException> createSocketException(SocketException value) {
        return new JAXBElement<SocketException>(_SocketException_QNAME, SocketException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressFamily }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressFamily }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Net.Sockets", name = "AddressFamily")
    public JAXBElement<AddressFamily> createAddressFamily(AddressFamily value) {
        return new JAXBElement<AddressFamily>(_AddressFamily_QNAME, AddressFamily.class, null, value);
    }

}
