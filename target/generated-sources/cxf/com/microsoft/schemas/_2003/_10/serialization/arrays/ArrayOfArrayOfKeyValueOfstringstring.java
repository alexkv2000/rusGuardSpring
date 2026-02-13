
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfArrayOfKeyValueOfstringstring complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrayOfKeyValueOfstringstring"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArrayOfKeyValueOfstringstring" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfstringstring" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfKeyValueOfstringstring", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", propOrder = {
    "arrayOfKeyValueOfstringstring"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
public class ArrayOfArrayOfKeyValueOfstringstring {

    @XmlElement(name = "ArrayOfKeyValueOfstringstring", namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-13T22:07:03+03:00")
    public List<ArrayOfKeyValueOfstringstring> getArrayOfKeyValueOfstringstring() {
        if (arrayOfKeyValueOfstringstring == null) {
            arrayOfKeyValueOfstringstring = new ArrayList<ArrayOfKeyValueOfstringstring>();
        }
        return this.arrayOfKeyValueOfstringstring;
    }

}
