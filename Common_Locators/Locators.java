package CommonLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators
{
	WebDriver d;
	public String SetChromePath(String Data, String Path)
	{
		return System.setProperty(Data, Path);
	}

	public String SetFirefoxPath(String Data, String Path)
	{
		return System.setProperty(Data, Path);
	}

	public void Url(WebDriver d, String url)
	{
		d.get(url);
	}

	public WebElement Id(WebDriver d, String ElementValue)
	{
		return d.findElement(By.id(ElementValue));
	}

	public WebElement Name(WebDriver d, String ElementValue)
	{
		return d.findElement(By.name(ElementValue));
	}

	public WebElement Xpath(WebDriver d, String ElemetValue)
	{
		return d.findElement(By.xpath(ElemetValue));
	}

	public void CloseUrl()
	{
		d.close();
	}

}
