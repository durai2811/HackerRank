package com.HackerRank.task3;
import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int n = scanner.nextInt();
        boolean solution=new Solution().isOdd(n);
        if(n % 2 != 0)
            System.out.println("Weird");
        else if(solution && n>20)
            System.out.println("Not Weird");
        else if(solution && n>=2 && n<=5)
            System.out.println("Not Weird");
        else if(solution && n>=6 && n<=20)
            System.out.println("Weird");
        scanner.close();
    }
    private boolean isOdd(int n){
        if(n % 2 ==0)
            return true;
        else return false;
    }
}

