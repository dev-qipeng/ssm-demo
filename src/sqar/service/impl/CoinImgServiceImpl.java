package sqar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sqar.db.mapper.CoinImgMapper;
import sqar.db.model.CoinImg;
import sqar.db.model.CoinImgExample;
import sqar.db.model.CoinImgExample.Criteria;
import sqar.service.CoinImgService;
import sqar.utils.StringUtils;

@Service
public class CoinImgServiceImpl implements CoinImgService {

	@Autowired
	CoinImgMapper coinImgMapper;
	
	@Override
	public List<CoinImg> findCoinImgByCoinId(String id) {
		if (StringUtils.isEmpty(id)) {
			return null;
		}
		CoinImgExample example = new CoinImgExample();
		Criteria criteria = example.createCriteria();
		criteria.andCoinIdEqualTo(id);
		
		example.setOrderByClause("seq desc");
		
		return coinImgMapper.selectByExample(example);
	}

}
