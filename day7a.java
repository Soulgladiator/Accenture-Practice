import java.util.*;
class solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int has[] = new int[128];
		int count=0;
		boolean flag = false;
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		for(int i=0;i<str.length();i++){
			int asic = (int) str.charAt(i);
			has[asic]+=1;
		}
		
		if(Character.isDigit(str.charAt(0))){flag3 = false;}  //first character number
		else{flag3 = true;}
		
		if(has[32]!=0 || has[47]!=0){ //space and slash condition
			flag = false;
		}
		else{
		    flag =true;
		}
		
		
		//minimum4chactercondition
		for(int i=0;i<has.length;i++){
			if(has[i]!=0){count++;}
		}
		if(count<4){flag = false;}
		else{flag = true;}
		
		
		
		for(int i=48;i<=57;i++){
			if(has[i]!=0){flag1 = true;break;} //one number must condition
		}
		
		
		for(int i=65;i<=90;i++){
			if(has[i]!=0){flag2 = true; break;} //capital letter condition
		}
		
		
		
		if(flag1 && flag2 && flag && flag3){System.out.println("VALID PASSWORD");}
		else{System.out.println("INVALID PASSWORD");}
	}
}


