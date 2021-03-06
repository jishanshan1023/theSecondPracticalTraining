package com.example.myapplication6;

import android.app.Instrumentation;
import android.os.RemoteException;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.Key;

public class TestYingXing {
    //work3.2
    Instrumentation mInstrumentation;
    UiDevice mDevice;

    public void login() throws InterruptedException {
        Thread.sleep(3000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/tab_spec_me")).click();
        mDevice.findObject(By.text("登录")).click();
        mDevice.findObject(By.text("请输入手机号")).setText("15610893068");
        mDevice.findObject(By.text("请输入密码")).setText("123456");
        mDevice.findObject(By.text("登录")).click();
        Thread.sleep(3000);
    }

    //判断是否登录
    public void quit() throws InterruptedException {
        UiObject2 obj=mDevice.findObject(By.res("com.example.msl.rainbow1:id/tab_spec_post"));
        if (obj!=null){
            Log.i("提示：","用户未登录!");
            login();
        }
    }

    //    @After
    public void tearDown() throws InterruptedException {
        quit();
    }

    @Before
    public void startUp() throws RemoteException, InterruptedException {
        //==右边获取设备
        mInstrumentation= InstrumentationRegistry.getInstrumentation();
        mDevice=UiDevice.getInstance(mInstrumentation);
        //按键home
//            mDevice.pressHome();
//            Thread.sleep(3000);

//        wakeup方式解锁
        boolean status= false;
        status = mDevice.isScreenOn();
        if(!status){
            mDevice.wakeUp();
        }
        mDevice.findObject(By.text("与影随行")).click();
    }
//    个人中心模块
//    查看点赞
    @Test
    public void testViewDianZan()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_center")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/tv_praise_fragment")).click();
        Thread.sleep(2000);
    }
//    查看收藏
    @Test
    public void testViewLike()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_center")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/tv_collection_fragment")).click();
        Thread.sleep(2000);
    }
//    查看笔记
    @Test
    public void testViewNotes()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_center")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/tv_notes_fragment")).click();
        Thread.sleep(2000);
    }
//编辑个人资料
    @Test
    public void testEditData()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_center")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_settings")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("编辑资料")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/et_username")).setText("小太阳");
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/btn_man")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/btn_save")).click();
        Thread.sleep(2000);
    }
//    账户与安全-更换手机号
    @Test
    public void testChangePhone()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_center")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_settings")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("账户与安全")).click();
        Thread.sleep(2000);

        mDevice.findObject(By.res("com.example.msl.rainbow1:id/rl_modify")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/tv_country")).click();
        Thread.sleep(2000);
//        mDevice.findObject(By.text("中国")).click();
//        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/et_write_phone")).setText("13292262342");
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/btn_next")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("好")).click();
        Thread.sleep(2000);
    }
//    账户与安全-修改密码
    @Test
    public void testChangePassword()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_center")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_settings")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("账户与安全")).click();
        Thread.sleep(2000);

        mDevice.findObject(By.res("com.example.msl.rainbow1:id/rl_change")).click();
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/et_pwd")).setText("123456");
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/et_pwd1")).setText("123");
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_forward")).click();
    }
//    账户与安全-注销账户
    //@Test
    public void testCancellation()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_center")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_settings")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("账户与安全")).click();
        Thread.sleep(2000);

        mDevice.findObject(By.res("com.example.msl.rainbow1:id/rl_cancellation")).click();
        mDevice.findObject(By.text("确定")).click();
    }
//    用户与协议
@Test
    public void testUserProtocol()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_center")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_settings")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("账户与协议")).click();
        Thread.sleep(2000);
    }
    //    隐私政策
@Test
    public void testPrivacyPolicy()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_center")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_settings")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("隐私政策")).click();
        Thread.sleep(2000);
    }
//    意见反馈
    @Test
    public void testFeedBack()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_center")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_settings")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("意见反馈")).click();
        Thread.sleep(2000);

        mDevice.findObject(By.res("com.example.msl.rainbow1:id/et_content")).setText("太卡了");
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/et_mail")).setText("666666666@qq.com");
        mDevice.findObject(By.text("发送")).click();
        Thread.sleep(2000);
    }
    //    关于app
    @Test
    public void testAboutApp()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_center")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_settings")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("关于APP")).click();
        Thread.sleep(2000);
    }

//    电影模块
//    筛选经典电影并选择一个电影
    @Test
    public void testMovieClassical()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/tab_spec_movie")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/btn_classical")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("那些年，我们一起追的女孩")).click();
    }
//点赞动态
    @Test
    public void testDoDianZan()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/tab_spec_post")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/likeView")).click();
        Thread.sleep(2000);
    }
//收藏喜欢的电影
    @Test
    public void testDoLike()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/tab_spec_movie")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/btn_new")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("小时代3：刺金时代")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/img_like")).click();
        Thread.sleep(2000);
    }

//    搜索模块
//    搜索西西里
    @Test
    public void testSearch() throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/img_search")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("android:id/search_src_text")).setText("西西里");
        mDevice.pressBack();
    }
//    热门搜索
    @Test
    public void testHotSearch()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/img_search")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("流浪地球")).click();
    }
//    历史记录
    @Test
    public  void testHistory()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/img_search")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("西西里")).click();
    }
//    搜索并点击
    @Test
    public void testSearchAndTouch() throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/img_search")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("android:id/search_src_text")).setText("小时代");
        mDevice.pressBack();
        mDevice.findObject(By.text("小时代1：折纸时代")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.text("上海展览中心")).click();
        Thread.sleep(2000);
    }
//    搜索地点
    @Test
    public void testSearchLocation()throws Exception{
        mDevice.findObject(By.res("com.example.msl.rainbow1:id/img_search")).click();
        Thread.sleep(2000);
        mDevice.findObject(By.res("android:id/search_src_text")).setText("东京");
        mDevice.pressBack();
    }

}
