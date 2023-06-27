//WAP to find first and last digit of a number.
class FirstandLastDigit{
  public static void main(String args[]){
    int num=2345;
    int lastdig=num%10;
    while(num>10){
      num=num/10;
    }
  System.out.println("The first digit is:"+num);
  System.out.println("the last digit is:"+lastdig);
  }
}