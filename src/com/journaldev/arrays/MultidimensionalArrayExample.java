package com.journaldev.arrays;

public class MultidimensionalArrayExample {

    public static void main(String[] args) {

        /* two dimensional array of primitive type
        int[][] arr = new int[2][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }*/

        /* two dimensional array of objects
        String[][] arrStr = new String[3][4];
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = 0; j < arrStr[i].length; j++) {
                arrStr[i][j] = "Str" + j;
                System.out.print(arrStr[i][j] + " ");
            }
            System.out.println("");
        }*/

        int[][] arrInt = {{1, 2}, {3, 4, 5}};
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                System.out.print(arrInt[i][j] + " ");
            }
            System.out.println();
        }

        int[][] arrMulti = new int[2][];

        arrMulti[0] = new int[2];
        arrMulti[1] = new int[3];

        arrMulti[0][0] = 1;
        arrMulti[0][1] = 2;
        arrMulti[1][0] = 3;
        arrMulti[1][1] = 4;
        arrMulti[1][2] = 5;
        for (int i = 0; i < arrMulti.length; i++) {
            for (int j = 0; j < arrMulti[i].length; j++) {
                System.out.print(arrMulti[i][j] + " ");
            }
            System.out.println();
        }
    }
}
