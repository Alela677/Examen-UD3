package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NavegacionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\alumno\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		try {

			driver.get("file:///C:/Users/alumno/Downloads/Examen%20UD3/index.html");
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			
			// Probamos que el boton home vuelve al indice
			WebElement btnPrueba = driver.findElement(By.linkText("Oferta educativa"));
			btnPrueba.click();
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			
			WebElement btnHome = driver.findElement(By.linkText("Home"));
			btnHome.click();
			
			System.out.println(driver.getTitle());
			
			Thread.sleep(2000);
			
			
			// Comprobamos que al pulsar oferta educativa nos lleva a la pagina
			
			btnPrueba = driver.findElement(By.linkText("Oferta educativa"));
			btnPrueba.click();
			System.out.println(driver.getTitle());
			
			
			Thread.sleep(2000);
			
			// Comprobamos que desde el indice nos lleva a la pagina contacta
			

			WebElement btnContacta = driver.findElement(By.linkText("Contacta"));
			btnContacta.click();
			System.out.println(driver.getTitle());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		finally {
			driver.quit();
		}
	}

}
