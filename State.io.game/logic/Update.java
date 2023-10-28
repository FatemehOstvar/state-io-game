package logic;

public class Update {
  public static void update(State state) {
    state.setSoldiersOfThisState(state.soldiersOfThisState+1);
  }
}
