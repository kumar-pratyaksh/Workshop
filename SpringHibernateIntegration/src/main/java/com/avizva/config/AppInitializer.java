package com.avizva.config;

import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//Eqivalent to web.xml

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	private static final org.slf4j.Logger Logger = LoggerFactory.getLogger(AppInitializer.class);

	@Override
	protected Class[] getRootConfigClasses() {
		Logger.debug("Starting of the method getRootConfigClasses");
		return new Class[] { AppConfig.class, ApplicationContextConfig.class };
	}

	@Override
	protected Class[] getServletConfigClasses() {
		logger.debug("Starting of the metnod getServletConfigClasses");
		return new Class[] { AppConfig.class, ApplicationContextConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		Logger.debug("Starting of the method getServletMappings");
		return new String[] { "/" };
	}
}