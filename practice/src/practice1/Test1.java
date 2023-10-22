package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\HP\\Downloads\\chrome-win64\\chromedriver.exe");
      WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement obj =driver.findElement(By.xpath("//select[@id='course']"));
        Select select = new Select(obj);
        select.selectByIndex(2);
        select.selectByValue("java");
        WebElement obj2 =driver.findElement(By.xpath("//*[@id=\"ide\"]"));
        Select selectm = new Select(obj2);
       List<WebElement> list  = selectm.getAllSelectedOptions();
       System.out.println(list.size()); 
       selectm.selectByIndex(1);
       selectm.selectByValue("vs");
       System.out.println(list.size());
       driver.quit();
	
	}

}
