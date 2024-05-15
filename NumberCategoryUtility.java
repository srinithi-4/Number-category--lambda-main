package day3;

public class NumberCategoryUtility {

		    public static NumberCategory checkAmicable() {
	        return (num1, num2) -> {
	            int sumDivisorsNum1 = sumDivisors(num1);
	            int sumDivisorsNum2 = sumDivisors(num2);

	            return sumDivisorsNum1 == num2 && sumDivisorsNum2 == num1;
	        };
	    }

	    public static NumberCategory checkPalindrome() {
	        return (num1, num2) -> isPalindrome(num1 * num2);
	    }

	    private static int sumDivisors(int num) {
	        int sum = 0;
	        for (int i = 1; i <= num / 2; i++) {
	            if (num % i == 0) {
	                sum += i;
	            }
	        }
	        return sum;
	    }

	    private static boolean isPalindrome(int num) {
	        int reverse = 0;
	        int original = num;
	        while (num != 0) {
	            reverse = reverse * 10 + num % 10;
	            num /= 10;
	        }
	        return original == reverse;
	    }
	}

