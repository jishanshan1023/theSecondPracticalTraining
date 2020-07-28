package edu.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.MoviePage;

public class MoviePageTest extends BaseTest {
	MoviePage moviePage;

	@BeforeClass
	public void driver() {
		moviePage = new MoviePage(driver);
	}

	// 13.����-��ʷ��¼
	@Test(description = "��ʷ��¼")
	public void search_history() {
		moviePage.searchHistory();
	}

	// 14.����-Сʱ��
	@Test(description = "����1")
	public void search_xiaoshidai1() {
		moviePage.searchXiaoshidai1();
	}

	// 15.����-xiaoshidai
	@Test(description = "����2")
	public void search_xiaoshidai2() {
		moviePage.searchXiaoshidai2();
	}

	// 16.����-�ص�
	@Test(description = "�����ص�")
	public void search_place() {
		moviePage.searchPlace();
	}

	// 17.����-ɾ����ʷ��¼
	@Test(description = "����ɾ����ʷ��¼")
	public void search_delete_history() {
		moviePage.searchDeleteHistory();
	}

	// 18.ɸѡ-����
	@Test(description = "ɸѡ-����")
	public void jingdian() {
		moviePage.jingdian();
	}

	// 19.ѡ��һ����Ӱ
	@Test(description = "ѡ��һ����Ӱ")
	public void chooseonemovie() {
		moviePage.chooseOneMovie();
	}

	// 20.�����Ӱ�����ͷ����
	@Test(description = "�����Ӱ�����ͷ����")
	public void theme() {
		moviePage.theme();
	}
}
