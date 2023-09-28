package tests;

import org.junit.Test;
import ratings.ProblemSet;

import java.util.*;

import static org.junit.Assert.*;

public class TestProblemSet {

    // TODO: Write testing for all 3 methods of the ratings.ProblemSet class

    @Test
    public void testDoubles() {
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(6.5);
        doubles.add(6.5);
        doubles.add(8.5);
        doubles.add(8.5);

        // [1.0,2.0,3.0] returns 2.0
        // [-5.0,5.0] returns 0.0
        // [6.5,6.5,8.5,8.5] returns 7.5
        // [] returns 0.0
        assertTrue(compareDoubles(ProblemSet.average(doubles), 7.5));
        doubles.clear();
        doubles.add(1.0);
        doubles.add(2.0);
        doubles.add(3.0);
        assertTrue(compareDoubles(ProblemSet.average(doubles), 2.0));
        doubles.clear();
        doubles.add(-5.0);
        doubles.add(5.0);
        assertTrue(compareDoubles(ProblemSet.average(doubles), 0.0));
        doubles.clear();
        assertTrue(compareDoubles(ProblemSet.average(doubles), 0.0));
        doubles.add(5.0);
        assertTrue(compareDoubles(ProblemSet.average(doubles), 5.0));
    }

    @Test
    public void testSum() {
        assertTrue(ProblemSet.sumOfDigits(123) == 6);
        assertTrue(ProblemSet.sumOfDigits(57) == 12);
        assertTrue(ProblemSet.sumOfDigits(-36) == 9);
    }

    @Test
    public void testEmptyKeySet() {
        assertEquals("", ProblemSet.bestKey(new HashMap<>()));
    }

    @Test
    public void testKeySet() {
        HashMap<String, Integer> keyMap = new HashMap<>();
        keyMap.put("CSE", 100);
        keyMap.put("MTH", 90);
        keyMap.put("MGT", 10);
        assertEquals("CSE", ProblemSet.bestKey(keyMap));
        keyMap.clear();
        keyMap.put("cat", 5);
        keyMap.put("dog", 5);
        keyMap.put("fox", 4);
        assertTrue(ProblemSet.bestKey(keyMap).equals("cat") || ProblemSet.bestKey(keyMap).equals("dog"));
        keyMap.clear();
        keyMap.put("CSE", -3);
        keyMap.put("MTH", -4);
        keyMap.put("MGT", -5);
        assertEquals("CSE", ProblemSet.bestKey(keyMap));
    }

    public boolean compareDoubles(Double a, Double b) {
        double epsilon = 0.0001;
        return Math.abs(Math.max(a, b) - Math.min(a, b)) < epsilon;
    }
}