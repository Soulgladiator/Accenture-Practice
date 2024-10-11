import java.util.*;
class solution{
	private static int[] hasarray(int num){
		int has[] = new int[10];
		while(num!=0){
			int rem = num%10;
			has[rem]+=1;
			num = num/10;
		}
		return has;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int hasa[] = hasarray(a);
		int hasb[] = hasarray(b);
		int hasc[] = hasarray(c);
		for(int i=0;i<hasa.length;i++){
			if(hasa[i]==hasb[i] && hasb[i]==hasc[i] && hasb[i]!=0 && hasc[i]!=0 && hasa[i]!=0){
			    System.out.println(i);
			}
		}
	}
}
