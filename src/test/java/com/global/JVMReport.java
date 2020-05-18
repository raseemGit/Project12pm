package com.global;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJVMReport(String jsonFile) {

		Configuration con = new Configuration(
				new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports"), "Hexa Project");

		con.addClassifications("Browser", "Chrome");
		con.addClassifications("Env", "Java,Cucumber");
		
		//============================================================
		
		List<String> li = new ArrayList<String>();
		li.add(jsonFile);
		
		
		//===========================================================
		
		ReportBuilder build = new ReportBuilder(li, con);
		
		build.generateReports();
		
		
		
	}

}
