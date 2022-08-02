package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lanuch {
 WebDriver driver;
@Test 
public void Lanching_the Browser()
{
 //System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
 
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  driver.get("https://mobileworld.azurewebsites.net");
  driver.manage().window().maximize();	
}

}
