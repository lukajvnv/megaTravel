//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.29 at 11:59:37 PM CEST 
//


package com.project.megatravel.model.accomodation;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (com.project.megatravel.util.MyDatatypeConverter.parseDate(value));
    }

    public String marshal(Date value) {
        return (com.project.megatravel.util.MyDatatypeConverter.printDate(value));
    }

}
