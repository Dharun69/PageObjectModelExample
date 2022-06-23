package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateProfileObjects {
	
	@FindBy(xpath = "//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a")
	public static WebElement myProfile;
	@FindBy(name = "phone")
	public static WebElement updatePhoneNumber;
	@FindBy(name = "city")
	public static WebElement updateCity;
	@FindBy(xpath = "//*[@id=\'fadein\']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button")
	public static WebElement sumbit;
	
	
	

//	public static WebElement myProfile(WebDriver driver) {
//		return driver.findElement(By.xpath("//*[@id=\'fadein\']/div[1]/div/div[3]/ul/li[4]/a"));
//	}
//	
//	public static WebElement updatePhoneNumber(WebDriver driver) {
//		return driver.findElement(By.name("phone"));
//	}
//	
//	public static WebElement updateCity(WebDriver driver) {
//		 return driver.findElement(By.name("city"));
//		
//	}
//	
//	public static WebElement sumbit(WebDriver driver) {
//		return driver.findElement(By.xpath("//*[@id=\'fadein\']/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button"));
//	}
}

