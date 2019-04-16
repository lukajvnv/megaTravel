//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.16 at 09:11:57 AM CEST 
//


package com.project.megatravel.model.reservations;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.project.megatravel.model.accomodation.SmestajnaJedinica;


/**
 * <p>Java class for TRezervacija complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRezervacija">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datumPocetka">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;minInclusive value="1900-01-01"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="datumZavrsetka">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;minInclusive value="1900-01-01"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="smestaj" type="{www.model.megatravel.project.com/accomodation}TSmestajnaJedinica"/>
 *         &lt;element name="popust">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *             &lt;minInclusive value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRezervacija", propOrder = {
    "datumPocetka",
    "datumZavrsetka",
    "smestaj",
    "popust"
})
@XmlSeeAlso({
    RezervacijaKorisnika.class
})
public class Rezervacija {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date datumPocetka;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date datumZavrsetka;
    @XmlElement(required = true)
    protected SmestajnaJedinica smestaj;
    protected double popust;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Gets the value of the datumPocetka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDatumPocetka() {
        return datumPocetka;
    }

    /**
     * Sets the value of the datumPocetka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumPocetka(Date value) {
        this.datumPocetka = value;
    }

    /**
     * Gets the value of the datumZavrsetka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDatumZavrsetka() {
        return datumZavrsetka;
    }

    /**
     * Sets the value of the datumZavrsetka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumZavrsetka(Date value) {
        this.datumZavrsetka = value;
    }

    /**
     * Gets the value of the smestaj property.
     * 
     * @return
     *     possible object is
     *     {@link SmestajnaJedinica }
     *     
     */
    public SmestajnaJedinica getSmestaj() {
        return smestaj;
    }

    /**
     * Sets the value of the smestaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmestajnaJedinica }
     *     
     */
    public void setSmestaj(SmestajnaJedinica value) {
        this.smestaj = value;
    }

    /**
     * Gets the value of the popust property.
     * 
     */
    public double getPopust() {
        return popust;
    }

    /**
     * Sets the value of the popust property.
     * 
     */
    public void setPopust(double value) {
        this.popust = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

}
