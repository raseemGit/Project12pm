package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.global.Library;

public class LoginPageObjects extends Library {

	public LoginPageObjects() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	private WebElement txtUser;

	@FindBy(id = "pass")
	private WebElement txtPass;

	@FindBy(id = "loginbutton")
	private WebElement logButton;

	// =================================

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getLogButton() {
		return logButton;
	}

}
