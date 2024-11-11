import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass{

    String[] mobileProducts={"Samsung galaxy s6","Nokia lumia 1520","Nexus 6","Samsung galaxy s7","Iphone 6 32gb","Sony xperia z5","HTC One M9 Sony vaio", "i5 Sony vaio i7"};
    public static By mobileProduct = By.xpath("//div[@class='card h-100']//a[contains(text(),'"+"')]");

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

    @Test
    public void addLaptopToCartAndProceedToCheck(){
        driver.findElement(HomePage.selectCategory).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.laptopName));
        driver.findElement(HomePage.laptopName).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.addToCartButton));
        driver.findElement(HomePage.addToCartButton).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.print(alertMessage);
        alert.accept();
        driver.findElement(HomePage.cart).click();
        WebElement openModalButton = driver.findElement(HomePage.placeOrderButton);
        openModalButton.click();
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
        /*
        Samsung galaxy s6
        Nokia lumia 1520
        Nexus 6
        Samsung galaxy s7
        Iphone 6 32gb
        Sony xperia z5
        HTC One M9
        Sony vaio i5
        Sony vaio i7
         */
    }

    @Test
    public void allTest(){
        String[] mobileProducts = {"Samsung galaxy s6", "Nokia lumia 1520", "Nexus 6", "Samsung galaxy s7", "Iphone 6 32gb", "Sony xperia z5", "HTC One M9" ,"Sony vaio i5", "Sony vaio i7"};
        for (String mobile : mobileProducts) {
            By mobileProduct = By.xpath("//div[@class='card h-100']//a[contains(text(),'" + mobile + "')]");
            wait.until(ExpectedConditions.visibilityOfElementLocated(mobileProduct));
            driver.findElement(mobileProduct).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(HomePage.addToCartButton));
            driver.findElement(HomePage.addToCartButton).click();
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String alertMessage = alert.getText();
            System.out.print(alertMessage);
            alert.accept();
            driver.findElement(HomePage.cart).click();
            WebElement openModalButton = driver.findElement(HomePage.placeOrderButton);
            openModalButton.click();
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
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            WebElement okButton = driver.findElement(By.xpath("//button[contains(text(),'OK')]"));
            okButton.click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='container']//a[contains(text(),'Home')]")));
//            driver.findElement(By.xpath("//div[@class='container']//a[contains(text(),'Home')]")).click();
        }
    }
}