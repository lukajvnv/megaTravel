//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.19 at 06:34:20 PM CEST 
//


package com.project.megatravel.model.accomodation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="lokacija" type="{www.model.megatravel.project.com/accomodation}TLokacija"/>
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
 *         &lt;element name="agent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{www.model.megatravel.project.com/accomodation}SmestajnaJedinica" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{www.model.megatravel.project.com/accomodation}DodatnaUsluga" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="slike" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *                 &lt;attribute name="putanja" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{www.model.megatravel.project.com/accomodation}tipSmestaja"/>
 *         &lt;element ref="{www.model.megatravel.project.com/accomodation}kategorijaSm"/>
 *         &lt;element name="cenovnici" type="{www.model.megatravel.project.com/accomodation}TCenovnik" maxOccurs="unbounded"/>
 *         &lt;element name="podrazumevaniCenovnik" type="{www.model.megatravel.project.com/accomodation}TCenovnik"/>
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
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
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
    "lokacija",
    "kategorija",
    "agent",
    "smestajnaJedinica",
    "dodatnaUsluga",
    "slike",
    "tipSmestaja",
    "kategorijaSm",
    "cenovnici",
    "podrazumevaniCenovnik"
})
@XmlRootElement(name = "SmestajniObjekat")
public class SmestajniObjekat {

    @XmlElement(required = true)
    protected Lokacija lokacija;
    @XmlElement(required = true, defaultValue = "NA")
    protected String kategorija;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Long agent;
    @XmlElement(name = "SmestajnaJedinica")
    protected List<SmestajnaJedinica> smestajnaJedinica;
    @XmlElement(name = "DodatnaUsluga")
    protected List<DodatnaUsluga> dodatnaUsluga;
    @XmlElement(required = true)
    protected List<SmestajniObjekat.Slike> slike;
    @XmlElement(required = true)
    protected TipSmestaja tipSmestaja;
    @XmlElement(required = true)
    protected KategorijaSm kategorijaSm;
    @XmlElement(required = true)
    protected List<Cenovnik> cenovnici;
    @XmlElement(required = true)
    protected Cenovnik podrazumevaniCenovnik;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "zvezdice")
    @XmlJavaTypeAdapter(Adapter5 .class)
    protected Integer zvezdice;

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
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Long getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgent(Long value) {
        this.agent = value;
    }

    /**
     * Gets the value of the smestajnaJedinica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smestajnaJedinica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmestajnaJedinica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmestajnaJedinica }
     * 
     * 
     */
    public List<SmestajnaJedinica> getSmestajnaJedinica() {
        if (smestajnaJedinica == null) {
            smestajnaJedinica = new ArrayList<SmestajnaJedinica>();
        }
        return this.smestajnaJedinica;
    }

    /**
     * Gets the value of the dodatnaUsluga property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dodatnaUsluga property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDodatnaUsluga().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DodatnaUsluga }
     * 
     * 
     */
    public List<DodatnaUsluga> getDodatnaUsluga() {
        if (dodatnaUsluga == null) {
            dodatnaUsluga = new ArrayList<DodatnaUsluga>();
        }
        return this.dodatnaUsluga;
    }

    /**
     * Gets the value of the slike property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slike property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlike().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmestajniObjekat.Slike }
     * 
     * 
     */
    public List<SmestajniObjekat.Slike> getSlike() {
        if (slike == null) {
            slike = new ArrayList<SmestajniObjekat.Slike>();
        }
        return this.slike;
    }

    /**
     * Gets the value of the tipSmestaja property.
     * 
     * @return
     *     possible object is
     *     {@link TipSmestaja }
     *     
     */
    public TipSmestaja getTipSmestaja() {
        return tipSmestaja;
    }

    /**
     * Sets the value of the tipSmestaja property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipSmestaja }
     *     
     */
    public void setTipSmestaja(TipSmestaja value) {
        this.tipSmestaja = value;
    }

    /**
     * Gets the value of the kategorijaSm property.
     * 
     * @return
     *     possible object is
     *     {@link KategorijaSm }
     *     
     */
    public KategorijaSm getKategorijaSm() {
        return kategorijaSm;
    }

    /**
     * Sets the value of the kategorijaSm property.
     * 
     * @param value
     *     allowed object is
     *     {@link KategorijaSm }
     *     
     */
    public void setKategorijaSm(KategorijaSm value) {
        this.kategorijaSm = value;
    }

    /**
     * Gets the value of the cenovnici property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cenovnici property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCenovnici().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cenovnik }
     * 
     * 
     */
    public List<Cenovnik> getCenovnici() {
        if (cenovnici == null) {
            cenovnici = new ArrayList<Cenovnik>();
        }
        return this.cenovnici;
    }

    /**
     * Gets the value of the podrazumevaniCenovnik property.
     * 
     * @return
     *     possible object is
     *     {@link Cenovnik }
     *     
     */
    public Cenovnik getPodrazumevaniCenovnik() {
        return podrazumevaniCenovnik;
    }

    /**
     * Sets the value of the podrazumevaniCenovnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cenovnik }
     *     
     */
    public void setPodrazumevaniCenovnik(Cenovnik value) {
        this.podrazumevaniCenovnik = value;
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
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public void setZvezdice(Integer value) {
        this.zvezdice = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
     *       &lt;attribute name="putanja" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class Slike {

        @XmlValue
        protected byte[] value;
        @XmlAttribute(name = "putanja")
        protected String putanja;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setValue(byte[] value) {
            this.value = value;
        }

        /**
         * Gets the value of the putanja property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPutanja() {
            return putanja;
        }

        /**
         * Sets the value of the putanja property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPutanja(String value) {
            this.putanja = value;
        }

    }

}
