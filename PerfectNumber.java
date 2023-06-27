//WAP to check whether a number is Perfect number or not.
import java.util.Scanner;
class PerfectNumber{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num=0,i=0,sum=0;
    System.out.println("enter the number");
    num=s.nextInt();
    for(i=1;i<num;i++){
      if(num%i==0){
        sum=sum+i;
      }
      
    }
    if(sum==num){
        System.out.println("It is a perfect number");
      }
    else{
      System.out.println("It is not a perfect number");
    }
  }
}