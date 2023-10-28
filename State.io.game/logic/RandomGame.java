package logic;

import java.util.ArrayList;
import java.util.Collections;

public class RandomGame {
  ArrayList<Integer> numbers = new ArrayList<>();
  
  RandomGame(){
    int n = 10;
      for (int i = 1; i <= n; i++) {
          numbers.add(i);
      }

      Collections.shuffle(numbers);
      String s;
      ArrayList<String> ss = new ArrayList<>();
      for (int i = 0; i < 10; i++) {
      s=Integer.toString(numbers.get(i));
      ss.add(s);
      }
      new GamePanel(ss);
}
  public static void main(String[] args) {
    new RandomGame();
  }
}
