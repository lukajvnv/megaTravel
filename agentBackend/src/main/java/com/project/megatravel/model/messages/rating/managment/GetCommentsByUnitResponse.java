//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.22 at 10:50:29 AM CEST 
//


package com.project.megatravel.model.messages.rating.managment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.project.megatravel.model.messages.rating.Ocenivanje;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{www.model.megatravel.project.com/messages/rating}Ocenivanje"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ocenivanje"
})
@XmlRootElement(name = "getCommentsByUnitResponse")
public class GetCommentsByUnitResponse {

    @XmlElement(name = "Ocenivanje", namespace = "www.model.megatravel.project.com/messages/rating")
    protected List<Ocenivanje> ocenivanje;

    /**
     * Gets the value of the ocenivanje property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ocenivanje property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOcenivanje().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ocenivanje }
     * 
     * 
     */
    public List<Ocenivanje> getOcenivanje() {
        if (ocenivanje == null) {
            ocenivanje = new ArrayList<Ocenivanje>();
        }
        return this.ocenivanje;
    }

}
