package edu.pages;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SettingsPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public SettingsPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}

	private AndroidElement btn_me() {
		return driver.findElementById("tab_spec_me");
	}

	private AndroidElement btn_settings() {
		return driver.findElementById("iv_settings");
	}

	private AndroidElement btn_exit() {
		return driver.findElementById("rl_exit");
	}

	// private AndroidElement btn_confirm(){
	// return driver.findElementByXPath("//*[@id=button1]");
	// android:id/button1
	// }
	private AndroidElement btn_confirm() {
		return driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]");
	}

	private AndroidElement edit_data() {
		return driver.findElementById("rl_edit");
	}

	private AndroidElement edit_name() {
		return driver.findElementById("et_username");
	}

	private AndroidElement edit_sex() {
		return driver.findElementById("btn_man");
	}

	private AndroidElement edit_address() {
		return driver.findElementById("tv_address");
	}

	private AndroidElement edit_date() {
		return driver.findElementById("tv_date");
	}

	private AndroidElement btn_save() {
		return driver.findElementById("btn_save");
	}

	private AndroidElement btn_about() {
		return driver.findElementById("rl_about");
	}

	private AndroidElement btn_feedback() {
		return driver.findElementById("rl_feedback");
	}

	private AndroidElement btn_feedopinion() {
		return driver.findElementById("et_content");
	}

	private AndroidElement btn_feedemail() {
		return driver.findElementById("et_mail");
	}

	private AndroidElement btn_send() {
		return driver.findElementById("btn_send");
	}

	private AndroidElement btn_privacy() {
		return driver.findElementById("rl_privacy");
	}

	private AndroidElement btn_agreement() {
		return driver.findElementById("rl_agreement");
	}

	private AndroidElement btn_safety() {
		return driver.findElementById("rl_safety");
	}

	private AndroidElement btn_change_phone() {
		return driver.findElementById("tv_phone_num");
	}

	private AndroidElement btn_write_phone() {
		return driver.findElementById("et_write_phone");
	}

	private AndroidElement btn_next() {
		return driver.findElementById("btn_next");
	}

	private AndroidElement common_dialog_confirm_tv() {
		return driver.findElementById("common_dialog_confirm_tv");
	}

	private AndroidElement change_password() {
		return driver.findElementById("rl_change");
	}

	private AndroidElement et_pwd() {
		return driver.findElementById("et_pwd");
	}

	private AndroidElement et_pwd1() {
		return driver.findElementById("et_pwd1");
	}

	private AndroidElement iv_forward() {
		return driver.findElementById("iv_forward");
	}

	private AndroidElement rl_cancellation() {
		return driver.findElementById("rl_cancellation");
	}

	private AndroidElement btn_confirm1() {
		return driver.findElementById("button1");
	}

	// 编辑资料
	public void edit() {
		action.click(btn_me());
		action.click(btn_settings());
		action.click(edit_data());
		action.type(edit_name(), "好好学习");
		action.click(edit_sex());
		// action.type(edit_address(), "北京市-北京市-昌平区");
		// action.type(edit_date(), "2009-4-29");
		action.click(btn_save());
	}

	// 退出
	public void exit() {
		action.click(btn_me());
		action.click(btn_settings());
		action.click(btn_exit());
		action.click(btn_confirm());
	}

	// 关于APP
	public void about() {
		action.click(btn_me());
		action.click(btn_settings());
		action.click(btn_about());
	}

	// 意见反馈
	public void feedback() {
		action.click(btn_me());
		action.click(btn_settings());
		action.click(btn_feedback());
		action.type(btn_feedopinion(), "太卡了");
		action.type(btn_feedemail(), "914900485@qq.com");
		action.click(btn_send());
	}

	// 隐私政策
	public void privacy() {
		action.click(btn_me());
		action.click(btn_settings());
		action.click(btn_privacy());
	}

	// 用户与协议
	public void agreement() {
		action.click(btn_me());
		action.click(btn_settings());
		action.click(btn_agreement());
	}

	// 更换手机号
	public void changephone() {
		action.click(btn_me());
		action.click(btn_settings());
		action.click(btn_safety());

		action.click(btn_change_phone());
		action.type(btn_write_phone(), "12312212123");
		action.click(btn_next());
		action.click(common_dialog_confirm_tv());
	}

	// 修改密码
	public void changepassword() {
		action.click(btn_me());
		action.click(btn_settings());
		action.click(btn_safety());

		action.click(change_password());
		action.type(et_pwd(), "123");
		action.type(et_pwd1(), "123456");
		action.click(iv_forward());
	}

	// 注销账号
	public void cancellnumber() {
		action.click(btn_me());
		action.click(btn_settings());
		action.click(btn_safety());

		action.click(rl_cancellation());
		action.click(btn_confirm1());
	}
}
