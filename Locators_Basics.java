package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators_Basics {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage()
.window().maximize();	
		
	driver.get("https://www.flipkart.com/");
	
	//name
//	driver.findElement(By.name("q")).sendKeys("Mac");
	  
	//id
//	boolean logoIsDisplayed=driver.findElement(By.id("container")).isDisplayed();
//	System.out.println(logoIsDisplayed);
	
	//linktext 
	
//	driver.findElement(By.linkText("Login")).click();
	
	//partiLinkedText
//	driver.findElement(By.partialLinkText("Log")).click(); 
	
	
//	====================================
	//Locate Multiple Links/ Locations
//	====================================
	
	//className
	List<WebElement> headerLinks=driver.findElements(By.className("_38VF5e"));
	System.out.println("Total No. Of HeaderLinks are: " + headerLinks.size());
	
	
	//tagName
	List<WebElement> headerLinks2=driver.findElements(By.tagName("img"));
	System.out.println("Total No. Of 'img' Tags are: " + headerLinks2.size());
	}

}
