package packagenew;

import java.time.Duration;
import java.util.List;

import org.dataloader.impl.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Commonpgm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Chromedriver\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();					                                                
		driver.get("https://demo.opencart.com/");		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		String Actualtitle = driver.getTitle();
		String Exptitle = "Your Store";
		
		System.out.println(Actualtitle);
		//Assertions.assertEquals(Actualtitle,Exptitle);
		
		WebElement texts = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']"));
		
		System.out.println(texts.getText());
		


		
		

		}		
	}


