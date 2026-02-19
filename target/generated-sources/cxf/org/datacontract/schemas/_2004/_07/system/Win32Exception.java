
package org.datacontract.schemas._2004._07.system;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system_net.SocketException;
import org.datacontract.schemas._2004._07.system_runtime.ExternalException;


/**
 * <p>Java class for Win32Exception complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="Win32Exception"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/System.Runtime.InteropServices}ExternalException"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Win32Exception", namespace = "http://schemas.datacontract.org/2004/07/System.ComponentModel")
@XmlSeeAlso({
    SocketException.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public class Win32Exception
    extends ExternalException
{


}
