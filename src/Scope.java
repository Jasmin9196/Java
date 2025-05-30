import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jasmin\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	    System.out.println(driver.findElements(By.tagName("a")).size());
	    WebElement footerdriver= driver.findElement(By.id("gf-BIG")); //Limiting webdriver scope
	    System.out.println(footerdriver.findElements(By.tagName("a")).size());
	    //3
	    WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    System.out.println(coloumndriver.findElements(By.tagName("a")).size());
	    
	    //4 click on each link in the coloumn and check if the page are opening
	    
	    for (int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
	    {
	    	String ClickonLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	
	    	coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(ClickonLinkTab);
	    	Thread.sleep(5000L);
	    	
	    }
	    //Opens all the tabs
	    Set<String> abc=driver.getWindowHandles(); //4
	    
	    java.util.Iterator<String> it=abc.iterator();
	   
	    while(it.hasNext())
	    {
	    	driver.switchTo().window(it.next());
	    	System.out.println(driver.getTitle());
	}
	   
	    {
	    
	}

}
	
}
