package com.karthikdatta.step1_2;

// Step 1.2 Build up logical thinking
// https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/
// https://takeuforward.org/pattern/pattern-2-right-angled-triangle-pattern/

import java.util.Scanner;

//Right-angled triangle pattern
public class Pattern2 {

    public static void printPattern(int num){
        for(int i=0; i<num; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
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
