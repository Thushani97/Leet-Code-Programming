package com.companyEX;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class TimeToSell {
    public int maxProfit(int[] prices) {

        // This getting  a memory out error
//        List<Integer> maxProfit = new ArrayList<>();
//        for (int i = 0; i < prices.length-1; i++) {
//            for (int j = i; j < prices.length-1; j++) {
//                if (prices[i]<prices[j+1]){
//                    maxProfit.add(prices[j+1]-prices[i]);
//                }else{
//                    maxProfit.add(0);
//                }
//            }
//
//        }
////        Optional<Integer> max = maxProfit.stream().max(Integer::compareTo);
////        int maxNo = max.orElseThrow();
//        int maxNo=0;
//        for (int n:maxProfit) {
//            if (n>maxNo){
//                maxNo=n;
//            }
//        }
//        return maxNo;

        if (prices == null || prices.length <= 1) {
            return 0; // No transactions can be made with less than two prices
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            // Update the minimum price if a lower price is encountered
            minPrice = Math.min(minPrice, prices[i]);

            // Update the maximum profit if selling at the current price is more profitable
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }

        return maxProfit;
    }
}
public class BestTimeToSell {
    public static void main(String[] args){
        TimeToSell  s1 = new TimeToSell();
        int re= s1.maxProfit(new int[]{19,2,7,18,5});
        System.out.println(re);
    }
}