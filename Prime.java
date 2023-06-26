//WAP to check whether a number is Prime number or not.
import java.util.Scanner;
class Prime{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=s.nextInt();
    int count=0;
    for(int i=1;i<num;i++){
      if(num%i==0){
        count++;
      }
    }
    if(count==1){
      System.out.println("it is a prime number");
    }
    else{
      System.out.println("it is not aprime number");
    }
  }
}