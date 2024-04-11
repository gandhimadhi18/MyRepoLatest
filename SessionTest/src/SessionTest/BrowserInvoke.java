package SessionTest;
import java.time.Duration;
//import org.openqa.selenium.WebDriver;

//importing required classes
import org.openqa.selenium.chrome.ChromeDriver; 

public class BrowserInvoke {
               //Main driver method
	public static void main(String[] args) {
			 System.setProperty("webdriver.chrome.driver", 
					 "C:\\Users\\Gandhimadhi.DESKTOP-9AGCCTE\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			//ChromeDriver driver = new ChromeDriver();	           
			 ChromeDriver driver=new ChromeDriver();
			 driver = new ChromeDriver();
			 driver.manage().deleteAllCookies();
			               //Maximize the browser 
				           //using maximize() method
				           driver.manage().window().maximize();
				           //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				           //Launching website
				            driver.get("https://www.geeksforgeeks.org/");
				           String websiteTitle = driver.getTitle();
				           System.out.println("Website Title: " + websiteTitle);
				            //driver.quit();				         
                      }

}
