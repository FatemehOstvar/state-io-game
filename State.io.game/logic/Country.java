package logic;
import java.util.ArrayList;
public class Country {
  ArrayList<State> states=new ArrayList<>();
  private String color;//WE DON'T NEED THIS FACTOR DECLARED.
  public Country(String color) {
    this.color=color;
  }
  public void print() {
    for (State state : states) {
      System.out.println(state.getName()+" has "+state.getSoldiersOfThisState()+" Soldiers");
    }
  }
  public int score() {
    int score=0;
    for (State state : states) {
      score+=state.getSoldiersOfThisState();
    }
    return score;
  }
}
