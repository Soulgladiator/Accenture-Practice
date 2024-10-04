import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0;
		while(n>=5){
		  sum=sum + n/5;
		  n=n/5;
		}
		System.out.println(sum);
	}
}
