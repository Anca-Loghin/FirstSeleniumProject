import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {

    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }

    @Test
    public void wishListAdded() {

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();

        WebElement addedToWishlist = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div.my-wishlist > ul > li > ul > li > span"));

        Assert.assertEquals("Racer Back Maxi Dress has been added to your wishlist. Click here to continue shopping.", addedToWishlist.getText());
    }

     @Test
     public void addToCartisDisplayed(){
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();

        WebElement addToCart = driver.findElement(By.cssSelector("#item_576 > td.wishlist-cell4.customer-wishlist-item-cart > div > button > span > span"));

        Assert.assertTrue(addToCart.isDisplayed());
    }

    @Test
    public void addAllToCart(){
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > div.actions > ul > li:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-6.active.last > a")).click();
        driver.findElement(By.cssSelector("#product-collection-image-437")).click();
        driver.findElement(By.cssSelector("#swatch20 > span.swatch-label > img")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("#wishlist-view-form > div > div > button.button.btn-add")).click();

        WebElement addAll = driver.findElement(By.cssSelector("#wishlist-view-form > div > div > button.button.btn-add > span > span"));

        Assert.assertTrue(addAll.isDisplayed());
    }

    @Test
    public void shareWishlist(){
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > div.actions > ul > li:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-6.active.last > a")).click();
        driver.findElement(By.cssSelector("#product-collection-image-437")).click();
        driver.findElement(By.cssSelector("#swatch20 > span.swatch-label > img")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("#wishlist-view-form > div > div > button.button.btn-add")).click();

        WebElement share = driver.findElement(By.cssSelector("#wishlist-view-form > div > div > button.button.btn-share > span > span"));

        Assert.assertTrue(share.isDisplayed());
    }

    @Test
    public void removeFromWishlistTest(){
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > div.actions > ul > li:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-6.active.last > a")).click();
        driver.findElement(By.cssSelector("#product-collection-image-437")).click();
        driver.findElement(By.cssSelector("#swatch20 > span.swatch-label > img")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("#wishlist-view-form > div > div > button.button.btn-add")).click();
        driver.findElement(By.cssSelector("#item_588 > td.wishlist-cell5.customer-wishlist-item-remove.last > a")).click();

        WebElement removeItem = driver.findElement(By.cssSelector("#item_590 > td.wishlist-cell5.customer-wishlist-item-remove.last > a"));

        Assert.assertTrue(removeItem.isDisplayed());
    }

    @Test
    public void addFromCartToWishlist(){
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.active.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(3) > div > div.actions > button > span > span")).click();
        driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-actions > ul > li:nth-child(2) > a")).click();

        WebElement moveToWishlist = driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr > td.product-cart-actions > ul > li:nth-child(2) > a"));

        Assert.assertEquals("Park Row Throw has been moved to wishlist Wishlist", moveToWishlist.getText());
    }

    @After
    public void close(){
        driver.quit();
    }

}
