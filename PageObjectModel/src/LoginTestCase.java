import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;

public class LoginTestCase {
	@Test
	public void phpTravels() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.phptravels.net/login");

		Thread.sleep(3000);
		PageFactory.initElements(driver, LoginPageObjects.class);		
		LoginPageObjects.userName.sendKeys("user@phptravels.com");
		LoginPageObjects.passWord.sendKeys("demouser");
		LoginPageObjects.loginButton.click();



		//		LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
		//		LoginPageObjects.passWord(driver).sendKeys("demouser");
		//		LoginPageObjects.loginButton(driver).click();










		/*WebElement loginUser = driver.findElement(By.name("email"));
	loginUser.sendKeys("user@phptravels.com");

	WebElement loginPassword = driver.findElement(By.name("password"));
	loginPassword.sendKeys("demouser");

	WebElement loginButton = driver.findElement(By.xpath("//*[@id=\'fadein\']/div[1]/div/div[2]/div[2]/div/form/div[3]/button/span[1]"));
	loginButton.click();
	driver.quit();*/

	}



}
