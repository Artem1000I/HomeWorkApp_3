package org.example;

import java.util.Arrays;

public class HomeWork_3 {
    public static void main(String[] args){

        int [] zd_one ={1,0,1,0,0,1,1,0,0,1,0};


        System.out.println("Exercise1");
        exercise1(zd_one);

        System.out.println("Exercise2");
        exercise2 (100);

        int [] zd_fre ={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Exercise3");
        exercise3(zd_fre );

        System.out.println("Exercise4");
        exercise4();

        System.out.println("Exercise5");
        exercise5(7,10);




    }
    /*Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
            типа int длиной len, каждая ячейка которого равна initialValue;*/
    private static void exercise5(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i]=initialValue;
            System.out.println("["+i+"]" + array[i]);
        }

    }


    /*Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
    public static void exercise1(int[] zd_one){
        for (int i = 0; i < zd_one.length; i++) {
            zd_one[i] = (zd_one[i]>0)? 0: 1;
            System.out.println(zd_one[i]+" ");

        }
    }
    /*Задать пустой целочисленный массив длиной 100.
      С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100
    */
    public static void exercise2(int size ){
        int[] Arr = new int[size];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] =i +1;
            System.out.println(Arr[i]);
        }
    }

    /* Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     и числа меньшие 6 умножить на 2;*/
    public static void exercise3 (int[] zd_fre){
        for (int i = 0; i < zd_fre.length; i++) {
            if (zd_fre[i]<6){
                zd_fre[i] = zd_fre[i] * 2;
            }
            System.out.println(zd_fre[i]+" ");

        }
    }

    /*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    */

    public static void exercise4() {

        int n = 4;
        int [][] arr= new int [n][n];
        for (int i =0; i< arr.length; i++){
            for (int j=0; j<arr.length; n= arr[i].length, j++, n--){
                if (i==j|| i==n-j ){
                    arr[i][j]=1;
                    System.out.println("на позиции  i номер " + i + " и на позиции j номер " + j + " число" + arr[i][j]);}

                else {
                    arr[i][j]=0;
                }
            }
        }

    }

}