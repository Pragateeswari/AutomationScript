package Automation;

public class lanuch {
WebDriver driver;
@Test public void Lanching_the Browser()
{
 System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
 driver = new ChromeDriver();
 driver.get("https://mobileworld.azurewebsites.net");
 driver.manage().window().maximize();	
}
}
