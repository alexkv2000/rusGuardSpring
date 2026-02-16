
package org.datacontract.schemas._2004._07.system;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.AssignmentAcsKeyException;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.DataAlreadyExistsException;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.DataConsistencyException;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.DataNotFoundException;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.DriverNotFoundException;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.DriverVisualStyleNotFoundException;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.RemoveCardTypeException;


/**
 * <p>Java class for ApplicationException complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="ApplicationException"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/System}Exception"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationException", namespace = "http://schemas.datacontract.org/2004/07/System")
@XmlSeeAlso({
    DataNotFoundException.class,
    DataAlreadyExistsException.class,
    DataConsistencyException.class,
    DriverNotFoundException.class,
    DriverVisualStyleNotFoundException.class,
    RemoveCardTypeException.class,
    AssignmentAcsKeyException.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
public class ApplicationException
    extends Exception
{


}
