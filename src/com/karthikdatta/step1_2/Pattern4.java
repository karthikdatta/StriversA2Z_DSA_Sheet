package com.karthikdatta.step1_2;

// Step 1.2 Build up logical thinking
// https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/
// https://takeuforward.org/pattern/pattern-4-right-angled-number-pyramid-ii/

import java.util.Scanner;

// //Right-angled number pyramid - II
public class Pattern4 {

    public static void printPattern(int num){
        for(int i=0; i<num; i++){
            for(int j=0; j<=i; j++){
                System.out.print(i+1 + " ");
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
