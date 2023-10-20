package main;
import logic.Country;
import logic.State;
import logic.UntouchedTerritory;
import logic.Type.*;

public class Main{
  public static void main(String[] args) {
    //There are UntouchedTerritories
    //that include states of nomadland(The Untouched)
    //and also 3 player territories
    //with their besondere states 
    //new Country("the_UnTouched");
    UntouchedTerritory Tiata=new UntouchedTerritory("White");
    Country USA = new Country(new Adequate( "Blue"));
    State California = new State(20,USA);
    Country Iran = new Country(new Resistant("Red"));
    State Tehran = new State(19,Iran);
    Tehran.fight(California);
    Iran.print();
  }
}