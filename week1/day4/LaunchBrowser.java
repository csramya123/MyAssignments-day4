package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver1=new EdgeDriver(); 
		driver1.get("http://facebook.com/opentaps/control/main");
		driver1.manage().window().maximize();
		//driver1.close();
		
		ChromeDriver driver2=new ChromeDriver(); 
		driver2.get("http://facebook.com/opentaps/control/main");
		driver2.manage().window().maximize();
		//driver2.close();
		
		
	}

}
