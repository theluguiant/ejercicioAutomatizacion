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
	
	//@Test
//	public void required() {
//		
//		Config.driver.findElement(By.name("uid")).sendKeys("mngr160883");
//		Config.driver.findElement(By.name("password")).sendKeys("byperEh");
//		Config.driver.findElement(By.name("btnLogin")).click();
//		Config.driver.findElement(By.linkText("New Customer")).click();
//		Config.driver.findElement(By.name("name")).sendKeys();
//		Config.driver.findElement(By.name("addr")).click();
//		String validation = Config.driver.findElement(By.id("message")).getText();
//		if (!validation.contains("Customer name must not be blank")) {
//			fail("Fallo: Customer no es requerido");
//	    } 
//	}
	
	@Test
	public void crearcustomer() {
		
		Config.driver.findElement(By.name("uid")).sendKeys("mngr160883");
		Config.driver.findElement(By.name("password")).sendKeys("byperEh");
		Config.driver.findElement(By.name("btnLogin")).click();
		Config.driver.findElement(By.linkText("New Customer")).click();
		Config.driver.findElement(By.name("name")).sendKeys("yoddi");
		Config.driver.findElement(By.name("rad1")).sendKeys("male");
		Config.driver.findElement(By.name("dob")).sendKeys("27/06/1992");
		Config.driver.findElement(By.name("addr")).sendKeys("cra69805");
		Config.driver.findElement(By.name("city")).sendKeys("Medellin");
		Config.driver.findElement(By.name("state")).sendKeys("Antioquia");
		Config.driver.findElement(By.name("pinno")).sendKeys("123456");
		Config.driver.findElement(By.name("telephoneno")).sendKeys("123456789");
		Config.driver.findElement(By.name("emailid")).sendKeys("yod@elpp.edu.co");
		Config.driver.findElement(By.name("password")).sendKeys("987654");
		Config.driver.findElement(By.name("sub")).click();
		//como guardar un path 
		//String idCustomer = Config.driver.findElement(By.xpath("customer")).getText();
		Config.driver.findElement(By.linkText("Continue")).click();
		Config.driver.findElement(By.linkText("Edit Customer")).click();
		//Config.driver.findElement(By.name("cusid")).sendKeys(idCustomer);
		//Config.driver.findElement(By.name("AccSubmit")).click();
		//obtener datos de una ventana emergente
		//como se pasa de una prueba a otra
	}
	
//	@Test
//	public void eliminarcustomerverificar() {
//		
//		Config.driver.findElement(By.name("uid")).sendKeys("mngr160883");
//		Config.driver.findElement(By.name("password")).sendKeys("byperEh");
//		Config.driver.findElement(By.name("btnLogin")).click();
//		Config.driver.findElement(By.linkText("Delete Customer")).click();
//		Config.driver.findElement(By.name("cusid")).sendKeys("6228");
//		Config.driver.findElement(By.name("AccSubmit")).click();
//		//esta mostrando una ventana emergente como se controla ese mensaje de confirmación?
//		//verificar customer
//		//Config.driver.findElement(By.linkText("Edit Customer")).click();
//		//Config.driver.findElement(By.name("cusid")).sendKeys("6228");
//		//Config.driver.findElement(By.name("AccSubmit")).click();
//	}

//	@AfterAll 
//	static void tearDown() {
//		Config.driver.quit();
//	}
	
	

}
