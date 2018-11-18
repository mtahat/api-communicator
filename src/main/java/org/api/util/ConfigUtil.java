package org.api.util;

import java.util.logging.Logger;

public class ConfigUtil {
	
	private static Logger log = Logger.getLogger("ConfigUtil");
	private static String baseUrl = "http://services.groupkt.com";
	private static String basePath = "/state/get/USA/";
	private static String port = "8080";
    private static final ApiConfig apiConfig = new ApiConfig(basePath, port, baseUrl);
    
	private ConfigUtil() {
		log.info(apiConfig.toString());
	}
	
	public static ApiConfig getApiConfig() {
		return apiConfig;
	 }
}