package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class Authorization {

    public WebDriver webDriver;

    public Authorization(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(className = "navbar-tool")
    private WebElement accessButton;

    public void clickAccessButton() { accessButton.click(); }

    @FindBy(id = "ModalLoginUserName")
    private  WebElement loginField;

    @FindBy(id = "ModalLoginPassword")
    private WebElement passwordField;

    public void inputData(String userLogin, String userPassword) {
        loginField.sendKeys(userLogin);
        passwordField.sendKeys(userPassword);
    }

    @FindBy(className = "LoginBtn")
    private WebElement loginButton;

    public void clickLoginButton() { loginButton.click(); }
}
