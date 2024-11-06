import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
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
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.print(alertMessage);
        alert.accept();
        driver.findElement(HomePage.cart).click();
//        wait.until(ExpectedConditions.elementToBeClickable(HomePage.placeOrderButton));
//        driver.findElement(HomePage.placeOrderButton).click();
        WebElement openModalButton = driver.findElement(HomePage.placeOrderButton);
        openModalButton.click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        wait.until(ExpectedConditions.elementToBeClickable(HomePage.textFieldName));
        WebElement textField1 = driver.findElement(HomePage.textFieldName);
        textField1.sendKeys("Test");
        WebElement textField2 = driver.findElement(HomePage.textFieldCountry);
        textField2.sendKeys("India");
        WebElement textField3 = driver.findElement(HomePage.textFieldCity);
        textField3.sendKeys("Chandigarh");
        WebElement textField4 = driver.findElement(HomePage.textFieldYear);
        textField4.sendKeys("2024");
        WebElement textField5 = driver.findElement(HomePage.textFieldCreditCard);
        textField5.sendKeys("1123456789");
        WebElement purchaseButton = driver.findElement(HomePage.purchaseButton);
        purchaseButton.click();
    }
}