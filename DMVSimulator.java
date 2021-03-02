/*
Name: Ashley Mills
Date: 02 March 2021
Class: CSC109
Description:
       -  Welcome user to DMV
       - Random number between 1 to 100
       - Tells them to wait until number is called
       All out each number one at a time
            (make sure to start at the last one given)
       - Tell them they dont have the required documents and exit
*/
import java.util.Random;

public class DMVSimulator {


    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello, Welcome to the Git DMV. Please take a number. ");

        Random rand = new Random();
        int numb = rand.nextInt(101);
        int counter = numb + 1 ;

        System.out.println("\nYour number is " + numb + ". \nPlease take a seat and wait for your number to be called." );

        do{
            if (counter > 100){
                counter = 0;
            }
            System.out.println("Now serving number " + counter);
            counter ++;
        } while (counter != numb);

        if(counter == numb){
            System.out.println("Its your turn " + numb);
            System.out.println("Sorry you don't have the required documents for this service. \nPlease come back when you do. \nHave a nice day!");

        }

    }
}
