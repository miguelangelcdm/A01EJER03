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
public class A01EJER03_08 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		// Prompt the user to enter three integers

		System.out.print("Enter three integers: ");

		int number1 = input.nextInt();

		int number2 = input.nextInt();

		int number3 = input.nextInt();



		// Sort numbers

		int temp;

		if (number2 < number1 || number3 < number1)

		{

			if (number2 < number1)

			{

				temp = number1;

				number1 = number2;

				number2 = temp; 

			}

			if (number3 < number1)

			{

				temp = number1;

				number1 = number3;

				number3 = temp;

			}

		}

		if (number3 < number2)

		{

			temp = number2;

			number2 = number3;

			number3 = temp;

		}



		// Display numbers in accending order

		System.out.println(number1 + " " + number2 + " " + number3);

	}
}
