import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }

     @Test
     public void validRegisterTest(){
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

            WebElement thankYouMessage = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > ul > li > ul > li > span"));

            Assert.assertEquals("Thank you for registering with Madison Island.", thankYouMessage.getText());
     }

     @Test
     public void invalidCredentialTest(){
         driver.get("http://testfasttrackit.info/selenium-test/");
         driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
         driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
         driver.findElement(By.cssSelector("#firstname")).sendKeys("Login");
         driver.findElement(By.cssSelector("#middlename")).sendKeys("Ana");
         driver.findElement(By.cssSelector("#lastname")).sendKeys("Anca");
         driver.findElement(By.cssSelector("#email_address")).sendKeys("ancatest@malinator");
         driver.findElement(By.cssSelector("#password")).sendKeys("1");
         driver.findElement(By.cssSelector("#confirmation")).sendKeys("1");
         driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();

         WebElement errorMessage = driver.findElement(By.cssSelector("#advice-validate-password-password"));

         Assert.assertEquals("Please enter 6 or more characters without leading or trailing spaces.", errorMessage.getText());
     }

     @Test
     public void sameIdRegistration(){
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

         WebElement errorMessage = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.account-create > ul > li > ul > li > span"));

         Assert.assertEquals("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.", errorMessage.getText());
     }



    @After
    public void close(){
        driver.quit();
    }


}
