import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BetaBoosterCreateAccount {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver;
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Eclipse\\eclipse-java-2022-09-R-win32-x86_64\\Introduction\\src\\keydriven\\ClientPanel");
		prop.load(ip);
		System.setProperty("C:\\Users\\Pruthish\\OneDrive\\Desktop\\chromedriver.exe", "Webdriver.chrome.driver");
		driver = new ChromeDriver();
		//System.out.println(prop.getProperty("browser"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("createaccount"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop.getProperty("companyname"))).sendKeys(prop.getProperty("addname"));
		driver.findElement(By.xpath(prop.getProperty("password"))).sendKeys(prop.getProperty("addpass"));
		driver.findElement(By.xpath(prop.getProperty("mainperson_contact"))).sendKeys(prop.getProperty("addmain"));
		driver.findElement(By.xpath(prop.getProperty("company_address"))).sendKeys(prop.getProperty("comapnyadd"));
		driver.findElement(By.xpath(prop.getProperty("POC_mai"))).sendKeys(prop.getProperty("pocmail"));
		
		driver.findElement(By.xpath(prop.getProperty("street_address"))).sendKeys(prop.getProperty("streetadd"));
		
		Thread.sleep(4000);
		driver.findElement(By.xpath(prop.getProperty("upload_profile"))).click();
		
		Robot rb=new Robot();
		rb.delay(2000);
		
		StringSelection ss=new StringSelection("Pictures\\images.jfif");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(8000);
		//driver.findElement(By.xpath(prop.getProperty("clicktrash"))).sendKeys(Keys.TAB);
		Thread.sleep(4000);


   //WebElement element = driver.findElement(By.xpath(prop.getProperty("continue")));	
   //Actions actions = new Actions(driver);
   //actions.moveToElement(element).build().perform();
  
   
   driver.findElement(By.xpath(prop.getProperty("continue"))).click();
		
	
		
		

      
			
	   
		//Dimension d =new Dimension(2048,1536);
		//driver.manage().window().setSize(d);
		//Thread.sleep(6000);
		//driver.findElement(By.xpath(prop.getProperty("continue")));	
		
		
	
		
		
	}
}
