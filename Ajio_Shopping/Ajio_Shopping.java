package AjioShopping;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonLocators.Locators;


public class Ajio_Shopping extends Locators
{
	WebDriver driver;
	public void ajio()
	{
		Locators loc=new Locators();

		loc.SetChromePath("webdriver.chrome.driver","/home/qq379/Selenium/chromedriver");

		driver=new ChromeDriver();

		loc.Url(driver, "https://www.ajio.com/");

		driver.manage().window().maximize();

		loc.Name(driver, "searchVal").click();

		loc.Xpath(driver, "//span[contains(text(),'kurti')]").click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		loc.Xpath(driver, "(//div[contains(text(),'OM SAI LATEST CREATION')])[3]").click();

		String parent=driver.getWindowHandle();
		Set<String> window=driver.getWindowHandles();
		ArrayList<String> tab=new ArrayList<String>(window);
		driver.switchTo().window(tab.get(1));

		loc.Xpath(driver, "(//div[@class='img-container'])[2]").click();

		loc.Xpath(driver, "(//div[@class='size-swatch'])[1]").click();

		loc.Xpath(driver, "//span[contains(text(),'ADD TO BAG')]").click();

		driver.close();
		driver.quit();



	}
}
