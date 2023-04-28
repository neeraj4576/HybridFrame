package bddSdet36l1.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerLoginpage {
	public VtigerLoginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="user_name") private WebElement username;
	@FindBy(name="user_password") private WebElement password;
	@FindBy(id="submitButton") private WebElement submitbutton;
	public WebElement getUserName()
	{
		return username;
	}
	public WebElement getPasswod()
	{
		return password;
	}
	public WebElement getSubmitbuttonn()
	{
		return submitbutton;
	}
	public void logintoapp(String userName,String passWord) {
		username.sendKeys(userName);
		password.sendKeys(passWord);
		submitbutton.click();
		
		
	}
	
	

}
