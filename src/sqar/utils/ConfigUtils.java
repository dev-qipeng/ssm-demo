package sqar.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtils {
	
	private static Properties configProp = null;
	
	
	private static void initConfigPropIfNeeded(){
		if(configProp!=null){
			return;
		}
		synchronized(ConfigUtils.class){
			if(configProp!=null){
				return;
			}
			configProp = new Properties();
			InputStream inStream = ConfigUtils
					.class.getResourceAsStream("/config.properties");
			try {
				configProp.load(inStream);	
			}catch (IOException e) {
				e.printStackTrace();
			}finally{
				try{
					inStream.close();	
				}catch(Exception e){
					e.printStackTrace();
				}
			}	
		}
		
	}

	
	public static String getImgBaseUrl(){
		String baseUrl = getBaseUrl();
		return baseUrl+"img/";
	}
	
	public static String getImgServerDir(){
		String baseUrl = getConfigProperties().getProperty("img_server_dir");
		if(!baseUrl.endsWith("/")){
			baseUrl+="/";
		}
		return baseUrl;
	}
	
	private static String getBaseUrl(){
		String baseUrl = getConfigProperties().getProperty("baseurl");
		if(!baseUrl.endsWith("/")){
			baseUrl+="/";
		}
		return baseUrl;
	}
	
	
	public static Properties getConfigProperties(){
		initConfigPropIfNeeded();
		return configProp;
	}
	
	

}
