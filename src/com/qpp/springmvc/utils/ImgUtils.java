
package com.qpp.springmvc.utils;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


public class ImgUtils {

	static String imgBaseDir = "/qpp/img/";
	
	static SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd");
	
	public static String genOutputFilename(){
		String ext = ".jpg";
		return genOutputFilename(ext);
	}
	
	public static String genOutputFilename(String ext){
		//使用年/月/日 目录结构
		String udid = UUID.randomUUID().toString();
		String outputFileName = udid+"."+ext;
		String path = imgBaseDir + sdf.format(new Date());
	
		return path +"/"+outputFileName;
	}

	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws URISyntaxException 
	 */
	public static void main(String[] args) throws IOException {
		 Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); //得到系统剪贴板    
	     String text = "点击复制";    
	     StringSelection selection = new StringSelection(text);    
	     clipboard.setContents(selection, null); 
	}

}
