package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="txtUsername")
	private WebElement useranme;
	
	@FindBy(xpath="//*[@id='txtPassword']")
	private WebElement password;
	
	@FindBy(xpath="//*[@id='btnLogin']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		
	
		PageFactory.initElements(driver, this);
	}
	
	public void login(String user, String pass) {
		
		useranme.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
	}
	
}
