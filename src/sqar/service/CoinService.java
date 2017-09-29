package sqar.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface CoinService {

	String uploadImg(MultipartFile file) throws IllegalStateException, IOException;

}
