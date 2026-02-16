
package org.datacontract.schemas._2004._07.system;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTupleOfguidNullableOfdateTimeGOBf0pnW complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTupleOfguidNullableOfdateTimeGOBf0pnW"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TupleOfguidNullableOfdateTimeGOBf0pnW" type="{http://schemas.datacontract.org/2004/07/System}TupleOfguidNullableOfdateTimeGOBf0pnW" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTupleOfguidNullableOfdateTimeGOBf0pnW", namespace = "http://schemas.datacontract.org/2004/07/System", propOrder = {
    "tupleOfguidNullableOfdateTimeGOBf0PnW"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
public class ArrayOfTupleOfguidNullableOfdateTimeGOBf0PnW {

    @XmlElement(name = "TupleOfguidNullableOfdateTimeGOBf0pnW", namespace = "http://schemas.datacontract.org/2004/07/System", nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
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
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-16T13:19:08+03:00")
    public List<TupleOfguidNullableOfdateTimeGOBf0PnW> getTupleOfguidNullableOfdateTimeGOBf0PnW() {
        if (tupleOfguidNullableOfdateTimeGOBf0PnW == null) {
            tupleOfguidNullableOfdateTimeGOBf0PnW = new ArrayList<TupleOfguidNullableOfdateTimeGOBf0PnW>();
        }
        return this.tupleOfguidNullableOfdateTimeGOBf0PnW;
    }

}
