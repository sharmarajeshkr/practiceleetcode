package com.sharma.leetcode;

import java.util.*;
import java.util.stream.Stream;

public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        Richest_Customer_Wealth rc = new Richest_Customer_Wealth();
        int[][] acc = { {1,5},{7,3},{3,5}};
        int val = rc.maximumWealth(acc);
        System.out.println(val);
    }
    public int maximumWealth(int[][] accounts) {
        Map<Integer,Integer> accAmount = new HashMap<Integer,Integer>();
        for(int i = 0; i <accounts.length; i++){
            int temp = 0;
            for(int j = 0; j <accounts[i].length; j++){
                temp += accounts[i][j];
            }
            accAmount.put(i,temp);
        }
        return Collections.max(accAmount.values());
    }

//    public int findMax(Map<Integer,Integer> map){
//
//    }

}
