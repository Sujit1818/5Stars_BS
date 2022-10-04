package MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		//WebDriver driver1 = new ChromeDriver();
		driver.navigate().to( "https://yonobusiness.sbi/login/yonobusinesslogin ");
		Thread.sleep(6000);

	}

}
