/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package top.k.algorithms;

import java.util.Scanner;

/**
 *
 * @author Amax
 */
public class TopKAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("---------------------------------------");
        System.out.println("-1- Fagin Algorithm");
        System.out.println("-2- Threshold Algorithm");
        System.out.println("-3- Terminate Program");
        System.out.println("---------------------------------------");

        Scanner scan = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {

            System.out.print("Please choose your Algorithm of choice: ");
            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Executing Fagin Algorithm.");
                    break;

                case 2:
                    System.out.println("Executing Threshold Algorithm.");
                    break;

                case 3:
                    System.out.println("Terminating Program...");
                    return;

            }

            System.out.println(choice);
        }
    }

}
