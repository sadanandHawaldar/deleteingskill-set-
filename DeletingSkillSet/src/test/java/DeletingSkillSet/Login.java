package DeletingSkillSet;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	public static String login;

	public static void getlogin(WebDriver driver) throws IOException {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		/*
		 * add the username to the ursername text box using proper by method
		 */

		driver.findElement(By.name("username")).sendKeys("Admin");

		/*
		 * add the password to the password text box using proper by method
		 */

		driver.findElement(By.name("password")).sendKeys("admin123");

		/*
		 * using login button xpath login to the orange hrm
		 */
		login = ReadProperties.readFile("login");
		driver.findElement(By.xpath(login)).click(); // login will get the xpath from the properties file and and click
														// on login button
	}

}
