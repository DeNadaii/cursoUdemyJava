package Array;

import java.util.Arrays;

public class fundamentos {
    public static void main(String[] args) {
        double[] notaAlunoA = new double[4];

        System.out.println(Arrays.toString(notaAlunoA));

        notaAlunoA[0] = 7.9;
        notaAlunoA[1] = 8;
        notaAlunoA[2] = 6.7;
        notaAlunoA[3] = 9.7;


        System.out.println(Arrays.toString(notaAlunoA));

        double totalAlunoA = 0;
        for(int i = 0; i < notaAlunoA.length; i++){
            totalAlunoA += notaAlunoA[i];
        }
        System.out.println(totalAlunoA/ notaAlunoA.length);

        double[] notaAlunoB = {5.8 , 9.7, 5, 7.3};

        double totalAlunoB = 0;
        for (int i = 0; i < notaAlunoB.length; i++) {
            totalAlunoB += notaAlunoB[i];
        }
        System.out.println(totalAlunoB/ notaAlunoB.length);
    }
}
