package logic.Type;

import logic.Country;
import logic.State;

public class Shooter extends Country implements Runnable{

  public Shooter(String color) {
    super(color);
    new State(15, null);
  }

  @Override
  public void run() {
    throw new UnsupportedOperationException("Unimplemented method 'run'");
  }
 
}
