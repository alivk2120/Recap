//WAP to find maximum between three numbers.
class Maximum3num{
  public static void main(String args[]){
    int a=10,b=30,c=45;
    if(a>b && a>c){
      System.out.println(a+" is greater");
    }
    else if(b>c){
      System.out.println(b+" is greater");
    }
    else{
      System.out.println(c+ " is greater");
    }
  }
}