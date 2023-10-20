package logic.Type;
import logic.Country;
import logic.State;
public class Resistant extends Country implements Runnable{

  public Resistant(String color) {
    super(color);
  }
  public Resistant(String color,String initIndicator) {
    super(color);
    new State(15, null);
  }
  @Override
  public void run() {
    throw new UnsupportedOperationException("Unimplemented method 'run'");
  }
  
}
