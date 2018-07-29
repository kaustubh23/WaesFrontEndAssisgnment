package mywebapp.app.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import mywebapp.app.data.UserData;
import mywebapp.app.data.UserInfo;

public class WaesUserFormTest {

	private static final String URL = "http://localhost:8080/zkdemo.app.form/index.zul";
	public WebDriver driver=null;
	
	@Test
	public void fillDetails() {
		File file = new File("C:/Users/kaustubh/Desktop/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		driver = new ChromeDriver();
		// launch the Chrome browser and open the application url
		driver.get(URL);

		// maximize the browser window
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("userName"));
		WebElement postTile = driver.findElement(By.name("postTitle"));
		
		//WebElement views = driver.findElement(By.name("views"));
		//WebElement Likes = driver.findElement(By.name("likes"));
		WebElement	submit=driver.findElement(By.xpath("//button[text()='Submit' and @type='button']"));
		
		for(UserInfo info: new UserData().getAllFoods()){
			username.clear();
			postTile.clear();
			username.click();
			username.sendKeys(info.getUserName());
		    
			postTile.click();
			
			postTile.sendKeys(info.getPostTitle());
		    
			submit.click();
			
		}
	}
	@Test
	public void searchDetailsUser(){
		File file = new File("C:/Users/kaustubh/Desktop/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());

		driver = new ChromeDriver();
		// launch the Chrome browser and open the application url
		driver.get(URL);

		// maximize the browser window
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("userName"));
		WebElement postTile = driver.findElement(By.name("postTitle"));
		
		//WebElement views = driver.findElement(By.name("views"));
		//WebElement Likes = driver.findElement(By.name("likes"));
		WebElement	submit=driver.findElement(By.xpath("//button[text()='Submit' and @type='button']"));
		
		for(UserInfo info: new UserData().getAllFoods()){
			username.clear();
			postTile.clear();
			username.click();
			username.sendKeys(info.getUserName());
		    
			postTile.click();
			
			postTile.sendKeys(info.getPostTitle());
		    
			submit.click();
			
			WebElement searchbox = driver.findElement(By.name("searchBox"));
			searchbox.clear();
			searchbox.click();
			searchbox.sendKeys("kaustubh");
			WebElement searchbutton = driver.findElement(By.xpath("//button[text()='searchButton' and @type='button']"));
		 searchbutton.click();
	}
		
	
	}

}
