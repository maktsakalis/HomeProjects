/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dectobytesconverter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author makis
 */
public class DecToBytesConverter {

    private static final String FILENAME = "C:\\Users\\makis\\Desktop\\AlphabetCopy.txt";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i, j;

        int Alpha[] = {0, 4, 10, 17, 17, 31, 17, 17};
        int Vita[] = {0, 30, 17, 17, 31, 17, 17, 30};
        int Gamma[] = {0, 31, 16, 16, 16, 16, 16, 16};
        int Delta[] = {0, 4, 10, 17, 17, 17, 17, 31};
        int Epsilon[] = {0, 31, 16, 16, 30, 16, 16, 31};
        int Zitta[] = {0, 31, 1, 2, 4, 8, 16, 31};
        int Itta[] = {0, 17, 17, 17, 31, 17, 17, 17};
        int Thitta[] = {0, 14, 17, 17, 31, 17, 17, 14};
        int Giota[] = {0, 14, 4, 4, 4, 4, 4, 14};
        int Kappa[] = {0, 17, 18, 20, 24, 20, 18, 17};
        int Lambda[] = {0, 4, 10, 17, 17, 17, 17, 17};
        int Mi[] = {0, 17, 27, 21, 17, 17, 17, 17};
        int Ni[] = {0, 17, 17, 25, 21, 19, 17, 17};
        int Ksi[] = {0, 31, 0, 0, 14, 0, 0, 31};
        int Omikron[] = {0, 14, 17, 17, 17, 17, 17, 14};
        int Pi[] = {0, 31, 17, 17, 17, 17, 17, 17};
        int Ro[] = {0, 30, 17, 17, 30, 16, 16, 16};
        int Sigma[] = {0, 31, 16, 8, 4, 8, 16, 31};
        int Taf[] = {0, 31, 4, 4, 4, 4, 4, 4};
        int Ypsilon[] = {0, 17, 17, 10, 4, 4, 4, 4};
        int Fi[] = {0, 4, 14, 21, 21, 14, 4, 4};
        int Chi[] = {0, 17, 17, 10, 4, 10, 17, 17};
        int Psi[] = {0, 21, 21, 21, 14, 4, 4, 4};
        int Omega[] = {0, 14, 17, 17, 17, 14, 0, 31};

        int[][] Alphabet = {Alpha, Vita, Gamma, Delta, Epsilon, Zitta, Itta, Thitta, Giota, Kappa, Lambda, Mi, Ni, Ksi, Omikron, Pi, Ro, Sigma, Taf, Ypsilon, Fi, Chi, Psi, Omega};
        String[][] BitAlphabet = new String[24][8];

        for (i = 0; i < Alphabet.length; i++) {
            for (j = 0; j < Alphabet[i].length; j++) {

                BitAlphabet[i][j] = "B" + toBinary(Alphabet[i][j]);
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {
            char k = 'Α';
            String content;

            for (i = 0; i < BitAlphabet.length; i++) {
                bw.write(k++);
                bw.write("\n");
                for (j = 0; j < BitAlphabet[i].length; j++) {

                    bw.write(BitAlphabet[i][j]);
                    bw.write("\n");
                }
            }
            bw.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public static String toBinary(int int1) {

        System.out.println(int1 + " in binary is");
        int i;
        char[] zeros;

        String binaryString = Integer.toBinaryString(int1);

        StringBuilder byteString = new StringBuilder(binaryString);

        int gap = 5 - binaryString.length();
        zeros = new char[gap];

        for (i = 0; i < gap; i++) {
            zeros[i] = '0';
        }

        if (gap > 0) {
            byteString.insert(0, zeros);
        }

        return byteString.toString();
    }
}
