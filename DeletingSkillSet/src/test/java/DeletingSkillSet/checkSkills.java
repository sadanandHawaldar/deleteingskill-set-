package DeletingSkillSet;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkSkills {
	public static WebElement eachSkill;
	public static String SkillsSet;

	public static void getAllSkill(WebDriver driver) throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		/*
		 * Select all the skills present in skill page and check one by one whether the
		 * add skill is present and deleted the same skill
		 */
		SkillsSet = ReadProperties.readFile("SkillSet");
		List<WebElement> list = driver.findElements(By.cssSelector(SkillsSet));

		boolean flag = false;
		for (int i = 0; i < list.size(); i++) {
			WebElement eachSkill = list.get(i);
			String skill = eachSkill.getText();
			if (skill.equalsIgnoreCase("Testing Demo")) {
				flag = true;
			}
		}
		if (flag == true) {
			System.out.println("The Testing demo skill is added ");
		} else {
			System.out.println("The Testing demo skill is deleted  ");
		}

	}
}
