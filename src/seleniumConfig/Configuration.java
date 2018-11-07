package seleniumConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuration {
	
	public ChromeDriver driver;
	public String url;
	
	public Configuration() {
		this.setPropertyWebdriver();
		this.driver = new ChromeDriver();
	}
	
	public void setPropertyWebdriver() {
		System.setProperty("webdriver.chrome.driver","selenium-libs\\selenium-java-3.14.0\\chromedriver.exe");
	}
	
	public void setDriverUrl() {
		this.driver.get(this.url);
	}
	
	public void setUrl(String _url) {
		this.url = _url;
	}
	
	public String getUrl() {
		return this.url;
	}
}
