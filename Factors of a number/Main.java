import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      for( int num=1;num<=n;num++)
      {
        if(n % num == 0)
          
          System.out.println(num);
      }
	}
}




