package DeletingSkillSet;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class navigateToSkill {

	public static void getSkillpage(WebDriver driver) throws IOException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		/*
		 * click on admin button to navigate to the admin page the by using xpath
		 */
		String Admin = ReadProperties.readFile("Admin");
		driver.findElement(By.xpath(Admin)).click();

		/*
		 * click on qualification button and select skill to navigate skill page by
		 * using xpath of qualification and Skill
		 */
		String Qualification = ReadProperties.readFile("qualification");
		driver.findElement(By.xpath(Qualification)).click();

		String Skill = ReadProperties.readFile("skill");
		driver.findElement(By.xpath(Skill)).click();

	}

}
