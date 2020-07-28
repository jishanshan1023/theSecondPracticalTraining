package edu.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.SettingsPage;

public class SettingsPageTest extends BaseTest {

	SettingsPage setPage;

	@BeforeClass
	public void driver() {
		setPage = new SettingsPage(driver);
	}

	// 4.退出账号
	// @Test(description="退出账号成功")
	public void exitSuccess() {
		setPage.exit();
		System.out.println("退出成功");
	}

	// 5.编辑资料
	@Test(description = "编辑个人资料成功")
	public void editSuccess() {
		setPage.edit();
		System.out.println("编辑成功");
	}

	// 6.关于APP
	@Test(description = "关于APP")
	public void aboutApp() {
		setPage.about();
	}

	// 7.意见反馈
	@Test(description = "意见反馈")
	public void feedback() {
		setPage.feedback();
	}

	// 8.隐私政策
	@Test(description = "隐私政策")
	public void privacy() {
		setPage.privacy();
	}

	// 9.用户与协议
	@Test(description = "用户与协议")
	public void agreement() {
		setPage.agreement();
	}

	// 10.账户与安全-更换手机号
	@Test(description = "更换手机号")
	public void changephone() {
		setPage.changephone();
	}

	// 11.账户与安全-修改密码
	// @Test(description="修改密码")
	public void changepassword() {
		setPage.changepassword();
	}

	// 12.账户与安全-注销账号
	// @Test(description="注销账号")
	public void cancellnumber() {
		setPage.cancellnumber();
	}
}
