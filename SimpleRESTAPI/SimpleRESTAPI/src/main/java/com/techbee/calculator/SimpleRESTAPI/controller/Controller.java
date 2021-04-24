package com.techbee.calculator.SimpleRESTAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/{num1}/+/{num2}")
	public String addNumbers(@PathVariable int num1, @PathVariable int num2) {
		int result = num1 + num2;
		return "Result of " + num1 + " + " + num2 + " is " + result;
	}
	
	@GetMapping("/{num1}/-/{num2}")
	public String subtractNumbers(@PathVariable int num1, @PathVariable int num2) {
		int result = num1 - num2;
		return "Result of " + num1 + " - " + num2 + " is " + result;
	}
	
	@GetMapping("/{num1}/*/{num2}")
	public String multiplyNumbers(@PathVariable int num1, @PathVariable int num2) {
		int result = num1 * num2;
		return "Result of " + num1 + " * " + num2 + " is " + result;
	}
	
	@GetMapping("/{num1}///{num2}")
	public String divideNumbers(@PathVariable int num1, @PathVariable int num2) {
		double result = (double) num1 / num2;
		return "Result of " + num1 + " / " + num2 + " is " + result;
	}
	
	
}
