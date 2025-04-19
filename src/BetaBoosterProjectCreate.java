import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.io.FileUtils;

public class BetaBoosterProjectCreate {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jasmin P\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.manage().window().maximize();
		driver.get("http://162.243.162.181/beta-booster/public/login");
		//File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src,new File("C:\\Users\\hp\\screenshot1.png"));
	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[1]/div/input")).sendKeys("jack123@yopmail.com");
		driver.findElement(By.xpath("//input [@type='password']")).sendKeys("jack@12345");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/form/div/div[3]/button")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[normalize-space()='My Projects']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("h6[class='mb-0']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Enter name of the new project*']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter name of the new project*']")).sendKeys("PMS users49");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("label[for='category7'] div[class='card car-service bg-shap-blue text-center px-3']")).click();
		Thread.sleep(2000);
		WebElement targetElement = driver.findElement(By.xpath("//button[normalize-space()='Add Team Members']"));
		Thread.sleep(3000);
		Actions actions =new Actions(driver);
		actions.scrollToElement(targetElement).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Team Members']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='form-control ic_search shadow']")).sendKeys("BA");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='flexRadioDefault0'] [1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Assign']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@role='button'][normalize-space()='Next Page']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='card car-service bg-shap-blue text-center px-3 py-5 mb-5'])[1]")).click();
		Thread.sleep(3000);
		WebElement targetElement1 = driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary shadow rounded-10 client-myproject-step-2-upload']"));
		Actions actions1 =new Actions(driver);
		actions1.scrollToElement(targetElement1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-sm btn-primary shadow rounded-10 client-myproject-step-2-upload']")).click();
		
		
		
		//driver.findElement(By.xpath("//button[@class='avatar-btn userprofile']//img")).click();
		//driver.findElement(By.xpath("//button[normalize-space()='Sign Out']")).click();
		//File src1=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src1,new File("C:\\Users\\hp\\screenshot2.png"));
		
		Robot rb=new Robot();
		rb.delay(2000);
		
		StringSelection ss=new StringSelection("Downloads\\Check33 pages_1667562972.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	
		//driver.findElement(By.cssSelector("form[class='d-flex align-items-center'] span[class='fs-6']")).getText();
		Thread.sleep(9000);
		
		
		driver.findElement(By.xpath("//div[@class='d-flex justify-content-between btn-back-nextpagegroup']//button[@class='btn btn-primary btn-next-client-myproject max-width-250 btn-auto px-5'][normalize-space()='Next Page']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@placeholder='Select Date'][1]")).click();
		//Thread.sleep(7000);
		//driver.findElement(By.xpath("//*[name()='svg'][@class='dp__icon'])[2]")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dp__cell_inner dp__pointer dp__date_hover dp__today']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("budget")).sendKeys("50000");
		Thread.sleep(4000);

		driver.findElement(By.cssSelector("label[for='servicePage_1']")).click();
		Thread.sleep(4000);
		
		WebElement targetElement2 = driver.findElement(By.xpath("//div[@class='col-12 client-admin-buttons']//button[@class='btn btn-sm btn-back btn-primary px-4 shadow rounded-6'][normalize-space()='Next Page']"));
		
		
		Actions actions2 =new Actions(driver);
		actions2.scrollToElement(targetElement2).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='col-12 client-admin-buttons']//button[@class='btn btn-sm btn-back btn-primary px-4 shadow rounded-6'][normalize-space()='Next Page']")).click();
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("#answer0")).sendKeys("Test");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class='col-12 mt-5']//button[@class='btn btn-sm btn-back btn-primary px-4 shadow rounded-6'][normalize-space()='Next Page']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@id='notes']")).sendKeys("okay");
		Thread.sleep(3000);
		
		
		WebElement targetElement4 = driver.findElement(By.xpath("//button[normalize-space()='Submit for Review']"));
		Actions actions4 =new Actions(driver);
		actions4.scrollToElement(targetElement4).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Submit for Review']")).click(); 
		//Thread.sleep(4000);
		//System.out.println(driver.findElement(By.xpath("div[class='col-sm-7 col-lg-7 col-xl-6 congratulation-popup p-0'] h3[class='fw-bold']")).getText());
		Thread.sleep(5000);
		WebElement targetElement5 = driver.findElement(By.xpath("//button[normalize-space()='Return to My Projects']"));
		Actions actions5 =new Actions(driver);
		actions5.scrollToElement(targetElement5).perform();
		driver.findElement(By.xpath("//button[normalize-space()='Return to My Projects']")).click();
		
		
	
		
	}
	
}