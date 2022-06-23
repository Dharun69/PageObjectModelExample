package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObjects {
    @FindBy(how = How.NAME, using = "email")
	public static WebElement userName;
	@FindBy(name = "password")
    public static WebElement passWord;
	
	@FindBy(xpath ="//*[@id=\'fadein\']/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
	public static WebElement loginButton;
	
	
	
	
	/*public static WebElement userName(WebDriver driver) {
		return driver.findElement(By.name("email"));
	}
	
	public static WebElement passWord(WebDriver driver) {
		 return driver.findElement(By.name("password"));
	}
	
	public static WebElement loginButton(WebDriver driver) {
		 return driver.findElement(By.xpath("//*[@id=\'fadein\']/div[1]/div/div[2]/div[2]/div/form/div[3]/button/span[1]"));

	}*/
	
}
