package logic.Type;

import logic.Country;
import logic.State;

public class Savage extends Country implements Runnable{

  public Savage(String color) {
    super(color);
    new State(25, null);
  }

  @Override
  public void run() {
    throw new UnsupportedOperationException("Unimplemented method 'run'");
  }
  
}
