package Tops;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
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
	        Thread.sleep(1000);
	        WebElement login = driver.findElement(By.xpath("//form[@id='loginForm']/div[3]/input"));
	        login.click();	    
	        Thread.sleep(2000);
	        }
	        @Test(priority = 2)
	        public void home() throws InterruptedException {
//	        JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.scrollBy(0,200)");
	        driver.findElement(By.id("keyword")).sendKeys("Software Tester");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[2]/div/section[2]/div[1]/form/div[2]/span/span[1]/span")).click();
	        Actions action = new Actions(driver);
	        action.sendKeys(Keys.ENTER).build().perform();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[2]/div/section[2]/div[1]/form/div[3]/input")).click();
	        Thread.sleep(1000);
//	        driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div/div[2]/a")).click();	
//        	Thread.sleep(1000);
//        	driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div[1]/div/div[3]/div/div/div[2]/div[3]/div/a")).click();
//        	Thread.sleep(1000);
	        }
	        @Test(priority = 3)
	        public void notification() throws InterruptedException {
	        driver.findElement(By.xpath("//div[@id='main-header']/div/div/div[2]/a[1]/i")).click();
	        driver.findElement(By.id("notificationFilter")).click();
	        Actions action2 = new Actions(driver);
	        action2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	        Thread.sleep(1000);
	        driver.findElement(By.id("notificationFilter")).click();
	        Thread.sleep(1000);
	        Actions action3 = new Actions(driver);
	        action3.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	        Thread.sleep(1000);
	        driver.findElement(By.id("notificationFilter")).click();
	        Thread.sleep(1000);
	        Actions action4 = new Actions(driver);
	        action4.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	        Thread.sleep(1000);
	        driver.findElement(By.id("notificationFilter")).click();
	        Thread.sleep(1000);
	        Actions action5 = new Actions(driver);
	        action5.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	        Thread.sleep(1000);
	        driver.findElement(By.linkText("View Details")).click();
	        Thread.sleep(1000);
	        }
	        @Test(priority = 4)
	        public void profile() throws InterruptedException {
	        WebElement profile = driver.findElement(By.xpath("//a[@id='profileDropdown']/span[1]"));
	        profile.click();
	        Thread.sleep(2000);
	        WebElement Pd = driver.findElement(By.linkText("Personal Details"));
	        Pd.click();
	        Thread.sleep(2000);
//	        driver.findElement(By.id("select2-salutation-container")).click();
//	        Actions action = new Actions(driver);
//	        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//	        driver.findElement(By.id("firstName")).sendKeys("Sarika");
//	        driver.findElement(By.id("lastName")).sendKeys("Namsha");
//	        driver.findElement(By.id("email")).sendKeys("namshasarika45@gmail.com");
//	        Thread.sleep(2000);
//	        driver.findElement(By.id("profileImage")).sendKeys("C:\\Users\\Sarika Namsha\\Downloads\\WhatsApp Image 2023-11-07 at 16.04.22_8caf4fc3.jpg");
//	        Thread.sleep(2000);
//	        driver.findElement(By.id("linkedin_id")).sendKeys("www.linkedin.com/in/sarika-namsha");
//	        Thread.sleep(2000);
//	        driver.findElement(By.name("instagram_id")).sendKeys("https://www.instagram.com/sara_namsha45/");
//	        Thread.sleep(2000);
//	        driver.findElement(By.id("select2-gender-container")).click();
//	        Actions action2 = new Actions(driver);
//	        action2.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//	        driver.findElement(By.id("updateProfile")).click();
	        WebElement profile2 = driver.findElement(By.xpath("//a[@id='profileDropdown']/span[1]"));
	        profile2.click();
	        Thread.sleep(2000);
	        WebElement Education = driver.findElement(By.linkText("Education Details"));
			Education.click();
			Thread.sleep(2000);
			WebElement profile3 = driver.findElement(By.xpath("//a[@id='profileDropdown']/span[1]"));
	        profile3.click();
	        Thread.sleep(2000);
			WebElement changePass = driver.findElement(By.linkText("Change Password"));
			changePass.click();
			Thread.sleep(2000);
			driver.findElement(By.id("current_password")).sendKeys("7041480673");
			Thread.sleep(1000);
			driver.findElement(By.id("new_password")).sendKeys("7041480673");
			Thread.sleep(1000);
			driver.findElement(By.id("confirm_password")).sendKeys("7041480673");
			Thread.sleep(1000);
			driver.findElement(By.id("changePasswordSubmit")).click();
			Thread.sleep(1000);
//			WebElement logout = driver.findElement(By.linkText("Logout"));
//			logout.click();
	        }
        	@Test (priority = 5)
	        public void Mycourses() throws InterruptedException {
        	//	div[@class='inner-wrapper']/div/div/div[1]/div/ul/div/div/div/a
	        WebElement course = driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[1]/div/ul/div/div/div/a"));
	        course.click();
	        Thread.sleep(1000);
	        driver.findElement(By.linkText("Course Details")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id("course-attendance-tab")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id("course-accounts-tab")).click();   
	        Thread.sleep(2000);
	        WebElement course2 = driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[1]/div/ul/div/div/div/a"));
	        course2.click();
	        Thread.sleep(1000);
	        WebElement project = driver.findElement(By.linkText("Projects"));
	        project.click();
	        Thread.sleep(2000);
	        WebElement course3 = driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[1]/div/ul/div/div/div/a"));
	        course3.click();
	        Thread.sleep(1000);
	        WebElement assignment = driver.findElement(By.linkText("Assignment"));
	        assignment.click();
	        Thread.sleep(2000);
	        WebElement course4 = driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[1]/div/ul/div/div/div/a"));
	        course4.click();
	        Thread.sleep(1000);
	        WebElement assessment = driver.findElement(By.linkText("Assessment"));
	        assessment.click();
	        Thread.sleep(2000);
	        WebElement course5 = driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[1]/div/ul/div/div/div/a"));
	        course5.click();
	        Thread.sleep(1000);
	        WebElement interviewque = driver.findElement(By.linkText("Interview Questions"));
	        interviewque.click();
	        Thread.sleep(2000);
	        }
	        @Test (priority = 6)
        	public void certificate() throws InterruptedException {
    		WebElement certi = driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[1]/div/ul/li[2]/a"));
    		certi.click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div[3]/a/small"))
    		.click();
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//div[@id='feedbackModal']/div/div/div/div[1]/div/div[2]/button")).click();
    		Thread.sleep(1000);
        	}
	        @Test (priority = 7)
	        public void accounts() throws InterruptedException {
	        Thread.sleep(2000);
        	WebElement acc = driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[2]/div/div/div[1]/div/ul/li[3]/a"));
        	acc.click();
        	JavascriptExecutor js = (JavascriptExecutor) driver;
 			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        	Thread.sleep(2000);
	        }
	        @Test (priority = 8)
	        public void resumebuilder() throws InterruptedException {
	        WebElement rb = driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[1]/div/ul/li[4]/a"));
	        rb.click();
	        Thread.sleep(1000);
	        WebElement profileSummary = driver.findElement(By.id("v-pills-profile-tab"));
	        profileSummary.click();
	        Thread.sleep(2000);
	        WebElement technicalSkills = driver.findElement(By.id("v-pills-technical-tab"));
	        technicalSkills.click();
	        Thread.sleep(1000);
	        driver.findElement(By.id("programmingLanguages")).sendKeys("Java");
	        Thread.sleep(1000);
	        driver.findElement(By.id("databases")).sendKeys("SQL");
	        Thread.sleep(1000);
	        driver.findElement(By.id("webServers")).sendKeys("Apache");
	        Thread.sleep(1000);
	        driver.findElement(By.id("softwares")).sendKeys("Jira, Bugzilla, Eclipse");
	        Thread.sleep(1000);
	        driver.findElement(By.id("systems")).sendKeys("Windows");
	        Thread.sleep(1000);
	        WebElement saveButton = driver.findElement(By.xpath("//*[@id='technicalSkillsDetailsForm']/div[6]/div/input"));
	        saveButton.click();
	        Thread.sleep(1000);
	        WebElement experience = driver.findElement(By.id("v-pills-projects-tab"));
	        experience.click();
//	        driver.findElement(By.linkText("+ Add Experience Details")).click();
//	        Thread.sleep(1000);
//	        driver.findElement(By.id("companyName")).sendKeys("Maruti suzuki populers wheelers");
//	        Thread.sleep(1000);
//	        driver.findElement(By.id("position")).sendKeys("Digital Desk Executive");
//	        Thread.sleep(1000);
//	        driver.findElement(By.id("jobDescriptionText")).sendKeys("My role was attend customer's sales inquiry and forward it to sales executive.");
//	        Thread.sleep(1000);
//	        driver.findElement(By.id("jobTenureFrom")).sendKeys("14" ,"03" ,"2022");
//	        driver.findElement(By.id("companyDetailsFormSubmit")).click();
	        driver.findElement(By.id("v-pills-education-tab")).click();
	        Thread.sleep(1000);
	        }
	        @Test (priority = 9)
	        public void jobTracker() throws InterruptedException {
	        WebElement jc = driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[1]/div/ul/li[5]/a"));
	        jc.click();
	        Thread.sleep(1000);
	        }
	        @Test (priority = 10)
	        public void uploadReviews() throws InterruptedException {
	        WebElement ur = driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[1]/div/ul/li[6]/a"));
	        ur.click();
	        Thread.sleep(1000);
	        }
	        @Test (priority = 11)
	        public void rewards() throws InterruptedException {
	        WebElement re = driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[1]/div/ul/li[7]/a"));
	        re.click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[2]/div/div[1]/div[1]/div/a")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.id("referFirstName")).sendKeys("Jignesh");
	        Thread.sleep(1000);
	        driver.findElement(By.id("referLastName")).sendKeys("Badhiya");
	        Thread.sleep(1000);
	        driver.findElement(By.id("referMobile")).sendKeys("9104456073");
	        Thread.sleep(1000);
	        driver.findElement(By.id("referCollegeName")).sendKeys("abc");
	        Thread.sleep(1000);
	        driver.findElement(By.id("referEducation")).click();
	        Thread.sleep(1000);
	        Actions action3 = new Actions(driver);
	        action3.sendKeys("d").sendKeys(Keys.ENTER).pause(Duration.ofSeconds(2)).build().perform();
	        Thread.sleep(1000);
//	        driver.findElement(By.id("referFriendSubmit")).click();
	        WebElement crossIcon = driver.findElement(By.xpath("//div[@id='referAFriend']/div/div/div/div[1]/div[2]/button"));
	        crossIcon.click();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
 			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        	Thread.sleep(2000);
	        }
	        @Test (priority = 12)
	        public void referAFriend() throws InterruptedException {
	        driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[1]/div/ul/li[8]/a")).click();
	        Thread.sleep(1000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
 			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        	Thread.sleep(2000);
	        }
	        @Test (priority = 13)
	        public void events() throws InterruptedException {
        	driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[1]/div/ul/li[9]/a")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.id("studentLocation")).click();
	        driver.findElement(By.xpath("//div[@id='events-slider']/div[2]/button[1]/div")).click();
	        Thread.sleep(1000);
//	        driver.findElement(By.xpath("//div[@id='events-slider']/div[1]/div/div[6]/div/a/img")).click();
//	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div[1]/div/button")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//div[@id='events-slider']/div[2]/button[2]/div/i")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[2]/div/div/div[3]/div[1]/div/a/img")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div[1]/div/button")).click();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[2]/div/div/div[3]/div[5]/nav/ul/li[3]/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[2]/div/div/div[3]/div[5]/nav/ul/li[1]/span/i")).click();
			Thread.sleep(2000);
	        }
	        @Test (priority = 14)
	        public void topsCenters() throws InterruptedException {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//html[@lang='en']/body/div[2]/div/div/div[1]/div/ul/li[10]/a")).click();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			Thread.sleep(2000);
	        }
	        @AfterTest
	        public void logout() {
        	WebElement profile = driver.findElement(By.xpath("//a[@id='profileDropdown']/span[1]"));
	        profile.click();
        	WebElement logout = driver.findElement(By.linkText("Logout"));
			logout.click();
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
