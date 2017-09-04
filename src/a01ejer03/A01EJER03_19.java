/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a01ejer03;
import java.util.Scanner;
/**
 *
 * @author MAGD7-PC
 */
public class A01EJER03_19 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		// Prompt the user to enter three edges for a triangle

		System.out.println("Enter three edges for a triangle:");

		System.out.print(" Edge 1 points x, y: ");

		double x1 = input.nextDouble();

		double y1 = input.nextDouble();

		System.out.print(" Edge 2 points x, y: ");

		double x2 = input.nextDouble();

		double y2 = input.nextDouble();

		System.out.print(" Edge 3 points x, y: ");

		double x3 = input.nextDouble();

		double y3 = input.nextDouble();



		// Test if input is valid

		boolean valid = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) ||

							 (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) ||

							 (x3 + y3 > x1 + y1 && x2 + y2 > x1 + y1);



		if (!valid)

		{

			System.out.println("Input is invalid.");

			System.exit(1);

		}



		// Compute the sides of the triangle

		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

		double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);

		double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);



		// Display the perimeter of the triangle

		System.out.println("perimeter of triangle is " + (side1 + side2 + side3));

	}
}
