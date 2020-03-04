import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
//Adăugați în clasa RegisterTest un test în care să automatizați pașii necesari pentru înregistrarea cu succes a
    // unui utilizator nou (deschideți homepage-ul, apăsați pe Account, apăsați pe Register, completați toate câmpurile
    // de pe pagina Register - atenție ca email-ul să fie unic, bifați opțiunea pentru primirea newsleterr-ului).
    // Folosiți identificatori diferiți pentru câmpurile de pe pagina Register (id, name, className).
    // Pe viitor, după învățarea altor identificatori, veți reveni pentru a apăsa și butonul Register.

    public static void register() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Login");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("Ana");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Anca");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("ancatest@malinator");
        driver.findElement(By.cssSelector("#password")).sendKeys("123321");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("123321");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        driver.quit();


    }


}
