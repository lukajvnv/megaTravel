//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.29 at 07:10:20 PM CEST 
//


package com.project.megatravel.model.messages.agent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.project.megatravel.model.reservations.TRezervacija;


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
 *         &lt;element name="rezervacijeAgenta" type="{www.model.megatravel.project.com/reservations}TRezervacija" minOccurs="0"/>
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
    "rezervacijeAgenta"
})
@XmlRootElement(name = "Rezervacije")
public class Rezervacije {

    protected TRezervacija rezervacijeAgenta;

    /**
     * Gets the value of the rezervacijeAgenta property.
     * 
     * @return
     *     possible object is
     *     {@link TRezervacija }
     *     
     */
    public TRezervacija getRezervacijeAgenta() {
        return rezervacijeAgenta;
    }

    /**
     * Sets the value of the rezervacijeAgenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRezervacija }
     *     
     */
    public void setRezervacijeAgenta(TRezervacija value) {
        this.rezervacijeAgenta = value;
    }

}
