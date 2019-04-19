package com.yorkland_admin.pageobject.signup;

import org.openqa.selenium.WebDriver;

import com.yorkland_admin.pageobject.BasePageObject;
import com.yorkland_admin.webcontrol.ButtonWebControl;
import com.yorkland_admin.webcontrol.TextBoxWebControl;

public class SignUpPage extends BasePageObject{
	
	private String enter_userName = "username";
	private String enter_passWord = "password";
	private String enter_firstName = "firstName";
	private String enter_lastName = "lastName";
	private String enter_email = "email";
	private String enter_adminCode = "adminCode";
	private String button_signUp = "//button[@class='btn btn-lg btn-primary btn-block']";

	public SignUpPage(WebDriver driver, String baseUrl, String path) {
		super(driver, baseUrl, path);
		this.driver = driver;
	}

	public SignUpPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}	
	
	public SignUpPage enter_userName(String userName) {
		TextBoxWebControl userNameWebControl = new TextBoxWebControl(driver, enter_userName, findByName);
		userNameWebControl.enterText(userName);
		return this;
	}
	
	public SignUpPage enter_password(String password) {
		TextBoxWebControl passwordWebControl = new TextBoxWebControl(driver, enter_passWord, findByName);
		passwordWebControl.enterText(password);
		return this;
	}
	
	public SignUpPage enter_firstName(String firstName) {
		TextBoxWebControl firstNameWebControl = new TextBoxWebControl(driver, enter_firstName, findByName);
		firstNameWebControl.enterText(firstName);
		return this;
	}
	
	public SignUpPage enter_lastName(String lastName) {
		TextBoxWebControl lastNameWebControl = new TextBoxWebControl(driver, enter_lastName, findByName);
		lastNameWebControl.enterText(lastName);
		return this;
	}
	
	public SignUpPage enter_email(String email) {
		TextBoxWebControl emailWebControl = new TextBoxWebControl(driver, enter_email, findByName);
		emailWebControl.enterText(email);
		return this;
	}
	
	public SignUpPage enter_adminCode(String adminCode) {
		TextBoxWebControl adminCodeWebControl = new TextBoxWebControl(driver, enter_adminCode, findByName);
		adminCodeWebControl.enterText(adminCode);
		return this;
	}
	
	public SignUpPage click_signUpButton() {
		ButtonWebControl signUpButtonWebControl = new ButtonWebControl(driver, button_signUp, findByXpath);
		signUpButtonWebControl.clickButton();
		return this;
	}
}
