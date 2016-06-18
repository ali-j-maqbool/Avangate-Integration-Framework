package com.flexerasoftware.fnocc.configuration;
import org.apache.log4j.Logger;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import com.flexerasoftware.fnocc.injestor.AvangateController;

@EnableConfigurationProperties
@ConfigurationProperties(locations = "classpath:application.properties", prefix="materialise")
public class MaterialiseProperties {
	static Logger log = Logger.getLogger(MaterialiseProperties.class.getName());

	private String fnoInstance;
	private String fnoUatUrl;
	private String fnoProdUrl;
	
	public String getFnoInstance() {
		return fnoInstance;
	}
	public void setFnoInstance(String fnoInstance) {
		this.fnoInstance = fnoInstance;
	}
	public String getFnoUatUrl() {
		return fnoUatUrl;
	}
	public void setFnoUatUrl(String fnoUatUrl) {
		this.fnoUatUrl = fnoUatUrl;
	}
	public String getFnoProdUrl() {
		return fnoProdUrl;
	}
	public void setFnoProdUrl(String fnoProdUrl) {
		this.fnoProdUrl = fnoProdUrl;
	}

	
	
	
	


			
}
