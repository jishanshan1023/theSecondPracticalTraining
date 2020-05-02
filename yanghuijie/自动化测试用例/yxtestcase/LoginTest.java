package edu.yxtestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import edu.base.BaseTest1;
import edu.yxpages.LoginPage;

public class LoginTest extends BaseTest1{
	
	
	@Test(description="用例1")
	public void loginSuccess(){
		LoginPage loginpage=new LoginPage(driver);
		loginpage.loginSuccess("18849403932","456");
		Assert.assertEquals(this.driver.currentActivity(),"com.example.msl.rainbow1/.MainActivity:");	
//		System.out.println("登录成功！");
	}
	
	@Test(description="用例2")
	public void loginFail1(){
		LoginPage loginpage=new LoginPage(driver);
		String actResult=loginpage.loginFail("18849403932","111");
		Assert.assertEquals(actResult,"用户名或者密码错误！");
//		System.out.println("登录失败！");
	}
	
	@Test(description="用例3")
	public void loginFail2(){
		LoginPage loginpage=new LoginPage(driver);
		String actResult=loginpage.loginFail("18849403333","456");
		Assert.assertEquals(actResult,"用户名或者密码错误！");
//		System.out.println("登录失败！");
	}

}
