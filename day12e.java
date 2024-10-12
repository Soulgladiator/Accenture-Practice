import java.util.*;
class solution{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	int sum = 0;
	for(int i=0;i<str.length();i++){
		if(Character.isDigit(str.charAt(i))){
			int num = (int)str.charAt(i) - 48;
			sum = sum + (num*i);
		}
	}
	System.out.println("sum is :"+sum);
	}
}
