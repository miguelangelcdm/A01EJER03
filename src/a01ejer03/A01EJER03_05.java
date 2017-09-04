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
public class A01EJER03_05 {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		// Prompt the user to enter an integer for today's day of the week

		System.out.print("Enter today’s day: ");

		int day = input.nextInt();



		// Prompt the user to enter the number of days after today

		System.out.print("Enter the number of days elapsed since today: ");

		int daysElapsed = input.nextInt();



		// Calculate future day

		int futureDay = (day + daysElapsed) % 7;



		System.out.print("Today is ");

		switch (day)

		{

			case 0: System.out.print("Sunday"); break;

			case 1: System.out.print("Monday"); break;

			case 2: System.out.print("Tuesday"); break;

			case 3: System.out.print("Wednesday"); break;

			case 4: System.out.print("Thursday"); break;

			case 5: System.out.print("Friday"); break;

			case 6: System.out.print("Saturday");

		}



		System.out.print(" and the future day is ");

		switch (futureDay)

		{

			case 0: System.out.println("Sunday"); break;

			case 1: System.out.println("Monday"); break;

			case 2: System.out.println("Tuesday"); break;

			case 3: System.out.println("Wednesday"); break;

			case 4: System.out.println("Thursday"); break;

			case 5: System.out.println("Friday"); break;

			case 6: System.out.println("Saturday");

		}

	}
     
}
