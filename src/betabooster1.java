import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class betabooster1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Eclipse\\eclipse-java-2022-09-R-win32-x86_64\\Introduction\\src\\keydriven\\read.properties");
		prop.load(ip);
		System.setProperty("C:\\Users\\Pruthish\\OneDrive\\Desktop\\chromedriver.exe", "Webdriver.chrome.driver");
		driver = new ChromeDriver();
		System.out.println(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath(prop.getProperty("email_Adress"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("password_name"))).sendKeys(prop.getProperty("password"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("contune"))).click();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath(prop.getProperty("ManageProject"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("OverView"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("NewProject"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("EnterProjectName"))).sendKeys(prop.getProperty("ProjectName"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("Amount"))).sendKeys(prop.getProperty("amnT"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("DeliveryDate"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("DDclick"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("DDclick"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("DDclick"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("DDclick"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("DDclick"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("May23"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("ArrowUP"))).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath(prop.getProperty("ProjectManagerSearch"))).sendKeys("anjali",Keys.ENTER);
		Thread.sleep(7000);
		driver.findElement(By.xpath(prop.getProperty("Remove"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("ArrowUP"))).click();
		//driver.findElement(By.xpath(prop.getProperty("pManager"))).clear();
		Thread.sleep(8000);
		driver.findElement(By.xpath(prop.getProperty("ProjectManagerSearch"))).sendKeys("anujAshar",Keys.ENTER);
		Thread.sleep(8000);
		//driver.findElement(By.xpath(prop.getProperty("ProjectManagerSearch"))).sendKeys("anujAshar",Keys.ENTER);
		//Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("Remove"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("ArrowUP"))).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath(prop.getProperty("ProjectManagerSearch"))).sendKeys("bhauTik",Keys.ENTER);
		
		//driver.findElement(By.xpath(prop.getProperty("LogOutLogo"))).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath(prop.getProperty("SignOut"))).click();
		
		
	}
	
	

}
