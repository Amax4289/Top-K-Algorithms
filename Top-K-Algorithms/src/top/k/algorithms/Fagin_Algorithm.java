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

        System.out.println("WE ARE IN");

        int Size = S1.size();
        int lilK = 0;
        int flag = 0;

        List<String> SeenElements = new ArrayList<String>();
        List<String> SeenElementsScore = new ArrayList<String>();
        List<String> justSeenElements = new ArrayList<String>();

        for (int cols = 0; cols < Size; cols++) {
            /*
            if (S1.get(i).Element.equals(S2.get(i).Element) && S2.get(i).Element.equals(S3.get(i).Element)) {

                float y = S1.get(i).Score + S2.get(i).Score + S3.get(i).Score;
                String x = S3.get(i).Element + " " + y;
                SeenElements.add(x);
                lilK++;
                System.out.println("Found?");
            }*/

            for (int i = 0; i <= cols; i++) {

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

                            if (S2.get(j).Element.equals(S3.get(k).Element)) {

                                if (!SeenElements.contains(S3.get(k).Element)) {

                                    if (lilK == K) {
                                        flag = 1;
                                        break;
                                    }

                                    String element = S3.get(k).Element;
                                    float score = (float) S1.get(i).Score + (float) S2.get(j).Score + (float) S3.get(k).Score;
                                    String scoreElement = String.format("%.1f", score) + " " + S3.get(k).Element;

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

        for (String ele : justSeenElements) {
            if (!SeenElements.contains(ele)) {
                System.out.println("adding " + ele);
                float score = 0;
                score = score + getScore(S1, ele);
                score = score + getScore(S2, ele);
                score = score + getScore(S3, ele);
                String scoreElement = String.format("%.1f", score) + " " + ele;
                SeenElementsScore.add(scoreElement);
            }
        }

        Collections.sort(SeenElementsScore);

        System.out.println("--------------------------");

        for (int i = SeenElementsScore.size() - 1; i >= SeenElementsScore.size() - K; i--) {

            System.out.println(SeenElementsScore.get(i));
        }

    }
}
