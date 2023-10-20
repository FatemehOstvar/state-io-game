package logic.Type;

import logic.Country;
import logic.State;

public class Fighter extends Country implements Runnable{

  public Fighter(String color) {
    super(color);
    new State(20,null);
  }

  @Override
  public void run() {
    throw new UnsupportedOperationException("Unimplemented method 'run'");
  }
  
}