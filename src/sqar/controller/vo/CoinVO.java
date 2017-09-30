package sqar.controller.vo;

import java.util.List;

import sqar.dao.model.Coin;
import sqar.dao.model.CoinImg;

public class CoinVO {

    private String id;
    private String dynasty;
    private String outline;
    private Double width;
    private Double height;
    private Double weight;
    private String material;
    private String nubmer;
    private String rate;
    private String note;
    private List<CoinImg> coinImgList;
	public CoinVO() {
		super();
	}

	public CoinVO(Coin coin, List<CoinImg> coinImgList) {
		this.id = coin.getId();
		this.dynasty = coin.getDynasty();
		this.outline = coin.getOutline();
		this.width = coin.getWidth();
		this.height = coin.getHeight();
		this.weight = coin.getWeight();
		this.material = coin.getMaterial();
		this.nubmer = coin.getNubmer();
		this.rate = coin.getRate();
		this.note = coin.getNote();
		this.coinImgList = coinImgList;
	
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDynasty() {
		return dynasty;
	}
	public void setDynasty(String dynasty) {
		this.dynasty = dynasty;
	}
	public String getOutline() {
		return outline;
	}
	public void setOutline(String outline) {
		this.outline = outline;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getNubmer() {
		return nubmer;
	}
	public void setNubmer(String nubmer) {
		this.nubmer = nubmer;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public List<CoinImg> getCoinImgList() {
		return coinImgList;
	}
	public void setCoinImgList(List<CoinImg> coinImgList) {
		this.coinImgList = coinImgList;
	}
	
}
