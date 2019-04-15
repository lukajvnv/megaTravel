//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.15 at 10:54:19 PM CEST 
//


package com.project.megatravel.model.accomodation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSmestajniObjekat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSmestajniObjekat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipSmestaja">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Hotel"/>
 *               &lt;enumeration value="Apartman"/>
 *               &lt;enumeration value="Bed&amp;Breakfast"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lokacija" type="{www.model.megatravel.project.com/accomodation}TLokacija"/>
 *         &lt;element name="smestajneJedinice" type="{www.model.megatravel.project.com/accomodation}TSmestajnaJedinica" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dodatneUsluge" type="{www.model.megatravel.project.com/accomodation}TDodatnaUsluga" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otkazivanje" type="{www.model.megatravel.project.com/accomodation}TOtkazivanje"/>
 *         &lt;element name="kategorija">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="BRONZE"/>
 *               &lt;enumeration value="SILVER"/>
 *               &lt;enumeration value="GOLD"/>
 *               &lt;enumeration value="PLATINUM"/>
 *               &lt;enumeration value="NA"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="rejting" type="{www.model.megatravel.project.com/accomodation}TRejting"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *             &lt;minInclusive value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="zvezdice">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;minInclusive value="1"/>
 *             &lt;maxInclusive value="5"/>
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
@XmlType(name = "TSmestajniObjekat", propOrder = {
    "tipSmestaja",
    "lokacija",
    "smestajneJedinice",
    "dodatneUsluge",
    "otkazivanje",
    "kategorija",
    "rejting"
})
public class SmestajniObjekat {

    @XmlElement(required = true)
    protected String tipSmestaja;
    @XmlElement(required = true)
    protected Lokacija lokacija;
    protected List<SmestajnaJedinica> smestajneJedinice;
    protected List<DodatnaUsluga> dodatneUsluge;
    @XmlElement(required = true)
    protected Otkazivanje otkazivanje;
    @XmlElement(required = true, defaultValue = "NA")
    protected String kategorija;
    @XmlElement(required = true)
    protected Rejting rejting;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "zvezdice")
    protected Integer zvezdice;

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
     * Gets the value of the smestajneJedinice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smestajneJedinice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmestajneJedinice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmestajnaJedinica }
     * 
     * 
     */
    public List<SmestajnaJedinica> getSmestajneJedinice() {
        if (smestajneJedinice == null) {
            smestajneJedinice = new ArrayList<SmestajnaJedinica>();
        }
        return this.smestajneJedinice;
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
     * {@link DodatnaUsluga }
     * 
     * 
     */
    public List<DodatnaUsluga> getDodatneUsluge() {
        if (dodatneUsluge == null) {
            dodatneUsluge = new ArrayList<DodatnaUsluga>();
        }
        return this.dodatneUsluge;
    }

    /**
     * Gets the value of the otkazivanje property.
     * 
     * @return
     *     possible object is
     *     {@link Otkazivanje }
     *     
     */
    public Otkazivanje getOtkazivanje() {
        return otkazivanje;
    }

    /**
     * Sets the value of the otkazivanje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Otkazivanje }
     *     
     */
    public void setOtkazivanje(Otkazivanje value) {
        this.otkazivanje = value;
    }

    /**
     * Gets the value of the kategorija property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKategorija() {
        return kategorija;
    }

    /**
     * Sets the value of the kategorija property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKategorija(String value) {
        this.kategorija = value;
    }

    /**
     * Gets the value of the rejting property.
     * 
     * @return
     *     possible object is
     *     {@link Rejting }
     *     
     */
    public Rejting getRejting() {
        return rejting;
    }

    /**
     * Sets the value of the rejting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rejting }
     *     
     */
    public void setRejting(Rejting value) {
        this.rejting = value;
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

    /**
     * Gets the value of the zvezdice property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZvezdice() {
        return zvezdice;
    }

    /**
     * Sets the value of the zvezdice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZvezdice(Integer value) {
        this.zvezdice = value;
    }

}
