package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radio_check {
  @Test
  public void raido() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/checkboxes");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("(//*[@type='checkbox'])[1]")).click();
	  
  }
}
