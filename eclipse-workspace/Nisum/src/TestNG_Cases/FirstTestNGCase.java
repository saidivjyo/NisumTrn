package TestNG_Cases;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGCase {
	
	@Test
    public void testFirstApplicationBodyContent() throws Exception {
//		fail("Not yet implemented");
		try {
			String exePath = "/Users/nisum/Downloads/chromedriver";
			System.setProperty("webdriver.chrome.driver", exePath);
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:8081/Nisum/gittrial4.html");
			boolean flag = driver.findElement(By.tagName("body")).getText().equals("git trial4");
			if(flag) {
				System.out.println("body content was same");
				Reporter.log("Test case was passed");
			}
			else {
				Reporter.log("Test case was not passed");
				throw new Exception("Test Case Failed because of Verification");
				
			}
		}
		catch(Exception e) {
			System.out.println("error occured while connecting chrome driver");
			throw new Exception("Test Case Failed because of Verification");
		}
	}

}
