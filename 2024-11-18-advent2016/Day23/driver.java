public class driver{
  public static void main(String[] args){
    System.out.println(tester.getA("input.txt", 7, 0, 0, 0));
    try { Thread.sleep(5000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    System.out.println(tester.getA("input.txt", 12, 0, 0, 0));
  }
}
