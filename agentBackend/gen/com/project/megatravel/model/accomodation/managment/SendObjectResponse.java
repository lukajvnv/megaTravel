//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.23 at 11:02:55 AM CEST 
//


package com.project.megatravel.model.accomodation.managment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.project.megatravel.model.accomodation.SmestajniObjekat;


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
 *         &lt;element ref="{www.model.megatravel.project.com/accomodation}SmestajniObjekat"/>
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
    "smestajniObjekat"
})
@XmlRootElement(name = "sendObjectResponse")
public class SendObjectResponse {

    @XmlElement(name = "SmestajniObjekat", namespace = "www.model.megatravel.project.com/accomodation", required = true)
    protected SmestajniObjekat smestajniObjekat;

    /**
     * Gets the value of the smestajniObjekat property.
     * 
     * @return
     *     possible object is
     *     {@link SmestajniObjekat }
     *     
     */
    public SmestajniObjekat getSmestajniObjekat() {
        return smestajniObjekat;
    }

    /**
     * Sets the value of the smestajniObjekat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmestajniObjekat }
     *     
     */
    public void setSmestajniObjekat(SmestajniObjekat value) {
        this.smestajniObjekat = value;
    }

}
