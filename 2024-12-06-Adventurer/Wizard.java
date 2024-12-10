public class Wizard extends Adventurer{
  private int mana;

  public Wizard(){
    this("Wiz");
  }

  public Wizard(String name){
    this(name,25);
  }

  public Wizard(String name, int hp){
    this(name,hp,0);
  }

  public Wizard(String name, int hp, int mana){
    super(name, hp);
    this.mana = mana;
  }

  public String getSpecialName(){
    return "mana";
  }

  public int getSpecial(){
    return mana;
  }

  public void setSpecial(int n){
    mana = n;
  }

  public int getSpecialMax(){
    return 5; // max 5 mana
  }

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
    int h = (int)(3 * Math.random() + 1);
    int s = (int)(3 * Math.random() + 1);
    applyHeal(h);
    restoreSpecial(s);
    return (getName() + " healed himself by " + h + " health and gained " + s + " mana!");
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    if (this.mana >= 5){
      this.mana -= 5;
      int d1 = (int)(5 * Math.random() + 6);
      int d2 = (int)(5 * Math.random() + 1);
      other.applyDamage(d1);
      applyDamage(d2);
      return (getName() + " unleashed a violent fireball that hurt himself for " + d2 + " damage and " + other.getName() + " for " + d1 + " damage!");
    }
    return (getName() + " tried to cast a fireball but failed!");
  }

}
