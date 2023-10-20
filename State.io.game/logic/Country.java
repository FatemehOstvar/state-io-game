package logic;
import java.util.ArrayList;

import logic.Type.Adequate;
import logic.Type.Fighter;
import logic.Type.Resistant;
import logic.Type.Savage;
import logic.Type.Shooter;
public class Country {
  ArrayList<State> states=new ArrayList<>();
  private String color;
  public Country(String color) {
    this.color=color;
  }
  public Country(Fighter fighter) {}
  public Country(Savage savage) {}
  public Country(Shooter shooter) {}
  public Country(Resistant resistant) {}
  public Country(Adequate adequate){}
  
  public void print() {
    for (State state : states) {
      System.out.println(state.getSoldiersOfThisState());
    }
  }
}
