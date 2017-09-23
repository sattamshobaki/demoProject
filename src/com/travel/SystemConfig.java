package com.travel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Configuration class holds system properties
 * 
 * @author Sattam
 *
 */
public class SystemConfig {

	private static SystemConfig instance = new SystemConfig();

	private static final String FILE_NAME = "config.properties";
	private static final String PROPERTY_PROTOCOL = "protocol";
	private static final String PROPERTY_SITE = "site";
	private static final String PROPERTY_SERVICE_PATH = "servicePath";
	private static final String PROPERTY_DEFAULT_PARAMS = "defaultParams";

	private Properties props = new Properties();

	private SystemConfig() {

		String path = this.getClass().getClassLoader().getResource(FILE_NAME).getPath();
		try {
			props.load(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			System.out.println("failed to find property file " + FILE_NAME);
		} catch (IOException e) {
			System.out.println("Unexpected error happened");
		}

	}

	public static SystemConfig getInstance() {
		return instance;
	}

	public String getProtocol() {
		return props.getProperty(PROPERTY_PROTOCOL);
	}

	public String getSite() {
		return props.getProperty(PROPERTY_SITE);
	}

	public String getServicePath() {
		return props.getProperty(PROPERTY_SERVICE_PATH);
	}

	public String getDefaultParams() {
		return props.getProperty(PROPERTY_DEFAULT_PARAMS);
	}
}
