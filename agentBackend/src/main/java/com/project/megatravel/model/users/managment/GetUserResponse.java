//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.23 at 11:25:15 AM CEST 
//


package com.project.megatravel.model.users.managment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.project.megatravel.model.users.KrajnjiKorisnik;


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
 *         &lt;element ref="{www.model.megatravel.project.com/users}KrajnjiKorisnik"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "krajnjiKorisnik"
})
@XmlRootElement(name = "getUserResponse")
public class GetUserResponse {

    @XmlElement(name = "KrajnjiKorisnik", namespace = "www.model.megatravel.project.com/users", required = true)
    protected KrajnjiKorisnik krajnjiKorisnik;

    /**
     * Gets the value of the krajnjiKorisnik property.
     * 
     * @return
     *     possible object is
     *     {@link KrajnjiKorisnik }
     *     
     */
    public KrajnjiKorisnik getKrajnjiKorisnik() {
        return krajnjiKorisnik;
    }

    /**
     * Sets the value of the krajnjiKorisnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link KrajnjiKorisnik }
     *     
     */
    public void setKrajnjiKorisnik(KrajnjiKorisnik value) {
        this.krajnjiKorisnik = value;
    }

}