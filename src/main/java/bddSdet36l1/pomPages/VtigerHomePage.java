package bddSdet36l1.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerHomePage {
	@FindBy(linkText="Organizations") private WebElement Organizationlink;
	@FindBy(linkText="Contacts") private WebElement Contactpage;
	@FindBy(linkText="Opportunities") private WebElement opportunities;
	@FindBy(linkText="Products") private WebElement Productink;
	@FindBy(linkText="Documents") private WebElement Documents;
	@FindBy(linkText="Dashboard") private WebElement Dashboard;
	@FindBy(linkText="More") private WebElement morelink;
	@FindBy(linkText="Campaigns") private WebElement campaignlink;
	@FindBy(linkText="Sign Out") private WebElement signoutlink;
	//initializ
	public VtigerHomePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public WebElement organizationlink()
	{
		return Organizationlink;
	}
	public WebElement Contacts()
	{
		return Contactpage;
	
	}
	public WebElement Productlink()
	{
		return Productink;
	}
	public WebElement signout()
	{
		return signoutlink;
	}

	

	

	

	

	

	

	

	



	

}
