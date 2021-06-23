import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.*;
import java.util.List;

/**
 * @author Jorge Luis Villanueva Gamboa
 */

public class khc {
    public WebDriver driver;
    String usuario = "";
    String pass = "";
    String dia = "";

    public void getUsuario(String matricula){
        this.usuario = matricula;

    }
    public void getDia(String day){
        this.dia = day;
    }
    public void getPass(String pass){
        this.pass = pass;
    }

    public String login() throws InterruptedException  {
        String tareaText = "";
        ChromeOptions options = new ChromeOptions();

        ChromeDriver driver = new ChromeDriver(options);

        driver.get("https://av-exactas.ucc.mx/login/index.php");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/section/div/div[2]/div/div/div/div/div/div[1]/form/div[1]/input")).sendKeys(usuario);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/section/div/div[2]/div/div/div/div/div/div[1]/form/div[2]/input")).sendKeys(pass);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/section/div/div[2]/div/div/div/div/div/div[1]/form/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='"+dia+"']")).click();
        List<WebElement> tarea = driver.findElements(By.className("eventlist"));

        for (int i = 0; i <tarea.size(); i++) {
            tareaText = tarea.get(i).getText();
            System.out.println(tareaText);
        }

        Thread.sleep(2000);
        driver.quit();
        return tareaText;

    }
}
