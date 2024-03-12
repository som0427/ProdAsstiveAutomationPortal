package com.test.channelplay.stepDefinition;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class Listeners implements ITestListener  {
	ExtentTest test;
ExtentReports extent = ExtenetReporterNG.getreporterObject();
	
	
	    @Override
	    public void onTestStart(ITestResult result) {

			test= extent.createTest(result.getMethod().getMethodName());
	    }
 
	    @Override
	    public void onTestSuccess(ITestResult result) {
	       test.log(Status.PASS, "Testcase Passesd") ;
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	    	test.log(Status.FAIL, result.getThrowable());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	       
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	          
	    }

	    @Override
	    public void onStart(ITestContext context) {
	        
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	       extent.flush();
	    }

	 
	}
	