package dropdowns.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class drop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://quickinsure.co.in/");

		Actions action = new Actions(driver);    
		WebElement optionsList = driver.findElement(By.xpath("//input[@id='quotation_car_make_model-selectized']"));
		action.moveToElement(optionsList);
        
		
		List<WebElement> options =driver.findElements(By.xpath("//div[@class='selectize'] //div[@class='option' AND @data-value='AUDI#A3']"));
		for(WebElement option : options) {
		    if (option.getText().equals("AUDI A3")) {
		        option.click();
		    }
		}

	}

}
