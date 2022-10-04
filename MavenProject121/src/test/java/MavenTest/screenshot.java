package MavenTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
	WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();
		driver.get("https://www.booking.com/country/us.en.html?aid=339462&label=msn-r3qzVwr35mHTVcnM4y0Uqw-80195736853649:tikwd-16269994083:aud-807859093:loc-90:neo:mte:lp155837:dec:qsbooking.com&utm_campaign=United%20States%20of%20America&utm_medium=cpc&utm_source=bing&utm_term=r3qzVwr35mHTVcnM4y0Uqw&msclkid=d925483f3ae4168f74a02b21f12bf2f6");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String rm = RandomString.make(4);
		String path="C:\\Users\\other\\eclipse-workspace\\MavenProject121\\picture";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
	//	File destn=new File(path+"\\ test.png")
		File destn=new File(path+"\\+rm+.png");
		FileUtils.copyFile(src,destn);

	}

}
