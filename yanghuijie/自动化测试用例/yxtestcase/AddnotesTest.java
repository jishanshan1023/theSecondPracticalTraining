package edu.yxtestcase;

import org.testng.annotations.Test;

import edu.base.BaseTest1;
import edu.yxpages.AddnotesPage;

public class AddnotesTest extends BaseTest1{
	AddnotesPage addnotes;
	
//	新增一条文字动态
	@Test(description="用例11")
	public void testAddWrite(){
		AddnotesPage addnotes=new AddnotesPage(driver);
		addnotes.add_write("我的第一条动态");
	}
//	新增多条纯文字动态
	@Test(description="用例12")
	public void testAddWrites(){
		AddnotesPage addnotes=new AddnotesPage(driver);
		for(int i=1;i<=5;i++){
			addnotes.add_write("我的第"+i+"条动态");
		}
	}
//	新增一条纯图片动态
	@Test(description="用例13")
	public void testAddPicture(){
		AddnotesPage addnotes=new AddnotesPage(driver);
		addnotes.add_picture("插入的第一张图片");
	}
//	新增多条纯图片动态
	@Test(description="用例14")
	public void testAddPictures(){
		AddnotesPage addnotes=new AddnotesPage(driver);
		for(int i=1;i<3;i++){
			addnotes.add_picture("插入的第"+i+"张图片");
		}	
	}
//	新增一条动态
	@Test(description="用例15")
	public void testAddNote(){
		AddnotesPage addnotes=new AddnotesPage(driver);	
		addnotes.add_notes("我的第一条动态","第一张图片");
	}
//	新增多条动态
	@Test(description="用例16")
	public void testAddNotes(){
		AddnotesPage addnotes=new AddnotesPage(driver);	
		for(int i=0;i<3;i++)
		addnotes.add_notes("我的第"+i+"条动态","第"+i+"张图片");
	}


}
