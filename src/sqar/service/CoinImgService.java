package sqar.service;

import java.util.List;

import sqar.db.model.CoinImg;

public interface CoinImgService {

	List<CoinImg> findCoinImgByCoinId(String id);

}
