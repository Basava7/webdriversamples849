package testScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New_test {
  @Test
  public void daynamicWebTable() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  driver.manage().window().maximize();
	  List<WebElement> Items= driver.findElements(By.xpath("//td[contains(text(),'Master In cocumber')]//following::td"));
	  for (WebElement item:Items){
		  System.out.println(item.getText());
	  }
	  
			  
  }
}
