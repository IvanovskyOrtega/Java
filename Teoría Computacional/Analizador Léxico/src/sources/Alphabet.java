/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

import java.util.ArrayList;
import java.util.Arrays;
  
  public class Alphabet {
      ArrayList<Character> alphabet;
      public Alphabet() {
        alphabet = new ArrayList<>(Arrays.asList('0','1','2','3','4','5','6','7','8','9','+','-','E','x','A','B','C','D','E','F','.'));
      }
  }