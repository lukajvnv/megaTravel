//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.23 at 01:57:01 AM CEST 
//


package com.project.megatravel.model.reservations;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter4
    extends XmlAdapter<String, Double>
{


    public Double unmarshal(String value) {
        return (com.project.megatravel.util.MyDatatypeConverter.parseDouble(value));
    }

    public String marshal(Double value) {
        return (com.project.megatravel.util.MyDatatypeConverter.printDouble(value));
    }

}
