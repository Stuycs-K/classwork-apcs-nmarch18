import java.util.*;

public class Driver{
  public static void main(String[] args){

    // To test our subclass, we'll make a duel between two Wizards.

    Adventurer p1 = new Wizard("Al", 23, 3);
    Adventurer p2 = new Wizard("Bob", 25, 5);
    int turn = 0;
    System.out.println();

    while (true){
      if (turn % 2 == 0){
        int t = (int)(turn/2 + 1);
        System.out.println("* TURN " + t + " *");
      }

      // attack: randomly deals 1-5 damage.
      // support: randomly gains 1-3 health and 1-3 mana.
      // specialAttack: 5 mana (max) required. randomly deals 6-10 damage to other wizard but 1-5 damage to yourself.

      // Al's cycle: attack -> support -> attack -> specialAttack
      // Bob's cycle: specialAttack -> attack -> attack -> support

      // Who would win this duel?
      // Well, it turns out, with 10000 simulations, that:
      // Al won 45.4%, Bob won 42.9%, and 11.7% ended in a draw (with both dying to the same fireball).

      if (turn % 8 == 0){
        System.out.println(p1.attack(p2));
      }
      if (turn % 8 == 1){
        System.out.println(p2.specialAttack(p1));
      }
      if (turn % 8 == 2){
        System.out.println(p1.support());
      }
      if (turn % 8 == 3){
        System.out.println(p2.attack(p1));
      }
      if (turn % 8 == 4){
        System.out.println(p1.attack(p2));
      }
      if (turn % 8 == 5){
        System.out.println(p2.attack(p1));
      }
      if (turn % 8 == 6){
        System.out.println(p1.specialAttack(p2));
      }
      if (turn % 8 == 7){
        System.out.println(p2.support());
      }

      if (p1.getHP() <= 0 && p2.getHP() <= 0){
        System.out.println();
        System.out.println("Both Wizards have perished under the same fire.");
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
