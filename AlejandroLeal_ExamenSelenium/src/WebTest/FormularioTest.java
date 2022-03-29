package WebTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormularioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\alumno\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		try {
			
			driver.get("file:///C:/Users/alumno/Downloads/Examen%20UD3/index.html");
			System.out.println(driver.getTitle());
			
			WebElement btnContacta = driver.findElement(By.linkText("Contacta"));
			btnContacta.click();
			
				
			Thread.sleep(2000);
			
			WebElement txtNombre = driver.findElement(By.id("txtNombre"));
			txtNombre.sendKeys("Alejandro");
			
			WebElement txtApellidos = driver.findElement(By.id("txtApellidos"));
			txtApellidos.sendKeys("Leal Astorga");
			
			WebElement txtEmail = driver.findElement(By.id("txtEmail"));
			txtEmail.sendKeys("alejandroleal@gmail.com");
			
			WebElement btnCFGS = driver.findElement(By.xpath("//*[@id=\"comboRadio\"]/input[4]"));
			btnCFGS.click();
			
			Select btnConsulta = new Select (driver.findElement(By.xpath("//*[@id=\"comboConsulta\"]")));
			btnConsulta.selectByVisibleText("Matriculación");
			
			WebElement enviar = driver.findElement(By.id("btnConsulta"));
			enviar.click();
			
			WebElement resul = driver.findElement(By.xpath("//*[@id=\"resultadoConsulta\"]"));
			resul.getAttribute("outerText");
			
			Thread.sleep(2000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
