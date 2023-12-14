package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAlllLinkws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement>linklist = driver.findElements(By.tagName("a"));
        for(WebElement link : linklist){
        	String linkstext = link.getText();
        	String linkurl = link.getAttribute("href");
        	System.out.println("text"+linkstext);
        	System.out.println("urllink"+linkurl);
        	driver.quit();
        }
	}

}
