package cls1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class emicalc {

	public static void main(String[] args) {
		 FirefoxDriver fd = new FirefoxDriver();
		  fd.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
//		enter amount
		  fd.findElement(By.id("one")).sendKeys("10000");
		 //comment
		
//		Enter rate of intr=erest
		  fd.findElement(By.id("two")).sendKeys("10");
		
//		enter tenure
		  fd.findElement(By.id("three")).sendKeys("120");
		
//		Click on calcuate
		  fd.findElement(By.name("B1")).click();  
		  
		
//		extract EMI
		  String output = fd.findElement(By.id("four")).getAttribute("value");
		  
		System.out.println(output);

	}

}
