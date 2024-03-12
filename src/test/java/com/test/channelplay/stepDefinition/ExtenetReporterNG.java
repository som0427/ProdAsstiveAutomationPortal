package com.test.channelplay.stepDefinition;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public  class ExtenetReporterNG  {
	
	public static ExtentReports extent;	
	
	public static ExtentReports getreporterObject() {
		String path =	System.getProperty("user.dir")+"\\Reports\\Assistivereport.pdf";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Assistive result");
		reporter.config().setDocumentTitle("Test Result");
		reporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Company Name", "Channelplay Limited");
		extent.setSystemInfo("Software Test Engineer", "Md Taufik");
		extent.setSystemInfo("Profile Role","Automation");
		extent.setSystemInfo("Project Name", "Assistive Prod");
		extent.setSystemInfo("Automated App", "Assistive Mobile Application");
		
		return extent;
	}

}
