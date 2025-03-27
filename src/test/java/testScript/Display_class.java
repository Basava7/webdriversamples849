package testScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Display_class {
  @Test
  public void display() throws IOException {
  WebDriver driver=new ChromeDriver();
  driver.get("https://automationbookstore.dev/");
  driver.manage().window().maximize();
  TakesScreenshot screenshot = (TakesScreenshot)driver;
//Saving the screenshot in desired location
  
  File scrFile = screenshot.getScreenshotAs(OutputType.FILE);
  System.out.println("Screenshot is captured");
  FileUtils.copyFile(scrFile, new File("screenshots/screenshot.png"));
  //driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
  WebElement name = driver.findElement(By.id("searchBar"));
          //name.clear();
		  name.sendKeys("Test");
		  
      
  
  }
}
