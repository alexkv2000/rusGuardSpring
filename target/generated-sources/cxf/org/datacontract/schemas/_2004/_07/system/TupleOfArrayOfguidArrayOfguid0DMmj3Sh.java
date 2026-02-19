
package org.datacontract.schemas._2004._07.system;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfguid;


/**
 * <p>Java class for TupleOfArrayOfguidArrayOfguid0dMmj3_Sh complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="TupleOfArrayOfguidArrayOfguid0dMmj3_Sh"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="m_Item1" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid"/&gt;
 *         &lt;element name="m_Item2" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfguid"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TupleOfArrayOfguidArrayOfguid0dMmj3_Sh", namespace = "http://schemas.datacontract.org/2004/07/System", propOrder = {
    "mItem1",
    "mItem2"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public class TupleOfArrayOfguidArrayOfguid0DMmj3Sh {

    @XmlElement(name = "m_Item1", namespace = "http://schemas.datacontract.org/2004/07/System", required = true, nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected ArrayOfguid mItem1;
    @XmlElement(name = "m_Item2", namespace = "http://schemas.datacontract.org/2004/07/System", required = true, nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected ArrayOfguid mItem2;

    /**
     * Gets the value of the mItem1 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public ArrayOfguid getMItem1() {
        return mItem1;
    }

    /**
     * Sets the value of the mItem1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setMItem1(ArrayOfguid value) {
        this.mItem1 = value;
    }

    /**
     * Gets the value of the mItem2 property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfguid }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public ArrayOfguid getMItem2() {
        return mItem2;
    }

    /**
     * Sets the value of the mItem2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfguid }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public void setMItem2(ArrayOfguid value) {
        this.mItem2 = value;
    }

}
