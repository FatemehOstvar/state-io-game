package logic;

public class State {
  private int soldiersOfThisState;//holds the number of soldiers that are now guarding the state 
  private Country country;
  public State(int Soldiers,Country country) {
    soldiersOfThisState=Soldiers;
    setCountry(country);
  }
  public void setCountry(Country country) {
    this.country=country;
    country.states.add(this);
  }
  //changing the color also 
  public void fight(State state) {
    int x= soldiersOfThisState;
      //if statement for checking if the fight is won.
      if (x>state.getSoldiersOfThisState()) {
        //conquers the land
        state.country.states.remove(state);
        soldiersOfThisState-=x;
        state.setSoldiersOfThisState(x-state.getSoldiersOfThisState());
        state.setCountry(country);
      }else{
        state.setSoldiersOfThisState(x-soldiersOfThisState);
        soldiersOfThisState=0;
      }
    
  }
  public int getSoldiersOfThisState() {
    return soldiersOfThisState;
  }

  public void setSoldiersOfThisState(int soldiersOfThisState) {
    this.soldiersOfThisState = soldiersOfThisState;
  }
}
