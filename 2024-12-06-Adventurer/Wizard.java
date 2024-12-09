public class Wizard extends Adventurer{
  private int mana;

  public Wizard(String name){
    super(name);
    mana = 0;
  }

  public Wizard(String name, int hp){
    super(name, hp);
    mana = 0;
  }

  public Wizard(String name, int hp, int mana){
    super(name, hp);
    this.mana = mana;
  }

  public String getSpecialName(){
    return "Mana";
  }

  public int getSpecial(){
    return mana;
  }

  public void setSpecial(int n){
    mana = n;
  }

  public int getSpecialMax(){
    return 10;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other){
    int d = (int)(5 * Math.random() + 1);
    other.applyDamage(d);
    return (getName() + " attacked " + other.getName() + " for " + d + " damage!");
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    int h = (int)(3 * Math.random() + 1);
    other.applyHeal(h);
    return (getName() + " healed " + other.getName() + " by " + h + " health!");
  }

  //heall or buff self
  public String support(){
    int h = (int)(1 * Math.random() + 1);
    applyHeal(h);
    return (getName() + " healed himself by " + h + " health");
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if (this.mana == 10){
      this.mana -= 10;
      other.applyDamage((int)(10 * Math.random() + 1));
      applyDamage((int)(10 * Math.random() + 1));
    }
    return (getName() + " created a violent fireball that hurt everybody!");
  }

}
