package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.global.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\FeaturesFolder" }, glue = { "com.steps" }, dryRun = false, tags = {
		"@login" }, plugin = { "pretty", "json:src\\test\\resources\\Reports\\cucumJsonFl.json",
				"rerun:src\\test\\resources\\FeaturesFolder\\failedfeatures.txt" }, monochrome = true)
public class TestRunner {

	@AfterClass
	public static void afterTestRunner() {

		JVMReport.generateJVMReport(
				System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\cucumJsonFl.json");

	}

}
