package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class practice2 {
    //    @Test
//       public void Testcase12_login(){
//           App b = new App();
//           Assert.assertEquals(true,b.login_test("dharani","dharani143"));
//       }
//       @Test
//       public void Testcase13_login(){
//           App b = new App();
//           Assert.assertEquals(false,b.login_test("dharani","gupta143"));
    //  }
    @Test
    public void googleTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("dharani");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(),"dharani-Google Search");
        driver.close();

    }
}
