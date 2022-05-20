/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package top.k.algorithms;

import java.util.List;

/**
 *
 * @author Amax
 */
public class SystemAnswer {

    char Element;
    float Score;

    /*
        Hard-writing the scores:
        Ans(q,S1) = < (E, 0.9), (F,0.8), (Α, 0.8), (B, 0.7), (D, 0.4), (C, 0.2), >
        Ans(q,S2) = < (C, 0.8), (A, 0.7), (F,0.6), (D, 0.5), (B, 0.5), (E, 0.1) >
        Ans(q,S3) = < (C, 0.7), (A, 0.7), (E, 0.7), (D,0.4), (F, 0.4), (B, 0.4) >
     */
    public static void addScores(List<SystemAnswer> S1, List<SystemAnswer> S2, List<SystemAnswer> S3) {

        /* ---------- System 1 ---------- */
        SystemAnswer E1 = new SystemAnswer();
        E1.Element = 'E';
        E1.Score = (float) 0.9;
        S1.add(E1);
        SystemAnswer F1 = new SystemAnswer();
        F1.Element = 'F';
        F1.Score = (float) 0.8;
        S1.add(F1);
        SystemAnswer A1 = new SystemAnswer();
        A1.Element = 'A';
        A1.Score = (float) 0.8;
        S1.add(A1);
        SystemAnswer B1 = new SystemAnswer();
        B1.Element = 'B';
        B1.Score = (float) 0.7;
        S1.add(B1);
        SystemAnswer D1 = new SystemAnswer();
        D1.Element = 'D';
        D1.Score = (float) 0.4;
        S1.add(D1);
        SystemAnswer C1 = new SystemAnswer();
        C1.Element = 'C';
        C1.Score = (float) 0.2;
        S1.add(C1);

        /* ---------- System 2 ---------- */
        SystemAnswer C2 = new SystemAnswer();
        C2.Element = 'C';
        C2.Score = (float) 0.8;
        S2.add(E1);
        SystemAnswer A2 = new SystemAnswer();
        A2.Element = 'A';
        A2.Score = (float) 0.7;
        S2.add(A2);
        SystemAnswer F2 = new SystemAnswer();
        F2.Element = 'F';
        F2.Score = (float) 0.6;
        S2.add(F2);
        SystemAnswer D2 = new SystemAnswer();
        D2.Element = 'D';
        D2.Score = (float) 0.5;
        S2.add(D2);
        SystemAnswer B2 = new SystemAnswer();
        B2.Element = 'B';
        B2.Score = (float) 0.5;
        S2.add(B2);
        SystemAnswer E2 = new SystemAnswer();
        E2.Element = 'E';
        E2.Score = (float) 0.1;
        S2.add(E2);

        /* ---------- System 3 ---------- */
        SystemAnswer C3 = new SystemAnswer();
        C3.Element = 'C';
        C3.Score = (float) 0.7;
        S3.add(C3);
        SystemAnswer A3 = new SystemAnswer();
        A3.Element = 'A';
        A3.Score = (float) 0.7;
        S3.add(A3);
        SystemAnswer E3 = new SystemAnswer();
        E3.Element = 'E';
        E3.Score = (float) 0.7;
        S3.add(E3);
        SystemAnswer D3 = new SystemAnswer();
        D3.Element = 'D';
        D3.Score = (float) 0.4;
        S3.add(D3);
        SystemAnswer F3 = new SystemAnswer();
        F3.Element = 'F';
        F3.Score = (float) 0.4;
        S3.add(F3);
        SystemAnswer B3 = new SystemAnswer();
        B3.Element = 'B';
        B3.Score = (float) 0.4;
        S3.add(B3);

    }

}
