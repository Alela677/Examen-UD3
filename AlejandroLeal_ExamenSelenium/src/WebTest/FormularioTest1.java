package WebTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class FormularioTest1 {

	@BeforeEach

	void Siempre() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\alumno\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	}

	@Test
	void formularioTxt() {
		
		
		
		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/alumno/Downloads/Examen%20UD3/index.html");
		System.out.println(driver.getTitle());
		
		WebElement btnContacta = driver.findElement(By.linkText("Contacta"));
		btnContacta.click();

		WebElement txtNombre = driver.findElement(By.id("txtNombre"));
		txtNombre.sendKeys("Alejandro");

		WebElement txtApellidos = driver.findElement(By.id("txtApellidos"));
		txtApellidos.sendKeys("Leal Astorga");

		WebElement txtEmail = driver.findElement(By.id("txtEmail"));
		txtEmail.sendKeys("alejandroleal@gmail.com");

		WebElement btnCFGS = driver.findElement(By.xpath("//*[@id=\"comboRadio\"]/input[4]"));
		btnCFGS.click();

		Select btnConsulta = new Select(driver.findElement(By.xpath("//*[@id=\"comboConsulta\"]")));
		btnConsulta.selectByVisibleText("Matriculación");

		WebElement enviar = driver.findElement(By.id("btnConsulta"));
		enviar.click();
		
		WebElement result = driver.findElement(By.id("resultadoConsulta"));
		result.getAttribute("innerHTML");
		
	}

}
