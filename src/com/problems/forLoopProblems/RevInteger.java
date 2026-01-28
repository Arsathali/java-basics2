package com.problems.forLoopProblems;

import java.util.Scanner;

public class RevInteger {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;

        for(int i=0; num > 0; i++){

            int d = num%10;
            rev = rev*10+d;
            num/=10;
        }

        System.out.println(rev);
    }
}
