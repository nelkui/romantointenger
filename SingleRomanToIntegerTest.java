public class SingleRomanToIntegerTest {
    public static void main(String[] args) {
        SingleRomanToInteger converter = new SingleRomanToInteger();

        // Test case 1: Roman numeral "III" should return 3
        int result1 = converter.romanToSingleInt("III");
        System.out.println("Test Case 1: Result is " + result1 + " (Expected: 3)");

        // Test case 2: Roman numeral "IX" should return 9
        int result2 = converter.romanToSingleInt("IX");
        System.out.println("Test Case 2: Result is " + result2 + " (Expected: 9)");

        // Test case 3: Roman numeral "LVIII" should return 58
        int result3 = converter.romanToSingleInt("LVIII");
        System.out.println("Test Case 3: Result is " + result3 + " (Expected: 58)");

        // Test case 4: Roman numeral "MCMXCIV" should return 1994
        int result4 = converter.romanToSingleInt("MCMXCIV");
        System.out.println("Test Case 4: Result is " + result4 + " (Expected: 1994)");
    }
}
