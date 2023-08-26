package com.HackerRank.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader =new InputStreamReader(System.in);
        BufferedReader bufferedReader =new BufferedReader(inputStreamReader);

        int number = Integer.parseInt(bufferedReader.readLine());
        int number1 =Integer.parseInt(bufferedReader.readLine());
        int number2 = Integer.parseInt(bufferedReader.readLine());

        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);

    }
}
