public class Reversestring {
    public static void main (String[] args) {
       
        String str= "Good one", nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("Good one");      
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
    }
}
