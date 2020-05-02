package edu.yxpages;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CityPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public CityPage(AndroidDriver<AndroidElement> driver){
		this.driver=driver;
		this.action=new BaseAction(driver);
	}
	
	private AndroidElement shouye_picture(){
		return driver.findElementById("com.example.msl.rainbow1:id/img_head");
	}
	private AndroidElement shouye_pic_one(){
		return driver.findElementById("com.example.msl.rainbow1:id/iv_spot1");
	}
	private AndroidElement shouye_pic_two(){
		return driver.findElementById("com.example.msl.rainbow1:id/iv_spot2");
	}
	private AndroidElement back(){
		return driver.findElementById("com.example.msl.rainbow1:id/iv_back");
	}
	private AndroidElement all(){
		return driver.findElementById("com.example.msl.rainbow1:id/tv_all");
	}
	private AndroidElement allcountry(){
		return driver.findElementById("com.example.msl.rainbow1:id/btn_allcountry");
	}
	private AndroidElement allkinds(){
		return driver.findElementById("com.example.msl.rainbow1:id/btn_allkinds");
	}
	
	private AndroidElement china(){
		return driver.findElementById("com.example.msl.rainbow1:id/btn_mainland");
	}
	private AndroidElement taiwan(){
		return driver.findElementById("com.example.msl.rainbow1:id/btn_taiwan");
	}
	private AndroidElement france(){
		return driver.findElementById("com.example.msl.rainbow1:id/btn_france");
	}
	private AndroidElement kinds(){
		return driver.findElementById("com.example.msl.rainbow1:id/btn_allkinds");
	}
	
	private AndroidElement natural(){
		return driver.findElementById("com.example.msl.rainbow1:id/btn_natural");
	}
	private AndroidElement tarvelspots(){
		return driver.findElementById("com.example.msl.rainbow1:id/btn_tarvelspots");
	}
	private AndroidElement hotspots_beijing(){
		return driver.findElementById("com.example.msl.rainbow1:id/img_first_city");
	}
	private AndroidElement beijing_tiananmen(){
		return driver.findElementByXPath("//*[@content-desc='天安门广场']");
	}
	private AndroidElement shoucang(){
		return driver.findElementById("com.example.msl.rainbow1:id/img_like");
	}
	private AndroidElement zhoubian(){
		return driver.findElementById("com.example.msl.rainbow1:id/img_map");
	}
	
	
//	查看首页详细1
	public void shouye_detail1(){
		action.click(shouye_picture());
		action.click(shouye_pic_one());
		action.click(back());
	}
//	查看首页详细2
	public void shouye_detail2(){
		action.click(shouye_picture());
		action.click(shouye_pic_two());
		action.click(back());
	}
//	分类查询1-全部、全部
	public void find1(){
		action.click(all());
		action.click(allcountry());
		action.click(allkinds());
	}
//	分类查询1-中国大陆、自然风光
	public void find2(){
		action.click(all());
		action.click(china());
		action.click(natural());
	}
//	分类查询2-台湾、自然风光
	public void find3(){
		action.click(all());
		action.click(taiwan());
		action.click(natural());
	}
//	热门城市查询收藏
	public void hotspots(){
		action.click(hotspots_beijing());
		action.click(beijing_tiananmen());
		action.click(shoucang());
		action.click(zhoubian());	
	}

}
