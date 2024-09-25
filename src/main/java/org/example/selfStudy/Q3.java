package org.example.selfStudy;

import javax.swing.*;

public class Q3 {
    public static void main(String[] args) {
        String math1 = JOptionPane.showInputDialog("첫 번째 수학점수: ");
        String math2 = JOptionPane.showInputDialog("두 번째 수학점수: ");
        String eng1 = JOptionPane.showInputDialog("첫 번째 영어점수: ");
        String eng2 = JOptionPane.showInputDialog("두 번째 영어점수: ");

        int math1r = Integer.parseInt(math1);
        int math2r = Integer.parseInt(math2);
        int eng1r = Integer.parseInt(eng1);
        int eng2r = Integer.parseInt(eng2);

        int mathSum = math1r + math2r;
        int engSum = eng1r + eng2r;



        double resultMath = (double)mathSum / 2.00;
        double resultEng = (double)engSum / 2.00;

        JOptionPane.showMessageDialog(null, "수학 평균 점수: "+resultMath+"\n"+"영어 평균 점수: "+resultEng);


    }
}
