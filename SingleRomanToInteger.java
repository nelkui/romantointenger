import java.util.Map;
import java.util.HashMap;

public class SingleRomanToInteger {
    public int romanToSingleInt(String s) {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        int length = s.length();
        for (int i = length - 1; i >= 0; i--) {
            int curValue = romanNumerals.get(s.charAt(i));

            if (curValue < prevValue) {
                result -= curValue;
            } else {
                result += curValue;
            }

            prevValue = curValue;
        }

        return result;
    }
}

