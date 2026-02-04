package a_Easy.LCP;
public class Solution {
   public String longestCommonPrefix(String[] strs) {

      String myStr="";
      int lenTab = strs.length;
      
      // --- Edge case ---
      if (strs.length == 0) {
         return myStr;
      } 
      // Si qu'un seul mot, retourner celui-ci
      else if (strs.length == 1) {
         return strs[0];
      }
   
      // Trouve le mot le plus court
      // Doit empêcher que le plus court soit de taille 0
      int min=200; // Longueur maximale permise selon la description
      int tmp;
      for (int i=0; i < lenTab ; i++) {
         tmp = strs[i].length();
         if (tmp < min) {
            min = tmp;
         }
      }
      
      // Boucle sur les lettres du mot le plus court
      int cpt=0;
      for (int j=0; j < min; j++) {

         // Boucle sur les mots dans le tableau strs
         for (int i = 1; i < lenTab; i++) {
            
            // Edge case: si un mot est vide, forcément le LCP est 0
            if (strs[i].length() == 0) {
               return myStr;
            }
            // Dès qu'un caractère n'est plus équivalent, on a trouvé le LCP
            if (strs[0].charAt(cpt) != strs[i].charAt(cpt)) {
               return myStr;
            }
         }
         myStr += strs[0].charAt(cpt++);
      }
      return myStr;
   }
}