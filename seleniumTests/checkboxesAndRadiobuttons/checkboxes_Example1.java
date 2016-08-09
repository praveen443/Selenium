package checkboxesAndRadiobuttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxes_Example1 {
	
	public static void main(String []args){
		WebDriver driver = new FirefoxDriver();
		
		//To perform a click operation on the radio-button.
		WebElement radioBtn = driver.findElement(By.id("toolsqa"));
		radioBtn.click();
		
		//Store all the elements in to list of type WebElement.
		List<WebElement> objRadiobtn = driver.findElements(By.name("tools-qa"));
		
		boolean bValue = false;
		
		//The below assigned boolean variable will become true,
		//If the first radio-button is selected.
		bValue = objRadiobtn.get(0).isSelected();
		
		//The below if-condition is used to verify whether the first radio-button is selected.
		//If bValue = true then first radio-button is selected, so click on second radio-button. Else,
		//If bValue = false , then second radio-button is selected..so, we have to click on first radio-button.
		if(bValue = true){
			System.out.println("Click on Second Radio-button.");
			objRadiobtn.get(1).click();
		}else {
			System.out.println("Click on First Radio-button.");
			objRadiobtn.get(0).click();
		}
		
	}

}
