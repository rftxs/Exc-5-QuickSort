package main5;

import controller.controller;

public class mainExc5ED {

	public static void main(String[] args) {
		controller Controller = new controller();
		
		int vetor [] = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		Controller.quickSort(vetor, 0, vetor.length - 1);
		
		for (int valor:vetor) {
			System.out.print(valor);
			System.out.print(" ");
		}

	}

}
