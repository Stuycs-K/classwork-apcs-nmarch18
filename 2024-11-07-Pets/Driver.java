public class Driver{
  public static void main(String[] args){
    Animal dog = new Animal("woof", 1, "bob");
    dog.speak();
    
    Bird birb = new Bird("caw caw", 1, "birby", 5.5, "red");
    birb.speak();
  }
}
