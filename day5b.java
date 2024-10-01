import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		int count=0;
		for(int i=1;i<=6;i++){
		  for(int j=1;j<=6;j++){
		    if(i+j==inp){
		      count++;
		      System.out.println(i+" "+j);
		    }
		  }
		}
		System.out.println(count);
	}
}
