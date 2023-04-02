package DeletingSkillSet;

import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
	public static WebDriver driver;

	public static WebDriver getWebDriver() throws IOException {

		// take the input from the user to access the browser
		Scanner sc = new Scanner(System.in);
		System.out.println(" Select the browser\n1) Edge\n2) Firefox \n3) Chrome");
		int browserName = sc.nextInt();

		// String browserName = ReadProperties.readFile("browser1");

		switch (browserName) {

		// open for Edge browser
		case 1:
			driver = new EdgeDriver();
			break;

		// open the firefox browser
		case 2:
			driver = new FirefoxDriver();
			break;

		// open thw chrome browser
		case 3:
			driver = new ChromeDriver();
			break;

		}
		// return the brower
		return driver;
	}
}