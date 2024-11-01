package com.example.SpringLabProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLabProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringLabProjectApplication.class, args);

        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Navigate to a website
        driver.get("http://localhost:3000/patient");

        // Fill in the form fields
        WebElement nameInput = driver.findElement(By.id("patientname")); //ID of the name input field is "Patinet Name"
        nameInput.sendKeys("Pasindu Perera");

        WebElement nicInput = driver.findElement(By.id("patientnic")); //ID of the email input field is "Patinet NIC"
        nicInput.sendKeys("200006001289");

        WebElement emailInput = driver.findElement(By.id("patientmail")); //ID of the email input field is "Patinet Email"
        emailInput.sendKeys("pasinduperera@gmail.com");

        WebElement doctorInput = driver.findElement(By.id("patientdoctor")); //ID of the name input field is "Patinet Doctor"
        doctorInput.sendKeys("Dr. Johnson Wood");

        WebElement mobileInput = driver.findElement(By.id("mobile")); //  ID of the email input field is "email"
        mobileInput.sendKeys("076 1778990");

        // Submit the form
        WebElement element = driver.findElement(By.id("submit"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();


        // Wait for some time to allow the data to be saved in the database (you might need to implement a more robust waiting strategy)
        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();