package seleniumProject;

import org.openqa.selenium.By;

import seleniumConfig.Configuration;

public class Demo{
	
	public static Configuration Config;
	
	public static void main(String[] args) {
		
		Config = new Configuration();
		Config.setUrl("http://demo.guru99.com/V4/index.php");
		Config.setDriverUrl();
		Config.driver.findElement(By.name("uid")).sendKeys("mngr160883");
		Config.driver.findElement(By.name("password")).sendKeys("byperEh");
	
	}
}
