package logic.Type;

import logic.Country;
import logic.State;

public class Adequate extends Country implements Runnable{
  public Adequate(String color) {
    super(color);
  }
  public Adequate(String color,String initIndicator) {
    super(color);
    new State(10,null);
  }
  @Override
  public void run() {
    
  }
  
}
