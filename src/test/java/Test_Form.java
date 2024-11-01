package com.example.SpringMongoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMongoProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMongoProjectApplication.class, args);

        // Set the path to the ChromeDriver executable (download from
        https://sites.google.com/chromium.org/driver/ )
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        // Navigate to a website
        driver.get("http://localhost:3000/");

        // Fill in the form fields
        WebElement nameInput = driver.findElement(By.id("studentname")); // Assuming the ID of the name input field is "name"
        nameInput.sendKeys("John Doe");

        WebElement emailInput = driver.findElement(By.id("studentaddress")); // Assuming the ID of the email input field is "email"
        emailInput.sendKeys("USA");

        WebElement mobileInput = driver.findElement(By.id("mobile")); // Assuming the ID of the email input field is "email"
        mobileInput.sendKeys("091 222921");

        // Submit the form
        WebElement submitButton = driver.findElement(By.id("submit")); // Assuming the ID of the submit button is "submit"
        submitButton.click();

        // Wait for some time to allow the data to be saved in the database (you might need to implement a more robust waiting strategy)
        try {
            Thread.sleep(5000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify that the data is saved in the database (you would need to implement database verification logic here)

        // Close the browser
        driver.quit();
    }
}
