import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.print(a+" "+b+" "+c+" ");
		for(int i =0;i<n-3;i++){
			int d = a+b+c;
			System.out.print(d+" ");
			a = b;
			b= c;
			c = d;
		}
	}
}
