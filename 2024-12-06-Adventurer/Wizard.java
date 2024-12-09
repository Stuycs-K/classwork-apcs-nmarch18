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
    return null;
  }

  //heall or buff the target adventurer
  public String support(Adventurer other){
    return null;
  }

  //heall or buff self
  public String support(){
    return null;
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other){
    return null;
  }
}
