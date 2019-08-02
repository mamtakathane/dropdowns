package dropdowns.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dropcar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://quickinsure.co.in/");

		// to cheack radiobutton
		driver.findElement(By.xpath("//*[@id='quotation']/div[2]/div[1]/fieldset/div[2]/label/span/i")).click();
		driver.findElement(By.xpath("//div[@class='form-inline']/div[1]/fieldset/div[1]/label/span/i")).click();

		// to select audi A3
		WebElement el1 = driver.findElement(By.xpath("//input[@id='quotation_car_make_model-selectized']"));
		el1.clear();
		el1.sendKeys("audi A3");
		Thread.sleep(2000);
		el1.sendKeys(Keys.ENTER);

		WebElement el2 = driver.findElement(By.xpath(".//*[@id='quotation']/div[2]/div[2]/div[3]/div/div[1]/div"));
		el2.clear();

		el2.sendKeys(Keys.ARROW_DOWN);
		el2.sendKeys(Keys.ENTER);

		// to get MH12
		WebElement el = driver.findElement(By.xpath("//*[@id='quotation']/div[2]/div[3]/div[1]/div/div[1]"));
		el.clear();
		el.sendKeys("MH-12");
		Thread.sleep(2000);
		el.sendKeys(Keys.ENTER);

		// to select register year
		// Select ss2=new
		// Select(driver.findElement(By.cssSelector(".selectize-input.items.not-full.has-options.input-readonly.focus.input-active.dropdown-active")));
		// ss2.selectByIndex(3);

		// to selct claime
		System.out.println(
				driver.findElement(By.xpath("//*[@id='quotation']/div[2]/div[4]/div/label[1]/span/i")).isEnabled());

	}
}
