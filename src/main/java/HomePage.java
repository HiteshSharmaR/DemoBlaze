import org.openqa.selenium.By;

public class HomePage {
    //public static By productName = By.xpath("//div[@id='tbodyid']//a[contains(text(), 'Samsung galaxy s6')]");
    public static By productName = By.xpath("//div[@class='card h-100']//a[contains(text(),'Samsung galaxy s6')]");
    public static By addToCartButton = By.xpath("//div[@class='col-sm-12 col-md-6 col-lg-6']//a");
    public static By cart = By.xpath("//a[@id='cartur']");
    public static By placeOrderButton = By.xpath("//div[@class='col-lg-1']//button");
    public static By textFieldName = By.xpath("//input[@id='name']");
    public static By textFieldCountry = By.xpath("//input[@id='country']");
    public static By textFieldCity = By.xpath("//input[@id='city']");
    public static By textFieldCreditCard = By.xpath("//input[@id='card']");
    public static By textFieldMonth = By.xpath("//input[@id='month']");
    public static By textFieldYear = By.xpath("//input[@id='year']");
    public static By purchaseButton = By.xpath("//button[contains(text(),'Purchase')]");
    public static By selectCategory = By.xpath("//div[@class='list-group']//a[contains(text(),'Laptops')]");
//    public static By laptopName = By.xpath("//div[@class='card h-100']//a[contains(text(),'Sony vaio i5')]");

    static String laptopNames = "Sony vaio i5";
    public static By laptopName = By.xpath("//div[@class='card h-100']//a[contains(text(),'"+ laptopNames+"')]");
}
