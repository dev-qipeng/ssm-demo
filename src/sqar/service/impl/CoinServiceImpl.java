package sqar.service.impl;

import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import sqar.service.CoinService;
import sqar.utils.ImgUtils;

@Service
public class CoinServiceImpl implements CoinService {

	@Override
	public String uploadImg(MultipartFile file) throws IllegalStateException, IOException {
		System.out.println("service上传文件");
		
		String path = ImgUtils.uploadImg(file);
		
		System.out.println("图片上传路径：E:/qpp/" + path);
		

		return path;
	}
}
