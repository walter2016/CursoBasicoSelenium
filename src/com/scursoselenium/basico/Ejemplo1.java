package com.scursoselenium.basico;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo1 {

    public static void main(String[] args){
        //inicializamos un objeto de tipo WebDriver
        WebDriver driver;

        String baseURL="https://www.demoblaze.com/";
        String actualResult="";
        String expectedResult="";


         System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

         driver = new ChromeDriver();
    }

}
