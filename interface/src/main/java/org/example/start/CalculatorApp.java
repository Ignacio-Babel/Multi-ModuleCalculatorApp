package org.example.start;

import org.example.service.CalculatorController;
import org.example.service.IMenuService;
import org.springframework.stereotype.Component;

@Component
public class CalculatorApp {
	private final IMenuService menuUI;
	private final CalculatorController calculatorManager;

	public CalculatorApp(IMenuService menuUI, CalculatorController calculatorManager) {
		this.menuUI = menuUI;
		this.calculatorManager = calculatorManager;
	}

	public void start() {
		while (true) {
			int operationToPerform = menuUI.askUserForOperation();
			if (operationToPerform == 5) {
				System.out.println("Exiting program...");
				break;
			}
			double firstUserInput = menuUI.askUserFirstValue();
			double secondUserInput = menuUI.askUserSecondValue();
			double solutionOperation = calculatorManager.performCalculation(operationToPerform, firstUserInput, secondUserInput);
			menuUI.printOutSolutionToUser(solutionOperation);
		}
	}
}
