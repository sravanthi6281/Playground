import java.util.Scanner;
class Main{
  public static int  gon(int a, int b)
  {
    int max_num=0;
  if(a>b)
    max_num=a;
    else
      max_num=b;
    return max_num;
  }
  
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3= in.nextInt();
      int res=gon (n1,n2);
      System.out.println(gon(res,n3));
        
	    // Type your code here
	}
}