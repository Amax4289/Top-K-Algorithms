/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package top.k.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static top.k.algorithms.Fagin_Algorithm.Fagin;
import static top.k.algorithms.SystemAnswer.addScores;
import static top.k.algorithms.Threshold_Algorithm.Threshold;

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
        System.out.println("Please note that K can take the values 1 to 6, as the number 6 is the maximum amount of elements in the given System Answers.");
        System.out.println("---------------------------------------");

        addScores(S1, S2, S3);

        Scanner scan = new Scanner(System.in);
        int choice = 0;
        int K = -1;
        /*
        for (SystemAnswer S : S1) {
            System.out.println(S.Element);
            System.out.println(S.Score);
        }
        for (SystemAnswer S : S2) {
            System.out.println(S.Element);
            System.out.println(S.Score);
        }
        for (SystemAnswer S : S3) {
            System.out.println(S.Element);
            System.out.println(S.Score);
        }*/

        while (choice != 3) {

            K = -1;
            System.out.print("Please choose your Algorithm of choice: ");
            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Executing Fagin Algorithm.");
                    while (K < 1 || K > 6) {
                        System.out.println("Please input an acceptable value for 'K' : ");
                        K = scan.nextInt();
                    }
                    Fagin(K, S1, S2, S3);
                    break;

                case 2:
                    System.out.println("Executing Threshold Algorithm.");
                    while (K < 1 || K > 6) {
                        System.out.println("Please input an acceptable value for 'K' : ");
                        K = scan.nextInt();
                    }
                    Threshold(K, S1, S2, S3);
                    break;

                case 3:
                    System.out.println("Terminating Program...");
                    return;

            }

        }
    }

}
