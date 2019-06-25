//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.25 at 02:36:16 PM CEST 
//


package com.project.megatravel.model.reservations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{www.model.megatravel.project.com/reservations}TRezervacija">
 *       &lt;sequence>
 *         &lt;element name="cenaSmestaja">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="stanje">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="REZERVISANO"/>
 *               &lt;enumeration value="U TOKU"/>
 *               &lt;enumeration value="OTKAZANO"/>
 *               &lt;enumeration value="REALIZOVANO"/>
 *               &lt;enumeration value="U OBRADI"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="korisnik">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ocenjeno" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dodatneUsluge" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="datumRezervacije">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *             &lt;minInclusive value="1900-01-01"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cenaSmestaja",
    "stanje",
    "korisnik",
    "ocenjeno",
    "dodatneUsluge"
})
@XmlRootElement(name = "RezervacijaKorisnika")
public class RezervacijaKorisnika
    extends TRezervacija
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    protected Double cenaSmestaja;
    @XmlElement(required = true)
    protected String stanje;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected Long korisnik;
    @XmlElement(defaultValue = "false")
    protected boolean ocenjeno;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter6 .class)
    protected List<Long> dodatneUsluge;
    @XmlAttribute(name = "datumRezervacije")
    @XmlJavaTypeAdapter(Adapter7 .class)
    protected Date datumRezervacije;

    /**
     * Gets the value of the cenaSmestaja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getCenaSmestaja() {
        return cenaSmestaja;
    }

    /**
     * Sets the value of the cenaSmestaja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenaSmestaja(Double value) {
        this.cenaSmestaja = value;
    }

    /**
     * Gets the value of the stanje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStanje() {
        return stanje;
    }

    /**
     * Sets the value of the stanje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStanje(String value) {
        this.stanje = value;
    }

    /**
     * Gets the value of the korisnik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getKorisnik() {
        return korisnik;
    }

    /**
     * Sets the value of the korisnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKorisnik(Long value) {
        this.korisnik = value;
    }

    /**
     * Gets the value of the ocenjeno property.
     * 
     */
    public boolean isOcenjeno() {
        return ocenjeno;
    }

    /**
     * Sets the value of the ocenjeno property.
     * 
     */
    public void setOcenjeno(boolean value) {
        this.ocenjeno = value;
    }

    /**
     * Gets the value of the dodatneUsluge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dodatneUsluge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDodatneUsluge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<Long> getDodatneUsluge() {
        if (dodatneUsluge == null) {
            dodatneUsluge = new ArrayList<Long>();
        }
        return this.dodatneUsluge;
    }

    /**
     * Gets the value of the datumRezervacije property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDatumRezervacije() {
        return datumRezervacije;
    }

    /**
     * Sets the value of the datumRezervacije property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumRezervacije(Date value) {
        this.datumRezervacije = value;
    }

}
