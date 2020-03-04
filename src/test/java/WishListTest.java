import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {
    //Adăugati un test prin care să deschideți homepage-ul site-ului, apoi să navigați la categoria "Sale",
    // apoi să deschideți pagina de detalii a primului produs și să încercați să îl adăugați în WishList,
    // apăsând butonul Add to Wishlist. Pe viitor, după ce veți învăța să faceți și verificări,
    // veți putea reveni pentru a vă asigura că adăugarea în wishlist poate fi realizată doar de utilizatorii autentificați.

    public static void sale(){

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
        driver.quit();


    }



}
