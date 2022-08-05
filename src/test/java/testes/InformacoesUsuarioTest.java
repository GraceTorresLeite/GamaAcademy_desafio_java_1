package testes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InformacoesUsuarioTest {
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){
        System.setProperty("webdriver.chrome.driver", "D://Program Files//Chromedriver//chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize(); // maximiza a tela inteira do navegador
        navegador.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        // Navegando para a página do Taskit!
        navegador.get("http://www.juliodelima.com.br/taskit");

        // clicar no link que possui o texto "Sign in"
        navegador.findElement(By.linkText("Sign in")).click();
        // ou WebElement linkSignIn = navegador.findElement(By.linkText("Sign in"));
        //linkSignIn.click();  --> usar quando precisar usar mais de um teste para o mesmo elemento

        // clicar(identificar) no campo name "login" que está denro do formulário id "signinbox"
        WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

        // digitar no campo com name "login"   que está dentro do formulário de id " signinbox" o texto "julio0001"
        formularioSignInBox.findElement(By.name("login")).sendKeys("julio0001");

        // digitar no campo name "Password " que está denro do formulário id "signinbox"
        formularioSignInBox.findElement(By.name("password")).sendKeys("123456");

        // clicar no link com o texto "sign in" <a>
        navegador.findElement(By.linkText("SIGN IN")).click();

        // Validar que dentro do elemento class "me' está o texto "Hi, julio"
        WebElement me = navegador.findElement(By.className("me"));
        String textoNoElementoMe = me.getText();
        assertEquals("Hi, Julio", textoNoElementoMe);

        // Fechar o navegador
        navegador.quit();

        // Validação

        //assertEquals(1,5); // teste básico de experado versus obtido
    }
}
