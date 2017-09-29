
package sqar.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class ImgUtils {

	static String imgBaseDir = "/qpp/img/";
	static String imgBaseUrl = "127.0.0.1:8080/img/";

	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

	public static String genOutputFilename() {
		String ext = ".jpg";
		return genOutputFilename(ext);
	}

	public static String genOutputFilename(String ext) {
		// 使用年/月/日 目录结构
		if (isImg(ext)) {
			String udid = UUID.randomUUID().toString();
			String outputFileName = udid + "." + ext;
			String path = sdf.format(new Date());
			return path + "/" + outputFileName;
		}
		return "";
	}

	public static boolean isImg(String ext){
		if ("PNG".equals(ext.toUpperCase()) || "JPG".equals(ext.toUpperCase()) || "GIF".equals(ext.toUpperCase())) {
			return true;
		}
		return false;
	}

	public static String getExtName(String filename) {
		int idx = filename.lastIndexOf(".");
		String suffix = null;
		if (idx > 0) {
			suffix = filename.substring(idx + 1);
			return suffix;
		} else {
			return "";
		}
	}

	public static String uploadImg(MultipartFile file) throws IllegalStateException, IOException {
		String filename = file.getOriginalFilename();//获取源文件名
		String ext = ImgUtils.getExtName(filename);//获取文件后缀
		String path = ImgUtils.genOutputFilename(ext);//获取文件上传路径
		File f = new File(imgBaseDir+path);
		f.getParentFile().mkdirs();
		file.transferTo(f);//开始上传到指定目录
		return imgBaseUrl+path;
	}
	
}
