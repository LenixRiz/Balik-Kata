/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pembalikkata;

import java.util.Scanner;

/**
 *
 * @author Rizky-PC
 */
public class Pembalikkata {

    public static void main(String[] args) {
        
            Scanner keyboard = new Scanner(System.in);
        
            String input, ulang;
            
        do {
            System.out.println("==== Pembalik Kata ====");
            System.out.println("> Masukkan kata : ");
            System.out.print("> ");
            input = keyboard.nextLine();
            char[] array = input.toCharArray();
            int panjang = input.length();

            for (int i = panjang - 1; i >= 0; i-- ) {
                if(array[i] == 'n' && array[i + 1] == 'g') {
                    System.out.print(array[i + 1]);
                } else if (array[i] == 'g' && array[i - 1] == 'n') {
                    System.out.print(array[i - 1]);
                } else if (array[i] == 'n' && array[i + 1] == 'y') {
                    System.out.print(array[i + 1]);
                } else if (array[i] == 'y' && array[i - 1] == 'n') {
                    System.out.print(array[i - 1]);
                } else {
                    System.out.print(array[i]);
                }
            }
            
            System.out.println("");
            
            System.out.println("Apa anda ingin mencoba lagi? [Y/N]");
            ulang = keyboard.nextLine();
            
        } while(ulang.equalsIgnoreCase("Y"));
        
        System.out.println("Terimakasih!");
        
    }
}
