import java.util.Scanner;
public class arraysssiee{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int [] arra1= new int[n];
    for(int j=0;j<n;j++){
    arra1[j]=sc.nextInt();
    }
    for (int i=0;i<n;i++){
      System.out.println(arra1[i]);
    }
  }
}