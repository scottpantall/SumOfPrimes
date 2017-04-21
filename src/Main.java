/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        Boolean isPrime;
        int sum = 0;
        int countOfPrimes = 0;
        int number = 2;
        
        // Iterate through the first 1000 prime numbers
        while(countOfPrimes < 1000)
        {
            isPrime = true; //Assume number is prime
            
            // Test if number is actually prime
            //  by dividing it by itself and each number less than it
            for(int j = number; j > 1; j--)
            {
                // If the number divided by a lesser number is not 1
                //  and has no remainder, the original number is not prime
                if((number / j != 1) && number % j == 0)
                    isPrime = false;
            }
            
            // If the number is prime, add it to the sum and increment countOfPrimes
            if(isPrime)
            {
                sum += number;
                countOfPrimes++;
            }
            
            number++;
        }
        System.out.println(sum);
    }
}