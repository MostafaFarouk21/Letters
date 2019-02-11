/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letters;

import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class Letters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char first_letter , sencond_letter;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first Letter");
        first_letter = s.next().charAt(0);
        System.out.println("Enter second Letter");
        sencond_letter = s.next().charAt(0);
        
       if(Character.isLowerCase(first_letter)|| Character.isUpperCase(sencond_letter)){
           System.out.println("LowerCase and UpperCase");
        }
       
         if(Character.isLowerCase(first_letter)&& !Character.isUpperCase(sencond_letter)){
            System.out.println("LowerCase");
        }
         
         // if else
         char letter_1 = 0  , lette_2 = 0;
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter first Letter");
        first_letter = s.next().charAt(0);
        System.out.println("Enter second Letter");
        sencond_letter = s.next().charAt(0);
        if(Character.isUpperCase(letter_1)){
            System.out.println("UpperCase");
        }
        else if(Character.isLowerCase(lette_2)){
            System.out.println("LowerCase");
        }
    }
    
}
