/* STEP 8:
super.getName() returns a string which is then added to the Bird getName().
*/
/* STEP 10:
The only one that didn't work was declaring a Bird as a new Animal; this makes sense
since the Animal class has a has-a relationship with the Bird class, not a is-a one. */

public class Driver{
  public static void main(String[] args){
    Animal dog = new Animal("woof", 1, "bob");
    System.out.print("\n");
    dog.speak();

    Bird birb = new Bird("caw caw", 1, "birby", 5.5, "red");
    System.out.print("\n");
    birb.speak();

    Animal a1 = new Animal("meow", 12, "mittens");
    Bird b1 = new Bird("ahhahahah", 50, "pigeon", 8.1, "grey");
    // Bird b2 = new Animal("gimme a cracker", 9, "polly", 0.1, "green"); ERROR
    Animal a2 = new Bird("im not a bird", 16, "nick", 72, "white");

    System.out.print("\n");
    a1.speak();
    System.out.print("\n");
    b1.speak();
    System.out.print("\n");
    a2.speak();

  }
}
