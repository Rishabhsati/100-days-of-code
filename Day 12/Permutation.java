//#INPUT 1
// "abc" = abc acb bac bca cab cba

import java.util.*;
public class Permutation {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String s=scn.nextLine();
            String asf="";
            permutationPrint(s,asf);
        }
        public static void permutationPrint(String ques, String asf)
        {
            // your code here
            if(ques.isEmpty()){
                System.out.print(asf+" ");
                return;
            }

            for(int i=0;i<ques.length();i++){
                char ch = ques.charAt(i);
                String f = ques.substring(0,i);
                String s = ques.substring(i+1);
                permutationPrint(f+s,asf+ch);
                // permutationPrint(ques.substring(0,i)+ques.substring(i+1),asf+ques.charAt(i));
            }
        }
}
