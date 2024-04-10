package org.example;

import org.example.config.AppConfig;
import org.example.start.CalculatorApp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CalculatorApp calculatorApp = context.getBean(CalculatorApp.class);

		calculatorApp.start();
	}
}