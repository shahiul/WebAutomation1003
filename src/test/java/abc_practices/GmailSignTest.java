package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GmailSignTest {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver(); // for chrome browser
driver.get("https//www.google.com");
driver.findElement(By.id("gb_70")).click();
System.out.println("I clicked on the sign in button ...");
Thread.sleep(20000);
//TODOs: complete the remaining codes
Thread.sleep(2000);
driver.close();
	}
	

}
