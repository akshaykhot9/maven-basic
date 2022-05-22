package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTests {
	public static WebDriver driver;
	LoginPage lp;

	@BeforeClass
	public void init() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

		lp = new LoginPage(driver);

	}

	@Test
	public void login() throws InterruptedException {

		lp.login("Admin", "admin123");

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
