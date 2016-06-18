package com.flexerasoftware.fnocc.configuration;
import org.apache.log4j.Logger;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@ConfigurationProperties(locations = "classpath:application.properties", prefix="avangate")
public class SecretKeyProperties {
	static Logger log = Logger.getLogger(SecretKeyProperties.class.getName());

	private String instance;
	private String devSecretkey;
	private String testSecretkey;
	private String prodSecretkey;
	
	public String getDevSecretkey() {
		return devSecretkey;
	}
	
	public void setDevSecretkey(String devSecretkey) {
		this.devSecretkey = devSecretkey;
	}
	
	public String getTestSecretkey() {
		return testSecretkey;
	}
	
	public void setTestSecretkey(String testSecretkey) {
		this.testSecretkey = testSecretkey;
	}
	public String getProdSecretkey() {
		return prodSecretkey;
	}
	public void setProdSecretkey(String prodSecretkey) {
		this.prodSecretkey = prodSecretkey;
	}
	public String getInstance() {
		if (instance.startsWith("dev")){
			return devSecretkey;
		}else if(instance.startsWith("test")){
			return testSecretkey;
		}else if (instance.startsWith("prod")){
			return prodSecretkey;
		}else{
			return "invalid instance key identifier";
		}
	}
	public void setInstance(String instance) {
		this.instance = instance;
	}
	
	


			
}
