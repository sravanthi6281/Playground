import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
		int n = in.nextInt();
  
		int num = 0;
		for(int cur_row =1; cur_row <= n; cur_row++) {
			for(int cur_col=1; cur_col <= cur_row; cur_col++) {
			System.out.print(cur_row);
              num=num+1;
            }
           System.out.print("\n"); 
        }
	}
}