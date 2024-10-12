import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int has1[] = new int[128];
		int has2[] = new int[128];
		boolean flag = true;
		for(int i=0;i<str1.length();i++){
			int asic = (int) str1.charAt(i);
			has1[asic]+=1;
		}
		for(int i=0;i<str2.length();i++){
			int asic = (int) str2.charAt(i);
			has2[asic]+=1;
		}
		for(int i=0;i<has1.length;i++){
			if(has1[i]==has2[i]){flag = true;}
			else{flag = false; break;}
		}
		if(flag == true){System.out.println("YES");}
		else{System.out.println("NO");}
	}
}
