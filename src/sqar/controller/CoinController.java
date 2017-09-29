package sqar.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import sqar.controller.vo.CoinVO;
import sqar.db.model.Coin;
import sqar.db.model.CoinImg;
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
	public @ResponseBody Map<String, Object> fileUpload(MultipartFile file, String coinId)
			throws IllegalStateException, IOException {
		System.out.println("开始执行");
		if (file == null) {
			return RestUtils.getErrorResponse("请选择图片！");
		}
		Coin coin = coinService.findCoinById(coinId);
		if (coin == null) {
			return RestUtils.getErrorResponse("古钱币不存在！");
		}
		try {
			String url = coinService.uploadImg(file,coinId);
			System.out.println("上传成功");
			Map<String, Object> resp = RestUtils.getOkResponse();
			resp.put("imgUrl", url);
			return resp;
		} catch (Exception e) {
			return RestUtils.getErrorResponse(e);
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
			return "";
		} catch (Exception e) {
			return "";
		}
	}
}
