//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.25 at 02:36:16 PM CEST 
//


package com.project.megatravel.model.accomodation;

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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brojKreveta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="balkon" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sObjekat" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="opis">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1024"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="otkazivanje" type="{www.model.megatravel.project.com/accomodation}TOtkazivanje"/>
 *         &lt;element name="oznaka" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = {
    "brojKreveta",
    "balkon",
    "sObjekat",
    "opis",
    "otkazivanje",
    "oznaka"
})
@XmlRootElement(name = "SmestajnaJedinica")
public class SmestajnaJedinica {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    protected Integer brojKreveta;
    @XmlElement(defaultValue = "false")
    protected boolean balkon;
    protected long sObjekat;
    @XmlElement(required = true)
    protected String opis;
    @XmlElement(required = true)
    protected Otkazivanje otkazivanje;
    @XmlElement(required = true)
    protected String oznaka;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Gets the value of the brojKreveta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getBrojKreveta() {
        return brojKreveta;
    }

    /**
     * Sets the value of the brojKreveta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojKreveta(Integer value) {
        this.brojKreveta = value;
    }

    /**
     * Gets the value of the balkon property.
     * 
     */
    public boolean isBalkon() {
        return balkon;
    }

    /**
     * Sets the value of the balkon property.
     * 
     */
    public void setBalkon(boolean value) {
        this.balkon = value;
    }

    /**
     * Gets the value of the sObjekat property.
     * 
     */
    public long getSObjekat() {
        return sObjekat;
    }

    /**
     * Sets the value of the sObjekat property.
     * 
     */
    public void setSObjekat(long value) {
        this.sObjekat = value;
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
     * Gets the value of the oznaka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOznaka() {
        return oznaka;
    }

    /**
     * Sets the value of the oznaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOznaka(String value) {
        this.oznaka = value;
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
