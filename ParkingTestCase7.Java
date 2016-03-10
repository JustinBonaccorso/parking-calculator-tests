package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ParkingTestCase7Java {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://adam.goucher.ca/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testParkingTestCase7Java() throws Exception {
    driver.get(baseUrl + "/parkcalc/index.php");
      
      //Select Valet Parking
    new Select(driver.findElement(By.id("Lot"))).selectByVisibleText("Valet Parking");
     
      //Enter 08:00
    driver.findElement(By.id("EntryTime")).clear();
    driver.findElement(By.id("EntryTime")).sendKeys("08:00");
      
      //Enter 09/10/2015
    driver.findElement(By.id("EntryDate")).clear();
    driver.findElement(By.id("EntryDate")).sendKeys("09/10/2015");
     
      //Select AM
    driver.findElement(By.name("EntryTimeAMPM")).click();
     
      //Enter 09:30
    driver.findElement(By.id("ExitTime")).clear();
    driver.findElement(By.id("ExitTime")).sendKeys("09:30");
     
      //Enter 09/10/2015
    driver.findElement(By.id("ExitDate")).clear();
    driver.findElement(By.id("ExitDate")).sendKeys("09/10/2015");
     
      //Select AM
    driver.findElement(By.name("ExitTimeAMPM")).click();
     
      //Click Submit
    driver.findElement(By.name("Submit")).click();
      
      //Verify Totals are $ 12.00 and 0 Days, 1 Hour, 30 Minutes
    try {
      assertEquals("$ 12.00", driver.findElement(By.cssSelector("b")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals("(0 Days, 1 Hours, 30 Minutes)", driver.findElement(By.cssSelector("span.BodyCopy > font > b")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
