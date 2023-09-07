This is an implementation of the Luhn algorithm for credit card validation.
For details about the algorithm, see: https://www.creditcardvalidator.org/articles/luhn-algorithm

Steps:
-Starting from rightmost digit, move left and double the value of every second digit; if doubled number is greater than 9 (e.g., 7 × 2 = 14), then subtract 9 from the product (e.g., 14: 14 - 9 = 5). <br>  
-Sum of all the digits in the newly calculated number. <br>  
-If the sum is divisible by 10, then it is considered valid. <br>  

-To get the checksum, Multiply the sum by 9, the Luhn check digit is the rightmost digit of the result (e.g, the result modulo 10).

Note that the Luhn algorithm is good for catching most single digit errors. 
There are a few limitations to the algorithm as it does not check if the length is 16 digits nor can it check for swapped digits.
It provides a quick sanity check for credit card entries.
