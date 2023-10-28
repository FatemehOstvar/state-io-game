package logic;

public class State {
  int soldiersOfThisState;//holds the number of soldiers that are now guarding the state 
  boolean hasBeenFought;
  private Country country;
  public Country getCountry() {
    return country;
  }

  private String name;
  public String getName() {
    return name;
  }
  public State(String name,int Soldiers,Country country) {
    soldiersOfThisState=Soldiers;
    setCountry(country);
    this.name=name;
  }
  public void setCountry(Country country) {
    this.country=country;
    country.states.add(this);
  }
  //changing the color also 
  public void fight(State state) {
    int x= soldiersOfThisState;
    state.hasBeenFought=true;
      //if statement for checking if the fight is won.
      if (x>state.getSoldiersOfThisState()) {
        //conquers the land
        conquer(state, x);
      }else if(state.country==getCountry()){
        state.setSoldiersOfThisState(x+soldiersOfThisState);
        soldiersOfThisState=0;
      }else{
        state.setSoldiersOfThisState(x-soldiersOfThisState);
        soldiersOfThisState=0;}
    
  }
  public int getSoldiersOfThisState() {
    return soldiersOfThisState;
  }

  public void conquer(State state, int x) {
    state.country.states.remove(state);
    soldiersOfThisState-=x;
    state.setSoldiersOfThisState(x-state.getSoldiersOfThisState());
    state.setCountry(country);
  }

  public void setSoldiersOfThisState(int soldiersOfThisState) {
    this.soldiersOfThisState = soldiersOfThisState;
  }
}
