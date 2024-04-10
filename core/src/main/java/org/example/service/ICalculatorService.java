package org.example.service;

import org.springframework.stereotype.Service;

@Service
public interface ICalculatorService {
	public double add(double num1, double num2);

	public double subtract(double num1, double num2);

	public double multiply(double num1, double num2);

	public double divide(double num1, double num2);
}
