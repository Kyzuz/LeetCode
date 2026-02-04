package a_Easy.LCP;
import java.util.Arrays;

public class TestRunner {
   public static void main(String[] args) {
      // Instantiate your solution
      Solution sol = new Solution();

      // Define test cases
      String[][] inputs = { {"flower", "flow", "flight"},{"dog", "racecar", "car"}, {"a"}, {"ab", "a"} };
      String[] expected = { "fl", "", "a", "a" };

      // Loop through tests
      for (int i = 0; i < inputs.length; i++) {
         String result = sol.longestCommonPrefix(inputs[i]);
         
         if (result.equals(expected[i])) {
            System.out.println("✅ PASS: " + Arrays.toString(inputs[i]) + " -> " + result);
         } else {
            System.out.println("❌ FAIL: " + Arrays.toString(inputs[i]) + " -> Expected " + expected[i] + ", got " + result);
         }
      }
   }
}
