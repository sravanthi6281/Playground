import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int list[] = new int[n];
    int max_idx;
for(int index = 0; index < n; index++)
{
list[index] = sc.nextInt();
}
    if (list[0]>list[1])
    {
      max_idx=0;
    }
      else
        max_idx=1;
    
   for(int index=2;index<n;index++)
   {
     if(list[max_idx]<list[index])
     {
       max_idx=index;
     }
  }
  System.out.println(max_idx);
  }
}

