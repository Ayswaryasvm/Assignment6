package assignment6.sat;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class W3SchoolsPortal extends ParentClass {
	public void setValues() {
		fileName="W3Schools";
	}
	@Test(dataProvider = "fetchData")
	public void runschoolPortal(String cname,String ccnum,String expmonth,String cvv,String expyear,String fname,String email,String adr,String city,String zip,String state) {
		
		driver.findElement(By.xpath("//input[@id='cname']")).sendKeys(cname);
		driver.findElement(By.xpath("//input[@id='ccnum']")).sendKeys(ccnum);
		driver.findElement(By.xpath("//input[@id='expmonth']")).sendKeys(expmonth);
		driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys(cvv);
		driver.findElement(By.xpath("//input[@id='expyear']")).sendKeys(expyear);
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(fname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("adr")).sendKeys(adr);
		driver.findElement(By.id("city")).sendKeys(city);
		driver.findElement(By.id("zip")).sendKeys(zip);
		driver.findElement(By.id("state")).sendKeys(state);
		
	}

}
