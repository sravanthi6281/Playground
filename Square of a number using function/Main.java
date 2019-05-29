  
      import java.util.Scanner;
class Main
{
 public static int square(int s)
 {
  int x =s*s;
 
  return x;
 }
	public static void main (String[] args)
    {
	 // Type your code here 
     Scanner in = new Scanner (System.in);
      int n1=in.nextInt();
      int  x1=square(n1);
      System.out.println(x1);
	} 
}
	
