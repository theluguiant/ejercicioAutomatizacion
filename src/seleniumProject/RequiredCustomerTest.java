package seleniumProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.openqa.selenium.By;
import seleniumConfig.Configuration;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RequiredCustomerTest {
    
	public static Configuration Config = new Configuration();
	
	@BeforeAll
    static void init() {
		Config.setUrl("http://demo.guru99.com/V4/index.php");
		Config.setDriverUrl();
	}
	
	@Test
	public void required() {
		
		Config.driver.findElement(By.name("uid")).sendKeys("mngr160883");
		Config.driver.findElement(By.name("password")).sendKeys("byperEh");
		Config.driver.findElement(By.name("btnLogin")).click();
		Config.driver.findElement(By.linkText("New Customer")).click();
		Config.driver.findElement(By.name("name")).sendKeys();
		Config.driver.findElement(By.name("addr")).click();
		String validation = Config.driver.findElement(By.id("message")).getText();
		if (!validation.contains("Customer name must not be blank")) {
			fail("Fallo: Customer no es requerido");
	    } 
		
	}
	
	@AfterAll 
	static void tearDown() {
		Config.driver.quit();
	}
	

}
