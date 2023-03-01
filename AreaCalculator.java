package ie.atu.sw;

import java.util.*;

public class AreaCalculator {
	
	//Instance variables
	private Scanner scanner;
	
	public AreaCalculator() {
		scanner = new Scanner(System.in);
		
		init();
		processInput();
	}
	
	public void calcAreaCircle() {
		System.out.println("Enter the radius>");
		String input = scanner.next();
		double radius = Double.parseDouble(input);
		double area = Math.PI * (radius * radius);
		System.out.println("Area of Circle: " + area);
	}
	
	public void calcAreaTriangle() {
		 System.out.println("Enter the width>");
		 String input = scanner.next();
		 double width = Double.parseDouble(input);
		 
		 System.out.println("Enter the height>");
		  input = scanner.next();
		 double height = Double.parseDouble(input);
		 double area = height * (width / 2.0);
		 System.out.println("Area of Triangle: " + area);
	}
	
	private void processInput() {
		String option = scanner.next();
		int choice = Integer.parseInt(option);
		
		switch(choice) {
			case 1:
				calcAreaCircle();
				break;
			case 2:
				calcAreaTriangle();
				break;
			case 3:
				System.exit(0); 
				break;
			default:
				System.out.println("Invalid selection!");
				break;
		}
		/*
		if (choice == 1) {
			calcAreaCircle();
		}else if (choice == 2) {
			calcAreaTriangle();
		}else if (choice == 3) {
			System.exit(0);
		} else {
			System.out.println("Invalid selection!");
		}
		*/
	}
	
	private void init() {
		System.out.println("---------------------------------------");
		System.out.println("\tSimple Area Calculator");
		System.out.println("---------------------------------------");
		System.out.println("(1) Area of a Circle");
		System.out.println("(2) Area of a Triangle");
		System.out.println("(3) Quit");
		System.out.println("Select [1-3]>");
	}
	
	public static void main(String[] args) {
		new AreaCalculator();
	}
}
