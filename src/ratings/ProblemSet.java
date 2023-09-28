package ratings;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class ProblemSet {


    public static double average(ArrayList<Double> numbers) {
        if (numbers.isEmpty()) return 0.0;
        double total = 0.0;
        for (double number : numbers) {
            total += number;
        }

        if (numbers.size() == 1) return numbers.get(0);
        return total / (double) numbers.size();

        // TODO: Implement this method to return the average of all the numbers in the input ArrayList
        //       If the ArrayList is empty, return 0.0
        //
        // Examples
        // [1.0,2.0,3.0] returns 2.0
        // [-5.0,5.0] returns 0.0
        // [6.5,6.5,8.5,8.5] returns 7.5
        // [] returns 0.0
    }

    public static int sumOfDigits(int digits) {
        String number = String.valueOf(digits);
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Character.digit(number.charAt(i), 10);
            if (digit == -1) {
                continue;
            }
            System.out.println(digit);
            sum += digit;

        }
        return sum;
    }


    // TODO: Write a public static method named sumOfDigits that takes an int as a parameter and
    //       returns the sum of the digits of the input as an int
    //
    // Examples
    // 123 returns 6
    // 57 returns 12
    // -36 returns 9

    public static String bestKey(HashMap<String, Integer> keyMap) {
        //if (keyMap.isEmpty()) return "";
        String largest = "";
        for (String key : keyMap.keySet()) {
            if (keyMap.get(key).compareTo(keyMap.getOrDefault(largest, Integer.MIN_VALUE)) < 0) continue;
            largest = key;
        }
        return largest;
    }

    // TODO: Write a public static method named bestKey that takes a HashMap of String to Integer
    //       as a parameter and returns a key mapping to the largest Integer. Ties can be broken arbitrarily.
    //       If the HashMap is empty, return the empty String
    //
    // Examples
    // {"CSE": 100, "MTH": 90, "MGT": 10} returns "CSE"
    // {"cat": 5, "dog": 5, "fox": 4} can return either "cat" or "dog"
    // {} returns ""
}
