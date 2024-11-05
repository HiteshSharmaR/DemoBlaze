import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass{

    @Test
    public void addingProductInCartAndCheckOutTheSame(){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@text, 'Samsung galaxy s7')]")));
//        driver.findElement(By.xpath("//a[contains(@text, 'Samsung galaxy s7')]")).click();
//        driver.findElement(By.linkText("About us")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.productName));
        driver.findElement(HomePage.productName).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.addToCartButton));
        driver.findElement(HomePage.addToCartButton).click();
    }
}