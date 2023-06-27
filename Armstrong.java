//WAP to check whether a number is Armstrong number or not.
import java.util.Scanner;
//WAP to check whether a number is Armstrong number or not.
class Armstrong{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int num=0,count=0,i,sum,arm=0,dig,j;
    System.out.println("Enter the number");
    num=s.nextInt();
    i=num;
    j=num;
    while(i!=0){
      i=i/10;
      count++;
    }
    while(j!=0){
      dig=j%10;
      j=j/10;
      sum=(int)Math.pow(dig,count);
      arm=arm+sum;
    }
    if(arm==num){
    System.out.println("It is a armstrong number");
    }
    else{
      System.out.println("It is not a armstrong number");
    }
  }
}