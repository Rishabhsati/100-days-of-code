package Recursion;

import java.util.ArrayList;

public class CoinPermutation {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7};
        boolean[] used = new boolean[arr.length];
        coin(arr,12,0,"",used);
    }
    static void coin(int[] coins,int amount,int sum,String ans,boolean[] used){
        if(sum==amount){
            System.out.println(ans);
        }
        if(sum>amount){
            return;
        }
        for(int i=0;i<coins.length;i++){
            if(!used[i]){
                used[i]=true;
                coin(coins,amount,sum+coins[i],ans+coins[i]+" ",used);
                used[i]=false;
            }
        }
    }
}
