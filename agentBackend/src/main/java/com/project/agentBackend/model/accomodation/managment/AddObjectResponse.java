//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.09 at 01:19:16 AM CEST 
//


package com.project.agentBackend.model.accomodation.managment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.project.agentBackend.model.accomodation.SmestajniObjekat;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="object" type="{www.model.megatravel.project.com/accomodation}TSmestajniObjekat"/>
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
    "object"
})
@XmlRootElement(name = "addObjectResponse")
public class AddObjectResponse {

    @XmlElement(required = true)
    protected SmestajniObjekat object;

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link SmestajniObjekat }
     *     
     */
    public SmestajniObjekat getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmestajniObjekat }
     *     
     */
    public void setObject(SmestajniObjekat value) {
        this.object = value;
    }

}
