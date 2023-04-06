package com.assignment6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AssignmentQ6Application {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentQ6Application.class, args);
		// Create a new RestTemplate
        RestTemplate restTemplate = new RestTemplate();
        
        // Call the RESTful endpoints using RestTemplate
        double result1 = restTemplate.getForObject("http://localhost:8080/calculator/add?num1=5&num2=10", Double.class);
        double result2 = restTemplate.getForObject("http://localhost:8080/calculator/subtract?num1=10&num2=5", Double.class);
        double result3 = restTemplate.getForObject("http://localhost:8080/calculator/multiply?num1=5&num2=10", Double.class);
        double result4 = restTemplate.getForObject("http://localhost:8080/calculator/divide?num1=10&num2=5", Double.class);
        double result5 = restTemplate.getForObject("http://localhost:8080/calculator/sqrt?num=16", Double.class);
        
        // Print the results
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
        System.out.println("Result 5: " + result5);
    
	}

}
