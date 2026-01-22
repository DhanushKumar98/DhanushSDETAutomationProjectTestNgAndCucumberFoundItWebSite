package com.ITestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Base.BaseClass;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class ITestListenerClass extends BaseClass implements ITestListener{
	
	
	//----------Reusable Methods-----------
	private void attachScreenshot(ITestResult result,Status status,String message) {
		try {
			String screenshotPath = takeScreenshot(result.getMethod().getMethodName());
			ExtentReport_Test.extenttest.log(status, result.getMethod().getMethodName() + " : "+ message,
					MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			
		}catch(Exception e) {
			ExtentReport_Test.extenttest.log(status, "Screenshot capture failed: "+ e.getMessage());
		}
	}

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
//		try {
//			ExtentReport_Test.extenttest.pass(result.getMethod() + " : " + "Test Pass",
//				MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot(result.getMethod().getMethodName())).build()
//				);
//		}catch(Exception e) {
//			
//		}
		attachScreenshot(result,Status.PASS, "Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		attachScreenshot(result, Status.FAIL, "Test FAILED");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	

	
	
	
	
	
	
}
