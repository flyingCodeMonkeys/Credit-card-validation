package org.example;

public class Luhn {

    public boolean isValid(String cardNumber){
        int n = cardNumber.length();
        int sum = 0;

        for (int i = n-1; i >= 0; i--) {
            int digit = Integer.parseInt(cardNumber.substring(i, i+1));
            if(i % 2 == 0){
                int temp = digit * 2;
                if(temp > 9){
                    temp = temp - 9;
                }
                digit = temp;
            }
            sum += digit;
        }

        return sum % 10 == 0;
    }

}
