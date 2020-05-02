package edu.yxtestcase;

import org.testng.annotations.Test;

import edu.base.BaseTest1;
import edu.yxpages.AddnotesPage;

public class AddnotesTest extends BaseTest1{
	AddnotesPage addnotes;
	
//	����һ�����ֶ�̬
	@Test(description="����11")
	public void testAddWrite(){
		AddnotesPage addnotes=new AddnotesPage(driver);
		addnotes.add_write("�ҵĵ�һ����̬");
	}
//	�������������ֶ�̬
	@Test(description="����12")
	public void testAddWrites(){
		AddnotesPage addnotes=new AddnotesPage(driver);
		for(int i=1;i<=5;i++){
			addnotes.add_write("�ҵĵ�"+i+"����̬");
		}
	}
//	����һ����ͼƬ��̬
	@Test(description="����13")
	public void testAddPicture(){
		AddnotesPage addnotes=new AddnotesPage(driver);
		addnotes.add_picture("����ĵ�һ��ͼƬ");
	}
//	����������ͼƬ��̬
	@Test(description="����14")
	public void testAddPictures(){
		AddnotesPage addnotes=new AddnotesPage(driver);
		for(int i=1;i<3;i++){
			addnotes.add_picture("����ĵ�"+i+"��ͼƬ");
		}	
	}
//	����һ����̬
	@Test(description="����15")
	public void testAddNote(){
		AddnotesPage addnotes=new AddnotesPage(driver);	
		addnotes.add_notes("�ҵĵ�һ����̬","��һ��ͼƬ");
	}
//	����������̬
	@Test(description="����16")
	public void testAddNotes(){
		AddnotesPage addnotes=new AddnotesPage(driver);	
		for(int i=0;i<3;i++)
		addnotes.add_notes("�ҵĵ�"+i+"����̬","��"+i+"��ͼƬ");
	}


}
