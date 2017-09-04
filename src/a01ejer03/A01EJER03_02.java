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
public class A01EJER03_02 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		// Generate three random integers 

		int digit1 = (int)(Math.random() * 10);

		int digit2 = (int)(Math.random() * 10);

		int digit3 = (int)(Math.random() * 10);



		// Prompt user to enter the sum of three integers

		System.out.print(

			"What is " + digit1 + " + " + digit2 + " + " + digit3 + "? ");

		int answer = input.nextInt();

		

		System.out.println(

			digit1 + " + " + digit2 + " + " + digit3 + " = " + answer + " is " +

			(digit1 + digit2 + digit3 == answer));

	}
}
