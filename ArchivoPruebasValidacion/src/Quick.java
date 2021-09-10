/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johana
 */

public class Quick {

    public static void quickSort(int[] vector, int a, int n) {

        int b = a;
        int c = n;

        if (b >= n) {

            return;

        }

        int mitad = vector[(b + c) / 2];

        while (b < c) {

            while (b < c && vector[b] < mitad) {

                b++;

            }

            while (b < c && vector[c] > mitad) {

                c--;

            }

            if (b < c) {

                int d = vector[b];
                vector[b] = vector[c];
                vector[c] = d;

            }
        }

        if (c < b) {

            int T = c;
            c = b;
            b = T;

        }

        quickSort(vector, a, b);
        quickSort(vector, b == a ? b + 1 : b, n);

    }
}
