public class fib{
  public static int fib (int n){
    if (n < 2){return n;}
    return fib(n-1) + fib(n-2);
  }
  public static void main(String[] args){
    for (int i = 0; i < 10; i++){
      System.out.println(fib(i));
    }
    int n = Integer.parseInt(args[0]);
    System.out.println(fib(n));
  }
}
