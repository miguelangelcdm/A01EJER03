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
public class A01EJER03_14 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		// Generate a random integer 0 or 1

		int coin = (int)(Math.random() * 2);



		// Prompt the user to enter a guess

		System.out.print("Enter a guess 0-head or 1-tail: ");

		int guess = input.nextInt();



		// Display result

		System.out.println(((guess == coin) ? "Correct" : "Incorrect") + " guess."); 

	}
}
