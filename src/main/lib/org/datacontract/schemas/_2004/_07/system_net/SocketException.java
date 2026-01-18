
package org.datacontract.schemas._2004._07.system_net;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.Win32Exception;


/**
 * <p>Java class for SocketException complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="SocketException">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/System.ComponentModel}Win32Exception">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocketException", namespace = "http://schemas.datacontract.org/2004/07/System.Net.Sockets")
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class SocketException
    extends Win32Exception
{


}
