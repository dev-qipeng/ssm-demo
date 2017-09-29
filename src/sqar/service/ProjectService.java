package sqar.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface ProjectService {

	String uploadImg(MultipartFile file) throws IllegalStateException, IOException;

}
