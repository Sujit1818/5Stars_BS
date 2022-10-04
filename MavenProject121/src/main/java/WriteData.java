import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteData {


		public static void main(String[] args) throws IOException {
			// step 1: to create an object of file reader class
			//FileWriter fr=new FileWriter("C:\\Users\\other\\eclipse-workspace\\MavenProject121\\sujit.properties",true);//true foruphending and not overriding
			FileOutputStream fis=new FileOutputStream("C:\\Users\\other\\eclipse-workspace\\MavenProject121\\sujit.properties",true);
			//step2: to create an object of properties class
			Properties p=new Properties();
			
	//step3: use set property/store method to set property
			p.setProperty("url", "RCVacademy.com");
			//p.store(fr, "sample comments");
			p.store(fis, "sample comments fos");
	}
}

