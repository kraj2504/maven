package GitGroup.GitArt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google 
{
	WebDriver driver;
  @Test
  public void f() throws Exception 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\LabInfoSysTestNG\\Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.google.com");
	  Thread.sleep(2000);
	  driver.close();
  }
}
