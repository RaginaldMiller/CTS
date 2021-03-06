package com.dg11185.test;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Demo1 extends UiAutomatorTestCase{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//new UiAutomatorHelper("Demo", "com.jikexueyuan.demo.Demo1", "testBrowser", "1");
		
		String workspase, className, jarName, androidId, sdkpath;
		workspase="E:\\Users\\Administrator\\workspace\\TestCTS";
		className="com.dg11185.test.Demo1";
		jarName="demo1";
		androidId="1";
		sdkpath="F:\\adt-bundle-windows-x86-20140702\\adt-bundle-windows-x86-20140702\\sdk";
		CtsHelper cts=new CtsHelper(workspase, className, jarName, androidId, sdkpath);
		cts.setDevices("emulator-5554");
		cts.runTest();

	}
	public void testBrowser() throws UiObjectNotFoundException{
		UiDevice.getInstance().pressHome();
		UiObject browser=new UiObject(new UiSelector().text("浏览器"));
		browser.clickAndWaitForNewWindow();
		UiObject edit=new UiObject(new UiSelector().className("android.widget.EditText"));
		edit.click();
		UiDevice.getInstance().pressDelete();
		edit.setText("www.baidu.com");
		UiDevice.getInstance().pressEnter();
		
	}
	public void testBrowser2() throws UiObjectNotFoundException{
		UiDevice.getInstance().pressHome();
		UiObject browser=new UiObject(new UiSelector().text("浏览器"));
		browser.clickAndWaitForNewWindow();
		UiObject edit=new UiObject(new UiSelector().className("android.widget.EditText"));
		edit.click();
		UiDevice.getInstance().pressDelete();
		edit.setText("www.baidu.com");
		UiDevice.getInstance().pressEnter();
		
	}
	public void testBrowser3() throws UiObjectNotFoundException{
		UiDevice.getInstance().pressHome();
		UiObject browser=new UiObject(new UiSelector().text("浏览器"));
		browser.clickAndWaitForNewWindow();
		UiObject edit=new UiObject(new UiSelector().className("android.widget.EditText"));
		edit.click();
		UiDevice.getInstance().pressDelete();
		edit.setText("www.baidu.com");
		UiDevice.getInstance().pressEnter();
		
	}
	public void testBrowser4() throws UiObjectNotFoundException{
		UiDevice.getInstance().pressHome();
		UiObject browser=new UiObject(new UiSelector().text("浏览器"));
		browser.clickAndWaitForNewWindow();
		UiObject edit=new UiObject(new UiSelector().className("android.widget.EditText"));
		edit.click();
		UiDevice.getInstance().pressDelete();
		edit.setText("www.baidu.com");
		UiDevice.getInstance().pressEnter();
		
	}
	public void test1(){
		UiDevice.getInstance().pressMenu();
	}
	public void test2(){
		UiDevice.getInstance().pressMenu();
	}
	public void test3(){
		UiDevice.getInstance().pressMenu();
	}
	public void test4(){
		UiDevice.getInstance().pressMenu();
	}

}
