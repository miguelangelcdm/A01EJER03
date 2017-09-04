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
public class A01EJER03_25 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	// Create Scanner object



		// Prompt the user to enter four points 

		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");

		double x1 = input.nextDouble();

		double y1 = input.nextDouble();

		double x2 = input.nextDouble();

		double y2 = input.nextDouble();

		double x3 = input.nextDouble();

		double y3 = input.nextDouble();

		double x4 = input.nextDouble();

		double y4 = input.nextDouble();



		// Calculate the intersecting point

		// Get a, b, c, d, e, f

		double a = y1 - y2;

		double b = -1 * (x1 - x2);

		double c = y3 - y4;

		double d = -1 * (x3 - x4);

		double e = (y1 - y2) * x1 - (x1 - x2) * y1;

		double f = (y3 - y4) * x3 - (x3 - x4) * y3;



		// Display results

		if (a * d - b * c == 0)

		{

			System.out.println("The two lines are parallel");

		}

		else

		{

			double x = (e * d - b * f) / (a * d - b * c);

			double y = (a * f - e * c) / (a * d - b * c);

			System.out.println("The intersecting point is at (" + x + ", " + y + ")");

		}

	}
}
