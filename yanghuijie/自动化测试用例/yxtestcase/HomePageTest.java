package edu.yxtestcase;

import org.testng.annotations.Test;

import edu.base.BaseTest1;
import edu.yxpages.HomePage;

public class HomePageTest extends BaseTest1{
	
	
//	����qq
	@Test(description="����4")
	public void testshare(){
		HomePage homepage=new HomePage(driver);
		homepage.share_qq();
	}
//	����΢��
	@Test(description="����5")
	public void testshareweixin(){
		HomePage homepage=new HomePage(driver);
		homepage.share_wechat();
	}
//	����΢������Ȧ
	@Test(description="����6")
	public void testsharepyq(){
		HomePage homepage=new HomePage(driver);
		homepage.share_pyq();
	}
//	ȡ������
	@Test(description="����7")
	public void testsharecancle(){
		HomePage homepage=new HomePage(driver);
		homepage.cancle_share();
	}
//	����
	@Test(description="����8")
	public void testlike(){
		HomePage homepage=new HomePage(driver);
		homepage.like();
	}
//	����һ��
	@Test(description="����9")
	public void testcomment(){
		HomePage homepage=new HomePage(driver);
		homepage.comment("����ѽ");
	}
//	���۶���
	@Test(description="����10")
	public void testcomments(){
		HomePage homepage=new HomePage(driver);
		for(int i=0;i<3;i++){
			homepage.comment("��ҲҪȥ��"+i);
		}
		
	}

}
