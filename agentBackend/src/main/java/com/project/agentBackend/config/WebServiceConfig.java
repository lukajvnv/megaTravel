package com.project.agentBackend.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
	
	/*Bez ovoga ne realizuje dinamicki definisane beanove po njihovim url delovima...*/
	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/*");
	}
	
	

	/*url wsdl: http://localhost:8836/agent/agentBackend.wsdl */
	@Bean(name = "agentBackend")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema schema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("AgentBackendPort");
		wsdl11Definition.setLocationUri("/agent");
		wsdl11Definition.setTargetNamespace("www.model.megatravel.project.com/messages/agent");
		
		
		wsdl11Definition.setSchema(schema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema schema() {
		return new SimpleXsdSchema(new ClassPathResource("schemas/KomunikacijaAgentBackend.xsd"));
	}
	
	//url wsdl: http://localhost:8836/agent/accomodationRating.wsdl 
	@Bean(name = "accomodationRating")
	public DefaultWsdl11Definition ratingWsdl(XsdSchema ratingSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("AccomodationRatingPort");
		wsdl11Definition.setLocationUri("/agent");
		wsdl11Definition.setTargetNamespace("www.model.megatravel.project.com/messages/rating/ws");
		
		wsdl11Definition.setSchema(ratingSchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema ratingSchema() {
		return new SimpleXsdSchema(new ClassPathResource("schemas/OceneRazmena.xsd"));
	}
	
	
	//url wsdl: http://localhost:8836/agent/accomodation.wsdl 
	@Bean(name = "accomodation")
	public DefaultWsdl11Definition ratingAccomodation(XsdSchema accomodationSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("AccomodationPort");
		wsdl11Definition.setLocationUri("/agent");
		wsdl11Definition.setTargetNamespace("www.model.megatravel.project.com/accomodation/managment");
		
		wsdl11Definition.setSchema(accomodationSchema);
		return wsdl11Definition;
	}

	@Bean
	public XsdSchema accomodationSchema() {
		return new SimpleXsdSchema(new ClassPathResource("schemas/SmestajSemaManagment.xsd"));
	}
	
	//url wsdl: http://localhost:8836/agent/booking.wsdl 
	@Bean(name = "booking")
	public DefaultWsdl11Definition booking(XsdSchema bookingSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("BookingPort");
		wsdl11Definition.setLocationUri("/agent");
		wsdl11Definition.setTargetNamespace("www.model.megatravel.project.com/reservations/managment");
		
		wsdl11Definition.setSchema(bookingSchema);
		return wsdl11Definition;
	}
	
	@Bean
	public XsdSchema bookingSchema() {
		return new SimpleXsdSchema(new ClassPathResource("schemas/RezervacijaManagment.xsd"));
	}

	
}