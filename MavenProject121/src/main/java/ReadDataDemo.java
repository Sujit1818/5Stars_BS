import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDataDemo {

	public static void main(String[] args) throws IOException {
		// step 1: to create an object of file reader class
		//FileReader fr=new FileReader("C:\\Users\\other\\eclipse-workspace\\MavenProject121\\sujit.properties");
		FileInputStream fis=new FileInputStream("\\\\Users\\\\other\\\\eclipse-workspace\\\\MavenProject121\\\\sujit.properties");
		//step2: to create an object of properties class
		Properties p=new Properties();
		//step3: load the properties file
		p.load(fis);
//step4: use get property method to get property
		System.out.println(p.getProperty("name"));
	}

}
