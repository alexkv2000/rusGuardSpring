
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArrayOfKeyValueOfstringstring complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfArrayOfKeyValueOfstringstring">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ArrayOfKeyValueOfstringstring" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfKeyValueOfstringstring", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", propOrder = {
    "arrayOfKeyValueOfstringstring"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class ArrayOfArrayOfKeyValueOfstringstring {

    @XmlElement(name = "ArrayOfKeyValueOfstringstring", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected List<ArrayOfKeyValueOfstringstring> arrayOfKeyValueOfstringstring;

    /**
     * Gets the value of the arrayOfKeyValueOfstringstring property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrayOfKeyValueOfstringstring property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getArrayOfKeyValueOfstringstring().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfstringstring }
     * </p>
     * 
     * 
     * @return
     *     The value of the arrayOfKeyValueOfstringstring property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public List<ArrayOfKeyValueOfstringstring> getArrayOfKeyValueOfstringstring() {
        if (arrayOfKeyValueOfstringstring == null) {
            arrayOfKeyValueOfstringstring = new ArrayList<>();
        }
        return this.arrayOfKeyValueOfstringstring;
    }

}
