package assignment6.sat;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;


public class ParentClass {
	public static ChromeDriver driver;
	public String fileName;
	@BeforeMethod
	public  void preConditon() {
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		WebElement detframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(detframe);
	}
	
	 @DataProvider(name="fetchData")
		public String[][] sendData() throws IOException {
	        String[][] readData = ReadData1.readData(fileName);
		 	return readData;
		}
	 @AfterMethod
		public void postCondition() {
			driver.close();
		}
}

