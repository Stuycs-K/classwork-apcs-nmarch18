public class Driver{
  public static void main(String[] args){
    Adventurer p1 = new Wizard("Wizard 1", 25, 0);
    Adventurer p2 = new Wizard("Wizard 2", 25, 0);
    int turn = 0;
    System.out.println();

    while (true){
      if (turn % 2 == 0){
        int t = (int)(turn/2 + 1);
        System.out.println("* TURN " + t + " *");
      }
      if (turn % 6 == 0){
        System.out.println(p1.attack(p2));
      }
      if (turn % 6 == 1){
        System.out.println(p2.specialAttack(p1));
      }
      if (turn % 6 == 2){
        System.out.println(p1.support());
      }
      if (turn % 6 == 3){
        System.out.println(p2.attack(p1));
      }
      if (turn % 6 == 4){
        System.out.println(p1.specialAttack(p2));
      }
      if (turn % 6 == 5){
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
