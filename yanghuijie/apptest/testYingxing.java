package com.example.myapptest.com.yingxing.apptest;

import android.app.Instrumentation;
import android.os.RemoteException;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;
import androidx.test.uiautomator.UiObjectNotFoundException;
import androidx.test.uiautomator.UiScrollable;
import androidx.test.uiautomator.UiSelector;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;


    public class testYingxing {

        Instrumentation mInstrumentation;
        UiDevice mDevice;

        public void login() throws InterruptedException {
            Thread.sleep(3000);
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/tab_spec_me")).click();
            mDevice.findObject(By.text("登录")).click();
            mDevice.findObject(By.text("请输入手机号")).setText("18849403932");
            mDevice.findObject(By.text("请输入密码")).setText("456");
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
        }

        @Test
        public void testAddWrite() throws Exception {
            mDevice.findObject(By.text("动态")).click();

            for(int i=0;i<5;i++){
                Thread.sleep(2000);
                mDevice.findObject(By.res("com.example.msl.rainbow1:id/btn_new")).click();
                Thread.sleep(3000);
                mDevice.findObject(By.text("分享新鲜事~")).setText("第"+i+"条动态");
                mDevice.findObject(By.text("发送")).click();
                Thread.sleep(3000);
            }
        }

        @Test
        public void testAddPicture() throws Exception {
            mDevice.findObject(By.text("动态")).click();
            for(int i=0;i<3;i++){
                Thread.sleep(2000);
                mDevice.findObject(By.res("com.example.msl.rainbow1:id/btn_new")).click();
                Thread.sleep(3000);
                mDevice.findObject(By.res("com.example.msl.rainbow1:id/btn_addphoto")).setText("第"+i+"张图片");
                mDevice.findObject(By.text("发送")).click();
                Thread.sleep(3000);
            }
        }

        @Test
        public void testAddDongtai() throws Exception {
            mDevice.findObject(By.text("动态")).click();
            for(int i=0;i<3;i++){
                Thread.sleep(2000);
                mDevice.findObject(By.res("com.example.msl.rainbow1:id/btn_new")).click();
                Thread.sleep(3000);
                mDevice.findObject(By.text("分享新鲜事~")).setText("第"+i+"条动态");
                mDevice.findObject(By.res("com.example.msl.rainbow1:id/btn_addphoto")).setText("第"+i+"张图片");
                mDevice.findObject(By.text("发送")).click();
                Thread.sleep(3000);
            }
        }

        @Test
        public void testLike(){
            mDevice.findObject(By.text("动态")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/likeView")).click();
        }

        @Test
        public void testCancleLike(){
            mDevice.findObject(By.text("动态")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/likeView")).click();
        }

        @Test
        public void testShare() throws Exception {
            mDevice.findObject(By.text("动态")).click();
            mDevice.findObject(By.text("分享")).click();
            mDevice.findObject(By.text("QQ好友")).click();

            mDevice.findObject(By.text("分享")).click();
            mDevice.findObject(By.text("取消")).click();

            mDevice.findObject(By.text("分享")).click();
            mDevice.findObject(By.text("微信好友")).click();

            mDevice.findObject(By.text("分享")).click();
            mDevice.findObject(By.text("微信朋友圈")).click();
        }
        @Test
        public void testComment() throws InterruptedException {
            mDevice.findObject(By.text("动态")).click();
            for(int i=1;i<5;i++){
                mDevice.findObject(By.res("com.example.msl.rainbow1:id/ll_comment")).click();
                Thread.sleep(5000);
                mDevice.findObject(By.text("评论内容")).setText("一楼！");
                mDevice.findObject(By.text("发表评论")).click();
            }
        }
        //下滑查看动态
        @Test
        public void testUiScrollable() throws InterruptedException, UiObjectNotFoundException {
            mDevice.findObject(By.text("动态")).click();
            Thread.sleep(3000);
            UiScrollable scrollable=new UiScrollable(new UiSelector().resourceId("com.example.msl.rainbow1:id/lv_post"));
            Log.i("是否可以滚动",scrollable.isScrollable()+"");
            scrollable.flingBackward();
            scrollable.flingToEnd(10);
            mDevice.findObject(By.text("耳畔的风，头顶的云，都不及行走过的山川大地。")).click();
        }

        /********城市模块********/

        @Test
        public void testShouye() throws Exception {
            mDevice.findObject(By.text("城市")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/img_head")).click();
            UiScrollable scrollable=new UiScrollable(new UiSelector().className("android.widget.ScrollView"));
            scrollable.flingBackward();
            scrollable.flingToEnd(10);
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/ll_spot4")).click();
        }

        @Test
        public void testFindCity1() throws Exception {
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_back")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_back")).click();
            mDevice.findObject(By.text("全部")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/btn_allcountry"));
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/btn_allkinds"));
            UiScrollable scrollable=new UiScrollable(new UiSelector().className("android.widget.ScrollView"));
            scrollable.flingBackward();
            scrollable.flingToEnd(10);
            mDevice.findObject(By.text("解放碑")).click();
        }

        @Test
        public void testFindCity2(){
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_back")).click();
            mDevice.findObject(By.text("全部")).click();
            mDevice.findObject(By.text("中国大陆")).click();
            mDevice.findObject(By.text("旅游景点")).click();
            mDevice.findObject(By.text("思南公馆")).click();
        }

        @Test
        public void testFindCity3(){
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_back")).click();
            mDevice.findObject(By.text("全部")).click();
            mDevice.findObject(By.text("意大利")).click();
            mDevice.findObject(By.text("酒店")).click();
            mDevice.findObject(By.text("圣多米尼克皇宫酒店")).click();
        }

        @Test
        public void testCityMovie(){
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_back")).click();
            mDevice.findObject(By.text("全部")).click();
            mDevice.findObject(By.text("法国")).click();
            mDevice.findObject(By.text("旅游景点")).click();
            mDevice.findObject(By.text("亚历山大三世桥")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/img_movie")).click();
            mDevice.findObject(By.res(" com.example.msl.rainbow1:id/tv_movie_name")).click();
        }

        @Test
        public void testCityAround() throws Exception {
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_back")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_back")).click();
            mDevice.findObject(By.text("全部")).click();
            mDevice.findObject(By.text("法国")).click();
            mDevice.findObject(By.text("旅游景点")).click();
            mDevice.findObject(By.text("凯旋门")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/img_map")).click();
            UiScrollable scrollable=new UiScrollable(new UiSelector().className("android.widget.ScrollView"));
            scrollable.flingBackward();
            scrollable.flingToEnd(10);
            mDevice.findObject(By.text("埃菲尔铁塔")).click();
        }

        @Test
        public void testCityLike() throws Exception {
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_back")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_back")).click();
            mDevice.findObject(By.text("全部")).click();
            mDevice.findObject(By.text("意大利")).click();
            mDevice.findObject(By.text("自然风光")).click();
            mDevice.findObject(By.text("凯旋门")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/img_map")).click();
            mDevice.findObject(By.text("陶尔米纳")).click();
            mDevice.findObject(By.text("收藏")).click();

        }

        @Test
        public void testHotCity() throws UiObjectNotFoundException {
            UiScrollable scrollable=new UiScrollable(new UiSelector().className("android.widget.ScrollView"));
            scrollable.flingBackward();
            scrollable.scrollTextIntoView("热门城市");
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/tv_second_city_name")).click();
            mDevice.findObject(By.text("五缘大桥")).click();
        }

        @Test
        public void testHotSpots() throws UiObjectNotFoundException {
            UiScrollable scrollable=new UiScrollable(new UiSelector().className("android.widget.ScrollView"));
            scrollable.flingBackward();
            scrollable.scrollTextIntoView("热门景点");
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/img_big_place")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_back")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/ll_more_spots")).click();
            UiScrollable scr=new UiScrollable(new UiSelector().className("com.examp3le.msl.rainbow1:id/lv_hotplace"));
            scr.flingBackward();
            scr.flingToEnd(9);
            mDevice.findObject(By.text("圣马丁运河")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/img_like")).click();
        }

        @Test
        public void testZhuTi() throws UiObjectNotFoundException {
            UiScrollable scrollable=new UiScrollable(new UiSelector().className("android.widget.ScrollView"));
            scrollable.flingToEnd(10);
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/img_four_theme")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_spot1")).click();
        }

        @Test
        public void testSouSuo() throws UiObjectNotFoundException {
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_back")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_back")).click();
            UiScrollable scrollable=new UiScrollable(new UiSelector().className("android.widget.ScrollView"));
            scrollable.flingToBeginning(10);
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/iv_search")).click();
            mDevice.findObject(By.res("android:id/search_src_text")).setText("北京");
            mDevice.findObject(By.res("android:id/search_mag_icon")).click();
            mDevice.findObject(By.text("北京爱情故事")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/img_like")).click();
            mDevice.findObject(By.res("com.example.msl.rainbow1:id/img_left")).click();
        }

    }