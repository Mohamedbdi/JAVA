/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner;

/**
 *
 * @author Moha_Hareeri
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = input.nextInt();//value one
        System.out.println("Enter second number ");
        int b = input.nextInt();// value two
        int c = a-b;//addition
        int subtrac = a+b;
        int division = a/b;
        System.out.println("Addition is "+c);
        System.out.println("divition is "+division);
        System.out.println("subtractiongggggggggggggggggggggggggg is "+subtrac);
    }
    
}
