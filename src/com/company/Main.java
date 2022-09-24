package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int i=0;i<testCase;i++){
            int fiveRupeeCoin = scan.nextInt();
            int tenRupeeCoin = scan.nextInt();
            int chocolates = scan.nextInt();

            System.out.println((5*fiveRupeeCoin + 10*tenRupeeCoin) / chocolates);
        }
    }
}
