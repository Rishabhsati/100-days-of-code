package Recursion;

import java.util.Scanner;

public class TowerOfHanoi {
    static void towerOfHanoi(int n , char source , char destination , char temp){
        if(n==0) return;
        towerOfHanoi(n-1,source,temp,destination);
        System.out.println("Moving ring " + n + " from " + source + " to " + destination);
        towerOfHanoi(n-1,temp,destination,source);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n,'A','B','C');
    }
}
