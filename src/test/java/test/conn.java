package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class conn {

    private WebDriver driver;
    
      private String url;
      public conn(String url) {
    	this.url = url;
         }
        
    public void ouvrirNavigateur(String navigateur) {
    	
        if ("chrome".equals(navigateur)) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zrida Mohamed\\Desktop\\Jihene\\selenium\\chromedriver-win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if ("firefox".equals(navigateur)) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Zrida Mohamed\\Desktop\\Jihene\\selenium\\Firefoxdriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        // Ajoutez d'autres conditions pour d'autres navigateurs si nécessaire

        driver.get(url);
    }
    
    public void seConnecter() {
        // Logique de connexion à la page web
    	
    	driver.manage().window().maximize();
        driver.navigate().refresh();
        WebElement cookies = driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button"));
        cookies.click();

        WebElement adresse = driver.findElement(By.id("edit-name"));

        adresse.sendKeys("imen.makni@symdrik.com");

        WebElement password = driver.findElement(By.id("edit-pass"));

        password.sendKeys("AdminSymdrik2020!");

        WebElement loginButton = driver.findElement(By.id("edit-submit"));

        // Cliquez sur le bouton de connexion
        loginButton.click();
    }
}
