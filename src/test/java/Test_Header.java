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

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("http://localhost:3000/");

        // Find the header element
        WebElement headerElement = driver.findElement(By.tagName("h1"));

        // Get the text of the header
        String headerText = headerElement.getText();

        // Print the header text
        System.out.println("Page Header: " + headerText);

        // Close the browser
        driver.quit();
    }
}

