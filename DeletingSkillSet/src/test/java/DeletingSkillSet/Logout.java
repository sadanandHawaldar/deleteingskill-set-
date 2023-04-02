package DeletingSkillSet;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	
	public static String userdropdown;
	
	public static String LogoutLink;
	
	public static void getLogOut(WebDriver driver) throws IOException {
		
		//logout from the orange hrm demo 
		userdropdown = ReadProperties.readFile("Userdropdown");
		driver.findElement(By.xpath(userdropdown)).click();
		
		LogoutLink = ReadProperties.readFile("Logout");
		driver.findElement(By.linkText(LogoutLink)).click();
		
		
		
	}

}
