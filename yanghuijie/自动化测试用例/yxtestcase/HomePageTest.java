package edu.yxtestcase;

import org.testng.annotations.Test;

import edu.base.BaseTest1;
import edu.yxpages.HomePage;

public class HomePageTest extends BaseTest1{
	
	
//	分享到qq
	@Test(description="用例4")
	public void testshare(){
		HomePage homepage=new HomePage(driver);
		homepage.share_qq();
	}
//	分享到微信
	@Test(description="用例5")
	public void testshareweixin(){
		HomePage homepage=new HomePage(driver);
		homepage.share_wechat();
	}
//	分享到微信朋友圈
	@Test(description="用例6")
	public void testsharepyq(){
		HomePage homepage=new HomePage(driver);
		homepage.share_pyq();
	}
//	取消分享
	@Test(description="用例7")
	public void testsharecancle(){
		HomePage homepage=new HomePage(driver);
		homepage.cancle_share();
	}
//	点赞
	@Test(description="用例8")
	public void testlike(){
		HomePage homepage=new HomePage(driver);
		homepage.like();
	}
//	评论一条
	@Test(description="用例9")
	public void testcomment(){
		HomePage homepage=new HomePage(driver);
		homepage.comment("真美呀");
	}
//	评论多条
	@Test(description="用例10")
	public void testcomments(){
		HomePage homepage=new HomePage(driver);
		for(int i=0;i<3;i++){
			homepage.comment("我也要去打卡"+i);
		}
		
	}

}
