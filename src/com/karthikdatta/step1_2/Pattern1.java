package com.karthikdatta.step1_2;

// Step 1.2 Build up logical thinking
// https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/
// https://takeuforward.org/pattern/pattern-1-rectangular-star-pattern/

import java.util.Scanner;

// Rectangular start pattern
public class Pattern1 {

    public static void printPattern(int num){
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printPattern(num);
    }
}
