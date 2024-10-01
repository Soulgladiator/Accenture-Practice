import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int has[] = new int[129];
		boolean flag = true;
		for(int i=0;i<str.length();i++){
			int asic = (int) str.charAt(i);
			has[asic]+=1;
		}
		for(int i=0;i<has.length;i++){
			if(has[i]>1){flag = false;break;}
		}
		if(flag==false){System.out.println("NOT AN ISOGRAM");}
		else {System.out.println("ISOGRAM");}
	}
}
