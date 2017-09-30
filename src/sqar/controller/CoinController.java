package sqar.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import sqar.controller.vo.CoinVO;
import sqar.dao.model.Coin;
import sqar.dao.model.CoinImg;
import sqar.service.CoinImgService;
import sqar.service.CoinService;
import sqar.utils.RestUtils;

@Controller
public class CoinController {

	@Autowired
	private CoinService coinService;
	
	@Autowired
	private CoinImgService coinImgService;

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String fileUpload(MultipartFile file,@RequestParam(value="coinId",required=true) String coinId,Model model)
			throws IllegalStateException, IOException {
		System.out.println("开始执行,coinId="+coinId);
		if (file == null) {
			return "";
		}
		Coin coin = coinService.findCoinById(coinId);
		if (coin == null) {
			return "";
		}
		try {
			String url = coinService.uploadImg(file,coinId);
			model.addAttribute("imgUrl", url);
			return "upload_success";
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	@RequestMapping("list")
	public String listCoins(String dynasty,Model model){
		try {
			List<Coin> CoinList = coinService.findCoinList(dynasty);
			List<CoinVO> VOList = new ArrayList<CoinVO>();
			for (Coin coin : CoinList) {
				List<CoinImg> coinImgList = coinImgService.findCoinImgByCoinId(coin.getId());
				VOList.add(new CoinVO(coin,coinImgList));
			}
			model.addAttribute("list",VOList);
			return "coin/coin_list";
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
}
