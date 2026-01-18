
package org.datacontract.schemas._2004._07.system_runtime;

import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system.SystemException;
import org.datacontract.schemas._2004._07.system.Win32Exception;


/**
 * <p>Java class for ExternalException complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ExternalException">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/System}SystemException">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalException", namespace = "http://schemas.datacontract.org/2004/07/System.Runtime.InteropServices")
@XmlSeeAlso({
    Win32Exception.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class ExternalException
    extends SystemException
{


}
