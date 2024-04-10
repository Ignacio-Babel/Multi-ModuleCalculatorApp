package org.example.service;

import org.springframework.stereotype.Service;

@Service
public interface IMenuService {
	public int askUserForOperation();
	public double askUserFirstValue();
	public double askUserSecondValue();
	public void printOutSolutionToUser(double solution);
}
