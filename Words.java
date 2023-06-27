//WAP to count total number of words in a string.
class Words{
  public static void main(String args[]){
    String str="Hi, Hoe wre you broi";
    String words[]=str.split(" ");
    System.out.println("The number of word in the sentence is:"+words.length);
  }
}