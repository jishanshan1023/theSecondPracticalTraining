package edu.pages;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MoviePage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;

	public MoviePage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		this.action = new BaseAction(driver);
	}

	private AndroidElement btn_movie() {
		return driver.findElementById("tab_spec_movie");
	}

	private AndroidElement btn_search() {
		return driver.findElementById("img_search");
	}

	private AndroidElement btn_one_history() {
		return driver.findElementByLinkText("Сʱ��");
	}

	private AndroidElement btn_delete_history() {
		return driver.findElementById("img_del");
	}

	private AndroidElement search_text() {
		return driver.findElementById("search_src_text");
	}

	private AndroidElement btn_classical() {
		return driver.findElementById("btn_classical");
	}

	private AndroidElement one_movie() {
		return driver.findElementById("tv_show_movie_name");
	}

	private AndroidElement ll_head_theme() {
		return driver.findElementById("ll_head_theme");
	}

	// ����-Сʱ��
	public void searchXiaoshidai1() {
		action.click(btn_movie());

		action.click(btn_search());
		action.type(search_text(), "Сʱ��");
	}

	// ����-"xiaoshidai"
	public void searchXiaoshidai2() {
		action.click(btn_movie());

		action.click(btn_search());
		action.type(search_text(), "xiaoshidai");
	}

	// ����-���롰������
	public void searchPlace() {
		action.click(btn_movie());

		action.click(btn_search());
		action.type(search_text(), "����");
	}

	// ����-��ʷ��¼
	public void searchHistory() {
		action.click(btn_movie());

		action.click(btn_search());
		action.click(btn_one_history());
	}

	// ����-ɾ����ʷ��¼
	public void searchDeleteHistory() {
		action.click(btn_movie());

		action.click(btn_search());
		action.click(btn_delete_history());
	}

	// ɸѡ-����
	public void jingdian() {
		action.click(btn_movie());
		action.click(btn_classical());
	}

	// ѡ��һ����Ӱ
	public void chooseOneMovie() {
		action.click(btn_movie());
		action.click(one_movie());
	}

	// �����Ӱ�����ר��
	public void theme() {
		action.click(btn_movie());
		action.click(ll_head_theme());
	}
}
