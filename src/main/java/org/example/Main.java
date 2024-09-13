package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("-------------------------------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));



    }
    public static boolean isPalindrome(int number){
        String numberString = String.valueOf(number);
        numberString = numberString.replaceAll("-","");
        int n=numberString.length();
        for (int i = 0; i < n/2; i++)
            if (numberString.charAt(i) != numberString.charAt(n-i-1))
                return false;

        return true;
    }
    public static boolean isPerfectNumber(int number){
        if (number == 1){
            return false;
        }
        int sum = 1;
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        if (sum == number){
            return true;
        }
        return false;
    }
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }


        String[] numberWords = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };


        String numberStr = Integer.toString(number);
        StringBuilder result = new StringBuilder();


        for (char digit : numberStr.toCharArray()) {
            if (digit == '-') {
                continue;
            }
            result.append(numberWords[digit - '0']).append(" ");
        }


        return result.toString().trim();
    }
}
