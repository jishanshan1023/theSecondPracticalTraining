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
//	��̬
	private AndroidElement btn_dongtai(){
		return driver.findElementById("com.example.msl.rainbow1:id/iv_post");
	}
//	����ť
	private AndroidElement btn_share(){
		return driver.findElementById("com.example.msl.rainbow1:id/ll_share");
	}
//����qq	
	private AndroidElement qq(){
		return driver.findElementById("com.example.msl.rainbow1:id/qqhaoyou");
	}
//����΢�ź���
	private AndroidElement wechat(){
		return driver.findElementById("com.example.msl.rainbow1:id/weixinghaoyou");
	}
//	����΢������Ȧ
	private AndroidElement pengyouquan(){
		return driver.findElementById("com.example.msl.rainbow1:id/pengyouquan");
	}
//ȡ������	
	private AndroidElement share_cancle(){
		return driver.findElementById("com.example.msl.rainbow1:id/share_cancle");
	}
	
//	���۰�ť
	public AndroidElement btn_comment(){
		return driver.findElementById("com.example.msl.rainbow1:id/ll_comment");
	}
//	���ް�ť
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
//����qq
	public void share_qq(){
		action.click(btn_dongtai());
		action.click(btn_share());
		action.click(qq());
	}
//	����΢��
	public void share_wechat(){
		action.click(btn_dongtai());
		action.click(btn_share());
		action.click(wechat());
	}
//	��������Ȧ
	public void share_pyq(){
		action.click(btn_dongtai());
		action.click(btn_share());
		action.click(pengyouquan());
	}
//	ȡ������
	public void cancle_share(){
		action.click(btn_dongtai());
		action.click(btn_share());
		action.click(share_cancle());
	}
//	���۶�̬
	public void comment(String comment){
		action.click(btn_dongtai());
		action.click(btn_share());
		action.type(btn_comment(),comment);
	}
//	���޶�̬
	public void like(){
		action.click(btn_dongtai());
		action.click(btn_share());
		action.click(btn_like());
	}

}
