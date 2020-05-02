package com.mali;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    protected void init() {
        wd = new FirefoxDriver();
        System.out.println("Start");
//        login("login", "pass");
    }

    @Test
    public void AppTests() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://selenium1py.pythonanywhere.com/ru/");
//        login();
        register_new_user();
        System.out.println("Well done");

    }

    protected void stop() {
        wd.quit();
        System.out.println("End process");
    }

    private void register_new_user() {
        wd.findElement(By.id("id_registration-email")).sendKeys("test-test@mail.ru");
        wd.findElement(By.id("id_registration-password1")).sendKeys("Mypass123!");
        wd.findElement(By.id("id_registration-password2")).sendKeys("Mypass123!");
    }

    private void login(String username, String password) {
//        wd.findElement(By.className("a7i1")).click();
//        wd.findElement(By.name("phone")).sendKeys("9310083415");
//        wd.findElement(By.className("ui-h2")).click();

        wd.findElement(By.id("login_link")).click();
    }
}
