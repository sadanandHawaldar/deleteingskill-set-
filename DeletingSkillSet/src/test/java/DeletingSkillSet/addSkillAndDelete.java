package DeletingSkillSet;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addSkillAndDelete {

	public static String Add;
	public static String skillName;
	public static String saveBtn;
	public static String delete;
	public static String confirm;

	public static void getAddSkill(WebDriver driver) throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		/*click on add button it will navigate to add skill page and the skill in skill name textbox
		 * and save the text box using save button
		 */

		Add = ReadProperties.readFile("addbtn");
		driver.findElement(By.xpath(Add)).click();

		skillName = ReadProperties.readFile("SkillName");
		driver.findElement(By.xpath(skillName)).sendKeys("Testing Demo");

		saveBtn = ReadProperties.readFile("save");
		driver.findElement(By.xpath(saveBtn)).click();
		
		//verify that the added skill is present in the skill set
		
		checkSkills.getAllSkill(driver);
		
		/* added the added skill using delete button
		 */
		delete = ReadProperties.readFile("Delete");
		driver.findElement(By.cssSelector(delete)).click();

		confirm = ReadProperties.readFile("Confirm");
		driver.findElement(By.xpath(confirm)).click();

	

	}
}
