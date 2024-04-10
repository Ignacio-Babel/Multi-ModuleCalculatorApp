package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorController {
	private final CalculatorService calculatorService;
	@Autowired
	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	public double performCalculation(int operationToPerform, double firstUserInput, double secondUserInput){
		return switch (operationToPerform) {
			case 1 -> calculatorService.add(firstUserInput, secondUserInput);
			case 2 -> calculatorService.subtract(firstUserInput, secondUserInput);
			case 3 -> calculatorService.multiply(firstUserInput, secondUserInput);
			case 4 -> calculatorService.divide(firstUserInput, secondUserInput);
			default -> throw new IllegalArgumentException("Invalid choice for operation: " + operationToPerform);
		};
	}
}
