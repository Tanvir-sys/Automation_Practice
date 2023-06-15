package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Test {

	public static void main(String[] args) {

		
		WebDriver driver=Base.getDriver() ;
		
       //navigate 
		
		 driver.get("");
		 
	 	 //find element
		    WebElement e= driver.findElement(By.xpath("//*[@id=\"P2183_VISITOR_ID\"]"));
			e.click();
		
		
				 e.sendKeys("");
				 e=driver.findElement(By.xpath("//*[@id=\"P2183_NAME\"]"));
				 e.click();
				 e.sendKeys("");
		
					e=driver.findElement(By.xpath("//*[@id=\"P2183_PHONE\"]"));
					e.sendKeys("");
					e=driver.findElement(By.xpath("//*[@id=\"P2183_COME_FROM_lov_btn\"]"));
					e.click();
					
//		e=driver.findElement(By.);
//		e.click();
//		 e.sendKeys("");
//		 e.sendKeys("");
//	   
		//enter email in login page 
	     
//	     e=driver.findElement(By.id("password"));
//	     e.sendKeys("");
//		e=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button"));       // find element by xpath      
//		e.click();
//	    
//        e=driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-00000000-0000-0000-0000-000000000000\"]/ul[1]/li[3]/a/span[1]"));
//		e.click();
//		
		
	
	}
}
