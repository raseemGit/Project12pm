package com.global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {

	public static WebDriver driver;

	public static WebDriver launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Library\\Chrome81\\chromedriver.exe");

		return driver = new ChromeDriver();
	}

	public static void loadUrl(String url) {

		driver.get(url);

	}

	public static void typeValue(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void clickIt(WebElement element) {

		element.click();

	}

	public static void CloseIt() {
		driver.quit();

	}

}
