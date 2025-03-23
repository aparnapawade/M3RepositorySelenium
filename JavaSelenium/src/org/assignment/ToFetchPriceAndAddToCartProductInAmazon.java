package org.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToFetchPriceAndAddToCartProductInAmazon {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Actions actions = new Actions(driver);
		driver.get("https://www.amazon.in/");
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		actions.moveToElement(searchBox).sendKeys(searchBox, "moto edge 50 fusion 5g", Keys.ENTER).perform();
		//To add product to cart
		WebElement addToCartButton = driver.findElement(By.xpath("//span[text() = 'Motorola Edge 50 Fusion 5G (Marshmallow Blue, 8GB RAM, 128GB Storage)']/../../../..//button[text() = 'Add to cart']"));
		addToCartButton.click();
		//To fetch the price
		WebElement price = driver.findElement(By.xpath("//span[text() = 'Motorola Edge 50 Fusion 5G (Marshmallow Blue, 8GB RAM, 128GB Storage)']/../../../..//span[@class='a-price-whole']"));
		System.out.println(price.getText());
	}

}
