
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_net_services;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLResourcePropertyValues complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLResourcePropertyValues"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LResourcePropertyValues" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities}LResourcePropertyValues" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLResourcePropertyValues", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", propOrder = {
    "lResourcePropertyValues"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
public class ArrayOfLResourcePropertyValues {

    @XmlElement(name = "LResourcePropertyValues", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.Net.Services.Entities", nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    protected List<LResourcePropertyValues> lResourcePropertyValues;

    /**
     * Gets the value of the lResourcePropertyValues property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lResourcePropertyValues property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLResourcePropertyValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LResourcePropertyValues }
     * </p>
     * 
     * 
     * @return
     *     The value of the lResourcePropertyValues property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v2.3.9", date = "2026-02-19T20:03:23+03:00")
    public List<LResourcePropertyValues> getLResourcePropertyValues() {
        if (lResourcePropertyValues == null) {
            lResourcePropertyValues = new ArrayList<LResourcePropertyValues>();
        }
        return this.lResourcePropertyValues;
    }

}
