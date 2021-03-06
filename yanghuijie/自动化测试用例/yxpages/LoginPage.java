package edu.yxpages;

import edu.pages.HomePage;
import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public LoginPage(AndroidDriver<AndroidElement> driver){
		this.driver=driver;
		this.action=new BaseAction(driver);
	}
	
	public AndroidElement me(){
		return this.driver.findElementById("com.example.msl.rainbow1:id/tab_spec_me");
	}
	public AndroidElement btn_login(){
		return this.driver.findElementById("com.example.msl.rainbow1:id/btn_login");
	}
	
	public AndroidElement edit_username(){
		return this.driver.findElementById("com.example.msl.rainbow1:id/et_phone_num");
	}
	public AndroidElement edit_password(){
		return this.driver.findElementById("com.example.msl.rainbow1:id/et_pwd");
	}
	public AndroidElement btn_submit(){
		return this.driver.findElementById("com.example.msl.rainbow1:id/btn_login");
	}
	
	public HomePage loginSuccess(String name,String password){
		action.click(me());
		action.click(btn_login());
		action.type(edit_username(), name);
		action.type(edit_password(), password);
		action.click(btn_submit());
		return new HomePage(driver);
	}
	
	public String loginFail(String name,String password){
		action.click(me());
		action.click(btn_login());
		action.type(edit_username(), name);
		action.type(edit_password(), password);
		action.click(btn_submit());
		return action.getToast();
	}

}
