import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int n = sc.nextInt();
		int r2 = sc.nextInt();
		int x = sc.nextInt();
		int hr = Math.round(x/60);
		int res=  (r1*n)+  (r2*(hr - n));
		System.out.println(res);
	}
}
