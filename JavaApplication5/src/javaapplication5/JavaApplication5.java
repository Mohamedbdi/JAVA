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
        int number = input.nextInt();
        for (int i = number; i>=0;i-- ){
            System.out.println(i);
        }
    }
    
}
