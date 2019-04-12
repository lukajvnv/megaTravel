//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.11 at 11:58:30 PM CEST 
//


package com.megatravel.tim41.chat;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.megatravel.tim41.reservations.TRezervacijaKorisnika;
import com.megatravel.tim41.users.TKorisnik;


/**
 * <p>Java class for TPoruka complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPoruka">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Posiljalac" type="{www.megatravel.com/tim41/users}TKorisnik"/>
 *         &lt;element name="Primalac" type="{www.megatravel.com/tim41/users}TKorisnik"/>
 *         &lt;element name="Tekst">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1024"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Sadrzaj" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Rezervacija" type="{www.megatravel.com/tim41/reservations}TRezervacijaKorisnika"/>
 *       &lt;/sequence>
 *       &lt;attribute name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPoruka", propOrder = {
    "posiljalac",
    "primalac",
    "tekst",
    "sadrzaj",
    "id",
    "rezervacija"
})
public class TPoruka {

    @XmlElement(name = "Posiljalac", required = true)
    protected TKorisnik posiljalac;
    @XmlElement(name = "Primalac", required = true)
    protected TKorisnik primalac;
    @XmlElement(name = "Tekst", required = true)
    protected String tekst;
    @XmlElement(name = "Sadrzaj", required = true)
    protected Object sadrzaj;
    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(name = "Rezervacija", required = true)
    protected TRezervacijaKorisnika rezervacija;
    @XmlAttribute(name = "timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

    /**
     * Gets the value of the posiljalac property.
     * 
     * @return
     *     possible object is
     *     {@link TKorisnik }
     *     
     */
    public TKorisnik getPosiljalac() {
        return posiljalac;
    }

    /**
     * Sets the value of the posiljalac property.
     * 
     * @param value
     *     allowed object is
     *     {@link TKorisnik }
     *     
     */
    public void setPosiljalac(TKorisnik value) {
        this.posiljalac = value;
    }

    /**
     * Gets the value of the primalac property.
     * 
     * @return
     *     possible object is
     *     {@link TKorisnik }
     *     
     */
    public TKorisnik getPrimalac() {
        return primalac;
    }

    /**
     * Sets the value of the primalac property.
     * 
     * @param value
     *     allowed object is
     *     {@link TKorisnik }
     *     
     */
    public void setPrimalac(TKorisnik value) {
        this.primalac = value;
    }

    /**
     * Gets the value of the tekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTekst() {
        return tekst;
    }

    /**
     * Sets the value of the tekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTekst(String value) {
        this.tekst = value;
    }

    /**
     * Gets the value of the sadrzaj property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSadrzaj() {
        return sadrzaj;
    }

    /**
     * Sets the value of the sadrzaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSadrzaj(Object value) {
        this.sadrzaj = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the rezervacija property.
     * 
     * @return
     *     possible object is
     *     {@link TRezervacijaKorisnika }
     *     
     */
    public TRezervacijaKorisnika getRezervacija() {
        return rezervacija;
    }

    /**
     * Sets the value of the rezervacija property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRezervacijaKorisnika }
     *     
     */
    public void setRezervacija(TRezervacijaKorisnika value) {
        this.rezervacija = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

}
