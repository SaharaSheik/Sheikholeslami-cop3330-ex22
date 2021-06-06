package challenge3;

import java.util.Scanner;

/*

 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sahar Sheikholeslami

 */
/*
Exercise 22 - Comparing Numbers
Challenge 3 DONE
Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different.
If they’re not different, then exit the program. Otherwise, display the largest number of the three.

Example Output
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint
Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.
Challenges
1- Modify the program so that all entered values are tracked and the user is prevented
from entering a number that’s already been entered.
2- Modify the program so that it asks for ten numbers instead of three.
3- Modify the program so that it asks for an unlimited number of numbers.

 */
public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;



        String[] counter = {"first", "second", "third"};

        int i,j, flag = 0, max=0, repeat;

        System.out.println("how many numbers would like to enter: ");
        n = Integer.parseInt(input.nextLine());

        int [] numbers = new int[n];

        for (i=0; i<n; i++){

            System.out.print("Enter the number " + (i+1) + ":" );
            numbers [i] = Integer.parseInt(input.nextLine());

        }

        for (i=0; i<n; i++){

            repeat = numbers[i];

            for (j=i+1; j<n; j++){
                if (repeat == numbers[j])
                    flag++;

            }

        }

        if(flag>0)
            System.exit(0);
        else{
            max = numbers[0];
            for (i=1; i<n; i++){
                max = max<numbers[i]? numbers[i] : max;

            }

        }


        System.out.print("The largest number is " + max + ".");


    }
}
