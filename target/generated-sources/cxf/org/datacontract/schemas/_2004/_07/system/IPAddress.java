
package org.datacontract.schemas._2004._07.system;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfunsignedShort;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.system_net.AddressFamily;


/**
 * <p>Java class for IPAddress complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="IPAddress">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="m_Address" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="m_Family" type="{http://schemas.datacontract.org/2004/07/System.Net.Sockets}AddressFamily"/>
 *         <element name="m_HashCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="m_Numbers" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfunsignedShort"/>
 *         <element name="m_ScopeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPAddress", namespace = "http://schemas.datacontract.org/2004/07/System.Net", propOrder = {
    "mAddress",
    "mFamily",
    "mHashCode",
    "mNumbers",
    "mScopeId"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
public class IPAddress {

    @XmlElement(name = "m_Address", namespace = "http://schemas.datacontract.org/2004/07/System.Net")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected long mAddress;
    @XmlElement(name = "m_Family", namespace = "http://schemas.datacontract.org/2004/07/System.Net", required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected AddressFamily mFamily;
    @XmlElement(name = "m_HashCode", namespace = "http://schemas.datacontract.org/2004/07/System.Net")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected int mHashCode;
    @XmlElement(name = "m_Numbers", namespace = "http://schemas.datacontract.org/2004/07/System.Net", required = true, nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected ArrayOfunsignedShort mNumbers;
    @XmlElement(name = "m_ScopeId", namespace = "http://schemas.datacontract.org/2004/07/System.Net")
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected long mScopeId;

    /**
     * Gets the value of the mAddress property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public long getMAddress() {
        return mAddress;
    }

    /**
     * Sets the value of the mAddress property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setMAddress(long value) {
        this.mAddress = value;
    }

    /**
     * Gets the value of the mFamily property.
     * 
     * @return
     *     possible object is
     *     {@link AddressFamily }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public AddressFamily getMFamily() {
        return mFamily;
    }

    /**
     * Sets the value of the mFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressFamily }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setMFamily(AddressFamily value) {
        this.mFamily = value;
    }

    /**
     * Gets the value of the mHashCode property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public int getMHashCode() {
        return mHashCode;
    }

    /**
     * Sets the value of the mHashCode property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setMHashCode(int value) {
        this.mHashCode = value;
    }

    /**
     * Gets the value of the mNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfunsignedShort }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public ArrayOfunsignedShort getMNumbers() {
        return mNumbers;
    }

    /**
     * Sets the value of the mNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfunsignedShort }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setMNumbers(ArrayOfunsignedShort value) {
        this.mNumbers = value;
    }

    /**
     * Gets the value of the mScopeId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public long getMScopeId() {
        return mScopeId;
    }

    /**
     * Sets the value of the mScopeId property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public void setMScopeId(long value) {
        this.mScopeId = value;
    }

}
