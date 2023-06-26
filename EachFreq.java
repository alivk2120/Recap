class EachFreq{
  public static void main(String args[]){
    String str="ahammad ali";
    int count=1;
    for(int i=0;i<str.length();i++){
      for(int j=i+1;j<str.length();j++){
        if(str.charAt(i)==str.charAt(j)){
          count++;
        }
      }
      
      System.out.println(str.charAt(i)+":"+count);
      count=1;
    }
  }
}