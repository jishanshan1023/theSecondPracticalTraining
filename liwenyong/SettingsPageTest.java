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

	// 4.�˳��˺�
	// @Test(description="�˳��˺ųɹ�")
	public void exitSuccess() {
		setPage.exit();
		System.out.println("�˳��ɹ�");
	}

	// 5.�༭����
	@Test(description = "�༭�������ϳɹ�")
	public void editSuccess() {
		setPage.edit();
		System.out.println("�༭�ɹ�");
	}

	// 6.����APP
	@Test(description = "����APP")
	public void aboutApp() {
		setPage.about();
	}

	// 7.�������
	@Test(description = "�������")
	public void feedback() {
		setPage.feedback();
	}

	// 8.��˽����
	@Test(description = "��˽����")
	public void privacy() {
		setPage.privacy();
	}

	// 9.�û���Э��
	@Test(description = "�û���Э��")
	public void agreement() {
		setPage.agreement();
	}

	// 10.�˻��밲ȫ-�����ֻ���
	@Test(description = "�����ֻ���")
	public void changephone() {
		setPage.changephone();
	}

	// 11.�˻��밲ȫ-�޸�����
	// @Test(description="�޸�����")
	public void changepassword() {
		setPage.changepassword();
	}

	// 12.�˻��밲ȫ-ע���˺�
	// @Test(description="ע���˺�")
	public void cancellnumber() {
		setPage.cancellnumber();
	}
}
