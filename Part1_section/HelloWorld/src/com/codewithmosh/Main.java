package com.codewithmosh; //Package to specify what package it specifies to

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main { //Main Class

    public static void main(String[] args) {  //Main method which is public and makes it accessible to other parts of this program
	// write your code here

        System.out.println("Hello world");

        //Initializnig giving it a value
        int age = 30;
        int temperature = 20; // integer can only store whole numbers

        int myAge = 30;
        int herAge = myAge;

        System.out.println(herAge);
        age = 35;

        System.out.println(age);


        byte ageV2 = 30;
        long viewsCount = 3_123_456_789L; // int store values up to 2 billion
        float price =  10.99F; //double is too much memory change to float
        char letter = 'A'; //Cover single values with single quotes and multiple values with double quotes
        boolean isEligible = true;




        byte ageV3 = 30;
        //Primitaive types dont need to allocate memory
        //primmitave types dont have members
        //Reference type do need mempery

        Date now = new Date();

        //Object is an instance of a class

        System.out.println(now);



        //5- Primitive vs Reference Types

        //Different memory locations
        byte x = 1;
        byte y = x;

        x = 2;
        System.out.println(y);

        //References store only the memory address not the actual value
        //This means they are not independent and if you change the object it will change both of them
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;

        System.out.println(point2);



        //6- Strings

        String message = new String("Hello world"); // all though is a reference type new object keyword is redundant
        String message2 = "   HelloWorld"+  "!!   " ; // this is much better

        message2.endsWith("!!"); // to see if msg ends with explatiom
        System.out.println(message2.endsWith("!!"));
        System.out.println(message2.startsWith("!!"));
        System.out.println(message2);
        System.out.println(message2.length());
        System.out.println(message2.indexOf("sky")); // if its -1 it means it dowesnt contain it
        System.out.println(message2.replace("!","@"));

        System.out.println(message2); //Strings are immutable, any method that modify a string will returna new object

        System.out.println(message2.toLowerCase());
        System.out.println(message2.trim()); // removes spaces before and after the string

        //Parameters are the wholes we defined in our methods
        //argumenst is what we pass down to it






        //  7- Escape Sequences

        String newMessage = "Hello \"Mosh\""; // using backslash you escaped the double quotes
        System.out.println(newMessage);

        String secondMessage = "c:\\\tWindows\\..."; // escaped the backslash
        System.out.println(secondMessage);


        //8- Arrays

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;



        //when you print the array it prints the address in memory space if th array


        System.out.println(Arrays.toString(numbers));

        //Arrays are fixed you cant add or remove anything here they are a fixed lengths
        int[] numbersV2 = {2,5,3,4,1};
        System.out.println(numbersV2.length);

        Arrays.sort(numbersV2);
        System.out.println(Arrays.toString(numbersV2));




        //9- Multi-dimensional Arrays

        int[][] numbersArray = {{1,2,3},{4,5,6}};
//        numbersArray[0][0] = 1;
        System.out.println(Arrays.deepToString(numbersArray));


        //10- Constants

        //SHould be capital lettesr
        final float PI = 3.14F; //constants cannot be changed once initialized





        //11- Arithmetic Expressions

        //expressions produce values
        double result =(double)10 / (double)3; //casting this number to a DOUBLE

        int x2 = 1;
        //x will get copied to y then it will increment
        int y2 = ++x2; //Incrementing //postfix

        //x2 = x2 + 2
        x2 += 2; // augmented operator
        x2 -= 2;
        x2*=2;

        System.out.println(y2);
        System.out.println(x2);
//        ++x2; // prefix
        System.out.println(result);




        //  12- Order of Operations

        //PEMDAS
        int xV3 = (10 + 3 )* 2 ;
        System.out.println(xV3);



        // 13- Casting

        //Implicit casting => Automaticaly casting
        //this opnly happens when you wont lose data
        //byte => short > int >long > float > double

        double shortX = 1.1; // 2 bytes
        String stringX= "1.1";
        float newNumber = Float.parseFloat(stringX) + 2;


        int shortY = (int)shortX + 2; // 4 byts



        //14- The Math Class
        int result2 = Math.round(1.1F);
        int ceilResult = (int) Math.ceil(1.1F); // this stores the greatest number after the decimal // rounds up
        int floorResult = (int) Math.floor(1.1F); // rounds down
        int maxResult = Math.max(1,2); // returns the greater number
        double randomNumber = Math.random() * 100; // between 0-1

        System.out.println(result2);




        //first java looks at x then and get and identical int in memory
        System.out.println(shortY);




        //  15- Formatting Numbers

        //1234567
        //Cant create and instance of the NUmberFormat class because is an abstract class
        NumberFormat currencyINS = NumberFormat.getCurrencyInstance();
        String stringFormatResilt = currencyINS.format(123456.891);
        System.out.println(stringFormatResilt);


        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentAnswer = percent.format(0.5);
        System.out.println(percentAnswer);




        //  16- Reading Input
//        Scanner input = new Scanner(System.in);
//        System.out.print("Age: ");
//        byte byteAge = input.nextByte();
//        System.out.print("Name: ");
//
//
//        String stringAge = input.nextLine().trim(); // next only reads 1 token 1 word
//        System.out.println("You are " + stringAge);
//
//
//        System.out.println("You are " + byteAge);


        // 17- Project- Mortgage Calculator


        //Data for calculator

        double principal;
        double annualInterestRate;
        int n_payments;

        //NO MAGIC NUMBERS
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;


        Scanner input = new Scanner(System.in);

        System.out.print("Principal: ");
        principal = input.nextDouble();

        System.out.print("Annual Interest Rate: ");
        annualInterestRate = (input.nextDouble() / PERCENT) / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        n_payments = input.nextByte() * MONTHS_IN_YEAR;

        double newMurator = annualInterestRate * Math.pow (( 1 + annualInterestRate), n_payments);
        double denomarator = Math.pow ((1 + annualInterestRate),n_payments) - 1;

        double mortagePayment = principal * ( newMurator/ denomarator );

        NumberFormat money = NumberFormat.getCurrencyInstance();


        System.out.println("Mortgage: " + money.format(mortagePayment));
















    }
}
