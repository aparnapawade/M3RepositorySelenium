package testNG5_Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	//Declaration
	@FindBy(xpath = "//h1[text()='Shopping cart']/../..//img[@title='Show details for Smartphone']") private WebElement smartphoneProduct;
	@FindBy(xpath = "//h1[text()='Shopping cart']/../..//img[@title='Show details for Smartphone']/../..//input[@name='removefromcart']")
	private WebElement selectSmartphoneCheckbox;
	@FindBy(name = "updatecart") private WebElement updateShoppingCartButton;
	
	//Initialization
	public ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getSmartphoneProduct() {
		return smartphoneProduct;
	}
	
	public WebElement getSelectSmartphoneCheckbox() {
		return selectSmartphoneCheckbox;
	}


	public WebElement getUpdateShoppingCartButton() {
		return updateShoppingCartButton;
	}
	
}
