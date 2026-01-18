
package org.datacontract.schemas._2004._07.rusguard;

import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfDataOnPresenceInWorkplace complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDataOnPresenceInWorkplace">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DataOnPresenceInWorkplace" type="{http://schemas.datacontract.org/2004/07/RusGuard.Models}DataOnPresenceInWorkplace" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDataOnPresenceInWorkplace", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", propOrder = {
    "dataOnPresenceInWorkplace"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class ArrayOfDataOnPresenceInWorkplace {

    @XmlElement(name = "DataOnPresenceInWorkplace", namespace = "http://schemas.datacontract.org/2004/07/RusGuard.Models", nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected List<DataOnPresenceInWorkplace> dataOnPresenceInWorkplace;

    /**
     * Gets the value of the dataOnPresenceInWorkplace property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataOnPresenceInWorkplace property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDataOnPresenceInWorkplace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataOnPresenceInWorkplace }
     * </p>
     * 
     * 
     * @return
     *     The value of the dataOnPresenceInWorkplace property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public List<DataOnPresenceInWorkplace> getDataOnPresenceInWorkplace() {
        if (dataOnPresenceInWorkplace == null) {
            dataOnPresenceInWorkplace = new ArrayList<>();
        }
        return this.dataOnPresenceInWorkplace;
    }

}
