import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt(); 
      int sum=1;
      for(int num =1;num<=n;num++)
      {
         sum = sum * num;
      }
         System.out.print(sum);
      
        
	}
}