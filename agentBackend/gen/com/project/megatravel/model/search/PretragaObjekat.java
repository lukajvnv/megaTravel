//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.22 at 12:52:41 AM CEST 
//


package com.project.megatravel.model.search;

import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.project.megatravel.model.accomodation.Lokacija;


/**
 * <p>Java class for TPretraga complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPretraga">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lokacija" type="{www.model.megatravel.project.com/accomodation}TLokacija"/>
 *         &lt;element name="dolazak">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;minInclusive value="1900-01-01"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="odlazak">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *               &lt;minInclusive value="1900-01-01"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="brojOsoba">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tipSmestaja" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Hotel"/>
 *               &lt;enumeration value="Apartman"/>
 *               &lt;enumeration value="Bed&amp;Breakfast"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kategorijaSmestaja" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NA"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *               &lt;enumeration value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="udaljenost" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="besplatnoOtkazivanje" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="otkazivanjePre" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPretraga", propOrder = {
    "lokacija",
    "dolazak",
    "odlazak",
    "brojOsoba",
    "tipSmestaja",
    "kategorijaSmestaja",
    "udaljenost",
    "besplatnoOtkazivanje",
    "otkazivanjePre"
})
public class PretragaObjekat {

    @XmlElement(required = true)
    protected Lokacija lokacija;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Date dolazak;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Date odlazak;
    @XmlElement(required = true)
    protected BigInteger brojOsoba;
    protected String tipSmestaja;
    protected String kategorijaSmestaja;
    protected Double udaljenost;
    @XmlElement(defaultValue = "false")
    protected Boolean besplatnoOtkazivanje;
    protected BigInteger otkazivanjePre;

    /**
     * Gets the value of the lokacija property.
     * 
     * @return
     *     possible object is
     *     {@link Lokacija }
     *     
     */
    public Lokacija getLokacija() {
        return lokacija;
    }

    /**
     * Sets the value of the lokacija property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lokacija }
     *     
     */
    public void setLokacija(Lokacija value) {
        this.lokacija = value;
    }

    /**
     * Gets the value of the dolazak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getDolazak() {
        return dolazak;
    }

    /**
     * Sets the value of the dolazak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDolazak(Date value) {
        this.dolazak = value;
    }

    /**
     * Gets the value of the odlazak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getOdlazak() {
        return odlazak;
    }

    /**
     * Sets the value of the odlazak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdlazak(Date value) {
        this.odlazak = value;
    }

    /**
     * Gets the value of the brojOsoba property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrojOsoba() {
        return brojOsoba;
    }

    /**
     * Sets the value of the brojOsoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrojOsoba(BigInteger value) {
        this.brojOsoba = value;
    }

    /**
     * Gets the value of the tipSmestaja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipSmestaja() {
        return tipSmestaja;
    }

    /**
     * Sets the value of the tipSmestaja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipSmestaja(String value) {
        this.tipSmestaja = value;
    }

    /**
     * Gets the value of the kategorijaSmestaja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKategorijaSmestaja() {
        return kategorijaSmestaja;
    }

    /**
     * Sets the value of the kategorijaSmestaja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKategorijaSmestaja(String value) {
        this.kategorijaSmestaja = value;
    }

    /**
     * Gets the value of the udaljenost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getUdaljenost() {
        return udaljenost;
    }

    /**
     * Sets the value of the udaljenost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setUdaljenost(Double value) {
        this.udaljenost = value;
    }

    /**
     * Gets the value of the besplatnoOtkazivanje property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBesplatnoOtkazivanje() {
        return besplatnoOtkazivanje;
    }

    /**
     * Sets the value of the besplatnoOtkazivanje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBesplatnoOtkazivanje(Boolean value) {
        this.besplatnoOtkazivanje = value;
    }

    /**
     * Gets the value of the otkazivanjePre property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtkazivanjePre() {
        return otkazivanjePre;
    }

    /**
     * Sets the value of the otkazivanjePre property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtkazivanjePre(BigInteger value) {
        this.otkazivanjePre = value;
    }

}
