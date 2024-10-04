import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int div_nsum = 0;
		int non_divsum = 0;
		for(int i=1;i<=m;i++){
			if(i%n ==0){div_nsum+=i;}
			else{non_divsum+=i;}
		}
		int res = Math.abs(div_nsum - non_divsum);
		System.out.println(res);
	}
}
