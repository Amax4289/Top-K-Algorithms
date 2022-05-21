/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package top.k.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Amax
 */
public class Fagin_Algorithm {

    public static void Fagin(Integer K, List<SystemAnswer> S1, List<SystemAnswer> S2, List<SystemAnswer> S3) {

        System.out.println("WE ARE IN");

        int Size = S1.size();
        int lilK = 0;

        List<String> SeenElements = new ArrayList<String>();

        for (int i = 0; i < Size; i++) {
            /*
            if (S1.get(i).Element.equals(S2.get(i).Element) && S2.get(i).Element.equals(S3.get(i).Element)) {

                float y = S1.get(i).Score + S2.get(i).Score + S3.get(i).Score;
                String x = S3.get(i).Element + " " + y;
                SeenElements.add(x);
                lilK++;
                System.out.println("Found?");
            }*/

            for (int j = 0; j < i; j++) {

                if (S1.get(i).Element.equals(S2.get(j).Element)) {

                    for (int k = 0; k < i; k++) {

                        if (S2.get(j).Element.equals(S3.get(k).Element)) {

                            if (!SeenElements.contains(S3.get(k).Element)) {

                                System.out.println("Found?");
                                float y = S1.get(i).Score + S2.get(j).Score + S3.get(k).Score;
                                String x = y + " " + S3.get(k).Element;
                                SeenElements.add(x);
                                lilK++;
                            }
                        }
                    }

                }

            }

            if (lilK == K) {
                break;
            }
        }

        Collections.reverse(SeenElements);
        for (String s : SeenElements) {
            System.out.println(s);
        }

    }
}
