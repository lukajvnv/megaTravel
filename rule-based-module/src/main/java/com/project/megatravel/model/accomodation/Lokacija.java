//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.29 at 11:59:37 PM CEST 
//


package com.project.megatravel.model.accomodation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TLokacija complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TLokacija">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="naziv">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="geoSirina" type="{www.model.megatravel.project.com/accomodation}TGeoSirina"/>
 *         &lt;element name="geoDuzina" type="{www.model.megatravel.project.com/accomodation}TGeoDuzina"/>
 *         &lt;element name="opis">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1024"/>
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TLokacija", propOrder = {
    "naziv",
    "geoSirina",
    "geoDuzina",
    "opis",
    "rejting"
})
public class Lokacija {

    @XmlElement(required = true)
    protected String naziv;
    @XmlElement(required = true)
    protected GeoSirina geoSirina;
    @XmlElement(required = true)
    protected GeoDuzina geoDuzina;
    @XmlElement(required = true)
    protected String opis;
    @XmlElement(required = true)
    protected Rejting rejting;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Gets the value of the naziv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Sets the value of the naziv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaziv(String value) {
        this.naziv = value;
    }

    /**
     * Gets the value of the geoSirina property.
     * 
     * @return
     *     possible object is
     *     {@link GeoSirina }
     *     
     */
    public GeoSirina getGeoSirina() {
        return geoSirina;
    }

    /**
     * Sets the value of the geoSirina property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoSirina }
     *     
     */
    public void setGeoSirina(GeoSirina value) {
        this.geoSirina = value;
    }

    /**
     * Gets the value of the geoDuzina property.
     * 
     * @return
     *     possible object is
     *     {@link GeoDuzina }
     *     
     */
    public GeoDuzina getGeoDuzina() {
        return geoDuzina;
    }

    /**
     * Sets the value of the geoDuzina property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoDuzina }
     *     
     */
    public void setGeoDuzina(GeoDuzina value) {
        this.geoDuzina = value;
    }

    /**
     * Gets the value of the opis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpis() {
        return opis;
    }

    /**
     * Sets the value of the opis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpis(String value) {
        this.opis = value;
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

}
