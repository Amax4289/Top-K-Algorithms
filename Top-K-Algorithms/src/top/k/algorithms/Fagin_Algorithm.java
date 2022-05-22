/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package top.k.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static top.k.algorithms.SystemAnswer.getScore;

/**
 *
 * @author Amax
 */
public class Fagin_Algorithm {

    public static void Fagin(Integer K, List<SystemAnswer> S1, List<SystemAnswer> S2, List<SystemAnswer> S3) {

        int Size = S1.size();
        int lilK = 0;
        int flag = 0;

        List<String> SeenElements = new ArrayList<String>();        // Contains Seen Elements with Conjunction until the K point.
        List<String> SeenElementsScore = new ArrayList<String>();   // Contains Element-Score.
        List<String> justSeenElements = new ArrayList<String>();    // Contains Seen Elements without Conjunction, used to getScore of these elements.

        System.out.println("Executing Fagin Algorithm...");

        /* For each answer */
        for (int cols = 0; cols < Size; cols++) {

            for (int i = 0; i <= cols; i++) {

                /*
                Because we have 3 systems it's easy to check manually,
                if we had more systems, this could be automated in a for loop,
                or a separate function.
                 */
                if (!justSeenElements.contains(S1.get(i).Element)) {
                    String el = S1.get(i).Element;
                    justSeenElements.add(el);
                }
                if (!justSeenElements.contains(S2.get(i).Element)) {
                    String el = S2.get(i).Element;
                    justSeenElements.add(el);
                }
                if (!justSeenElements.contains(S3.get(i).Element)) {
                    String el = S3.get(i).Element;
                    justSeenElements.add(el);
                }

                for (int j = 0; j <= cols; j++) {

                    if (S1.get(i).Element.equals(S2.get(j).Element)) {

                        for (int k = 0; k <= cols; k++) {

                            /* Found Conjunction */
                            if (S2.get(j).Element.equals(S3.get(k).Element)) {

                                /* If doesn't already exist. New Conjunction */
                                if (!SeenElements.contains(S3.get(k).Element)) {

                                    if (lilK == K) {
                                        flag = 1;
                                        break;
                                    }

                                    /* Add Element to the list, along with it's score */
                                    String element = S3.get(k).Element;
                                    float score = (float) S1.get(i).Score + (float) S2.get(j).Score + (float) S3.get(k).Score;
                                    String scoreElement = String.format("%.1f", score) + "\t" + S3.get(k).Element;
                                    SeenElements.add(element);
                                    SeenElementsScore.add(scoreElement);

                                    lilK++;
                                }
                            }
                        }
                        if (flag == 1) {
                            break;
                        }
                    }
                    if (flag == 1) {
                        break;
                    }
                }
                if (flag == 1) {
                    break;
                }
            }

            if (lilK == K) {
                break;
            }

        }

        /* Get (Random Access) Score of Elements */
        for (String ele : justSeenElements) {
            if (!SeenElements.contains(ele)) {
                float score = 0;
                score = score + getScore(S1, ele);
                score = score + getScore(S2, ele);
                score = score + getScore(S3, ele);
                String scoreElement = String.format("%.1f", score) + "\t" + ele;
                SeenElementsScore.add(scoreElement);
            }
        }

        Collections.sort(SeenElementsScore); // Sort Scores

        /* Print Top-K Elements */
        System.out.println("Score   Element");
        for (int i = SeenElementsScore.size() - 1; i >= SeenElementsScore.size() - K; i--) {
            System.out.println(SeenElementsScore.get(i));
        }
        System.out.println("---------------------------------------");
    }
}
