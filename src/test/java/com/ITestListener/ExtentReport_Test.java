package com.ITestListener;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.Base.BaseClass;
import com.aventstack.extentreports.ExtentTest;

public class ExtentReport_Test {

	public static ExtentTest extenttest;

	@BeforeSuite
	public void extentTestReportStartup() {
		BaseClass base = new BaseClass() {
		};
		base.extentReportStart(null);
	}

	@AfterSuite
	public void extentReportEnd() {
		BaseClass base = new BaseClass() {
		};
		base.extentReportTearDown();
	}

}
