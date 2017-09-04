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
public class A01EJER03_10 {
    public static void main(String[] agrs) {

		Scanner input = new Scanner(System.in);



		// Generate tow integers less than 100

		int number1 = (int)(Math.random() * 100);

		int number2 = (int)(Math.random() * 100);



		// Prompt the user to enter an answer

		System.out.print(

			"What is " + number1 + " + " + number2 + "? ");

		int answer = input.nextInt();



		// Display result

		if (number1 + number2 == answer)

			System.out.println("You are correct!");

		else

			System.out.println("You are wrong " + number1 + " + " + number2

				+ " should be " + (number1 + number2));

	}
}
