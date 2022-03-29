package WebTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class NavegacionTest1 {

	@BeforeEach

	void Siempre() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\alumno\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	}

	@Test
	void avegacionIndex() {

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/alumno/Downloads/Examen%20UD3/index.html");

		// Probamos que el boton home vuelve al indice
		WebElement btnPrueba = driver.findElement(By.linkText("Oferta educativa"));
		btnPrueba.click();

		WebElement btnHome = driver.findElement(By.linkText("Home"));
		btnHome.click();
		System.out.println(driver.getTitle());

		assertEquals("IES Pablo Picasso", driver.getTitle());

	}
	
	@Test
	void avegacionOferta() {

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/alumno/Downloads/Examen%20UD3/index.html");

		// Probamos que el boton home vuelve al indice
		WebElement btnPrueba = driver.findElement(By.linkText("Oferta educativa"));
		btnPrueba.click();
		System.out.println(driver.getTitle());
		WebElement btnHome = driver.findElement(By.linkText("Home"));
		btnHome.click();
		

		assertEquals("Oferta educativa", driver.getTitle());

	}

	@Test
	void avegacionConsulta() {

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/alumno/Downloads/Examen%20UD3/index.html");

		// Probamos que el boton home vuelve al indice
		WebElement btnContacta = driver.findElement(By.linkText("Contacta"));
		btnContacta.click();
		System.out.println(driver.getTitle());
		
		

		assertEquals("Contacta", driver.getTitle());

	}

}
