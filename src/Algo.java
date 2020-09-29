package com.company;

public class Main {
    public static int howManyGames(int priceOfGames, int discountAfterPurchase, int minimumSalePrice, int spendingMoney) {
        // Return the number of games you can buy
        int howManyGames = 0;
        int newPrice = priceOfGames;
        while(spendingMoney >= minimumSalePrice)
        {
            spendingMoney = spendingMoney - newPrice;
            newPrice -= discountAfterPurchase;
            if(newPrice <= minimumSalePrice){
                newPrice = minimumSalePrice;
            }
            howManyGames++;
        }
        return howManyGames;
    }
    public static void main(String[] args) {
        // write your code here 20 3 6 80 answer 6
        System.out.println(howManyGames(20,3,6,80));
        System.out.println(howManyGames(20, 3, 6, 85));
    }
}