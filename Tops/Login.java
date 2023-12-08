package Tops;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.DriverConnection;

public class Login {
		static WebDriver driver;
	        @BeforeClass
	        public void openBrowser() { 
	        driver = new DriverConnection().getConnection();
	        driver.get("https://careercenter.tops-int.com/");
	        }
	        @Test(dataProvider = "dp", priority = 1)
	        public void login(String mobile, String password) throws InterruptedException {
	        WebElement num = driver.findElement(By.id("mobile"));
	        num.clear();
	        num.sendKeys(mobile);
	        WebElement pswd = driver.findElement(By.id("password"));
	        pswd.clear();
	        pswd.sendKeys(password);
	        Thread.sleep(2000);
	        WebElement login = driver.findElement(By.xpath("//form[@id='loginForm']/div[3]/input"));
	        login.click();	    
	        }
	        @Test(priority = 2)
	        public void profile() throws InterruptedException {
	        WebElement profile = driver.findElement(By.xpath("//a[@id='profileDropdown']/span[1]"));
	        profile.click();
	        WebElement Pd = driver.findElement(By.linkText("Personal Details"));
	        Pd.click();
	        driver.findElement(By.id("select2-salutation-container")).click();
	        Actions action = new Actions(driver);
	        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	        driver.findElement(By.id("firstName")).sendKeys("Sarika");
	        driver.findElement(By.id("lastName")).sendKeys("Namsha");
	        driver.findElement(By.id("email")).sendKeys("namshasarika45@gmail.com");
	        Thread.sleep(2000);
	        driver.findElement(By.id("profileImage")).sendKeys("C:\\Users\\Sarika Namsha\\Downloads\\WhatsApp Image 2023-11-07 at 16.04.22_8caf4fc3.jpg");
	        Thread.sleep(2000);
	        driver.findElement(By.id("linkedin_id")).sendKeys("www.linkedin.com/in/sarika-namsha");
	        Thread.sleep(2000);
	        driver.findElement(By.id("instagram_id")).sendKeys("https://www.instagram.com/sara_namsha45/");
	        Thread.sleep(2000);
	        driver.findElement(By.id("select2-gender-container")).click();
	        Actions action2 = new Actions(driver);
	        action2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	        WebElement Profile_btn = driver.findElement(By.xpath("//a[@id='profileDropdown']/span[1]"));
			Profile_btn.click();
	        WebElement Education = driver.findElement(By.linkText("Education Details"));
			Education.click();
			Thread.sleep(2000);
			//change password
			driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/div[1]/ul/li[3]/a")).click();    
	        }
	        @Test(priority = 3)
	        public void course() {
	        WebElement course_btn = driver.findElement(By.id("course-dropdown"));
			course_btn.click();
	        }
	        @DataProvider(name = "dp")
	        public Object[][] dpmethod(){
	        Object o [][] = new Object [4][2];
	        
	        o[0][0] = "123456789";
	        o[0][1]	 = "123456789";
	        
	        o[1][0] = "Sara";
	        o[1][1]	 = "Sara";
	        
	        o[2][0] = "123456789";
	        o[2][1]	 = "Sara";
	        
	        o[3][0] = "7041480673";
	        o[3][1]	 = "7041480673";
	        return o;
	        }
}
