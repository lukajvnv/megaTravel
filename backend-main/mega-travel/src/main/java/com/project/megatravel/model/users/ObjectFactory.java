//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.29 at 08:15:10 PM CEST 
//


package com.project.megatravel.model.users;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.project.megatravel.model.users package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.project.megatravel.model.users
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KrajnjiKorisnik }
     * 
     */
    public KrajnjiKorisnik createKrajnjiKorisnik() {
        return new KrajnjiKorisnik();
    }

    /**
     * Create an instance of {@link KrajnjiKorisnik.Rezervacije }
     * 
     */
    public KrajnjiKorisnik.Rezervacije createKrajnjiKorisnikRezervacije() {
        return new KrajnjiKorisnik.Rezervacije();
    }

    /**
     * Create an instance of {@link Kupon }
     * 
     */
    public Kupon createKupon() {
        return new Kupon();
    }

    /**
     * Create an instance of {@link Agent }
     * 
     */
    public Agent createAgent() {
        return new Agent();
    }

    /**
     * Create an instance of {@link AgentKredencijali }
     * 
     */
    public AgentKredencijali createAgentKredencijali() {
        return new AgentKredencijali();
    }

    /**
     * Create an instance of {@link Administrator }
     * 
     */
    public Administrator createAdministrator() {
        return new Administrator();
    }

}
