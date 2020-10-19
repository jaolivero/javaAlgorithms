package com.AlgorithmsJava;

public class Solvingproblems {
    static int howManyGames(int priceOfGame, int discount, int minimumSalePrice, int spendingMoney) {
        int howManyGames = 0;
        while(spendingMoney>= priceOfGame){
            howManyGames++;
            spendingMoney -= priceOfGame;
            priceOfGame = Math.max(priceOfGame - discount, minimumSalePrice);
        }
        return howManyGames;
    }

}
