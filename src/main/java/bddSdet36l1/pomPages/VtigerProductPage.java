package bddSdet36l1.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VtigerProductPage {
@FindBy(xpath="//a[.='Products']") private WebElement productpage;
@FindBy(xpath="//img[@title='Create Product...']") private WebElement createnewproduct;

public VtigerProductPage(WebDriver driver)
{
	PageFactory.initElements( driver,this);
}
public WebElement getProductimg()
{
	return productpage;
}
public WebElement getnewProductlink()
{
	return createnewproduct;
}

public void clickOnProduct()
{
	productpage.click();
	createnewproduct.click();
	
}









}
