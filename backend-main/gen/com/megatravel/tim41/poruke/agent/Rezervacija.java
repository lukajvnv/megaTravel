//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.12 at 12:58:54 AM CEST 
//


package com.megatravel.tim41.poruke.agent;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.megatravel.tim41.reservations.TRezervacija;
import com.megatravel.tim41.reservations.TRezervacijaKorisnika;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="RezervacijaKorisnika" type="{www.megatravel.com/tim41/reservations}TRezervacijaKorisnika"/>
 *         &lt;element name="RezervacijaAgenta" type="{www.megatravel.com/tim41/reservations}TRezervacija"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rezervacijaKorisnika",
    "rezervacijaAgenta"
})
@XmlRootElement(name = "Rezervacija")
public class Rezervacija {

    @XmlElement(name = "RezervacijaKorisnika")
    protected TRezervacijaKorisnika rezervacijaKorisnika;
    @XmlElement(name = "RezervacijaAgenta")
    protected TRezervacija rezervacijaAgenta;

    /**
     * Gets the value of the rezervacijaKorisnika property.
     * 
     * @return
     *     possible object is
     *     {@link TRezervacijaKorisnika }
     *     
     */
    public TRezervacijaKorisnika getRezervacijaKorisnika() {
        return rezervacijaKorisnika;
    }

    /**
     * Sets the value of the rezervacijaKorisnika property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRezervacijaKorisnika }
     *     
     */
    public void setRezervacijaKorisnika(TRezervacijaKorisnika value) {
        this.rezervacijaKorisnika = value;
    }

    /**
     * Gets the value of the rezervacijaAgenta property.
     * 
     * @return
     *     possible object is
     *     {@link TRezervacija }
     *     
     */
    public TRezervacija getRezervacijaAgenta() {
        return rezervacijaAgenta;
    }

    /**
     * Sets the value of the rezervacijaAgenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRezervacija }
     *     
     */
    public void setRezervacijaAgenta(TRezervacija value) {
        this.rezervacijaAgenta = value;
    }

}
