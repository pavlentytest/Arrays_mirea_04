package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.HashMap;
/*
Волков Егор
Степанов Павел
Добавить сюда свое имя и фамилию
 */


public class Main {

    public static void main(String[] args) {

        int x = 0;
        while(x > 0 || x == 10 && x != 3) {

        }

        do {

        } while(x > 100);

        for(int i=0; i<10; i++) {

        }

        int[] z; // null
        z = new int[10]; // 10 нулей

        for(int i: z) {
            System.out.println(i + " "); // foreach
        }
        x++;

        for(int j=0; j< 20; j++) {
            if(j == 12) {
                //continue; // переход к след. итерации
                break; // выход из цикла
            }
            // блок кода
        }

        double a;
        if(x > 0){
            a = 9.0;
        }

        a = 8;

        int[] c = new int[3];
        int q[] = new int[5];

        double[] b = new double[2];
        int[] m = {6,7,8,-900,2388,-4};
        m[2] = 800;

        int[][] s = new int[4][5];
        for(int i=0;i<s.length;i++) {
            for(int j=0;j<s[i].length;j++) {
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }

        int[][] v = new int[4][];
        int[][] f = {{3,4,6},{5,6},{5,7,2,11,12}};

        for(int i=0;i<f.length;i++) {
            for(int j=0;j<f[i].length;j++) {
                System.out.print(f[i][j]+" ");
            }
            System.out.println();
        }

        ArrayList al = new ArrayList<>(); // 20
        al.add(1);
        al.add("adfgadf");
        al.add(new Object());

        int pp = (int)al.get(1);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(55);
        list.add("333");



    }
}
