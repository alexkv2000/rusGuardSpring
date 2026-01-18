
package org.datacontract.schemas._2004._07.system;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities.KeyKeeperCommandException;
import org.w3c.dom.Element;


/**
 * <p>Java class for Exception complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Exception">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <any processContents='skip' namespace='' maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *       <attribute ref="{http://schemas.microsoft.com/2003/10/Serialization/}FactoryType"/>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exception", namespace = "http://schemas.datacontract.org/2004/07/System", propOrder = {
    "any"
})
@XmlSeeAlso({
    SystemException.class,
    KeyKeeperCommandException.class,
    ApplicationException.class
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class Exception {

    @XmlAnyElement
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected List<Element> any;
    @XmlAttribute(name = "FactoryType", namespace = "http://schemas.microsoft.com/2003/10/Serialization/")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected QName factoryType;

    /**
     * Gets the value of the any property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * </p>
     * 
     * 
     * @return
     *     The value of the any property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Gets the value of the factoryType property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public QName getFactoryType() {
        return factoryType;
    }

    /**
     * Sets the value of the factoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public void setFactoryType(QName value) {
        this.factoryType = value;
    }

}
