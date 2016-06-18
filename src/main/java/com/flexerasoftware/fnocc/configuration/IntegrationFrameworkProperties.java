package com.flexerasoftware.fnocc.configuration;

import org.apache.log4j.Logger;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@ConfigurationProperties(locations = "classpath:application.properties", prefix="integrationFramework")
public class IntegrationFrameworkProperties {
	static Logger log = Logger.getLogger(IntegrationFrameworkProperties.class.getName());

	private Boolean devMode;

	public Boolean getDevMode() {
        setDevMode(devMode);
		return devMode.booleanValue();
	}

    public void setDevMode(boolean devMode) {
        this.devMode = devMode;
    }
}
