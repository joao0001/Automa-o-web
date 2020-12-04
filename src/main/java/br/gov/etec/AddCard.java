package br.gov.etec;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AddCard {

    @Test
    public void LoginValido(){

        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?id_product=2&controller=product");


        //selecionando o botão para adicionar o produto no carrinho
        WebElement btnAddToCard0 = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
        //iniciando uma ação que gera um  click
        Actions actions= new Actions(driver);
        actions.click(btnAddToCard0).build().perform();
        //adicionando uma espera de 5 segundos para realizar o click essa espera é necessaria pois o elemento demora alguns segundos para carregar
		//essa espera esta definida em  WebDriverWait wait 
        WebDriverWait wait = new WebDriverWait(driver, 5);
        WebElement btnnext = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")));
        Actions actionsn= new Actions(driver);
        actionsn.click(btnnext).build().perform();

        //action está determinada para realizar um click no elemento passado
        WebDriverWait wait2 = new WebDriverWait(driver, 2);
        WebElement next = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")));
        Actions actionsnext= new Actions(driver);
        actionsnext.click(next).build().perform();



        //Adicionando a conta que foi criada durante o processo de criação
        WebElement InputLogin = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        InputLogin.sendKeys("newcont@gmail.com");

        WebElement Inputpass = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
        Inputpass.sendKeys("00000");

        WebElement create = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));

        Actions actionscr= new Actions(driver);
        actionscr.click(create).build().perform();

        WebElement continueop = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));

        Actions actionsop= new Actions(driver);
        actionsop.click(continueop).build().perform();


        WebElement agree = driver.findElement(By.xpath("//*[@id=\"cgv\"]"));

        Actions iagree= new Actions(driver);
        iagree.click(agree).build().perform();


        WebDriverWait loading = new WebDriverWait(driver, 1);
        WebElement proceed = loading.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form\"]/p/button/span")));
        Actions actionspro= new Actions(driver);
        actionspro.click(proceed).build().perform();


        WebElement finish = driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));

        Actions finis= new Actions(driver);
        finis.click(finish).build().perform();

        WebElement confirm = driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));

        Actions confirmatv= new Actions(driver);
        confirmatv.click(confirm).build().perform();


    }






}
