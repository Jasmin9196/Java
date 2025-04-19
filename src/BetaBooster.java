import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.testng.Assert;


public class BetaBooster {



	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jasmin P\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("http://162.243.162.181/beta-booster/public/login");
			Thread.sleep(1000);
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\Jasmin\\Downloads\\Takesceen short\\screenshot1.png"));
			
			driver.findElement(By.xpath("(//input[@placeholder='name@email.com'])[1]")).sendKeys("abc@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test1234");
			driver.findElement(By.cssSelector("button[type='submit']")).click(); 
			Thread.sleep(1000);
			File src1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src1,new File("C:\\\\Users\\\\Jasmin\\\\Downloads\\\\Takesceen short\\\\screenshot2.png"));
			
	       
			/*Alert alert2 = driver.switchTo().alert();
			String text2 = alert.getText();
			System.out.println(text2);*/
			
		 	//System.out.println(driver.findElement(By.xpath("//span[contains(text(),'The password must be at least 8 characters.')]")).getText());
	    	//Assert.assertEquals(driver.findElement(By.xpath("//span[contains(text(),'The password must be at least 8 characters.')]")).getText(), "The password must be at least 8 characters.");
	       
	    
		 
			
			
	}

		

}


