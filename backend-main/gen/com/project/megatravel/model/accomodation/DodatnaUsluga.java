//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.16 at 09:11:57 AM CEST 
//


package com.project.megatravel.model.accomodation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for TDodatnaUsluga complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDodatnaUsluga">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cena">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *                 &lt;attribute name="Valuta" type="{http://www.w3.org/2001/XMLSchema}string" default="Euro" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ime">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="jedinicaPlacanja">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="PO_DANU"/>
 *               &lt;enumeration value="PO_OSOBI"/>
 *               &lt;enumeration value="UKUPNO"/>
 *               &lt;enumeration value="PO_DANU_PO_OSOBI"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="smestajniObjekat" type="{www.model.megatravel.project.com/accomodation}TSmestajniObjekat"/>
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
@XmlType(name = "TDodatnaUsluga", propOrder = {
    "cena",
    "ime",
    "jedinicaPlacanja",
    "smestajniObjekat"
})
public class DodatnaUsluga {

    @XmlElement(required = true)
    protected DodatnaUsluga.Cena cena;
    @XmlElement(required = true)
    protected String ime;
    @XmlElement(required = true)
    protected String jedinicaPlacanja;
    @XmlElement(required = true)
    protected SmestajniObjekat smestajniObjekat;
    @XmlAttribute(name = "id")
    protected Long id;

    /**
     * Gets the value of the cena property.
     * 
     * @return
     *     possible object is
     *     {@link DodatnaUsluga.Cena }
     *     
     */
    public DodatnaUsluga.Cena getCena() {
        return cena;
    }

    /**
     * Sets the value of the cena property.
     * 
     * @param value
     *     allowed object is
     *     {@link DodatnaUsluga.Cena }
     *     
     */
    public void setCena(DodatnaUsluga.Cena value) {
        this.cena = value;
    }

    /**
     * Gets the value of the ime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIme() {
        return ime;
    }

    /**
     * Sets the value of the ime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIme(String value) {
        this.ime = value;
    }

    /**
     * Gets the value of the jedinicaPlacanja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJedinicaPlacanja() {
        return jedinicaPlacanja;
    }

    /**
     * Sets the value of the jedinicaPlacanja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJedinicaPlacanja(String value) {
        this.jedinicaPlacanja = value;
    }

    /**
     * Gets the value of the smestajniObjekat property.
     * 
     * @return
     *     possible object is
     *     {@link SmestajniObjekat }
     *     
     */
    public SmestajniObjekat getSmestajniObjekat() {
        return smestajniObjekat;
    }

    /**
     * Sets the value of the smestajniObjekat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmestajniObjekat }
     *     
     */
    public void setSmestajniObjekat(SmestajniObjekat value) {
        this.smestajniObjekat = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
     *       &lt;attribute name="Valuta" type="{http://www.w3.org/2001/XMLSchema}string" default="Euro" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Cena {

        @XmlValue
        protected double value;
        @XmlAttribute(name = "Valuta")
        protected String valuta;

        /**
         * Gets the value of the value property.
         * 
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(double value) {
            this.value = value;
        }

        /**
         * Gets the value of the valuta property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValuta() {
            if (valuta == null) {
                return "Euro";
            } else {
                return valuta;
            }
        }

        /**
         * Sets the value of the valuta property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValuta(String value) {
            this.valuta = value;
        }

    }

}
