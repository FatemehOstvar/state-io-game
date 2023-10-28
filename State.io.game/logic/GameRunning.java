package logic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

import main.Menu;


public class GameRunning{
  ArrayList<State> listOfStates = new ArrayList<>();
  public static void main(String[] args) throws InterruptedException, IOException {
    new GameRunning().executeRandomGame();
  }
  public void executeRandomGame() throws InterruptedException, IOException {
    Scanner s = new Scanner(System.in);
    System.out.println("What color do you want to have?");
    Country player = new Country(s.next());//we ought to be able to change the color... but we don't need to do it this way
    State playerS = new State("playerS",10,player);
    new Every3Secs().update(playerS);
    listOfStates.add(playerS);

    Country adequateUC = new Country("WHITE");
    State AU1 = new State("AU1",10,adequateUC);
    new Every3Secs().update(AU1);
    listOfStates.add(AU1);
    State AU2 = new State("AU2",10,adequateUC);
    new Every3Secs().update(AU2);
    listOfStates.add(AU2);
    
    
    Country fighterUC = new Country("WHITE");
    State FU1 = new State("FU1",20,fighterUC);
    new Every2Secs().update(FU1);
    listOfStates.add(FU1);
    State FU2 = new State("FU2",20,fighterUC);
    new Every2Secs().update(FU2);
    listOfStates.add(FU2);

    Country resistantUC = new Country("WHITE");
    State RU1 = new State("RU1",15,resistantUC);
    new Every2Secs().update(RU1);
    listOfStates.add(RU1);
    State RU2 = new State("RU2",15,resistantUC);
    new Every2Secs().update(RU2);
    listOfStates.add(RU2);

    
    Country shooterUC = new Country("WHITE");
    State SU1 = new State("SU1",15,shooterUC);
    new Every1o5Secs().update(SU1,false);
    listOfStates.add(SU1);
    State SU2 = new State("SU2",15,shooterUC);
    new Every1o5Secs().update(SU2,SU2.hasBeenFought);
    listOfStates.add(SU2);
    State SU3 = new State("SU3",15,shooterUC);
    new Every1o5Secs().update(SU3,false);
    listOfStates.add(SU3);

  while (true) {
    for (int i = 0; i < 5; i++) {
      System.out.println("");
    }
    System.out.print("Slider : ");
    for (int i = 0; i < player.states.size(); i++) {
      System.out.print("//");
    }
    for (int i = 0; i < adequateUC.states.size(); i++) {
      System.out.print("*");
    }
    for (int i = 0; i < fighterUC.states.size(); i++) {
      System.out.print("+");
    }
    for (int i = 0; i < shooterUC.states.size(); i++) {
      System.out.print("!");
    }
    for (int i = 0; i < resistantUC.states.size(); i++) {
      System.out.print("#");
    }
    System.out.println("\n\nYour Score : "+playerS.getCountry().score());
    System.out.println("");
    System.out.println("===== The List Of The Countries s State Soldiers =====");
    System.out.println("The Player");player.print();
    System.out.println("============================================");
    System.out.println("The Adequate");adequateUC.print();
    System.out.println("============================================");
    System.out.println("The Fighter");fighterUC.print();
    System.out.println("============================================");
    System.out.println("The Shooter");shooterUC.print();
    System.out.println("============================================");
    System.out.println("The Resistant");resistantUC.print();
    
    System.out.println("\nEnter The state you want to dispach soldiers from");
    String x1 = s.next();
    System.out.println("Enter The state you want to send soldiers to");
    String x2 = s.next();
    State state1 = null;
    State state2 = null;
    for (int i = 0; i < 10; i++) {
      
      if (x1.equals(listOfStates.get(i).getName())) {
        state1 = listOfStates.get(i);
        break;
      }
    }

    for (int i = 0; i < 10; i++) {
      if (x2.equals(listOfStates.get(i).getName())) {
        state2 = listOfStates.get(i);
        break;
      }
    }
    state1.fight(state2);
    

    //END GAME CONDITION
    if (player.states.size()==0||player.states.size()==10) {
      String r=playerS.getCountry().score()+"\n";
        Files.write(Paths.get("scores.txt"), r.getBytes(), StandardOpenOption.APPEND);
        System.out.println("Game Ends here. Your Score Is Recorded");
        new Menu();
      break;
    }
  }
  //  s.close();
    }
}