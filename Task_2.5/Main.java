package com.company;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Мама", "Мыла", "Раму"};
        for (int a = 0; a < arr.length; a++) {
            for (int b = 0; b < arr.length; b++) {
                for (int c = 0; c < arr.length; c++) {
                    if (a == b)
                        continue;
                    if (c == a)
                        continue;
                    if (c == b)
                        continue;
                    System.out.print(arr[a]);
                    System.out.print(arr[b]);
                    System.out.println(arr[c]);
                }
            }
        }
    }
}
