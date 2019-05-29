import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    
      int x=n1%10;
    int y=(n1%100)/10;
    int z=n1/100;
    
     int rev=x*100+y*10+z;
      System.out.println(rev);
  }
}