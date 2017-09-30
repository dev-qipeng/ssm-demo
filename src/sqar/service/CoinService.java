package sqar.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import sqar.dao.model.Coin;

public interface CoinService {
	
	List<Coin> findCoinList(String dynasty);
	
	Coin findCoinById(String coinId);

	String uploadImg(MultipartFile file, String coinId) throws Exception;


}
