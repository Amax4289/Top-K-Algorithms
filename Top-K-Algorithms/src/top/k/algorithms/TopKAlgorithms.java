/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package top.k.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static top.k.algorithms.SystemAnswer.addScores;

/**
 *
 * @author Amax
 */
public class TopKAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static List<SystemAnswer> S1 = new ArrayList<SystemAnswer>();
    public static List<SystemAnswer> S2 = new ArrayList<SystemAnswer>();
    public static List<SystemAnswer> S3 = new ArrayList<SystemAnswer>();

    public static void main(String[] args) {

        System.out.println("---------------------------------------");
        System.out.println("-1- Fagin Algorithm");
        System.out.println("-2- Threshold Algorithm");
        System.out.println("-3- Terminate Program");
        System.out.println("---------------------------------------");

        addScores(S1, S2, S3);

        //
        Scanner scan = new Scanner(System.in);
        int choice = 0;

        for (SystemAnswer S : S1) {
            System.out.println(S.Element);
            System.out.println(S.Score);
        }

        /*
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
        }*/
    }

}
