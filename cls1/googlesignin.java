package cls1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlesignin {

	public static void main(String[] args) throws Exception {
		
		FirefoxDriver fd = new FirefoxDriver();
		
		fd.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fwww.google.co.in%2F%3Fgws_rd%3Dssl&passive=1209600&sacu=1&ignoreShadow=0&acui=1#Email=vdiggavi27%40gmail.com");
		fd.findElement(By.id("next")).click();
		Thread.sleep(5000);
		fd.findElement(By.id("Passwd"))	.sendKeys("g123");
		fd.findElement(By.id("signIn")).click();


	}

}
