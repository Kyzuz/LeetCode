public class Solution {
   public int romanToInt(String s) {
      int len = s.length();
      int val1=0, val2=0;
      int tot=0;

      for (int i=len-1; i >= 0; i--) {
 
         // Switch case
         switch (s.charAt(i)) {
            case 'I': val1 = 1; break;
            case 'V': val1 = 5; break;
            case 'X': val1 = 10; break;
            case 'L': val1 = 50; break;
            case 'C': val1 = 100; break;
            case 'D': val1 = 500; break;
            case 'M': val1 = 1000; break;
            default: return 0;
         }

         // Logique 
         if ( val1 >= val2 ) {
            tot += val1;
         } else {
            tot -= val1;
         }
         val2=val1;
      }
   return tot;    
   }

   public static void main(String[] args) {
      Solution solution = new Solution();
      System.out.println(solution.romanToInt("XIV"));
   }
}
