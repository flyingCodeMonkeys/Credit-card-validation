package org.example;

public class Main {
    public static void main(String[] args) {
        Luhn l = new Luhn();
        //Sample credit card numbers
        String card1 = "1234567822134455";
        String card2 = "5256080628159586";

        //System.out.println("Card1 is "+l.isValid(card1));
        System.out.println("Card2 is "+l.isValid(card2));

    }
}