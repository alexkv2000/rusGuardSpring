
package org.datacontract.schemas._2004._07.system;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system_net.SocketException;
import org.datacontract.schemas._2004._07.system_runtime.ExternalException;


/**
 * <p>Java class for Win32Exception complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Win32Exception">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/System.Runtime.InteropServices}ExternalException">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Win32Exception", namespace = "http://schemas.datacontract.org/2004/07/System.ComponentModel")
@XmlSeeAlso({
    SocketException.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
public class Win32Exception
    extends ExternalException
{


}
