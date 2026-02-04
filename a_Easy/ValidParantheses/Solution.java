package a_Easy.ValidParantheses;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class Solution {
   public boolean isValid(String s) {

      Stack<Character> stack = new Stack<>();
      List<Character> opening = new ArrayList<>(Arrays.asList('(', '[', '{'));
      List<Character> closing = new ArrayList<>(Arrays.asList(')', ']', '}'));
      
      char last; char current;
      int len = s.length();

      // Edge case
      if (len == 0 || len == 1) return false;

      for (int i=0 ; i < len ; i++) {
         current = s.charAt(i);

         // Opening, on ajoute
         if (opening.contains(current)) {
            stack.push(current);
         }
         // Closing, on vérifie
         else if (closing.contains(current)) {

            // Si la pile est vide avec une paranthèse fermante, false
            if (stack.empty()) {
               return false;

            // Sinon, on vérifie la validité   
            } else {
               last = stack.peek();
               switch (last) {
                  case '(':
                     if (current != ')') return false;
                     break;
                  case '[':
                     if (current != ']') return false;
                     break;
                  case '{':
                     if (current != '}') return false;
                     break;
               }
               stack.pop();
            }              
         }
      }  
   return stack.empty();
   }   
}
