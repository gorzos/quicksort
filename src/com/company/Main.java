package com.company;

public class Main {

    public static int []sort(int []mas, int start, int end) {
        if(start >= end) return mas;
        int i = start;
        int j = end;

        int op = i-(i-j)/2;

        while (i < j){
            while ((i < op) && (mas[i] <= mas[op])) i++;
            while ((j > op) && (mas[j] >= mas[op])) j--;

            if (i < j){
                int temp = mas[i];
                mas[i] = mas[j];
                mas[j] = temp;

                if(i == op)op = j;
                else if(j == op) op = i;
            }

        }
        sort(mas, start, op);
        sort(mas, op+1, end);

        return mas;

    }

    public static void main(String[] args) {
        int[] mas = new int[10];
        for(int i = 0; i < mas.length; i++){
            mas[i] = (int) Math.round(Math.random() * 100);
            System.out.print(mas[i] + " ");

        }
        mas = sort(mas, 0, mas.length-1);

        System.out.println();
        for (int i = 0; i < mas.length; i++) System.out.println(mas[i] + " ");

    }
}
