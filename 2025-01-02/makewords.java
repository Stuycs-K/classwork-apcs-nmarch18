public class makewords{

  public static void makeWords(int remainingLetters, String result, String alphabet){
    for (int i = 0; i < alphabet.length(); i++){
      if (remainingLetters == 0){
        System.out.println(result);
        return;
      }
      else{
        String c = Character.toString(alphabet.charAt(i));
        makeWords(remainingLetters-1, result+c, alphabet);
      }
    }
    return;
  }

  public static void main(String[] args){
    makeWords(3,"","01");
  }

}
