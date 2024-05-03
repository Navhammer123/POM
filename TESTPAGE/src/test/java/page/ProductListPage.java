package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {
		
		@FindBy(id = "add-to-cart-sauce-labs-backpack")
		 WebElement itemOne;
		 @FindBy(id = "add-to-cart-sauce-labs-bike-light")
		 WebElement itemTwo;
		 @FindBy (css  = "a.shopping_cart_link")
		 //@FindBy(id = "shopping_cart_container")
		 WebElement cart;
		 @FindBy (xpath = "//span[contains(text(),'Products')]")
		 WebElement title;
		 
		 public ProductListPage (WebDriver driver) {
			 PageFactory.initElements(driver,this);
		 }

  public void additem() {
	  itemOne.click();
	  itemTwo.click();
  }
  
  public void cartcotain() {
	  cart.click();
  }
  public Boolean isonproducts() {
	  
	 return title.isDisplayed();
  }
}
