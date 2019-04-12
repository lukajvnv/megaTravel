//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.12 at 12:59:01 AM CEST 
//


package com.project.megaTravel.model.tim41;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRejting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRejting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BrojOcena">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SumaOcena">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
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
@XmlType(name = "TRejting", propOrder = {
    "brojOcena",
    "sumaOcena"
})
public class TRejting {

    @XmlElement(name = "BrojOcena", required = true)
    protected BigInteger brojOcena;
    @XmlElement(name = "SumaOcena")
    protected double sumaOcena;

    /**
     * Gets the value of the brojOcena property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBrojOcena() {
        return brojOcena;
    }

    /**
     * Sets the value of the brojOcena property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBrojOcena(BigInteger value) {
        this.brojOcena = value;
    }

    /**
     * Gets the value of the sumaOcena property.
     * 
     */
    public double getSumaOcena() {
        return sumaOcena;
    }

    /**
     * Sets the value of the sumaOcena property.
     * 
     */
    public void setSumaOcena(double value) {
        this.sumaOcena = value;
    }

}
