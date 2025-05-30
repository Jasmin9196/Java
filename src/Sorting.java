import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sorting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jasmin\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		
		//capture all webelements into list

		List<WebElement> elementsList= driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all webelements into new (orignal) list
		
		List<String> orignallist=elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort on the orignal list of step 3 > sorted list
		
		List<String>sortedList = orignallist.stream().sorted().collect(Collectors.toList());
		
		//compare orignal list vs sorted list
		
		Assert.assertTrue(orignallist.equals(sortedList));
		
		List<String> price;

		// scan the name column with getText ->Beans->print the price of the Rice

		do

		{

		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));

		price = rows.stream().filter(s -> s.getText().contains("Rice"))

		.map(s -> getPriceVeggie(s)).collect(Collectors.toList());

		price.forEach(a -> System.out.println(a));

		if(price.size()<1)

		{

		driver.findElement(By.cssSelector("[aria-label='Next']")).click();

		}

		}while(price.size()<1);



		}



		private static String getPriceVeggie(WebElement s) {

		// TODO Auto-generated method stub

		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();



		return pricevalue;

		}

		
	}


