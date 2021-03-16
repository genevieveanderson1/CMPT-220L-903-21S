package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(sum(array));
    }
    static int sum(int[] array){
        int total = 0;
                for (int number: array) {
                    total += number;
                }
                return total;
    }
}
