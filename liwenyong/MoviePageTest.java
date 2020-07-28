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

	// 13.搜索-历史记录
	@Test(description = "历史记录")
	public void search_history() {
		moviePage.searchHistory();
	}

	// 14.搜索-小时代
	@Test(description = "搜索1")
	public void search_xiaoshidai1() {
		moviePage.searchXiaoshidai1();
	}

	// 15.搜索-xiaoshidai
	@Test(description = "搜索2")
	public void search_xiaoshidai2() {
		moviePage.searchXiaoshidai2();
	}

	// 16.搜索-地点
	@Test(description = "搜索地点")
	public void search_place() {
		moviePage.searchPlace();
	}

	// 17.搜索-删除历史记录
	@Test(description = "搜索删除历史记录")
	public void search_delete_history() {
		moviePage.searchDeleteHistory();
	}

	// 18.筛选-经典
	@Test(description = "筛选-经典")
	public void jingdian() {
		moviePage.jingdian();
	}

	// 19.选择一部电影
	@Test(description = "选择一部电影")
	public void chooseonemovie() {
		moviePage.chooseOneMovie();
	}

	// 20.点击电影界面的头主题
	@Test(description = "点击电影界面的头主题")
	public void theme() {
		moviePage.theme();
	}
}
