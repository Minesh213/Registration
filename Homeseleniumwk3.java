package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Homeseleniumwk3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Software\\Driver//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Minesh");
        driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Valand");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("21");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).sendKeys("March");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).sendKeys("1995");
        driver.findElement(By.id("Email")).sendKeys("mpvaland21395@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("unipart");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Minesh1222222");
        driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Minesh1222222");
        driver.findElement(By.id("register-button")).click();
        // driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/a")).click();
        // if registration fail below code use logged in and then select category and item
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();

        driver.findElement(By.id("Email")).sendKeys("mpvaland21395@gmail.com");

        driver.findElement(By.id("Password")).sendKeys("Minesh1222222");

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[3]/div/h2/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/h2/a")).click();
        driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
        driver.switchTo().alert().accept();
        
    }

}
