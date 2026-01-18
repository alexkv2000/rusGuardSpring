
package org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities;

import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.Generated;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfLOperationResult complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfLOperationResult">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LOperationResult" type="{http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity}LOperationResult" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLOperationResult", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", propOrder = {
    "lOperationResult"
})
@Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
public class ArrayOfLOperationResult {

    @XmlElement(name = "LOperationResult", namespace = "http://schemas.datacontract.org/2004/07/VVIInvestment.RusGuard.DAL.Entities.Entity", nillable = true)
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    protected List<LOperationResult> lOperationResult;

    /**
     * Gets the value of the lOperationResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lOperationResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getLOperationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LOperationResult }
     * </p>
     * 
     * 
     * @return
     *     The value of the lOperationResult property.
     */
    @Generated(value = "com.sun.tools.xjc.Driver", comments = "JAXB RI v4.0.4", date = "2026-01-18T16:49:01+03:00")
    public List<LOperationResult> getLOperationResult() {
        if (lOperationResult == null) {
            lOperationResult = new ArrayList<>();
        }
        return this.lOperationResult;
    }

}
