//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.22 at 10:53:54 AM CEST 
//


package com.project.megatravel.model.accomodation.managment;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.project.megatravel.model.accomodation.KategorijaSm;


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
 *         &lt;element ref="{www.model.megatravel.project.com/accomodation}kategorijaSm"/>
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
    "kategorijaSm"
})
@XmlRootElement(name = "getAllCategoriesResponse")
public class GetAllCategoriesResponse {

    @XmlElement(namespace = "www.model.megatravel.project.com/accomodation")
    protected List<KategorijaSm> kategorijaSm;

    /**
     * Gets the value of the kategorijaSm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kategorijaSm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKategorijaSm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KategorijaSm }
     * 
     * 
     */
    public List<KategorijaSm> getKategorijaSm() {
        if (kategorijaSm == null) {
            kategorijaSm = new ArrayList<KategorijaSm>();
        }
        return this.kategorijaSm;
    }

}
