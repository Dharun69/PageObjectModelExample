import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;
import pageObjects.UpdateProfileObjects;

public class UpdateProfile {

	@Test
	public void afterLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\browserdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.phptravels.net/login");
		driver.manage().window().maximize();
	Thread.sleep(3000);
	
	PageFactory.initElements(driver, LoginPageObjects.class);
	PageFactory.initElements(driver, UpdateProfileObjects.class);
	
	LoginPageObjects.userName.sendKeys("user@phptravels.com");
	LoginPageObjects.passWord.sendKeys("demouser");
	LoginPageObjects.loginButton.click();
	Thread.sleep(3000);
	UpdateProfileObjects.myProfile.click();
	UpdateProfileObjects.updatePhoneNumber.sendKeys("9819191981");
	UpdateProfileObjects.updateCity.sendKeys("aisdfsdj");
	Thread.sleep(3000);

	UpdateProfileObjects.sumbit.click();
	
	
//	LoginPageObjects.userName(driver).sendKeys("user@phptravels.com");
//	LoginPageObjects.passWord(driver).sendKeys("demouser");
//	LoginPageObjects.loginButton(driver).click();
//	
//	
//	UpdateProfileObjects.myProfile(driver).click();
//	UpdateProfileObjects.updatePhoneNumber(driver).clear();
//	Thread.sleep(3000);
//	UpdateProfileObjects.updatePhoneNumber(driver).sendKeys("56651");
//	UpdateProfileObjects.updateCity(driver).sendKeys("HI");
//	Thread.sleep(3000);
//	UpdateProfileObjects.sumbit(driver).click();

	
	
	
	
	
	
	
	
	
	
	
	
	
//	WebElement myProfile = driver.findElement(By.xpath("//*[@id=\'fadein\']/div[1]/div/div[3]/ul/li[4]/a"));
//	myProfile.click();
//	
//	WebElement updatePhoneNumber = driver.findElement(By.name("phone"));
//	updatePhoneNumber.sendKeys("651651651");
//	
//	WebElement updateCity = driver.findElement(By.name("city"));
//	updateCity.sendKeys("Coimbatore");
//	
//	
//	WebElement sumbit = driver.findElement(By.xpath("//*[@id=\'fadein\']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"));
//	sumbit.click();
	}
	
}
