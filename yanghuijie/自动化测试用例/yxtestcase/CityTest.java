package edu.yxtestcase;

import org.testng.annotations.Test;

import edu.base.BaseTest1;
import edu.yxpages.CityPage;

public class CityTest extends BaseTest1{
	CityPage citypage;
	
	@Test(description="����16")
	public void testshouyepicture(){
		CityPage citypage=new CityPage(driver);
		citypage.shouye_detail1();
	}
	
	@Test(description="����17")
	public void testshouyepicture2(){
		CityPage citypage=new CityPage(driver);
		citypage.shouye_detail2();
	}
	@Test(description="����18")
	public void find1(){
		CityPage citypage=new CityPage(driver);
		citypage.find1();
	}
	@Test(description="����19")
	public void find2(){
		CityPage citypage=new CityPage(driver);
		citypage.find2();
	}
	@Test(description="����20")
	public void find3(){
		CityPage citypage=new CityPage(driver);
		citypage.find3();
	}
	@Test(description="����211")
	public void hotspots(){
		CityPage citypage=new CityPage(driver);
		citypage.hotspots();
	}


}
