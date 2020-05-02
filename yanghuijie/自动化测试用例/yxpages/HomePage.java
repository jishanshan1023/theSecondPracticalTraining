package edu.yxpages;



import java.util.List;

import org.openqa.selenium.By;

import edu.utils.BaseAction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class HomePage {
	
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public HomePage(AndroidDriver<AndroidElement> driver){
		this.driver=driver;
		this.action=new BaseAction(driver);
	}
//	动态
	private AndroidElement btn_dongtai(){
		return driver.findElementById("com.example.msl.rainbow1:id/iv_post");
	}
//	分享按钮
	private AndroidElement btn_share(){
		return driver.findElementById("com.example.msl.rainbow1:id/ll_share");
	}
//分享到qq	
	private AndroidElement qq(){
		return driver.findElementById("com.example.msl.rainbow1:id/qqhaoyou");
	}
//分享到微信好友
	private AndroidElement wechat(){
		return driver.findElementById("com.example.msl.rainbow1:id/weixinghaoyou");
	}
//	分享到微信朋友圈
	private AndroidElement pengyouquan(){
		return driver.findElementById("com.example.msl.rainbow1:id/pengyouquan");
	}
//取消分享	
	private AndroidElement share_cancle(){
		return driver.findElementById("com.example.msl.rainbow1:id/share_cancle");
	}
	
//	评论按钮
	public AndroidElement btn_comment(){
		return driver.findElementById("com.example.msl.rainbow1:id/ll_comment");
	}
//	点赞按钮
	public AndroidElement btn_like(){
		return driver.findElementById("com.example.msl.rainbow1:id/ll_like");
	}
	
	//*******************
	
	private MobileElement list_item(){
		AndroidElement list=driver.findElement(By.id("com.example.msl.rainbow1:id/smart_layout"));
		List<MobileElement> items=list.findElements(By.id("com.example.msl.rainbow1:id/lv_post"));
//		int count=items.size();
		return items.get(0);				
	}
//分享到qq
	public void share_qq(){
		action.click(btn_dongtai());
		action.click(btn_share());
		action.click(qq());
	}
//	分享到微信
	public void share_wechat(){
		action.click(btn_dongtai());
		action.click(btn_share());
		action.click(wechat());
	}
//	分享到朋友圈
	public void share_pyq(){
		action.click(btn_dongtai());
		action.click(btn_share());
		action.click(pengyouquan());
	}
//	取消分享
	public void cancle_share(){
		action.click(btn_dongtai());
		action.click(btn_share());
		action.click(share_cancle());
	}
//	评论动态
	public void comment(String comment){
		action.click(btn_dongtai());
		action.click(btn_share());
		action.type(btn_comment(),comment);
	}
//	点赞动态
	public void like(){
		action.click(btn_dongtai());
		action.click(btn_share());
		action.click(btn_like());
	}

}
