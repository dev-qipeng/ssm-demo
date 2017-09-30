package sqar.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sqar.dao.mapper.CoinImgMapper;
import sqar.dao.model.CoinImg;
import sqar.dao.model.CoinImgExample;
import sqar.dao.model.CoinImgExample.Criteria;
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
