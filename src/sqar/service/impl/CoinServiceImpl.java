package sqar.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import sqar.dao.mapper.CoinImgMapper;
import sqar.dao.mapper.CoinMapper;
import sqar.dao.model.Coin;
import sqar.dao.model.CoinExample;
import sqar.dao.model.CoinExample.Criteria;
import sqar.dao.model.CoinImg;
import sqar.service.CoinService;
import sqar.utils.IDGenerator;
import sqar.utils.ImgUtils;
import sqar.utils.RestUtils;
import sqar.utils.StringUtils;

@Service
public class CoinServiceImpl implements CoinService {

	@Autowired
	CoinMapper coinMapper;
	
	@Autowired
	CoinImgMapper coinImgMapper;
	

	@Override
	public List<Coin> findCoinList(String dynasty) {
		CoinExample example = new CoinExample();
		Criteria criteria = example.createCriteria();
		if (!StringUtils.isEmpty(dynasty)) {
			criteria.andDynastyEqualTo(dynasty);
		}
		//设置顺序。。。
		return coinMapper.selectByExample(example);
	}
	
	@Override
	public Coin findCoinById(String coinId) {
		return coinMapper.selectByPrimaryKey(coinId);
	}
	
	
	
	@Override
	public String uploadImg(MultipartFile file, String coinId) throws Exception {
		System.out.println("service上传文件");
		
		String path = ImgUtils.uploadImg(file);
		
		System.out.println("图片上传路径：E:/qpp/" + path);
		if (path == null || path.equals("")) {
			throw new Exception();
		}
		CoinImg coinImg = new CoinImg();
		coinImg.setId(IDGenerator.getUuid());
		coinImg.setCoinId(coinId);
		coinImg.setPicUrl(path);
		coinImg.setSeq(null);
		
		coinImgMapper.insert(coinImg);
		return path;
	}




}
