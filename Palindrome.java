//WAP to check whether a string is palindrome or not.
import java.util.Scanner;
class Palindrome{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a string");
    String str=s.next();
    int count=0;
    int i=0,j=str.length()-1;
    while(i<j){
        for(j=str.length()-1;j>i;j--){
          if(str.charAt(i)==str.charAt(j)){
            count++;
            i++;
          }
        }
    }
    if(count==(str.length())/2){
      System.out.println("It is a palindrome");
    }
    else{
      System.out.println("It is not a palindrome");
    }
  }
}