import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int count =0;
		for(int i=m;i<=n;i++){
			if(i%3==0 && i%5==0){count=count+i;}
		}
		System.out.println(count);
	}
}
