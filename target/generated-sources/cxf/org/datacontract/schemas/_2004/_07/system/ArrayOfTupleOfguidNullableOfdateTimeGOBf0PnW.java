
package org.datacontract.schemas._2004._07.system;

import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTupleOfguidNullableOfdateTimeGOBf0pnW complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfTupleOfguidNullableOfdateTimeGOBf0pnW">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TupleOfguidNullableOfdateTimeGOBf0pnW" type="{http://schemas.datacontract.org/2004/07/System}TupleOfguidNullableOfdateTimeGOBf0pnW" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTupleOfguidNullableOfdateTimeGOBf0pnW", namespace = "http://schemas.datacontract.org/2004/07/System", propOrder = {
    "tupleOfguidNullableOfdateTimeGOBf0PnW"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
public class ArrayOfTupleOfguidNullableOfdateTimeGOBf0PnW {

    @XmlElement(name = "TupleOfguidNullableOfdateTimeGOBf0pnW", namespace = "http://schemas.datacontract.org/2004/07/System", nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    protected List<TupleOfguidNullableOfdateTimeGOBf0PnW> tupleOfguidNullableOfdateTimeGOBf0PnW;

    /**
     * Gets the value of the tupleOfguidNullableOfdateTimeGOBf0PnW property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tupleOfguidNullableOfdateTimeGOBf0PnW property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTupleOfguidNullableOfdateTimeGOBf0PnW().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TupleOfguidNullableOfdateTimeGOBf0PnW }
     * </p>
     * 
     * 
     * @return
     *     The value of the tupleOfguidNullableOfdateTimeGOBf0PnW property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-02-09T18:27:41+03:00")
    public List<TupleOfguidNullableOfdateTimeGOBf0PnW> getTupleOfguidNullableOfdateTimeGOBf0PnW() {
        if (tupleOfguidNullableOfdateTimeGOBf0PnW == null) {
            tupleOfguidNullableOfdateTimeGOBf0PnW = new ArrayList<>();
        }
        return this.tupleOfguidNullableOfdateTimeGOBf0PnW;
    }

}
