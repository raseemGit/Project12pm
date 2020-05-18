package com.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.global.Library;

import io.cucumber.core.api.Scenario;
import io.cucumber.core.event.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Library {

	@Before
	public void beforeScenario(Scenario sc) {

		String name = sc.getName();

		System.out.println("Scenario NAme :" + name);

	}

	@After
	public void afterScenario(Scenario sc) {

		Status st = sc.getStatus();

		System.out.println(st);

		// ======================================================

		if (sc.isFailed()) {

			TakesScreenshot tk = (TakesScreenshot) driver;

			byte[] bt = tk.getScreenshotAs(OutputType.BYTES);

			sc.embed(bt, "scenarioScrnSchot/png");
		}

	}

}
