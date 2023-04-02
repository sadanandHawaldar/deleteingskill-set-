package Main;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import DeletingSkillSet.DriverSetup;
import DeletingSkillSet.Login;
import DeletingSkillSet.Logout;
import DeletingSkillSet.ReadProperties;
import DeletingSkillSet.addSkillAndDelete;
import DeletingSkillSet.checkSkills;
import DeletingSkillSet.navigateToSkill;

//add all the required imports 
public class AddAndDeleteSkill {
	
	public static WebDriver driver;
	public static String baseUrl;
	public static Boolean flag=false;
	
	public static void main(String[] arg) throws IOException{
	
	// Invoke the getWebDriver method from the DriverSetupClass
	driver = DriverSetup.getWebDriver();
	 
	//maximize opened browser using maximize method 
	 driver.manage().window().maximize();
	 
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 //Read the broweserUrl the properties file to assign url to the baseUrl
	 baseUrl=ReadProperties.readFile("browserUrl");
	 driver.get(baseUrl);
	 
	 
	 /* Invoke getlogin method from the Login class
	  * to login to the orange hrm demo
	  */
	 Login.getlogin(driver); 
	 
	 /* Invoke getSkillpage method from the navigateToSkill class
	  * to navigate to skill page
	  */
	 navigateToSkill.getSkillpage(driver); 
	 
	 /* Invoke getAddSkill method from the addSkillAndDelete class
	  * to add skill and delete the same skill
	  */
	 addSkillAndDelete.getAddSkill(driver);
	 
	 /* Invoke getAllSkill method from the checkSkill class
	  * to check that delete skill is deleted completely 
	  */
	 
	 checkSkills.getAllSkill(driver);
	 
	 /* Invoke getLogOut method from the Logout class
	  * to logout from the orange hrm 
	  */
	 
	 Logout.getLogOut(driver);
	 
	 driver.quit();
	}

}
