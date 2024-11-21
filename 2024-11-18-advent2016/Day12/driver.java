public class driver{
  public static void main(String[] args){
    System.out.println(tester.getA("input.txt", 0, 0, 0, 0));
    try { Thread.sleep(5000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    System.out.println(tester.getA("input.txt", 0, 0, 1, 0));
  }
}
