package Recursion;

import java.util.*;
import java.util.Scanner;

class Main{
    static void solve(String s , String selected){
        if(s.isEmpty()){
            System.out.print(selected+" ");
            return;
        }
        char ch = s.charAt(0);
        solve(s.substring(1),selected+ch);
        solve(s.substring(1),selected);
    }
    static void printSubsequence(String s) {
        //Write your code here
        solve(s,"");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubsequence(s);
    }
}