package cls1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class classname {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FirefoxDriver fd = new FirefoxDriver();
		fd.get("https://www.google.co.in/?gws_rd=ssl");
		fd.findElement(By.className("gsfi")).sendKeys("selenium");
		fd.close();
		
		
	}

}
