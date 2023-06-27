//WAP to print multiplication table of any number.
import java.util.Scanner;
class MulTable{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number to form multiplication table");
    int num=s.nextInt();
    for(int i=0;i<=10;i++){
      System.out.println(num+" * "+i+" = "+num*i);
    }
  }
}