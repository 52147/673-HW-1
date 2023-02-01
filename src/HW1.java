import java.util.ArrayList;
import java.util.List;

public class HW1 {
    // Q1:
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    // Q2:
    public static void multiplication(int n) {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.println(i * j);
            }
            System.out.println();
        }
    }

    // Q3:
    public static boolean isPalindrome(String input) {
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Q4:
    public static List<Character> combineTwoList(List<Character> list1, List<Character> list2) {
        List<Character> combination = new ArrayList<>();
        int length = Math.max(list1.size(), list2.size());
        for (int i = 0; i < length; i++) {
            if (i < list1.size()) {
                combination.add(list1.get(i));
            }
            if (i < list2.size()) {
                combination.add(list2.get(i));
            }
        }
        return combination;
    }

    // Q5:
    public static int Fibonacci(int n) {
        int sum = 2;
        int dp[] = new int[101];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= 100; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            sum = sum + dp[i];
        }
        return sum;
    }

    // Q6:
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Q1 test:
        printHelloWorld();

        // Q2 test:
        multiplication(12);

        // Q3 test:
        String input = "abccba";
        System.out.println(isPalindrome(input));

        // Q4 test:
        List<Character> list1 = new ArrayList<>();
        list1.add('a');
        list1.add('b');
        list1.add('c');

        List<Character> list2 = new ArrayList<>();
        list2.add('1');
        list2.add('2');
        list2.add('3');

        System.out.println(combineTwoList(list1, list2));

        // Q5 test:
        System.out.println(Fibonacci(100));

        // Q6 test:
        int year = 1000;
        System.out.println(year + " is a leap year: " + isLeapYear(year));
    }
}

