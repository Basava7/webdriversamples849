package testScript;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Google {
	WebDriver driver;
@Parameters("browser")	
  @BeforeTest 
  public void Setup() {
//	  ChromeOptions options =new ChromeOptions();
//	  options.setBrowserVersion("120");	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/login");
	  WebElement name = driver.findElement(By.cssSelector("#usernmae"));
      name.clear();
	  name.sendKeys("tomsmith");
    
    driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
    driver.findElement(By.cssSelector("radius")).submit();
  }
  @Test
 public void Gogle() {
 
  }
	 @AfterTest 
  public void Teardown() {
//	  
	 
 driver.close();
    
}	  
	  //driver.quit();
	  
  }


