//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.23 at 01:56:54 AM CEST 
//


package com.project.megatravel.model.messages.rating.managment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.project.megatravel.model.users.AgentKredencijali;


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
 *         &lt;element ref="{www.model.megatravel.project.com/users}AgentKredencijali"/>
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
    "agentKredencijali"
})
@XmlRootElement(name = "getMessagesRequest")
public class GetMessagesRequest {

    @XmlElement(name = "AgentKredencijali", namespace = "www.model.megatravel.project.com/users", required = true)
    protected AgentKredencijali agentKredencijali;

    /**
     * Gets the value of the agentKredencijali property.
     * 
     * @return
     *     possible object is
     *     {@link AgentKredencijali }
     *     
     */
    public AgentKredencijali getAgentKredencijali() {
        return agentKredencijali;
    }

    /**
     * Sets the value of the agentKredencijali property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentKredencijali }
     *     
     */
    public void setAgentKredencijali(AgentKredencijali value) {
        this.agentKredencijali = value;
    }

}
