import java.util.*;

public class Driver{
  public static void main(String[] args){

    // To test our subclass, we'll make a duel between two Wizards.

    Adventurer p1 = new Wizard("Al", 33, 3);
    Adventurer p2 = new CodeWarrior("Bartholomew", 25, "DrRacket");
    int turn = 0;
    Scanner input = new Scanner(System.in);
    System.out.println();

    while (true){
      if (turn % 2 == 0){
        int t = (int)(turn/2 + 1);
        System.out.println("* TURN " + t + " *");
        System.out.println();
      }

      // attack: randomly deals 1-5 damage.
      // support: randomly gains 1-3 health and 1-3 mana.
      // specialAttack: 5 mana (max) required. randomly deals 6-10 damage to other wizard but 1-5 damage to yourself.

      // Your turn

      System.out.println("Your turn! You can: (a)ttack, (s)upport, (S)pecialAttack");

      // Enemy's turn

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

      if (turn % 2 == 1){
        System.out.println(p1.getName() + " has " + p1.getHP() + " HP and " + p1.getSpecial() + " " + p1.getSpecialName());
        System.out.println(p2.getName() + " has " + p2.getHP() + " HP and " + p2.getSpecial() + " " + p2.getSpecialName());
        System.out.println();
      }
      turn++;
    }
  }

}
