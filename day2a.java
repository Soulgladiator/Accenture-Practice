import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int op = 0;
		if(a<0){op=op+a;}
		if(b<0){op=op+b;}
		if(c<0){op=op+c;}
		if(d<0){op=op+d;}
		System.out.println(op);
	}
}
