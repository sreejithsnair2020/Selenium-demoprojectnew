package demoprojecttwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends Base {
	@Test
	public void loginBothCorrect()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		String user="standard_user";
		username.sendKeys(user);
		 
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		String pass="secret_sauce";
		password.sendKeys(pass);
		
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		 
}
	@Test
	public void usernameCorrectPasswordIncorrect()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		String user="standard_user";
		username.sendKeys(user);
		 
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		String pass="123";
		password.sendKeys(pass);
		
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	
	}
	@Test
	public void usernameIncorrectPasswordCorrect()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		String user="ssss";
		username.sendKeys(user);
		 
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		String pass="secret_sauce";
		password.sendKeys(pass);
		
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	
}
	@Test
	public void usernameIncorrectPasswordIncorrect()
	{
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		String user="ssss";
		username.sendKeys(user);
		 
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		String pass="sddd";
		password.sendKeys(pass);
		
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
}
	@Test
	public void loginWithNoCredentials()
	{
		WebElement login=driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
}
}