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
public class A01EJER03_32 {
   public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	// Create Scanner object



		// Prompt the user to enter the three points for p0, p1, and p2

		System.out.print("Enter three points for p0, p1, and p2: ");

		double x0 = input.nextDouble(); 

		double y0 = input.nextDouble();

		double x1 = input.nextDouble(); 

		double y1 = input.nextDouble();

		double x2 = input.nextDouble(); 

		double y2 = input.nextDouble(); 



		// Calculate point position

		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);



		// Display result

		System.out.print("(" + x2 + ", " + y2 + ") is on the ");

		if (position > 0)

			System.out.print("left side of the "); 

		if (position < 0)

			System.out.print("right side of the ");

		System.out.println("line from (" + x0 + ", " + y0 + 

			") to (" + x1 + ", " + y1 + ")");

	} 
}
