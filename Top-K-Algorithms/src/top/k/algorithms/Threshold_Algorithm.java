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
public class Threshold_Algorithm {

    public static void Threshold(Integer K, List<SystemAnswer> S1, List<SystemAnswer> S2, List<SystemAnswer> S3) {

        int Size = S1.size();
        float UpperBound = -1;

        List<String> SeenElements = new ArrayList<String>();        // Contains all seen Elements untill Threshold.
        List<String> SeenElementsScore = new ArrayList<String>();   // Contains Element-Score.
        List<String> justSeenElements = new ArrayList<String>();    // Contains Elements that were added.

        System.out.println("Executing Threshold Algorithm...");

        /* For each answer */
        for (int cols = 0; cols < Size; cols++) {

            UpperBound = S1.get(cols).Score + S2.get(cols).Score + S3.get(cols).Score;

            /*
                Because we have 3 systems it's easy to check manually,
                if we had more systems, this could be automated in a for loop,
                or a separate function.
             */
            if (!justSeenElements.contains(S1.get(cols).Element)) {
                String x = S1.get(cols).Element;
                justSeenElements.add(x);
            }
            if (!SeenElements.contains(S2.get(cols).Element)) {
                String x = S2.get(cols).Element;
                justSeenElements.add(x);
            }
            if (!justSeenElements.contains(S3.get(cols).Element)) {
                String x = S3.get(cols).Element;
                justSeenElements.add(x);
            }

            /*  For each just seen element, if it wasn't already added,
                calculate it's score, and if it's larger/equal than the
                UpperBound, then add it.
             */
            for (String ele : justSeenElements) {
                if (!SeenElements.contains(ele)) {

                    float score = 0;
                    score = score + getScore(S1, ele);
                    score = score + getScore(S2, ele);
                    score = score + getScore(S3, ele);

                    if (score >= UpperBound) {
                        String scoreElement = String.format("%.1f", score) + "\t" + ele;
                        SeenElementsScore.add(scoreElement);
                        SeenElements.add(ele);
                    }
                }
            }
            if (SeenElementsScore.size() >= K) {
                break;
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
