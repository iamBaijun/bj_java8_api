package util.properties;

import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public final class PropertiesUtil {
	
	private static Properties properties;
	
	static {
		 
		try {
			properties = new Properties();
			InputStream in = Object.class.getResourceAsStream("/config.properties");
			properties.load(in);	
		} catch (Exception e) {
			try {
				System.out.println(e);
				throw new Exception("========加载配置文件失败==========");
				
			} catch (Exception e1) {
				
				e1.printStackTrace();
			}
			
		}
	}
	
	public static Properties getProperties() {
		
		return properties;
	}
		

	/**   
	 * @Title: getVal   
	 * @author:baijun
	 * @Description: 空值处理
	 * @date:2018年6月19日下午3:04:02
	 * @param key
	 * @param pro
	 * @return
	 * @throws Exception      
	 * String      
	 * @throws   
	 */
	public static String getVal(String key) {
		
		if(StringUtils.isEmpty(key)) {
			throw new NullPointerException("========参数为空========");
		}
		
		String value = properties.getProperty(key);
		
		if(StringUtils.isEmpty(value)) {
			
			throw new NullPointerException("===========key不正确，加载配置文件失败===========");
		}
		return  value;
	}
}
