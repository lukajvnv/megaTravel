//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.09 at 12:21:09 AM CEST 
//


package com.project.agentBackend.model.messages.agent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.project.agentBackend.model.reservations.Rezervacija;
import com.project.agentBackend.model.reservations.RezervacijaKorisnika;


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
 *         &lt;element name="rezervacijeKorisnika" type="{www.model.megatravel.project.com/reservations}TRezervacijaKorisnika" minOccurs="0"/>
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
    "rezervacijeKorisnika",
    "rezervacijeAgenta"
})
@XmlRootElement(name = "Rezervacije")
public class Rezervacije {

    protected RezervacijaKorisnika rezervacijeKorisnika;
    protected Rezervacija rezervacijeAgenta;

    /**
     * Gets the value of the rezervacijeKorisnika property.
     * 
     * @return
     *     possible object is
     *     {@link RezervacijaKorisnika }
     *     
     */
    public RezervacijaKorisnika getRezervacijeKorisnika() {
        return rezervacijeKorisnika;
    }

    /**
     * Sets the value of the rezervacijeKorisnika property.
     * 
     * @param value
     *     allowed object is
     *     {@link RezervacijaKorisnika }
     *     
     */
    public void setRezervacijeKorisnika(RezervacijaKorisnika value) {
        this.rezervacijeKorisnika = value;
    }

    /**
     * Gets the value of the rezervacijeAgenta property.
     * 
     * @return
     *     possible object is
     *     {@link Rezervacija }
     *     
     */
    public Rezervacija getRezervacijeAgenta() {
        return rezervacijeAgenta;
    }

    /**
     * Sets the value of the rezervacijeAgenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rezervacija }
     *     
     */
    public void setRezervacijeAgenta(Rezervacija value) {
        this.rezervacijeAgenta = value;
    }

}
