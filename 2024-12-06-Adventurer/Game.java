import java.util.*;

public class Game{
  public static void main(String[] args){

    Adventurer p1 = new Wizard("Al", 33, 3);
    Adventurer p2 = new CodeWarrior("Bartholomew", 30, "DrRacket");
    int turn = 1;
    Scanner in = new Scanner(System.in);
    System.out.println();

    // The game loop

    while (true){

      // Start of turn dialogues

      System.out.println();
      System.out.println("\u001b[1;31m* TURN " + turn + " *\u001b[0m");
      System.out.println();
      System.out.println(p1.getName() + " has " + p1.getHP() + "/" + p1.getmaxHP() + " HP and " + p1.getSpecial() + " " + p1.getSpecialName());
      System.out.println(p2.getName() + " has " + p2.getHP() + "/" + p2.getmaxHP() + " HP and " + p2.getSpecial() + " " + p2.getSpecialName());
      System.out.println();

      // Your turn

      // attack: randomly deals 1-5 damage.
      // support: randomly gains 1-3 health and 1-3 mana.
      // specialAttack: 5 mana (max) required. randomly deals 6-10 damage to enemy but 1-5 damage to yourself.

      System.out.println("\u001b[35mType: (a)ttack / (sp)ecial / (su)pport / quit\u001b[0m");
      boolean validInput = false;
      while (!validInput){
        String input = in.nextLine();
        input.toLowerCase();
        System.out.println();
        if (input.equals("a") || input.equals("attack")){
          System.out.println(p1.attack(p2));
          validInput = true;
        }
        else
        if (input.equals("sp") || input.equals("special")){
          System.out.println(p1.specialAttack(p2));
          validInput = true;
        }
        else
        if (input.equals("su") || input.equals("support")){
          System.out.println(p1.support());
          validInput = true;
        }
        else
        if (input.equals("quit")){
          return;
        }
        else{
          System.out.println("Invalid action!");
        }
      }

      // End the game automatically if someone dies

      if (p1.getHP() <= 0 && p2.getHP() <= 0){
        System.out.println();
        System.out.println("Both fighters have perished under the same fire.");
        return;
      }
      else
      if (p1.getHP() <= 0){
        System.out.println();
        System.out.println(p2.getName() + " has won the duel!");
        return;
      }
      else
      if (p2.getHP() <= 0){
        System.out.println();
        System.out.println(p1.getName() + " has won the duel!");
        return;
      }

      // Enemy's turn

      int move = (int)(3 * Math.random());
      if (move == 0){
        System.out.println(p2.attack(p1));
      }
      else
      if (move == 1){
        System.out.println(p2.specialAttack(p1));
      }
      else
      if (move == 2){
        System.out.println(p2.support());
      }

      // End the game automatically if someone dies

      if (p1.getHP() <= 0 && p2.getHP() <= 0){
        System.out.println();
        System.out.println("Both fighters have perished under the same fire.");
        return;
      }
      else
      if (p1.getHP() <= 0){
        System.out.println();
        System.out.println(p2.getName() + " has won the duel!");
        return;
      }
      else
      if (p2.getHP() <= 0){
        System.out.println();
        System.out.println(p1.getName() + " has won the duel!");
        return;
      }

      // Then start a new turn! Repeat until a winner happens.
      turn++;

    }
  }

}
