package edu.yxpages;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AddnotesPage {
	
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public AddnotesPage(AndroidDriver<AndroidElement> driver){
		this.driver=driver;
		this.action=new BaseAction(driver);
	}
	
//	动态
	private AndroidElement btn_dongtai(){
		return driver.findElementById("com.example.msl.rainbow1:id/iv_post");
	}
//	新增动态按钮
	private AndroidElement add(){
		return driver.findElementById("com.example.msl.rainbow1:id/btn_new");	
	}
//	新增内容
	private AndroidElement notes(){
		return driver.findElementById("com.example.msl.rainbow1:id/btn_new");	
	}
//	新增图片
	private AndroidElement add_picture(){
		return driver.findElementById("com.example.msl.rainbow1:id/btn_addphoto");	
	}
//	发送
	private AndroidElement send(){
		return driver.findElementById("com.example.msl.rainbow1:id/btn_sendnews");	
	}
	
//	新增动态纯文字
	public void add_write(String content){
		action.click(btn_dongtai());
		action.click(add());
		action.type(notes(),content);
		action.click(send());	
	}
//	新增图片动态
	public void add_picture(String content){
		action.click(btn_dongtai());
		action.click(add());
		action.type(add_picture(),content);
		action.click(send());	
	}
//	新增文字+图片
	public void add_notes(String picture,String note){
		action.click(btn_dongtai());
		action.click(add());
		action.type(notes(),note);
		action.type(add_picture(),picture);
		action.click(send());	
	}
	

}
