package sqar.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;



public class RestUtils {

	private static String IMG_BASE_URL = ConfigUtils.getImgBaseUrl();
	
	private static String IMG_BASE_URL_HTTPS = ConfigUtils.getImgBaseUrlApp();

	public static String path2url(String path) {
		if (StringUtils.isEmpty(path)) {
			return null;
		}
		if (path.startsWith("http")) {
			return path;
		}
		return IMG_BASE_URL + path;
	}
	
	public static String httpspath2url(String path) {
		if (StringUtils.isEmpty(path)) {
			return null;
		}
		if (path.startsWith("https")) {
			return path;
		}
		return IMG_BASE_URL_HTTPS + path;
	}
	

	public static void prepareReponse(HttpServletResponse response) {
		response.setCharacterEncoding("UTF-8");
	}

	public static Map<String, Object> getErrorResponse(String msg) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", "error");
		map.put("msg", msg);
		return map;
	}
	
	public static Map<String,Object> getErrorResponse(Exception e){
		String msg = e.getMessage();
		return getErrorResponse(msg);
	}

	public static Map<String, Object> getPureErrorResponse(Exception e) {
		String msg = e.getMessage();
		if (msg == null) {
			msg = e.getClass().getName();
		}
		return getErrorResponse(msg);
	}

	public static Map<String, Object> getOkResponse() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", "ok");
		return map;
	}

	public static Map<String, Object> getResponseDataMap(Map<String, Object> map) {
		Map<String, Object> data = new HashMap<String, Object>();
		map.put("data", data);
		return data;
	}

	public static Map<String, Object> getEmptyDataListResponse() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", "ok");
		map.put("data", new ArrayList<String>(0));
		return map;
	}

}
