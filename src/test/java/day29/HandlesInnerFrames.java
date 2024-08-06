package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesInnerFrames {
	public static void main(String[] args) throws InterruptedException {
  
	WebDriver driver=new ChromeDriver();
	driver.get("https://ui.vision/demo/webtest/frames/"); 
	driver.manage().window().maximize();
	
	//frameset is parent tag which contains multiple frames
	//we don't have name or id. but we can find this frame as webelement & then we will switch to it
	
	//we capture frame as WebElement, then switch to that frame & then we will be able to interact with element
	
	//1 handle frame-1
	WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(frm1);
	
	//we switch to frame-1, now we can interact with element
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("11111");
	
	//2 switch from frame to main page because we can't switch rom one frame to other frame directly.
	driver.switchTo().defaultContent();
	
	//3 handle frame-3
	WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frm3);
	
	//we switch to frame-3, now we can interact with element
	driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("33333");
	
	
	//inside frame -3 we have another iframe
	//4 Switch from frame-3 to inner iframe. if we have only one iframe, we can directly use index.
	driver.switchTo().frame(0); //index start from 0
	
	//select first radiobutton in frame
	driver.findElement(By.cssSelector("div.AB7Lab")).click();
	
	//5 switch from iframe to webpage
	driver.switchTo().defaultContent();
	
	
	
	
	
	
	
	
	
	
	
}
}