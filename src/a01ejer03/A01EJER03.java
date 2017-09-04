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
public class A01EJER03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a Scanner object

		Scanner input = new Scanner(System.in);



		// Prompt the user to enter values for a, b and c.

		System.out.print("Enter a, b, c: ");

		double a = input.nextDouble();

		double b = input.nextDouble();

		double c = input.nextDouble();



		// Compute the discriminant of the quadriatic equation.

		double discriminant = Math.pow(b, 2) - 4 * a * c;



		// Compute the real roots of the quadriatic equation if any.

		System.out.print("The equation has ");

		if (discriminant > 0)

		{

			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);  

			double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);  

			System.out.println("two roots " + root1 + " and " + root2);

		}

		else if (discriminant == 0)

		{

			double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);

			System.out.println("one root " + root1);

		}

		else

			System.out.println("no real roots");
    }
    
}
