//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.12 at 12:59:01 AM CEST 
//


package com.megatravel.tim41.reservations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TKomentar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TKomentar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tekst">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1024"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Prilog" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Odobren" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TKomentar", propOrder = {
    "tekst",
    "prilog",
    "odobren"
})
public class TKomentar {

    @XmlElement(name = "Tekst", required = true)
    protected String tekst;
    @XmlElement(name = "Prilog", required = true)
    protected Object prilog;
    @XmlElement(name = "Odobren", defaultValue = "false")
    protected boolean odobren;

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
     * Gets the value of the prilog property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPrilog() {
        return prilog;
    }

    /**
     * Sets the value of the prilog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPrilog(Object value) {
        this.prilog = value;
    }

    /**
     * Gets the value of the odobren property.
     * 
     */
    public boolean isOdobren() {
        return odobren;
    }

    /**
     * Sets the value of the odobren property.
     * 
     */
    public void setOdobren(boolean value) {
        this.odobren = value;
    }

}
