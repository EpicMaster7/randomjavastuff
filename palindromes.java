import java.util.Scanner;

class palindromes {
  public static Scanner scan;

public static void main(String[] args) {
    scan = new Scanner(System.in);
    String str = "";
    System.out.println("Enter a string.");
    String streal = scan.nextLine();
    String nstr = "";
    int i;
    for(i = 0; i<streal.length();i++)
        if(!(streal.substring(i,i+1).equals(" ")))
            str += streal.substring(i,i+1);
    for(i = 0; i < str.length(); i++)
        nstr = str.substring(i,i+1) + nstr;
    if(str.equals(nstr))
        System.out.println("yes");
    else
        System.out.println("no");
  }
}