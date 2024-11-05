import org.openqa.selenium.By;

public class HomePage {
    //public static By productName = By.xpath("//div[@id='tbodyid']//a[contains(text(), 'Samsung galaxy s6')]");
    public static By productName = By.xpath("//div[@class='card h-100']//a[contains(text(),'Samsung galaxy s6')]");
    public static By addToCartButton = By.xpath("//div[@class='col-sm-12 col-md-6 col-lg-6']//a");
}
