package testScript;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class GooglePageStart {
  @Test
  public void SeleniumSearch() {
//	  ChromeOptions options =new ChromeOptions();
//	  options.setBrowserVersion("120");	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/login");
	  driver.manage().window().maximize();
	  //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
	  driver.findElement(By.cssSelector("#usernmae")).sendKeys("tomsmith");
	  driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
	  //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");
	  
	  //driver.findElement(By.className("radius")).click();
	  //driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']")).click();
	  driver.findElement(By.cssSelector("radius")).click();
	  //driver.findElement(By.xpath("//button[@class='radius']")).click();
	  
	  
	  //driver.quit();
	  
  }
}
