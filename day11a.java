import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int r = sc.nextInt();
		int w[] = {10,67,9};
		int sum = 0;
		for(int i=0;i<w.length;i++){
			sum = sum+w[i];
		}
		int result = (n*r) - sum;
		if(result>0)
		  System.out.println(result);
		else
		  System.out.println(-1);
	}
}
