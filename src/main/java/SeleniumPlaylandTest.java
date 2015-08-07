import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPlaylandTest {
	private WebDriver driver;

	@Before
	public void configurarWebDriver() {
		this.driver = new FirefoxDriver();
		this.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		this.driver.get("http://www.agilecode.com.br/selenium");
	}

//	@After
//	public void fecharWebDriver() {
//		this.driver.close();
//	}
	
//	@Test
//	public void deveVerificarOTituloDaPagina() {
//		String titulo = this.driver.getTitle();
//		assertEquals("Selenium - Playland", titulo);
//	}
//
//	@Test
//	public void deveVerificarOTextoDeUmElementoLocalizadoPorId() {
//		WebElement elemento = this.driver.findElement(By.className("titulo"));
//		String texto = elemento.getText();
//		assertEquals("Selenium Playland", texto);
//	}
//
//	@Test
//	public void deveVerificarOTextoDeUmElementoLocalizadoPeloTextoDoLinkParcial() {
//		WebElement link = this.driver.findElement(By.partialLinkText("próxima página"));
//		String texto = link.getText();
//		assertEquals("Ir para a próxima página", texto);
//	}
//
//	@Test
//	public void deveVerificarOTextoDeUmElementoLocalizadoPorXPath() {
//		WebElement elemento = driver.findElement(By.xpath("html/body//h1"));
//		String texto = elemento.getText();
//		assertEquals("Selenium Playland", texto);
//	}
//
//	@Test 
//	public void devePreencherESubmeterOFormulario() {
//		WebElement user = this.driver.findElement(By.name("campo_user")); 
//		user.sendKeys("root"); 
//		WebElement password = this.driver.findElement(By.name("campo_password")); 
//		password.sendKeys("javamagazine"); 
//		WebElement formulario = this.driver.findElement(By.name("formulario")); 
//		formulario.submit(); 
//		String titulo = this.driver.getTitle(); 
//		assertEquals("Selenium - Playland - Sucesso", titulo); 
//		}
	
//	@Test 
//	public void deveSelecionarUmaOpcaoDoElementoSelect() { 
//		Select elemento = new Select(driver.findElement(By.name("campo_select"))); 
//		elemento.selectByVisibleText("Opção B"); 
//		WebElement opcaoSelecionada = elemento.getFirstSelectedOption(); 
//		assertEquals("Opção B", opcaoSelecionada.getText()); 
//		}

//	@Test
//	public void deveVerificarAQuantidadeDeOpcoesDeUmElementoSelect() { 
//		Select elemento = new Select(this.driver.findElement(By.name("campo_select"))); 
//		List<WebElement> options = elemento.getOptions(); 
//		assertEquals(3, options.size()); 
//		
//		//imprime o valor de todas as opções
//		for(int i=0; i<options.size(); i++){
//		System.out.println(options.get(i).getText());
//		
//		}
//		}
//
//	@Test logar smartcanvas
//	public void devePreencherESubmeterOFormulario() {
//		WebElement menuMobile = this.driver.findElement(By.className("open-nav"));
//		menuMobile.submit();
//		WebElement avatar = this.driver.findElement(By.className("login-link no-avatar"));
//		avatar.submit();
//		WebElement linkG = this.driver.findElement(By.className("customGPlusSignIn"));
//		linkG.submit();
//		WebElement user = this.driver.findElement(By.id("Email")); 
//		user.sendKeys("admin@smartcanvas.com");
//		WebElement next1 = this.driver.findElement(By.id("next"));
//		next1.submit();		
//		WebElement password = this.driver.findElement(By.id("Passwd")); 
//		password.sendKeys("d1c@nv@s"); 
//		WebElement formulario = this.driver.findElement(By.id("signIn")); 
//		formulario.submit(); 
//		}


}
