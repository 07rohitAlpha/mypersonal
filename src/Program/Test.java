package Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	 public static void main(String[] args) {  
	
	 // System Property for Chrome Driver   
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Sveltetech\\Driver\\chromedriver.exe");  
      
         // Instantiate a ChromeDriver class.     
    WebDriver driver = new ChromeDriver();  
     
     //Maximize the browser  
      driver.manage().window().maximize();  
       
      // Launch Website  
   driver.get("https://www.google.co.in/");  
     
      driver.close();

      
      
      
}
	 
	 
}