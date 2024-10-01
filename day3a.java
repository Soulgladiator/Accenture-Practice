import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int has[] = new int[27];
		boolean flag = true;
		for(int i=0;i<str.length();i++){
			int asic = (int) str.charAt(i);
			has[asic - 96] +=1;
		}
		for(int i=0;i<str.length();i++){
		  int asic = (int) str.charAt(i);
		  int index = asic - 96;
			if(has[index]!=index){flag=false;break;}
		}
		if(flag==true){System.out.println("YES");}
		else{System.out.println("NO");}
	}
}
