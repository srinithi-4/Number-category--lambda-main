package day3;

public class UserInterface {


    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        NumberCategory amicableChecker = NumberCategoryUtility.checkAmicable();
        boolean areAmicable = amicableChecker.checkNumberCategory(num1, num2);
        
        NumberCategory palindromeChecker = NumberCategoryUtility.checkPalindrome();
        boolean isPalindrome = palindromeChecker.checkNumberCategory(num1, num2);
        
        if (areAmicable) {
            System.out.println(num1 + " and " + num2 + " are amicable numbers");
        } else {
            System.out.println(num1 + " and " + num2 + " are not amicable numbers");
        }
        
        if (isPalindrome) {
            System.out.println("Their Product " + num1 * num2 + " does produce a Palindrome");
        } else {
            System.out.println("Their Product " + num1 * num2 + " does not produce a Palindrome");
        }
    }
}