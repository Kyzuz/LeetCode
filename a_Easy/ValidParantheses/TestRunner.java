package a_Easy.ValidParantheses;

public class TestRunner {
   public static void main(String[] args) {
      // Instantiate your solution
      Solution sol = new Solution();

      // Define test cases
      String[] inputs = {"III", "IV", "IX", "LVIII", "MCMXCIV"};
      int[] expected = {3, 4, 9, 58, 1994};

      // Loop through tests
      for (int i = 0; i < inputs.length; i++) {
         int result = sol.romanToInt(inputs[i]);
         
         if (result == expected[i]) {
            System.out.println("✅ PASS: " + inputs[i] + " -> " + result);
         } else {
            System.out.println("❌ FAIL: " + inputs[i] + " -> Expected " + expected[i] + ", got " + result);
         }
      }
   }
}
   
