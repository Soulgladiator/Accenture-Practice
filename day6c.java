import java.util.*;
class solution{
	private static boolean is_unique(int num){
		int has[] = new int[10];
		boolean flag = true;
		while(num!=0){
			int rem = num%10;
			has[rem]+=1;
			num = num/10;
		}
		for(int i=0;i<has.length;i++){
			if(has[i]>1){flag=false;break;}
		}
		return flag;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count=0;
		for(int i=a;i<=b;i++){
			boolean res = is_unique(i);
			if(res==true){System.out.print(i+" ");count++;}
		}
		System.out.println("\nCOUNT IS:"+count);
	}
}
