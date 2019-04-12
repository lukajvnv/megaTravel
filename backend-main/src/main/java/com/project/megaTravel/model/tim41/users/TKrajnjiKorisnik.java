//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.12 at 12:59:01 AM CEST 
//


package com.project.megaTravel.model.tim41.users;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.project.megaTravel.model.tim41.reservations.TRezervacijaKorisnika;


/**
 * <p>Java class for TKrajnjiKorisnik complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TKrajnjiKorisnik">
 *   &lt;complexContent>
 *     &lt;extension base="{www.megatravel.com/tim41/users}TKorisnik">
 *       &lt;sequence>
 *         &lt;element name="Rezervacije" type="{www.megatravel.com/tim41/reservations}TRezervacijaKorisnika" maxOccurs="unbounded"/>
 *         &lt;element name="Klasa">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="BRONZE"/>
 *               &lt;enumeration value="SILVER"/>
 *               &lt;enumeration value="GOLD"/>
 *               &lt;enumeration value="PLATINUM"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PonudjenPopustNakonOtkazivanja" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TKrajnjiKorisnik", propOrder = {
    "rezervacije",
    "klasa",
    "ponudjenPopustNakonOtkazivanja"
})
public class TKrajnjiKorisnik
    extends TKorisnik
{

    @XmlElement(name = "Rezervacije", required = true)
    protected List<TRezervacijaKorisnika> rezervacije;
    @XmlElement(name = "Klasa", required = true, defaultValue = "BRONZE")
    protected String klasa;
    @XmlElement(name = "PonudjenPopustNakonOtkazivanja", defaultValue = "false")
    protected boolean ponudjenPopustNakonOtkazivanja;

    /**
     * Gets the value of the rezervacije property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rezervacije property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRezervacije().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TRezervacijaKorisnika }
     * 
     * 
     */
    public List<TRezervacijaKorisnika> getRezervacije() {
        if (rezervacije == null) {
            rezervacije = new ArrayList<TRezervacijaKorisnika>();
        }
        return this.rezervacije;
    }

    /**
     * Gets the value of the klasa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlasa() {
        return klasa;
    }

    /**
     * Sets the value of the klasa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKlasa(String value) {
        this.klasa = value;
    }

    /**
     * Gets the value of the ponudjenPopustNakonOtkazivanja property.
     * 
     */
    public boolean isPonudjenPopustNakonOtkazivanja() {
        return ponudjenPopustNakonOtkazivanja;
    }

    /**
     * Sets the value of the ponudjenPopustNakonOtkazivanja property.
     * 
     */
    public void setPonudjenPopustNakonOtkazivanja(boolean value) {
        this.ponudjenPopustNakonOtkazivanja = value;
    }

}
