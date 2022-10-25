package com.smarttechqa.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.smarttechqa.basepage.BaseClass;

public class TestListener extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test has started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test is successful");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test has skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		logger.info("Test Finished");
		
	}

}
